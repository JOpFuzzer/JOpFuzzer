// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=7174170762564525197L;
    public static float fFld=13.668F;
    public short sFld=7860;
    public boolean bFld=false;
    public static double dFld=-63.45159;
    public static long lArrFld[]=new long[N];
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 0L);
        FuzzerUtils.init(Test.iArrFld, -46770);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(int i4, float f) {

        int i5=7, i6=-112, i7=0, i8=250, i9=-137, i10=-5, i11=-132;
        double d=-103.57886;

        i5 = 1;
        do {
            i4 -= (int)Test.instanceCount;
            Test.instanceCount *= 10L;
            Test.instanceCount -= Test.instanceCount;
            d += i4;
            for (i6 = 1; i6 < 18; i6++) {
                Test.lArrFld[i5] = Test.instanceCount;
                i7 ^= (int)Test.instanceCount;
                Test.instanceCount *= i7;
            }
        } while ((i5 += 2) < 170);
        i4 >>= (int)Test.instanceCount;
        for (i8 = 5; i8 < 187; i8++) {
            for (i10 = i8; i10 < 9; i10++) {
                i9 -= 20181;
                i9 = -9752;
                i9 = i10;
            }
        }
        long meth_res = i4 + Float.floatToIntBits(f) + i5 + Double.doubleToLongBits(d) + i6 + i7 + i8 + i9 + i10 + i11;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static long lMeth(int i2, long l1, int i3) {

        float f1=0.117F, fArr[]=new float[N];
        double d1=-98.65935;
        int i12=-5, i13=-59233, i14=11;
        byte by=-40;
        short s=3255;

        FuzzerUtils.init(fArr, 86.408F);

        switch ((((i3 += i2) >>> 1) % 3) + 10) {
        case 10:
        case 11:
            i2 = (int)(i3 -= (int)dMeth(-213, f1));
            i2 -= i2;
            for (d1 = 3; d1 < 177; ++d1) {
                for (i13 = 1; i13 < 9; i13++) {
                    by += (byte)i3;
                }
                i3 = 26;
                i3 = by;
                i14 *= s;
                Test.instanceCount += (long)d1;
                i2 = i13;
            }
            i2 *= (int)6L;
            break;
        case 12:
            l1 = i13;
            break;
        default:
            fArr[(i12 >>> 1) % N] /= 1895;
            l1 = i14;
        }
        long meth_res = i2 + l1 + i3 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i12 + i13 + i14 + by +
            s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(long l, int i1) {

        int i15=164, i16=-1549, i17=-38775, i18=-55817, i19=-180, i20=-24601;
        byte by1=123;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -64.136F);

        Test.instanceCount += lMeth(i1, l, i1);
        i1 = i1;
        Test.iArrFld[(i1 >>> 1) % N] = i1;
        for (float f2 : fArr1) {
            i15 = 1;
            do {
                i16 = (int)f2;
                Test.instanceCount %= (long)2.835F;
                i17 += i18;
                switch ((((63587 >>> 1) % 2) * 5) + 117) {
                case 124:
                case 122:
                    for (i19 = 1; i19 < 1; ++i19) {
                        by1 += (byte)i16;
                        l = -196;
                        Test.iArrFld[i19] >>>= (int)-216L;
                        Test.lArrFld = FuzzerUtils.long1array(N, (long)-181L);
                        i16 += (int)Test.instanceCount;
                    }
                    break;
                }
            } while (++i15 < 4);
        }
        long meth_res = l + i1 + i15 + i16 + i17 + i18 + i19 + i20 + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=59141, i21=-7, i22=-30447, i23=14, i24=-33643, i25=-7;
        byte by2=-12;

        if (bFld) {
            i -= (int)(iMeth(Test.instanceCount, i) * -4L);
            for (i21 = 5; 277 > i21; i21++) {
                for (i23 = 1; i23 < 92; i23++) {
                    i24 = i22;
                    i25 = 2;
                    while (--i25 > 0) {
                        Test.iArrFld[i25] += (int)Test.instanceCount;
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)6);
                        switch (((i21 % 5) * 5) + 80) {
                        case 87:
                            Test.fFld = sFld;
                            i += (((i25 * Test.instanceCount) + Test.fFld) - i);
                            break;
                        case 91:
                            Test.instanceCount += i25;
                            by2 |= (byte)Test.instanceCount;
                            i24 = (int)Test.instanceCount;
                        case 92:
                            try {
                                Test.iArrFld[i23] = (Test.iArrFld[i23 - 1] % i23);
                                Test.iArrFld[i25 + 1] = (Test.iArrFld[i23 + 1] / 1087292711);
                                i = (Test.iArrFld[i23 + 1] % -1331632010);
                            } catch (ArithmeticException a_e) {}
                            if (bFld) break;
                            switch (((i21 % 10) * 5) + 49) {
                            case 66:
                            case 70:
                                i += (i25 - i23);
                                Test.iArrFld[i25 - 1] -= (int)Test.instanceCount;
                                i -= -11;
                                i *= (int)Test.dFld;
                                break;
                            case 61:
                                i24 = i;
                                break;
                            case 85:
                                if (bFld) continue;
                                i22 -= (int)Test.instanceCount;
                                Test.instanceCount = i23;
                                break;
                            case 97:
                                i22 >>= -65338;
                                break;
                            case 88:
                                i24 += (((i25 * i22) + Test.instanceCount) - Test.instanceCount);
                                Test.instanceCount += (i25 * i25);
                                Test.instanceCount += (i25 ^ i);
                                i22 -= sFld;
                            case 87:
                                if (false) continue;
                            case 78:
                                Test.lArrFld[i23 - 1] -= i23;
                                break;
                            case 76:
                                i24 += i22;
                                break;
                            case 59:
                                i += i24;
                                break;
                            default:
                                i22 = (int)-2188879725L;
                            }
                            break;
                        case 82:
                            Test.instanceCount += i25;
                            break;
                        case 103:
                            i22 += (21 + (i25 * i25));
                            break;
                        default:
                            i24 += i24;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i21 i22 = " + i + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("by2 = " + by2);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + sFld);
        FuzzerUtils.out.println("bFld Test.dFld Test.lArrFld = " + (bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  dMeth ->  dMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
