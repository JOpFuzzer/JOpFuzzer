// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:47 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=14L;
    public static double dFld=-94.43296;
    public static float fFld=-38.309F;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2274);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, int i4, double d) {

        int i5=13, i6=-30943, i7=-11, i8=14519, i9=53655, i10=-31992, iArr[][]=new int[N][N];
        short s=-61;
        byte by1=-69;
        long lArr[]=new long[N];
        double dArr[]=new double[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, 9L);
        FuzzerUtils.init(iArr, -51821);
        FuzzerUtils.init(dArr, 2.18397);
        FuzzerUtils.init(fArr, 58.107F);

        for (i5 = 5; i5 < 312; ++i5) {
            for (i7 = 1; 5 > i7; ++i7) {
                Test.fFld = i4;
                for (i9 = 1; 2 > i9; ++i9) {
                    switch ((((i5 >>> 1) % 2) * 5) + 98) {
                    case 102:
                        i8 /= (int)(i3 | 1);
                        lArr[i5 - 1] -= i5;
                        i6 += (((i9 * Test.fFld) + Test.fFld) - i5);
                        i6 = (int)Test.instanceCount;
                        break;
                    case 105:
                        switch ((i5 % 7) + 75) {
                        case 75:
                            s += (short)(i9 - Test.instanceCount);
                            i3 = by1;
                            i4 += (i9 * i9);
                        case 76:
                            iArr = iArr;
                        case 77:
                            Test.iArrFld[i5] -= i6;
                        case 78:
                            dArr[(i7 >>> 1) % N] = i10;
                        case 79:
                            Test.iArrFld[i9] = i8;
                            break;
                        case 80:
                        case 81:
                            if (i5 != 0) {
                                vMeth1_check_sum += i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + i9 + i10
                                    + s + by1 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
                                    Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
                                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                                return;
                            }
                        default:
                            fArr[i7] -= Test.instanceCount;
                        }
                        break;
                    default:
                        d *= i10;
                    }
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + i9 + i10 + s + by1 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(float f) {

        int i2=-4;
        boolean b=false;

        Test.iArrFld[(i2 >>> 1) % N] = i2;
        if (b) {
            vMeth1(i2, i2, Test.dFld);
            i2 = (int)429583985L;
        }
        b = b;
        i2 |= (int)Test.instanceCount;
        vMeth_check_sum += Float.floatToIntBits(f) + i2 + (b ? 1 : 0);
    }

    public int iMeth(long l, int i1) {

        int i11=32553, i12=-3, i13=-11, i14=28470;
        byte by2=-75;
        long lArr1[]=new long[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(lArr1, -7191L);
        FuzzerUtils.init(fArr1, 76.17F);

        Test.fFld = i1;
        vMeth(Test.fFld);
        i1 += i1;
        Test.instanceCount |= i1;
        for (long l1 : lArr1) {
            fArr1[(i1 >>> 1) % N] = l1;
        }
        for (i11 = 6; i11 < 148; ++i11) {
            Test.iArrFld[i11] -= i11;
            for (i13 = i11; i13 < 11; i13++) {
                Test.fFld += (((i13 * Test.fFld) + i1) - i13);
                Test.fFld -= Test.fFld;
                i14 += (((i13 * Test.fFld) + i1) - Test.instanceCount);
                i12 = (int)Test.instanceCount;
                if (Test.bFld) break;
                i14 |= by2;
            }
        }
        long meth_res = l + i1 + i11 + i12 + i13 + i14 + by2 + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=30244, i15=49004, i16=-40505, i17=-981, i18=33, i19=208, i20=-68, i21=-7, i22=-8, i23=162, i24=23,
            i25=44064;
        byte by=38;
        long l2=3L, l3=420970884L;
        float f1=-2.474F;
        short s1=26642;
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, -4.47228);

        i *= (i *= ((11 % ((i % (by | 1)) | 1)) + i));
        i -= (int)(((Test.dFld + Test.instanceCount) - i) * (iMeth(Test.instanceCount, 181) - l2));
        l2 -= (long)-1.236F;
        for (l3 = 344; l3 > 7; l3 -= 2) {
            Test.bFld = Test.bFld;
            Test.dFld = Test.dFld;
            Test.fFld += i;
        }
        dArr1[(i >>> 1) % N] += Test.dFld;
        i *= 58;
        i15 = 99;
        for (f1 = 8; f1 < 259; ++f1) {
            s1 += (short)57;
            i = -1;
            for (i17 = (int)(f1); i17 < 100; ++i17) {
                l2 -= (long)Test.dFld;
                s1 += (short)(0 + (i17 * i17));
                for (i19 = 1; i19 < 1; ++i19) {
                    if (Test.bFld) break;
                    lArrFld[(int)(f1)] *= i18;
                    by >>= (byte)10;
                    if (Test.bFld) break;
                    i -= i18;
                }
            }
            i18 = (int)-14L;
            for (i21 = 1; 100 > i21; i21++) {
                for (i23 = 1; i23 < 2; ++i23) {
                    Test.iArrFld[(i21 >>> 1) % N] = i24;
                    i15 = -66;
                    by -= (byte)i17;
                    i20 += (((i23 * by) + i25) - i19);
                    s1 *= (short)i17;
                }
            }
        }

        FuzzerUtils.out.println("i by l2 = " + i + "," + by + "," + l2);
        FuzzerUtils.out.println("l3 i15 f1 = " + l3 + "," + i15 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i16 s1 i17 = " + i16 + "," + s1 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 dArr1 = " + i24 + "," + i25 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.fFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld Test.iArrFld lArrFld = " + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));

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
