// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:01 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-44944L;
    public static volatile int iFld=-6;
    public static volatile double dFld=-115.90098;
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, 0L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        double d1=1.73796;

        d1 -= Test.iFld;
        vMeth2_check_sum += Double.doubleToLongBits(d1);
    }

    public static void vMeth1(int i3, int i4, int i5) {

        int i6=-208, i7=16406, i8=6, i9=-57982, iArr[]=new int[N];
        float f=-95.204F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.111984);
        FuzzerUtils.init(iArr, 6);

        dArr = dArr;
        for (i6 = 3; 152 > i6; ++i6) {
            vMeth2();
            i8 = 1;
            do {
                Test.instanceCount >>= -7;
                f = Test.instanceCount;
            } while (++i8 < 11);
            i9 = 1;
            while (++i9 < 11) {
                i4 = 4;
                i3 = i9;
                i4 >>= -79;
                i5 += 11;
                switch ((i6 % 1) + 73) {
                case 73:
                    Test.iFld = i9;
                    break;
                default:
                    try {
                        iArr[i9] = (63157 / i7);
                        i3 = (i3 / i6);
                        iArr[i6 - 1] = (i3 / 190);
                    } catch (ArithmeticException a_e) {}
                    Test.lArrFld[i9 - 1][i9] = i5;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) + i9 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(double d, int i, int i1) {

        int i2=-54801, i10=-26425, i11=-88, i12=-64478, i13=212, iArr1[]=new int[N];
        float f1=1.135F;

        FuzzerUtils.init(iArr1, 196);

        i2 = 1;
        do {
            vMeth1(146, Test.iFld, i1);
        } while (++i2 < 383);
        for (i10 = 1; 147 > i10; i10++) {
            switch (((i10 % 1) * 5) + 19) {
            case 21:
                for (i12 = 1; i12 < 11; i12++) {
                    iArr1[i12 - 1] -= i13;
                    Test.iFld += (int)d;
                    iArr1[i10 - 1] = i1;
                    Test.instanceCount += i12;
                    i11 <<= i10;
                    i1 &= i11;
                    i11 += i12;
                    Test.instanceCount += -138;
                    f1 *= i11;
                }
                try {
                    i11 = (53537 % i1);
                    i13 = (Test.iFld / Test.iFld);
                    i13 = (i / 86);
                } catch (ArithmeticException a_e) {}
                break;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i + i1 + i2 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1)
            + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i14=54, i15=100, i16=29, i17=-463, i18=55, i19=407, i20=-13, i21=-37082, i22=246, i23=24259, i24=-228,
            i25=153, i26=-59554, i27=-12;
        short s=-14536;
        boolean b=true;
        long l=132033022L;
        float fArr[]=new float[N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(fArr, 35.706F);
        FuzzerUtils.init(dArr1, -52.56312);

        vMeth(Test.dFld, Test.iFld, Test.iFld);
        for (i14 = 3; i14 < 274; ++i14) {
            Test.lArrFld[i14][i14] = s;
            for (i16 = 2; i16 < 93; ++i16) {
                s = (short)i18;
                Test.instanceCount += (i16 * i16);
                for (i19 = 1; i19 < 2; i19++) {
                    i15 = (int)-1.125852;
                    if (b) {
                        i21 = (int)Test.instanceCount;
                        Test.lArrFld[i19 + 1][i19 - 1] = i16;
                    } else if (true) {
                        Test.instanceCount -= Test.iFld;
                    }
                }
                for (i22 = i14; i22 < 2; i22++) {
                    i18 *= (int)Test.instanceCount;
                    fArr[i14] *= Test.instanceCount;
                    i18 = i14;
                }
                for (i24 = 2; i24 > i14; i24 -= 3) {
                    dArr1[i24] -= i23;
                    Test.instanceCount >>= Test.instanceCount;
                    Test.lArrFld[i24 + 1][i24 - 1] = i24;
                    Test.instanceCount -= s;
                    i25 *= i17;
                    Test.instanceCount <<= i19;
                }
                Test.lArrFld[i16] = Test.lArrFld[i16];
            }
            Test.iFld = (int)l;
            fArr[i14] += i20;
            i17 >>= i14;
            for (i26 = 93; i26 > 1; i26 -= 2) {
                s -= (short)l;
                i21 += (i26 + Test.instanceCount);
            }
        }

        FuzzerUtils.out.println("i14 i15 s = " + i14 + "," + i15 + "," + s);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("b i22 i23 = " + (b ? 1 : 0) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 l = " + i24 + "," + i25 + "," + l);
        FuzzerUtils.out.println("i26 i27 fArr = " + i26 + "," + i27 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
