// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=4069480944L;
    public static float fFld=-72.627F;
    public static byte byFld=76;
    public static double dFld=-109.111994;
    public float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];
    public static float fArrFld1[]=new float[N];
    public static int iArrFld1[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 57172);
        FuzzerUtils.init(Test.byArrFld, (byte)12);
        FuzzerUtils.init(Test.fArrFld1, 111.713F);
        FuzzerUtils.init(Test.iArrFld1, -56313);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i8=-29175, i9=52, i10=-10009, i11=0, i12=4;
        byte by1=-51;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1623855593L);

        for (i8 = 12; i8 < 326; ++i8) {
            i10 = 5;
            while (--i10 > 0) {
                Test.byArrFld[i10] <<= (byte)-184L;
                if (i9 != 0) {
                    vMeth2_check_sum += i8 + i9 + i10 + i11 + i12 + by1 + FuzzerUtils.checkSum(lArr);
                    return;
                }
                i9 -= 161;
                for (i11 = 1; i11 < 1; ++i11) {
                    lArr[i10 + 1] = 8155873565848505752L;
                    i9 >>>= (int)Test.instanceCount;
                    i9 -= (int)Test.instanceCount;
                    i12 |= i12;
                    Test.fFld += i11;
                    Test.fArrFld1[i10] = i12;
                    i12 += (int)Test.instanceCount;
                    Test.iArrFld[i11 + 1] *= i10;
                    by1 <<= (byte)i9;
                }
            }
        }
        vMeth2_check_sum += i8 + i9 + i10 + i11 + i12 + by1 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(float f) {

        int i13=8, i14=-38682, i15=6, i16=49345, i17=-10, i18=-9, i19=246, i20=-8;
        boolean b=false;
        double d=0.71869;

        vMeth2();
        for (i13 = 10; 175 > i13; i13++) {
            for (i15 = 1; 10 > i15; ++i15) {
                if (b) break;
                for (i17 = 2; i17 > 1; --i17) {
                    i14 = i16;
                    Test.fArrFld1[i13] = Test.byFld;
                    i14 -= (int)Test.fFld;
                    Test.iArrFld1 = Test.iArrFld1;
                    d = Test.instanceCount;
                    i14 |= i13;
                }
                i14 = (int)Test.instanceCount;
            }
            for (i19 = 1; i19 < 10; i19++) {
                i16 += (i19 * i19);
            }
            Test.iArrFld[i13 + 1] = i14;
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i13 + i14 + i15 + i16 + (b ? 1 : 0) + i17 + i18 +
            Double.doubleToLongBits(d) + i19 + i20;
    }

    public void vMeth(int i2, int i3, int i4) {

        int i5=0, i6=-58092, i21=42344, i22=8, i23=-50881, i24=-230, i25=-1;
        byte by=-92;
        double d1=0.82793;

        for (i5 = 11; 261 > i5; ++i5) {
            i3 -= (by--);
        }
        for (int i7 : Test.iArrFld) {
            Test.iArrFld[(i5 >>> 1) % N] *= (int)(Test.instanceCount + ((i4 + i7) + (Test.iArrFld[(226 >>> 1) % N]--)));
            vMeth1(Test.fFld);
            Test.instanceCount = i2;
            i3 <<= i7;
        }
        i21 = 1;
        do {
            for (i22 = 1; i22 < 6; i22 += 3) {
                i4 >>= 186;
                for (i24 = 1; 6 > i24; i24++) {
                    Test.fFld += i24;
                    i25 += (int)Test.instanceCount;
                    d1 += 44875;
                }
            }
            Test.instanceCount += (i21 + i6);
        } while (++i21 < 296);
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + by + i21 + i22 + i23 + i24 + i25 + Double.doubleToLongBits(d1);
    }

    public void mainTest(String[] strArr1) {

        int i=-12035, i1=-166, i26=7, i27=61005, i28=-2, i29=4, i30=6, iArr[]=new int[N], iArr1[]=new int[N];
        double d2=49.9519, dArr[]=new double[N];
        short s=-110, sArr[][]=new short[N][N];
        boolean b1=true;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(lArr1, 1291204416346898865L);
        FuzzerUtils.init(sArr, (short)5576);
        FuzzerUtils.init(iArr1, 206);
        FuzzerUtils.init(dArr, -57.73874);

        for (i = 12; i < 192; ++i) {
            iArr[i] *= (int)fArrFld[i];
            vMeth(-40553, i, 10);
            Test.instanceCount = i;
        }
        for (d2 = 193; d2 > 12; d2 -= 2) {
            lArr1[(int)(d2)][(int)(d2)] += i;
            fArrFld[(int)(d2)] -= i;
            i26 *= Test.byFld;
            switch ((((i26 >>> 1) % 10) * 5) + 98) {
            case 136:
                for (i27 = (int)(d2); i27 < 278; i27++) {
                    i26 += i27;
                    sArr[(int)(d2 - 1)] = sArr[i27 + 1];
                    Test.dFld -= Test.fFld;
                    for (i29 = 1; i29 < 1; i29 += 3) {
                        i26 -= i29;
                        i1 = -36454;
                        switch ((i27 % 9) + 2) {
                        case 2:
                            i26 *= (int)-1145992938L;
                            Test.iArrFld1[i29] = Test.iArrFld;
                            break;
                        case 3:
                            i30 -= i30;
                            iArr1[(int)(d2 - 1)] %= (int)(i29 | 1);
                            break;
                        case 4:
                            Test.dFld -= -28916;
                            i30 = i28;
                            iArr1[i29] = s;
                            i1 -= i1;
                        case 5:
                            i28 += (((i29 * Test.fFld) + Test.instanceCount) - i);
                            i28 -= i28;
                            break;
                        case 6:
                            if (b1) {
                                Test.byFld += (byte)i26;
                            } else if (b1) {
                                Test.instanceCount = i29;
                            } else if (b1) {
                                Test.iArrFld1[i27][(int)(d2 - 1)] = i26;
                            }
                            break;
                        case 7:
                            Test.fFld += i27;
                            break;
                        case 8:
                            if (b1) break;
                            break;
                        case 9:
                            lArr1[(int)(d2)][(int)(d2 + 1)] = -14;
                        case 10:
                            Test.fFld = i26;
                            break;
                        }
                    }
                }
                break;
            case 99:
                i26 += i27;
                break;
            case 111:
                dArr[(int)(d2)] -= -212;
                break;
            case 140:
                s ^= (short)i1;
                break;
            case 116:
                i28 -= -13391;
                break;
            case 104:
                i26 = i1;
                break;
            case 102:
                i1 = (int)1.57827;
                break;
            case 130:
            case 120:
                i28 |= 215;
                break;
            case 124:
                iArr[(int)(d2)] = i30;
                break;
            default:
                if (b1) continue;
            }
        }

        FuzzerUtils.out.println("i i1 d2 = " + i + "," + i1 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 s = " + i29 + "," + i30 + "," + s);
        FuzzerUtils.out.println("b1 iArr lArr1 = " + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("sArr iArr1 dArr = " + FuzzerUtils.checkSum(sArr) + "," + FuzzerUtils.checkSum(iArr1) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.dFld fArrFld Test.iArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.byArrFld Test.fArrFld1 Test.iArrFld1 = " + FuzzerUtils.checkSum(Test.byArrFld) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld1)) + "," +
            FuzzerUtils.checkSum(Test.iArrFld1));

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