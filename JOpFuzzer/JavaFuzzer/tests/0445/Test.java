// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:51 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3319129533L;
    public static int iFld=71;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -14);
        FuzzerUtils.init(Test.lArrFld, -1806124224L);
        FuzzerUtils.init(Test.dArrFld, 1.29329);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i3=29895, i4=0, i5=-3672, i6=-37409, i7=-2;
        float f=-33.874F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-111);

        i3 = 1;
        while ((i3 += 2) < 315) {
            byte by1=93;
            Test.instanceCount <<= -10;
            Test.iArrFld[i3 - 1] |= i3;
            i4 = 14;
            by1 = (byte)i4;
            Test.iArrFld[i3] -= i4;
            for (f = 10; f > 1; --f) {
                i4 = i5;
                for (i6 = i3; i6 < 2; i6++) {
                    switch ((((162 >>> 1) % 4) * 5) + 108) {
                    case 120:
                        i5 = (int)f;
                        Test.instanceCount <<= i7;
                        Test.iArrFld[i3] = -59735;
                        break;
                    case 114:
                        Test.lArrFld[(int)(f)] -= i5;
                        break;
                    case 117:
                        if (i7 != 0) {
                            vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + i7 +
                                FuzzerUtils.checkSum(byArr);
                            return;
                        }
                        break;
                    case 122:
                        Test.instanceCount = 19;
                        break;
                    default:
                        Test.dArrFld[(int)(f + 1)] += i3;
                    }
                }
            }
        }
        vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + i7 + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth() {

        int i1=1, i2=109, i8=-3, iArr[]=new int[N];
        boolean b=false;
        double d=0.66588;
        byte by2=-49;

        FuzzerUtils.init(iArr, -55171);

        for (i1 = 8; i1 < 321; i1++) {
            i2 ^= (int)Test.instanceCount;
            i2 <<= (int)(Test.instanceCount--);
            i2 = (-iArr[i1 - 1]);
            vMeth();
            if (b) break;
            for (d = 1; d < 5; d++) {
                i2 += (int)d;
                i2 >>= i1;
                i8 += -2;
                i2 = i8;
                i2 <<= i2;
                i8 = i1;
            }
            i2 >>= by2;
            iArr[i1] += (int)d;
        }
        long meth_res = i1 + i2 + (b ? 1 : 0) + Double.doubleToLongBits(d) + i8 + by2 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(int i, long l) {

        float f1=-123.552F;

        i = iMeth();
        f1 -= i;
        vSmallMeth_check_sum += i + l + Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {


        for (int smallinvoc=0; smallinvoc<511; smallinvoc++) vSmallMeth(13814, 1645811605244493296L);
        Test.iArrFld[(Test.iFld >>> 1) % N] >>>= (int)Test.instanceCount;


        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.iArrFld = " + Test.instanceCount + "," + Test.iFld +
            "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

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