// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=174L;
    public static float fFld=1.533F;
    public static boolean bFld=true;
    public static byte byFld=53;
    public double dFld=66.3210;
    public static int iFld=-10672;
    public static volatile int iArrFld[]=new int[N];
    public byte byArrFld[]=new byte[N];
    public static volatile boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -195);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2) {

        int i3=2, i4=-8, i5=52096, i6=5, i7=-55137;
        double d=-32.485;
        byte by=-99;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -103.724F);

        i3 = 385;
        while ((i3 -= 2) > 0) {
            for (i4 = 1; i4 < 8; i4++) {
                Test.fFld += (i4 * i5);
                switch ((i3 % 6) + 54) {
                case 54:
                    fArr = fArr;
                    i5 <<= i3;
                    i5 >>= i4;
                    for (i6 = i4; 2 > i6; ++i6) {
                        i2 <<= i5;
                        i5 = (int)Test.fFld;
                        switch ((((i6 >>> 1) % 5) * 5) + 120) {
                        case 141:
                            i5 &= i4;
                            break;
                        case 125:
                            Test.instanceCount ^= i5;
                            i2 += i6;
                            break;
                        case 144:
                            i7 = i4;
                        case 131:
                            Test.instanceCount = 55476;
                            break;
                        case 142:
                            i2 = (int)Test.instanceCount;
                            break;
                        default:
                            d *= Test.instanceCount;
                        }
                    }
                    break;
                case 55:
                    Test.instanceCount = i3;
                    break;
                case 56:
                    d -= i3;
                    break;
                case 57:
                    by += (byte)Test.fFld;
                    break;
                case 58:
                case 59:
                    i5 += (((i4 * i3) + i3) - i4);
                    break;
                default:
                    i2 -= i4;
                }
            }
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {

        int i8=12, i9=9237, i10=10, i11=11;
        double d1=-1.38543, d2=-1.4372;

        vMeth1(-4);
        for (i8 = 23; i8 < 390; i8++) {
            d1 = 1;
            while (++d1 < 5) {
                int i12=19969;
                i9 >>>= i9;
                for (i10 = (int)(d1); i10 < 1; ++i10) {
                    i11 = i8;
                }
                if (Test.bFld) break;
                if (Test.bFld) {
                    i9 += i8;
                    Test.iArrFld[i8 + 1] = Test.byFld;
                } else if (Test.bFld) {
                    Test.fFld -= -79;
                } else if (true) {
                    Test.fFld -= i10;
                    Test.instanceCount *= 13125L;
                    vMeth_check_sum += i8 + i9 + Double.doubleToLongBits(d1) + i10 + i11 + Double.doubleToLongBits(d2);
                    return;
                } else {
                    i12 += (int)(((d1 * i8) + i11) - i11);
                    d2 += i8;
                }
            }
        }
        vMeth_check_sum += i8 + i9 + Double.doubleToLongBits(d1) + i10 + i11 + Double.doubleToLongBits(d2);
    }

    public static void vSmallMeth(int i1, float f) {


        vMeth();
        Test.iArrFld[(i1 >>> 1) % N] += 22;
        vSmallMeth_check_sum += i1 + Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        int i=-195, i13=-14, i14=11414, i15=246, i16=221, i17=3, i18=-86, i19=-34, i20=-10;
        short s=-2309;
        boolean b=true;
        long l=-11L;

        i = 1;
        do {
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(i, Test.fFld);
            byArrFld[i + 1] >>= (byte)Test.instanceCount;
        } while (++i < 246);
        for (i13 = 21; i13 < 393; ++i13) {
            for (i15 = i13; i15 < 68; ++i15) {
                dFld *= 4;
                for (i17 = i13; 1 > i17; ++i17) {
                    Test.bArrFld[i13][i15 + 1] = Test.bFld;
                    i18 ^= (int)-12L;
                    i18 = (int)-7L;
                    Test.iArrFld[i13] *= i;
                    s = (short)i16;
                    Test.fFld += i17;
                    i18 *= i14;
                }
                Test.bArrFld[i15 - 1][i15] = b;
            }
            i16 += (i13 * i13);
            i14 = -179;
            Test.instanceCount += 32955L;
        }
        Test.fFld = 43272;
        Test.fFld = Test.byFld;
        for (i19 = 15; i19 < 291; i19++) {
            i20 += (i19 | i14);
            i14 >>= i15;
            Test.instanceCount -= i15;
            b = b;
            l = 1;
            while (++l < 91) {
                i18 >>= i17;
            }
            i14 >>= Test.iFld;
        }
        i14 -= (int)-56.703F;
        Test.instanceCount = i;

        FuzzerUtils.out.println("i i13 i14 = " + i + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 s b = " + i18 + "," + s + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i19 i20 l = " + i19 + "," + i20 + "," + l);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.byFld dFld Test.iFld = " + Test.byFld + "," + Double.doubleToLongBits(dFld) + ","
            + Test.iFld);
        FuzzerUtils.out.println("Test.iArrFld byArrFld Test.bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(byArrFld) + "," + FuzzerUtils.checkSum(Test.bArrFld));

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
