// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3802519495L;
    public static byte byFld=-3;
    public double dFld=0.76108;
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];
    public long lArrFld[]=new long[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 52856);
        FuzzerUtils.init(Test.iArrFld1, 1);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i11) {

        int i12=98, i13=-5, i14=-192, i15=149, i16=0, iArr1[]=new int[N];
        float f2=0.1023F, fArr[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr, 1.531F);
        FuzzerUtils.init(iArr1, 9);
        FuzzerUtils.init(dArr, 65.66283);

        for (i12 = 4; 297 > i12; ++i12) {
            for (i14 = 6; i14 > 1; i14--) {
                i16 = 1;
                while (++i16 < 2) {
                    boolean b1=false;
                    f2 -= i11;
                    switch (((-11 >>> 1) % 9) + 4) {
                    case 4:
                        fArr[i14] += Test.instanceCount;
                        i11 -= (int)1.948F;
                        i15 = (int)f2;
                    case 5:
                        Test.instanceCount += i12;
                        Test.instanceCount += (i16 * i16);
                        b1 = b1;
                        break;
                    case 6:
                        i15 -= (int)Test.instanceCount;
                        break;
                    case 7:
                        iArr1[i16 + 1] = i15;
                        i15 -= i15;
                        try {
                            i15 = (i16 % i11);
                            i11 = (-66 / i14);
                            iArr1[i16] = (-24335 % i12);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 8:
                        f2 += (((i16 * i13) + i14) - i16);
                        break;
                    case 9:
                        i15 = (int)-7L;
                        break;
                    case 10:
                        i13 = (int)Test.instanceCount;
                        break;
                    case 11:
                        iArr1[i14 + 1] -= (int)f2;
                        break;
                    case 12:
                        dArr[i14 - 1] = f2;
                        break;
                    default:
                        Test.instanceCount = 187;
                    }
                }
            }
        }
        vMeth1_check_sum += i11 + i12 + i13 + i14 + i15 + i16 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i6, boolean b, int i7) {

        float f1=45.300F;
        int i8=-1, i9=5128, i10=-64356, i17=172;
        byte by=68;

        Test.instanceCount = ((~(long)(f1 + i7)) * (i8--));
        for (i9 = 7; 265 > i9; ++i9) {
            vMeth1(-125);
            switch (((i9 % 10) * 5) + 85) {
            case 91:
                Test.instanceCount += i10;
                break;
            case 111:
                i17 = 1;
                do {
                    i8 += (((i17 * i9) + i9) - Test.instanceCount);
                    if (i17 != 0) {
                    }
                    i7 = i6;
                    i8 += (((i17 * i9) + Test.instanceCount) - i8);
                    i10 += i17;
                } while (++i17 < 6);
                i10 += i7;
                break;
            case 103:
                Test.instanceCount = by;
                Test.instanceCount += i8;
                Test.instanceCount += i17;
                break;
            case 97:
            case 109:
                Test.iArrFld[i9] += (int)Test.instanceCount;
            case 130:
                i8 += (i9 * i9);
                break;
            case 113:
                by += (byte)1.651F;
                break;
            case 100:
                Test.instanceCount = i17;
                break;
            case 123:
                Test.iArrFld[i9 + 1] %= (int)(Test.instanceCount | 1);
                break;
            case 93:
                Test.instanceCount += 13;
                break;
            }
        }
        long meth_res = i6 + (b ? 1 : 0) + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i17 + by;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, double d, long l) {

        int i1=-42, i2=-11571, i3=-57718, i4=110, i5=40424, i19=14, i20=-233, i21=-20661, iArr[]=new int[N];
        float f=-99.540F;
        boolean b2=true;
        double d1=-63.116987;
        short s=-26464;

        FuzzerUtils.init(iArr, -117);

        for (i1 = 4; i1 < 248; i1++) {
            if (i3 != 0) {
                vMeth_check_sum += i + Double.doubleToLongBits(d) + l + i1 + i2 + i3 + i4 + i5 +
                    Float.floatToIntBits(f) + (b2 ? 1 : 0) + i19 + i20 + Double.doubleToLongBits(d1) + i21 + s +
                    FuzzerUtils.checkSum(iArr);
                return;
            }
            for (i4 = 1; i4 < 7; i4++) {
                Test.instanceCount += (long)f;
            }
            iArr = (iArr = (iArr = (iArr = iArr)));
            f *= (float)(iMeth(-110, b2, i) % ((long)(d) | 1));
            i5 *= i4;
            if (false) {
                switch (((i2 >>> 1) % 7) + 52) {
                case 52:
                    i2 = i5;
                    i5 *= Test.byFld;
                    for (i19 = i1; i19 < 7; i19++) {
                        for (d1 = 1; d1 < 1; d1++) {
                            i2 -= (int)d;
                            Test.iArrFld[i1 - 1] *= 13;
                        }
                    }
                    break;
                case 53:
                    i20 += (((i1 * i3) + i21) - i5);
                    break;
                case 54:
                    s -= (short)i21;
                case 55:
                    d %= (i4 | 1);
                    break;
                case 56:
                    i3 = (int)l;
                    break;
                case 57:
                    f += i5;
                    break;
                case 58:
                    l += (-7056652151623727513L + (i1 * i1));
                default:
                    i3 = (int)Test.instanceCount;
                }
            } else if (b2) {
                i2 &= i19;
            } else {
                l >>>= i1;
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + l + i1 + i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + (b2
            ? 1 : 0) + i19 + i20 + Double.doubleToLongBits(d1) + i21 + s + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i22=-40787, i23=-23621, i24=-60240, i25=233, i26=0, i27=-8, i28=-43607, i29=51689, i30=-54568;
        float f3=0.937F, f4=-72.919F;
        boolean b3=false;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)29648);

        vMeth(i22, dFld, 10L);
        Test.byFld ^= (byte)Test.instanceCount;
        i23 = 1;
        while (++i23 < 233) {
            i22 >>= i23;
            i22 <<= i23;
        }
        f3 += -45577L;
        for (i24 = 20; i24 < 350; i24++) {
            switch ((i24 % 10) + 49) {
            case 49:
                i26 = 1;
                while (++i26 < 76) {
                    Test.instanceCount <<= i24;
                }
                for (i27 = 1; i27 < 76; ++i27) {
                    for (i29 = 1; i29 < 2; ++i29) {
                        i30 ^= i28;
                        i30 = (int)Test.instanceCount;
                        i30 += (int)Test.instanceCount;
                        i28 += (i29 * i29);
                        if (b3) continue;
                        fArrFld[i24] += i22;
                        lArrFld[i27 - 1] -= -29;
                        i25 = Test.byFld;
                    }
                    switch (((i24 % 4) * 5) + 77) {
                    case 96:
                        f4 = 1;
                        while (++f4 < 2) {
                            Test.instanceCount = i28;
                            Test.instanceCount *= (long)-18.968F;
                            b3 = b3;
                            Test.iArrFld1[i24] = (int)Test.instanceCount;
                        }
                        f3 += (((i27 * i27) + i28) - Test.instanceCount);
                        i25 -= i24;
                        Test.instanceCount += (-25758L + (i27 * i27));
                        break;
                    case 80:
                        f3 = Test.instanceCount;
                    case 85:
                        if (b3) continue;
                        break;
                    case 94:
                        i30 = i29;
                        break;
                    }
                }
            case 50:
                sArr = sArr;
                break;
            case 51:
            case 52:
                i22 += i26;
            case 53:
                Test.instanceCount *= Test.instanceCount;
                break;
            case 54:
                i25 <<= (int)3691161324L;
            case 55:
                f3 %= (i27 | 1);
                break;
            case 56:
                i30 *= i28;
                break;
            case 57:
                i25 += 100;
                break;
            case 58:
            }
        }

        FuzzerUtils.out.println("i22 i23 f3 = " + i22 + "," + i23 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 b3 f4 = " + i30 + "," + (b3 ? 1 : 0) + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld dFld = " + Test.instanceCount + "," + Test.byFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.iArrFld fArrFld lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.iArrFld1 = " + FuzzerUtils.checkSum(Test.iArrFld1));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
