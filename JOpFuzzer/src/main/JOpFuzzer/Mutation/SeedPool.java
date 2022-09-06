package Mutation;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import static Utils.Execute.execute;

public class SeedPool {
    int testNumber;
    HashMap<File, List<String>> seedPoolOptionPair = new HashMap<>();

    public SeedPool(String testNumber) throws IOException {
        this.testNumber = Integer.parseInt(testNumber);
//        generate();
        initialize();
    }

    private void initialize() throws IOException {
        File rootDir = new File("./JavaFuzzer/tests/");
        for (File dir : Objects.requireNonNull(rootDir.listFiles())) {
            if (dir.isDirectory())
                seedPoolOptionPair.put(dir, Collections.singletonList(""));
        }
    }

    private void generate() throws IOException {
        String cmd = "cd ./JavaFuzzer; bash generate.sh " + testNumber + "; cd ..";
        int exitValue = execute(cmd);
        if (exitValue != 0) {
            System.err.println("Error: generate seed failed");
            System.exit(1);
        }
    }

    public int getTestNumber() {
        return testNumber;
    }

    public void addTestNumber() {
        this.testNumber++;
    }

    public void pairOption(File dir, List<String> option) {
        seedPoolOptionPair.put(dir, option);
    }

}
