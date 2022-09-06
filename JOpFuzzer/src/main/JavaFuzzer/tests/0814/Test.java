// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:59 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static long lFld=179L;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -30027);
        FuzzerUtils.init(Test.dArrFld, 0.33082);
        FuzzerUtils.init(Test.fArrFld, -1.760F);
        FuzzerUtils.init(Test.lArrFld, 175L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, int i4) {

        int i5=-18, i6=43387, i7=5568, i8=24639;
        boolean b=true, bArr[]=new boolean[N];
        short s=-10611;
        double d1=1.105347;

        FuzzerUtils.init(bArr, false);

        for (i5 = 14; i5 < 253; i5++) {
            i7 = 7;
            while ((i7 -= 2) > 0) {
                i3 >>= i7;
                switch ((i7 % 1) + 50) {
                case 50:
                    i8 = 1;
                    while (++i8 < 2) {
                        if (b) continue;
                        i3 += (i8 + i7);
                        if (b) {
                            Test.iArrFld[i5] -= 24789;
                            bArr[i5 - 1] = b;
                            i4 += (((i8 * i4) + i8) - s);
                        } else if (b) {
                            i4 += (int)(48905L + (i8 * i8));
                        }
                        Test.instanceCount += 165;
                        d1 -= i8;
                        i3 = -90;
                    }
                    break;
                default:
                    Test.dArrFld = Test.dArrFld;
                }
            }
        }
        vMeth2_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + (b ? 1 : 0) + s + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1(int i2) {

        int i9=52162, i10=-195, i11=4, i12=-22648, i13=33544, i14=-137;
        short s1=26436, sArr[]=new short[N];
        byte by=19;

        FuzzerUtils.init(sArr, (short)22238);

        switch ((((i2 + i2) >>> 1) % 8) + 50) {
        case 50:
            vMeth2(i2, i2);
            break;
        case 51:
            i9 = 1;
            while ((i9 += 3) < 151) {
                if (true) {
                    i2 += (i9 * i9);
                    for (i10 = 1; 31 > i10; ++i10) {
                        s1 = (short)i9;
                        switch ((i10 % 6) + 110) {
                        case 110:
                            sArr[i10 - 1] = (short)-50071;
                            i2 = (int)Test.lFld;
                            Test.iArrFld[i9 + 1] = i9;
                            Test.bFld = Test.bFld;
                        case 111:
                            for (i12 = i9; i12 < 2; ++i12) {
                                if (i13 != 0) {
                                    vMeth1_check_sum += i2 + i9 + i10 + i11 + s1 + i12 + i13 + by + i14 +
                                        FuzzerUtils.checkSum(sArr);
                                    return;
                                }
                                s1 = by;
                            }
                            break;
                        case 112:
                            i2 = 99;
                        case 113:
                            i13 += i11;
                            break;
                        case 114:
                            by += (byte)(i10 * i11);
                        case 115:
                            if (false) continue;
                            break;
                        default:
                            i13 >>= (int)Test.instanceCount;
                        }
                    }
                } else if (Test.bFld) {
                    if (i11 != 0) {
                        vMeth1_check_sum += i2 + i9 + i10 + i11 + s1 + i12 + i13 + by + i14 +
                            FuzzerUtils.checkSum(sArr);
                        return;
                    }
                } else if (true) {
                    i13 += (i9 ^ i12);
                } else {
                    i2 = i2;
                }
            }
            break;
        case 52:
            Test.iArrFld[(i14 >>> 1) % N] *= (int)Test.instanceCount;
            break;
        case 53:
            Test.bFld = Test.bFld;
            break;
        case 54:
            Test.iArrFld = FuzzerUtils.int1array(N, (int)-173);
        case 55:
            by |= (byte)-43921;
        case 56:
            i14 -= by;
            break;
        case 57:
            i2 &= -8;
            break;
        }
        vMeth1_check_sum += i2 + i9 + i10 + i11 + s1 + i12 + i13 + by + i14 + FuzzerUtils.checkSum(sArr);
    }

    public void vMeth(int i1, long l) {

        double d2=2.117727, d3=0.98096, d4=80.88315;
        long l1=4126478151L;
        int i15=-64271, iArr[]=new int[N];
        boolean bArr1[]=new boolean[N];

        FuzzerUtils.init(bArr1, true);
        FuzzerUtils.init(iArr, -16922);

        vMeth1(-61);
        i1 -= 5;
        d2 = 326;
        while (--d2 > 0) {
            d3 += i1;
            Test.iArrFld[(int)(d2 + 1)] <<= i1;
            bArr1[(int)(d2 - 1)] = Test.bFld;
            l1 = 5;
            while ((l1 -= 3) > 0) {
                for (d4 = 1; d4 < 3; d4 += 2) {
                    iArr[(int)(d4 + 1)] *= (int)Test.lFld;
                    i1 *= i1;
                    i15 = i15;
                    if (Test.bFld) break;
                    i15 &= (int)l1;
                    i15 |= (int)-60993L;
                    i1 = i1;
                }
            }
        }
        vMeth_check_sum += i1 + l + Double.doubleToLongBits(d2) + Double.doubleToLongBits(d3) + l1 +
            Double.doubleToLongBits(d4) + i15 + FuzzerUtils.checkSum(bArr1) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i16=26213, i17=1, i18=-9, i19=-9, i20=-133, i21=-156;
        double d=-2.35768;
        byte by1=-86;
        float f=127.162F;

        i -= (int)((++Test.instanceCount) + ((i - i) + i));
        d /= 87;
        vMeth(i16, Test.lFld);
        i17 = 1;
        do {
            i >>= -27741;
            i16 += (((i17 * Test.instanceCount) + i) - i);
            Test.fArrFld[i17] *= i16;
            Test.iArrFld[i17 + 1] += by1;
            i18 = 1;
            do {
                i19 = 1;
                do {
                    i &= i17;
                    i += (int)-96L;
                    i -= i19;
                    Test.instanceCount += 21;
                    Test.iArrFld[i18] *= i19;
                } while (++i19 < 1);
                if (Test.bFld) {
                    for (i20 = 1; 1 < i20; --i20) {
                        switch (((i16 >>> 1) % 4) + 53) {
                        case 53:
                            i16 += i20;
                            i21 += (int)(6734727518518772145L + (i20 * i20));
                            i16 = (int)Test.lFld;
                            break;
                        case 54:
                            by1 = (byte)Test.lFld;
                            i21 += (int)f;
                            break;
                        case 55:
                            Test.iArrFld[i17 - 1] += (int)Test.instanceCount;
                            i16 += i21;
                            Test.lFld += (i20 * by1);
                            i += (i20 * i20);
                        case 56:
                            by1 <<= (byte)-94;
                            i >>= i16;
                            break;
                        }
                        i21 += i20;
                    }
                } else if (Test.bFld) {
                    Test.lArrFld[i18 + 1] = Test.lFld;
                } else if (false) {
                    try {
                        Test.iArrFld[i18] = (i18 / 1415737815);
                        i = (i / i18);
                        i21 = (19941 % i21);
                    } catch (ArithmeticException a_e) {}
                }
            } while (++i18 < 122);
        } while (++i17 < 205);

        FuzzerUtils.out.println("i d i16 = " + i + "," + Double.doubleToLongBits(d) + "," + i16);
        FuzzerUtils.out.println("i17 by1 i18 = " + i17 + "," + by1 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("f = " + Float.floatToIntBits(f));

        FuzzerUtils.out.println("Test.instanceCount Test.lFld Test.bFld = " + Test.instanceCount + "," + Test.lFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld Test.dArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + ","
            + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

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
