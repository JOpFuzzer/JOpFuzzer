// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:41 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2997130330L;
    public static double dFld=2.58314;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static void vMeth(int i, int i1, int i2) {

        double d=-67.55812;

        d = (i + Math.abs((int)(Test.instanceCount + i2)));
        vMeth_check_sum += i + i1 + i2 + Double.doubleToLongBits(d);
    }

    public static long lMeth(int i3, byte by) {

        int i4=-19, i5=117, i6=10, i7=-26555, i8=-101, i9=-250, iArr[]=new int[N];
        short s=15837;
        float f1=1.363F;

        FuzzerUtils.init(iArr, 191);

        vMeth(i3, i3, i3);
        for (i4 = 5; i4 < 380; ++i4) {
            for (i6 = 1; i6 < 5; ++i6) {
                switch (((i4 % 4) * 5) + 38) {
                case 54:
                    for (i8 = 2; 1 < i8; i8--) {
                        s -= (short)i8;
                        i5 = i6;
                        f1 += (i8 - i8);
                        by += (byte)i8;
                        i5 += i7;
                        i9 = -89;
                        by *= (byte)i8;
                    }
                case 57:
                    i5 += i6;
                    Test.instanceCount += by;
                    Test.dFld += s;
                    break;
                case 58:
                    s += (short)-100L;
                case 49:
                    i9 += (int)Test.instanceCount;
                default:
                    iArr[i6 + 1] += (int)f1;
                }
            }
        }
        long meth_res = i3 + by + i4 + i5 + i6 + i7 + i8 + i9 + s + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vSmallMeth() {

        int i10=-4;
        byte by1=12;

        vMeth((int)((-29285 + lMeth(i10, by1)) + i10), i10, i10);
        vSmallMeth_check_sum += i10 + by1;
    }

    public void mainTest(String[] strArr1) {

        float f=1.280F;
        int i11=4395;

        f = -14;
        for (int smallinvoc=0; smallinvoc<999; smallinvoc++) vSmallMeth();
        Test.dFld = i11;
        Test.instanceCount = i11;

        FuzzerUtils.out.println("f i11 = " + Float.floatToIntBits(f) + "," + i11);

        FuzzerUtils.out.println("Test.instanceCount Test.dFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test lMeth
//DEBUG  lMeth ->  lMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}