// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:01 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8L;
    public boolean bFld=true;
    public static int iFld=-22;
    public static double dFld=0.55421;
    public volatile float fFld=79.559F;
    public static byte byFld=-39;
    public long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];
    public static int iArrFld1[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -8);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i2, int i3) {


        l -= Test.instanceCount;
        vMeth2_check_sum += l + i2 + i3;
    }

    public void vMeth1() {

        byte by=-14;
        int i4=13, i5=7, i6=-2, i7=237, iArr1[]=new int[N];
        short s1=30314;

        FuzzerUtils.init(iArr1, -43015);

        Test.iFld -= ((Test.iFld++) - Test.iFld);
        lArrFld[(Test.iFld >>> 1) % N] *= by;
        vMeth2(Test.instanceCount, Test.iFld, -17);
        iArr1[(184 >>> 1) % N] *= (int)Test.instanceCount;
        for (i4 = 4; i4 < 296; ++i4) {
            for (i6 = 1; 6 > i6; ++i6) {
                if (true) {
                    Test.instanceCount -= Test.instanceCount;
                    vMeth1_check_sum += by + i4 + i5 + i6 + i7 + s1 + FuzzerUtils.checkSum(iArr1);
                    return;
                }
                i5 = (int)Test.instanceCount;
                i5 = i6;
                s1 >>= (short)Test.instanceCount;
                if (i6 != 0) {
                    vMeth1_check_sum += by + i4 + i5 + i6 + i7 + s1 + FuzzerUtils.checkSum(iArr1);
                    return;
                }
                Test.instanceCount >>= Test.instanceCount;
                bFld = bFld;
                Test.dFld = i7;
            }
        }
        vMeth1_check_sum += by + i4 + i5 + i6 + i7 + s1 + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(int i) {

        short s=-4092;
        int i8=0, i9=-53032, i10=-6, i11=-14, iArr[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, 248);
        FuzzerUtils.init(fArr, -49.888F);

        switch ((((-80 - (i--)) >>> 1) % 6) + 25) {
        case 25:
            for (int i1 : iArr) {
                float f=-78.684F;
                Test.instanceCount = (i1 - (i1++));
                bFld = (((++i1) + (i + f)) > Short.reverseBytes((short)(s++)));
                vMeth1();
                for (i8 = 1; i8 < 4; ++i8) {
                    for (i10 = 2; i10 > 1; i10 -= 3) {
                        i11 += (i10 ^ i9);
                        try {
                            iArr[i8 + 1] = (179 % i9);
                            i11 = (i11 % -61698);
                            i1 = (iArr[i10 - 1] % -133);
                        } catch (ArithmeticException a_e) {}
                        bFld = bFld;
                        switch (((i10 >>> 1) % 4) + 29) {
                        case 29:
                            Test.iFld *= (int)Test.instanceCount;
                            bFld = bFld;
                            Test.iFld = i1;
                            i11 += i;
                            break;
                        case 30:
                            if (i1 != 0) {
                                vMeth_check_sum += i + s + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr) +
                                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                                return;
                            }
                            break;
                        case 31:
                        case 32:
                            fArr[i8 - 1] -= (float)Test.dFld;
                        }
                    }
                }
            }
            break;
        case 26:
            i >>= (int)Test.instanceCount;
        case 27:
            i9 -= (int)Test.instanceCount;
            break;
        case 28:
            fFld -= 31;
            break;
        case 29:
            i9 = Test.iFld;
            break;
        case 30:
            iArr[(i9 >>> 1) % N] -= -15115;
        }
        vMeth_check_sum += i + s + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        double d=1.127268;
        int i14=-6, i16=-48, i17=-239, i18=14, i19=46895;
        byte byArr[][]=new byte[N][N];
        short sArr[]=new short[N];

        FuzzerUtils.init(byArr, (byte)-45);
        FuzzerUtils.init(sArr, (short)-29420);

        vMeth(-35);
        Test.iFld = Test.iFld;
        Test.iFld *= (int)fFld;
        for (int i13 : iArrFld) {
            lArrFld[(Test.iFld >>> 1) % N] -= i13;
        }
        iArrFld[(Test.iFld >>> 1) % N] <<= Test.iFld;
        Test.instanceCount -= (long)1.109288;
        Test.iFld = (int)Test.instanceCount;
        Test.iArrFld1 = Test.iArrFld1;
        for (d = 11; d < 366; ++d) {
            int i15=-21439;
            if (bFld) {
                i15 = i15;
            } else if (bFld) {
                Test.instanceCount -= 78;
                for (i16 = 2; 71 > i16; i16++) {
                    for (i18 = (int)(d); i18 < 2; ++i18) {
                        i14 <<= Test.byFld;
                        try {
                            i15 = (i19 % i14);
                            i17 = (2009396922 % i19);
                            Test.iArrFld1[i18 - 1][i18] = (i17 / i16);
                        } catch (ArithmeticException a_e) {}
                        i19 >>= (int)Test.instanceCount;
                        i19 -= i14;
                        i19 = i18;
                        i19 = (int)Test.instanceCount;
                        Test.iArrFld1[i16][i16] = (int)1.974F;
                        i19 = i19;
                        switch (((Test.iFld >>> 1) % 6) + 19) {
                        case 19:
                            Test.iArrFld1[i18 + 1][i18] = (int)Test.instanceCount;
                            byArr[i18][i16] = (byte)i18;
                            break;
                        case 20:
                            i15 *= (int)Test.instanceCount;
                            lArrFld[(int)(d + 1)] += -5;
                            if (bFld) break;
                            i15 += (-120 + (i18 * i18));
                            break;
                        case 21:
                            Test.iFld = i19;
                            break;
                        case 22:
                            i19 = (int)Test.instanceCount;
                        case 23:
                            Test.iFld += i18;
                            break;
                        case 24:
                            sArr[i16 - 1] += (short)7148L;
                            break;
                        default:
                            i14 = i14;
                        }
                    }
                }
            } else {
                i19 -= -57;
            }
        }

        FuzzerUtils.out.println("d i14 i16 = " + Double.doubleToLongBits(d) + "," + i14 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("byArr sArr = " + FuzzerUtils.checkSum(byArr) + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount bFld Test.iFld = " + Test.instanceCount + "," + (bFld ? 1 : 0) +
            "," + Test.iFld);
        FuzzerUtils.out.println("Test.dFld fFld Test.byFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Float.floatToIntBits(fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("lArrFld iArrFld Test.iArrFld1 = " + FuzzerUtils.checkSum(lArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld1));

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