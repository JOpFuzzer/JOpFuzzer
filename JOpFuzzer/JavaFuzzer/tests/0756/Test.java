// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:58 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=3590066932L;
    public double dFld=117.121473;
    public static byte byFld=-58;
    public static int iFld=1557;
    public static float fFld=125.141F;
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 875921889092218232L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(byte by, long l1) {

        int i4=11, i5=-14, i6=-30249, i7=37442, i8=20, i9=11, i10=74, i11=-88, iArr[]=new int[N];
        short s1=-11454;
        float f1=0.468F;

        FuzzerUtils.init(iArr, -31312);

        Test.instanceCount *= i4;
        for (i5 = 395; i5 > 17; i5--) {
            iArr[i5] -= i5;
        }
        iArr = iArr;
        Test.instanceCount += l1;
        for (i7 = 11; i7 < 190; ++i7) {
            iArr[i7] = i8;
            i6 = s1;
            l1 >>= i7;
            by += (byte)(8 + (i7 * i7));
            for (i9 = i7; i9 < 9; i9++) {
                by = (byte)f1;
                i11 = 1;
                do {
                    i6 *= i4;
                    Test.instanceCount = i7;
                } while (++i11 < 1);
            }
        }
        long meth_res = by + l1 + i4 + i5 + i6 + i7 + i8 + s1 + i9 + i10 + Float.floatToIntBits(f1) + i11 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l) {

        int i2=5477, i3=-65354, i12=10, i13=12, i14=8329, i15=8, iArr1[]=new int[N];
        short s=17585;
        double d=0.124612;
        boolean b=false;
        float f2=65.298F;

        FuzzerUtils.init(iArr1, 3);

        for (i2 = 4; i2 < 240; ++i2) {
            i3 = (int)(((s >> i3) % ((++i3) | 1)) - ((++Test.lArrFld[i2]) * (0L * iMeth(Test.byFld, 5L))));
            d *= i2;
            for (i12 = 1; 7 > i12; i12++) {
                s += (short)(((i12 * s) + Test.instanceCount) - l);
                for (i14 = 1; i14 < 2; ++i14) {
                    i13 += (((i14 * i3) + i12) - i15);
                    l <<= i15;
                    switch ((((i13 >>> 1) % 7) * 5) + 13) {
                    case 22:
                        i3 = -6;
                        break;
                    case 38:
                        iArr1[i2 + 1] = Test.byFld;
                        break;
                    case 16:
                    case 24:
                        i15 += i12;
                        if (b) break;
                        iArr1[i2 - 1] = (int)Test.instanceCount;
                        break;
                    case 37:
                        l += i12;
                        break;
                    case 18:
                        i15 -= i2;
                    case 26:
                        f2 -= 82;
                    }
                }
            }
        }
        vMeth1_check_sum += l + i2 + i3 + s + Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 + (b ? 1 : 0) +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i) {

        float f=-1.642F, fArr[]=new float[N];
        int i1=-11, i16=-14, i17=28164, i18=-2, i19=5, i20=-20812;
        short s2=-8310;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 22.50185);
        FuzzerUtils.init(fArr, 75.710F);

        i >>= (--i);
        Test.instanceCount = (long)(((-12L - dArr[(i >>> 1) % N]) + (f -= f)) + (-(Test.instanceCount * -64L)));
        i1 = 1;
        while (++i1 < 398) {
            i &= (int)(Test.instanceCount++);
            vMeth1(Test.instanceCount);
            f += i;
            for (i16 = i1; i16 < 4; i16++) {
                for (i18 = 1; i18 < 1; ++i18) {
                    i |= -139;
                    i17 += (i18 * i18);
                }
                i20 = 1;
                while (++i20 < 1) {
                    s2 = (short)i1;
                    i17 += (i20 ^ i1);
                    fArr[i20] = -10;
                }
                i17 *= i;
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i16 + i17 + i18 + i19 + i20 + s2 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i21=-18350, i22=-56577, i23=1, i24=-97;
        boolean b1=true;
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, 100.119004);

        dFld += (-dFld);
        vMeth(Test.iFld);
        for (i21 = 21; 336 > i21; ++i21) {
            Test.instanceCount += (i21 * i21);
            for (i23 = 5; i23 < 80; ++i23) {
                if (b1) continue;
                dFld *= i23;
                Test.iFld += (int)(46.587F + (i23 * i23));
                Test.instanceCount += i22;
                i24 = i23;
                switch ((((i24 >>> 1) % 7) * 5) + 66) {
                case 89:
                    dFld += Test.instanceCount;
                    break;
                case 91:
                    i24 <<= -241;
                    i22 -= i21;
                    break;
                case 99:
                    Test.iFld += i24;
                    Test.fFld -= i22;
                    Test.instanceCount += i23;
                    if (b1) continue;
                case 74:
                    i24 += (i23 + i23);
                    dFld += Test.instanceCount;
                    Test.fFld += i22;
                    Test.fFld -= i23;
                    break;
                case 71:
                    Test.iFld *= (int)46.873F;
                    break;
                case 83:
                    i24 += (((i23 * Test.byFld) + i22) - Test.instanceCount);
                    i22 = (int)Test.instanceCount;
                    break;
                case 78:
                    Test.instanceCount += i23;
                    try {
                        Test.iFld = (-140 % i22);
                        i24 = (32 % i22);
                        Test.iFld = (i23 % 211);
                    } catch (ArithmeticException a_e) {}
                    i22 += (i23 * i24);
                }
                Test.lArrFld[i23] *= (long)Test.fFld;
                dArr1[i21] *= -91L;
            }
        }

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 b1 dArr1 = " + i24 + "," + (b1 ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.byFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld Test.fFld Test.lArrFld = " + Test.iFld + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));

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