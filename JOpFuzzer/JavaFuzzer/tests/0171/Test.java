// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-137L;
    public int iFld=0;
    public static double dFld=1.56069;
    public static float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, -51.630F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l1, int i6) {

        float f1=0.418F, f2=1.140F;
        int i7=3415, i8=0, i9=42161, i10=-1, i11=16071, i12=-23, iArr[]=new int[N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, 51.83179);
        FuzzerUtils.init(iArr, -62132);

        i6 &= (int)l1;
        i6 >>= i6;
        f1 *= i6;
        i7 = 1;
        do {
            for (i8 = i7; 4 > i8; i8++) {
                i6 = i9;
            }
            l1 += (((i7 * i7) + i7) - i6);
            dArr[i7 - 1][i7 - 1] -= i8;
        } while (++i7 < 389);
        for (i10 = 1; i10 < 212; i10++) {
            for (f2 = 8; f2 > 1; --f2) {
                boolean b1=false;
                iArr[(int)(f2 - 1)] >>= i7;
                f1 -= i8;
                l1 += (long)((long)f2 ^ i12);
                if (b1) break;
                iArr[(int)(f2 - 1)] >>= i6;
            }
        }
        long meth_res = l1 + i6 + Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f2) + i12
            + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4, int i5) {

        boolean b2=true;
        float f3=0.420F;
        int i13=-39104, i14=-13190, i15=-59092, i16=-26378, i17=41796;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-8261);

        iMeth1(Test.instanceCount, -52731);
        i5 += i5;
        b2 = b2;
        for (f3 = 8; f3 < 241; ++f3) {
            for (i14 = 1; i14 < 7; i14++) {
                i4 += (int)1.740F;
                i4 += i14;
                for (i16 = 1; i16 < 2; ++i16) {
                    short s=1120;
                    i5 = i13;
                    sArr = FuzzerUtils.short1array(N, (short)28541);
                    sArr[(int)(f3)] -= (short)i14;
                    b2 = b2;
                    i17 = s;
                    i5 -= (int)f3;
                    i15 = i4;
                }
            }
        }
        vMeth_check_sum += i4 + i5 + (b2 ? 1 : 0) + Float.floatToIntBits(f3) + i13 + i14 + i15 + i16 + i17 +
            FuzzerUtils.checkSum(sArr);
    }

    public int iMeth(int i1, long l) {

        int i2=4880, i3=59, i18=14, i19=38292, i20=-21;
        boolean b=false;
        byte by=-69;
        short s1=590;

        for (i2 = 10; i2 < 172; ++i2) {
            if (b) continue;
            vMeth(iFld, i3);
            if (true) {
                iFld >>= i3;
                for (i18 = i2; i18 < 10; i18++) {
                    if (b) {
                        if (b) {
                            i19 += (int)-558630631L;
                        } else {
                            i20 = 1;
                            do {
                                Test.fArrFld[i20][i18] %= -6;
                                i3 += -9;
                                i1 = i18;
                                by *= (byte)i20;
                                b = b;
                            } while (++i20 < 1);
                        }
                    } else {
                        i3 += i3;
                    }
                }
            } else if (true) {
                s1 |= (short)i3;
            }
        }
        long meth_res = i1 + l + i2 + i3 + (b ? 1 : 0) + i18 + i19 + i20 + by + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-2.170F;
        int i=15528, i21=-60884, i22=17422, i23=30;
        short s2=-16537;

        f *= i;
        iFld >>>= Math.max((int)((-(-43150 * (Test.dFld++))) * iMeth(-59255, Test.instanceCount)), iFld);
        for (i21 = 321; i21 > 14; i21--) {
            i22 ^= (int)Test.instanceCount;
            f += i21;
            i23 = 1;
            while ((i23 += 3) < 82) {
                Test.instanceCount -= i23;
                Test.instanceCount += i23;
                iFld &= s2;
                iFld -= (int)Test.instanceCount;
            }
        }

        FuzzerUtils.out.println("f i i21 = " + Float.floatToIntBits(f) + "," + i + "," + i21);
        FuzzerUtils.out.println("i22 i23 s2 = " + i22 + "," + i23 + "," + s2);

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}