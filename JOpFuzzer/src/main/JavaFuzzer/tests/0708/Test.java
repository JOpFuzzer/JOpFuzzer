// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:57 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=3147926281226645535L;
    public static float fFld=-2.157F;
    public static volatile boolean bFld=true;
    public static short sFld=-3483;
    public static volatile int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 13);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i, int i1) {

        int i2=-12, i3=45831, i4=56, i5=13, i6=7;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 14.576F);

        Test.instanceCount = i1;
        fArr[(13889 >>> 1) % N] -= 8600;
        i2 = 1;
        do {
            try {
                Test.iArrFld[i2 - 1][i2 + 1] = (Test.iArrFld[i2][i2 + 1] % 72);
                i1 = (62311 % i1);
                i = (-443437899 % i2);
            } catch (ArithmeticException a_e) {}
            try {
                i1 = (856664487 % i1);
                Test.iArrFld[i2 - 1][i2] = (i1 / Test.iArrFld[i2 + 1][i2]);
                i1 = (-40648 / Test.iArrFld[i2][i2 + 1]);
            } catch (ArithmeticException a_e) {}
            for (i3 = 1; i3 < 10; ++i3) {
                i1 = (int)Test.instanceCount;
                try {
                    i4 = (i2 / i2);
                    i1 = (i / -1591955672);
                    i4 = (i4 / i);
                } catch (ArithmeticException a_e) {}
                i4 += (i3 * i3);
                Test.iArrFld[i2][i2] |= i2;
                for (i5 = 2; 1 < i5; i5 -= 2) {
                    Test.fFld += -178L;
                    i1 += 41302;
                    Test.fFld -= Test.instanceCount;
                    Test.fFld *= i5;
                }
            }
        } while (++i2 < 154);
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth() {

        int i7=62579, i8=-27336, i9=120, i10=143, i11=5, i12=183, i13=-33, i14=-5, i15=-11, i16=-156, i17=-60043;
        double d=-34.28523;

        vMeth(i7, i7);
        for (i8 = 3; i8 < 171; i8++) {
            Test.iArrFld[i8 + 1] = Test.iArrFld[i8 + 1];
        }
        for (i10 = 16; i10 < 304; ++i10) {
            i9 = (int)Test.instanceCount;
            for (d = 1; d < 6; d++) {
                Test.instanceCount += i12;
            }
            for (i13 = 6; i10 < i13; i13--) {
                for (i15 = 1; i15 > 1; i15 -= 2) {
                    i12 = i11;
                    i9 >>>= -5978;
                    if (Test.bFld) continue;
                    try {
                        i14 = (90 % i13);
                        i14 = (i14 / Test.iArrFld[i13][i15 + 1]);
                        i17 = (-181 % i11);
                    } catch (ArithmeticException a_e) {}
                    Test.fFld = i7;
                    i11 >>= (int)-462944556L;
                }
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 + i16 + i17;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(float f) {


        iMeth();
        vSmallMeth_check_sum += Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        int i18=-76, i19=192, i20=-138, i21=70, i22=-152, i23=3, i24=20433, i25=2, i26=11629, i27=34471;
        double d1=-1.39558;
        byte by=-36;
        float fArr1[]=new float[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(fArr1, 0.494F);
        FuzzerUtils.init(bArr, true);

        for (int smallinvoc=0; smallinvoc<637; smallinvoc++) vSmallMeth(Test.fFld);
        for (i18 = 336; i18 > 20; i18--) {
            i19 = i19;
            for (i20 = 1; i20 < 80; ++i20) {
                d1 -= i18;
                i21 >>= i19;
                Test.iArrFld[i18][i20 - 1] = i20;
                i19 += i20;
                i21 += i20;
                Test.instanceCount += i20;
                i22 = 1;
                while (++i22 < 2) {
                    Test.fFld += (i22 * i22);
                    i19 *= 191;
                    i21 -= i18;
                    Test.iArrFld[i18 - 1] = Test.iArrFld[i22 - 1];
                    i19 -= (int)137L;
                    i19 *= Test.sFld;
                    Test.instanceCount = (long)Test.fFld;
                }
            }
            for (i23 = 2; 80 > i23; i23 += 3) {
                for (i25 = i23; 4 > i25; ++i25) {
                    Test.instanceCount += (-5 + (i25 * i25));
                    Test.instanceCount += (((i25 * i26) + i19) - i22);
                    fArr1[i18] -= by;
                    bArr = bArr;
                    Test.iArrFld[i23][i18] += i25;
                }
                i26 -= (int)Test.instanceCount;
            }
        }
        i27 = 1;
        do {
            d1 = -88;
            by += (byte)i27;
            Test.instanceCount += i27;
        } while ((i27 += 2) < 327);

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 d1 i22 = " + i21 + "," + Double.doubleToLongBits(d1) + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 by i27 = " + i26 + "," + by + "," + i27);
        FuzzerUtils.out.println("fArr1 bArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
            FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.sFld Test.iArrFld = " + Test.sFld + "," + FuzzerUtils.checkSum(Test.iArrFld));

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
