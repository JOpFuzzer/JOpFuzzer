// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:01 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-808454285312329993L;
    public static boolean bFld=false;
    public static double dFld=-1.103123;
    public static float fFld=-46.589F;
    public volatile short sFld=-22619;
    public static int iFld=-48750;

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        float f=6.814F;
        int i6=-10397, i7=-42650, i8=-51590, i9=14, i10=182, i11=-85;
        short s=-3075;

        f -= f;
        Test.instanceCount >>= 1568;
        for (i6 = 7; i6 < 284; ++i6) {
            i7 += i6;
            switch ((i6 % 10) + 53) {
            case 53:
                i7 += (int)f;
                for (i8 = 6; 1 < i8; --i8) {
                    i9 >>>= i7;
                    for (i10 = 2; i10 > 1; i10--) {
                        i9 = (int)Test.instanceCount;
                        s -= (short)i8;
                        i9 >>= (int)-4L;
                        Test.instanceCount -= 7;
                        i7 += i10;
                        i9 += i6;
                    }
                }
                break;
            case 54:
                i7 *= (int)f;
            case 55:
                f += ((long)i6 ^ (long)i6);
            case 56:
                Test.instanceCount <<= Test.instanceCount;
                break;
            case 57:
                Test.instanceCount *= i7;
                break;
            case 58:
                Test.instanceCount += s;
                break;
            case 59:
                f += (i6 * i6);
                break;
            case 60:
                i9 += (((i6 * i7) + i6) - i9);
                break;
            case 61:
                i9 += -48429;
            case 62:
                Test.dFld *= Test.instanceCount;
                break;
            default:
                if (i11 != 0) {
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i10 + i11 + s;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i3) {

        int i4=-14, i5=24935, i12=13, i13=-153, i14=14, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 85);

        iArr[(-5 >>> 1) % N] = (int)-116.40772;
        for (i4 = 148; i4 > 9; i4 -= 3) {
            if (Test.bFld = Test.bFld) continue;
            i3 -= iArr[i4 + 1];
            i5 += (i4 * i4);
            Test.dFld = iMeth();
            i3 += (i4 | i4);
            i5 *= -99;
            i12 = 1;
            while (++i12 < 33) {
                if (Test.bFld) {
                    i5 <<= i5;
                    for (i13 = 1; i13 > i12; i13 -= 3) {
                        Test.instanceCount += (((i13 * i14) + i4) - Test.fFld);
                        i14 = i12;
                        Test.instanceCount = (long)1.922F;
                    }
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth(int i) {

        int i1=65366, i2=-203, i15=5, i16=461, i17=-222;
        float f1=87.120F;
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(sArr, (short)-16409);

        switch ((((-9697 * Integer.reverseBytes(i)) >>> 1) % 1) + 82) {
        case 82:
            for (i1 = 4; 204 > i1; ++i1) {
                Test.instanceCount = (long)(i2 - fMeth(i1));
                Test.instanceCount -= sFld;
                for (i15 = 1; i15 < 8; ++i15) {
                    switch ((i1 % 2) + 8) {
                    case 8:
                        Test.instanceCount >>= Test.instanceCount;
                        break;
                    case 9:
                        for (f1 = 1; f1 < 2; ++f1) {
                            i16 += (int)(f1 + Test.instanceCount);
                            Test.instanceCount = sFld;
                            i <<= i1;
                            i2 -= (int)Test.instanceCount;
                            i16 = -99;
                            sArr[(int)(f1 - 1)][i15 - 1] >>= (short)-6984;
                            i = i16;
                        }
                        break;
                    }
                }
            }
            break;
        }
        vMeth_check_sum += i + i1 + i2 + i15 + i16 + Float.floatToIntBits(f1) + i17 + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=28495, i19=207, i20=186, i21=4, i22=1;
        float f2=-94.388F;
        double d=-114.89231;
        long lArr[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(lArr, -189L);
        FuzzerUtils.init(byArr, (byte)-92);

        vMeth(Test.iFld);
        i18 = 1;
        while (++i18 < 171) {
            for (f2 = 3; f2 < 147; f2++) {
                for (i20 = 1; i20 < 2; ++i20) {
                    i21 += -13;
                }
                switch ((int)((f2 % 2) + 96)) {
                case 96:
                    i21 += (int)Test.instanceCount;
                    break;
                case 97:
                    for (d = 1; d < 2; d++) {
                        byte by=2;
                        by -= (byte)sFld;
                        i21 += (int)(d - i22);
                        Test.iFld *= i22;
                        if (Test.bFld) {
                            Test.instanceCount = Test.instanceCount;
                        }
                        lArr[i18 - 1] >>>= 25052;
                        switch ((int)(((f2 % 9) * 5) + 11)) {
                        case 41:
                            if (false) {
                                if (Test.bFld) continue;
                                Test.fFld += (float)(d * d);
                                i22 += (int)(-30116L + (d * d));
                                Test.iFld -= i20;
                            } else if (Test.bFld) {
                                i22 += (int)((long)d | i21);
                                Test.instanceCount = Test.instanceCount;
                            } else {
                                byArr[(int)(f2)] = (byte)i19;
                            }
                        case 12:
                            Test.instanceCount -= Test.instanceCount;
                            i21 = (int)27382L;
                            Test.iFld &= i20;
                            i22 = Test.iFld;
                            break;
                        case 28:
                            i22 = i20;
                            i19 = i19;
                            break;
                        case 30:
                            byArr = byArr;
                            break;
                        case 33:
                            Test.instanceCount += (long)(d * d);
                        case 22:
                            Test.instanceCount += (long)(d * d);
                            break;
                        case 53:
                            i19 += (int)d;
                            break;
                        case 27:
                            Test.instanceCount = Test.instanceCount;
                            break;
                        case 48:
                            Test.bFld = Test.bFld;
                            break;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i18 f2 i19 = " + i18 + "," + Float.floatToIntBits(f2) + "," + i19);
        FuzzerUtils.out.println("i20 i21 d = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i22 lArr byArr = " + i22 + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.dFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld sFld Test.iFld = " + Float.floatToIntBits(Test.fFld) + "," + sFld + "," +
            Test.iFld);

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}