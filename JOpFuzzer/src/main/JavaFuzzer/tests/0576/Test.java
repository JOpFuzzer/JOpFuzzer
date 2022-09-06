// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:54 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=152L;
    public float fFld=109.595F;
    public static double dFld=4.54609;
    public static int iFld=139;
    public static volatile int iArrFld[]=new int[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -14);
        FuzzerUtils.init(Test.dArrFld, 1.47788);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i8, int i9) {

        float f1=-2.730F;
        int i10=188, i11=-2708, i12=-57803, i13=7, i14=-9;
        byte by1=-12;
        double dArr[]=new double[N];
        long lArr1[][]=new long[N][N], lArr2[][]=new long[N][N];

        FuzzerUtils.init(dArr, -72.44954);
        FuzzerUtils.init(lArr1, 4014160100445301218L);
        FuzzerUtils.init(lArr2, 11L);

        f1 = f1;
        i8 *= (int)Test.instanceCount;
        Test.dFld = f1;
        for (i10 = 10; i10 < 256; i10++) {
            Test.iArrFld[i10] = by1;
            lArr1[(52 >>> 1) % N][i10] += Test.instanceCount;
        }
        for (i12 = 9; i12 < 215; ++i12) {
            i13 -= 144;
        }
        i8 = (int)-160L;
        i8 -= (int)Test.instanceCount;
        Test.instanceCount = i13;
        i8 <<= i9;
        i14 = 207;
        do {
            lArr2[i14 - 1][i14 + 1] /= (Test.instanceCount | 1);
            f1 = -128;
        } while ((i14 -= 2) > 0);
        vMeth_check_sum += i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + by1 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(lArr2);
    }

    public static int iMeth(int i4, long l, int i5) {

        int i6=-9, i15=-52;
        float f=-1.615F;
        double d=-126.48309, dArr1[]=new double[N];
        byte by2=-119, byArr[]=new byte[N];
        short s=2209;

        FuzzerUtils.init(byArr, (byte)94);
        FuzzerUtils.init(dArr1, -40.25317);

        i6 = 1;
        do {
            switch (((i6 % 7) * 5) + 100) {
            case 105:
                f = (float)d;
                Test.instanceCount += Math.abs(Test.iArrFld[i6 + 1]);
                i4 *= i6;
                break;
            case 106:
                switch ((i6 % 2) + 86) {
                case 86:
                    Test.instanceCount += i6;
                    vMeth(i5, i4);
                    f += (i6 * i6);
                    l -= Test.instanceCount;
                    break;
                case 87:
                    l = i4;
                    try {
                        i4 = (i6 % -4186);
                        i5 = (Test.iArrFld[i6] % -164);
                        i5 = (i4 / i6);
                    } catch (ArithmeticException a_e) {}
                    byArr[i6 + 1] = (byte)i4;
                    Test.instanceCount = i6;
                }
                by2 += (byte)i6;
                break;
            case 110:
                i5 += (((i6 * i5) + l) - i5);
            case 102:
                by2 = (byte)i5;
                break;
            case 101:
                i5 += (((i6 * i4) + s) - i6);
            case 111:
                dArr1[i6] += i6;
            case 103:
                i15 *= (int)f;
                break;
            default:
                i5 = (int)f;
            }
        } while (++i6 < 197);
        long meth_res = i4 + l + i5 + i6 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + by2 + s + i15 +
            FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i3) {

        int i16=-51488, i17=-21521, i18=-52217, i19=-6;
        byte by3=52, byArr1[]=new byte[N];
        boolean b=true;
        float f2=1.65F, fArr[]=new float[N];
        long lArr3[]=new long[N];

        FuzzerUtils.init(fArr, 2.963F);
        FuzzerUtils.init(byArr1, (byte)39);
        FuzzerUtils.init(lArr3, 14L);

        Test.iArrFld[(i3 >>> 1) % N] += ((++i3) + iMeth(17, Test.instanceCount, i3));
        fArr = fArr;
        for (i16 = 19; i16 < 333; i16++) {
            i17 >>= i3;
            if (b) {
                Test.instanceCount += i16;
                by3 += (byte)(i16 | i16);
            } else {
                byArr1[i16] += (byte)i17;
            }
            lArr3[i16 + 1] = i17;
            i17 = i17;
            for (i18 = 5; i18 > 1; --i18) {
                Test.instanceCount >>= i18;
                f2 *= -38211;
                f2 *= Test.instanceCount;
            }
            i17 += (((i16 * by3) + i19) - i19);
        }
        long meth_res = i3 + i16 + i17 + by3 + (b ? 1 : 0) + i18 + i19 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(byArr1) +
            FuzzerUtils.checkSum(lArr3);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=171, i1=250, i2=-46, i20=-44755, i21=-4, i22=-61125;
        byte by=-28;
        short s1=-27511;
        long lArr[]=new long[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(lArr, 1551259228L);
        FuzzerUtils.init(fArr1, 53.478F);

        Test.instanceCount *= (i + i);
        for (i1 = 3; i1 < 267; i1++) {
            i = (int)(((i - i1) - 0.322F) * Test.instanceCount);
            i2 = (int)(fFld - (Math.abs(i1) + (--by)));
            i2 /= (int)(((long)((++lArr[i1]) + (lMeth(i) + fFld))) | 1);
            i20 = 1;
            while (++i20 < 95) {
                i2 -= i1;
                Test.iArrFld[i1 + 1] -= (int)Test.instanceCount;
                i -= i;
                Test.instanceCount = -15650;
                by += (byte)(i20 ^ i1);
                i = i20;
                by = (byte)i;
            }
            i21 = 1;
            while (++i21 < 95) {
                fArr1[i1 - 1] -= i20;
                switch ((((i >>> 1) % 4) * 5) + 92) {
                case 106:
                case 94:
                    try {
                        i = (i / 898327311);
                        i = (60126 % i21);
                        i = (i1 % i1);
                    } catch (ArithmeticException a_e) {}
                    i22 = 1;
                    do {
                        fArr1[i1 + 1] *= i;
                        Test.dArrFld[i1 - 1] = 2.450F;
                        Test.iArrFld[i22] ^= i21;
                        fFld += (((i22 * fFld) + i2) - i2);
                        i += i22;
                    } while (++i22 < 1);
                    i2 = i1;
                    fArr1[i21] -= Test.instanceCount;
                case 105:
                    s1 = (short)i22;
                    switch ((i1 % 9) + 50) {
                    case 50:
                        i2 -= i21;
                        i += i2;
                        break;
                    case 51:
                        i2 -= (int)fFld;
                    case 52:
                        try {
                            i = (i2 / i1);
                            i = (i21 / i1);
                            Test.iFld = (i20 / Test.iFld);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 53:
                        Test.iFld -= i2;
                        break;
                    case 54:
                        by = (byte)i20;
                        break;
                    case 55:
                        s1 <<= (short)Test.instanceCount;
                        break;
                    case 56:
                        Test.iFld = (int)Test.instanceCount;
                        break;
                    case 57:
                        Test.instanceCount += i21;
                        break;
                    case 58:
                        Test.iFld += (i21 - i1);
                        break;
                    }
                    break;
                case 111:
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("by i20 i21 = " + by + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 s1 lArr = " + i22 + "," + s1 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iFld Test.iArrFld Test.dArrFld = " + Test.iFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
