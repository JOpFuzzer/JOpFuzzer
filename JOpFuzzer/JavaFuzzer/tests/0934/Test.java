// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=170L;
    public static double dFld=-1.44477;
    public static byte byFld=-106;
    public volatile boolean bFld=true;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -22);
    }

    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i4=4, i5=8, i6=-21730, i7=182, i8=2, i9=2053, iArr1[]=new int[N];
        float f1=0.284F;
        boolean b=false;

        FuzzerUtils.init(iArr1, 28947);

        for (i4 = 11; i4 < 257; ++i4) {
            for (i6 = 1; i6 < 7; ++i6) {
                try {
                    iArr1[i6 + 1] = (-1537427513 % i4);
                    i5 = (54 / i5);
                    i7 = (i7 / -20563);
                } catch (ArithmeticException a_e) {}
                i7 <<= i5;
                for (i8 = 1; 2 > i8; i8++) {
                    i7 = i4;
                    f1 += ((long)i8 | (long)i9);
                    if (b) break;
                }
                i7 >>= 0;
                i5 = i8;
                Test.instanceCount = -1;
                i9 += (i6 * i6);
                i5 += (int)Test.instanceCount;
                i7 += i5;
                i7 += -755;
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(float f, int i3) {

        double d=-1.3060;
        int i10=-5, i11=-5, i12=-15950, i13=1, i14=56323, i15=-9;
        long l2=-12089L, lArr[]=new long[N];
        short s=6018;

        FuzzerUtils.init(lArr, 63L);

        vMeth();
        i3 *= (int)d;
        f *= i3;
        for (i10 = 7; i10 < 155; i10++) {
            i11 += (i10 - i10);
            l2 = 248;
            lArr[i10 + 1] *= i10;
            for (i12 = 1; i12 < 11; i12++) {
                i11 -= i13;
                i3 += (i12 - i10);
                for (i14 = 1; i14 < 2; ++i14) {
                    i3 = s;
                    i15 *= i15;
                    i3 = i10;
                    i3 += i3;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i3 + Double.doubleToLongBits(d) + i10 + i11 + l2 + i12 + i13 + i14 +
            i15 + s + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static boolean bMeth(long l, long l1, int i2) {

        float f2=127.719F;
        int i16=-118, i17=-2, i18=-44858, i19=-4, i20=-20976, i21=-27809, i22=-11, iArr[]=new int[N];
        boolean b1=false;
        long l3=-3562681310L;

        FuzzerUtils.init(iArr, -5793);

        i2 *= ((--iArr[(i2 >>> 1) % N]) - (i2 = iMeth(f2, 239)));
        for (i16 = 21; 373 > i16; i16++) {
            i17 += (int)Test.dFld;
            for (i18 = 5; 1 < i18; --i18) {
                switch ((i18 % 1) + 65) {
                case 65:
                    i17 |= (int)l1;
                    i20 = (int)f2;
                    i20 = (int)Test.instanceCount;
                    if (b1) continue;
                    break;
                }
                Test.instanceCount = Test.byFld;
            }
            i21 = 1;
            do {
                i17 = i19;
            } while (++i21 < 5);
            for (l3 = 1; 5 > l3; ++l3) {
                l1 += (l3 * l3);
                f2 -= (float)-2.115760;
            }
        }
        long meth_res = l + l1 + i2 + Float.floatToIntBits(f2) + i16 + i17 + i18 + i19 + i20 + (b1 ? 1 : 0) + i21 + l3
            + i22 + FuzzerUtils.checkSum(iArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=1, i1=-63693, i23=74, i24=58935, i25=49325, i26=14709, i27=-56758, i28=56559, i29=-5;
        float f3=0.357F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -4727668428663579451L);

        for (i = 23; i < 380; ++i) {
            bMeth(Test.instanceCount, Test.instanceCount, -36);
            lArr1[i] += i;
            i1 += (((i * Test.instanceCount) + i) - i);
            for (i23 = 2; 71 > i23; ++i23) {
                f3 -= i;
                Test.dFld -= i23;
            }
        }
        for (i25 = 12; i25 < 295; ++i25) {
            i27 = 1;
            while (++i27 < 89) {
                i26 = i24;
                i1 = i23;
                for (i28 = 1; i28 < 1; i28++) {
                    short s1=-31920;
                    Test.iArrFld[i28 - 1] >>>= i24;
                    i24 += (int)f3;
                    lArr1[i27 + 1] -= i27;
                    switch ((i28 % 8) + 24) {
                    case 24:
                        if (false) {
                            i26 += (int)f3;
                            bFld = bFld;
                            Test.byFld += (byte)Test.instanceCount;
                        } else if (bFld) {
                            i24 *= -85;
                            Test.byFld >>= Test.byFld;
                            s1 = (short)Test.instanceCount;
                        } else if (false) {
                            i24 ^= Test.byFld;
                        } else {
                            i26 += i29;
                            Test.dFld += 118L;
                            Test.iArrFld[i28 + 1] = (int)Test.instanceCount;
                            Test.iArrFld[i27] = i25;
                        }
                        f3 += (((i28 * i27) + i29) - i23);
                        break;
                    case 25:
                        Test.iArrFld[i28] = i;
                        break;
                    case 26:
                        i1 += 6;
                        break;
                    case 27:
                        i24 += (i28 ^ i23);
                    case 28:
                        i29 = i27;
                        break;
                    case 29:
                        Test.instanceCount = Test.instanceCount;
                        break;
                    case 30:
                        i26 += (((i28 * i26) + s1) - f3);
                    case 31:
                        i29 += (i28 * i1);
                        break;
                    default:
                        i1 = i1;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i23 = " + i + "," + i1 + "," + i23);
        FuzzerUtils.out.println("i24 f3 i25 = " + i24 + "," + Float.floatToIntBits(f3) + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 lArr1 = " + i29 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.byFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.byFld);
        FuzzerUtils.out.println("bFld Test.iArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}