// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3892787985L;
    public float fFld=62.556F;
    public static byte byFld=64;
    public static int iFld=-162;
    public static short sFld=-20710;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[][]=new int[N][N];
    public static long lArrFld[]=new long[N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -26.42368);
        FuzzerUtils.init(Test.iArrFld, 95);
        FuzzerUtils.init(Test.lArrFld, -190L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(boolean b1, int i7) {

        int i8=137, i9=-242, i10=44573, i11=-65, i12=7, i13=-15724, i14=30;
        float f=-18.524F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        i8 = 1;
        while (++i8 < 225) {
            for (i9 = 1; i9 < 7; i9++) {
                f *= -22330;
                Test.dArrFld[i8 - 1] += i8;
                i7 = (int)Test.instanceCount;
                i7 = (int)Test.instanceCount;
                Test.iArrFld[i8 + 1][i9 - 1] -= i7;
                for (i11 = 1; i11 < 2; i11++) {
                    Test.instanceCount = Test.instanceCount;
                    b1 = b1;
                }
                for (i13 = 2; i13 > 1; i13 -= 2) {
                    bArr[i13] = b1;
                    f = i13;
                    i10 -= i11;
                    i7 += (i13 - i7);
                }
            }
        }
        vMeth2_check_sum += (b1 ? 1 : 0) + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) + i11 + i12 + i13 + i14 +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1(int i4, int i5, int i6) {

        int i16=-218, i17=-14, iArr[]=new int[N];
        float f1=0.553F, fArr[]=new float[N];
        short s=11571;

        FuzzerUtils.init(iArr, -19900);
        FuzzerUtils.init(fArr, -29.199F);

        vMeth2(false, i4);
        i6 -= (int)Test.instanceCount;
        i6 += -14842;
        for (int i15 : iArr) {
            byte by1=-116;
            if (i4 != 0) {
                vMeth1_check_sum += i4 + i5 + i6 + i16 + i17 + Float.floatToIntBits(f1) + s +
                    FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
            Test.instanceCount = -16855;
            by1 = (byte)Test.instanceCount;
            for (i16 = 1; i16 < 4; ++i16) {
                f1 -= i15;
            }
            i6 -= s;
            i4 = s;
            if (i16 != 0) {
                vMeth1_check_sum += i4 + i5 + i6 + i16 + i17 + Float.floatToIntBits(f1) + s +
                    FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
        }
        for (float f2 : fArr) {
            iArr[(i4 >>> 1) % N] <<= i4;
            Test.instanceCount = i17;
        }
        vMeth1_check_sum += i4 + i5 + i6 + i16 + i17 + Float.floatToIntBits(f1) + s + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(byte by, boolean b) {

        int i2=14, i3=-50587, i18=-10, i19=28923, i20=-44448;
        float f3=0.147F, f4=-56.970F;
        double d=0.129583;
        short s1=19800;

        for (i2 = 14; i2 < 350; i2++) {
            vMeth1(i2, i3, i2);
            Test.lArrFld[i2 + 1] = i3;
            i3 = i3;
            Test.iArrFld[i2][i2 - 1] *= i2;
            for (i18 = 1; 5 > i18; i18++) {
                by *= (byte)i19;
                i19 = -10;
                i3 = 39571;
                f3 -= f3;
                for (f4 = 1; 2 > f4; f4++) {
                    i19 += (int)(f4 * f4);
                    d *= i18;
                    s1 = (short)Test.instanceCount;
                }
                Test.instanceCount &= i20;
            }
        }
        vMeth_check_sum += by + (b ? 1 : 0) + i2 + i3 + i18 + i19 + Float.floatToIntBits(f3) + Float.floatToIntBits(f4)
            + i20 + Double.doubleToLongBits(d) + s1;
    }

    public void mainTest(String[] strArr1) {

        int i=-10, i1=56477, i21=-88, i22=9, i23=6, i24=-13, i25=238, i26=24;
        double d1=-119.114446;
        float f5=-72.992F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)94);

        for (i = 20; i < 357; ++i) {
            boolean b2=true;
            vMeth((byte)(122), b2);
            i21 = 1;
            while (++i21 < 75) {
                i1 += (i21 | i);
            }
            i1 *= (int)-4879319685644328962L;
            for (i22 = 1; i22 < 75; i22 += 3) {
                i23 = (int)Test.instanceCount;
                for (i24 = i22; i24 < 4; ++i24) {
                    Test.instanceCount >>= -214;
                    if (b2) break;
                    switch (((i22 % 7) * 5) + 37) {
                    case 45:
                        fFld = Test.byFld;
                        fFld += (i24 + i23);
                        i23 >>= -5;
                        i25 += i24;
                        break;
                    case 72:
                        i1 <<= i;
                        switch ((i % 6) + 78) {
                        case 78:
                            switch (((i23 >>> 1) % 4) + 2) {
                            case 2:
                                fFld = i25;
                                break;
                            case 3:
                                i23 *= (int)d1;
                                try {
                                    i23 = (Test.iArrFld[i24][i22] / 11701);
                                    i26 = (i1 % -190);
                                    Test.iFld = (Test.iFld / -37);
                                } catch (ArithmeticException a_e) {}
                                Test.iFld = i1;
                                break;
                            case 4:
                                Test.iFld = 59;
                                if (b2) {
                                    Test.instanceCount += i24;
                                    i25 += i24;
                                    Test.iArrFld[i22 - 1][i22] = Test.sFld;
                                }
                                Test.iArrFld[i22][i24 + 1] = Test.iFld;
                                break;
                            case 5:
                                Test.sFld += (short)(-7924047594058012125L + (i24 * i24));
                            default:
                                d1 += i22;
                            }
                            break;
                        case 79:
                            i23 += (int)d1;
                            break;
                        case 80:
                            fFld += (i24 * i24);
                            break;
                        case 81:
                            i23 += (i24 - i);
                        case 82:
                            Test.iArrFld[i][i22 + 1] = (int)f5;
                            break;
                        case 83:
                            sArrFld[i] -= (short)i23;
                            break;
                        default:
                            i26 += (((i24 * i23) + i1) - i21);
                        }
                        break;
                    case 61:
                        byArr[i22] = (byte)Test.instanceCount;
                    case 71:
                        i25 = (int)Test.instanceCount;
                        break;
                    case 49:
                        i26 *= (int)d1;
                    case 52:
                        Test.iArrFld[i24 + 1][i22] *= Test.iFld;
                        break;
                    case 58:
                        i26 = (int)-3045102380L;
                    default:
                        Test.instanceCount = i21;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i21 = " + i + "," + i1 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 d1 i26 = " + i25 + "," + Double.doubleToLongBits(d1) + "," + i26);
        FuzzerUtils.out.println("f5 byArr = " + Float.floatToIntBits(f5) + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld Test.sFld Test.dArrFld = " + Test.iFld + "," + Test.sFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld sArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}