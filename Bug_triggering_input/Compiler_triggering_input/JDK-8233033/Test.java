// Generated by Java* Fuzzer test generator (1.0.001). Tue Oct 22 06:00:34 2019
public class Test {

    public static final int N = 400;

    public static long instanceCount=10L;
    public static float fFld=-1.209F;
    public static short sFld=-15465;
    public static int iFld=-10;
    public static byte byFld=97;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];
    public double dArrFld[]=new double[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 23.149F);
        FuzzerUtils.init(Test.iArrFld, -58897);
        FuzzerUtils.init(Test.lArrFld, -46643L);
        FuzzerUtils.init(Test.sArrFld, (short)1925);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1, int i5) {

        int i6=111, i7=-7, i8=57, i9=32849, i10=101;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)20920);

        for (i6 = 5; i6 < 327; i6++) {
            if (i5 != 0) {
                vMeth1_check_sum += Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + i9 + i10 +
                    FuzzerUtils.checkSum(sArr);
                return;
            }
            Test.instanceCount = i7;
            try {
                Test.iArrFld[i6 + 1] = (6512 % i6);
                i5 = (Test.iArrFld[i6 + 1] % -12267);
                i7 = (i7 % 856413882);
            } catch (ArithmeticException a_e) {}
        }
        i5 = i7;
        Test.instanceCount = i5;
        for (i8 = 3; i8 < 186; ++i8) {
            double d1=0.17171;
            Test.instanceCount -= (long)f1;
            f1 += (-168 + (i8 * i8));
            i5 %= (int)((long)(d1) | 1);
            i10 = 1;
            do {
                i5 = i10;
                i5 += (i10 * i10);
                sArr[i10 + 1] >>= (short)i10;
                i7 -= i9;
            } while (++i10 < 9);
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth() {

        int i11=-52095, i12=-18, i13=50922, i14=15, i15=-35066, i16=49851, i17=-16767, i18=-50;
        short s=20662;
        boolean b=true;

        vMeth1(Test.fFld, i11);
        i12 = 1;
        while (++i12 < 172) {
            s = (short)-141;
        }
        i11 += i11;
        for (i13 = 8; i13 < 197; i13++) {
            for (i15 = 1; i15 < 8; ++i15) {
                Test.lArrFld[i13 - 1] -= (long)Test.fFld;
                i11 += (int)(-3159867514L + (i15 * i15));
                i16 += (i15 * i11);
                for (i17 = 2; i17 > i13; --i17) {
                    double d2=-115.34765;
                    switch ((((i12 >>> 1) % 8) * 5) + 39) {
                    case 56:
                        if (b) continue;
                        Test.iArrFld[i13] = (int)d2;
                    case 65:
                        i18 += i17;
                        Test.instanceCount += i17;
                        break;
                    case 57:
                        i11 %= (int)((long)(d2) | 1);
                    case 50:
                        Test.iArrFld[i13 - 1] >>= i12;
                    case 55:
                        i14 &= (int)Test.instanceCount;
                        break;
                    case 40:
                        i16 -= -236;
                        break;
                    case 58:
                        i14 = -4;
                    case 43:
                        Test.lArrFld = Test.lArrFld;
                        break;
                    }
                }
            }
        }
        long meth_res = i11 + i12 + s + i13 + i14 + i15 + i16 + i17 + i18 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2, float f) {

        int i3=-8, i4=-35577, i19=35860, i20=-27806;
        byte by=114;
        double d3=-1.30170;

        for (i3 = 19; i3 < 378; ++i3) {
            i4 += (i4 >> iMeth());
        }
        Test.iArrFld[(i4 >>> 1) % N] = i3;
        by *= (byte)i2;
        i2 += i3;
        for (i19 = 237; i19 > 14; --i19) {
            boolean b1=false;
            i4 += (int)f;
            try {
                Test.iArrFld[i19 + 1] = (i3 / -100);
                i2 = (i2 % i4);
                i20 = (i2 / 37102);
            } catch (ArithmeticException a_e) {}
            i20 += -16629;
            i20 >>= i19;
            Test.instanceCount += Test.sFld;
            Test.lArrFld[i19] -= (long)d3;
            Test.lArrFld = Test.lArrFld;
            b1 = b1;
        }
        Test.iArrFld[(Test.iFld >>> 1) % N] = i20;
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + i3 + i4 + by + i19 + i20 + Double.doubleToLongBits(d3);
    }

    public void mainTest(String[] strArr1) {

        int i=-20, i1=5174, i21=-13, i22=-209, i24=2696, i25=-1, i26=-70;
        double d=-126.53088;
        long l=-1273628603L;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)71);

        Test.instanceCount = Math.min(Math.max((int)(Test.instanceCount + 11794), i), i);
        i1 = 1;
        do {
            Test.fArrFld[i1 + 1] -= (float)(--d);
            vMeth(i1, -2.661F);
            Test.byFld -= (byte)Test.instanceCount;
            i /= -146;
            byArr[i1] -= (byte)Test.instanceCount;
            Test.iFld = i;
            Test.instanceCount *= (long)1.10989;
            i += 13;
            Test.iFld += Test.iFld;
            Test.iFld = i;
        } while (++i1 < 289);
        i += Test.iFld;
        for (i21 = 13; i21 < 234; i21++) {
            Test.lArrFld[i21 + 1] = Test.instanceCount;
            Test.iArrFld[i21 + 1] += (int)Test.fFld;
            i22 += (1457 + (i21 * i21));
            i24 = 114;
            while (--i24 > 0) {
                for (l = 1; l < 1; l++) {
                    Test.iFld -= i22;
                }
                Test.iFld += -7;
                i22 += i24;
                i25 = i24;
                i25 *= -2818;
                switch ((((i21 >>> 1) % 6) * 5) + 102) {
                case 120:
                    i26 = 1;
                    while ((i26 += 3) < 1) {
                        Test.fFld *= l;
                        Test.lArrFld = FuzzerUtils.long1array(N, (long)-4L);
                        i22 *= i21;
                        Test.lArrFld[i21] -= i22;
                    }
                    break;
                case 125:
                case 106:
                    dArrFld[i24 + 1] = i24;
                    break;
                case 103:
                    Test.instanceCount = i24;
                    break;
                case 116:
                    Test.iFld *= i1;
                    break;
                case 119:
                    Test.sArrFld[i21 + 1] = (short)d;
                    break;
                default:
                    Test.iFld >>= i1;
                }
            }
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i21 i22 i24 = " + i21 + "," + i22 + "," + i24);
        FuzzerUtils.out.println("l i25 i26 = " + l + "," + i25 + "," + i26);
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.iFld Test.byFld Test.fArrFld = " + Test.iFld + "," + Test.byFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
