// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3732063677819907561L;
    public int iFld=2720;
    public static float fFld=-1.253F;
    public static int iFld1=6553;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -32472);
        FuzzerUtils.init(Test.lArrFld, 3L);
        FuzzerUtils.init(Test.dArrFld, 0.66970);
    }

    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long bMeth1_check_sum = 0;

    public static boolean bMeth1(float f, short s) {

        int i6=87, i7=-164, i8=39000, i9=-10, iArr[]=new int[N];
        boolean b1=true;

        FuzzerUtils.init(iArr, -4);

        for (i6 = 7; i6 < 245; ++i6) {
            i7 += (int)Test.instanceCount;
        }
        if (b1) {
            f -= i6;
            for (i8 = 6; i8 < 209; ++i8) {
                iArr[i8] += i6;
            }
            iArr[(i6 >>> 1) % N] = i9;
        }
        long meth_res = Float.floatToIntBits(f) + s + i6 + i7 + i8 + i9 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
        bMeth1_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth() {

        int i2=35683, i3=-13, i4=-86, i5=45291, i10=-186, i11=-135;
        boolean b=false;
        short s1=-24338;
        double d=1.68757;
        long l=-7434547429080570497L;

        for (i2 = 6; i2 < 189; ++i2) {
            for (i4 = 1; i4 < 9; i4 += 2) {
                i5 *= (i4 - i3);
                b = bMeth1(Test.fFld, s1);
                Test.instanceCount -= i3;
                Test.instanceCount += (long)d;
            }
            d += i4;
            i5 += (i2 | i4);
            Test.iArrFld[i2 + 1] += (int)Test.instanceCount;
            Test.instanceCount = (long)Test.fFld;
        }
        i5 = 98;
        l = i2;
        for (i10 = 13; i10 < 364; i10++) {
            Test.iArrFld[i10 - 1] = s1;
            try {
                i5 = (i10 % -207);
                Test.iArrFld[i10] = (Test.iArrFld[i10] % i11);
                Test.iArrFld[i10] = (i3 % Test.iFld1);
            } catch (ArithmeticException a_e) {}
        }
        long meth_res = i2 + i3 + i4 + i5 + (b ? 1 : 0) + s1 + Double.doubleToLongBits(d) + l + i10 + i11;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public boolean bMeth(int i, int i1) {

        int i12=-59583, i13=-47706;
        long l1=100L;
        boolean b2=true;

        Test.instanceCount = (iMeth() * Test.iFld1);
        i12 = 1;
        while (++i12 < 387) {
            i13 = 1;
            while (++i13 < 4) {
                Test.lArrFld[i13 + 1] = i13;
                if (b2) {
                    l1 = 1;
                    while (++l1 < 1) {
                        Test.iArrFld[i13] >>= Test.iFld1;
                        Test.fFld = l1;
                        i1 -= (int)7063525360203937622L;
                        if (i13 != 0) {
                            return ((int)(i + i1 + i12 + i13 + l1 + (b2 ? 1 : 0))) % 2 > 0;
                        }
                        if (b2) continue;
                        iFld += (166 + (l1 * l1));
                        iFld += (int)(((l1 * i12) + Test.iFld1) - i12);
                    }
                } else if (true) {
                    iFld = i;
                } else {
                    i1 = i13;
                }
            }
        }
        long meth_res = i + i1 + i12 + i13 + l1 + (b2 ? 1 : 0);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i14=15085, i15=6, i16=-168, i17=9, i18=2, i19=-226, i20=4, i21=107, i22=-4, iArr1[]=new int[N];
        byte by=-68;
        short s2=28482;
        long l2=-5849811315767983968L;
        boolean b3=false;

        FuzzerUtils.init(iArr1, 7);

        iFld = iFld;
        bMeth(i14, i14);
        i15 = 327;
        do {
            Test.iFld1 = i14;
            by |= (byte)s2;
            Test.iFld1 <<= i14;
            i14 = (int)Test.instanceCount;
            Test.instanceCount = Test.iFld1;
            for (l2 = 2; l2 < 77; ++l2) {
                Test.instanceCount += (56 + (l2 * l2));
            }
            for (i17 = 2; 77 > i17; ++i17) {
                Test.iArrFld[i15] = (int)1.257F;
                s2 += (short)l2;
                Test.iFld1 = i18;
            }
            iFld >>>= i17;
            i18 += i15;
            for (i19 = 2; i19 < 77; ++i19) {
                i16 += (int)Test.fFld;
                Test.instanceCount -= i18;
                try {
                    iArr1[i19 + 1] = (i17 % Test.iArrFld[i15]);
                    i18 = (i17 % Test.iFld1);
                    i18 = (i16 % -5063);
                } catch (ArithmeticException a_e) {}
                i14 += (i19 | (long)Test.fFld);
                i20 = iFld;
                if (b3) {
                    Test.iFld1 += (((i19 * i15) + i19) - Test.fFld);
                    switch (((i20 >>> 1) % 8) + 45) {
                    case 45:
                        Test.instanceCount = (long)Test.fFld;
                        for (i21 = 1; i21 < 2; ++i21) {
                            Test.fFld = i18;
                            i16 = i21;
                            i16 -= i20;
                        }
                        break;
                    case 46:
                        Test.lArrFld[i19] -= i22;
                        break;
                    case 47:
                        i20 *= i17;
                        break;
                    case 48:
                        Test.instanceCount += (((i19 * i17) + i17) - Test.instanceCount);
                        break;
                    case 49:
                        s2 *= (short)iFld;
                        break;
                    case 50:
                        if (b3) break;
                    case 51:
                        Test.dArrFld[i19 - 1] = i16;
                        break;
                    case 52:
                        i14 = -41;
                        break;
                    default:
                        Test.fFld += i19;
                    }
                } else {
                    i16 -= iFld;
                }
            }
        } while (--i15 > 0);

        FuzzerUtils.out.println("i14 i15 by = " + i14 + "," + i15 + "," + by);
        FuzzerUtils.out.println("s2 l2 i16 = " + s2 + "," + l2 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("b3 iArr1 = " + (b3 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld1 Test.iArrFld Test.lArrFld = " + Test.iFld1 + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("bMeth1_check_sum: " + bMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  iMeth ->  iMeth bMeth mainTest
//DEBUG  bMeth1 ->  bMeth1 iMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
