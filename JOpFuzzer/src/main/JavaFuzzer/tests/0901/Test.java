// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:01 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6487346471429425313L;
    public static volatile int iFld=-113;
    public static volatile float fFld=124.39F;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.330F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i, int i1) {

        int i2=-30, i3=64, i4=0, i5=-194, iArr[]=new int[N];
        float f=53.187F;
        double d=79.107384;

        FuzzerUtils.init(iArr, 17922);

        for (i2 = 4; 126 > i2; ++i2) {
            for (i4 = 1; 13 > i4; i4++) {
                i1 *= (int)Test.instanceCount;
                try {
                    i = (i / -238);
                    i3 = (-14242 / i3);
                    i1 = (i % iArr[i4]);
                } catch (ArithmeticException a_e) {}
                iArr[i4] = 20;
                iArr[i2] = (int)f;
            }
            d *= -8;
        }
        f = f;
        f = Test.instanceCount;
        i1 -= (int)f;
        vMeth1_check_sum += i + i1 + i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l) {

        int i6=0, i7=22682, i8=13, i9=-50, i10=11, i11=-50659, i12=-13, i13=121, i14=0, iArr1[]=new int[N];
        boolean b1=true;
        byte by=-78;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -93.123654);
        FuzzerUtils.init(iArr1, 71);

        vMeth1(i6, i6);
        Test.instanceCount -= -12;
        for (i7 = 124; 6 < i7; i7--) {
            i9 = 1;
            while (++i9 < 13) {
                for (i10 = 1; i10 < 1; ++i10) {
                    i6 = (int)Test.instanceCount;
                    i6 *= i8;
                }
                i11 |= i6;
                if (b1) continue;
                b1 = b1;
            }
            switch ((i7 % 3) + 41) {
            case 41:
                i12 ^= i6;
                for (i13 = 1; i13 < 13; ++i13) {
                    i14 += (((i13 * i13) + i11) - i12);
                    i11 += (int)l;
                }
                break;
            case 42:
                l += (long)11.80970;
                break;
            case 43:
                iArr1[i7] -= i14;
            default:
                i6 -= by;
            }
        }
        vMeth_check_sum += l + i6 + i7 + i8 + i9 + i10 + i11 + (b1 ? 1 : 0) + i12 + i13 + i14 + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth(boolean b) {

        int i15=130;

        vMeth(Test.instanceCount);
        i15 >>= i15;
        vSmallMeth_check_sum += (b ? 1 : 0) + i15;
    }

    public void mainTest(String[] strArr1) {

        boolean b2=false;

        for (int smallinvoc=0; smallinvoc<695; smallinvoc++) vSmallMeth(b2);
        Test.iFld = (int)Test.fFld;
        Test.iFld = (int)Test.instanceCount;
        Test.fArrFld[(26970 >>> 1) % N] *= Test.iFld;

        FuzzerUtils.out.println("b2 = " + (b2 ? 1 : 0));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

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
