// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:55 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-40011L;
    public int iFld=33278;
    public static double dFld=72.103608;
    public static boolean bFld=false;
    public static int iFld1=12;
    public static float fFld=-2.674F;
    public static int iArrFld[][]=new int[N][N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 13);
        FuzzerUtils.init(Test.lArrFld, -89L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, float f, int i7) {

        int i8=-53, i9=-14, iArr[]=new int[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, -1);
        FuzzerUtils.init(sArr, (short)19935);

        for (i8 = 4; i8 < 299; ++i8) {
            i9 += i6;
            if (Test.bFld) {
                Test.lArrFld[i8] += (long)Test.dFld;
            } else if (Test.bFld) {
                Test.lArrFld[i8 + 1] >>= Test.instanceCount;
                i6 += i8;
                i6 -= i6;
                i7 >>= i8;
            } else {
                if (Test.bFld) break;
                Test.iFld1 += Test.iFld1;
            }
            Test.iFld1 *= 238;
            sArr[i8 + 1] += (short)i9;
            i6 += i8;
            i7 = (int)Test.instanceCount;
            i6 += (i8 ^ i6);
        }
        vMeth1_check_sum += i6 + Float.floatToIntBits(f) + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth() {

        short s=-16843;
        double d=116.25609, dArr[]=new double[N];
        int i3=160, i4=50294, i5=-63, i11=-7, i12=220, i13=-10421, i14=-2, i15=-17140;

        FuzzerUtils.init(dArr, -2.51750);

        dArr[(223 >>> 1) % N] = (++Test.instanceCount);
        Test.instanceCount <<= (long)(((s + -208) - (++d)) - ((-14444 * (++i3)) + Test.iArrFld[(i3 >>> 1) % N][(i3 >>>
            1) % N]));
        for (i4 = 11; 194 > i4; ++i4) {
            i3 *= (int)(i4 * (--d));
            vMeth1(i5, Test.fFld, i4);
            i3 -= (int)d;
            Test.iArrFld[i4] = Test.iArrFld[i4 - 1];
            switch ((i4 % 4) + 30) {
            case 30:
                for (i11 = 1; i11 < 9; ++i11) {
                    Test.instanceCount = 32332L;
                    for (i13 = 1; 2 > i13; i13++) {
                        i14 += (i13 * i13);
                        Test.iFld1 += (((i13 * i4) + Test.iFld1) - i14);
                        Test.instanceCount -= i4;
                        Test.instanceCount = i13;
                    }
                }
            case 31:
                i14 += 9;
                break;
            case 32:
                i5 <<= 9568;
                break;
            case 33:
                Test.fFld -= i15;
                break;
            default:
                i5 -= i13;
            }
        }
        vMeth_check_sum += s + Double.doubleToLongBits(d) + i3 + i4 + i5 + i11 + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static long lMeth(int i, int i1, int i2) {

        long l=7528847463511010768L;
        int i16=-38, i17=-17, i18=-34801, i19=2;
        float f1=0.262F;

        vMeth();
        for (l = 252; 6 < l; l -= 2) {
            i2 *= i2;
            for (i17 = 1; i17 < 13; i17++) {
                i19 = 1;
                while (++i19 < 2) {
                    byte by=61;
                    Test.iArrFld[(int)(l - 1)][i17 + 1] >>>= i2;
                    by += (byte)(i19 - Test.instanceCount);
                    Test.iArrFld[i17][(int)(l - 1)] = i1;
                    i2 = 72;
                    i += Test.iFld1;
                    i1 *= Test.iFld1;
                    i2 += (int)f1;
                    Test.instanceCount /= (by | 1);
                }
                Test.iArrFld[(int)(l)][i17 - 1] += i;
            }
            if (Test.bFld) break;
        }
        long meth_res = i + i1 + i2 + l + i16 + i17 + i18 + i19 + Float.floatToIntBits(f1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by1=122;
        int i20=-186, i21=-3, i22=-111, i23=38, i24=-51237, i25=10, i26=-8708, i27=44712;
        short s1=10944;

        Test.instanceCount = (long)(Float.intBitsToFloat((int)(9999 + (iFld - -3464416316L))) % ((-(iFld * iFld)) | 1));
        iFld -= (int)lMeth(Test.iFld1, Test.iFld1, Test.iFld1);
        Test.iFld1 /= 238;
        Test.iArrFld[(iFld >>> 1) % N][(iFld >>> 1) % N] = by1;
        for (i20 = 9; i20 < 327; i20++) {
            i21 <<= i20;
            iFld = iFld;
            iFld -= (int)-2.640F;
            for (i22 = 3; 79 > i22; i22++) {
                if (true) {
                    for (i24 = 1; i24 < 2; ++i24) {
                        Test.instanceCount -= i20;
                        Test.instanceCount = iFld;
                        Test.iArrFld[i20][i24 + 1] <<= i23;
                        i21 += (i24 * i24);
                        Test.iArrFld[i22][i20 + 1] += 52554;
                        iFld %= (int)(i20 | 1);
                        s1 = (short)Test.instanceCount;
                        i21 -= (int)108.97978;
                        i25 += (i24 ^ s1);
                        iFld += (((i24 * i25) + i22) - Test.fFld);
                    }
                    Test.iFld1 = i21;
                } else {
                    if (Test.bFld) continue;
                    for (i26 = 1; i26 < 2; i26++) {
                        i27 += (((i26 * Test.fFld) + Test.fFld) - i26);
                        Test.fFld = Test.instanceCount;
                        Test.instanceCount += (i26 * i26);
                    }
                }
                iFld >>= (int)Test.instanceCount;
                Test.iFld1 += i23;
                i21 -= i22;
            }
        }

        FuzzerUtils.out.println("by1 i20 i21 = " + by1 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 s1 i26 = " + i25 + "," + s1 + "," + i26);
        FuzzerUtils.out.println("i27 = " + i27);

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld Test.iFld1 Test.fFld = " + (Test.bFld ? 1 : 0) + "," + Test.iFld1 + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}