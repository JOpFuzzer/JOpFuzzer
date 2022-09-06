// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:57 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=3868449903L;
    public static byte byFld=-72;
    public static int iFld=47604;
    public static double dFld=99.65352;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static long lArrFld1[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 41166);
        FuzzerUtils.init(Test.lArrFld, 4191659910L);
        FuzzerUtils.init(Test.lArrFld1, 3744259294L);
    }

    public static long fMeth_check_sum = 0;
    public static long fMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static float fMeth(float f) {

        short s=22376;
        int i=-45110;
        double d=-2.104637;
        byte by=124;

        Test.instanceCount = (long)(((s - i) + (i - f)) - Math.min((int)(d + i), i++));
        i -= (int)(((s + by) + (--i)) + (-(i * f)));
        long meth_res = Float.floatToIntBits(f) + s + i + Double.doubleToLongBits(d) + by;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth() {

        int i5=-38, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 88);

        Test.iArrFld = iArr;
        Test.iArrFld[(164 >>> 1) % N] &= 14;
        Test.lArrFld[(i5 >>> 1) % N] <<= Test.instanceCount;
        iArr[(i5 >>> 1) % N] = 218;
        i5 = (int)Test.instanceCount;
        long meth_res = i5 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l, int i4) {

        int i6=0, i7=225, i8=95, i9=-29376, i10=-19720;
        double d1=-1.88450;
        float f1=2.289F;
        byte by1=-15;
        boolean b=true;

        Test.instanceCount = lMeth();
        for (i6 = 1; i6 < 198; i6++) {
            for (i8 = 8; i8 > 1; i8--) {
                d1 += f1;
                Test.instanceCount += i8;
                l >>= Test.instanceCount;
                if (false) {
                    i4 *= i8;
                } else {
                    i10 = 1;
                    do {
                        by1 += (byte)(i10 - f1);
                    } while (++i10 < 2);
                }
                Test.instanceCount -= (long)f1;
                if (b) {
                    Test.iArrFld[i6 + 1] |= (int)l;
                    i7 = i4;
                    by1 += (byte)i8;
                } else if (b) {
                    Test.lArrFld[i8] += i6;
                } else {
                    i4 += i7;
                }
            }
        }
        vMeth_check_sum += l + i4 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i10 +
            by1 + (b ? 1 : 0);
    }

    public static float fMeth1(int i1) {

        int i2=1, i3=63418;
        double d2=-2.50200;
        float f2=0.610F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 238L);

        lArr[(i1 >>> 1) % N] = (--i1);
        for (i2 = 346; i2 > 10; i2--) {
            vMeth(Test.instanceCount, i2);
        }
        Test.byFld ^= (byte)i2;
        Test.instanceCount -= i1;
        if (false) {
            i1 = i3;
        }
        Test.instanceCount -= (long)d2;
        f2 -= Test.instanceCount;
        long meth_res = i1 + i2 + i3 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(lArr);
        fMeth1_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i11=-2, i12=-169, i13=-9, i14=225, i15=52, i16=-8, i17=64049, i18=25772, i19=-12, i20=0;
        float f3=-73.897F;
        short s1=2527;

        fMeth(fMeth1(Test.iFld));
        Test.iFld = (int)Test.dFld;
        for (i11 = 19; i11 < 360; ++i11) {
            Test.iFld -= (int)-2.33743;
            Test.iFld += (i11 * i11);
            Test.bFld = Test.bFld;
            f3 += Test.instanceCount;
            i12 = (int)2210368336L;
        }
        for (i13 = 13; i13 < 373; i13++) {
            for (i15 = 70; i15 > 2; i15 -= 3) {
                i17 += (i15 * i15);
            }
            f3 += (-220 + (i13 * i13));
            i14 = i11;
            Test.iArrFld[i13 + 1] = (int)Test.instanceCount;
        }
        Test.instanceCount += (long)f3;
        f3 = i11;
        i18 = 1;
        while (++i18 < 200) {
            s1 = (short)i17;
            for (i19 = 6; i19 < 126; i19++) {
                if (true) continue;
                i12 = i13;
                i12 = (int)Test.instanceCount;
                Test.lArrFld[i18] -= -127;
                Test.iArrFld[i18 + 1] <<= i18;
                Test.iArrFld[i19] <<= (int)Test.instanceCount;
                try {
                    Test.iArrFld[i18 - 1] = (-54 / Test.iArrFld[i18]);
                    i20 = (i16 % -3710);
                    i20 = (i19 / Test.iFld);
                } catch (ArithmeticException a_e) {}
            }
            if (Test.bFld) {
            } else {
                Test.lArrFld1[i18] += i20;
                Test.iFld += (i18 * i18);
            }
            if (false) continue;
        }

        FuzzerUtils.out.println("i11 i12 f3 = " + i11 + "," + i12 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("s1 i19 i20 = " + s1 + "," + i19 + "," + i20);

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.iFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Test.iFld);
        FuzzerUtils.out.println("Test.dFld Test.bFld Test.iArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            (Test.bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld Test.lArrFld1 = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld1));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth1_check_sum: " + fMeth1_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  fMeth1 ->  fMeth1 mainTest
//DEBUG  vMeth ->  vMeth fMeth1 mainTest
//DEBUG  lMeth ->  lMeth vMeth fMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
