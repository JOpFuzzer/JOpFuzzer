// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:57 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2103287218L;
    public static int iFld=-63288;
    public static short sFld=9654;
    public static boolean bFld=false;
    public static volatile byte byFld=102;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -199);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i1, long l) {

        int i2=157, i3=17731, i4=-30990, i5=-41289;
        float f=-61.588F;
        long l2=8L, lArr[]=new long[N], lArr1[]=new long[N];

        FuzzerUtils.init(lArr, 2L);
        FuzzerUtils.init(lArr1, -173L);

        l += (long)2.347F;
        for (long l1 : lArr) {
            lArr1[(Test.iFld >>> 1) % N] <<= i1;
            i1 ^= (int)Test.instanceCount;
            i1 += -8;
        }
        for (i2 = 5; i2 < 138; ++i2) {
            f *= i3;
            Test.iFld = Test.iFld;
            Test.iArrFld[i2 - 1] += 6;
        }
        for (i4 = 362; i4 > 9; i4 -= 3) {
            l2 = 1;
            while (++l2 < 13) {
                i1 -= i3;
                try {
                    Test.iFld = (i3 / 32112);
                    i1 = (i1 / i5);
                    i3 = (i3 % -1769371052);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount >>>= Test.instanceCount;
                i3 += (int)(l2 + i4);
            }
        }
        vMeth1_check_sum += i1 + l + i2 + i3 + Float.floatToIntBits(f) + i4 + i5 + l2 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i) {


        Test.instanceCount += (Test.iFld--);
        vMeth1(i, -13L);
        Test.iFld &= -22839;
        vMeth_check_sum += i;
    }

    public static int iMeth() {

        int i6=58690, i7=-143, i8=-81, i9=0;
        float f1=0.599F;
        double d=-2.26799;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr2, 7L);

        vMeth(Test.iFld);
        Test.sFld -= (short)Test.iFld;
        for (i6 = 21; i6 < 384; ++i6) {
            for (i8 = 5; i8 > 1; i8--) {
                switch ((i6 % 10) + 90) {
                case 90:
                    i7 = Test.iFld;
                    Test.iFld += (i8 - i7);
                    f1 += i6;
                    Test.iFld <<= i6;
                    break;
                case 91:
                    i9 = i7;
                    break;
                case 92:
                    i7 >>= i9;
                    break;
                case 93:
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)19767);
                    if (Test.bFld) break;
                    i7 = (int)d;
                    Test.byFld = (byte)i9;
                case 94:
                    Test.iFld += i8;
                    break;
                case 95:
                    f1 = Test.instanceCount;
                    break;
                case 96:
                    lArr2 = lArr2;
                    break;
                case 97:
                case 98:
                    Test.instanceCount -= Test.instanceCount;
                    break;
                case 99:
                    Test.byFld &= (byte)Test.sFld;
                    break;
                default:
                    i9 += (int)f1;
                }
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(lArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i10=-228, i11=-107, i12=30, i13=-39, i14=26883, i15=97;
        double d1=0.74152;
        long lArr3[]=new long[N];

        FuzzerUtils.init(lArr3, -8305297065215138337L);

        Test.iFld += (Test.iFld + iMeth());
        for (i10 = 16; i10 < 394; ++i10) {
            for (i12 = 1; 67 > i12; i12++) {
                int i16=172;
                for (i14 = 1; i14 < 2; i14++) {
                    float f2=-115.596F;
                    d1 %= -31.173F;
                    i13 = i13;
                    Test.iFld = (int)Test.instanceCount;
                    i11 >>= i12;
                    d1 += Test.instanceCount;
                    if (Test.bFld) {
                        switch (((i14 % 1) * 5) + 81) {
                        case 83:
                            i15 -= (int)Test.instanceCount;
                            Test.iFld >>= (int)Test.instanceCount;
                            f2 += i11;
                        default:
                            Test.iFld = (int)Test.instanceCount;
                            if (Test.bFld) {
                                Test.bFld = false;
                                Test.iArrFld[i12 - 1] = (int)-82.33760;
                            }
                            Test.sFld += (short)i14;
                            Test.instanceCount = Test.iFld;
                        }
                        Test.iFld += i13;
                        Test.iFld += (((i14 * f2) + f2) - i13);
                    }
                    lArr3[i10 - 1] <<= Test.iFld;
                    d1 += 7L;
                }
                Test.iArrFld[i12 - 1] += i15;
                i13 -= i16;
                Test.sFld >>>= (short)Test.instanceCount;
                Test.instanceCount += i12;
            }
            lArr3[i10 - 1] *= 71;
            i15 += i14;
        }

        FuzzerUtils.out.println("i10 i11 i12 = " + i10 + "," + i11 + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("d1 lArr3 = " + Double.doubleToLongBits(d1) + "," + FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("Test.bFld Test.byFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," + Test.byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
