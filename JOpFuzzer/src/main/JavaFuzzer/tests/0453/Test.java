// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:51 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=58565L;
    public static boolean bFld=true;
    public volatile int iFld=14;
    public double dFld=44.63678;
    public float fFld=0.592F;
    public int iFld1=-2;
    public static boolean bFld1=false;
    public byte byFld=-43;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 47133);
        FuzzerUtils.init(Test.byArrFld, (byte)-119);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=-157, i5=51735, i6=-4, i7=-143;
        boolean b=true;
        short s1=-1777;

        for (i4 = 295; i4 > 15; --i4) {
            i5 <<= i5;
            for (i6 = 1; i6 < 6; i6++) {
                if (b) {
                    if (false) break;
                } else if (false) {
                    if (b) continue;
                } else {
                    Test.instanceCount ^= i6;
                    if (i4 != 0) {
                        vMeth1_check_sum += i4 + i5 + i6 + i7 + (b ? 1 : 0) + s1;
                        return;
                    }
                }
                Test.byArrFld = Test.byArrFld;
                i5 = i5;
                switch (((i4 % 2) * 5) + 13) {
                case 15:
                case 16:
                    Test.instanceCount >>= i6;
                    if (b) {
                        i7 += (((i6 * s1) + i7) - i6);
                        Test.instanceCount &= i7;
                    } else if (b) {
                        Test.instanceCount |= Test.instanceCount;
                    } else if (b) {
                        b = b;
                    } else {
                        Test.instanceCount += (i6 * i6);
                    }
                    break;
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + (b ? 1 : 0) + s1;
    }

    public static void vMeth(int i1, int i2, short s) {

        long l=-5407L;
        int i3=27601, i8=158, i9=20818, i10=12;
        float f1=2.987F;

        for (l = 6; l < 130; l += 3) {
            vMeth1();
            Test.iArrFld[(int)(l)] = i2;
            f1 = l;
            i2 += (int)(((l * Test.instanceCount) + l) - i2);
            i8 = 1;
            while (++i8 < 37) {
                for (i9 = 1; i9 > 1; i9 -= 3) {
                    i10 |= i2;
                    if (false) continue;
                    if (Test.bFld) break;
                    if (Test.bFld) {
                        f1 += i10;
                        if (i9 != 0) {
                            vMeth_check_sum += i1 + i2 + s + l + i3 + Float.floatToIntBits(f1) + i8 + i9 + i10;
                            return;
                        }
                        i1 *= i8;
                        i1 += i9;
                    } else {
                    }
                }
            }
        }
        vMeth_check_sum += i1 + i2 + s + l + i3 + Float.floatToIntBits(f1) + i8 + i9 + i10;
    }

    public long lMeth(double d, float f) {

        short s2=26236;
        double d1=1.94651;
        int i11=-47434, i12=166, i13=26823, i14=9, i15=-234;

        Test.instanceCount = (++Test.instanceCount);
        vMeth(iFld, iFld, s2);
        Test.iArrFld[(iFld >>> 1) % N] = 17369;
        for (d1 = 6; d1 < 244; d1++) {
            if (Test.bFld) {
                for (i12 = (int)(d1); i12 < 7; ++i12) {
                    s2 = s2;
                    f %= (s2 | 1);
                    if (Test.bFld) continue;
                    for (i14 = 1; 1 > i14; ++i14) {
                        i15 = i15;
                        Test.bFld = Test.bFld;
                        i11 >>= (int)Test.instanceCount;
                    }
                    i13 >>= s2;
                    dArrFld[i12 - 1] += i11;
                }
            } else if (Test.bFld) {
                Test.iArrFld[(int)(d1 - 1)] = iFld;
            } else if (Test.bFld) {
                i11 = i13;
            }
        }
        long meth_res = Double.doubleToLongBits(d) + Float.floatToIntBits(f) + s2 + Double.doubleToLongBits(d1) + i11 +
            i12 + i13 + i14 + i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-196, i16=-225, i17=95, i18=58809, i19=18145, i20=1, i21=-153, i22=-35486, i23=-132, i24=79;
        double d2=73.105100;
        short s3=-5502, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-29708);

        Test.iArrFld[(i >>> 1) % N] -= (int)((Test.instanceCount++) * lMeth(dFld, fFld));
        Test.instanceCount = iFld;
        for (d2 = 2; d2 < 170; ++d2) {
            i = i;
            for (i17 = 9; i17 < 149; i17++) {
                Test.iArrFld[i17 + 1] ^= i;
                iFld1 *= i17;
                if (Test.bFld) break;
                iFld = (int)-2528554033L;
            }
            for (i19 = 149; i19 > 5; i19--) {
                if (Test.bFld1) {
                    sArr[(int)(d2 - 1)] |= (short)i;
                    Test.iArrFld[(int)(d2 - 1)] -= i16;
                    for (i21 = 1; i21 < 2; i21++) {
                        Test.iArrFld[i19] *= (int)Test.instanceCount;
                        Test.instanceCount -= i20;
                        if (true) {
                            Test.instanceCount <<= Test.instanceCount;
                        }
                        Test.instanceCount += (i21 ^ s3);
                        if (true) continue;
                        i = (int)3456401329L;
                        i22 = s3;
                    }
                }
                byFld *= (byte)-51481;
                Test.iArrFld[i19 - 1] += s3;
                for (i23 = 2; 1 < i23; --i23) {
                    try {
                        i = (iFld1 / -13889);
                        Test.iArrFld[i19] = (i23 / iFld1);
                        Test.iArrFld[(int)(d2 + 1)] = (26538 / i24);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount = byFld;
                    if (Test.bFld1) {
                        fFld = i18;
                        Test.instanceCount = iFld1;
                    } else {
                        iFld1 = 13;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i d2 i16 = " + i + "," + Double.doubleToLongBits(d2) + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("s3 i23 i24 = " + s3 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld iFld = " + Test.instanceCount + "," + (Test.bFld ? 1 : 0)
            + "," + iFld);
        FuzzerUtils.out.println("dFld fFld iFld1 = " + Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(fFld)
            + "," + iFld1);
        FuzzerUtils.out.println("Test.bFld1 byFld Test.iArrFld = " + (Test.bFld1 ? 1 : 0) + "," + byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.byArrFld dArrFld = " + FuzzerUtils.checkSum(Test.byArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

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
