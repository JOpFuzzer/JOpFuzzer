/*
 * Copyright (c) 2020, 2021, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 * @summary Test JFR recording controlled via JMX across container boundary.
 * @requires docker.support
 * @library /test/lib
 * @modules java.base/jdk.internal.misc
 *          java.management
 *          jdk.jartool/sun.tools.jar
 * @build EventProducer
 * @run main TestJFRWithJMX
 */

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

import javax.management.MBeanServerConnection;
import javax.management.remote.JMXServiceURL;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXConnector;

import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;
import jdk.management.jfr.FlightRecorderMXBean;

import jdk.test.lib.Asserts;
import jdk.test.lib.Container;
import jdk.test.lib.Utils;
import jdk.test.lib.containers.docker.Common;
import jdk.test.lib.containers.docker.DockerRunOptions;
import jdk.test.lib.containers.docker.DockerTestUtils;
import jdk.test.lib.process.OutputAnalyzer;
import jdk.test.lib.process.ProcessTools;

import jtreg.SkippedException;


public class TestJFRWithJMX {
    static final String imageName = Common.imageName("jfr-jmx");
    static final int PORT = 9010;
    static final int HOW_LONG_TO_RECORD_SECONDS = 10;
    static final String LOCAL_HOST_ADDR = "0.0.0.0";
    static final int WAIT_FOR_JMX_CONN_SECONDS = 10;

    static final AtomicReference<String> ipAddr = new AtomicReference();

    public static void main(String[] args) throws Exception {
        if (!DockerTestUtils.canTestDocker()) {
            throw new SkippedException("Docker is not supported on this host");
        }

        DockerTestUtils.buildJdkDockerImage(imageName, "Dockerfile-BasicTest", "jdk-docker");

        try {
            test();
        } finally {
            DockerTestUtils.removeDockerImage(imageName);
        }
    }

    static void test() throws Exception {
        String containerName = "jmx-jfr-observee" + Instant.now().toString().replace(':', '-');
        ProcessBuilder pb = buildDockerJavaProcess(containerName);
        Process p = ProcessTools.startProcess("monitored-container", pb, outputConsumer);

        // Wait for the target process to communicate the IP address.
        // Even if IP address is not used (e.g. in PodMan case), we should still wait to make sure
        // that target JVM process is up and ready.
        while(ipAddr.get() == null) {
           System.out.println("waiting for ipAddr.get()");
           Thread.sleep(100);
        }

        // Now that the receiving JVM process is up and running, check it's PodMan network info
        boolean isPodman = isPodman();
        if (isPodman) {
            printPodmanNetworkInfo();
        }
        String ipAddress = isPodman ? LOCAL_HOST_ADDR : ipAddr.get();
        System.out.println("ipAddress = " + ipAddress);

        File transferredRecording = null;
        try {
            try ( JMXConnector connector = waitForJmxConnection(ipAddress, PORT) ) {
                FlightRecorderMXBean bean = getJfrBean(connector);

                long recordingId = record(bean, HOW_LONG_TO_RECORD_SECONDS * 1000);
                long streamId = bean.openStream(recordingId, null);
                transferredRecording = transferRecording(bean, streamId);

                bean.closeStream(streamId);
                bean.closeRecording(recordingId);
            }
        } finally {
            killContainer(containerName);
            p.waitFor();
        }

        System.out.println("Recording was transferred to: " + transferredRecording.getPath());
        verifyRecording(transferredRecording);
    }

    static boolean isPodman() throws Exception {
        ProcessBuilder pb = new ProcessBuilder(Container.ENGINE_COMMAND, "--version");
        OutputAnalyzer out = new OutputAnalyzer(pb.start());
        boolean isPodman = out.getOutput().toLowerCase().contains("podman");
        System.out.println("isPodman() returning: " + isPodman);
        return isPodman;
    }

    static void printPodmanNetworkInfo() throws Exception {
        ProcessBuilder pb = new ProcessBuilder(Container.ENGINE_COMMAND, "port", "-l");
        OutputAnalyzer out = new OutputAnalyzer(pb.start());
        System.out.println("-------------------- checkPodmanNetworkInfo: \n" + out.getOutput());
        System.out.println("--------------------");
    }

