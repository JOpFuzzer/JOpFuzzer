// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:51 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2036858075697757182L;
    public static short sFld=1646;
    public static volatile double dFld=0.91465;
    public static int iArrFld[][]=new int[N][N];
    public static long lArrFld[]=new long[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -7);
        FuzzerUtils.init(Test.lArrFld, 6094698719346547979L);
    }

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth() {

        int i12=-253, i13=10, i14=3645, i15=-25, i16=-67, i17=59;
        float f=2.335F;

        Test.dFld = i12;
        f = -72;
        for (i13 = 1; i13 < 298; i13++) {
            if (i12 != 0) {
            }
            for (i15 = i13; i15 < 6; i15++) {
                i16 += (-235 + (i15 * i15));
                f *= Test.instanceCount;
                i17 = 1;
                do {
                    f *= i17;
                    i14 = (int)Test.instanceCount;
                    Test.instanceCount += i12;
                    Test.instanceCount -= (long)Test.dFld;
                    i12 = (int)Test.instanceCount;
                    Test.instanceCount = -12;
                    i14 += (i17 * i17);
                } while (++i17 < 1);
            }
        }
        long meth_res = i12 + Float.floatToIntBits(f) + i13 + i14 + i15 + i16 + i17;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static double dMeth(int i8, int i9) {

        int i10=-46, i11=0, i18=64235, i19=-3296, i20=-235, i21=27, i22=-12;
        byte by=120;
        double d1=2.62686;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)29708);

        for (i10 = 15; i10 < 392; ++i10) {
            Test.iArrFld[i10][i10] = (i8--);
            Test.iArrFld[i10 - 1][i10 - 1] >>>= (((by + i8) - (i9 + i11)) - sArr[i10 - 1]);
            Test.instanceCount >>>= ((--i11) - Test.instanceCount);
            i9 = (int)(++Test.instanceCount);
            fMeth();
        }
        for (i18 = 5; i18 < 209; ++i18) {
            boolean b=false;
            float f1=-38.236F;
            if (b) break;
            switch ((((232 >>> 1) % 10) * 5) + 1) {
            case 18:
                i19 |= 68;
                break;
            case 51:
                for (i20 = 8; i20 > 1; --i20) {
                    boolean b1=true;
                    b1 = true;
                    for (d1 = 1; 2 > d1; d1++) {
                        Test.instanceCount = Test.instanceCount;
                        Test.lArrFld[i20 + 1] = 3255599587L;
                    }
                }
                break;
            case 34:
                Test.instanceCount = i18;
            case 42:
                i19 -= (int)d1;
                break;
            case 25:
                Test.sFld -= (short)-4861895237506693318L;
                break;
            case 15:
                i9 = 12;
            case 20:
            case 24:
                i19 >>= i10;
            case 26:
                i19 <<= i8;
                break;
            case 37:
                i19 -= (int)f1;
                break;
            }
        }
        long meth_res = i8 + i9 + i10 + i11 + by + i18 + i19 + i20 + i21 + Double.doubleToLongBits(d1) + i22 +
            FuzzerUtils.checkSum(sArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(int i3, int i4, int i5) {

        int i6=-48, i7=-41426;
        boolean b2=true;

        for (i6 = 6; i6 < 321; i6++) {
            i7 = (int)dMeth(i5, i5);
            switch ((((i3 >>> 1) % 2) * 5) + 33) {
            case 42:
                i3 += (int)Test.instanceCount;
                i3 >>= i4;
                break;
            case 37:
                i3 = i6;
                i7 >>= (int)Test.instanceCount;
                Test.iArrFld[i6 - 1][i6] = i7;
                if (b2) continue;
                break;
            default:
                i7 *= i6;
            }
            if (i3 != 0) {
            }
        }
        Test.lArrFld[(i5 >>> 1) % N] = 12L;
        Test.instanceCount -= Test.instanceCount;
        i7 *= i5;
        Test.dFld /= (Test.instanceCount | 1);
        long meth_res = i3 + i4 + i5 + i6 + i7 + (b2 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-225, i1=-1576, i2=55539, i23=12, i24=-4, i25=-52, i26=-12708;
        double d=87.21505;
        boolean b3=false;

        Test.sFld = (short)(i / (i | 1));
        i >>= Math.max(i--, (int)((-d) - (Test.instanceCount = Test.sFld)));
        for (i1 = 2; i1 < 244; i1++) {
            float f2=2.437F;
            i -= (int)(iMeth(i1, i2, i) * f2);
            i23 = 1;
            while (++i23 < 104) {
                if (b3) continue;
                Test.instanceCount %= (i | 1);
                i24 = 1;
                while (++i24 < 1) {
                    Test.dFld += i;
                    i *= i23;
                    Test.instanceCount += i;
                }
                i2 -= (int)Test.instanceCount;
                Test.iArrFld[i23 + 1][i23] = (int)Test.instanceCount;
                for (i25 = 1; i25 < 1; i25 += 2) {
                    switch ((i1 % 3) + 75) {
                    case 75:
                    case 76:
                        f2 = i1;
                        Test.lArrFld[i25 + 1] -= (long)Test.dFld;
                    case 77:
                        Test.iArrFld[(i23 >>> 1) % N][i1] = (int)Test.instanceCount;
                        fArrFld[i25 - 1] = 167L;
                        f2 *= i23;
                        if (b3) {
                            Test.iArrFld[i1][i1] -= (int)Test.instanceCount;
                            Test.iArrFld[i25][i1] -= (int)-8357973402706905941L;
                        } else if (b3) {
                            f2 += i;
                        } else if (b3) {
                            i = (int)Test.dFld;
                            Test.lArrFld[i1] += i2;
                            Test.sFld = (short)-22.747F;
                            i2 += i25;
                        } else {
                            f2 = Test.instanceCount;
                        }
                    default:
                        i26 += i24;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i d i1 = " + i + "," + Double.doubleToLongBits(d) + "," + i1);
        FuzzerUtils.out.println("i2 i23 b3 = " + i2 + "," + i23 + "," + (b3 ? 1 : 0));
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  fMeth ->  fMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}