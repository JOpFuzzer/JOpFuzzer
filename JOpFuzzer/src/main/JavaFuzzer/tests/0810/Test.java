// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:59 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6455558458355428701L;
    public float fFld=-52.608F;
    public static long lFld=-214L;
    public static boolean bFld=false;
    public static float fFld1=-1.500F;
    public static short sFld=-4223;
    public static short sArrFld[]=new short[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-32377);
        FuzzerUtils.init(Test.lArrFld, -3493813880L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i7, int i8) {

        int i9=4, i10=-37044, i11=-34693, i12=95, i13=1, i14=-53, iArr1[]=new int[N];
        double d2=22.20317;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr1, 141);
        FuzzerUtils.init(bArr, true);

        for (i9 = 4; i9 < 374; i9++) {
            if (i8 != 0) {
                vMeth2_check_sum += l + i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d2) + i13 + i14 +
                    FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
                return;
            }
        }
        for (i11 = 2; i11 < 227; ++i11) {
            Test.lFld -= (long)d2;
            Test.lFld += (((i11 * i7) + i11) - i8);
            try {
                i12 = (32936 % i10);
                iArr1[i11 + 1] = (39311294 % iArr1[i11 + 1]);
                iArr1[i11] = (1222997090 % i12);
            } catch (ArithmeticException a_e) {}
            for (i13 = 1; i13 < 7; i13++) {
                bArr[i13 + 1] = Test.bFld;
                i8 += (i13 - i11);
                if (Test.bFld) continue;
                switch (((i11 % 7) * 5) + 8) {
                case 43:
                    Test.fFld1 = (float)d2;
                    Test.sFld |= (short)i14;
                    Test.fFld1 += i13;
                    break;
                case 32:
                    Test.fFld1 *= i14;
                case 41:
                    i8 = (int)Test.fFld1;
                    break;
                case 33:
                    i12 += 224;
                case 23:
                    i10 = (int)Test.fFld1;
                    break;
                case 14:
                case 11:
                    i8 = (int)l;
                    break;
                }
            }
        }
        vMeth2_check_sum += l + i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d2) + i13 + i14 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1(int i4) {

        int i5=-45872, i6=-23213, i15=-205, i16=217, i17=30, iArr2[][]=new int[N][N];
        byte by=98;
        double d3=1.90071;

        FuzzerUtils.init(iArr2, -153);

        for (i5 = 6; i5 < 192; ++i5) {
            vMeth2(Test.lFld, i5, i15);
            Test.sArrFld[i5 + 1] = (short)i6;
            Test.lFld += (i5 + i15);
            for (i16 = 1; i16 < 9; ++i16) {
                i6 -= 79;
                if (i16 != 0) {
                    vMeth1_check_sum += i4 + i5 + i6 + i15 + i16 + i17 + by + Double.doubleToLongBits(d3) +
                        FuzzerUtils.checkSum(iArr2);
                    return;
                }
                i4 >>= (int)Test.lFld;
                i15 = i16;
                iArr2[i5] = iArr2[i5 - 1];
            }
            i15 += i4;
            i17 = i16;
            by = (byte)i17;
        }
        d3 *= i15;
        i15 = -13;
        vMeth1_check_sum += i4 + i5 + i6 + i15 + i16 + i17 + by + Double.doubleToLongBits(d3) +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(int i3, double d1, short s) {

        int i18=125, i19=99, i21=9, i22=48053, i23=1, i24=-61739;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 41.406F);

        vMeth1(i3);
        for (i18 = 7; i18 < 189; ++i18) {
            int i20=9037;
            i20 += (int)(8403670664129789654L + (i18 * i18));
            for (i21 = 1; i21 < 9; i21++) {
                for (i23 = 2; i23 > 1; i23--) {
                    Test.fFld1 = i24;
                    i19 = (int)Test.lFld;
                    fArr[i18 + 1] += -169;
                    i3 = i24;
                    Test.lFld = i21;
                    Test.lFld += i23;
                    i22 += i23;
                    Test.lFld += i19;
                    Test.bFld = Test.bFld;
                    i3 |= s;
                }
            }
        }
        vMeth_check_sum += i3 + Double.doubleToLongBits(d1) + s + i18 + i19 + i21 + i22 + i23 + i24 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-51392, i1=-2, i2=90, i25=-13727, i26=-19, i27=11, i28=-14, i29=-10, i30=-3, i31=-26, i32=9, i33=-11,
            i34=5, iArr[]=new int[N];
        double d=-69.45588;
        long l1=49864L;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-35);
        FuzzerUtils.init(iArr, -45221);

        for (i = 292; i > 1; i -= 3) {
            byArr[i + 1] = (byte)i;
            i1 += (i + fFld);
            iArr[i - 1] <<= (int)((-(i1 = (int)d)) - (d++));
            i2 = 1;
            do {
                vMeth(i2, 0.41708, Test.sFld);
                iArr[i + 1] += -12;
                for (i25 = 1; i25 > 1; --i25) {
                    fFld -= Test.fFld1;
                    Test.instanceCount *= Test.sFld;
                    i1 -= (int)Test.instanceCount;
                    i26 += (int)Test.instanceCount;
                }
            } while (++i2 < 258);
            iArr[i - 1] *= -163;
            i1 >>= i25;
            i27 *= (int)Test.instanceCount;
        }
        i1 = i26;
        Test.lArrFld[(i26 >>> 1) % N] = i26;
        for (i28 = 11; i28 < 376; ++i28) {
            i29 <<= i26;
            for (i30 = 2; 69 > i30; i30++) {
                Test.instanceCount *= (long)d;
            }
            i31 += i28;
            Test.lFld = 46046;
            i1 = (int)Test.lFld;
            i26 = (int)Test.instanceCount;
            Test.lFld |= -140L;
        }
        for (l1 = 5; l1 < 248; l1++) {
            for (i33 = 4; i33 < 103; ++i33) {
                i26 -= i27;
                iArr[(int)(l1 + 1)] += i26;
            }
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i2 i25 i26 = " + i2 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 l1 = " + i30 + "," + i31 + "," + l1);
        FuzzerUtils.out.println("i32 i33 i34 = " + i32 + "," + i33 + "," + i34);
        FuzzerUtils.out.println("byArr iArr = " + FuzzerUtils.checkSum(byArr) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.lFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Test.lFld);
        FuzzerUtils.out.println("Test.bFld Test.fFld1 Test.sFld = " + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(Test.fFld1) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.sArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.sArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

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
