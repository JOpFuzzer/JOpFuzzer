// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:57 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=40197L;
    public double dFld=0.40353;
    public static int iFld=-106;
    public static volatile float fFld=120.437F;
    public static short sFld=-23618;
    public static byte byFld=92;
    public int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 2841349808L);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public double dMeth(int i5) {

        int i6=-9, i7=12;

        for (i6 = 8; i6 < 129; ++i6) {
            iArrFld[i6 - 1] = (i5 + (-(i5 * i7)));
        }
        long meth_res = i5 + i6 + i7;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1() {


        Test.instanceCount += Test.iFld;
        vMeth1_check_sum = 0;
    }

    public static float fMeth(int i8) {

        int i9=26035, i10=83, i11=4, i12=45379, i13=2, i14=-197, i15=47, iArr[]=new int[N];
        short sArr[][]=new short[N][N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(sArr, (short)-28253);
        FuzzerUtils.init(iArr, -27898);
        FuzzerUtils.init(lArr1, -1976458574223855247L);

        i8 %= (int)((++sArr[(i8 >>> 1) % N][(i8 >>> 1) % N]) | 1);
        i9 = 1;
        do {
            vMeth1();
            i8 |= (int)Test.instanceCount;
            i8 <<= i8;
            try {
                i8 = (-59996 % iArr[i9]);
                i8 = (i9 / -4760);
                i8 = (i8 / Test.iFld);
            } catch (ArithmeticException a_e) {}
        } while (++i9 < 296);
        for (i10 = 18; i10 < 387; ++i10) {
            for (i12 = 1; i12 < 5; i12++) {
                i13 += (i12 * i12);
                for (i14 = i10; i14 < 2; i14++) {
                    i15 = (int)Test.instanceCount;
                    lArr1 = lArr1;
                    Test.iFld = -157;
                    Test.fFld += ((long)i14 | (long)i12);
                    i11 >>= (int)-2L;
                }
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth(double d) {

        int i2=29745, i3=10, i4=9, i16=94, i17=5146;
        byte by=-123;
        boolean b=false;
        long lArr[]=new long[N];
        short sArr1[]=new short[N];

        FuzzerUtils.init(lArr, 62515L);
        FuzzerUtils.init(sArr1, (short)-18978);

        i2 = 1;
        while (++i2 < 296) {
            for (i3 = 1; i3 < 6; i3++) {
                try {
                    i4 = (i3 % i2);
                    i4 = (-92 / i2);
                    i4 = (15 / i4);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount += (i3 * i3);
                i4 += (int)dMeth((int)(lArr[i2 + 1] % ((++i4) | 1)));
                i4 = (int)(Test.instanceCount - (fMeth(-4) * by));
                iArrFld[i3 + 1] -= (int)dFld;
                Test.instanceCount = by;
            }
            i4 = (int)27002L;
            sArr1[i2 + 1] -= (short)-443502411L;
            for (i16 = 6; i16 > 1; --i16) {
                i17 += (37462 + (i16 * i16));
            }
        }
        b = b;
        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i3 + i4 + by + i16 + i17 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-133, i1=-6, i18=5, i19=46241, i20=-27326, i21=-62434, i22=-65110;
        boolean b2=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-122);

        i = (int)((long)((dFld++) - (--iArrFld[(i >>> 1) % N])) & ((i * i) - -220L));
        dArrFld = dArrFld;
        i1 = 1;
        do {
            vMeth(dFld);
            switch ((((118 >>> 1) % 10) * 5) + 45) {
            case 74:
                Test.instanceCount *= Test.iFld;
                switch (((i1 % 1) * 5) + 19) {
                case 23:
                    for (i18 = 1; i18 < 97; i18++) {
                        boolean b1=true;
                        i19 -= i1;
                        i /= (int)(Test.instanceCount | 1);
                        if (b1) continue;
                        i19 *= i18;
                        i20 = 1;
                        do {
                            Test.lArrFld = Test.lArrFld;
                            Test.iFld += -29506;
                        } while (++i20 < 2);
                        b1 = b1;
                    }
                }
                byArr[i1 + 1] *= (byte)Test.iFld;
                break;
            case 50:
                Test.sFld %= (short)-146;
                i += (45520 + (i1 * i1));
                break;
            case 89:
                Test.instanceCount = 1;
                break;
            case 90:
                for (i21 = 4; i21 < 97; i21 += 3) {
                    float f=0.177F;
                    i ^= (int)199L;
                    f -= 89;
                    if (b2) {
                        if (b2) break;
                        switch ((i21 % 7) + 97) {
                        case 97:
                            byArr[i1 - 1] -= Test.byFld;
                            Test.sFld = (short)-165L;
                            i22 -= -104;
                            break;
                        case 98:
                            i = i18;
                            break;
                        case 99:
                            Test.lArrFld[i21 + 1] = i1;
                            break;
                        case 100:
                            iArrFld[i21] -= i;
                            break;
                        case 101:
                            Test.iFld += (int)-94.151F;
                        case 102:
                            i19 = i;
                            break;
                        case 103:
                            i22 += Test.sFld;
                        }
                    } else {
                        i *= (int)Test.instanceCount;
                    }
                }
                break;
            case 61:
                i22 &= i22;
                break;
            case 84:
                dFld += Test.instanceCount;
                break;
            case 76:
                Test.fFld -= i1;
                break;
            case 67:
            case 46:
                iArrFld[i1 - 1] -= -4017;
                break;
            case 78:
                Test.iFld += (int)(-21.976F + (i1 * i1));
                break;
            default:
                i = (int)-2.77866;
            }
        } while (++i1 < 258);

        FuzzerUtils.out.println("i i1 i18 = " + i + "," + i1 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 b2 byArr = " + i22 + "," + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.fFld Test.sFld Test.byFld = " + Float.floatToIntBits(Test.fFld) + "," + Test.sFld
            + "," + Test.byFld);
        FuzzerUtils.out.println("iArrFld dArrFld Test.lArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}