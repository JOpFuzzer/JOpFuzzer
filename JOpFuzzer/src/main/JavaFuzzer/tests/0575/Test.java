// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:54 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=8818643901900608245L;
    public static boolean bFld=true;
    public static float fFld=-31.1020F;
    public static volatile int iFld=-4;
    public static byte byFld=-44;
    public static double dFld=-2.85455;
    public float fFld1=-23.262F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, int i8, float f3) {

        int i9=13, i10=-12, i11=-23055, i12=2, i13=-19765;
        short s1=23456, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)5379);

        for (i9 = 12; i9 < 268; i9++) {
            i11 = 1;
            while (++i11 < 6) {
                i10 &= i10;
                i12 = 1;
                do {
                    s1 += (short)Test.instanceCount;
                    if (true) {
                        i13 += (int)Test.instanceCount;
                        Test.iFld >>>= 172;
                        Test.iFld += (i12 * i12);
                        Test.instanceCount += (((i12 * i10) + i7) - s1);
                    } else if (Test.bFld) {
                        Test.byFld = (byte)i13;
                        i8 = i9;
                    } else if (Test.bFld) {
                        sArr[i12 - 1] |= (short)i7;
                    }
                    Test.iFld = (int)Test.instanceCount;
                    Test.iArrFld[i11] >>>= (int)Test.instanceCount;
                } while (++i12 < 1);
            }
        }
        vMeth1_check_sum += i7 + i8 + Float.floatToIntBits(f3) + i9 + i10 + i11 + i12 + s1 + i13 +
            FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth() {

        float f1=82.415F, f2=-2.804F;
        int i4=-13, i5=-1, i6=-173, i14=22;
        double d2=-1.124304;

        f1 = 1;
        do {
            Test.fFld -= ((Test.instanceCount - (Test.iFld++)) + Float.intBitsToFloat(Test.iFld));
            Test.iFld += (int)(f1 * f1);
            try {
                Test.iArrFld[(int)(f1)] = (Test.iArrFld[(int)(f1 + 1)] % Test.iFld);
                Test.iArrFld[(int)(f1 - 1)] = (Test.iFld % -37029);
                Test.iArrFld[(int)(f1 + 1)] = (41 / Test.iFld);
            } catch (ArithmeticException a_e) {}
            for (f2 = f1; 6 > f2; ++f2) {
                for (i5 = 1; 1 > i5; i5++) {
                    i4 += (((i5 * Test.byFld) + Test.iFld) - i4);
                    Test.fFld -= (i6--);
                    i6 -= (int)Long.reverseBytes(i4 * Math.max(Test.iFld, Test.iFld));
                }
                vMeth1(i4, i4, f1);
                if (false) continue;
                Test.iFld -= (int)Test.instanceCount;
                for (d2 = 1; 1 > d2; d2++) {
                    try {
                        i6 = (19 % i14);
                        Test.iFld = (-16883 % Test.iArrFld[(int)(f1)]);
                        i6 = (Test.iFld % 2974);
                    } catch (ArithmeticException a_e) {}
                    i14 &= i5;
                }
            }
        } while (++f1 < 298);
        long meth_res = Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i4 + i5 + i6 +
            Double.doubleToLongBits(d2) + i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, double d) {

        double d1=0.33238;
        int i1=-227, i2=-34, i3=5, iArr[]=new int[N];
        short s=-6681;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2324805279L);
        FuzzerUtils.init(iArr, -3);

        i *= (int)Test.instanceCount;
        for (d1 = 4; d1 < 129; ++d1) {
            lArr = (lArr = (lArr = (lArr = lArr)));
            iArr[(int)(d1)] += i;
            if (i != 0) {
                vMeth_check_sum += i + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i1 + i2 + i3 + s +
                    FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
                return;
            }
            iArr[(int)(d1)] = (int)((i--) + lArr[(int)(d1 - 1)]);
            for (i2 = 1; i2 < 13; i2++) {
                float f=-1.740F;
                lArr[(int)(d1)] = i1;
                Test.bFld = (f >= (++i));
                i1 = 166;
                i = (iArr[i2]++);
                f = i2;
                iArr[i2] += s;
                i1 = (((-66 * iMeth()) + Test.iFld) - i);
                i3 <<= 49427;
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i1 + i2 + i3 + s +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        double d3=-14.80023;
        int i15=2, i16=53, i17=-10, i18=1, i19=4;
        short s2=-20644;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 36.204F);

        vMeth(Test.iFld, d3);
        i15 = 1;
        while (++i15 < 138) {
            Test.fFld -= (float)d3;
            fArr = FuzzerUtils.float1array(N, (float)1.25F);
            Test.instanceCount += (i15 | s2);
            for (i16 = 10; i16 < 182; ++i16) {
                i18 = 1;
                while (++i18 < 2) {
                    Test.iFld -= Test.iFld;
                    Test.iFld *= i17;
                    switch ((i15 % 7) + 60) {
                    case 60:
                        switch ((i16 % 6) + 31) {
                        case 31:
                            i17 -= -18;
                            Test.byFld += (byte)(i18 ^ i16);
                            break;
                        case 32:
                            Test.iFld -= Test.byFld;
                            Test.dFld += fFld1;
                            break;
                        case 33:
                            s2 += (short)Test.iFld;
                            Test.dFld -= i15;
                            Test.iArrFld[i18] = (int)1.42672;
                            break;
                        case 34:
                        case 35:
                            Test.iFld = -22;
                            Test.fFld = -7L;
                            i17 -= -7;
                            break;
                        case 36:
                            i17 &= i15;
                            Test.instanceCount += (i18 + i17);
                            break;
                        default:
                            switch ((i16 % 8) + 50) {
                            case 50:
                                switch ((i15 % 2) + 32) {
                                case 32:
                                    try {
                                        i17 = (100 / Test.iArrFld[i15]);
                                        Test.iFld = (i18 / Test.iFld);
                                        i17 = (Test.iArrFld[i16 - 1] / 55508);
                                    } catch (ArithmeticException a_e) {}
                                    Test.instanceCount += (((i18 * Test.instanceCount) + i17) - Test.instanceCount);
                                    Test.instanceCount -= -5;
                                    break;
                                case 33:
                                    Test.iFld += (((i18 * i17) + Test.iFld) - i18);
                                    break;
                                default:
                                    Test.iArrFld[i15 - 1] |= 13;
                                }
                                break;
                            case 51:
                                fFld1 += Test.fFld;
                                break;
                            case 52:
                                if (Test.bFld) break;
                                break;
                            case 53:
                                try {
                                    i17 = (-31324 / i15);
                                    Test.iArrFld[i16 - 1] = (i15 % Test.iArrFld[i18 + 1]);
                                    i19 = (7102 / i16);
                                } catch (ArithmeticException a_e) {}
                            case 54:
                                Test.iFld = i17;
                                break;
                            case 55:
                                Test.iArrFld[i15 + 1] -= (int)-5641543939746338644L;
                            case 56:
                                Test.instanceCount = i18;
                                break;
                            case 57:
                                Test.iFld <<= Test.iFld;
                                break;
                            }
                        }
                        break;
                    case 61:
                        d3 *= 7224571217861356586L;
                        break;
                    case 62:
                        Test.instanceCount <<= i18;
                        break;
                    case 63:
                        i19 -= (int)Test.instanceCount;
                        break;
                    case 64:
                        i17 = Test.byFld;
                        break;
                    case 65:
                        s2 = (short)i19;
                        break;
                    case 66:
                        i19 = i16;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("d3 i15 s2 = " + Double.doubleToLongBits(d3) + "," + i15 + "," + s2);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 fArr = " + i19 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld Test.byFld Test.dFld = " + Test.iFld + "," + Test.byFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("fFld1 Test.iArrFld = " + Float.floatToIntBits(fFld1) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

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
