// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:51 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5127930059934958215L;
    public static double dFld=-2.107306;
    public static volatile int iFld=-6;
    public static volatile long lFld=31943L;
    public static short sFld=-14261;
    public static int iFld1=-143;
    public static double dArrFld[]=new double[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -2.12402);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d1, byte by2) {

        int i7=-229, i8=-5, i9=61558, i10=-249, i11=-5, iArr[]=new int[N];
        boolean b=true;
        float f1=70.209F;
        short s=-1552;

        FuzzerUtils.init(iArr, -11091);

        i7 = 1;
        do {
            Test.iFld = (int)Test.instanceCount;
            for (i8 = 1; i8 < 7; i8++) {
                i9 = i9;
                if (b) continue;
                iArr[i7 + 1] = -4099;
                for (i10 = 2; i10 > 1; --i10) {
                    i9 += (i10 + Test.instanceCount);
                    i9 = i9;
                    Test.instanceCount = 106;
                    f1 += ((long)i10 | (long)i11);
                    Test.instanceCount = 3818463486341392352L;
                    Test.iFld += i10;
                    Test.iFld = (int)Test.instanceCount;
                    iArr[i7] += s;
                }
            }
        } while (++i7 < 250);
        long meth_res = Double.doubleToLongBits(d1) + by2 + i7 + i8 + i9 + (b ? 1 : 0) + i10 + i11 +
            Float.floatToIntBits(f1) + s + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i5, int i6) {

        byte by1=124;
        float f=-15.810F, fArr[]=new float[N];
        int i12=51273, i13=25, i14=-9, i15=-54903, i16=-48071, i17=4, i18=10;
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 2.593F);
        FuzzerUtils.init(lArr, -25764L);

        Test.dFld *= ((23 * (by1 - -11L)) - Math.abs(f));
        f = (((i5 << 1) - i5) % (iMeth(Test.dFld, by1) | 1));
        for (i12 = 280; i12 > 12; --i12) {
            Test.instanceCount += (((i12 * i12) + f) - Test.instanceCount);
            fArr[i12] -= 136;
            for (i14 = 1; i14 < 6; ++i14) {
                lArr[i12 + 1] >>>= i5;
                i6 -= i13;
                f -= i12;
                i5 += (((i14 * Test.instanceCount) + f) - i16);
                Test.instanceCount = Test.instanceCount;
                i15 += (int)216L;
                for (i17 = 1; i17 < 2; ++i17) {
                    Test.iFld += i6;
                    i18 += (i17 ^ Test.lFld);
                }
            }
        }
        vMeth_check_sum += i5 + i6 + by1 + Float.floatToIntBits(f) + i12 + i13 + i14 + i15 + i16 + i17 + i18 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth(int i, int i1, int i2) {

        byte by=53, byArr[]=new byte[N];
        int i3=46, i4=11, i19=-2, i20=-128, i21=-10, i22=205, i23=-145, i24=62691;
        short sArr[]=new short[N];

        FuzzerUtils.init(byArr, (byte)-122);
        FuzzerUtils.init(sArr, (short)30974);

        by += (byte)Test.dFld;
        for (i3 = 189; 2 < i3; i3 -= 3) {
            Test.dArrFld[i3] *= i2;
            vMeth(i, i);
            for (i19 = 1; i19 < 25; i19++) {
                i2 = i4;
            }
            Test.instanceCount += i20;
            Test.sFld += (short)(i3 + Test.instanceCount);
            byArr[i3] *= (byte)Test.instanceCount;
            for (i21 = 1; i21 < 25; ++i21) {
                i20 = 37719;
                sArr = sArr;
            }
        }
        for (i23 = 201; i23 > 7; i23--) {
            Test.instanceCount = i23;
            by = (byte)i20;
        }
        long meth_res = i + i1 + i2 + by + i3 + i4 + i19 + i20 + i21 + i22 + i23 + i24 + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(sArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=1.18029;
        float f2=2.67F, fArr1[]=new float[N];
        boolean b1=true;
        int i25=-4, i26=5110, i27=17741, i28=14, i29=171, iArr1[]=new int[N];
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(iArr1, 109);
        FuzzerUtils.init(byArr1, (byte)-109);
        FuzzerUtils.init(fArr1, 2.485F);

        Test.instanceCount = ((++Test.instanceCount) * Test.instanceCount);
        d = lMeth(Test.iFld, Test.iFld, Test.iFld);
        Test.lFld = Test.iFld;
        f2 = 1;
        do {
            float f3=111.822F;
            Test.iFld <<= -87;
            iArr1[(int)(f2)] = Test.iFld;
            f3 *= Test.iFld;
            if (b1) break;
            Test.iFld += (int)(f2 * f2);
            Test.instanceCount -= -14;
            for (i25 = (int)(f2); i25 < 157; i25 += 3) {
                Test.iFld *= (int)f2;
                for (i27 = 1; i27 < 1; ++i27) {
                    Test.iFld += i28;
                    i28 = (int)d;
                    switch ((i27 % 1) + 112) {
                    case 112:
                        b1 = b1;
                        byArr1[(Test.iFld >>> 1) % N] = (byte)i26;
                    }
                    Test.lFld += 12;
                }
                d = i26;
                i28 += 14;
                i29 = 1;
                do {
                    switch (((i28 >>> 1) % 4) + 18) {
                    case 18:
                        i26 = i29;
                        break;
                    case 19:
                        Test.instanceCount = Test.instanceCount;
                        i26 -= (int)Test.instanceCount;
                        switch ((int)((f2 % 9) + 111)) {
                        case 111:
                            if (b1) continue;
                            i26 -= i29;
                            Test.lFld += i26;
                        case 112:
                            i28 >>= i26;
                            break;
                        case 113:
                            Test.sFld = (short)d;
                        case 114:
                            lArrFld[i25 + 1] -= Test.iFld;
                        case 115:
                            i26 |= i26;
                            break;
                        case 116:
                            Test.lFld = i25;
                            break;
                        case 117:
                            Test.iFld -= 10;
                            break;
                        case 118:
                            fArr1[i25] -= i25;
                        case 119:
                            iArr1[i29 + 1] %= -6748;
                            break;
                        default:
                            Test.instanceCount = Test.lFld;
                        }
                    case 20:
                        if (b1) break;
                        break;
                    case 21:
                        iArr1[(int)(f2 + 1)] = i25;
                    default:
                        try {
                            Test.iFld1 = (Test.iFld / 706308074);
                            iArr1[i25 + 1] = (2035318288 % i26);
                            Test.iFld1 = (iArr1[(int)(f2)] / Test.iFld);
                        } catch (ArithmeticException a_e) {}
                    }
                } while (++i29 < 1);
            }
        } while (++f2 < 160);

        FuzzerUtils.out.println("d f2 b1 = " + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f2) + "," + (b1
            ? 1 : 0));
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 iArr1 = " + i28 + "," + i29 + "," + FuzzerUtils.checkSum(iArr1));
        FuzzerUtils.out.println("byArr1 fArr1 = " + FuzzerUtils.checkSum(byArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.lFld Test.sFld Test.iFld1 = " + Test.lFld + "," + Test.sFld + "," + Test.iFld1);
        FuzzerUtils.out.println("Test.dArrFld lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld))
            + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}