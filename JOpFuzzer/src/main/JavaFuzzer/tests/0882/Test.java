// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:01 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=8L;
    public static float fFld=-2.133F;
    public static boolean bFld=false;
    public static double dArrFld[]=new double[N];
    public static volatile int iArrFld[]=new int[N];
    public short sArrFld[]=new short[N];
    public static boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, 120.51886);
        FuzzerUtils.init(Test.iArrFld, -16014);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i8) {

        int i9=-49, i10=-29645, i11=-11280, i12=-28, i13=34131, i14=-12, i15=-8, i16=-34;
        boolean b=true;
        double d2=18.12252, d3=-1.112398;

        for (i9 = 17; i9 < 287; i9++) {
            if (b) continue;
            for (i11 = 1; i11 < 6; ++i11) {
                d2 = -7938;
                Test.iArrFld = Test.iArrFld;
            }
            if (b) break;
        }
        for (i13 = 2; 155 > i13; i13++) {
            try {
                i14 = (i8 % i14);
                i14 = (-1819413742 / i14);
                i12 = (401222598 % i11);
            } catch (ArithmeticException a_e) {}
            i12 += (i13 * i13);
        }
        for (d3 = 10; d3 < 287; ++d3) {
            i16 = 1;
            do {
                Test.iArrFld[i16 - 1] = (int)Test.fFld;
            } while (++i16 < 6);
            if (i8 != 0) {
            }
            i12 *= (int)d3;
            i14 >>= i13;
        }
        long meth_res = i8 + i9 + i10 + (b ? 1 : 0) + i11 + i12 + Double.doubleToLongBits(d2) + i13 + i14 +
            Double.doubleToLongBits(d3) + i15 + i16;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i7) {

        float f=-70.697F, f1=-103.139F;
        int i17=232, i18=-189, i19=0, i20=27589;
        byte by=29;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2031642301L);

        lArr[(i7 >>> 1) % N] >>= iMeth1(i7);
        i7 = i7;
        for (f = 16; f < 309; ++f) {
            for (f1 = 1; f1 < 6; ++f1) {
                for (i19 = 1; 2 > i19; ++i19) {
                    double d4=-1.82002;
                    Test.instanceCount *= i19;
                    i7 >>= by;
                    switch ((i19 % 1) + 98) {
                    case 98:
                        d4 *= f1;
                        Test.instanceCount = i19;
                        lArr[(int)(f - 1)] -= i18;
                        i7 = (int)Test.instanceCount;
                    default:
                        lArr[i19 + 1] -= i18;
                        i20 = i20;
                        Test.instanceCount += (((i19 * i7) + Test.instanceCount) - i20);
                    }
                }
            }
        }
        vMeth_check_sum += i7 + Float.floatToIntBits(f) + i17 + Float.floatToIntBits(f1) + i18 + i19 + i20 + by +
            FuzzerUtils.checkSum(lArr);
    }

    public int iMeth(double d, int i, int i1) {

        int i2=-232, i3=3741, i4=122, i5=31789, i6=33444;
        boolean b1=false;

        i2 = 1;
        do {
            Test.instanceCount += i2;
            for (i3 = 6; 1 < i3; i3 -= 3) {
                for (i5 = i3; i5 < 6; i5++) {
                    vMeth(25887);
                    i6 = (int)Test.instanceCount;
                    switch (((i2 % 2) * 5) + 40) {
                    case 49:
                        Test.instanceCount -= i4;
                        if (b1) continue;
                        break;
                    case 45:
                        i -= i5;
                    }
                    i6 += (i5 | Test.instanceCount);
                    i6 = i3;
                }
                Test.instanceCount &= Test.instanceCount;
            }
            i1 -= (int)Test.instanceCount;
            Test.instanceCount += (i2 * Test.fFld);
        } while (++i2 < 293);
        long meth_res = Double.doubleToLongBits(d) + i + i1 + i2 + i3 + i4 + i5 + i6 + (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d5=2.71110;
        int i21=-48003, i22=-98, i23=14, i24=-2, i25=153;
        short s=8827;
        float f2=1.928F, fArr[]=new float[N];
        byte by1=53;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 46L);
        FuzzerUtils.init(fArr, 74.58F);

        iMeth(d5, i21, i21);
        i21 *= (int)-11L;
        d5 *= d5;
        i22 = 1;
        while (++i22 < 174) {
            Test.instanceCount = i21;
            s += (short)i22;
            if (false) {
                i23 = 1;
                while (++i23 < 144) {
                    i21 /= (int)(i21 | 1);
                    i24 = 1;
                    while (++i24 < 1) {
                        Test.instanceCount += (((i24 * i21) + i22) - i24);
                        Test.dArrFld[i22 - 1] /= (i21 | 1);
                        i21 -= i23;
                        s >>>= (short)125;
                        try {
                            i21 = (165 % i23);
                            i21 = (i23 / 1588585076);
                            Test.iArrFld[i24 - 1] = (i24 % i22);
                        } catch (ArithmeticException a_e) {}
                    }
                    switch ((i22 % 3) + 69) {
                    case 69:
                        try {
                            i21 = (i23 % i22);
                            i21 = (i21 / i22);
                            i21 = (i22 / i23);
                        } catch (ArithmeticException a_e) {}
                        if (Test.bFld) {
                            i21 = (int)Test.instanceCount;
                            i21 = s;
                            sArrFld[i23 - 1] *= (short)i22;
                            for (f2 = 1; f2 < 1; f2++) {
                                i21 = i22;
                                Test.instanceCount += (long)f2;
                                Test.bArrFld[i22 + 1][i22] = Test.bFld;
                                if (Test.bFld) {
                                    lArr1[i22 + 1] = 49386L;
                                    i21 += (int)(f2 - i24);
                                    Test.iArrFld[i22 + 1] <<= 34550;
                                }
                                i25 >>= i25;
                            }
                        } else if (Test.bFld) {
                            by1 = (byte)Test.fFld;
                        } else if (Test.bFld) {
                            fArr[i22] += i22;
                        } else {
                            i21 -= (int)f2;
                        }
                        break;
                    case 70:
                        by1 *= (byte)-65150;
                        break;
                    case 71:
                        Test.instanceCount = i22;
                    default:
                        i25 = (int)Test.fFld;
                    }
                }
            } else if (Test.bFld) {
                lArr1[i22] |= i21;
            } else if (Test.bFld) {
                i21 += (int)Test.instanceCount;
            }
        }

        FuzzerUtils.out.println("d5 i21 i22 = " + Double.doubleToLongBits(d5) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("s i23 i24 = " + s + "," + i23 + "," + i24);
        FuzzerUtils.out.println("f2 i25 by1 = " + Float.floatToIntBits(f2) + "," + i25 + "," + by1);
        FuzzerUtils.out.println("lArr1 fArr = " + FuzzerUtils.checkSum(lArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.dArrFld Test.iArrFld sArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld) +
            "," + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
