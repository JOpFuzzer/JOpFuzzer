// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-158L;
    public static short sFld=25160;
    public double dFld=84.38072;
    public static int iArrFld[][]=new int[N][N];
    public static short sArrFld[]=new short[N];
    public volatile long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -14);
        FuzzerUtils.init(Test.sArrFld, (short)-30640);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i7, long l, int i8) {

        int i9=3, i10=-99, i11=46169, i12=63359, i13=200, i14=188;
        float f=-2.716F;
        double d=-2.5852, d1=1.49569;
        short s=28381;
        boolean b=false;

        i9 = 224;
        while (--i9 > 0) {
            i8 = (int)-1.94F;
        }
        for (f = 9; f < 206; ++f) {
            l = i9;
            if (b) {
                for (i11 = 1; i11 < 8; i11++) {
                    d -= 2.634F;
                    Test.iArrFld[i11 + 1] = Test.iArrFld[i11 - 1];
                    Test.iArrFld[(int)(f - 1)][i11 - 1] += (int)d;
                    Test.instanceCount &= i12;
                    d += i11;
                    s -= (short)i12;
                }
                for (d1 = 1; d1 < 8; ++d1) {
                    Test.iArrFld[(int)(f)][(int)(f)] = (int)d;
                    try {
                        i12 = (i7 % -1699523379);
                        i10 = (i12 % Test.iArrFld[(int)(d1 + 1)][(int)(d1)]);
                        i14 = (Test.iArrFld[(int)(f)][(int)(d1)] % i9);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        long meth_res = i7 + l + i8 + i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + Double.doubleToLongBits(d) + s +
            Double.doubleToLongBits(d1) + i13 + i14 + (b ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i15=54572, i16=-14, i17=135, i18=-43487, i19=45, i20=41967, i21=-15;
        double d2=1.3403;
        long l1=-2659407542126721756L;
        boolean b1=true;

        Test.instanceCount -= lMeth(i15, Test.instanceCount, -163);
        for (i16 = 9; i16 < 198; i16++) {
            i15 = (int)-1.699F;
            Test.instanceCount = -25227;
            for (i18 = 1; 8 > i18; i18++) {
                float f1=1.671F;
                f1 += 3L;
                Test.instanceCount ^= i19;
                for (i20 = i16; 2 > i20; i20++) {
                    Test.instanceCount += (i20 + f1);
                    i15 /= (int)((long)(d2) | 1);
                    i15 += (((i20 * l1) + l1) - Test.sFld);
                    i21 &= (int)Test.instanceCount;
                    if (b1) continue;
                }
            }
            i21 += (i16 * i16);
            Test.iArrFld[i16 - 1] = Test.iArrFld[i16 + 1];
        }
        vMeth_check_sum += i15 + i16 + i17 + i18 + i19 + i20 + i21 + Double.doubleToLongBits(d2) + l1 + (b1 ? 1 : 0);
    }

    public static float fMeth(int i4, int i5, int i6) {

        int i22=-13, i23=-29335, i24=54879, i25=33813, i26=-9422;
        boolean b2=true;
        long l2=-14L;

        i5 = Test.sFld;
        vMeth();
        for (i22 = 12; 321 > i22; i22++) {
            i4 = (int)Test.instanceCount;
            i24 = 1;
            do {
                i25 = 1;
                while (++i25 < 1) {
                    if (b2) continue;
                    i5 += (int)Test.instanceCount;
                    i4 <<= Test.sFld;
                    i6 = (int)-4433878572595081689L;
                    i23 -= i5;
                }
                i26 = 1;
                while (++i26 < 1) {
                    i6 = (int)l2;
                    i6 += (-49206 + (i26 * i26));
                    i23 += (int)(-3.304F + (i26 * i26));
                }
            } while (++i24 < 5);
        }
        long meth_res = i4 + i5 + i6 + i22 + i23 + i24 + i25 + (b2 ? 1 : 0) + i26 + l2;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=61, i1=-3, i2=32913, i3=0, i27=-17144, i28=-10316, i29=-25218, i30=-13, i32=13, i33=-3, iArr[]=new int[N];
        byte by=32;
        boolean b3=false;
        float f2=0.135F;

        FuzzerUtils.init(iArr, -213);

        for (i = 12; i < 366; i++) {
            for (i2 = i; i2 < 71; ++i2) {
                i3 = (int)fMeth(-57118, i3, i1);
                Test.iArrFld[i + 1][i2 + 1] = (int)Test.instanceCount;
                i1 = i3;
                by += (byte)(i2 * i3);
                for (i27 = 1; i27 < 1; ++i27) {
                    try {
                        i28 = (i27 % -57614);
                        i28 = (Test.iArrFld[i - 1][i + 1] % i1);
                        i3 = (i / -1830061082);
                    } catch (ArithmeticException a_e) {}
                    i28 -= -4;
                }
                i1 = (int)dFld;
                Test.instanceCount >>= i3;
                Test.sArrFld[i] -= (short)i;
                i1 <<= by;
            }
            i28 = i28;
            for (i29 = i; i29 < 71; i29++) {
                Test.sArrFld[i] = (short)i28;
                Test.iArrFld[i29 - 1][i - 1] += i3;
                i28 = i29;
                lArrFld[i29 + 1][i29 - 1] >>>= i27;
                b3 = b3;
            }
        }
        i30 = i3;
        i30 = i29;
        for (int i31 : iArr) {
            i1 = -7;
            Test.sFld -= (short)i3;
            lArrFld[(i28 >>> 1) % N][(i31 >>> 1) % N] += i28;
        }
        for (i32 = 10; i32 < 264; i32++) {
            i33 = i2;
            Test.instanceCount -= (long)f2;
            Test.instanceCount = (long)f2;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 by i27 = " + i3 + "," + by + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("b3 i32 i33 = " + (b3 ? 1 : 0) + "," + i32 + "," + i33);
        FuzzerUtils.out.println("f2 iArr = " + Float.floatToIntBits(f2) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld dFld = " + Test.instanceCount + "," + Test.sFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.iArrFld Test.sArrFld lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.sArrFld) + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
