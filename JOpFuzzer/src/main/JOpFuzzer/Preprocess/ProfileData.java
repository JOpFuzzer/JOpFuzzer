package Preprocess;

import Options.Option;
import javaslang.Tuple3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ProfileData {
    PrintInlining {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{0, 24};
            return getValue(index);
        }

    }, PrintEliminateAutoBox {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{24, 25};
            return getValue(index);
        }
    }, PrintEliminateLocks {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{25, 27};
            return getValue(index);
        }
    }, PrintEliminateAllocations {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{27, 30};
            return getValue(index);
        }
    }, PrintEscapeAnalysis {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{30, 31};
            return getValue(index);
        }
    }, TraceOptimizeFill {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{31, 32};
            return getValue(index);
        }
    }, PrintBlockElimination {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{32, 33};
            return getValue(index);
        }
    }, PrintCanonicalization {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{33, 34};
            return getValue(index);
        }
    }, PrintCEE {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{34, 35};
            return getValue(index);
        }
    }, PrintNullCheckElimination {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{35, 36};
            return getValue(index);
        }
    }, PrintValueNumbering {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{36, 38};
            return getValue(index);
        }
    }, PrintOptimizeStringConcat {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{38, 39};
            return getValue(index);
        }
    }, TraceLoopOpts {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{39, 46};
            return getValue(index);
        }
    }, TraceLoopPredicate {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{46, 47};
            return getValue(index);
        }
    }, TraceLoopUnswitching {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{47, 48};
            return getValue(index);
        }
    }, TracePartialPeeling {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{48, 49};
            return getValue(index);
        }
    }, TraceSuperWord {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{49, 50};
            return getValue(index);
        }
    }, TraceSuperWordLoopUnrollAnalysis {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{50, 51};
            return getValue(index);
        }
    }, TraceRangeCheckElimination {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{51, 52};
            return getValue(index);
        }
    }, PrintOptoPeephole {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{52, 53};
            return getValue(index);
        }
    }, PrintDominators {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{53, 54};
            return getValue(index);
        }
    }, PrintOptimizePtrCompare {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{54, 55};
            return getValue(index);
        }
    }, PrintUnsafeOptimization {
        public List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue() {
            int[] index = new int[]{55, 56};
            return getValue(index);
        }
    };

    public List<Tuple3<String, List<Integer>, Boolean>> getValue(int[] index) {
        List<Tuple3<String, List<Integer>, Boolean>> result = new ArrayList<>();
        List<Option> op = new ArrayList<>(Arrays.asList(Option.values()).subList(index[0], index[1]));
        for (Option option : op) {
            int[] values = option.getRange();
            int defaultValue = values[0];
            List<Integer> testValue = new ArrayList<>() {
            };
            testValue.add(values[1]);
            if (defaultValue == values[1]) {
                testValue.add(values[2]);
            } else {
                testValue.add(defaultValue);
            }
            Boolean isBoolean = values[2] == 1;
            result.add(new Tuple3<>(option.toString(), testValue, isBoolean));
        }
        return result;
    }


    public abstract List<Tuple3<String, List<Integer>, Boolean>> getOptionAndValue();
}