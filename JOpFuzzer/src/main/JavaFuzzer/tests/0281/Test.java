// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:47 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=224L;
    public int iFld=-174;
    public static float fFld=-2.613F;
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 5L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=0, i4=-12, i5=13, i6=146, i7=6, i8=92, i9=-179, i10=48, i11=3, iArr[]=new int[N];
        double d1=0.34797;
        boolean b=true;
        short s1=-22038;
        float f=115.944F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(lArr, 476485026L);

        for (i3 = 18; i3 < 303; i3++) {
            for (d1 = 1; d1 < 6; ++d1) {
                for (i6 = 2; i6 > d1; --i6) {
                    if (b) break;
                    i7 *= (int)Test.instanceCount;
                    Test.instanceCount >>= 14;
                }
            }
            i4 = i6;
            for (i8 = 1; i8 < 6; ++i8) {
                for (i10 = 1; i10 < 2; i10++) {
                    iArr[i8] = i3;
                    s1 += (short)(((i10 * i11) + i4) - i6);
                    i5 += (i10 - i7);
                }
            }
            s1 += (short)i8;
            f += Test.instanceCount;
            lArr[i3 + 1] = Test.instanceCount;
        }
        vMeth1_check_sum += i3 + i4 + Double.doubleToLongBits(d1) + i5 + i6 + i7 + (b ? 1 : 0) + i8 + i9 + i10 + i11 +
            s1 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i2, long l, long l1) {

        float f1=0.364F;
        int i12=13, i13=-11;

        i2 <<= (int)(--Test.lArrFld[(i2 >>> 1) % N]);
        vMeth1();
        f1 += i2;
        for (i12 = 1; i12 < 333; ++i12) {
            l1 <<= i13;
        }
        i2 = i2;
        i2 <<= (int)-53707L;
        i13 &= i2;
        vMeth_check_sum += i2 + l + l1 + Float.floatToIntBits(f1) + i12 + i13;
    }

    public static void vSmallMeth() {

        double d=53.46497;
        int i1=-11;

        d -= i1;
        vMeth(-64487, Test.instanceCount, Test.instanceCount);
        vSmallMeth_check_sum += Double.doubleToLongBits(d) + i1;
    }

    public void mainTest(String[] strArr1) {

        short s=25923;
        int i=0, i14=-222, i15=-113, i16=-2, i17=0, i18=3279, i19=-7971, i20=226, i21=-236, i22=-220;
        byte by=-104;
        double d2=-7.124114;
        float f2=-2.154F;

        s -= (short)i;
        for (int smallinvoc=0; smallinvoc<128; smallinvoc++) vSmallMeth();
        Test.instanceCount = s;
        Test.lArrFld[(i >>> 1) % N] <<= Test.instanceCount;
        try {
            iArrFld[(i >>> 1) % N] = by;
            i *= s;
            i *= s;
            for (i14 = 10; i14 < (257 + 400); ++i14) {
                Test.instanceCount += (i14 * s);
                Test.instanceCount <<= i;
                s /= (short)(i14 | 1);
                d2 = Test.instanceCount;
                i15 += (i14 ^ i);
            }
            for (i16 = 12; i16 < (370 + 400); i16++) {
                Test.instanceCount = -246;
                for (f2 = 1; f2 < (63 + 400); f2++) {
                    iArrFld[(int)(f2)] -= -167;
                    for (i19 = 1; i19 < (1 + 400); i19++) {
                        Test.instanceCount += (i19 * i19);
                    }
                    Test.lArrFld[i16] ^= i19;
                    i15 += (int)(f2 * f2);
                    Test.instanceCount >>>= i18;
                    for (i21 = 1; i21 < 1; i21 += 3) {
                        d2 += Test.instanceCount;
                        i20 %= (int)(i16 | 1);
                        switch ((i16 % 9) + 52) {
                        case 52:
                            i18 *= -9;
                            iArrFld[i16 + 1] &= i21;
                            iArrFld[(int)(f2 - 1)] *= (int)d2;
                            break;
                        case 53:
                            iArrFld[(int)(f2)] *= -36123;
                            break;
                        case 54:
                        case 55:
                            Test.instanceCount += (i21 * i21);
                            break;
                        case 56:
                            by *= (byte)3;
                            break;
                        case 57:
                            iArrFld[i21] = -31398;
                            break;
                        case 58:
                            Test.fFld += (((i21 * Test.instanceCount) + Test.instanceCount) - i14);
                        case 59:
                            i22 = i16;
                            break;
                        case 60:
                            Test.instanceCount = -10;
                            break;
                        default:
                            iFld = i21;
                        }
                    }
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            d2 = i22;
        }

        FuzzerUtils.out.println("s i by = " + s + "," + i + "," + by);
        FuzzerUtils.out.println("i14 i15 d2 = " + i14 + "," + i15 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i16 i17 f2 = " + i16 + "," + i17 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 = " + i21 + "," + i22);

        FuzzerUtils.out.println("Test.instanceCount iFld Test.fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.lArrFld iArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
