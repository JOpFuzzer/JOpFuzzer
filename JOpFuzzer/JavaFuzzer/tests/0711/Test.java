// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:57 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-30813L;
    public static byte byFld=-123;
    public static float fFld=2.675F;
    public static int iFld=-11;
    public short sFld=63;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -88.409F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(boolean b, double d1, int i4) {

        int i5=79, i6=-26389, i7=5, i8=55377, i9=-14, i10=-213;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1323674160L);

        for (i5 = 7; 178 > i5; ++i5) {
            i6 = -188;
            d1 += i6;
            for (i7 = i5; i7 < 9; ++i7) {
                i4 >>>= i7;
                i8 *= i6;
                i4 = i5;
                i4 >>= -2;
                d1 -= i7;
                for (i9 = 1; 1 > i9; i9++) {
                    lArr[i7 - 1] *= Test.byFld;
                    Test.instanceCount += (long)d1;
                }
                i10 -= Test.byFld;
                i6 += (i7 | i6);
                d1 = i5;
            }
        }
        vMeth2_check_sum += (b ? 1 : 0) + Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 + i8 + i9 + i10 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(short s, int i3, double d) {

        int i11=42692, i12=-55411, i13=46192, i14=-215, i15=210, i16=1144, iArr[]=new int[N], iArr1[]=new int[N];

        FuzzerUtils.init(iArr, -8);
        FuzzerUtils.init(iArr1, -13);

        vMeth2(false, d, i3);
        Test.instanceCount -= i3;
        for (i11 = 1; i11 < 313; i11++) {
            i3 = (int)d;
            iArr[i11] += i11;
        }
        for (i13 = 3; i13 < 239; ++i13) {
            for (i15 = 7; i15 > i13; i15--) {
                iArr[i15 - 1] *= i3;
                iArr1[i15 - 1] -= i14;
                iArr1 = iArr1;
                Test.instanceCount = Test.instanceCount;
                i3 += i15;
                i12 *= -79;
                i12 += (int)Test.fFld;
                iArr[i13 - 1] += (int)119.200F;
            }
        }
        vMeth1_check_sum += s + i3 + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i2, long l) {

        short s1=-5034;
        int i17=-9, i18=0, i19=27046, i20=-12, i21=-28813;
        double d2=2.100590;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -5L);

        vMeth1(s1, i17, d2);
        lArr1[(i17 >>> 1) % N] = (long)Test.fFld;
        Test.instanceCount = (long)Test.fFld;
        for (i18 = 5; 144 > i18; ++i18) {
            for (i20 = i18; i20 < 11; ++i20) {
                i2 = (int)d2;
                i2 &= Test.byFld;
                d2 += -2;
                lArr1[i18 - 1] >>= 6L;
                i19 += (((i20 * i21) + Test.instanceCount) - s1);
                switch (((i18 % 1) * 5) + 15) {
                case 19:
                    Test.iFld = i20;
                    Test.fArrFld[i20 + 1] += Test.fFld;
                    i19 = 0;
                    if (i19 != 0) {
                        vMeth_check_sum += i2 + l + s1 + i17 + Double.doubleToLongBits(d2) + i18 + i19 + i20 + i21 +
                            FuzzerUtils.checkSum(lArr1);
                        return;
                    }
                    break;
                default:
                    l += (long)Test.fFld;
                }
            }
        }
        vMeth_check_sum += i2 + l + s1 + i17 + Double.doubleToLongBits(d2) + i18 + i19 + i20 + i21 +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-199, i1=-199, i22=-2, i23=-48, i24=-64097, i25=7, i26=46550, iArr2[]=new int[N];
        boolean b1=false;
        long lArr2[][]=new long[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr2, -4603128245424254071L);
        FuzzerUtils.init(iArr2, 13);
        FuzzerUtils.init(dArr, -3.12779);

        for (i = 10; i < 160; ++i) {
            vMeth(Test.iFld, -179L);
            Test.instanceCount += i;
            lArr2[i][i - 1] &= i;
            for (i22 = 9; 167 > i22; i22++) {
                i1 += (((i22 * i22) + i22) - i1);
                b1 = b1;
                i24 = 1;
                do {
                    i23 = i22;
                } while (++i24 < 2);
                Test.iFld -= (int)Test.fFld;
                try {
                    Test.iFld = (Test.iFld % 33152);
                    i1 = (i24 % 36127);
                    Test.iFld = (i1 % i);
                } catch (ArithmeticException a_e) {}
                i25 = 1;
                do {
                    i23 -= (int)Test.fFld;
                    i1 ^= (int)Test.instanceCount;
                    iArr2[i25 + 1] >>= Test.iFld;
                    sFld += (short)(i25 ^ (long)Test.fFld);
                    i23 += i25;
                    Test.byFld *= (byte)i25;
                    i23 <<= i1;
                    Test.iFld >>>= -34306;
                    i1 += (i25 ^ i25);
                    b1 = b1;
                } while (++i25 < 2);
                i26 = 1;
                while (++i26 < 2) {
                    Test.instanceCount <<= i;
                    lArr2[i22 - 1][i] <<= i24;
                    try {
                        iArr2[i26 + 1] = (iArr2[i - 1] / i22);
                        iArr2[i + 1] = (i22 / -16);
                        iArr2[i - 1] = (9008 / i22);
                    } catch (ArithmeticException a_e) {}
                    switch ((((i23 >>> 1) % 6) * 5) + 103) {
                    case 104:
                        Test.instanceCount |= i26;
                        break;
                    case 129:
                        iArr2[i22] += i23;
                        i23 += 211;
                        break;
                    case 117:
                        b1 = b1;
                        break;
                    case 105:
                        b1 = b1;
                        break;
                    case 128:
                        Test.instanceCount = Test.instanceCount;
                    case 108:
                        dArr = dArr;
                        break;
                    default:
                        Test.fFld += i26;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i22 = " + i + "," + i1 + "," + i22);
        FuzzerUtils.out.println("i23 b1 i24 = " + i23 + "," + (b1 ? 1 : 0) + "," + i24);
        FuzzerUtils.out.println("i25 i26 lArr2 = " + i25 + "," + i26 + "," + FuzzerUtils.checkSum(lArr2));
        FuzzerUtils.out.println("iArr2 dArr = " + FuzzerUtils.checkSum(iArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld sFld Test.fArrFld = " + Test.iFld + "," + sFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

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