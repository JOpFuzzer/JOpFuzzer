package Preprocess;

import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.visitor.filter.TypeFilter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: Juzz
 * @description:
 * @author: Haoxiang Jia
 * @create: 2022-07-14 16:22
 **/
public class Prepare {
    List<String> seeds = null;
    Config config;

    public Prepare(Config config) throws IOException {
        this.config = config;
        try (Stream<Path> paths = Files.walk(Paths.get(config.getSeedsPath()))) {
            seeds = paths.filter(Files::isRegularFile).map(Path::toString).collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Error: seed path is not valid");
            System.exit(1);
        }
//        File seedDir = new File(seedPath);
//        File[] seeds = seedDir.listFiles();
//        assert seeds != null;
//        if (useSootOrSpoon.equals("Soot")){
//            sootInitialization(seedPath);
//            for (File seed : seeds) {
//                if (seed.getName().endsWith(".class")) {
//                    String className = seed.getName().replace(".class", "");
//                    List<Preprocess.Encode> encodes = encodingMethodSoot(className);
//                    RelationshipMapping mapping = new RelationshipMapping(className, encodes, config);
//                }
//            }
//        }
    }

    public void preprocess() throws IOException {
        RelationMapping map = new RelationMapping();
        BufferedWriter out = new BufferedWriter(new FileWriter("encodeClass.log"));
        for (String seed : seeds) {
            if (seed.endsWith(".java")) {
                out.write(seed + "\n");
                out.flush();
                Config seedConfig = config.clone();
                String separator = System.getProperty("file.separator");
                seedConfig.setSeedPath(seed.substring(0, seed.lastIndexOf(separator)));
                seedConfig.setSeedName(seed.substring(seed.lastIndexOf(separator) + 1));
                List<Encode> encodes = encodingMethod(seed, seedConfig);
                map.mapping(encodes, seedConfig);
                clearHotSpotLog();
            }
        }
        out.close();
//        map.calculateFinalRelationship();
//        map.saveArray();
    }
//    public void sootInitialization(String seedPath) {
//        Options.v().set_process_dir(Collections.singletonList(seedPath));
//        Options.v().setPhaseOption("jb", "use-original-names:true");
//        Scene.v().loadNecessaryClasses();
//        Options.v().keep_line_number();
//    }
//
//
//    public List<Preprocess.Encode> encodingMethodSoot(String className) {
//        SootClass c = Scene.v().forceResolve(className, SootClass.BODIES);
//        List<SootMethod> methodList = c.getMethods();
//        List<Preprocess.Encode> encodes = new ArrayList<>();
//        for (SootMethod method : methodList) {
//            if (!method.getName().contains("init")) {
//                Body body = method.retrieveActiveBody();
//                Preprocess.Encode encode = new Preprocess.Encode(body);
//                encodes.add(encode);
//            }
//        }
//        return encodes;
//    }

    public List<Encode> encodingMethod(String classNameWithPath, Config seedConfig) {
        Launcher launcher = new Launcher();
        launcher.addInputResource(classNameWithPath);
        launcher.buildModel();
        CtModel model = launcher.getModel();
        Collection<CtPackage> packages = model.getAllPackages();
        for (CtPackage p : packages) {
            if (p.getPackages().size() == 0) {
                if (!p.toString().equals("unnamed package"))
                    seedConfig.setPackageName(p.toString());
            }
        }
        List<CtMethod> methods = model.getElements(new TypeFilter<>(CtMethod.class));
        List<Encode> encodes = new ArrayList<>();
        for (CtMethod method : methods) {
            Encode encode = new Encode(method);
            if (!encode.uselessMethod) {
                encodes.add(encode);
            }
        }
        return encodes;
    }

    public void clearHotSpotLog() {
        File dir = new File(".");
        File[] files = dir.listFiles();
        assert files != null;
        for (File file : files) {
            if (file.getName().endsWith(".log") && file.getName().startsWith("hotspot_pid")) {
                file.delete();
            }
        }
    }

}