// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static boolean bFld=false;
    public static int iFld=0;
    public static volatile byte byFld=108;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.557F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i6=-4512, i7=23264, i8=-1, i9=5;
        float f1=0.524F;
        double d=-1.10237;
        byte by=-101;

        i6 = 1;
        while (++i6 < 223) {
            f1 = i6;
            for (d = 1; 7 > d; ++d) {
                i7 += (int)d;
                f1 = i7;
                i7 -= i6;
                Test.bFld = true;
                i7 = i6;
                i7 += (int)-5965133283670646696L;
                by -= (byte)f1;
                f1 += by;
            }
        }
        for (i8 = 17; 380 > i8; ++i8) {
            f1 = i9;
            try {
                i7 = (-103 % i6);
                i9 = (396920379 / i9);
                i7 = (i6 % -3539);
            } catch (ArithmeticException a_e) {}
            f1 = Test.iFld;
        }
        vMeth2_check_sum += i6 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i7 + by + i8 + i9;
    }

    public static void vMeth1(int i2, int i3) {

        int i4=-6, i5=186, i10=-24573, i11=-10, iArr[][]=new int[N][N];
        double d1=-1.1485, dArr[]=new double[N];
        short s=-10424;

        FuzzerUtils.init(iArr, 8);
        FuzzerUtils.init(dArr, 70.113548);

        for (i4 = 4; i4 < 190; i4++) {
            float f=-28.102F;
            Test.instanceCount -= (long)((++f) + 49039);
            vMeth2();
            Test.instanceCount += (i4 | i4);
            i10 = 1;
            do {
                i2 = (int)d1;
                switch ((i10 % 8) + 27) {
                case 27:
                    i2 -= (int)f;
                    iArr[i10 - 1][i10 + 1] += (int)Test.instanceCount;
                    break;
                case 28:
                    i11 = (int)-17.539F;
                    Test.instanceCount <<= Test.byFld;
                    i5 <<= i11;
                    Test.fArrFld = Test.fArrFld;
                    break;
                case 29:
                    d1 *= -91.54692;
                    d1 -= Test.instanceCount;
                    break;
                case 30:
                    dArr[i4] -= Test.iFld;
                    break;
                case 31:
                    iArr[i10 - 1][i4 + 1] <<= i4;
                    break;
                case 32:
                    s = (short)-55537L;
                case 33:
                    iArr[i10][i10] -= (int)-5L;
                    break;
                case 34:
                default:
                    Test.iFld -= i2;
                }
            } while (++i10 < 9);
        }
        vMeth1_check_sum += i2 + i3 + i4 + i5 + i10 + Double.doubleToLongBits(d1) + i11 + s +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(long l, long l1) {

        int i1=-46611, i12=58484, i13=-22049, iArr1[]=new int[N];
        double d2=0.12629;
        float f2=1.950F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3727983445282093120L);
        FuzzerUtils.init(iArr1, 2035);

        i1 = 1;
        do {
            vMeth1(198, Test.iFld);
            Test.iFld = Test.iFld;
            if (Test.bFld) {
                Test.iFld = (int)Test.instanceCount;
            } else if (Test.bFld) {
                Test.iFld -= 0;
                lArr[(i1 >>> 1) % N] &= -71;
                Test.iFld += i1;
                iArr1[i1 + 1] >>= i1;
            } else {
                Test.iFld += Test.iFld;
                vMeth_check_sum += l + l1 + i1 + i12 + i13 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f2) +
                    FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
                return;
            }
        } while (++i1 < 351);
        for (i12 = 387; i12 > 23; --i12) {
            i13 += (int)d2;
            Test.instanceCount = i1;
            i13 += (int)f2;
            iArr1[i12] = i12;
        }
        vMeth_check_sum += l + l1 + i1 + i12 + i13 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=11, i14=2, i15=39228, i16=0, i17=-10, i18=12, iArr2[]=new int[N];
        float f3=2.570F, f4=0.695F;
        double d3=-1.126259;
        short s1=-12068, sArr[]=new short[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, -31560);
        FuzzerUtils.init(sArr, (short)-10863);
        FuzzerUtils.init(lArr1, 5773194487185130897L);

        i *= (int)Test.instanceCount;
        vMeth(2844530084L, Test.instanceCount);
        i = 6;
        Test.instanceCount <<= i;
        Test.iFld <<= 42686;
        Test.iFld = (int)f3;
        iArr2[(i >>> 1) % N] += i;
        for (f4 = 6; f4 < 122; ++f4) {
            Test.iFld += (100 + (f4 * f4));
        }
        for (d3 = 5; d3 < 314; ++d3) {
            Test.instanceCount = Test.iFld;
            for (i16 = 1; 81 > i16; ++i16) {
                switch ((i16 % 4) + 31) {
                case 31:
                    iArr2[i16 - 1] = i;
                    i14 >>>= i15;
                    break;
                case 32:
                    i14 += (int)Test.instanceCount;
                    break;
                case 33:
                    switch ((int)((d3 % 6) + 124)) {
                    case 124:
                        Test.instanceCount >>= Test.iFld;
                        break;
                    case 125:
                        i14 = i15;
                        switch ((int)(((d3 % 8) * 5) + 6)) {
                        case 45:
                            i17 += (i16 | i14);
                            i += (((i16 * i14) + Test.instanceCount) - i16);
                            Test.instanceCount = i14;
                            switch ((int)(((d3 % 9) * 5) + 119)) {
                            case 154:
                                if (Test.bFld) {
                                    Test.iFld <<= Test.iFld;
                                    iArr2[i16 - 1] += (int)-326088214088609609L;
                                    sArr[i16 + 1] += (short)i17;
                                } else {
                                    i17 += (i16 * Test.iFld);
                                    Test.instanceCount <<= i17;
                                }
                                break;
                            case 133:
                                s1 += (short)(i16 * i16);
                                break;
                            case 125:
                                Test.instanceCount += (i16 * i15);
                                break;
                            case 146:
                                Test.byFld = (byte)i14;
                                break;
                            case 159:
                                Test.instanceCount = i16;
                            case 135:
                                if (Test.bFld) continue;
                                break;
                            case 158:
                                i ^= Test.iFld;
                                break;
                            case 138:
                                lArr1[(int)(d3)] += i;
                                break;
                            case 137:
                            default:
                                f3 *= i15;
                            }
                        case 41:
                            lArr1[i16 - 1] = i;
                            break;
                        case 33:
                            i += (i16 * i16);
                            break;
                        case 21:
                            s1 += (short)(-9 + (i16 * i16));
                            break;
                        case 37:
                            i18 = Test.iFld;
                            break;
                        case 46:
                            iArr2[i16 + 1] = i18;
                            break;
                        case 25:
                            i >>>= i15;
                            break;
                        case 29:
                            iArr2[i16 - 1] >>= (int)Test.instanceCount;
                            break;
                        }
                        break;
                    case 126:
                        if (Test.bFld) continue;
                        break;
                    case 127:
                        Test.instanceCount *= -14;
                    case 128:
                        f3 = (float)59.82256;
                    case 129:
                        lArr1[(int)(d3 + 1)] = i16;
                        break;
                    default:
                        i += i16;
                    }
                    break;
                case 34:
                    i17 /= (int)41139L;
                    break;
                default:
                    Test.instanceCount = i17;
                }
            }
        }

        FuzzerUtils.out.println("i f3 f4 = " + i + "," + Float.floatToIntBits(f3) + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i14 d3 i15 = " + i14 + "," + Double.doubleToLongBits(d3) + "," + i15);
        FuzzerUtils.out.println("i16 i17 s1 = " + i16 + "," + i17 + "," + s1);
        FuzzerUtils.out.println("i18 iArr2 sArr = " + i18 + "," + FuzzerUtils.checkSum(iArr2) + "," +
            FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.iFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.byFld Test.fArrFld = " + Test.byFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

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
