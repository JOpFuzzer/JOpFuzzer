// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:44 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3259589766768257527L;
    public static short sFld=-2074;
    public static float fFld=-90.68F;
    public static int iFld=13164;
    public static byte byFld=-50;
    public int iFld1=33586;
    public static int iFld2=-35287;
    public int iFld3=-18;
    public static volatile long lArrFld[][]=new long[N][N];
    public static float fArrFld[][]=new float[N][N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3368194348020625583L);
        FuzzerUtils.init(Test.fArrFld, 1.536F);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4, float f) {

        double d=1.126864;

        Test.sFld = (short)d;
        i4 = (int)Test.instanceCount;
        long meth_res = i4 + Float.floatToIntBits(f) + Double.doubleToLongBits(d);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2, int i3, long l) {

        int i5=-45357, i6=33, i7=-3185, i8=2, iArr[]=new int[N];
        byte by=45;
        boolean b=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -26.79515);
        FuzzerUtils.init(iArr, -140);

        i3 = iMeth(i3, -100.573F);
        for (i5 = 3; i5 < 218; ++i5) {
            for (i7 = 1; i7 < 7; ++i7) {
                Test.instanceCount += (((i7 * i3) + i7) - l);
                dArr[i5] += Test.instanceCount;
                by = (byte)-50449;
                iArr[(i7 >>> 1) % N] *= i6;
                i6 ^= Test.sFld;
                if (false) break;
            }
            l >>= l;
            i8 += (int)Test.fFld;
            if (false) {
                if (b) {
                    Test.instanceCount += i5;
                }
            } else {
                i3 = i7;
            }
        }
        vMeth_check_sum += i2 + i3 + l + i5 + i6 + i7 + i8 + by + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth() {

        int i9=171, i10=229, i11=-135;
        byte by1=84;
        double d1=7.33919;

        vMeth(-253, Test.iFld, 315262368L);
        Test.iFld *= (int)Test.fFld;
        try {
            for (i9 = 4 - 400; i9 < 154; i9++) {
                Test.lArrFld = FuzzerUtils.long2array(N, (long)-237L);
                by1 -= (byte)Test.fFld;
                try {
                    i10 = (76612283 % i10);
                    i10 = (i9 / -253);
                    i10 = (1349151518 % i10);
                } catch (ArithmeticException a_e) {}
                i11 = 4;
                while (--i11 > 0) {
                    d1 -= 27032;
                    Test.iFld = i9;
                    d1 = i11;
                    Test.instanceCount += (i11 * i11);
                    Test.fArrFld[i9 - 1][i9 + 1] += by1;
                    Test.fFld -= Test.iFld;
                    i10 *= i9;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            i10 *= i9;
        }
        finally {
            Test.fFld -= i11;
        }
        long meth_res = i9 + i10 + by1 + i11 + Double.doubleToLongBits(d1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=0, i1=3773, i12=-64, i13=9, i14=-106, i15=-1042, i16=-38122, i17=-56979, i18=-224, i19=4191;
        boolean b1=true;

        Test.instanceCount >>= (++Test.instanceCount);
        for (i = 6; 306 > i; i += 3) {
            if ((((-(50L * (++i1))) - (-fMeth())) < Test.iFld) == b1) continue;
        }
        i12 = 1;
        do {
            i1 = Test.byFld;
            Test.iFld >>= i;
            i13 = 1;
            while (++i13 < 67) {
                iFld1 += Test.iFld2;
                i1 -= iFld1;
                for (i14 = 1; 1 < i14; i14--) {
                    iFld1 = i1;
                    Test.instanceCount = Test.instanceCount;
                    if (b1) {
                        i15 += (i14 - i13);
                        Test.iFld = 252;
                    }
                    i1 = 136;
                    Test.iFld2 = iFld1;
                    Test.fFld *= i15;
                }
            }
            Test.iFld2 += (((i12 * Test.instanceCount) + Test.iFld2) - i13);
            Test.lArrFld[i12][i12 + 1] = i13;
            for (i16 = 1; i16 < 67; i16++) {
                i1 *= iFld3;
                iArrFld[i16] = i17;
                iFld3 += i1;
                Test.sFld *= (short)-1;
                iFld3 += i16;
                Test.iFld2 ^= iFld1;
                for (i18 = 1; i18 < 2; ++i18) {
                    Test.lArrFld[i16][i18 - 1] = 34759;
                    iFld3 += i18;
                }
            }
        } while (++i12 < 377);

        FuzzerUtils.out.println("i i1 b1 = " + i + "," + i1 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 = " + i18 + "," + i19);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld Test.byFld iFld1 = " + Test.iFld + "," + Test.byFld + "," + iFld1);
        FuzzerUtils.out.println("Test.iFld2 iFld3 Test.lArrFld = " + Test.iFld2 + "," + iFld3 + "," +
            FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.fArrFld iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))
            + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
