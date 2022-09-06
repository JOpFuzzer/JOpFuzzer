// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:41 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6701980569936817888L;
    public static int iFld=-13;
    public byte byFld=48;
    public float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 40952L);
        FuzzerUtils.init(Test.iArrFld, 67);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vMeth(int i1, long l, int i2) {

        int i3=-4, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 43934);

        iArr[(Test.iFld >>> 1) % N] = ((-(i3 * i1)) - (-(i1--)));
        i1 -= i3;
        vMeth_check_sum += i1 + l + i2 + i3 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(long l1) {

        boolean b=true;
        int i4=50931, i5=-40658, i6=-148, i7=-5680, i8=2, i9=11569, i10=-141, i11=-48348, iArr1[]=new int[N];
        float f=105.569F;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, -18599);
        FuzzerUtils.init(dArr, 66.26089);

        vMeth(Test.iFld, l1, 13);
        b = false;
        if (b) {
            for (i4 = 2; i4 < 346; i4++) {
                for (i6 = i4; i6 < 5; ++i6) {
                    iArr1[i4 - 1] *= i5;
                    switch ((i6 % 1) + 77) {
                    case 77:
                        for (i8 = 1; i8 > 1; i8--) {
                            l1 += (i8 | Test.instanceCount);
                        }
                        i9 *= i9;
                        dArr[i6 - 1] += i8;
                        Test.iFld += (int)l1;
                    default:
                        for (i10 = 1; i10 < 1; i10++) {
                            Test.instanceCount += (-5 + (i10 * i10));
                            i11 += (i10 + i10);
                        }
                    }
                }
            }
        } else {
            f = i11;
        }
        long meth_res = l1 + (b ? 1 : 0) + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth() {

        short s=2028;
        float f1=-1.823F;

        vMeth((int)(Test.instanceCount + (--Test.lArrFld[(Test.iFld >>> 1) % N])), (s += (short)Math.abs(Test.iFld)) +
            (Test.lArrFld[(8 >>> 1) % N] * iMeth(Test.instanceCount)), Test.iFld);
        f1 *= 0;
        vSmallMeth_check_sum += s + Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {

        int i=-6, i12=14, i13=2, i14=12, i15=-1606, i16=227, i17=12, i18=-154, i19=7;
        double d=0.125508;
        short s1=19750;
        long l2=-12493L;
        float f2=-1.186F;

        fArrFld[(13 >>> 1) % N] *= Test.iFld;
        i = 1;
        do {
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth();
            Test.iFld <<= (int)Test.instanceCount;
            switch (((i % 2) * 5) + 123) {
            case 125:
                Test.instanceCount <<= -14;
                d -= i;
                s1 += (short)(-247 + (i * i));
                Test.instanceCount -= -37L;
                break;
            case 126:
                for (l2 = 169; l2 > i; --l2) {
                    Test.lArrFld = Test.lArrFld;
                    Test.iFld -= i;
                    d -= i;
                }
            }
            byFld = (byte)Test.iFld;
            i13 = 1;
            while (++i13 < 169) {
                Test.lArrFld[i13] -= byFld;
                i12 += (i13 + i12);
                Test.iArrFld[(i13 >>> 1) % N] += -180;
                i12 = 3;
                f2 -= Test.iFld;
            }
            i14 = 1;
            while ((i14 += 3) < 169) {
                for (i15 = 1; i15 < 4; ++i15) {
                    i16 = 13;
                    i16 -= Test.iFld;
                    Test.instanceCount ^= Test.iFld;
                    Test.instanceCount = 10L;
                    i12 -= i14;
                }
                for (i17 = i; i17 < 4; ++i17) {
                    i16 ^= i13;
                    i19 = i17;
                }
            }
        } while (++i < 148);

        FuzzerUtils.out.println("i d s1 = " + i + "," + Double.doubleToLongBits(d) + "," + s1);
        FuzzerUtils.out.println("l2 i12 i13 = " + l2 + "," + i12 + "," + i13);
        FuzzerUtils.out.println("f2 i14 i15 = " + Float.floatToIntBits(f2) + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 = " + i19);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld byFld = " + Test.instanceCount + "," + Test.iFld + "," +
            byFld);
        FuzzerUtils.out.println("fArrFld Test.lArrFld Test.iArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

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
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test iMeth
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}