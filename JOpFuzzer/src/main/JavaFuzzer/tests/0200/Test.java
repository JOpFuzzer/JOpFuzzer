// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1824247830880024143L;
    public double dFld=99.52742;
    public static float fFld=23.682F;
    public static short sFld=-17757;
    public int iFld=-107;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public float fArrFld[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1555789149L);
        FuzzerUtils.init(Test.iArrFld, 12247);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l1, int i7) {

        double d1=15.8698, dArr[]=new double[N];
        int i8=-6, i9=-157, iArr1[]=new int[N];
        boolean b=true;
        short s=-12890;

        FuzzerUtils.init(dArr, 0.41433);
        FuzzerUtils.init(iArr1, 37202);

        d1 -= i7;
        i7 = i7;
        i7 = i7;
        for (double d2 : dArr) {
            int i10=-1;
            switch ((((i7 >>> 1) % 10) * 5) + 54) {
            case 85:
                i8 = 1;
                while (++i8 < 4) {
                    Test.lArrFld[i8 - 1] = i8;
                    i7 -= (int)l1;
                    i9 = 1;
                    while (++i9 < 1) {
                        Test.instanceCount &= i9;
                        i7 -= (int)Test.instanceCount;
                        i7 = i7;
                        b = b;
                        i7 >>= -2621;
                    }
                    b = b;
                }
                break;
            case 72:
                s >>= (short)Test.instanceCount;
                break;
            case 58:
                i7 *= i9;
                break;
            case 73:
                i7 &= i9;
                break;
            case 77:
                iArr1[(i7 >>> 1) % N] -= i9;
                break;
            case 95:
                i7 *= i8;
                break;
            case 79:
                l1 = i8;
                break;
            case 81:
                i7 |= i7;
            case 83:
                i10 <<= i8;
            case 68:
                iArr1[(i8 >>> 1) % N] = i8;
                break;
            }
        }
        long meth_res = l1 + i7 + Double.doubleToLongBits(d1) + i8 + i9 + (b ? 1 : 0) + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static short sMeth() {

        int i6=31505, i11=-28208, i12=-64833, i13=60251, i14=213, i15=62711;
        short s1=6521;
        float f1=-90.827F;

        i6 |= (int)lMeth(Test.instanceCount, -52);
        Test.iArrFld[(i6 >>> 1) % N] += i6;
        for (i11 = 1; i11 < 218; ++i11) {
            i12 -= -1;
            s1 += (short)i11;
            Test.iArrFld[i11] = i12;
            for (i13 = 7; 1 < i13; i13 -= 2) {
                i12 += i13;
                f1 -= i12;
                i6 = 83;
                Test.instanceCount *= 113;
                i15 += (int)Test.instanceCount;
                Test.instanceCount += i15;
                Test.instanceCount += (long)f1;
            }
            i14 += (int)f1;
        }
        long meth_res = i6 + i11 + i12 + s1 + i13 + i14 + Float.floatToIntBits(f1) + i15;
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(long l, int i) {

        int i1=3, i2=-2, i3=-61019, i4=9, i5=4, i16=-211, iArr[]=new int[N];
        double d=48.10267;
        boolean b1=true;

        FuzzerUtils.init(iArr, 144);

        i1 = 287;
        while ((i1 -= 3) > 0) {
            for (i2 = 16; i2 > 1; i2 -= 3) {
                for (i4 = 4; i4 > 1; i4--) {
                    l += (((i4 * i3) + l) - i4);
                    iArr[i2 - 1] = (int)((d--) - l);
                    i5 += (i4 * i4);
                    i += i4;
                    Test.instanceCount = (long)(d / ((Test.instanceCount + sMeth()) | 1));
                    i = i3;
                }
                l += (9 + (i2 * i2));
                d = -32361;
                i16 = 1;
                do {
                    try {
                        i5 = (44565 % i1);
                        Test.iArrFld[i2 + 1] = (i4 / 48987);
                        iArr[(i16 >>> 1) % N] = (i / i3);
                    } catch (ArithmeticException a_e) {}
                    if (b1) break;
                    i5 <<= i;
                } while (++i16 < 4);
            }
        }
        vMeth_check_sum += l + i + i1 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + i16 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        float f=65.110F;
        int i17=-36139, i18=27022, i19=5, i20=-47, i23=-4, i24=26, i25=-8;
        byte by=-22;
        boolean b2=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-17631);

        f = 1;
        do {
            vMeth(Test.instanceCount, i17);
            i17 += (int)f;
            Test.lArrFld[(int)(f - 1)] += (long)dFld;
            i17 *= i17;
            i17 *= by;
            i17 -= i17;
            i17 = by;
            Test.lArrFld[(int)(f)] <<= i17;
            Test.fFld += Test.instanceCount;
            fArrFld[(int)(f)][(i17 >>> 1) % N] -= i17;
        } while (++f < 361);
        i17 = i17;
        for (i18 = 5; i18 < 135; ++i18) {
            i19 += (i18 * i18);
        }
        i20 = 1;
        do {
            i17 += i17;
            b2 = b2;
            Test.fFld += (((i20 * Test.sFld) + f) - f);
            for (i23 = 86; 3 < i23; i23--) {
                Test.fFld += (((i23 * i20) + i18) - i23);
                i19 += i19;
                i24 += i23;
                i25 = 1;
                do {
                    Test.instanceCount -= -13130;
                    switch (((-17073 >>> 1) % 8) + 121) {
                    case 121:
                        if (false) continue;
                        Test.fFld += 12;
                        if (b2) {
                            Test.sFld >>= (short)i23;
                            Test.fFld = 4089824896L;
                        } else if (b2) {
                            Test.lArrFld[i23 - 1] = Test.instanceCount;
                        }
                        break;
                    case 122:
                        Test.fFld = f;
                        break;
                    case 123:
                        Test.instanceCount >>= i17;
                        break;
                    case 124:
                        iFld += (int)dFld;
                        break;
                    case 125:
                        Test.sFld <<= (short)i25;
                        break;
                    case 126:
                        fArrFld[i20 - 1][i23 - 1] = by;
                    case 127:
                        sArr[i23] ^= (short)iFld;
                    case 128:
                        Test.instanceCount = i18;
                        break;
                    default:
                        i17 *= i18;
                    }
                } while (++i25 < 2);
            }
        } while (++i20 < 291);

        FuzzerUtils.out.println("f i17 by = " + Float.floatToIntBits(f) + "," + i17 + "," + by);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("b2 i23 i24 = " + (b2 ? 1 : 0) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 sArr = " + i25 + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.fFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld iFld Test.lArrFld = " + Test.sFld + "," + iFld + "," +
            FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
