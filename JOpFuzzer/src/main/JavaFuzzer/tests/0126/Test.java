// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:44 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-241L;
    public static double dFld=0.30807;
    public static boolean bFld=true;
    public static int iFld=-54415;
    public volatile float fArrFld[]=new float[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i8, long l, int i9) {

        int i10=-14, i11=-8, i12=48, i13=-207, i14=-142, i15=62563, iArr1[]=new int[N];
        float f2=0.418F, fArr[]=new float[N];
        boolean b=true;
        byte byArr[]=new byte[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(byArr, (byte)91);
        FuzzerUtils.init(iArr1, 244);
        FuzzerUtils.init(fArr, 2.230F);
        FuzzerUtils.init(dArr, 104.104202);

        byArr[(-4 >>> 1) % N] = (byte)i8;
        for (i10 = 8; i10 < 132; i10++) {
            switch ((((84 >>> 1) % 6) * 5) + 75) {
            case 96:
                if (b) {
                    if (b) {
                        i12 = 13;
                        do {
                            i9 = i8;
                            iArr1[(145 >>> 1) % N] = (int)Test.instanceCount;
                            Test.instanceCount += (long)f2;
                            i9 -= (int)Test.dFld;
                        } while (--i12 > 0);
                    } else {
                        for (i13 = 1; 13 > i13; ++i13) {
                            i15 = 1;
                            while (++i15 < 2) {
                                fArr[i15] += i12;
                                i9 >>= (int)l;
                                dArr[i13 + 1] *= Test.dFld;
                            }
                        }
                    }
                }
            case 77:
                i14 = (int)Test.dFld;
                break;
            case 78:
                i14 += i11;
                break;
            case 94:
                l += (3 + (i10 * i10));
                break;
            case 87:
                i8 ^= i10;
                break;
            case 91:
                if (b) continue;
                break;
            default:
                if (i15 != 0) {
                }
            }
        }
        long meth_res = i8 + l + i9 + i10 + i11 + i12 + Float.floatToIntBits(f2) + (b ? 1 : 0) + i13 + i14 + i15 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(byte by, int i6, int i7) {

        float f1=0.580F;
        int i16=-47548, i17=-22493, i18=16626, i19=8, i20=-41926, iArr2[]=new int[N];
        boolean b1=true;
        short s=31051;
        double dArr1[]=new double[N];

        FuzzerUtils.init(iArr2, 19795);
        FuzzerUtils.init(dArr1, 0.27372);

        Test.instanceCount -= (long)(((i6 - i6) - (i7 * f1)) + (i6 + Test.instanceCount));
        Test.instanceCount *= iMeth(i6, Test.instanceCount, i6);
        for (i16 = 17; i16 < 301; i16++) {
            i7 %= (int)((long)(f1) | 1);
            switch ((i16 % 8) * 5) {
            case 27:
                for (i18 = 1; i18 < 6; ++i18) {
                    i20 = 2;
                    while ((i20 -= 2) > 0) {
                        i7 = i18;
                        iArr2[i18] = i7;
                        b1 = b1;
                        iArr2[i20] += i6;
                        f1 = 8704945102949990972L;
                        i17 &= i18;
                    }
                    dArr1[i16] = i16;
                    dArr1[i18 - 1] -= -11;
                }
                break;
            case 10:
                i7 += (i16 + i7);
                break;
            case 20:
                i7 += i16;
                break;
            case 3:
                Test.instanceCount *= i6;
                break;
            case 34:
                i17 = i18;
                break;
            case 28:
                i7 = (int)f1;
            case 38:
                Test.instanceCount >>>= s;
                break;
            case 33:
                i19 -= (int)Test.instanceCount;
                break;
            default:
                iArr2[i16 + 1] ^= (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += by + i6 + i7 + Float.floatToIntBits(f1) + i16 + i17 + i18 + i19 + i20 + (b1 ? 1 : 0) + s +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public static void vMeth(int i, int i1, int i2) {

        float f=-17.670F;
        int i3=-4, i4=-45, i5=-19513, iArr[]=new int[N];
        double d=0.99972, dArr2[]=new double[N];
        byte by1=2;

        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(dArr2, -119.35641);

        i1 = ((--iArr[(i >>> 1) % N]) | -3);
        i -= (--i);
        f = (((-(i2 - i2)) + (i - f)) - (++i2));
        i3 = 1;
        while (++i3 < 397) {
            for (i4 = 1; i4 < 4; i4++) {
                i1 -= (int)((iArr[i4]++) * ((-(i1 - 5)) + Test.instanceCount));
                d = i4;
                d = ((--f) + (++i1));
            }
            vMeth1(by1, i5, i1);
            if (Test.bFld) break;
            Test.bFld = Test.bFld;
            i5 -= -19463;
            dArr2[i3] -= i;
        }
        i2 = i;
        by1 += (byte)i1;
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + i5 + Double.doubleToLongBits(d) + by1 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr2));
    }

    public void mainTest(String[] strArr1) {

        int i21=-6, i22=4410, i23=5656, i24=-3085, i25=-5, i26=-32312, i27=140, i28=-216, i29=-38022, i30=3, i31=-14,
            i32=3, i33=229, i34=49816, i35=7, iArr3[][]=new int[N][N];
        float f3=35.629F;
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(iArr3, 5);
        FuzzerUtils.init(byArr1, (byte)-26);

        vMeth(i21, i21, i21);
        for (i22 = 15; i22 < 353; ++i22) {
            Test.instanceCount = Test.instanceCount;
            i23 = i23;
            Test.instanceCount = i23;
            f3 -= -184;
            for (i24 = i22; i24 < 74; i24 += 2) {
                i23 -= -59523;
            }
            for (i26 = 74; i26 > 2; --i26) {
                i27 += (i26 - Test.instanceCount);
                f3 = i24;
                f3 += (((i26 * i22) + i22) - i26);
            }
            i27 = (int)Test.dFld;
            i27 -= (int)Test.dFld;
            for (i28 = 3; i28 < 74; ++i28) {
                iArr3[i22 - 1][i22 - 1] *= (int)f3;
                i29 += (-102 + (i28 * i28));
                Test.bFld = Test.bFld;
            }
            i23 += (int)Test.instanceCount;
        }
        for (i30 = 10; i30 < 187; i30++) {
            i21 += (i30 | Test.iFld);
            byArr1[i30] <<= (byte)Test.instanceCount;
            for (i32 = 2; i32 < 142; i32++) {
                i23 /= (int)((long)(f3) | 1);
            }
            if (Test.bFld) continue;
            for (i34 = 3; i34 < 142; ++i34) {
                f3 += (i34 * i34);
            }
            Test.instanceCount += (((i30 * Test.iFld) + i29) - i21);
            i31 = 22;
            f3 -= (float)Test.dFld;
        }

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("f3 i24 i25 = " + Float.floatToIntBits(f3) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 i33 i34 = " + i32 + "," + i33 + "," + i34);
        FuzzerUtils.out.println("i35 iArr3 byArr1 = " + i35 + "," + FuzzerUtils.checkSum(iArr3) + "," +
            FuzzerUtils.checkSum(byArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iFld fArrFld = " + Test.iFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
