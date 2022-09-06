// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:42 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=474333751L;
    public static byte byFld=-26;
    public static volatile short sArrFld[]=new short[N];
    public int iArrFld[]=new int[N];
    public float fArrFld[][]=new float[N][N];
    public static double dArrFld[]=new double[N];
    public static byte byArrFld[][]=new byte[N][N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-18817);
        FuzzerUtils.init(Test.dArrFld, 2.64408);
        FuzzerUtils.init(Test.byArrFld, (byte)-109);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6) {

        byte by1=-70;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -121.60283);

        i6 = i6;
        dArr[(236 >>> 1) % N] = i6;
        i6 ^= by1;
        vMeth1_check_sum += i6 + by1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i1, boolean b1) {

        int i2=-59711, i3=-251, i4=65202, i5=0, i7=48940, i8=-199;
        double d3=117.14615;
        float f=1.493F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 8372229733024820943L);

        for (long l : lArr) {
            for (i2 = 1; 4 > i2; i2++) {
                i3 += (-142 + (i2 * i2));
            }
            for (i4 = 1; i4 < 4; ++i4) {
                vMeth1(i5);
                Test.instanceCount *= i5;
                i1 -= (int)d3;
                i5 = (int)f;
                f += (((i4 * l) + i2) - Test.instanceCount);
                i5 += (int)f;
                for (i7 = 1; i7 < 2; ++i7) {
                    i1 += (i7 | i1);
                    Test.sArrFld = Test.sArrFld;
                    i5 = i1;
                    l += i7;
                }
            }
        }
        vMeth_check_sum += i1 + (b1 ? 1 : 0) + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d3) +
            Float.floatToIntBits(f) + i7 + i8 + FuzzerUtils.checkSum(lArr);
    }

    public int iMeth(byte by) {

        boolean b2=true;
        int i9=-141, i10=-32923, i11=-44775, i12=-42238;
        float f1=-2.430F;
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, -22.43768);

        vMeth(58569, b2);
        for (i9 = 17; i9 < 369; ++i9) {
            for (i11 = i9; i11 < 5; ++i11) {
                Test.instanceCount += (((i11 * i10) + f1) - i10);
                i12 = (int)Test.instanceCount;
                dArr1[i9 + 1] = i11;
            }
            i12 = (int)Test.instanceCount;
            iArrFld[i9] = i10;
            f1 = (float)0.111125;
        }
        long meth_res = by + (b2 ? 1 : 0) + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=0.83584, d1=-53.99253, d2=0.47867, d4=-112.110529;
        boolean b=false;
        int i=2;
        float f2=1.584F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 12L);

        d = 1;
        do {
            d1 = 1;
            do {
                b = (b = (b != (b == b)));
                for (d2 = 1; d2 > 1; --d2) {
                    switch ((int)((d2 % 7) + 67)) {
                    case 67:
                        i *= iMeth(Test.byFld);
                        break;
                    case 68:
                        b = b;
                        i >>= 16825;
                    case 69:
                        lArr1[(int)(d + 1)] = i;
                        i -= i;
                        fArrFld[(int)(d1)][(int)(d1 - 1)] += Test.byFld;
                        break;
                    case 70:
                        b = b;
                        i <<= (int)-205L;
                        if (b) break;
                        switch ((int)((d1 % 2) + 58)) {
                        case 58:
                            Test.dArrFld[(int)(d1)] -= i;
                            i = -155;
                            Test.byFld = (byte)Test.instanceCount;
                        case 59:
                            f2 += i;
                            d4 -= i;
                            break;
                        }
                        break;
                    case 71:
                        if (true) {
                            lArr1[(int)(d + 1)] = i;
                            f2 += (float)d2;
                        } else {
                            iArrFld = iArrFld;
                        }
                        break;
                    case 72:
                        i = i;
                        i -= 58956;
                        break;
                    case 73:
                        Test.byArrFld = FuzzerUtils.byte2array(N, (byte)-68);
                        break;
                    }
                    Test.instanceCount = Test.instanceCount;
                    f2 = i;
                    Test.instanceCount += (long)d2;
                }
            } while (++d1 < 84);
        } while (++d < 301);

        FuzzerUtils.out.println("d d1 b = " + Double.doubleToLongBits(d) + "," + Double.doubleToLongBits(d1) + "," + (b
            ? 1 : 0));
        FuzzerUtils.out.println("d2 i f2 = " + Double.doubleToLongBits(d2) + "," + i + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("d4 lArr1 = " + Double.doubleToLongBits(d4) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.sArrFld = " + Test.instanceCount + "," + Test.byFld
            + "," + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println("iArrFld fArrFld Test.dArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.byArrFld = " + FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
