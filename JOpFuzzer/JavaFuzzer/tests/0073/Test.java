// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=2474417710L;
    public static float fFld=1.993F;
    public static double dFld=50.30442;
    public double dFld1=-2.13790;
    public int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];
    public static float fArrFld1[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -13L);
        FuzzerUtils.init(Test.fArrFld, -2.949F);
        FuzzerUtils.init(Test.fArrFld1, 116.352F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i5, int i6, long l) {

        int i7=-172, i8=-176, iArr[]=new int[N];
        double d1=63.62538;
        short sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(sArr, (short)-13523);
        FuzzerUtils.init(lArr, 244L);

        iArr[(i5 >>> 1) % N] -= (int)Test.fFld;
        for (i7 = 3; i7 < 237; ++i7) {
            switch ((i7 % 1) + 11) {
            case 11:
                Test.instanceCount += (i7 | i8);
            }
            switch (((i7 % 10) * 5) + 58) {
            case 62:
                i5 -= i6;
                break;
            case 81:
                d1 = 7;
                do {
                    l += (long)(d1 + Test.fFld);
                    i5 = -17251;
                    sArr[(int)(d1)] -= (short)8;
                    l <<= i5;
                    i5 *= i6;
                    i6 = 145;
                    lArr[(int)(d1 - 1)] += i6;
                    Test.instanceCount += 2L;
                } while (--d1 > 0);
            case 74:
                i6 += (i7 ^ i7);
                break;
            case 65:
                if (i8 != 0) {
                }
                break;
            case 78:
                Test.fFld %= (i5 | 1);
                break;
            case 91:
                if (i5 != 0) {
                }
                break;
            case 84:
                i5 >>= i7;
                break;
            case 69:
                i5 += i8;
                break;
            case 100:
                lArr[i7] *= i5;
                break;
            case 73:
                Test.dFld -= i5;
                break;
            }
        }
        long meth_res = i5 + i6 + l + i7 + i8 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i2) {

        int i3=189, i4=-33, i9=-14269, i10=5, i11=-4, i12=-66, iArr1[]=new int[N], iArr2[][]=new int[N][N];
        boolean b=false;

        FuzzerUtils.init(iArr1, -5);
        FuzzerUtils.init(iArr2, -157);

        for (i3 = 11; i3 < 367; ++i3) {
            i2 = (int)((lMeth(i2, i2, Test.instanceCount) - i4) - i2);
            if (false) break;
            i9 = 1;
            while (++i9 < 5) {
                iArr1 = iArr2[i9];
                i2 = i2;
                for (i10 = 1; i10 < 1; ++i10) {
                    Test.instanceCount += (i10 - i2);
                    i4 >>= i3;
                    i2 = (int)Test.instanceCount;
                    try {
                        i4 = (30039 / i11);
                        i2 = (iArr1[i3 - 1] % 52);
                        i4 = (iArr2[i3][i9 - 1] % 48);
                    } catch (ArithmeticException a_e) {}
                    b = b;
                }
                i12 = 1;
                do {
                    i2 <<= i10;
                    if (b) break;
                } while ((i12 += 2) < 1);
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i9 + i10 + i11 + (b ? 1 : 0) + i12 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vSmallMeth(byte by, double d, float f) {

        int i13=60434;

        vMeth(i13);
        vSmallMeth_check_sum += by + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i13;
    }

    public void mainTest(String[] strArr1) {

        int i=24129, i1=7, i14=-110, i15=147, i16=1, i17=-9, i18=3;
        byte by1=-120;
        boolean b1=true;

        for (i = 2; 136 > i; i++) {
            i1 -= (int)(((i * -82.96F) + i1) - (-(-3900674262L - i)));
        }
        iArrFld = (iArrFld = (iArrFld = iArrFld));
        i1 -= iArrFld[(i >>> 1) % N];
        for (int smallinvoc=0; smallinvoc<869; smallinvoc++) vSmallMeth(by1, Test.dFld, Test.fFld);
        i14 = 1;
        do {
            Test.lArrFld[i14 + 1] -= i1;
            i15 = 1;
            do {
                try {
                    i1 = (i14 % i);
                    i1 = (i1 / i14);
                    i1 = (102705547 % i15);
                } catch (ArithmeticException a_e) {}
                for (i16 = 1; i16 < 1; ++i16) {
                    short s=-32708;
                    dFld1 *= s;
                    i1 >>>= -103;
                    i17 = i16;
                    i1 += i16;
                    Test.fArrFld[i15] %= (s | 1);
                    Test.fArrFld1 = Test.fArrFld1;
                }
                i17 += (int)Test.fFld;
                switch ((i15 % 1) + 8) {
                case 8:
                    i17 <<= i15;
                    iArrFld[i15 - 1] >>= -7;
                    i1 -= (int)Test.fFld;
                    break;
                default:
                    Test.instanceCount += i15;
                }
                if (b1) break;
                i1 = i16;
                Test.instanceCount = i15;
                Test.instanceCount = i14;
                i18 = 1;
                while ((i18 -= 3) > 0) {
                    i17 *= (int)118.92987;
                    dFld1 = i14;
                }
            } while (++i15 < 67);
            i17 += (int)Test.instanceCount;
        } while (++i14 < 375);

        FuzzerUtils.out.println("i i1 by1 = " + i + "," + i1 + "," + by1);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 b1 i18 = " + i17 + "," + (b1 ? 1 : 0) + "," + i18);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("dFld1 iArrFld Test.lArrFld = " + Double.doubleToLongBits(dFld1) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.fArrFld Test.fArrFld1 = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld1)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}