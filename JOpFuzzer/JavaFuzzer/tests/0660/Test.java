// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3483881858L;
    public static int iFld=129;
    public static double dFld=-47.98425;
    public static short sFld=-17662;
    public static volatile float fFld=90.889F;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 8716280478152017028L);
        FuzzerUtils.init(Test.iArrFld, 17140);
        FuzzerUtils.init(Test.sArrFld, (short)-27198);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static void vMeth1(int i1) {

        byte by=50;
        short s=12289;

        by *= (byte)(s--);
        vMeth1_check_sum += i1 + by + s;
    }

    public static int iMeth(short s2, int i6, long l1) {

        double d1=2.81910;
        int i7=9, i8=1, i9=-21, i10=-7318;
        float f1=86.841F;
        byte by1=-50;

        d1 = 1;
        while (++d1 < 144) {
            Test.iFld = (int)l1;
            Test.iFld &= -31835;
            if (true) {
                for (i7 = 1; i7 < 11; i7++) {
                    Test.lArrFld = Test.lArrFld;
                    i6 += (i7 * i7);
                    Test.iFld -= (int)Test.instanceCount;
                    for (f1 = 1; 2 > f1; ++f1) {
                        Test.iArrFld[i7 + 1][(int)(f1)] = Test.iFld;
                        l1 += i6;
                    }
                    i10 = 1;
                    while (++i10 < 2) {
                        boolean b1=false;
                        i9 &= -5;
                        b1 = true;
                        l1 = l1;
                    }
                }
            } else {
                by1 += (byte)(((d1 * l1) + i6) - Test.iFld);
            }
        }
        long meth_res = s2 + i6 + l1 + Double.doubleToLongBits(d1) + i7 + i8 + Float.floatToIntBits(f1) + i9 + i10 +
            by1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth(long l) {

        int i4=-16226, i5=-40363, i11=-44, i12=-11, i13=246, i14=-2, i15=-58346;
        float f=90.449F;
        boolean b2=false;
        byte by2=49;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -21.53583);

        switch (((((int)(Test.iFld - Test.instanceCount)) >>> 1) % 9) + 98) {
        case 98:
            Test.iFld >>= (int)(Test.lArrFld[(-81 >>> 1) % N] | (Test.iFld--));
            Test.dFld += (((--i4) + (Test.iFld--)) * (Test.sFld % (Math.abs(i4) | 1)));
        case 99:
            for (f = 2; f < 147; ++f) {
                switch ((int)((f % 2) + 21)) {
                case 21:
                    Test.iArrFld[(int)(f)][(int)(f)] = iMeth(Test.sFld, i5, 46290L);
                    i4 ^= (int)2247840718682844838L;
                    if (b2) {
                        for (i11 = 1; i11 < 11; ++i11) {
                            for (i13 = i11; i13 < 2; i13++) {
                                Test.iFld *= i5;
                                Test.lArrFld[i13 - 1] *= i14;
                                i5 += (-97 + (i13 * i13));
                                Test.iArrFld[i13 - 1][i11] += (int)136L;
                                i5 += -142;
                            }
                        }
                    }
                case 22:
                    l &= i11;
                    break;
                }
            }
            break;
        case 100:
            Test.dFld -= i14;
        case 101:
            Test.instanceCount += Test.instanceCount;
            break;
        case 102:
            i5 = i5;
            break;
        case 103:
            Test.fFld = i15;
        case 104:
            i4 >>= i13;
        case 105:
            Test.iArrFld[(Test.iFld >>> 1) % N][(-12 >>> 1) % N] = by2;
        case 106:
            Test.fFld = 13;
            break;
        }
        long meth_res = l + i4 + Float.floatToIntBits(f) + i5 + i11 + i12 + i13 + i14 + (b2 ? 1 : 0) + i15 + by2 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(int i) {

        int i2=0, i3=14, i16=-6, i17=58105, i18=-13, i19=0;
        short s1=26420;
        byte by3=-64;
        float fArr1[][]=new float[N][N];

        FuzzerUtils.init(fArr1, -92.934F);

        vMeth1(i);
        for (i2 = 150; i2 > 3; i2 -= 2) {
            s1 += (short)(((i2 * Test.instanceCount) + s1) - i2);
            Test.instanceCount *= ((sMeth(Test.instanceCount) + -19319) * 61053);
            for (i16 = 1; i16 < 21; i16++) {
                for (i18 = i2; i18 < 2; i18++) {
                    Test.iArrFld[i16 - 1][i2] <<= i18;
                    switch ((i18 % 3) + 33) {
                    case 33:
                        Test.iFld -= i18;
                        Test.sArrFld = Test.sArrFld;
                        i19 += by3;
                        i19 /= (int)(Test.instanceCount | 1);
                    case 34:
                        Test.iFld = (int)Test.instanceCount;
                        Test.fFld *= 20L;
                        by3 += (byte)(((i18 * i19) + i19) - i3);
                        break;
                    case 35:
                        fArr1[i2][i2] += i2;
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += i + i2 + i3 + s1 + i16 + i17 + i18 + i19 + by3 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        double d=0.95724;
        boolean b=true;
        int i20=-254, i21=-43907, i22=6, i23=25, i24=43935, i25=57960, i26=63039;
        byte by4=2, byArr[]=new byte[N];
        long l2=-150L;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.979F);
        FuzzerUtils.init(byArr, (byte)120);

        fArr[(Test.iFld >>> 1) % N] = (byArr[(Test.iFld >>> 1) % N] <<= (byte)((233 - (Test.iFld + d)) * (Test.iFld /
            ((long)(d) | 1))));
        Test.iFld = (int)(Test.instanceCount--);
        b = (b = b);
        vMeth(Test.iFld);
        Test.iFld = 2;
        i20 = 1;
        do {
            Test.iArrFld[i20][i20] *= (int)Test.instanceCount;
            for (i21 = 120; i21 > 7; i21--) {
                i22 *= 49829;
                Test.iFld += i21;
                d = Test.instanceCount;
                Test.iArrFld[i21 - 1][i20] >>>= Test.iFld;
                Test.sFld += (short)Test.iFld;
                switch ((((Test.iFld >>> 1) % 2) * 5) + 10) {
                case 13:
                    for (i23 = 1; i23 < 2; i23++) {
                        Test.sFld += (short)(i23 + Test.iFld);
                        Test.instanceCount |= i20;
                    }
                    Test.instanceCount += (((i21 * Test.sFld) + Test.instanceCount) - i23);
                case 18:
                    Test.fFld += i21;
                    Test.lArrFld[i20 - 1] %= ((long)(d) | 1);
                    break;
                }
                Test.instanceCount = by4;
                Test.fFld += i21;
                Test.fFld += (19444 + (i21 * i21));
                for (l2 = 1; l2 < 2; ++l2) {
                    if (b) continue;
                    Test.iArrFld[(int)(l2 - 1)][(int)(l2 - 1)] = i25;
                    switch (((i20 % 2) * 5) + 34) {
                    case 44:
                        try {
                            Test.iFld = (i20 / 173);
                            i24 = (146 / i24);
                            i25 = (Test.iArrFld[i20 + 1][i20] % 4573);
                        } catch (ArithmeticException a_e) {}
                        i22 *= i25;
                        if (b) continue;
                        break;
                    case 43:
                        i26 += (int)(l2 | i24);
                        break;
                    default:
                        i25 *= Test.sFld;
                    }
                }
            }
        } while (++i20 < 209);

        FuzzerUtils.out.println("d b i20 = " + Double.doubleToLongBits(d) + "," + (b ? 1 : 0) + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 by4 l2 = " + i24 + "," + by4 + "," + l2);
        FuzzerUtils.out.println("i25 i26 fArr = " + i25 + "," + i26 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.sFld Test.fFld Test.lArrFld = " + Test.sFld + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld Test.sArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}