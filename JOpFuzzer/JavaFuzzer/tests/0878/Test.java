// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:01 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=127L;
    public boolean bFld=false;
    public static short sFld=-1839;
    public static float fFld=1.810F;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -8);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i, float f, long l) {

        int i1=-10, i2=-24130, i3=-17212, i4=31205, i5=-14;

        i = i;
        Test.iArrFld[(i >>> 1) % N] = 119;
        i /= 99;
        i *= i1;
        i2 = 1;
        do {
            Test.iArrFld[i2 + 1] *= i2;
            i1 += (i2 | (long)f);
            if (i1 != 0) {
            }
        } while (++i2 < 260);
        for (i3 = 22; i3 < 357; ++i3) {
            i5 = 1;
            do {
                i4 >>>= -12784;
                Test.sFld = (short)i3;
                Test.sFld += (short)i5;
                i *= i3;
                i += (int)62L;
            } while (++i5 < 5);
        }
        long meth_res = i + Float.floatToIntBits(f) + l + i1 + i2 + i3 + i4 + i5;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        double d=108.62111;
        int i6=-240, i7=55584, i8=1413;
        float f1=80.976F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -101.219F);

        Test.sFld += (short)(iMeth(13, Test.fFld, Test.instanceCount) * d);
        i6 = 1;
        do {
            i7 <<= i7;
        } while (++i6 < 170);
        i7 *= (int)d;
        Test.instanceCount = i7;
        i7 >>>= i6;
        Test.iArrFld[(i6 >>> 1) % N] += -17798;
        for (f1 = 16; f1 < 330; f1++) {
            i7 += (int)d;
            Test.fFld -= i7;
            Test.instanceCount += i7;
            fArr[(i6 >>> 1) % N] += 131;
        }
        Test.iArrFld[(i7 >>> 1) % N] >>>= -11;
        Test.fFld += i6;
        Test.iArrFld[(i6 >>> 1) % N] = (int)d;
        vMeth_check_sum += Double.doubleToLongBits(d) + i6 + i7 + Float.floatToIntBits(f1) + i8 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static boolean bMeth() {

        int i9=12179;

        vMeth();
        i9 &= (int)Test.instanceCount;
        long meth_res = i9;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {


        bFld = (bMeth() == false);
        bFld = bFld;


        FuzzerUtils.out.println("Test.instanceCount bFld Test.sFld = " + Test.instanceCount + "," + (bFld ? 1 : 0) +
            "," + Test.sFld);
        FuzzerUtils.out.println("Test.fFld Test.iArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}