package Options;

public enum Option { //return {default, min, max}
    AlwaysIncrementalInline { //do all inlining incrementally

        public int[] getRange() {
            return new int[]{0, 0, 1};
        }
    }, ArrayCopyLoadStoreMaxElem { //Maximum number of arraycopy elements inlined as a sequence of loads/stores

        public int[] getRange() {
            return new int[]{8, 0, Integer.MAX_VALUE};
        }
    }, ArrayOperationPartialInlineSize { //Partial inline size used for small array operations (e.g. copy,cmp) acceleration.

        public int[] getRange() {
            return new int[]{0, 0, 256};
        }
    }, C1InlineStackLimit { //inlining only allowed for methods which don't exceed this number of expression stack and local slots

        public int[] getRange() {
            return new int[]{10, 0, Integer.MAX_VALUE};
        }
    }, C1MaxInlineLevel { // The maximum number of nested calls that are inlined by C1

        public int[] getRange() {
            return new int[]{9, 0, Integer.MAX_VALUE};
        }
    }, C1MaxInlineSize { //The maximum bytecode size of a method to be inlined by C1

        public int[] getRange() {
            return new int[]{35, 0, Integer.MAX_VALUE};
        }
    }, C1MaxRecursiveInlineLevel { //maximum number of nested recursive calls that are inlined by C1

        public int[] getRange() {
            return new int[]{1, 0, Integer.MAX_VALUE};
        }
    }, C1MaxTrivialSize { // The maximum bytecode size of a trivial method to be inlined by C1

        public int[] getRange() {
            return new int[]{6, 0, Integer.MAX_VALUE};
        }
    }, C1ProfileInlinedCalls { //Profile inlined calls when generating code for updating MDOs

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, DebugInlinedCalls { //If false, restricts profiled locations to the root method only

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, IncrementalInlineForceCleanup { //do cleanup after every iteration of incremental inlining

        public int[] getRange() {
            return new int[]{0, 0, 1};
        }
    }, IncrementalInlineMH { //do post parse inlining of method handle calls

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, IncrementalInlineVirtual { //do post parse inlining of method handle calls

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, InlineAccessors { //inline accessor methods (get/set)

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, InlineMethodsWithExceptionHandlers { //Inline methods containing exception handlers (NOTE: does not work with current backend)

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, InlineObjectCopy { //inline Object.clone and Arrays.copyOf[Range] intrinsics

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, InlineReflectionGetCallerClass {//inline sun.reflect.Reflection.getCallerClass(), known to be part of base library DLL

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, InlineSynchronizedMethods { // Inline synchronized methods

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, MaxInlineLevel { //maximum number of nested calls that are inlined by high tier compiler

        public int[] getRange() {
            return new int[]{15, 0, Integer.MAX_VALUE};
        }
    }, MaxInlineSize { //The maximum bytecode size of a method to be inlined by high tier compiler

        public int[] getRange() {
            return new int[]{35, 0, Integer.MAX_VALUE};
        }
    }, MaxRecursiveInlineLevel { //maximum number of nested recursive calls that are inlined by high tier compiler

        public int[] getRange() {
            return new int[]{1, 0, Integer.MAX_VALUE};
        }
    }, MaxTrivialSize { //The maximum bytecode size of a trivial method to be inlined by high tier compiler

        public int[] getRange() {
            return new int[]{6, 0, Integer.MAX_VALUE};
        }
    }, MultiArrayExpandLimit { //Maximum number of individual allocations in an inline-expanded multianewarray instruction

        public int[] getRange() {
            return new int[]{6, 0, Integer.MAX_VALUE};
        }
    }, NestedInliningSizeRatio { //Percentage of prev. allowed inline size in recursive inlining

        public int[] getRange() {
            return new int[]{90, 0, 100};
        }
    }, EliminateAutoBox {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, EliminateLocks {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, EliminateNestedLocks {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, EliminateAllocationArraySizeLimit {
        public int[] getRange() {
            return new int[]{64, 0, Integer.MAX_VALUE};
        }
    }, EliminateAllocationFieldsLimit {
        public int[] getRange() {
            return new int[]{512, 0, Integer.MAX_VALUE};
        }
    }, EliminateAllocations {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, DoEscapeAnalysis {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, OptimizeFill {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, EliminateBlocks {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, CanonicalizeNodes {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, DoCEE {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, EliminateNullChecks {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, UseGlobalValueNumbering {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, UseLocalValueNumbering {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, OptimizeStringConcat {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, BlockLayoutRotateLoops { //Allow back branches to be fall throughs in the block layout

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, DuplicateBackedge { //Transform loop with a merge point into 2 loops if inner loop is expected to optimize better

        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, LoopMaxUnroll { //Maximum number of unrolls for main loop

        public int[] getRange() {
            return new int[]{16, 0, Integer.MAX_VALUE};
        }
    }, LoopOptsCount { //Set level of loop optimization for tier 1 compiles

        public int[] getRange() {
            return new int[]{43, 5, 43};
        }
    }, LoopStripMiningIter { //Number of iterations in strip mined loop

        public int[] getRange() {
            return new int[]{0, 0, Integer.MAX_VALUE};
        }
    }, LoopStripMiningIterShortLoop { //Loop with fewer iterations are not strip mined

        public int[] getRange() {
            return new int[]{0, 0, Integer.MAX_VALUE};
        }
    }, LoopUnrollMin { //Minimum number of unroll loop bodies before checking progress of rounds of unroll,optimize,..

        public int[] getRange() {
            return new int[]{4, 0, Integer.MAX_VALUE};
        }
    }, UseLoopPredicate {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, LoopUnswitching {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, PartialPeelLoop {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, UseSuperWord {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, SuperWordLoopUnrollAnalysis {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, RangeCheckElimination {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, OptoPeephole {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, DominatorSearchLimit {
        public int[] getRange() {
            return new int[]{1000, 0, Integer.MAX_VALUE};
        }
    }, OptimizePtrCompare {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    }, OptimizeUnsafes {
        public int[] getRange() {
            return new int[]{1, 0, 1};
        }
    };

    public abstract int[] getRange();


}
