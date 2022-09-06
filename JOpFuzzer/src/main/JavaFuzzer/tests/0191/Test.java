// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-112L;
    public static short sFld=-12400;
    public static float fFld=-1.584F;
    public int iFld=9417;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[][]=new byte[N][N];
    public static float fArrFld[]=new float[N];
    public long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 58460);
        FuzzerUtils.init(Test.byArrFld, (byte)-61);
        FuzzerUtils.init(Test.fArrFld, -74.356F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i7=30, i8=-242, i9=26, i10=-42017, i11=-4;
        float f=-22.934F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 4022084105L);

        i7 = 1;
        do {
            i8 -= i7;
            Test.iArrFld[i7] *= i8;
            i8 = i7;
            for (f = 1; 5 > f; f++) {
                if (true) break;
                for (i10 = 2; i10 > 1; i10 -= 3) {
                    i9 <<= (int)-7L;
                    Test.iArrFld[(int)(f)] = i8;
                    i9 += (i10 - Test.instanceCount);
                    Test.byArrFld[i10][i10 - 1] += (byte)-64551L;
                    Test.instanceCount += (((i10 * i10) + i8) - i10);
                    Test.iArrFld[i10 + 1] <<= -10;
                    try {
                        i8 = (i7 / -17818);
                        i9 = (i11 / i8);
                        i8 = (Test.iArrFld[i10] % -35204);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount += (i10 * i10);
                }
            }
        } while (++i7 < 301);
        vMeth2_check_sum += i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + i11 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i6) {


        vMeth2();
        vMeth1_check_sum += i6;
    }

    public static void vMeth() {

        int i2=-9, i3=-197, i4=190, i5=-9, i12=-82;
        boolean b=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.22006);

        for (i2 = 16; 262 > i2; i2++) {
            for (i4 = 1; i4 < 7; ++i4) {
                try {
                    i5 = (239 % i2);
                    i3 = (-131 % i5);
                    i3 = (i4 % i4);
                } catch (ArithmeticException a_e) {}
                i3 = i5;
                Test.sFld *= (short)(i3 = (int)((Test.iArrFld[i2 - 1]--) * (Test.instanceCount - i2)));
                i5 <<= (int)(Test.instanceCount++);
            }
            i5 += (i2 * i2);
            vMeth1(i2);
            i12 = 1;
            do {
                Test.instanceCount += Test.instanceCount;
                dArr[i2 + 1] = i4;
                if (b) break;
                Test.fArrFld[i12 + 1] = i2;
                Test.iArrFld[i2] = 66;
                i3 += i12;
            } while (++i12 < 7);
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i12 + (b ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-15394, i1=-9, i13=-10, i14=7, i15=4, i16=-136, i17=225, i18=-25, i19=10;

        for (i = 12; i < 262; ++i) {
            i1 += ((i1--) - (i1++));
            vMeth();
            Test.fFld = 191;
            i13 = 1;
            while (++i13 < 101) {
                for (i14 = 1; 1 > i14; i14 += 2) {
                    i1 += (((i14 * i14) + i14) - Test.instanceCount);
                }
                Test.instanceCount = Test.instanceCount;
                lArrFld[i][i] -= i15;
                for (i16 = 1; 1 > i16; ++i16) {
                    i15 = (int)1.456F;
                    i17 >>>= (int)Test.instanceCount;
                }
                Test.instanceCount *= i;
                i15 <<= i15;
                i15 >>>= i16;
                Test.sFld += (short)(i13 | Test.instanceCount);
                Test.instanceCount += -101;
                Test.sFld *= (short)Test.fFld;
            }
            try {
                i17 = (12 % i13);
                i15 = (-24178 / iFld);
                iFld = (i16 / 555555225);
            } catch (ArithmeticException a_e) {}
            for (i18 = 1; i18 < 101; i18++) {
                Test.instanceCount += (((i18 * Test.instanceCount) + i16) - Test.instanceCount);
                i15 = 10;
                i15 -= i19;
                Test.fFld += (i18 * i18);
                Test.instanceCount = i15;
                i19 &= iFld;
            }
        }
        i19 = (int)Test.instanceCount;

        FuzzerUtils.out.println("i i1 i13 = " + i + "," + i1 + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("iFld Test.iArrFld Test.byArrFld = " + iFld + "," + FuzzerUtils.checkSum(Test.iArrFld)
            + "," + FuzzerUtils.checkSum(Test.byArrFld));
        FuzzerUtils.out.println("Test.fArrFld lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))
            + "," + FuzzerUtils.checkSum(lArrFld));

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
