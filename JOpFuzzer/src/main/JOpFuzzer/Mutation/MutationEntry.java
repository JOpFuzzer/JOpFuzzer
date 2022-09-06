package Mutation;

import Mutation.DT.DifferentialTest;
import Preprocess.Encode;
import Preprocess.SourceCodeFeature;
import org.apache.commons.io.FileUtils;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtLoop;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.visitor.filter.LineFilter;
import spoon.reflect.visitor.filter.TypeFilter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutionException;

import static Utils.Execute.execute;

public class MutationEntry {
    String separator = System.getProperty("file.separator");

    public MutationEntry(String jdkPath, SeedPool seedPool, String mt) throws IOException, ExecutionException, InterruptedException {
        int mutationRound = Integer.parseInt(mt);//the mutation time
        String projectPath = "./JavaFuzzer/tests/"; // source code root path. e.g. /home/kui/Desktop/buggyProject
        int lineNumber; // line number of target file to be mutated. e.g. 10
        List<File> seeds = new ArrayList<>(seedPool.seedPoolOptionPair.keySet());
        Random rand = new Random();
        int seedIndex;
        while (mutationRound-- > 0) {

            seedIndex = rand.nextInt(seeds.size());
            File dir = seeds.get(seedIndex);
            lineNumber = analyzeFile(dir);
            int testNumber = seedPool.getTestNumber();
            String sIndex = String.format("%04d", seedIndex);
            String tIndex = String.format("%04d", testNumber + 1);
            seedPool.addTestNumber();
            String mutate = "java -jar JavaMutator.jar " + projectPath + " " + sIndex + " " + tIndex + " " + lineNumber + " " + jdkPath;
            while (true) {
                int exitValue = execute(mutate);
                if (exitValue == 0) {
                    System.out.println("Mutation success!");
                    break;
                }
            }
            String originPath = projectPath + "/" + sIndex;
            String targetPath = projectPath + "/" + tIndex;
            List<String> changedStructure = new ArrayList<>(new HashSet<>(getChangedStructure(originPath, targetPath)));
            File mutatedFile = new File(targetPath);
            DifferentialTest differentialTest = new DifferentialTest(jdkPath, mutatedFile, seedPool.seedPoolOptionPair.get(dir), changedStructure);
            if (!differentialTest.getRunnable()) {
                FileUtils.deleteDirectory(dir);
                seedPool.seedPoolOptionPair.remove(dir);
                continue;
            }
            if (!differentialTest.getWorthToSave()) {
                FileUtils.deleteDirectory(mutatedFile);
                continue;
            }
            if (!differentialTest.getSafe()) {
                Files.createDirectories(Paths.get("Bug"));
                FileUtils.copyDirectory(dir, new File("Bug" + separator));
            }
        }
    }

    private List<String> getChangedStructure(String originPath, String targetPath) throws IOException {
        List<String> changedStructure = new ArrayList<>();
        List<String> lines = Files.readAllLines(Path.of(targetPath + "/patchLine.log"));
        String line = lines.get(0);
        int start = Integer.parseInt(line.trim().split(" ")[0]);
        int end = Integer.parseInt(line.trim().split(" ")[1]);
        Launcher launcher = new Launcher();
        launcher.addInputResource(originPath + "/Test.java");
        launcher.buildModel();
        CtModel model = launcher.getModel();
        List<CtStatement> statements = model.getElements(new LineFilter());
        for (CtStatement statement : statements) {
            SourcePosition parentPosition = statement.getParent().getPosition();
            if (parentPosition.isValidPosition()) {
                if (start >= parentPosition.getLine() && parentPosition.getEndLine() >= end) {
                    Encode encode = new Encode(statement);
                    for (Integer i : encode.getStructureIndex()) {
                        changedStructure.add(SourceCodeFeature.values()[i].toString());
                    }
                }
            }
        }


        return changedStructure;
    }

    private int analyzeFile(File dir) throws IOException {
        int lineNumber;
        Launcher launcher = new Launcher();
        launcher.addInputResource(dir.getCanonicalPath() + separator + "Test.java");
        launcher.buildModel();
        CtModel model = launcher.getModel();
        List<CtLoop> loops = model.getElements(new TypeFilter<>(CtLoop.class));
        Random rand = new Random();
        int index = rand.nextInt(loops.size());
        int startLine = loops.get(index).getPosition().getLine();
        int endLine = loops.get(index).getPosition().getEndLine();
        lineNumber = loops.get(index).getPosition().getLine() + rand.nextInt(endLine - startLine);
        return lineNumber;
    }
}
