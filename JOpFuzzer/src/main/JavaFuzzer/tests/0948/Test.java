// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1874788525807602172L;
    public static boolean bFld=true;
    public static int iFld=-43226;
    public static short sFld=27612;
    public static float fFld=-2.176F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 12191);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(float f, long l1) {

        short s=16827;
        int i4=34, i6=60914, i7=12;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2L);

        s -= (short)i4;
        for (int i5 : Test.iArrFld) {
            i4 = i4;
        }
        for (long l2 : lArr) {
            f *= i4;
            i4 <<= i4;
            for (i6 = 1; 4 > i6; ++i6) {
                i4 *= (int)l2;
                i7 += 61183;
                s = (short)-129;
                i7 += (i6 | l1);
                l1 += i6;
                i7 = i7;
                if (b) continue;
                i4 += (((i6 * Test.instanceCount) + i4) - l1);
            }
        }
        long meth_res = Float.floatToIntBits(f) + l1 + s + i4 + i6 + i7 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i, int i1, long l) {

        int i2=-3, i3=-124, i8=2, i9=-65200, i10=-4, i11=-60884, i12=4441;
        float f1=-30.742F;

        l <<= i1;
        for (i2 = 169; 4 < i2; i2--) {
            i3 -= (int)(((4105595833572357767L - (3 + (-43717 * (Test.instanceCount * Test.instanceCount)))) + (i3 *
                i2)) * ((-iMeth(f1, l)) + i3));
            try {
                Test.iArrFld[i2 + 1] = (Test.iArrFld[i2] / i3);
                i1 = (i3 / i3);
                i = (-55693 % Test.iArrFld[i2]);
            } catch (ArithmeticException a_e) {}
            i8 *= i;
            for (i9 = 10; i9 > 1; i9--) {
                i8 *= i10;
                i8 &= i2;
                for (i11 = 1; i11 < 2; ++i11) {
                    i3 = 25702;
                    if (Test.bFld) continue;
                    f1 -= f1;
                    l += i9;
                    i8 = i3;
                    i3 += (i11 * i12);
                }
            }
        }
        vMeth1_check_sum += i + i1 + l + i2 + i3 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12;
    }

    public static void vMeth() {

        int i13=51371, i14=-63069, i15=-2, i16=249, i17=0;
        double d=-61.75660;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -60.129F);

        vMeth1(i13, i13, Test.instanceCount);
        for (i14 = 278; 12 < i14; --i14) {
            i16 = 1;
            do {
                i13 += Test.iFld;
                Test.sFld += (short)(((i16 * Test.instanceCount) + i16) - i14);
                fArr[i16] = (float)-16.6285;
                i17 = 1;
                while (++i17 < 1) {
                    Test.instanceCount += (((i17 * Test.instanceCount) + i17) - i16);
                    i13 += (i17 - i13);
                    switch ((i14 % 5) + 126) {
                    case 126:
                        Test.iFld += (i17 + i17);
                        break;
                    case 127:
                        Test.iArrFld[i17 + 1] = Test.iFld;
                        i13 += (int)d;
                        break;
                    case 128:
                        if (Test.bFld) continue;
                        Test.instanceCount = i13;
                        break;
                    case 129:
                        Test.bFld = true;
                        break;
                    case 130:
                        i15 -= -18439;
                    default:
                        i15 = 77;
                    }
                }
            } while (++i16 < 6);
        }
        vMeth_check_sum += i13 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i18=-11, i19=-1, i20=73, i21=-58150, i22=21370, i23=59, i24=139, i25=157;
        byte by=1;
        double d1=0.104460;
        long lArr1[]=new long[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(lArr1, 498733215L);
        FuzzerUtils.init(fArr1, -97.80F);

        vMeth();
        Test.iArrFld[(Test.iFld >>> 1) % N] <<= Test.iFld;
        Test.iFld >>= Test.iFld;
        Test.iFld = Test.iFld;
        Test.iFld = -44128;
        Test.iFld >>= Test.iFld;
        Test.iFld -= (int)Test.fFld;
        Test.bFld = Test.bFld;
        Test.iFld = Test.iFld;
        lArr1[(65 >>> 1) % N] = -9185716820603054428L;
        for (i18 = 2; i18 < 340; ++i18) {
            i19 = Test.iFld;
            for (i20 = i18; i20 < 74; i20++) {
                Test.iArrFld[i20 - 1] = by;
            }
            Test.instanceCount -= -2;
            i21 = Test.iFld;
            d1 += i18;
            for (i22 = i18; i22 < 74; ++i22) {
                for (i24 = 1; i24 < 1; ++i24) {
                    int i26=-24745;
                    Test.fFld = Test.instanceCount;
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount <<= i26;
                    Test.iArrFld[i22 + 1] += Test.sFld;
                    fArr1[i18 + 1] += Test.fFld;
                    i21 = -6132;
                    i23 = (int)-22L;
                }
                Test.iFld = i24;
                d1 = i21;
                i25 += (((i22 * Test.fFld) + i18) - i20);
                Test.iFld -= (int)Test.instanceCount;
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 by d1 = " + i21 + "," + by + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 lArr1 fArr1 = " + i25 + "," + FuzzerUtils.checkSum(lArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.iFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.sFld Test.fFld Test.iArrFld = " + Test.sFld + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
