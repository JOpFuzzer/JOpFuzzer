// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:57 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=65120L;
    public static boolean bFld=false;
    public static float fFld=-50.189F;
    public double dFld=-118.68276;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -53726);
        FuzzerUtils.init(Test.fArrFld, -2.203F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i5=174, i6=-11, i7=-73, i8=18683, i9=-11, i10=-60170, i11=12556, i12=15, i13=-12;
        short s=23453;
        float f=121.931F;
        double d1=1.11253;
        byte by=121;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 5L);

        i5 += i5;
        Test.iArrFld[(9 >>> 1) % N] <<= s;
        for (i6 = 1; i6 < 343; i6++) {
            for (i8 = 1; i8 < 5; ++i8) {
                f += (float)d1;
                for (i10 = 1; i10 < 2; ++i10) {
                    if (i5 != 0) {
                        vMeth2_check_sum += i5 + s + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) +
                            Double.doubleToLongBits(d1) + i10 + i11 + by + i12 + i13 + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    s -= (short)i6;
                    Test.fArrFld[i8] = s;
                    f += (i10 + i5);
                    by = (byte)Test.instanceCount;
                }
                for (i12 = 1; i12 < 2; i12++) {
                    i11 -= i9;
                    i5 = i7;
                    lArr = lArr;
                }
            }
        }
        vMeth2_check_sum += i5 + s + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i10 +
            i11 + by + i12 + i13 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(long l) {

        int i3=-127, i4=56526, i14=30, i15=-14906, i16=17, i17=14;
        double d2=-75.52937, d3=2.99832;
        float f1=-87.281F, f2=63.941F;
        boolean b1=false;

        for (i3 = 5; i3 < 132; i3 += 3) {
            vMeth2();
            for (d2 = i3; d2 < 36; d2++) {
                for (f1 = i3; f1 < 1; f1++) {
                    boolean b=true;
                    i4 >>= i3;
                    i4 >>>= i4;
                    if (b) break;
                }
                l += (long)((long)d2 | i15);
            }
            i14 += -13;
            d3 *= -26;
            Test.instanceCount *= i14;
            for (i16 = 2; i16 < 36; ++i16) {
                f2 = Test.instanceCount;
                l += i4;
                if (b1) continue;
            }
        }
        vMeth1_check_sum += l + i3 + i4 + Double.doubleToLongBits(d2) + i14 + Float.floatToIntBits(f1) + i15 +
            Double.doubleToLongBits(d3) + i16 + i17 + Float.floatToIntBits(f2) + (b1 ? 1 : 0);
    }

    public void vMeth(int i1, int i2) {

        int i18=-34637, i19=-8, i20=33;

        if (Test.bFld) {
            i2 -= i1;
            vMeth1(Test.instanceCount);
            vMeth_check_sum += i1 + i2 + i18 + i19 + i20;
            return;
        }
        i18 = 1;
        while ((i18 += 3) < 335) {
            for (i19 = 1; i19 < 14; i19++) {
                try {
                    i1 = (122 / Test.iArrFld[i18 + 1]);
                    i20 = (Test.iArrFld[i18] % -940453360);
                    Test.iArrFld[i19] = (Test.iArrFld[i19] / i20);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount = Test.instanceCount;
            }
            i20 >>= (int)Test.instanceCount;
        }
        Test.fFld = i1;
        i20 = i1;
        dFld -= i19;
        Test.instanceCount = -55318L;
        vMeth_check_sum += i1 + i2 + i18 + i19 + i20;
    }

    public void mainTest(String[] strArr1) {

        double d=-1.73236;
        int i=9018, i21=223, i22=-46830;
        short s1=-15050;
        byte by1=-98;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 22.877F);

        for (d = 1; d < 135; ++d) {
            try {
                i = (i / i);
                i = (-143 % i);
                i = (Test.iArrFld[(int)(d - 1)] % i);
            } catch (ArithmeticException a_e) {}
            vMeth(i, i);
            Test.instanceCount = i;
            Test.fArrFld[(int)(d)] = 64411;
            Test.iArrFld = Test.iArrFld;
            if (true) {
                i = i;
                Test.instanceCount += s1;
                Test.iArrFld[(int)(d + 1)] <<= i;
            } else {
                i += (int)(d * d);
                i = i;
                i += (int)d;
            }
        }
        i -= -47529;
        i = i;
        i21 = 1;
        while (++i21 < 158) {
            fArr = fArr;
            if (false) break;
            Test.fArrFld[i21 - 1] -= i;
            i += (i21 * Test.instanceCount);
            Test.instanceCount = i21;
            Test.instanceCount += i21;
            Test.iArrFld[i21] = i21;
            i22 += (int)Test.fFld;
            Test.instanceCount -= i21;
        }
        Test.fFld = i22;
        i22 = (int)Test.instanceCount;
        i22 += i22;
        i22 &= i22;
        dFld /= (by1 | 1);

        FuzzerUtils.out.println("d i s1 = " + Double.doubleToLongBits(d) + "," + i + "," + s1);
        FuzzerUtils.out.println("i21 i22 by1 = " + i21 + "," + i22 + "," + by1);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("dFld Test.iArrFld Test.fArrFld = " + Double.doubleToLongBits(dFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}