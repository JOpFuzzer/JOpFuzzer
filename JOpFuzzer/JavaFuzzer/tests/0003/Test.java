// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:41 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1888988450L;
    public short sFld=23994;
    public static volatile int iFld=83;
    public static double dFld=0.77027;
    public static volatile byte byFld=125;
    public boolean bFld=true;
    public static double dArrFld[]=new double[N];
    public volatile short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 36.118850);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i6, int i7) {

        boolean b=true;
        int i8=62521, i9=-20741, i10=-9, i11=-178, i12=-8, iArr[]=new int[N];
        float f1=-99.639F;
        byte by1=74;

        FuzzerUtils.init(iArr, -18069);

        i6 += -112;
        b = b;
        i8 = 1;
        do {
            i6 ^= i7;
            for (i9 = 1; i9 < 7; ++i9) {
                Test.dArrFld[i9 - 1] = f1;
                for (i11 = 1; i11 < 2; ++i11) {
                    i7 = i11;
                    i10 = (int)l;
                    i10 += i9;
                    f1 = Test.iFld;
                    i12 += (i11 * i11);
                }
                i6 += (int)(19045L + (i9 * i9));
                by1 += (byte)(i9 ^ i7);
                iArr[i8] += (int)Test.instanceCount;
            }
        } while (++i8 < 216);
        vMeth1_check_sum += l + i6 + i7 + (b ? 1 : 0) + i8 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 + by1 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(byte by, int i2) {

        int i3=-13519, i4=15579, i5=-1, i13=49654, i14=-8, i15=-5, i16=-33278, iArr1[]=new int[N];
        float f2=2.927F;

        FuzzerUtils.init(iArr1, -6);

        for (i3 = 14; i3 < 333; i3++) {
            i5 *= (int)8.988F;
            switch (((i3 % 8) * 5) + 70) {
            case 109:
                i2 = (int)Test.instanceCount;
                break;
            case 100:
            case 85:
                vMeth1(Test.instanceCount, Test.iFld, i2);
                break;
            case 74:
                for (i13 = i3; i13 < 5; i13++) {
                    i4 = i2;
                    i4 -= (int)Test.instanceCount;
                    i5 >>= (int)Test.instanceCount;
                }
                iArr1[i3 + 1] += (int)Test.dFld;
                f2 *= f2;
                for (i15 = i3; i15 < 5; i15 += 2) {
                    by ^= (byte)Test.instanceCount;
                    i4 += (i15 ^ i14);
                    i4 += (((i15 * f2) + i13) - f2);
                }
            case 87:
                i4 -= -5997;
            case 80:
            case 88:
                Test.instanceCount ^= 7;
                break;
            case 81:
                Test.iFld = i5;
                break;
            default:
                Test.instanceCount /= (i5 | 1);
            }
        }
        vMeth_check_sum += by + i2 + i3 + i4 + i5 + i13 + i14 + Float.floatToIntBits(f2) + i15 + i16 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth(float f) {

        byte by2=36;

        vMeth(by2, -19719);
        vSmallMeth_check_sum += Float.floatToIntBits(f) + by2;
    }

    public void mainTest(String[] strArr1) {

        int i=-5626, i1=132, i17=61058, i18=31314, i19=-36490, i20=-139, i21=5, i22=171, i23=150, i24=5384,
            iArr2[][]=new int[N][N];
        float f3=-22.864F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 5333L);
        FuzzerUtils.init(iArr2, -13);

        for (i = 11; i < 206; i++) {
            i1 += (((i * sFld) + i) - Test.instanceCount);
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(f3);
            lArr[i + 1] = Test.instanceCount;
            i1 ^= Test.byFld;
            for (i17 = 8; i17 < 129; ++i17) {
                sArrFld[i17] = (short)Test.instanceCount;
                Test.instanceCount &= i17;
                Test.instanceCount = i;
                Test.instanceCount <<= i18;
                for (i19 = 1; i19 < 2; ++i19) {
                    Test.iFld += (i19 * i19);
                    Test.instanceCount += (long)f3;
                    i1 <<= i19;
                    Test.byFld += (byte)i20;
                    if (bFld) {
                        Test.instanceCount *= i17;
                        i20 += i18;
                        if (bFld) {
                            lArr[i19 + 1] = i19;
                            i20 = i;
                            Test.dFld += -16884;
                        }
                        lArr[i] = i20;
                    }
                    Test.iFld -= i17;
                }
                Test.instanceCount += i17;
            }
        }
        for (i21 = 12; i21 < 282; ++i21) {
            for (i23 = 3; i23 < 93; ++i23) {
                iArr2 = iArr2;
                i24 = Test.iFld;
                Test.iFld = (int)Test.instanceCount;
            }
        }

        FuzzerUtils.out.println("i i1 f3 = " + i + "," + i1 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 lArr = " + i23 + "," + i24 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount sFld Test.iFld = " + Test.instanceCount + "," + sFld + "," +
            Test.iFld);
        FuzzerUtils.out.println("Test.dFld Test.byFld bFld = " + Double.doubleToLongBits(Test.dFld) + "," + Test.byFld
            + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.dArrFld sArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld))
            + "," + FuzzerUtils.checkSum(sArrFld));

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