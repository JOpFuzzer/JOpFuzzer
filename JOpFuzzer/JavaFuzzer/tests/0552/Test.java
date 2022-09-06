// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4011086367L;
    public double dFld=-71.44053;
    public byte byFld=-123;
    public int iFld=-211;
    public static double dArrFld[]=new double[N];
    public static long lArrFld[][]=new long[N][N];
    public static byte byArrFld[]=new byte[N];
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 77.18904);
        FuzzerUtils.init(Test.lArrFld, -2292498346662830522L);
        FuzzerUtils.init(Test.byArrFld, (byte)117);
        FuzzerUtils.init(Test.iArrFld, 163);
    }

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i5, int i6, byte by) {

        int i7=-6, i8=109, i9=-1425, i10=191, i11=68, i12=12604, iArr[]=new int[N];
        double d1=36.125630, d2=1.41647;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -62443);
        FuzzerUtils.init(fArr, -110.484F);

        for (i7 = 18; 368 > i7; i7++) {
            try {
                i5 = (i6 / i7);
                iArr[i7] = (42600 / i5);
                i8 = (i5 % iArr[i7 - 1]);
            } catch (ArithmeticException a_e) {}
            for (i9 = 1; i9 < 5; i9 += 3) {
                i5 = (int)d1;
                Test.dArrFld[i9] += Test.instanceCount;
                iArr[i9] += 1;
                i10 -= (int)6664875773119424028L;
                d2 = 1;
                do {
                    i6 += i10;
                    Test.lArrFld[(int)(d2 - 1)][i7] *= -59955;
                } while (++d2 < 5);
                for (i11 = i9; 5 > i11; ++i11) {
                    iArr[i11 - 1] -= i5;
                    i6 = i7;
                    i5 -= i9;
                    fArr[i11] += by;
                }
            }
        }
        long meth_res = i5 + i6 + by + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) +
            i11 + i12 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(boolean b) {

        double d=107.26987;
        int i4=-102, i13=-14, i14=56, i15=-12, i16=-71;
        byte by1=-124;
        float f=79.198F, fArr1[][]=new float[N][N];

        FuzzerUtils.init(fArr1, 74.649F);

        d *= (((i4++) + iMeth1(i4, i4, (byte)(-78))) - by1);
        i4 = i4;
        fArr1[(i4 >>> 1) % N][(i4 >>> 1) % N] = f;
        d += i4;
        for (i13 = 1; 355 > i13; ++i13) {
            Test.byArrFld[i13 - 1] = (byte)-11;
            i14 = (int)Test.instanceCount;
            for (i15 = 1; i15 < 5; i15++) {
                Test.instanceCount = 13L;
                i4 *= i13;
                switch ((i13 % 1) + 68) {
                case 68:
                    i4 = 5;
                    d = i16;
                    i14 *= (int)Test.instanceCount;
                    i14 -= (int)Test.instanceCount;
                    break;
                default:
                    i16 = 1;
                }
            }
        }
        long meth_res = (b ? 1 : 0) + Double.doubleToLongBits(d) + i4 + by1 + Float.floatToIntBits(f) + i13 + i14 + i15
            + i16 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public int iMeth(int i3) {

        boolean b1=true;
        short s=-21206;
        int i17=-7, i18=83, i19=183, i20=-60719, i21=229, i22=-350;
        float f1=-2.830F;
        byte by2=-65;

        i3 -= (int)Math.abs(fMeth(b1));
        i3 = s;
        for (i17 = 4; i17 < 189; ++i17) {
            for (i19 = i17; i19 < 9; ++i19) {
                double d3=0.27828;
                d3 += i18;
                i20 >>= i17;
            }
            i21 = 1;
            while (++i21 < 9) {
                i22 = 1;
                while (++i22 < 1) {
                    i20 = i18;
                    i20 += (i22 * i22);
                    i3 += (int)f1;
                    Test.lArrFld[i21 + 1][i22] >>= by2;
                    dFld = -52177;
                    Test.instanceCount += (i22 ^ i20);
                    i20 %= (int)(Test.instanceCount | 1);
                }
            }
        }
        long meth_res = i3 + (b1 ? 1 : 0) + s + i17 + i18 + i19 + i20 + i21 + i22 + Float.floatToIntBits(f1) + by2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-72, i1=57654, i2=-37834, i23=34104, i24=12, i25=134;
        float f2=-108.375F;
        boolean b2=true;
        long l=-9215196991501403234L;
        short s1=-17673;

        i = 1;
        while ((i += 3) < 232) {
            for (i1 = 3; i1 < 325; ++i1) {
                i2 <<= (iMeth(i) * 6);
                dFld -= i2;
                switch (((i >>> 1) % 3) + 118) {
                case 118:
                    for (i23 = 1; i23 < 2; i23 += 2) {
                        f2 = i;
                        i2 ^= i24;
                        Test.iArrFld[i23 - 1] += (int)Test.instanceCount;
                        i2 -= i2;
                        i24 += 40512;
                        if (b2) {
                            Test.instanceCount >>= i;
                            i24 += (int)f2;
                            byFld >>= (byte)Test.instanceCount;
                            iFld = i23;
                        } else if (b2) {
                            Test.iArrFld[i1 - 1] = (int)Test.instanceCount;
                            i24 = iFld;
                        } else if (b2) {
                            i2 += (i23 - Test.instanceCount);
                        } else {
                            i24 = (int)-3540778340L;
                            Test.instanceCount += 154;
                            f2 = l;
                            i24 *= s1;
                        }
                    }
                    dFld = f2;
                    break;
                case 119:
                    i25 = 1;
                    do {
                        s1 += (short)(-7617 + (i25 * i25));
                        byFld -= (byte)i2;
                        i24 += (int)1.688F;
                        i24 /= (int)(Test.instanceCount | 1);
                        f2 *= i;
                    } while (++i25 < 2);
                    break;
                case 120:
                    l &= i;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i23 i24 f2 = " + i23 + "," + i24 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("b2 l s1 = " + (b2 ? 1 : 0) + "," + l + "," + s1);
        FuzzerUtils.out.println("i25 = " + i25);

        FuzzerUtils.out.println("Test.instanceCount dFld byFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + byFld);
        FuzzerUtils.out.println("iFld Test.dArrFld Test.lArrFld = " + iFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.byArrFld Test.iArrFld = " + FuzzerUtils.checkSum(Test.byArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 fMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}