// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:44 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public static short sFld=10773;
    public static float fFld=1.733F;
    public static double dFld=127.70195;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d, int i5, int i6) {

        int i7=98, i8=63371, i9=20375, i10=-60528;
        double d1=-2.130418;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1L);

        for (i7 = 8; i7 < 329; i7++) {
            d1 = 5;
            while (--d1 > 0) {
                if (true) break;
                d += i8;
                switch ((int)(((d1 % 2) * 5) + 126)) {
                case 127:
                    i5 *= (int)Test.instanceCount;
                    break;
                case 132:
                    i6 &= Test.sFld;
                    i8 >>= (int)-232L;
                    i5 *= i5;
                    i5 = i6;
                }
                i5 *= -134;
                d -= -8;
                for (i9 = i7; 1 > i9; ++i9) {
                    i5 += (int)Test.instanceCount;
                    lArr[i9] *= i9;
                }
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d1) + i9 + i10 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i2, int i3) {

        int i4=-238, i11=51426, i12=-98, i13=2, i14=233, iArr[]=new int[N];
        double d2=-58.112112;
        boolean b=false;
        float f=0.216F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(fArr, -2.129F);

        i4 = 1;
        do {
            vMeth2(d2, i4, i4);
            b = b;
            switch (((i3 >>> 1) % 2) + 59) {
            case 59:
                for (i11 = i4; i11 < 5; ++i11) {
                    for (i13 = 1; i13 < 1; i13++) {
                        i14 = 21278;
                        f = i13;
                        f *= (float)-108.121915;
                        Test.instanceCount += (((i13 * i4) + i12) - i4);
                        try {
                            i3 = (-1876716995 / i2);
                            i12 = (2 % i3);
                            i12 = (i11 % 469576698);
                        } catch (ArithmeticException a_e) {}
                        switch ((i11 % 8) + 49) {
                        case 49:
                            f += f;
                        case 50:
                            try {
                                i2 = (i2 / iArr[i11]);
                                i3 = (i14 % -144);
                                i14 = (i13 / -192056305);
                            } catch (ArithmeticException a_e) {}
                            fArr[i13 + 1] = i12;
                            break;
                        case 51:
                            i3 = i12;
                            break;
                        case 52:
                            d2 = i14;
                            break;
                        case 53:
                            d2 = 26309;
                            break;
                        case 54:
                            i2 = i14;
                            break;
                        case 55:
                            try {
                                i3 = (i12 % -203);
                                i3 = (iArr[i4 - 1] / -34040);
                                i2 = (i12 / 225);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 56:
                            i12 += (int)Test.instanceCount;
                            break;
                        default:
                            iArr[i13 - 1] += i11;
                        }
                    }
                }
            case 60:
                iArr[i4] %= (int)(i2 | 1);
            default:
                Test.instanceCount = i13;
            }
        } while (++i4 < 320);
        vMeth1_check_sum += i2 + i3 + i4 + Double.doubleToLongBits(d2) + (b ? 1 : 0) + i11 + i12 + i13 + i14 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i1) {

        int i15=2689, i16=14, i17=-221, i18=-10, i19=245, i20=73, i21=-128, iArr1[]=new int[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr1, -14058);
        FuzzerUtils.init(fArr1, 51.970F);

        vMeth1(-53, i1);
        i15 = 1;
        while (++i15 < 377) {
            Test.instanceCount -= Test.instanceCount;
        }
        i1 >>>= i15;
        i16 = 1;
        while (++i16 < 209) {
            for (i17 = 1; i17 < 8; i17++) {
                Test.instanceCount += (((i17 * i15) + i18) - i16);
            }
            i19 = 1;
            do {
                for (i20 = 1; i20 < 1; i20++) {
                    try {
                        i18 = (i16 % -52344);
                        i1 = (-149 % i19);
                        i18 = (i17 / -98);
                    } catch (ArithmeticException a_e) {}
                    iArr1[i20] = i17;
                    i21 = i21;
                    i18 *= i17;
                    fArr1[i20] = i16;
                    Test.sFld += (short)Test.fFld;
                }
            } while (++i19 < 8);
        }
        vMeth_check_sum += i1 + i15 + i16 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        long l=-59796L, l1=7L, lArr1[]=new long[N];
        int i=-194, i22=-54685, i23=-10, i25=-2259, i26=8, i27=246, i28=-14, i29=-8, i30=-232, iArr2[]=new int[N];
        boolean b1=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr2, -10);
        FuzzerUtils.init(dArr, -1.21313);
        FuzzerUtils.init(lArr1, 48L);

        for (l = 7; l < 153; ++l) {
            vMeth(i);
            i <<= Test.sFld;
            for (i22 = (int)(l); 172 > i22; ++i22) {
                Test.sFld *= (short)i22;
                i23 <<= i23;
            }
            if (b1) break;
        }
        Test.sFld = (short)i23;
        i23 = i22;
        i23 = (int)Test.dFld;
        for (int i24 : iArr2) {
            i25 = 1;
            do {
                i24 -= 23666;
            } while (++i25 < 63);
            dArr[(i23 >>> 1) % N] += -46783;
            Test.dFld += Test.instanceCount;
            for (i26 = 2; i26 < 63; ++i26) {
                for (i28 = 2; i28 > i26; --i28) {
                    i27 -= i28;
                    i29 -= (int)Test.fFld;
                    iArr2[i26 - 1] *= (int)Test.dFld;
                }
                switch (((i26 % 6) * 5) + 75) {
                case 95:
                    i += -10;
                    i29 |= i22;
                    for (l1 = 1; l1 < 2; l1++) {
                        Test.instanceCount += i26;
                        Test.fFld -= 181;
                        if (b1) break;
                        i24 -= i22;
                        i30 *= i26;
                        i23 += 2;
                    }
                    break;
                case 81:
                    if (b1) continue;
                    break;
                case 86:
                    i27 -= Test.sFld;
                    break;
                case 99:
                    Test.sFld = (short)i23;
                    break;
                case 79:
                    i -= (int)l1;
                    break;
                case 94:
                    lArr1[i26] = (long)1.11585;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("l i i22 = " + l + "," + i + "," + i22);
        FuzzerUtils.out.println("i23 b1 i25 = " + i23 + "," + (b1 ? 1 : 0) + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 l1 i30 = " + i29 + "," + l1 + "," + i30);
        FuzzerUtils.out.println("iArr2 dArr lArr1 = " + FuzzerUtils.checkSum(iArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.dFld = " + Double.doubleToLongBits(Test.dFld));

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