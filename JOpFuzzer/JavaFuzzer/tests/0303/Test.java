// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-76L;
    public double dFld=0.56571;
    public static short sFld=21517;
    public float fFld=-95.706F;
    public static int iFld=-140;
    public static float fFld1=-2.170F;
    public static byte byFld=-6;
    public boolean bFld=false;
    public static float fArrFld[]=new float[N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 112.579F);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(byte by, int i7, int i8) {

        int i9=-16967, i10=0, i11=245, i12=96, i13=13;
        boolean b=false;

        if (b) {
            i9 = 1;
            do {
                i7 += (i9 | i7);
                Test.instanceCount += (-119 + (i9 * i9));
                for (i10 = 1; i10 < 9; ++i10) {
                    i12 = 2;
                    while (--i12 > 0) {
                        Test.instanceCount = i11;
                        Test.fFld1 += i8;
                        i7 += (((i12 * i7) + i8) - i10);
                        Test.instanceCount <<= i9;
                    }
                    i13 = 2;
                    do {
                        i11 = -9;
                        Test.fFld1 *= i10;
                        Test.fFld1 += i13;
                        i8 *= (int)-1.31608;
                    } while (--i13 > 0);
                }
            } while (++i9 < 178);
        }
        vMeth1_check_sum += by + i7 + i8 + i9 + i10 + i11 + i12 + i13 + (b ? 1 : 0);
    }

    public static float fMeth(int i6) {

        byte by1=69;
        int i14=4, i15=234, i16=-57353, i17=-190, i18=-214, i19=-43842, i20=147, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 45595);

        vMeth1(by1, i6, Test.iFld);
        Test.iFld += Test.iFld;
        iArr2[(40 >>> 1) % N] += i6;
        Test.iFld *= Test.iFld;
        for (i14 = 9; i14 < 163; i14 += 2) {
            for (i16 = 1; i16 < 20; ++i16) {
                i18 = 1;
                do {
                    Test.iFld += (i18 * i18);
                } while (++i18 < 2);
                Test.fFld1 += (i16 * i16);
            }
            iArr2[i14] = i18;
            for (i19 = 1; i19 < 20; i19++) {
                i6 ^= i16;
                Test.fFld1 *= Test.iFld;
                i15 >>= (int)3394848488836647341L;
                try {
                    i15 = (i18 % iArr2[i19]);
                    iArr2[i19] = (-2004590932 % i20);
                    i6 = (iArr2[i19] / 55873);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = i6 + by1 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth() {

        float f=112.843F;
        int i4=2, i5=-7, i21=-7739, i22=-4, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -62683);

        iArr1[(Test.iFld >>> 1) % N] -= (int)((Test.iFld++) * ((Test.iFld + Test.instanceCount) *
            Math.max(Test.instanceCount, 3668682837547202085L)));
        f = ((-(Test.iFld / (Test.iFld | 1))) + Test.instanceCount);
        for (float f1 : Test.fArrFld) {
            for (i4 = 1; i4 < 4; ++i4) {
                i5 += i4;
                Test.iFld -= (int)(((-4992586581992190525L | (long)(1.731F - (Test.iFld * i4))) + (Test.iFld * f)) *
                    fMeth(i5));
                Test.iFld = (int)-1.49003;
                Test.iFld += i4;
                Test.iFld = Test.iFld;
                Test.iFld += (((i4 * Test.byFld) + f) - i5);
                i5 = (int)f;
            }
            iArr1[(Test.iFld >>> 1) % N] &= 56;
            for (i21 = 4; i21 > 1; --i21) {
                Test.sFld += (short)(i21 | (long)f);
                Test.fArrFld[i21 + 1] += Test.instanceCount;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i4 + i5 + i21 + i22 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-90, i1=-1, i2=24031, i3=35385, iArr[]=new int[N], iArr3[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -59);
        FuzzerUtils.init(iArr3, 11668);
        FuzzerUtils.init(lArr, -2L);

        for (i = 23; i < 388; i++) {
            Test.fArrFld = (Test.fArrFld = (Test.fArrFld = (Test.fArrFld = Test.fArrFld)));
            iArr[i] = (sArrFld[i + 1]++);
            if ((i1 = (int)(i1 + (dFld--))) >= Math.min(126L, --Test.instanceCount)) {
                Test.instanceCount -= (i1 = (int)Test.instanceCount);
                i1 = (-(63187 * (i - i)));
                Test.fArrFld[i - 1] -= 2371546002L;
            } else {
                i2 = 1;
                do {
                    i3 = 1;
                    do {
                        switch (((i2 % 2) * 5) + 125) {
                        case 127:
                            i1 >>>= (int)(-Math.max(i + i2, (long)(dFld + i3)));
                            i1 >>= (--Test.sFld);
                            Test.instanceCount = (long)(((-50858 * (i1--)) + (i1++)) - dFld);
                        case 126:
                            fFld = (float)(--dFld);
                            i1 = i1;
                            try {
                                i1 = (iArr[i3] % i);
                                i1 = (-931282174 / i2);
                                i1 = (i1 % iArr[i2]);
                            } catch (ArithmeticException a_e) {}
                            break;
                        default:
                            vMeth();
                            switch ((i2 % 3) + 125) {
                            case 125:
                                Test.instanceCount -= -3;
                                Test.fFld1 = i2;
                                switch (((i1 >>> 1) % 10) + 39) {
                                case 39:
                                    Test.instanceCount += (-53751 + (i3 * i3));
                                    iArr3[i + 1] = i2;
                                    break;
                                case 40:
                                    switch ((i2 % 9) + 47) {
                                    case 47:
                                        dFld = dFld;
                                        i1 = Test.byFld;
                                        Test.sFld = (short)i2;
                                        Test.iFld += (((i3 * Test.instanceCount) + i1) - Test.instanceCount);
                                        break;
                                    case 48:
                                        i1 += i3;
                                        Test.instanceCount &= 118;
                                        break;
                                    case 49:
                                        Test.instanceCount *= 4;
                                        break;
                                    case 50:
                                    case 51:
                                        lArr[i2 - 1] += Test.instanceCount;
                                        break;
                                    case 52:
                                        i1 = i1;
                                    case 53:
                                        Test.instanceCount = 10;
                                        break;
                                    case 54:
                                        lArr[i] >>= i3;
                                        break;
                                    case 55:
                                        Test.iFld += (int)-2214L;
                                        break;
                                    default:
                                        i1 >>= i;
                                    }
                                    break;
                                case 41:
                                    if (bFld) break;
                                    break;
                                case 42:
                                    Test.iFld -= -37679;
                                case 43:
                                    i1 += (i3 + Test.instanceCount);
                                    break;
                                case 44:
                                    fFld = Test.instanceCount;
                                case 45:
                                    bFld = bFld;
                                case 46:
                                    Test.iFld += (int)Test.instanceCount;
                                    break;
                                case 47:
                                    Test.byFld = (byte)Test.iFld;
                                case 48:
                                    Test.iFld = (int)dFld;
                                    break;
                                }
                            case 126:
                            case 127:
                                try {
                                    iArr3[i2 + 1] = (iArr3[i2] / 134);
                                    i1 = (Test.iFld % i2);
                                    Test.iFld = (-19071 / i3);
                                } catch (ArithmeticException a_e) {}
                                break;
                            default:
                                i1 += (int)(-31L + (i3 * i3));
                            }
                        }
                    } while (++i3 < 1);
                } while (++i2 < 69);
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 iArr iArr3 = " + i3 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.sFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Test.sFld);
        FuzzerUtils.out.println("fFld Test.iFld Test.fFld1 = " + Float.floatToIntBits(fFld) + "," + Test.iFld + "," +
            Float.floatToIntBits(Test.fFld1));
        FuzzerUtils.out.println("Test.byFld bFld Test.fArrFld = " + Test.byFld + "," + (bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("sArrFld = " + FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}