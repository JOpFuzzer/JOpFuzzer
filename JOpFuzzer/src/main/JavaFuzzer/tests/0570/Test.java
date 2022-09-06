// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:54 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-11L;
    public static int iFld=-1;
    public static long lArrFld[]=new long[N];
    public static float fArrFld[][]=new float[N][N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -13L);
        FuzzerUtils.init(Test.fArrFld, 23.310F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {

        int i5=-244, i6=15, i7=-57592, i8=-197, i9=-3, i10=-5, iArr[]=new int[N];
        double d=-97.107243, dArr[]=new double[N];
        byte by=31;
        boolean b=true;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 0.136F);
        FuzzerUtils.init(lArr, -34470L);
        FuzzerUtils.init(dArr, -63.54312);
        FuzzerUtils.init(iArr, -9);

        Test.instanceCount >>= Test.instanceCount;
        fArr = FuzzerUtils.float1array(N, (float)-2.661F);
        Test.iFld >>>= 23;
        for (long l1 : lArr) {
            for (i5 = 4; i5 > 1; i5 -= 2) {
                Test.iFld = i6;
            }
            dArr[(-187 >>> 1) % N] -= Test.iFld;
            d += by;
            for (i7 = 1; 4 > i7; ++i7) {
                iArr[i7] -= (int)l1;
                for (i9 = 1; i9 < 2; ++i9) {
                    iArr[i9 + 1] *= i6;
                    Test.iFld = i5;
                    b = b;
                    try {
                        iArr[i7 - 1] = (55410 / i7);
                        i8 = (i8 / -1447369765);
                        Test.iFld = (6935 / i10);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        long meth_res = i5 + i6 + Double.doubleToLongBits(d) + by + i7 + i8 + i9 + i10 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth() {

        long l=143L;
        int i11=-13, i12=220, i13=-6, i14=62053, i15=0, iArr1[]=new int[N];
        double d1=-102.40587;
        float f1=-2.140F;
        boolean b1=false;
        byte by1=9;

        FuzzerUtils.init(iArr1, -61148);

        l = 1;
        while (++l < 341) {
            dMeth();
            for (i11 = (int)(l); i11 < 5; i11++) {
                float f=9.68F;
                Test.lArrFld = Test.lArrFld;
                f = 101L;
                d1 = i12;
                i12 = Test.iFld;
                iArr1[(int)(l)] = i11;
                i12 >>= Test.iFld;
            }
            for (f1 = l; f1 < 5; ++f1) {
                d1 *= i11;
                Test.instanceCount *= l;
                for (i14 = 1; i14 < 1; ++i14) {
                    if (b1) break;
                    by1 = (byte)i11;
                }
            }
        }
        long meth_res = l + i11 + i12 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i13 + i14 + i15 + (b1
            ? 1 : 0) + by1 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i, int i1) {

        int i2=29950, i3=0, i4=-5902, i16=-12, i17=14, iArr2[]=new int[N];
        float f2=-20.305F, f3=0.331F;
        byte by2=-93;

        FuzzerUtils.init(iArr2, -5);

        i -= i;
        i2 = 1;
        while (++i2 < 308) {
            for (i3 = 1; i3 < 5; ++i3) {
                i += (i3 * i3);
                iMeth();
                f2 -= i2;
            }
            for (i16 = 1; i16 < 5; ++i16) {
                i17 += 12;
                Test.fArrFld[i2 + 1] = Test.fArrFld[i16];
            }
            Test.lArrFld[i2] >>= Test.iFld;
            i = by2;
            f3 = 1;
            do {
                Test.instanceCount += (long)(f3 - i2);
                iArr2[(int)(f3)] += i16;
                i4 <<= 20609;
            } while (++f3 < 5);
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + Float.floatToIntBits(f2) + i16 + i17 + by2 +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i18=-8, i20=-31, i21=2, i22=8285, i23=3, i24=248, i25=-71;
        float f4=-114.281F;
        long l2=63L;
        double d2=-1.35382, dArr1[]=new double[N];
        byte by3=2;

        FuzzerUtils.init(dArr1, 0.106962);

        vMeth(i18, Test.iFld);
        for (int i19 : iArrFld) {
            boolean b2=true;
            i18 += Test.iFld;
            if (b2) {
                i20 = 1;
                while (++i20 < 63) {
                    if (true) continue;
                    for (i21 = 1; i21 > 1; i21 -= 2) {
                        i19 = -9;
                        Test.instanceCount += Test.instanceCount;
                        dArr1 = dArr1;
                        i22 *= (int)f4;
                        i18 >>= i20;
                        i18 += (((i21 * Test.iFld) + i20) - f4);
                        Test.instanceCount = Test.instanceCount;
                        f4 += (-1.646F + (i21 * i21));
                    }
                    for (l2 = 1; l2 > 1; --l2) {
                        double d3=-109.28052;
                        iArrFld[i20 - 1] = (int)d2;
                        Test.fArrFld[i20][i20 - 1] += i22;
                        i19 -= Test.iFld;
                        i23 += (int)(l2 * l2);
                        i22 >>>= Test.iFld;
                        i19 -= (int)l2;
                        Test.iFld += (int)(((l2 * i21) + i23) - i20);
                        f4 -= 52.340F;
                        Test.instanceCount *= (long)d3;
                        Test.iFld += -149;
                    }
                }
                for (i24 = 3; i24 < 63; i24++) {
                    f4 *= -6457;
                    by3 += (byte)(0L + (i24 * i24));
                }
            } else if (b2) {
                i22 <<= i21;
            } else if (b2) {
                i25 = Test.iFld;
            } else {
                i22 += i22;
            }
        }

        FuzzerUtils.out.println("i18 i20 i21 = " + i18 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 f4 l2 = " + i22 + "," + Float.floatToIntBits(f4) + "," + l2);
        FuzzerUtils.out.println("i23 d2 i24 = " + i23 + "," + Double.doubleToLongBits(d2) + "," + i24);
        FuzzerUtils.out.println("i25 by3 dArr1 = " + i25 + "," + by3 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.lArrFld = " + Test.instanceCount + "," + Test.iFld +
            "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.fArrFld iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))
            + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
