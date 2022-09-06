// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=107552908L;
    public static float fFld=0.869F;
    public int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)17);
        FuzzerUtils.init(Test.lArrFld, 3391355779L);
        FuzzerUtils.init(Test.fArrFld, 69.754F);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(int i3, float f1) {

        short s=3618;
        double d=-1.6574;
        int i4=-53113, i5=-48303, i6=5, i7=207, i8=109, i9=-213, i10=-223;
        long l=-197L;
        boolean b=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -95.3F);

        i3 = i3;
        s = (short)d;
        fArr = fArr;
        i4 = 1;
        while (++i4 < 181) {
            for (i5 = i4; i5 < 9; i5 += 3) {
                i6 += (((i5 * Test.instanceCount) + i4) - s);
            }
            Test.instanceCount = i5;
            i6 += (((i4 * Test.instanceCount) + s) - s);
            l *= Test.instanceCount;
            if (b) {
                for (i7 = 1; i7 < 9; i7++) {
                    i6 -= i8;
                    for (i9 = 1; i9 < 2; i9++) {
                        i8 *= i3;
                        i10 -= i8;
                    }
                }
            } else if (b) {
                i10 = i6;
            }
        }
        long meth_res = i3 + Float.floatToIntBits(f1) + s + Double.doubleToLongBits(d) + i4 + i5 + i6 + l + i7 + i8 +
            i9 + i10 + (b ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth() {

        int i1=11, i2=245, i11=-34185, i12=38473, i13=-18699, i14=-3, i15=192, i16=13548, iArr[]=new int[N];
        float f2=55.213F;
        short s1=-28405;
        double d1=23.20321, d2=1.128253;

        FuzzerUtils.init(iArr, 89);

        for (i1 = 10; i1 < 294; i1++) {
            dMeth(0, f2);
            Test.byArrFld[i1 + 1] += (byte)i1;
            for (i11 = 1; i11 < 6; i11++) {
                i2 |= s1;
            }
            for (i13 = i1; i13 < 6; i13++) {
                try {
                    i2 = (-174 % iArr[i13 + 1]);
                    i12 = (i14 % i11);
                    i2 = (i11 % -41591);
                } catch (ArithmeticException a_e) {}
                Test.lArrFld[i13] += i11;
            }
            i14 -= i11;
            i15 = 1;
            while (++i15 < 6) {
                for (d1 = 1; 1 > d1; ++d1) {
                    f2 = Test.instanceCount;
                    d2 = 253;
                    d2 *= 5;
                    i12 -= 25674;
                }
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f2) + i11 + i12 + s1 + i13 + i14 + i15 +
            Double.doubleToLongBits(d1) + i16 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(float f) {

        int i17=-4, i18=13, i19=-2, i20=-210, i21=8;
        boolean b1=false;

        Test.instanceCount -= (long)1.778F;
        iMeth();
        i17 = (int)Test.instanceCount;
        for (i18 = 11; i18 < 311; i18++) {
            Test.instanceCount = Test.instanceCount;
            i19 = i19;
            b1 = b1;
            for (i20 = 1; i20 < 6; ++i20) {
                Test.fFld += Test.instanceCount;
                i19 -= (int)Test.instanceCount;
                Test.fArrFld = FuzzerUtils.float1array(N, (float)87.387F);
                f -= 6;
                Test.instanceCount = (long)Test.fFld;
                Test.instanceCount -= 20;
            }
            i19 |= i21;
        }
        long meth_res = Float.floatToIntBits(f) + i17 + i18 + i19 + (b1 ? 1 : 0) + i20 + i21;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=82;
        long l1=3251400671L, l2=-119L;
        double d3=95.95545;
        int i22=-12838, i23=-552, i24=-226, i25=12809, i26=-63120, i27=-59147;
        float f3=16.972F;

        for (int i : iArrFld) {
            by >>>= (byte)(lMeth(0.548F) + 2806671619L);
            l1 = 63;
            do {
                l2 = 1;
                while (++l2 < 1) {
                    i = i;
                    d3 *= i;
                    Test.instanceCount += (l2 - i);
                    Test.fArrFld[(int)(l1)] -= -3218834236L;
                    i >>= (int)Test.instanceCount;
                    i -= -27128;
                    try {
                        i = (i / iArrFld[(int)(l1)]);
                        i = (iArrFld[(int)(l1 - 1)] / 8870);
                        i = (i % i);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount *= i;
                }
                Test.fFld /= (l2 | 1);
                Test.instanceCount = i;
            } while (--l1 > 0);
        }
        i22 <<= i22;
        for (i23 = 10; i23 < 252; i23 += 3) {
            Test.instanceCount = 179;
            i24 *= 10;
            f3 = 1;
            do {
                short s2=22289;
                i22 += (-19725 + (f3 * f3));
                for (i25 = 1; i25 < 1; i25++) {
                    Test.fFld = Test.fFld;
                    i24 = i26;
                }
                d3 -= i25;
                s2 += (short)(((f3 * i23) + i25) - l2);
                i22 += (63722 + (f3 * f3));
            } while (++f3 < 313);
            i27 = 1;
            while (++i27 < 313) {
                i26 = i24;
                i24 = i27;
                i24 += i27;
            }
        }

        FuzzerUtils.out.println("by l1 l2 = " + by + "," + l1 + "," + l2);
        FuzzerUtils.out.println("d3 i22 i23 = " + Double.doubleToLongBits(d3) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 f3 i25 = " + i24 + "," + Float.floatToIntBits(f3) + "," + i25);
        FuzzerUtils.out.println("i26 i27 = " + i26 + "," + i27);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld iArrFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.byArrFld Test.lArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.byArrFld) +
            "," + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}