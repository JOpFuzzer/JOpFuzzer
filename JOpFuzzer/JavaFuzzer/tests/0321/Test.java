// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3189225339L;
    public static int iFld=-9693;
    public int iFld1=3;
    public static double dArrFld[][]=new double[N][N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 10.12709);
        FuzzerUtils.init(Test.iArrFld, 12654);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2, double d) {

        int i3=44003, i4=47235, i5=-53, i6=6, i7=79, i8=46494, i9=-187, i10=2, iArr[]=new int[N];
        short s=7542;
        boolean b=false;

        FuzzerUtils.init(iArr, -77);

        for (i3 = 5; i3 < 292; ++i3) {
            s >>= (short)-1;
        }
        i4 *= (int)Test.instanceCount;
        for (i5 = 1; i5 < 195; i5++) {
            i2 -= (int)Test.instanceCount;
            for (i7 = 1; i7 < 8; ++i7) {
                iArr[(i4 >>> 1) % N] = i8;
                iArr = FuzzerUtils.int1array(N, (int)4);
                for (i9 = 2; i9 > 1; i9 -= 2) {
                    if (b) break;
                    Test.dArrFld = Test.dArrFld;
                    iArr[i9] *= i4;
                    d = i10;
                    Test.instanceCount = -9;
                    i2 += (((i9 * Test.instanceCount) + i4) - i7);
                }
            }
        }
        vMeth2_check_sum += i2 + Double.doubleToLongBits(d) + i3 + i4 + s + i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0)
            + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(long l1) {

        int i11=16, i12=-11, i13=64461, i14=-68, i15=13, i16=-26858, i17=117, i18=153, i19=13;
        float f=2.892F;
        boolean b1=true;

        vMeth2(i11, 107.69366);
        f = -73;
        l1 = i11;
        i11 &= i11;
        for (i12 = 2; i12 < 312; i12++) {
            for (i14 = i12; 5 > i14; i14++) {
                Test.iArrFld[i12] <<= (int)Test.instanceCount;
                b1 = b1;
                if (i11 != 0) {
                    vMeth1_check_sum += l1 + i11 + Float.floatToIntBits(f) + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) + i16
                        + i17 + i18 + i19;
                    return;
                }
            }
            for (i16 = 1; i16 < 5; i16++) {
                i17 += (((i16 * l1) + i15) - i14);
                l1 >>= -13803;
                for (i18 = 1; i18 < 2; ++i18) {
                    i15 = (int)-60086L;
                    if (b1) continue;
                }
            }
        }
        vMeth1_check_sum += l1 + i11 + Float.floatToIntBits(f) + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) + i16 + i17 + i18
            + i19;
    }

    public static void vMeth(int i, long l, int i1) {

        int i20=-2, i21=-62944, i22=25025, i23=7, i24=48428, i25=-49608;
        boolean b2=true;
        float f1=0.140F;

        vMeth1(l);
        i20 = 1;
        while (++i20 < 132) {
            for (i21 = 1; i21 < 12; i21++) {
                l = i20;
            }
            i23 = 1;
            do {
                Test.iArrFld[i20 + 1] = -244;
                l = i23;
                if (b2) break;
                for (i24 = 1; i24 < 1; i24++) {
                    if (true) break;
                    Test.iArrFld[i20] = -69;
                    Test.iArrFld[i23 - 1] *= (int)l;
                    i1 += i23;
                    f1 *= 74;
                    Test.iArrFld[i20 + 1] += i23;
                }
            } while (++i23 < 12);
        }
        vMeth_check_sum += i + l + i1 + i20 + i21 + i22 + i23 + (b2 ? 1 : 0) + i24 + i25 + Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {

        int i26=61283, i27=-11, i28=-2569, i29=58, i30=-12, i31=-53027;
        boolean b3=false;
        float f2=0.353F;
        byte by=-105, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)27);

        if (b3) {
            vMeth(13, Test.instanceCount, Test.iFld);
        } else if (b3) {
            for (i26 = 349; i26 > 2; i26--) {
                Test.iArrFld = FuzzerUtils.int1array(N, (int)-11);
                Test.iArrFld[i26] >>= i26;
                byArr = byArr;
                for (i28 = 1; i28 < 73; ++i28) {
                    for (i30 = 1; i30 < 2; i30++) {
                        Test.iFld = i29;
                        switch (((i28 >>> 1) % 3) + 58) {
                        case 58:
                            if (b3) continue;
                            i29 += (i30 ^ i28);
                            b3 = b3;
                            break;
                        case 59:
                            i27 = i26;
                        case 60:
                            i31 += (i30 * f2);
                            i27 >>= (int)Test.instanceCount;
                            i27 += i30;
                            break;
                        }
                        switch ((i28 % 3) + 37) {
                        case 37:
                            f2 = -3;
                            break;
                        case 38:
                            if (b3) {
                                Test.iFld += (((i30 * by) + f2) - i31);
                            }
                            break;
                        case 39:
                        default:
                            i31 += (8 + (i30 * i30));
                            i27 = (int)Test.instanceCount;
                            Test.iArrFld[i28 + 1] += i27;
                        }
                        Test.iArrFld = Test.iArrFld;
                        try {
                            Test.iArrFld[i30 - 1] = (Test.iFld % -37);
                            Test.iArrFld[i30] = (64854 / iFld1);
                            Test.iArrFld[i28 + 1] = (i29 % -969);
                        } catch (ArithmeticException a_e) {}
                    }
                    i29 += i28;
                    if (b3) {
                        f2 = Test.iFld;
                    } else {
                        b3 = b3;
                    }
                }
            }
        } else if (b3) {
            i27 *= (int)Test.instanceCount;
        } else {
            i29 -= (int)Test.instanceCount;
        }

        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("b3 f2 by = " + (b3 ? 1 : 0) + "," + Float.floatToIntBits(f2) + "," + by);
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld iFld1 = " + Test.instanceCount + "," + Test.iFld + "," +
            iFld1);
        FuzzerUtils.out.println("Test.dArrFld Test.iArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));

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