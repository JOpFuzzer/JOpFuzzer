// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:00 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-126L;
    public static byte byFld=122;
    public static float fFld=-2.380F;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -7471677266890930139L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d2, int i9) {

        int i10=0, i11=-30293, i12=43523, i13=8146, i14=-150, i15=-56385, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -52238);

        for (i10 = 2; i10 < 369; i10++) {
            i9 = i10;
            for (i12 = 1; i12 < 5; i12++) {
                Test.fFld += i12;
                d2 += i10;
                i11 += (i12 * i12);
                i9 *= i9;
                for (i14 = 1; i14 < 2; i14++) {
                    Test.instanceCount += (((i14 * i13) + i15) - i14);
                    iArr1[(i12 >>> 1) % N] >>>= i9;
                    i9 += (i14 * i14);
                    Test.fFld -= i12;
                    i9 = (int)Test.fFld;
                    Test.byFld += (byte)(i14 * i15);
                    i13 -= (int)d2;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d2) + i9 + i10 + i11 + i12 + i13 + i14 + i15 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i6) {

        int i7=-47182, i8=-176, i16=14, i17=2, i18=-1, iArr2[]=new int[N];
        double d1=68.1854;
        boolean b1=false;
        short s=-2323;

        FuzzerUtils.init(iArr2, -36);

        Test.instanceCount = i6;
        for (i7 = 19; i7 < 362; ++i7) {
            i8 = (int)(i6 * ((i8 - 195L) - (-14 * (d1--))));
            i8 >>= (int)(Test.fFld / (((long)((i8--) + (-(i8 + Test.fFld)))) | 1));
            vMeth1(d1, i6);
            if (b1) {
                if (b1) {
                    for (i16 = 1; i16 < 5; i16++) {
                        i6 *= (int)-41998L;
                    }
                    switch (((i7 % 5) * 5) + 100) {
                    case 114:
                        Test.lArrFld[i7] = i16;
                        iArr2[i7] = -56201;
                        if (b1) break;
                        break;
                    case 116:
                        i17 = i6;
                        i8 *= i17;
                        break;
                    case 109:
                        s += (short)(((i7 * i17) + Test.byFld) - i7);
                    case 120:
                        i18 = (int)Test.instanceCount;
                        break;
                    case 105:
                    }
                } else {
                    d1 = i18;
                    vMeth_check_sum += i6 + i7 + i8 + Double.doubleToLongBits(d1) + i16 + i17 + (b1 ? 1 : 0) + s + i18
                        + FuzzerUtils.checkSum(iArr2);
                    return;
                }
            } else if (b1) {
                Test.instanceCount = Test.byFld;
            } else if (b1) {
                iArr2[i7 + 1] = i6;
            } else {
                i17 += (((i7 * s) + i6) - Test.instanceCount);
            }
        }
        vMeth_check_sum += i6 + i7 + i8 + Double.doubleToLongBits(d1) + i16 + i17 + (b1 ? 1 : 0) + s + i18 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static long lMeth(boolean b, double d) {

        int i2=-35026, i3=44378, i4=-6, i5=50343, i19=55019, i20=9, i21=54818, iArr[][]=new int[N][N];
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, -12L);
        FuzzerUtils.init(iArr, 9);
        FuzzerUtils.init(fArr, 82.790F);

        for (i2 = 14; i2 < 277; i2++) {
            lArr[i2 + 1] = i3;
            iArr[i2 + 1] = (iArr[i2 + 1] = (iArr[i2 - 1] = (iArr[i2 + 1] = iArr[i2 + 1])));
            fArr[i2] = (float)(((Test.instanceCount - 0.21929) / ((--i3) | 1)) * i3);
            for (i4 = 1; 6 > i4; ++i4) {
                if (i2 != 0) {
                }
                fArr[i4] += (-25602 + Test.byFld);
            }
            vMeth(i2);
            i19 = 1;
            do {
                try {
                    i3 = (iArr[i2 + 1][i19] / iArr[i19][i2]);
                    i5 = (-22215 % i3);
                    i5 = (53840 % i19);
                } catch (ArithmeticException a_e) {}
                i5 = i2;
                i3 += (((i19 * i3) + i2) - Test.instanceCount);
                for (i20 = 1; 1 > i20; ++i20) {
                    Test.instanceCount += (long)d;
                    i3 >>= (int)2274763347195303404L;
                }
            } while (++i19 < 6);
        }
        long meth_res = (b ? 1 : 0) + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i19 + i20 + i21 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=182, i1=216, i22=-32951, i23=253, i24=1215, i25=-87, i26=-12, i27=-29193, i28=7526, iArr3[]=new int[N],
            iArr4[][]=new int[N][N];
        boolean b2=false;
        double d3=32.60861;
        short s1=21449;

        FuzzerUtils.init(iArr3, -21885);
        FuzzerUtils.init(iArr4, -2);

        for (i = 5; 152 > i; ++i) {
            i1 += (int)((--i1) * ((i - -65066) - lMeth(b2, d3)));
            i1 = (int)Test.instanceCount;
            iArr3[i - 1] &= i;
            d3 = i1;
            b2 = b2;
        }
        d3 *= i1;
        for (i22 = 11; i22 < 382; ++i22) {
            i23 += (i22 | i23);
            i23 -= s1;
            i24 = 1;
            while (++i24 < 68) {
                Test.lArrFld[i22] += 32;
                i23 = i24;
                if (true) {
                    iArr3[i22 - 1] <<= i1;
                    iArr4 = iArr4;
                } else if (false) {
                    Test.instanceCount = 3434;
                    try {
                        i23 = (i24 % 235);
                        iArr3[i24 + 1] = (i1 % i24);
                        i1 = (-238 / i1);
                    } catch (ArithmeticException a_e) {}
                } else {
                    for (i25 = 1; 1 > i25; ++i25) {
                        iArr3[i22 - 1] += i;
                    }
                    b2 = b2;
                    Test.instanceCount += (((i24 * i23) + i25) - i24);
                    iArr4[i24 - 1] = iArr3;
                }
                i26 = (int)Test.fFld;
                for (i27 = 1; i27 < 1; ++i27) {
                    Test.lArrFld = Test.lArrFld;
                    Test.instanceCount += i27;
                    Test.instanceCount = i;
                    Test.instanceCount = i;
                    Test.instanceCount *= (long)Test.fFld;
                }
            }
        }

        FuzzerUtils.out.println("i i1 b2 = " + i + "," + i1 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("d3 i22 i23 = " + Double.doubleToLongBits(d3) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("s1 i24 i25 = " + s1 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("iArr3 iArr4 = " + FuzzerUtils.checkSum(iArr3) + "," + FuzzerUtils.checkSum(iArr4));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}