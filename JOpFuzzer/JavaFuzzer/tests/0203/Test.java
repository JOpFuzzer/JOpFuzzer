// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=164L;
    public float fFld=-42.107F;
    public static float fFld1=-69.37F;
    public static boolean bFld=false;
    public static volatile double dFld=0.80158;
    public static long lArrFld[][]=new long[N][N];
    public int iArrFld[]=new int[N];
    public static volatile int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1L);
        FuzzerUtils.init(Test.iArrFld1, -19073);
    }

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i7) {

        float f1=-21.4F;
        int i8=26, i9=-11, i10=-254, i11=-5017, i12=19558, i13=53068, i14=-34129, iArr[][]=new int[N][N];
        byte by=-117;
        long l1=32371L;

        FuzzerUtils.init(iArr, -77);

        switch ((((-15902 >>> 1) % 8) * 5) + 94) {
        case 100:
            Test.iArrFld1 = FuzzerUtils.int1array(N, (int)-9);
            for (f1 = 7; f1 < 207; f1++) {
                i8 -= i7;
                try {
                    Test.iArrFld1[(int)(f1 + 1)] = (Test.iArrFld1[(int)(f1)] / 41013);
                    Test.iArrFld1[(int)(f1)] = (Test.iArrFld1[(i7 >>> 1) % N] / iArr[(int)(f1 - 1)][(int)(f1 + 1)]);
                    i8 = (i8 % i8);
                } catch (ArithmeticException a_e) {}
                for (i9 = (int)(f1); i9 < 8; i9++) {
                    i10 = by;
                    Test.instanceCount = -197L;
                }
                for (i11 = 1; i11 < 8; i11++) {
                    i12 >>>= 87;
                    i8 += (i11 + i10);
                }
                for (l1 = 8; l1 > f1; l1 -= 2) {
                    i14 = 1;
                    while (--i14 > 0) {
                        if (Test.bFld) break;
                        i12 = i14;
                    }
                }
            }
        case 124:
            i8 -= by;
            break;
        case 96:
            Test.instanceCount = 47;
            break;
        case 125:
            Test.instanceCount += i13;
            break;
        case 110:
            Test.instanceCount = i11;
            break;
        case 103:
            i10 <<= -56;
            break;
        case 127:
            iArr[(i8 >>> 1) % N] = iArr[(i9 >>> 1) % N];
            break;
        case 126:
            Test.instanceCount -= 12;
            break;
        default:
            i12 = i12;
        }
        vMeth_check_sum += i7 + Float.floatToIntBits(f1) + i8 + i9 + i10 + by + i11 + i12 + l1 + i13 + i14 +
            FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth1(int i5, int i6) {

        long l=4824295587207402953L, lArr[]=new long[N];
        boolean b=true;
        int i15=112, i16=-24370;

        FuzzerUtils.init(lArr, 7L);

        Test.instanceCount = (long)(-((Test.fFld1 / (i6 | 1)) * Math.abs(Test.fFld1)));
        l = 1;
        while (++l < 392) {
            Test.bFld = b;
            i6 = (i5 >>= (++i5));
        }
        Test.iArrFld1[(i5 >>> 1) % N] >>= (int)(((Test.dFld * 43340) + (109.27450 - (i5++))) + ((Test.dFld * 122) +
            i5));
        vMeth(i6);
        for (long l2 : lArr) {
            i6 -= (int)167L;
            if (i6 != 0) {
            }
            Test.instanceCount -= (long)Test.dFld;
            Test.iArrFld1[(i5 >>> 1) % N] >>= -13344;
            for (i15 = 4; i15 > 1; i15 -= 3) {
                if (false) break;
                i16 += i15;
                i6 += (int)Test.fFld1;
            }
        }
        long meth_res = i5 + i6 + l + (b ? 1 : 0) + i15 + i16 + FuzzerUtils.checkSum(lArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public long lMeth(int i2, int i3, int i4) {

        int i17=49480, i18=-2, i19=-104, i20=-218, i21=-21030, i22=86, i23=-107;
        byte by1=-106;
        float f2=7.521F;
        short s=-1134;

        fFld -= (Math.min(Test.instanceCount, lMeth1(i4, i3)) * -423267930L);
        iArrFld = iArrFld;
        Test.dFld -= Test.instanceCount;
        i17 = 1;
        while (++i17 < 343) {
            i4 += (int)Test.fFld1;
            i4 |= i2;
            i18 = 4;
        }
        by1 += (byte)1.58F;
        for (i19 = 3; i19 < 182; ++i19) {
            for (i21 = i19; i21 < 9; i21++) {
                for (f2 = 1; f2 < 1; ++f2) {
                    i4 = (int)Test.instanceCount;
                    s -= (short)Test.instanceCount;
                    i18 = i4;
                    Test.instanceCount = (long)Test.dFld;
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i17 + i18 + by1 + i19 + i20 + i21 + i22 + Float.floatToIntBits(f2) + i23 + s;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-60690, i1=-85, i24=51615, i25=-122, i26=17, i27=-59;
        float f=78.867F;
        double d=-63.9559;
        short s1=-15513;

        for (i = 4; i < 233; ++i) {
            i1 += (int)((Test.lArrFld[i - 1][i + 1] - f) * (d--));
            iArrFld[i - 1] &= (int)-6936823834556251743L;
            lMeth(i, -4, -155);
            switch (((i1 >>> 1) % 2) + 109) {
            case 109:
                Test.instanceCount = i;
                Test.lArrFld[i][i - 1] *= Test.instanceCount;
                break;
            case 110:
                Test.instanceCount |= i1;
                i1 = i1;
                Test.iArrFld1[i + 1] &= i1;
                switch (((i % 2) * 5) + 22) {
                case 25:
                    for (i24 = 3; i24 < 110; i24 += 3) {
                        for (i26 = 1; i26 < 4; i26++) {
                            i1 += (i26 + i25);
                            Test.instanceCount = i26;
                            i1 <<= i26;
                            i25 = (int)Test.instanceCount;
                            i25 *= s1;
                            switch (((i24 % 2) * 5) + 34) {
                            case 43:
                                switch (((i % 1) * 5) + 63) {
                                case 67:
                                    iArrFld[i24 + 1] >>= s1;
                                    break;
                                default:
                                    Test.iArrFld1[i + 1] ^= i25;
                                    Test.bFld = true;
                                }
                                break;
                            case 36:
                                if (Test.bFld) break;
                                break;
                            default:
                                Test.instanceCount >>= 9;
                                switch (((i24 % 2) * 5) + 115) {
                                case 117:
                                    d += 20;
                                    break;
                                case 121:
                                    i27 = (int)Test.instanceCount;
                                    Test.dFld -= -238;
                                    break;
                                default:
                                    iArrFld[i] -= i24;
                                }
                            }
                        }
                    }
                case 26:
                    iArrFld[i + 1] -= i27;
                default:
                    s1 *= (short)i27;
                }
            default:
                i25 = i25;
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("d i24 i25 = " + Double.doubleToLongBits(d) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 s1 = " + i26 + "," + i27 + "," + s1);

        FuzzerUtils.out.println("Test.instanceCount fFld Test.fFld1 = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Float.floatToIntBits(Test.fFld1));
        FuzzerUtils.out.println("Test.bFld Test.dFld Test.lArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("iArrFld Test.iArrFld1 = " + FuzzerUtils.checkSum(iArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld1));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}