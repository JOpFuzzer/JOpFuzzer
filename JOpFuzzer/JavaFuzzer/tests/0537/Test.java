// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=3472674650L;
    public static double dFld=0.33387;
    public static int iArrFld[][]=new int[N][N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 30558);
        FuzzerUtils.init(Test.byArrFld, (byte)57);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i3, boolean b) {

        int i4=14484, i5=209, i6=8, i7=-127;
        byte by1=0;
        float f1=-20.904F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -8L);

        for (i4 = 8; i4 < 215; i4++) {
            if (false) {
                by1 += (byte)i4;
                f1 = (float)Test.dFld;
            }
            lArr[i4 + 1] -= i4;
            i6 = 1;
            do {
                i3 += i6;
                i5 += i6;
                Test.instanceCount >>= 12983;
                Test.iArrFld[i4][(i3 >>> 1) % N] += -1;
            } while (++i6 < 8);
            Test.instanceCount *= i6;
        }
        i3 += -10;
        i3 *= (int)-1.103F;
        Test.iArrFld[(i7 >>> 1) % N][(i4 >>> 1) % N] = (int)-27187L;
        Test.iArrFld[(i5 >>> 1) % N][(i6 >>> 1) % N] -= i5;
        vMeth_check_sum += i3 + (b ? 1 : 0) + i4 + i5 + by1 + Float.floatToIntBits(f1) + i6 + i7 +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i2, float f) {

        boolean b1=true;
        byte by2=-43;
        int i8=5, i9=-81;
        short s=-8824;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -1720L);

        Test.iArrFld[(i2 >>> 1) % N][(i2 >>> 1) % N] >>= (++Test.iArrFld[(i2 >>> 1) % N][(i2 >>> 1) % N]);
        vMeth(7, b1);
        by2 = (byte)0L;
        Test.instanceCount *= 3611401270119271514L;
        i2 = 119;
        switch ((((i2 >>> 1) % 2) * 5) + 81) {
        case 84:
            Test.dFld -= Test.instanceCount;
            for (i8 = 8; i8 < 313; i8++) {
                i9 = (int)Test.instanceCount;
                i9 = (int)Test.instanceCount;
                switch ((i8 % 2) + 30) {
                case 30:
                    i9 *= i9;
                    i9 += (((i8 * i8) + i9) - i8);
                case 31:
                    Test.dFld -= i9;
                    s += (short)(((i8 * i9) + i2) - Test.instanceCount);
                    break;
                default:
                    i2 = i8;
                }
            }
        case 83:
            b1 = b1;
        default:
            Test.dFld *= Test.dFld;
        }
        long meth_res = i2 + Float.floatToIntBits(f) + (b1 ? 1 : 0) + by2 + i8 + i9 + s + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(byte by) {

        float f2=117.883F;
        int i10=3834, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 12);

        Test.instanceCount = (iMeth(237, f2) + i10);
        f2 -= i10;
        vSmallMeth_check_sum += by + Float.floatToIntBits(f2) + i10 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-58074, i1=13, i12=-72, i13=12, i14=-7603, i15=-61, i16=0, i17=-14;
        float f3=23.678F, f4=45.226F, f5=43.332F;
        boolean b2=false;

        for (i = 11; 232 > i; ++i) {
            i1 += i;
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth((byte)(-34));
            i1 = i;
            Test.iArrFld[i - 1][i] = i1;
            i12 = 1;
            do {
                for (i13 = 1; i13 > 1; i13--) {
                    i1 -= i1;
                    i1 += i13;
                    i1 += i13;
                    f3 = Test.instanceCount;
                    Test.iArrFld[i13][i13] += (int)Test.instanceCount;
                }
                i14 += (i12 * i12);
            } while (++i12 < 114);
            switch ((i % 1) + 123) {
            case 123:
                Test.instanceCount += (i * i);
                i1 = i1;
            }
            f4 = 1;
            while (++f4 < 114) {
                b2 = b2;
                try {
                    i1 = (i % 131);
                    i14 = (-3518 / i1);
                    i14 = (i12 / i12);
                } catch (ArithmeticException a_e) {}
                i14 <<= i14;
                for (f5 = 1; 1 < f5; f5--) {
                    i1 += (int)Test.instanceCount;
                    Test.instanceCount += i15;
                }
                i15 = i16;
                try {
                    i16 = (-1926438323 / i15);
                    i1 = (-1871822107 % i15);
                    i15 = (i1 % i16);
                } catch (ArithmeticException a_e) {}
                i16 = (int)Test.instanceCount;
            }
        }
        i17 = 1;
        do {
            Test.iArrFld[i17 + 1][i17 + 1] -= i1;
            Test.iArrFld[i17 - 1][i17 + 1] &= -8;
            i15 += i17;
        } while (++i17 < 329);

        FuzzerUtils.out.println("i i1 i12 = " + i + "," + i1 + "," + i12);
        FuzzerUtils.out.println("i13 i14 f3 = " + i13 + "," + i14 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("f4 b2 f5 = " + Float.floatToIntBits(f4) + "," + (b2 ? 1 : 0) + "," +
            Float.floatToIntBits(f5));
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iArrFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.byArrFld = " + FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}