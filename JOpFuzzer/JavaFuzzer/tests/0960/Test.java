// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=3065342487606491935L;
    public static short sFld=26769;
    public static double dFld=-1.124623;
    public static byte byFld=120;
    public static boolean bFld=false;
    public static int iFld=64247;
    public static int iArrFld[]=new int[N];
    public volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 35924);
    }

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8) {

        int i9=56, i10=-147, i11=5, i12=2, i13=219, i14=-2, i15=9146, i16=-4, i17=-42, iArr1[][]=new int[N][N];
        float f1=1.596F;
        boolean b=true;

        FuzzerUtils.init(iArr1, -40888);

        for (i9 = 15; 350 > i9; i9++) {
            Test.instanceCount += (((i9 * i11) + i8) - i8);
            for (i12 = 1; i12 < 5; ++i12) {
                iArr1[i12][i9 + 1] = i9;
            }
            Test.sFld += (short)i9;
            iArr1[i9 - 1][i9] *= i9;
            switch (((i9 % 10) * 5) + 110) {
            case 128:
                for (i14 = i9; i14 < 5; ++i14) {
                    i10 += i14;
                    for (i16 = i9; i16 < 1; i16++) {
                        float f=0.851F;
                        Test.dFld = i8;
                        switch (((i12 >>> 1) % 1) + 110) {
                        case 110:
                            i11 -= (int)f;
                            i11 <<= i16;
                            try {
                                iArr1[i16 + 1][i14] = (i11 / -3);
                                i13 = (i13 % i8);
                                i10 = (i11 / 9);
                            } catch (ArithmeticException a_e) {}
                        }
                    }
                }
                break;
            case 141:
                Test.dFld = i11;
            case 127:
                i17 = (int)8L;
                break;
            case 146:
                Test.instanceCount += i9;
                break;
            case 142:
                iArr1[i9][i9] >>= i13;
                break;
            case 118:
                i17 *= i12;
                break;
            case 157:
                iArr1[i9 + 1][i9] += (int)f1;
                break;
            case 137:
                f1 += (i9 + Test.instanceCount);
                break;
            case 158:
                if (b) break;
                break;
            case 126:
                i11 *= i8;
                break;
            }
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + Float.floatToIntBits(f1) + (b ? 1
            : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i7, long l) {

        int i18=-62, i19=26791, i20=-82, i21=-54, i22=14, i23=47952, iArr2[]=new int[N];
        float f2=20.501F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr2, -224);
        FuzzerUtils.init(lArr, -17821L);

        vMeth1(i7);
        i7 >>= Test.byFld;
        for (i18 = 10; i18 < 168; i18++) {
            i7 = i18;
            if (Test.bFld) {
                iArr2 = Test.iArrFld;
                i7 *= (int)Test.dFld;
                for (i20 = 1; 10 > i20; i20++) {
                    lArr[i20][i20 + 1] = 35635;
                    i7 += (i20 + Test.instanceCount);
                    Test.instanceCount += (3959654108L + (i20 * i20));
                    f2 *= Test.byFld;
                    for (i22 = 1; i22 < 2; i22++) {
                        f2 += f2;
                        lArr[i20][i18 + 1] >>= i7;
                    }
                }
            } else if (Test.bFld) {
                l *= i22;
            } else {
                iArr2[i18 - 1] -= i19;
            }
        }
        vMeth_check_sum += i7 + l + i18 + i19 + i20 + i21 + Float.floatToIntBits(f2) + i22 + i23 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
    }

    public static double dMeth(int i3, int i4) {

        int i5=-88, i6=-23316, i24=25222, i25=2, i26=-129, i27=-46, i28=-243;
        float f3=-85.393F;

        for (i5 = 15; i5 < 393; ++i5) {
            vMeth(-216, Test.instanceCount);
            Test.iArrFld[i5 - 1] += i5;
        }
        for (i24 = 5; i24 < 135; i24++) {
            if (i5 != 0) {
            }
            i6 += i24;
            i4 ^= i5;
            if (i25 != 0) {
            }
        }
        switch (((i6 >>> 1) % 2) + 108) {
        case 108:
        case 109:
            for (f3 = 2; f3 < 144; f3++) {
                Test.iArrFld[(int)(f3)] = i4;
                for (i27 = 11; i27 > 1; i27--) {
                    Test.instanceCount = Test.instanceCount;
                    Test.iArrFld[(int)(f3 - 1)] = (int)Test.instanceCount;
                }
                i25 = i28;
            }
            break;
        default:
            i26 = i3;
        }
        long meth_res = i3 + i4 + i5 + i6 + i24 + i25 + Float.floatToIntBits(f3) + i26 + i27 + i28;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-20777, i1=135, i2=-11, i29=5, i30=9, i31=33513, iArr[]=new int[N];
        float f4=-64.495F;
        boolean b1=false;
        long lArr1[][]=new long[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, -102);
        FuzzerUtils.init(lArr1, -9070432251663919295L);
        FuzzerUtils.init(dArr, 46.11130);

        i = ((iArr[(i >>> 1) % N] - (i + i)) + (iArr[(i >>> 1) % N] - (-i)));
        for (i1 = 7; 148 > i1; ++i1) {
            if (Test.bFld) {
                dMeth(i2, i2);
                Test.iArrFld[i1 + 1] ^= 81;
                for (f4 = 8; f4 < 178; ++f4) {
                    i30 = 2;
                    while ((i30 -= 3) > 0) {
                        float f5=126.626F;
                        switch ((int)(((f4 % 2) * 5) + 31)) {
                        case 41:
                        case 37:
                            i += (((i30 * f4) + i30) - i29);
                            i2 <<= (int)Test.instanceCount;
                            switch ((((i2 >>> 1) % 8) * 5) + 21) {
                            case 34:
                                i29 >>= i30;
                                Test.instanceCount *= i2;
                                i += i30;
                                switch ((int)(((f4 % 3) * 5) + 70)) {
                                case 75:
                                    i += (i30 | i2);
                                    i31 += (int)Test.instanceCount;
                                    break;
                                case 84:
                                    f5 += i30;
                                    break;
                                case 85:
                                    i31 = i30;
                                    i2 += i2;
                                    i <<= i29;
                                    break;
                                }
                                break;
                            case 50:
                                Test.iArrFld[i1] *= i29;
                                break;
                            case 46:
                                lArr1[i30 - 1][(int)(f4 + 1)] -= i;
                                iArr[(int)(f4)] = -8;
                                fArrFld[i30] -= i1;
                                i29 -= (int)-38.44225;
                                break;
                            case 31:
                                dArr = dArr;
                                Test.instanceCount += (i30 * Test.byFld);
                                i31 *= (int)f4;
                                i29 += (int)f4;
                            case 35:
                                Test.sFld += (short)(i30 * i2);
                                break;
                            case 32:
                                lArr1[i30][(int)(f4 - 1)] = Test.iFld;
                                break;
                            case 27:
                                Test.iArrFld = FuzzerUtils.int1array(N, (int)40860);
                            case 55:
                                Test.bFld = Test.bFld;
                                break;
                            default:
                                Test.dFld *= i1;
                            }
                            break;
                        default:
                            Test.instanceCount -= (long)f5;
                        }
                    }
                }
            } else if (b1) {
                b1 = Test.bFld;
            } else if (b1) {
                i31 += (((i1 * Test.instanceCount) + i) - i30);
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f4 i29 i30 = " + Float.floatToIntBits(f4) + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 b1 iArr = " + i31 + "," + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("lArr1 dArr = " + FuzzerUtils.checkSum(lArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.byFld Test.bFld Test.iFld = " + Test.byFld + "," + (Test.bFld ? 1 : 0) + "," +
            Test.iFld);
        FuzzerUtils.out.println("Test.iArrFld fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}