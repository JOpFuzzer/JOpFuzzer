// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:00 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=23427L;
    public static float fFld=39.113F;
    public static byte byFld=-4;
    public static boolean bFld=false;
    public static volatile float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.779F);
        FuzzerUtils.init(Test.lArrFld, -46249L);
        FuzzerUtils.init(Test.iArrFld, 5);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(boolean b) {

        int i2=4, i3=-21622, i4=9, i5=35597, i6=-215, i7=-209, i8=-146, i9=-5;
        double d1=40.105236;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 203L);

        for (i2 = 7; 396 > i2; ++i2) {
            byte by=20;
            for (i4 = 1; i4 < 4; i4++) {
                i3 = (int)Test.instanceCount;
                i5 -= (int)41914L;
                Test.instanceCount -= 21081;
                lArr[i4] *= i5;
                i3 = (int)Test.fFld;
            }
            by = (byte)2.107693;
            for (i6 = i2; i6 < 4; i6++) {
                Test.fArrFld[i2 + 1] += i5;
            }
            for (i8 = 1; i8 < 4; i8++) {
                i5 += (((i8 * Test.instanceCount) + i9) - i8);
                i5 += (i8 * i8);
            }
            i3 <<= (int)Test.instanceCount;
            d1 = -78.175F;
        }
        long meth_res = (b ? 1 : 0) + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l, int i1, double d) {

        boolean b1=false;
        int i10=52650, i11=-34, i12=54748, i13=14, i14=29663, iArr[]=new int[N];
        short s=27270;

        FuzzerUtils.init(iArr, -3);

        i1 <<= (int)(Math.sqrt(d) + (iMeth(b1) * i1));
        for (i10 = 233; i10 > 1; i10--) {
            b1 = false;
            for (i12 = 1; i12 < 7; ++i12) {
                i1 = Test.byFld;
                i1 = i1;
                switch (((i12 % 8) * 5) + 96) {
                case 121:
                    i1 += (i12 | i11);
                    if (b1) break;
                    Test.fFld = Test.byFld;
                    Test.lArrFld[i12] += i1;
                    break;
                case 136:
                    switch ((i10 % 5) + 58) {
                    case 58:
                        iArr[i10 - 1] = (int)Test.instanceCount;
                        break;
                    case 59:
                        i13 = i12;
                        if (b1) continue;
                    case 60:
                    case 61:
                        iArr[i12 - 1] += s;
                        break;
                    case 62:
                        iArr[i10] += s;
                        break;
                    }
                case 103:
                    i11 = i1;
                    break;
                case 100:
                    iArr[i12 + 1] -= i1;
                    break;
                case 132:
                    if (b1) continue;
                    break;
                case 123:
                    i1 = i14;
                    break;
                case 104:
                    iArr[i10 - 1] >>>= (int)l;
                    break;
                case 108:
                    b1 = b1;
                    break;
                default:
                    i11 = (int)Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += l + i1 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) + i10 + i11 + i12 + i13 + s + i14 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i) {

        double d2=1.99320;
        int i15=0, i16=-12, i17=-30956, i18=15, i19=-62, iArr1[]=new int[N];
        short s1=7530;

        FuzzerUtils.init(iArr1, 127);

        vMeth1(Test.instanceCount, i, d2);
        i15 = 1;
        do {
            s1 -= (short)Test.instanceCount;
            try {
                iArr1[i15 + 1] = (i15 % 93);
                iArr1[i15 + 1] = (iArr1[i15] % i15);
                i = (-33941 / i15);
            } catch (ArithmeticException a_e) {}
            Test.lArrFld[i15 + 1] = Test.instanceCount;
            switch ((((i >>> 1) % 2) * 5) + 68) {
            case 70:
                for (i16 = i15; i16 < 6; i16++) {
                    i = (int)Test.instanceCount;
                    iArr1[i16 + 1] -= Test.byFld;
                    for (i18 = i15; i18 < 1; ++i18) {
                        i19 = (int)Test.instanceCount;
                        i19 <<= 12;
                    }
                    iArr1[i15] -= i17;
                    if (i19 != 0) {
                        vMeth_check_sum += i + Double.doubleToLongBits(d2) + i15 + s1 + i16 + i17 + i18 + i19 +
                            FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                }
                Test.instanceCount += Test.instanceCount;
            case 73:
                i += i17;
            }
        } while (++i15 < 253);
        vMeth_check_sum += i + Double.doubleToLongBits(d2) + i15 + s1 + i16 + i17 + i18 + i19 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i20=-2, i21=9, i22=58853, i23=-11, i24=10, i25=-3530, i26=-2, i27=-250, i28=25564;
        short s2=-19293;
        long l1=-7169674955989686834L;
        double d3=-99.48069;

        vMeth(i20);
        switch ((((i20 >>> 1) % 2) * 5) + 11) {
        case 17:
            i21 = 1;
            do {
                i20 += i21;
            } while (++i21 < 170);
            Test.instanceCount -= i21;
            try {
                i20 = i20;
            }
            catch (NegativeArraySizeException exc2) {
            }
            finally {
                for (i22 = 209; i22 > 2; --i22) {
                    s2 += (short)(-4 + (i22 * i22));
                    Test.instanceCount += i20;
                }
            }
            break;
        case 20:
            Test.bFld = Test.bFld;
            Test.byFld += (byte)Test.instanceCount;
            Test.fFld = i22;
        default:
            Test.iArrFld[(i23 >>> 1) % N] *= i22;
            for (i24 = 5; i24 < 346; ++i24) {
                Test.lArrFld[i24 + 1] = 1;
                Test.lArrFld = Test.lArrFld;
                for (l1 = 3; l1 < 74; ++l1) {
                    i20 -= i20;
                    Test.instanceCount = i24;
                    d3 -= i22;
                    switch ((((-5 >>> 1) % 6) * 5) + 76) {
                    case 86:
                        i25 = i20;
                        i26 <<= (int)l1;
                        for (i27 = 2; i27 > 1; i27 -= 3) {
                            i26 += (-10266 + (i27 * i27));
                            i20 = (int)Test.fFld;
                            Test.instanceCount = -64L;
                            Test.instanceCount = i22;
                            i20 = (int)Test.instanceCount;
                        }
                        break;
                    case 96:
                        Test.instanceCount *= Test.instanceCount;
                        break;
                    case 90:
                        i28 = (int)l1;
                        break;
                    case 87:
                        i20 -= (int)d3;
                        break;
                    case 102:
                        if (Test.bFld) break;
                        break;
                    case 103:
                        Test.fFld = i28;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 s2 i24 = " + i23 + "," + s2 + "," + i24);
        FuzzerUtils.out.println("i25 l1 i26 = " + i25 + "," + l1 + "," + i26);
        FuzzerUtils.out.println("d3 i27 i28 = " + Double.doubleToLongBits(d3) + "," + i27 + "," + i28);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.bFld Test.fArrFld Test.lArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

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
