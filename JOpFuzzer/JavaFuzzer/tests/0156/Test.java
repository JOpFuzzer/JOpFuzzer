// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:44 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=2359003152L;
    public static float fFld=-108.969F;
    public static boolean bFld=false;
    public static short sFld=29627;
    public double dFld=63.51135;
    public int iFld=-193;
    public static short sArrFld[]=new short[N];
    public static float fArrFld[]=new float[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-4877);
        FuzzerUtils.init(Test.fArrFld, 39.801F);
        FuzzerUtils.init(Test.dArrFld, 0.7465);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l2) {

        int i6=84, i7=-5, i8=14, i9=930, i10=-12, iArr[][]=new int[N][N];
        long l3=-90L;
        double d=38.35521;
        byte by=108;

        FuzzerUtils.init(iArr, 3);

        for (i6 = 1; i6 < 297; ++i6) {
            iArr[i6 - 1][i6 + 1] *= i7;
            Test.fFld *= i7;
        }
        l2 -= i6;
        for (l3 = 305; l3 > 13; --l3) {
            for (i9 = 6; i9 > 1; --i9) {
                switch ((int)((l3 % 10) + 33)) {
                case 33:
                    iArr[i9 - 1][i9 - 1] = (int)Test.fFld;
                    i8 %= (int)(i7 | 1);
                    d = 117;
                    i8 = (int)Test.instanceCount;
                    break;
                case 34:
                    i8 = i6;
                    i8 += (int)d;
                case 35:
                    Test.bFld = Test.bFld;
                    i7 += (i9 * i9);
                case 36:
                    d = l3;
                    break;
                case 37:
                    by += (byte)(((i9 * Test.instanceCount) + l2) - i10);
                    break;
                case 38:
                    i8 += (i9 - i10);
                    break;
                case 39:
                    Test.instanceCount >>= Test.instanceCount;
                    break;
                case 40:
                    Test.instanceCount = i10;
                    break;
                case 41:
                    Test.sArrFld[i9 - 1] -= (short)l3;
                    break;
                case 42:
                    i10 = -8;
                    break;
                default:
                    l2 += l2;
                }
            }
        }
        vMeth1_check_sum += l2 + i6 + i7 + l3 + i8 + i9 + i10 + Double.doubleToLongBits(d) + by +
            FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(int i5, long l1) {

        int i11=59481, i12=3, i13=94, i14=203, i15=-207;

        vMeth1(l1);
        i5 += i5;
        for (i11 = 354; 5 < i11; i11--) {
            i12 = (int)l1;
            try {
                i12 = (i5 / 29387);
                i5 = (i5 % i11);
                i12 = (i5 / i12);
            } catch (ArithmeticException a_e) {}
            try {
                i12 = (i12 / 149);
                i12 = (-21303 % i5);
                i12 = (i12 / 56472);
            } catch (ArithmeticException a_e) {}
            l1 <<= i5;
            l1 += (i11 | l1);
            i5 *= i5;
            i5 >>= i11;
            for (i13 = 1; i13 < 5; ++i13) {
                l1 = i14;
                i15 = 2;
                do {
                    Test.fFld += (i15 * i14);
                    Test.fFld -= i12;
                } while ((i15 -= 3) > 0);
            }
        }
        long meth_res = i5 + l1 + i11 + i12 + i13 + i14 + i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l) {

        int i4=-4, i16=-16054, i17=52034, i18=-33777, i19=2, i20=-138;
        short s=-9893;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1877L);

        i4 <<= ((i4--) >>> (++i4));
        lMeth(i4, l);
        for (i16 = 1; 151 > i16; ++i16) {
            Test.bFld = Test.bFld;
            i18 = 1;
            while (++i18 < 11) {
                float f=0.392F;
                Test.fFld += (9 + (i18 * i18));
                lArr[i18 - 1] = (long)f;
                lArr[i18] = (long)Test.fFld;
                Test.instanceCount >>= 71;
                for (i19 = i16; 1 > i19; ++i19) {
                    s >>= (short)i4;
                    i4 += i20;
                    i20 *= i17;
                    i20 += i19;
                    Test.fArrFld[i19 - 1] = i4;
                }
            }
        }
        vMeth_check_sum += l + i4 + i16 + i17 + i18 + i19 + i20 + s + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-7, i1=-64600, i2=6, i3=1, i21=55132, i22=7, i23=59, i24=130, i25=55637;
        float f1=82.496F;
        double d1=0.79100;
        boolean bArr[]=new boolean[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(byArr, (byte)-39);

        for (i = 170; i > 4; i -= 2) {
            for (i2 = 2; i2 < 302; i2++) {
                vMeth(1750549285425884523L);
                i1 ^= i1;
            }
        }
        if (Test.bFld) {
            i1 <<= i;
            for (f1 = 6; f1 < 307; ++f1) {
                i1 = -3;
                Test.sFld = (short)-59204;
                bArr = bArr;
                i3 += (int)(((f1 * Test.fFld) + i21) - i2);
                d1 = 84;
                do {
                    i21 += (int)(d1 * i1);
                    Test.fFld *= i3;
                    for (i22 = (int)(f1); 3 > i22; ++i22) {
                        i21 = (int)Test.instanceCount;
                        if (Test.bFld) continue;
                    }
                    for (i24 = (int)(f1); i24 < 3; ++i24) {
                        byArr[i24 + 1] = (byte)i23;
                        switch (((i1 >>> 1) % 6) + 17) {
                        case 17:
                            i21 += (i24 * i24);
                            i23 <<= -4;
                            dFld += i1;
                            break;
                        case 18:
                        case 19:
                            Test.dArrFld[i24 + 1] /= (i24 | 1);
                            Test.fArrFld[(int)(d1)] *= i22;
                            break;
                        case 20:
                            if (Test.bFld) break;
                            break;
                        case 21:
                            i25 += i24;
                            i25 += (int)(2.473F + (i24 * i24));
                            i1 = i24;
                            Test.instanceCount = Test.sFld;
                            break;
                        case 22:
                            iFld = (int)Test.instanceCount;
                            break;
                        default:
                            i25 = i24;
                        }
                    }
                } while ((d1 -= 3) > 0);
            }
        } else if (Test.bFld) {
            Test.instanceCount = 5409;
        } else {
            i25 *= i2;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 f1 i21 = " + i3 + "," + Float.floatToIntBits(f1) + "," + i21);
        FuzzerUtils.out.println("d1 i22 i23 = " + Double.doubleToLongBits(d1) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 bArr = " + i24 + "," + i25 + "," + FuzzerUtils.checkSum(bArr));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.sFld dFld iFld = " + Test.sFld + "," + Double.doubleToLongBits(dFld) + "," +
            iFld);
        FuzzerUtils.out.println("Test.sArrFld Test.fArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.sArrFld) + ","
            + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}