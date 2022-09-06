// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=47416L;
    public static byte byFld=-104;
    public static double dFld=37.102031;
    public static float fFld=-60.656F;
    public static volatile int iFld=-200;
    public static long lArrFld[][]=new long[N][N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1836583679L);
        FuzzerUtils.init(Test.iArrFld, 13);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f2) {

        int i2=4, i3=0, i4=10;
        float f3=1.600F;
        boolean b1=true;

        i2 = 1;
        do {
            i3 -= (int)f3;
            Test.instanceCount += i2;
        } while (++i2 < 215);
        i4 = 1;
        while (++i4 < 313) {
            i3 = i2;
            Test.byFld *= (byte)i3;
            try {
                i3 = (-23541 / i3);
                i3 = (i2 % 30111);
                i3 = (i2 / i3);
            } catch (ArithmeticException a_e) {}
            i3 = i4;
            Test.instanceCount >>= i3;
            i3 += i3;
            switch ((i4 % 2) + 110) {
            case 110:
                i3 -= i3;
                i3 *= i2;
                if (b1) continue;
                Test.instanceCount += (i4 * i4);
                break;
            case 111:
                i3 += i4;
                break;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f2) + i2 + i3 + Float.floatToIntBits(f3) + i4 + (b1 ? 1 : 0);
    }

    public static void vMeth(int i1, long l1) {

        int i5=0, i6=4, i7=28653, iArr[][]=new int[N][N];
        boolean b2=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(dArr, -82.24612);

        vMeth1(0.301F);
        i5 = 1;
        while ((i5 += 3) < 344) {
            if (b2) {
                i1 = i1;
            } else if (b2) {
                i1 = (int)Test.instanceCount;
                Test.instanceCount = i1;
                switch ((i5 % 5) + 2) {
                case 2:
                    l1 += (long)Test.dFld;
                    i1 >>= i1;
                case 3:
                case 4:
                    l1 = Test.instanceCount;
                    iArr[(i5 >>> 1) % N] = iArr[i5 - 1];
                    for (i6 = 1; i6 < 14; ++i6) {
                        i7 += (((i6 * Test.instanceCount) + i1) - Test.instanceCount);
                        Test.fFld += (i6 + i6);
                        i7 -= (int)72.988F;
                    }
                case 5:
                    dArr[i5] -= 82L;
                    break;
                case 6:
                    i7 += (i5 ^ (long)Test.fFld);
                }
            }
        }
        vMeth_check_sum += i1 + l1 + i5 + i6 + i7 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static float fMeth(float f1, long l, boolean b) {

        int i=12, i8=5, i9=-41865, i10=-13;

        i = 1;
        while (++i < 205) {
            vMeth(i, -4058238392L);
            Test.iFld ^= 0;
            l >>= Test.iFld;
            Test.iFld >>>= (int)l;
            Test.instanceCount *= i;
        }
        Test.iFld += Test.byFld;
        Test.iFld = (int)Test.instanceCount;
        for (i8 = 16; i8 < 360; i8++) {
            switch ((((i >>> 1) % 2) * 5) + 71) {
            case 79:
                Test.instanceCount = i10;
                i9 += i8;
                f1 *= (float)Test.dFld;
                l *= (long)1.641F;
                break;
            case 74:
                Test.iFld *= -121;
                break;
            default:
                Test.lArrFld[i8 - 1][i8 - 1] -= (long)Test.fFld;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + l + (b ? 1 : 0) + i + i8 + i9 + i10;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=1.202F, fArr[]=new float[N];
        boolean b3=true;
        int i11=14, i12=-7, i13=-223, i14=129;
        long l2=14L;
        double dArr1[]=new double[N];

        FuzzerUtils.init(fArr, 37.184F);
        FuzzerUtils.init(dArr1, -2.64576);

        f += (fMeth(f, Test.instanceCount, b3) + Test.iFld);
        for (float f4 : fArr) {
            for (i11 = 1; 63 > i11; ++i11) {
                Test.iFld = i12;
                for (i13 = 1; i13 < 2; i13++) {
                    switch ((i13 % 2) + 4) {
                    case 4:
                        dArr1[i11 - 1] += i11;
                        i12 *= Test.iFld;
                        Test.fFld += i13;
                        Test.lArrFld[i11] = Test.lArrFld[i11];
                        break;
                    case 5:
                        Test.byFld += (byte)-213;
                        Test.lArrFld[i11 + 1][i13 + 1] = (long)f;
                        break;
                    default:
                        i12 *= (int)Test.dFld;
                        if (b3) {
                            Test.iFld -= Test.iFld;
                            if (b3) {
                                Test.lArrFld[i13][i11 - 1] -= (long)Test.dFld;
                                i12 += i13;
                                Test.instanceCount += (i13 ^ i11);
                                Test.iArrFld = Test.iArrFld;
                            } else if (b3) {
                                switch ((i11 % 1) + 65) {
                                case 65:
                                    i14 = (int)1.479F;
                                    switch (((i13 % 2) * 5) + 9) {
                                    case 10:
                                        Test.instanceCount *= Test.instanceCount;
                                        i12 += i13;
                                        fArr[i13] -= Test.byFld;
                                        Test.iArrFld[i13] -= 9;
                                        break;
                                    case 11:
                                        Test.iFld = 19942;
                                        Test.iFld = (int)Test.dFld;
                                        break;
                                    }
                                    i14 -= (int)l2;
                                    break;
                                }
                            }
                        } else if (b3) {
                            i14 -= i14;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("f b3 i11 = " + Float.floatToIntBits(f) + "," + (b3 ? 1 : 0) + "," + i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("l2 fArr dArr1 = " + l2 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.dFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld Test.iFld Test.lArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Test.iFld + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}