    static ProcessBuilder buildDockerJavaProcess(String containerName) throws Exception {
        DockerRunOptions opts = new DockerRunOptions(imageName, "/jdk/bin/java", "EventProducer")
            .addDockerOpts("--name", containerName)
            .addDockerOpts("--volume", Utils.TEST_CLASSES + ":/test-classes/")
            .addDockerOpts("--hostname", "jmx-jfr-test")
            .addDockerOpts("-p", "" + PORT + ":" + PORT)
            .addJavaOpts("-cp", "/test-classes/")
            .addJavaOpts("-Dcom.sun.management.jmxremote", "-Dcom.sun.management.jmxremote.port=" + PORT)
            .addJavaOpts("-Dcom.sun.management.jmxremote.local.only=false")
            .addJavaOpts("-Dcom.sun.management.jmxremote.authenticate=false")
            .addJavaOpts("-Dcom.sun.management.jmxremote.ssl=false");

        return new ProcessBuilder(DockerTestUtils.buildJavaCommand(opts));
    }

    static long record(FlightRecorderMXBean bean, int howLong) throws Exception {
        long id = bean.newRecording();
        bean.setPredefinedConfiguration(id, "default");
        bean.startRecording(id);
        Thread.sleep(howLong);

        bean.stopRecording(id);

        String fn = "/tmp/recording-" + ProcessHandle.current().pid() + ".jfr";
        bean.copyTo(id, fn);
        System.out.println("Wrote recording to: " + fn);
        return id;
    }

    static void verifyRecording(File f) throws Exception {
        boolean foundExpectedEvent = false;
        String expectedEventName = "EventProducer$SimpleEvent";

        try (RecordingFile recordingFile = new RecordingFile(f.toPath())) {
            while (recordingFile.hasMoreEvents()) {
                RecordedEvent event = recordingFile.readEvent();
                if(event.getEventType().getName().equals(expectedEventName)) {
                    foundExpectedEvent = true;
                    break;
                }
            }

            Asserts.assertTrue(foundExpectedEvent,
                               "Could not find the expected event in the recording: " +
                               expectedEventName);
        }
    }

    static void killContainer(String containerName) throws Exception {
        new ProcessBuilder(Container.ENGINE_COMMAND, "kill", containerName)
            .start()
            .waitFor();
    }

    static Consumer<String> outputConsumer = s -> {
        if (ipAddr.get() != null) {
            return;
        }

        if (s.contains(EventProducer.HOST_ADDR_TAG)) {
            String ip = s.replace(EventProducer.HOST_ADDR_TAG, "");
            System.out.println("Observee ip: " + ip);
            ipAddr.set(ip);
        }
    };

    // try connecting in a loop, it may take some time for target process to be ready for JMX connection
    static JMXConnector waitForJmxConnection(String host, int port) throws Exception {
        String urlPath = "/jndi/rmi://" + host + ":" + port + "/jmxrmi";
        System.out.println("urlPath: " + urlPath);
        JMXServiceURL url = new JMXServiceURL("rmi", "", 0, urlPath);

        IOException lastReportedException = null;
        for (int i=0; i<WAIT_FOR_JMX_CONN_SECONDS; i++) {
            try {
                return JMXConnectorFactory.connect(url);
            } catch (IOException e) {
                System.out.println("establishJmxConnection() thrown IOException: " + e.getMessage());
                lastReportedException = e;
            }
            Thread.sleep(1000);
        }

        if (lastReportedException != null) {
            lastReportedException.printStackTrace();
        }
        throw new RuntimeException("Failed to establish JMX connection after N attempts");
    }

    static FlightRecorderMXBean getJfrBean(JMXConnector connector) throws Exception {
        MBeanServerConnection connection = connector.getMBeanServerConnection();
        return ManagementFactory.newPlatformMXBeanProxy(connection,
                                                        "jdk.management.jfr:type=FlightRecorder",
                                                        FlightRecorderMXBean.class);
    }

    static File transferRecording(FlightRecorderMXBean bean, long streamId) throws Exception {
        File f = Utils.createTempFile("recording-" + streamId + "-", ".jfr").toFile();
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f))) {
            while (true) {
                byte[] data = bean.readStream(streamId);
                if (data == null) {
                    bos.flush();
                    return f;
                }
                bos.write(data);
            }
        }
    }
}
