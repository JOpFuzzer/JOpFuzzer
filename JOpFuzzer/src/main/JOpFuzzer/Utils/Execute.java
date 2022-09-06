package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @program: Juzz
 * @description:
 * @author: Haoxiang Jia
 * @create: 2022-08-25 15:09
 **/
public class Execute {
    public static int execute(String cmd) throws IOException {
        String osName = System.getProperty("os.name");
        Process p;
        String[] command;
        if (osName.toLowerCase().contains("windows")) {
            command = new String[]{"cmd", "/C", cmd + " 2>&1"};
        } else {
            command = new String[]{"/bin/sh", "-c", cmd + " 2>&1"};
        }
        p = Runtime.getRuntime().exec(command);
        InputStream fis = p.getInputStream();
        InputStreamReader isr = new InputStreamReader(fis);

        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            line = br.readLine();
        }
        int exitValue;
        try {
            exitValue = p.waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return exitValue;
    }
}