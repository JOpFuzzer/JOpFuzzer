// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:46 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=828642378L;
    public short sFld=-13994;
    public byte byFld=-72;
    public static int iArrFld[]=new int[N];
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -3);
        FuzzerUtils.init(Test.dArrFld, -1.30711);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i2, int i3) {

        int i4=-240, i5=-13;
        byte by=20;
        float f=0.814F;

        for (i4 = 9; i4 < 364; i4++) {
            i3 = by;
            i5 += (i4 | i4);
            f += i3;
        }
        long meth_res = i2 + i3 + i4 + i5 + by + Float.floatToIntBits(f);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i6=48274, i7=30216, i8=-5, i9=-12978, i10=33200, i11=-32;
        boolean b=false;
        byte by1=-7;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -38540L);

        iMeth1(i6, i6);
        try {
            i7 = 1;
            while (++i7 < 180) {
                Test.iArrFld[i7 + 1] -= i7;
                i6 <<= 189;
                for (i8 = 1; i8 < 9; i8++) {
                    Test.dArrFld[i8 + 1] = Test.instanceCount;
                    if (b) {
                        if (true) {
                            for (i10 = 2; 1 < i10; i10 -= 3) {
                                if (i8 != 0) {
                                }
                                i6 += (i10 * i10);
                            }
                            lArr[(i9 >>> 1) % N] = Test.instanceCount;
                        } else {
                            Test.instanceCount = i8;
                            i6 %= (int)(i8 | 1);
                        }
                    } else {
                        i6 += by1;
                    }
                }
            }
        }
        catch (NullPointerException exc1) {
            i6 -= (int)Test.instanceCount;
        }
        long meth_res = i6 + i7 + i8 + i9 + i10 + i11 + (b ? 1 : 0) + by1 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        int i1=6, i12=17060, i13=56;

        i1 = 1;
        do {
            if (iMeth() >= Test.instanceCount) continue;
            i -= i;
            if (i != 0) {
                vMeth_check_sum += i + i1 + i12 + i13;
                return;
            }
            Test.instanceCount += i1;
            Test.iArrFld[i1] = i;
            i -= -95;
            for (i12 = 1; i12 < 4; i12++) {
                i13 += i;
                i13 += i13;
                switch ((((i13 >>> 1) % 2) * 5) + 69) {
                case 71:
                    Test.instanceCount |= i13;
                    break;
                case 77:
                    Test.instanceCount = i12;
                    i13 = (int)Test.instanceCount;
                    i13 >>= i12;
                default:
                    i13 += (((i12 * i12) + i) - i13);
                }
            }
        } while (++i1 < 393);
        vMeth_check_sum += i + i1 + i12 + i13;
    }

    public void mainTest(String[] strArr1) {

        int i14=30388, i15=-7, i16=-9, i17=-38342, i18=11, i19=234, i20=-7, i21=230, i22=-2, i23=55332, i24=5,
            i25=26504;
        long l=0L;
        float f1=1.461F, fArr[][]=new float[N][N];
        double d=0.21400;

        FuzzerUtils.init(fArr, -1.487F);

        vMeth(i14);
        for (i15 = 261; i15 > 8; --i15) {
            sFld >>= (short)i15;
            i16 = i14;
            for (l = i15; 99 > l; l++) {
                i17 *= (int)42680L;
                i14 += (int)(l * l);
                i17 |= (int)l;
                f1 *= i15;
                sFld = (short)Test.instanceCount;
                byFld >>>= (byte)57145;
                Test.instanceCount *= l;
                d = -195;
            }
            for (i18 = 1; i18 < 99; ++i18) {
                d += i16;
                i17 += (i18 + Test.instanceCount);
            }
            i17 |= (int)l;
        }
        for (i20 = 5; i20 < 171; i20++) {
            for (i22 = 8; i22 < 151; ++i22) {
                Test.instanceCount += (i22 * i22);
                fArr[i20 - 1][i22 - 1] *= i21;
                d -= i23;
                for (i24 = 1; 2 > i24; ++i24) {
                    i23 += (int)Test.instanceCount;
                    switch ((i24 % 2) + 70) {
                    case 70:
                        i21 = (int)Test.instanceCount;
                        i25 += (i24 * i17);
                        i25 += (((i24 * Test.instanceCount) + f1) - i25);
                        break;
                    case 71:
                        Test.instanceCount += (i24 - l);
                        i25 = (int)-2L;
                        break;
                    default:
                        i19 -= i20;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("l i17 f1 = " + l + "," + i17 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("d i18 i19 = " + Double.doubleToLongBits(d) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount sFld byFld = " + Test.instanceCount + "," + sFld + "," + byFld);
        FuzzerUtils.out.println("Test.iArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}