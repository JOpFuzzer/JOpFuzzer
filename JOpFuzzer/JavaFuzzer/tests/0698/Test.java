// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-9L;
    public static byte byFld=-36;
    public static float fFld=-30.442F;
    public int iFld=-50223;
    public static byte byArrFld[]=new byte[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)107);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        double d=-2.13875, d1=0.100433;
        int i3=46073, i4=-3, i6=104, i7=50842, i8=-5, i9=1, i10=9, i11=7;
        long lArr[][]=new long[N][N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(lArr, -3229929344L);
        FuzzerUtils.init(byArr, (byte)58);

        d = Test.instanceCount;
        for (i3 = 7; i3 < 380; ++i3) {
            int i5=108;
            Test.instanceCount = i3;
            Test.instanceCount += (((i3 * i5) + i5) - Test.instanceCount);
            i5 -= i5;
        }
        for (i6 = 6; i6 < 327; i6++) {
            for (i8 = 1; i8 < 5; i8++) {
                lArr[i8 + 1][i8] -= i7;
                i9 = -17038;
                d = Test.instanceCount;
                i4 += i8;
                for (d1 = 1; d1 < 2; ++d1) {
                    Test.instanceCount += (long)d1;
                    byArr[i8 - 1] = (byte)i11;
                    i10 = i9;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i3 + i4 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) + i10 +
            i11 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i1, long l, int i2) {

        int i12=-55771, i13=-11, i14=0, i15=180, i16=17640, iArr[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 11);
        FuzzerUtils.init(lArr1, -196L);

        iArr[(6 >>> 1) % N] = (int)lMeth();
        i12 = 1;
        while (++i12 < 364) {
            for (i13 = 1; i13 < 5; i13++) {
                i1 = (int)l;
                Test.byFld |= (byte)l;
                if (false) {
                    for (i15 = 2; i12 < i15; --i15) {
                        Test.instanceCount = i2;
                        iArr[i15 - 1] >>= i13;
                        l += Test.instanceCount;
                        i1 += i15;
                        i2 = (int)Test.fFld;
                        Test.byArrFld[i13] = (byte)110.408F;
                        i16 -= i2;
                        i14 = i13;
                    }
                    vMeth1_check_sum += i1 + l + i2 + i12 + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr) +
                        FuzzerUtils.checkSum(lArr1);
                    return;
                } else {
                    lArr1[i13 + 1] -= l;
                }
            }
        }
        vMeth1_check_sum += i1 + l + i2 + i12 + i13 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i) {

        int i17=6, i18=-63, i19=-4, i20=-26044, iArr1[]=new int[N];
        long l1=-3245372307L;
        short s=-31436;

        FuzzerUtils.init(iArr1, 175);

        Test.instanceCount = (--i);
        vMeth1(i, Test.instanceCount, i);
        i >>= -8;
        for (i17 = 14; i17 < 333; i17++) {
            switch (((i17 % 4) * 5) + 49) {
            case 67:
                for (l1 = 1; l1 < 5; ++l1) {
                    i19 -= (int)2.555F;
                    if (i != 0) {
                        vMeth_check_sum += i + i17 + i18 + l1 + i19 + s + i20 + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    s += (short)(((l1 * i) + Test.instanceCount) - i17);
                    Test.instanceCount &= l1;
                    iArr1[i17 + 1] += i;
                    i20 = 1;
                    while (++i20 < 2) {
                        i18 = -37499;
                        i %= (int)(i18 | 1);
                        i = i20;
                    }
                }
                break;
            case 54:
                Test.fFld += (123L + (i17 * i17));
                break;
            case 60:
                Test.instanceCount -= i19;
            case 57:
                iArr1[i17 - 1] = -53;
                break;
            default:
                if (i17 != 0) {
                    vMeth_check_sum += i + i17 + i18 + l1 + i19 + s + i20 + FuzzerUtils.checkSum(iArr1);
                    return;
                }
            }
        }
        vMeth_check_sum += i + i17 + i18 + l1 + i19 + s + i20 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i22=-69, i23=228;

        vMeth(iFld);
        iFld = (int)Test.instanceCount;
        iFld = Test.byFld;
        for (i22 = 17; i22 < 347; i22++) {
            i23 = (int)Test.instanceCount;
            i23 <<= i23;
            Test.instanceCount &= Test.byFld;
        }
        Test.instanceCount = -229143269L;
        lArrFld[(i22 >>> 1) % N] += Test.instanceCount;

        FuzzerUtils.out.println("i22 i23 = " + i22 + "," + i23);

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("iFld Test.byArrFld lArrFld = " + iFld + "," + FuzzerUtils.checkSum(Test.byArrFld) +
            "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}