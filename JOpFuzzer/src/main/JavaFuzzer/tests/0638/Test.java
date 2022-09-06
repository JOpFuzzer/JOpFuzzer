// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:55 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1663075385983599028L;
    public static int iFld=-33;
    public static byte byFld=66;
    public static int iFld1=-42761;
    public static volatile short sFld=-6815;
    public static int iFld2=-4;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[][]=new long[N][N];
    public static double dArrFld[]=new double[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 14);
        FuzzerUtils.init(Test.lArrFld, 441205176L);
        FuzzerUtils.init(Test.dArrFld, 2.36325);
        FuzzerUtils.init(Test.fArrFld, -52.915F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(double d1) {

        boolean b=true;

        Test.iFld <<= (int)Test.instanceCount;
        Test.instanceCount = Test.instanceCount;
        Test.iFld1 = Test.iFld;
        b = b;
        d1 -= Test.iFld;
        long meth_res = Double.doubleToLongBits(d1) + (b ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(float f1, int i5, long l1) {

        int i6=205, i7=0, i8=46576, i9=-10, i10=-14062, i11=8, i12=58152;
        double d=93.54805, dArr[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 47667L);
        FuzzerUtils.init(dArr, -118.8645);

        Test.iFld = (int)(Integer.reverseBytes(Test.iArrFld[(0 >>> 1) % N]) + ((f1 - i5) - lArr1[(i5 >>> 1) % N]));
        for (i6 = 1; 133 > i6; ++i6) {
            Test.iFld *= (int)((l1++) + ((-(i7 * Test.byFld)) + -54533));
        }
        d -= ((lArr1[(i5 >>> 1) % N] - (Test.instanceCount + Test.byFld)) * lMeth(d));
        Test.lArrFld = Test.lArrFld;
        i7 = Test.byFld;
        for (i8 = 17; i8 < 307; i8++) {
            Test.iArrFld[i8] = (int)f1;
        }
        i10 = 325;
        do {
            f1 += (0.903F + (i10 * i10));
        } while (--i10 > 0);
        for (i11 = 4; 124 > i11; ++i11) {
            f1 = i12;
            dArr[i11] %= (i8 | 1);
            Test.iArrFld[i11 + 1] = (int)l1;
            Test.iFld1 -= i12;
        }
        long meth_res = Float.floatToIntBits(f1) + i5 + l1 + i6 + i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11
            + i12 + FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i2=-4, i3=-228, i4=-6670, i13=5, i14=-21, i15=6;
        long l=1L, lArr[]=new long[N];
        double d2=-81.18093;
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, -7L);
        FuzzerUtils.init(fArr, -2.364F);

        for (i2 = 12; i2 < 292; ++i2) {
            switch (((((++Test.iFld) >>> 1) % 2) * 5) + 74) {
            case 82:
                for (l = i2; l < 6; l++) {
                    Test.iFld += (int)l;
                }
                Test.instanceCount += (i2 | i3);
                break;
            case 79:
                Test.iArrFld[i2] -= (int)(++lArr[i2]);
                iMeth(-11.785F, i2, l);
                for (d2 = i2; d2 < 6; d2 += 2) {
                    i3 += (int)d2;
                    for (i14 = 1; i14 < 1; i14 += 3) {
                        Test.dArrFld[i2 - 1] = Test.iFld;
                    }
                    switch ((i2 % 1) + 104) {
                    case 104:
                        fArr[(int)(d2)] /= 0.125F;
                        Test.byFld >>= (byte)i15;
                        Test.instanceCount >>= i15;
                        break;
                    default:
                        Test.iArrFld[i2 - 1] *= i4;
                    }
                }
            default:
                i4 >>= i13;
            }
        }
        vMeth_check_sum += i2 + i3 + l + i4 + Double.doubleToLongBits(d2) + i13 + i14 + i15 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=218, i1=14, i16=158, i17=-14, i18=-121, i19=-45411, i20=-12, i21=22319, i22=-1959, i23=-13, i24=-2595,
            i25=12;
        float f=11.498F;
        boolean b1=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-30081);

        i = 1;
        while (++i < 312) {
            i1 = 81;
            while (--i1 > 0) {
                f = i1;
            }
            vMeth();
            for (i16 = 2; i16 < 81; ++i16) {
                Test.sFld ^= (short)-233L;
                Test.iArrFld[i] += 5315;
                for (i18 = 1; i18 < 2; i18++) {
                    Test.fArrFld[i - 1] = Test.instanceCount;
                }
                i19 *= Test.iFld1;
                Test.iArrFld[i] += (int)f;
                Test.instanceCount += (long)f;
                Test.fArrFld = Test.fArrFld;
                Test.iArrFld = Test.iArrFld;
                for (i20 = 1; i20 < 2; ++i20) {
                    Test.sFld += (short)(10622 + (i20 * i20));
                    try {
                        Test.iFld1 = (i / i17);
                        i17 = (Test.iFld2 / Test.iFld1);
                        i21 = (46517 / i1);
                    } catch (ArithmeticException a_e) {}
                    Test.iFld2 -= Test.iFld;
                    i21 ^= i19;
                    Test.instanceCount *= i18;
                }
            }
            Test.instanceCount = i19;
            for (i22 = i; 81 > i22; i22++) {
                f -= i20;
                i17 >>= (int)Test.instanceCount;
                if (b1) {
                    for (i24 = 1; i24 > 1; i24--) {
                        i21 -= 14856;
                        Test.iArrFld[i24 - 1] = i16;
                        sArr[i24 + 1] *= (short)i1;
                        f += (((i24 * f) + Test.instanceCount) - Test.instanceCount);
                    }
                } else {
                    Test.iFld2 += (int)Test.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 b1 sArr = " + i25 + "," + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.byFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld1 Test.sFld Test.iFld2 = " + Test.iFld1 + "," + Test.sFld + "," + Test.iFld2);
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + ","
            + FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
