// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:47 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=10250L;
    public static short sFld=-31246;
    public static byte byFld=-49;
    public boolean bFld=true;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 251);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5) {

        int i6=-28714, i7=13, i8=168, i9=35238, i10=5, i11=127, iArr[]=new int[N];
        float f2=1.353F;
        boolean b=false;
        double d1=0.108269;

        FuzzerUtils.init(iArr, 11);

        i6 = 1;
        while (++i6 < 240) {
            for (i7 = 1; i7 < 7; i7++) {
                i5 += (i7 + i8);
                for (i9 = i6; 2 > i9; ++i9) {
                    try {
                        i10 = (-61 % i8);
                        iArr[i7] = (i6 / i6);
                        iArr[i9] = (93 % i8);
                    } catch (ArithmeticException a_e) {}
                    f2 += i9;
                    i5 += (((i9 * i7) + i7) - i7);
                    i8 += 2;
                    switch (((i9 % 2) * 5) + 25) {
                    case 33:
                        Test.instanceCount += (i9 | (long)f2);
                        f2 = i11;
                        b = b;
                        break;
                    case 35:
                        Test.sFld += (short)d1;
                        i5 >>>= i9;
                        Test.instanceCount = Test.instanceCount;
                        break;
                    }
                }
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + i11 + (b ? 1 : 0) +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(float f, float f1, int i4) {

        short s=-10645;
        double d=0.127086, d2=50.130518;
        int i12=-9016, i13=11, i14=5, i15=5;
        boolean b1=true;

        s = (short)(Integer.reverseBytes(i4 + 243) + Math.abs(d));
        vMeth2(24110);
        for (d2 = 10; d2 < 337; d2++) {
            Test.instanceCount += (long)(((d2 * i12) + Test.byFld) - f1);
            Test.instanceCount = -3788;
            i12 *= (int)d2;
            for (i13 = 1; i13 < 5; ++i13) {
                i15 = 1;
                while (++i15 < 2) {
                    Test.instanceCount = i15;
                    Test.instanceCount -= Test.instanceCount;
                    Test.byFld *= (byte)i12;
                    if (true) {
                        Test.iArrFld[i13 + 1] -= (int)26.389F;
                    } else if (b1) {
                        Test.iArrFld[i13 + 1] = (int)f1;
                        if (b1) continue;
                    } else if (b1) {
                        i12 += (3792 + (i15 * i15));
                    }
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i4 + s + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(d2) + i12 + i13 + i14 + i15 + (b1 ? 1 : 0);
    }

    public static void vMeth(int i2, int i3) {

        float f3=116.35F, fArr[]=new float[N];
        int i16=0, i17=48286, i18=-14492;
        double d3=-37.61702;

        FuzzerUtils.init(fArr, 0.493F);

        vMeth1(f3, f3, i2);
        Test.instanceCount += Test.instanceCount;
        i16 = 1;
        while (++i16 < 233) {
            i3 = 46;
            Test.byFld += (byte)(((i16 * i2) + i2) - Test.byFld);
            i17 = 1;
            do {
                Test.instanceCount *= Test.instanceCount;
                i3 += (i17 - Test.instanceCount);
                Test.instanceCount = 1;
                i2 = Test.sFld;
                i2 <<= 8;
                fArr[i17] = Test.instanceCount;
                i18 = 1;
                do {
                    Test.iArrFld[i16] = (int)Test.instanceCount;
                    d3 = Test.instanceCount;
                } while ((i18 += 3) < 1);
            } while (++i17 < 7);
        }
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f3) + i16 + i17 + i18 + Double.doubleToLongBits(d3) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-98, i1=13, i19=23455, i20=12, i21=-28486, i22=-14;
        long l=-22L, lArr[][]=new long[N][N];
        double d4=1.18385;
        float f4=76.280F, f5=110.671F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(lArr, 0L);
        FuzzerUtils.init(byArr, (byte)42);

        for (i = 17; i < 384; i++) {
            Test.instanceCount += (i + Test.instanceCount);
            i1 += (72 + (i * i));
            Test.instanceCount -= lArr[i - 1][i + 1];
            i1 += i;
            vMeth(i, i1);
            Test.instanceCount -= i1;
            i1 -= (int)Test.instanceCount;
        }
        for (l = 14; 342 > l; l++) {
            i1 += (int)(l ^ Test.sFld);
            Test.iArrFld[(int)(l - 1)] >>= 44306;
            i19 = (int)1627828209L;
            i1 ^= i1;
            i19 = 41326;
            Test.byFld += (byte)l;
            switch (((i1 >>> 1) % 2) + 102) {
            case 102:
            case 103:
                Test.byFld += (byte)l;
                lArr[(int)(l)][(int)(l - 1)] = (long)d4;
                for (i20 = 4; i20 < 77; ++i20) {
                    for (f4 = 1; f4 < 2; f4++) {
                        i19 |= i22;
                        if (bFld) break;
                        f5 = Test.instanceCount;
                        d4 = 9;
                        i21 -= i22;
                        byArr[(int)(l)] -= (byte)i20;
                        switch ((int)((l % 2) + 91)) {
                        case 91:
                            i1 += (int)f4;
                            i1 += (int)(f4 - i22);
                            i1 += (int)(((f4 * Test.instanceCount) + i20) - i19);
                            break;
                        case 92:
                            i22 = (int)f5;
                            break;
                        default:
                            i19 *= (int)f5;
                        }
                    }
                }
                break;
            default:
                byArr[(int)(l + 1)] <<= (byte)l;
            }
        }

        FuzzerUtils.out.println("i i1 l = " + i + "," + i1 + "," + l);
        FuzzerUtils.out.println("i19 d4 i20 = " + i19 + "," + Double.doubleToLongBits(d4) + "," + i20);
        FuzzerUtils.out.println("i21 f4 i22 = " + i21 + "," + Float.floatToIntBits(f4) + "," + i22);
        FuzzerUtils.out.println("f5 lArr byArr = " + Float.floatToIntBits(f5) + "," + FuzzerUtils.checkSum(lArr) + ","
            + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("bFld Test.iArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(Test.iArrFld));

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
