// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:47 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6298502960452649432L;
    public static float fFld=0.713F;
    public volatile boolean bFld=true;
    public short sFld=-27722;
    public static byte byArrFld[]=new byte[N];
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)118);
        FuzzerUtils.init(Test.fArrFld, -1.129F);
        FuzzerUtils.init(Test.lArrFld, -3L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i4=177, i5=0, i6=73, i7=-132, i8=0, i9=63665;
        short s=-31928;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2252L);

        i4 = -18684;
        Test.fFld %= 44737;
        for (i5 = 2; i5 < 196; i5++) {
            Test.instanceCount += (((i5 * Test.instanceCount) + i5) - i4);
            i4 -= i4;
            Test.fFld += i6;
            i7 = 1;
            do {
                s %= (short)1.759F;
                for (i8 = i7; i8 < 1; ++i8) {
                    Test.instanceCount += (i8 ^ i7);
                    b = false;
                    i9 = (int)Test.fFld;
                    i9 = i4;
                    i9 += (i8 ^ (long)Test.fFld);
                }
                lArr[i5] -= i8;
            } while (++i7 < 8);
        }
        vMeth2_check_sum += i4 + i5 + i6 + i7 + s + i8 + i9 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(float f2, int i2, int i3) {

        int i10=-40, i11=13847, i12=-9396, i13=-10, iArr[]=new int[N];
        short s1=23885;
        double d=-112.16791, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.97024);
        FuzzerUtils.init(iArr, 27);

        Test.instanceCount -= (Test.instanceCount++);
        vMeth2();
        i10 = 1;
        while (++i10 < 305) {
            i2 = 66;
            i2 >>= i2;
            s1 ^= (short)i2;
            for (d = 1; 5 > d; ++d) {
                Test.instanceCount = i10;
                dArr[i10 + 1] = 10982;
                for (i12 = 1; i12 < 2; ++i12) {
                    Test.byArrFld[(int)(d)] = (byte)i10;
                    try {
                        i13 = (i12 / i3);
                        i13 = (i3 % i13);
                        i3 = (iArr[i10 - 1] / i11);
                    } catch (ArithmeticException a_e) {}
                    Test.fArrFld[i10 + 1] = i11;
                    i11 = i3;
                    iArr[(int)(d + 1)] -= i13;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f2) + i2 + i3 + i10 + s1 + Double.doubleToLongBits(d) + i11 + i12 +
            i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(float f, int i, float f1) {

        int i1=-48361, i14=-106, i15=63901, i16=211, iArr1[][]=new int[N][N];
        double d1=2.9453;
        boolean b1=true;
        byte by=78;

        FuzzerUtils.init(iArr1, -7);

        i1 = 318;
        do {
            vMeth1(Test.fFld, -10050, i1);
            i14 = 1;
            while (++i14 < 10) {
                i >>= i14;
                d1 -= i1;
                if (b1) continue;
                i -= (int)Test.instanceCount;
                i *= i14;
                for (i15 = 1; 1 > i15; i15++) {
                    Test.instanceCount = (long)8.6178;
                    i16 += i15;
                    Test.instanceCount += (((i15 * i16) + by) - i15);
                    if (b1) continue;
                    Test.fFld = i16;
                    iArr1[i15][i15 - 1] = i;
                }
            }
        } while ((i1 -= 2) > 0);
        vMeth_check_sum += Float.floatToIntBits(f) + i + Float.floatToIntBits(f1) + i1 + i14 +
            Double.doubleToLongBits(d1) + (b1 ? 1 : 0) + i15 + i16 + by + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i17=-156, i18=120, i19=-4, i20=-10, i21=-2, i22=-4, i23=-250, i24=-12, i25=159, iArr2[]=new int[N],
            iArr3[][]=new int[N][N];
        double d2=2.6418;

        FuzzerUtils.init(iArr2, -14);
        FuzzerUtils.init(iArr3, 37);

        vMeth(-117.288F, -133, 87.995F);
        i17 = 1;
        while (++i17 < 396) {
            switch ((i17 % 5) + 7) {
            case 7:
                i18 = (int)Test.instanceCount;
                Test.instanceCount += (((i17 * Test.fFld) + i18) - Test.fFld);
            case 8:
                i19 = 64;
                do {
                    iArr2[i19] = i17;
                    i18 += i17;
                } while (--i19 > 0);
                for (i20 = 4; 64 > i20; ++i20) {
                    i18 += (i20 - Test.instanceCount);
                    i21 += (i20 ^ i19);
                    i18 += (34920 + (i20 * i20));
                    Test.fFld = (float)d2;
                    Test.instanceCount += i20;
                    i21 = i20;
                    iArr3 = iArr3;
                    Test.instanceCount = 5;
                }
                break;
            case 9:
                iArr2[i17 - 1] = (int)d2;
                for (i22 = 4; i22 < 64; ++i22) {
                    i18 += (int)1.252F;
                    if (bFld) {
                        i23 = (int)Test.instanceCount;
                        Test.instanceCount = i17;
                        for (i24 = 1; i24 < 2; i24++) {
                            i23 = i17;
                            iArr2[i17 - 1] = i18;
                            i25 >>= -2;
                            Test.lArrFld = Test.lArrFld;
                        }
                    } else {
                        iArr2[i17] += i17;
                        Test.instanceCount *= i21;
                    }
                }
                break;
            case 10:
                Test.fFld = -27077;
                break;
            case 11:
                i23 = sFld;
                break;
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 d2 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 iArr2 iArr3 = " + i25 + "," + FuzzerUtils.checkSum(iArr2) + "," +
            FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("sFld Test.byArrFld Test.fArrFld = " + sFld + "," + FuzzerUtils.checkSum(Test.byArrFld)
            + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
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
