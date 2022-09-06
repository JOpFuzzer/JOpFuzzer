// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=31544L;
    public static float fFld=-1.645F;
    public static boolean bFld=false;
    public static int iFld=165;
    public static int iFld1=1;
    public static byte byFld=73;
    public static double dArrFld[]=new double[N];
    public static byte byArrFld[]=new byte[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 109.71451);
        FuzzerUtils.init(Test.byArrFld, (byte)-114);
        FuzzerUtils.init(Test.fArrFld, 0.1F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(long l, long l1) {

        int i=-20306, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 1);

        iArr[(i >>> 1) % N] = (int)((iArr[(i >>> 1) % N] += -8) - (l1++));
        i = (i = Math.max(iArr[(i >>> 1) % N], ++i));
        vSmallMeth_check_sum += l + l1 + i + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i5, int i6, int i7) {

        int i8=4, i9=-5, i10=-7, i11=7, i12=11199, i13=177, iArr2[]=new int[N];
        byte by1=-26;
        double d=-1.91870;

        FuzzerUtils.init(iArr2, 64);

        i5 = (int)Test.fFld;
        for (i8 = 18; i8 < 324; ++i8) {
            i10 = 5;
            do {
                i9 |= (int)Test.instanceCount;
                i11 = 1;
                while (--i11 > 0) {
                    boolean b=false;
                    try {
                        iArr2[i8 - 1] = (i7 / 62672);
                        i6 = (-147 % i5);
                        iArr2[(i11 >>> 1) % N] = (-47744 / i10);
                    } catch (ArithmeticException a_e) {}
                    if (b) {
                        iArr2[i8 - 1] += i9;
                        switch ((i8 % 4) + 65) {
                        case 65:
                            try {
                                i5 = (i5 / iArr2[i10]);
                                i9 = (i7 / i12);
                                iArr2[i8 - 1] = (i13 / iArr2[i8]);
                            } catch (ArithmeticException a_e) {}
                            Test.byArrFld[i8] = (byte)i12;
                            i9 *= by1;
                            try {
                                i5 = (i11 / iArr2[i8 + 1]);
                                iArr2[i11 + 1] = (-2020681814 / i13);
                                i13 = (i10 % i9);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 66:
                            d += -201;
                        case 67:
                            i13 <<= i6;
                        case 68:
                            i6 >>>= i11;
                        }
                    } else {
                        iArr2[i10 - 1] -= (int)Test.instanceCount;
                    }
                }
            } while (--i10 > 0);
        }
        vMeth_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + by1 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth1(long l2, int i2, int i3) {

        int i4=1, i14=11, i15=0, i16=-216, i17=-100, i18=197, i19=-45547, i20=-35191, iArr3[]=new int[N];
        double d1=1.74781;

        FuzzerUtils.init(iArr3, -103);

        i4 = 1;
        while (++i4 < 381) {
            vMeth(i3, i2, i4);
            Test.bFld = Test.bFld;
            Test.fFld += (((i4 * i2) + i4) - Test.fFld);
        }
        for (i14 = 4; 173 > i14; i14++) {
            i15 += (i14 * i14);
            try {
                i3 = (i15 / 136);
                i3 = (42935 % i15);
                i3 = (104 / iArr3[i14]);
            } catch (ArithmeticException a_e) {}
            if (Test.bFld) {
                for (i16 = 1; i16 < 9; i16++) {
                    for (i18 = 1; 2 > i18; ++i18) {
                        i19 += (i18 + Test.iFld);
                    }
                    Test.iFld *= i14;
                    i20 = 2;
                    while (--i20 > 0) {
                        Test.iFld1 -= i20;
                        iArr3[i14] -= (int)Test.fFld;
                    }
                }
            } else {
                d1 += i4;
            }
        }
        long meth_res = l2 + i2 + i3 + i4 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr3);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1) {

        byte by=4;
        int i21=170, i22=-9, i23=-14, i24=2607, i25=-2, i26=-7, i27=7, i28=-152, iArr1[]=new int[N];
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, 8960);
        FuzzerUtils.init(lArr, -68L);
        FuzzerUtils.init(fArr, 63.471F);

        i1 = by;
        Test.dArrFld = Test.dArrFld;
        iArr1[(i1 >>> 1) % N] |= (iMeth1(Test.instanceCount, Test.iFld1, 5) >> i1);
        i1 = i21;
        i22 = 352;
        while (--i22 > 0) {
            for (i23 = 1; i23 < 5; i23++) {
                if (true) {
                    for (i25 = 1; 2 > i25; ++i25) {
                        lArr[i22] = i27;
                        iArr1[i25] += i28;
                        Test.iFld1 = (int)1.733F;
                        by += (byte)(((i25 * i21) + i27) - i28);
                        Test.fFld += Test.fFld;
                        Test.instanceCount += i28;
                        fArr[i25] += i21;
                    }
                }
            }
        }
        long meth_res = i1 + by + i21 + i22 + i23 + i24 + i25 + i26 + i27 + i28 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i29=-6, i30=-16, i31=-11, i32=14, i33=-79, i34=-8, i35=13, i36=16611, i37=70, i38=-22533, iArr4[][]=new
            int[N][N];
        double d2=-45.48412;
        short s=6431;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 9L);
        FuzzerUtils.init(iArr4, 163);

        for (int smallinvoc=0; smallinvoc<804; smallinvoc++) vSmallMeth(Test.instanceCount, (Test.instanceCount++) -
            (-iMeth(Test.iFld)));
        Test.iFld += -54535;
        for (i29 = 16; i29 < 355; ++i29) {
            Test.fArrFld = Test.fArrFld;
            for (i31 = 74; i31 > 3; i31--) {
                switch ((i31 % 2) + 63) {
                case 63:
                    for (i33 = 1; i33 < 2; ++i33) {
                        Test.iFld1 <<= (int)Test.instanceCount;
                        lArr1[i29 - 1] = -10972;
                        Test.instanceCount += i33;
                        Test.iFld1 += i33;
                        Test.instanceCount = Test.iFld1;
                        Test.iFld += (i33 * i33);
                    }
                    Test.fFld -= (float)d2;
                    i30 *= Test.iFld1;
                    Test.instanceCount += (i31 | i30);
                    break;
                case 64:
                    iArr4[i29 + 1][i29 - 1] = (int)Test.fFld;
                    Test.fArrFld[i29] = -192;
                    for (i35 = 1; i35 < 2; i35++) {
                        Test.instanceCount += (i35 * Test.instanceCount);
                    }
                    for (i37 = 2; i37 > 1; --i37) {
                        switch ((i29 % 1) + 50) {
                        case 50:
                            i36 -= (int)Test.instanceCount;
                            s += (short)1.619F;
                            break;
                        }
                        Test.instanceCount += (((i37 * Test.instanceCount) + Test.instanceCount) - i37);
                        i34 += (int)(22867L + (i37 * i37));
                        if (Test.bFld) {
                            Test.byFld += (byte)(-56932 + (i37 * i37));
                        } else {
                            try {
                                i36 = (i33 % i38);
                                Test.iFld1 = (i30 / -154);
                                Test.iFld1 = (Test.iFld1 % -9862);
                            } catch (ArithmeticException a_e) {}
                            Test.fFld += (i37 * i29);
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 i33 i34 = " + i32 + "," + i33 + "," + i34);
        FuzzerUtils.out.println("d2 i35 i36 = " + Double.doubleToLongBits(d2) + "," + i35 + "," + i36);
        FuzzerUtils.out.println("i37 i38 s = " + i37 + "," + i38 + "," + s);
        FuzzerUtils.out.println("lArr1 iArr4 = " + FuzzerUtils.checkSum(lArr1) + "," + FuzzerUtils.checkSum(iArr4));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iFld Test.iFld1 Test.byFld = " + Test.iFld + "," + Test.iFld1 + "," + Test.byFld);
        FuzzerUtils.out.println("Test.dArrFld Test.byArrFld Test.fArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.byArrFld) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
