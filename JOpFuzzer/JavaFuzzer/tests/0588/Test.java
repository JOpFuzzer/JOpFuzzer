// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:54 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=30917L;
    public static long lFld=12L;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -54050L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i6, long l, long l1) {

        double d=-91.112166;

        i6 >>= i6;
        i6 /= (int)((long)(d) | 1);
        long meth_res = i6 + l + l1 + Double.doubleToLongBits(d);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i5) {

        int i7=61866, i8=4, i9=-12, i10=57, i11=-11;
        double d1=54.25754;
        float f=-2.806F;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-26970);

        i5 >>>= iMeth1(i5, -117L, Test.instanceCount);
        i7 = 241;
        while ((i7 -= 2) > 0) {
            boolean b=true;
            if (b) {
                for (i8 = i7; i8 < 13; i8++) {
                    Test.instanceCount = i7;
                    d1 += i8;
                    sArr[i7] >>= (short)i8;
                    Test.instanceCount = i9;
                }
            } else {
                f += (i7 * i7);
            }
            i5 &= (int)Test.instanceCount;
            d1 += -7;
            for (i10 = 1; i10 < 13; ++i10) {
                i11 += i10;
                f -= i8;
                i5 = i8;
            }
        }
        long meth_res = i5 + i7 + i8 + i9 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + i10 + i11 +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=-14, i1=-73, i2=13, i3=11024, i4=18548, i12=-40121, i13=-7, i14=-5, iArr[]=new int[N];
        float f1=2.412F, fArr[]=new float[N];
        boolean b1=true;

        FuzzerUtils.init(fArr, 0.1010F);
        FuzzerUtils.init(iArr, -4192);

        for (i = 10; 180 > i; ++i) {
            i2 = 1;
            while ((i2 += 3) < 9) {
                fArr[i2 - 1] = 3861904008L;
                iArr[i] -= (--i1);
            }
            for (i3 = 1; i3 < 9; i3++) {
                i1 += (i3 ^ i);
                if (b1) {
                    try {
                        i1 = (i3 / i4);
                        i4 = (-526688123 / i4);
                        i1 = (i / i2);
                    } catch (ArithmeticException a_e) {}
                    iArr[i3 + 1] -= (i4++);
                    i4 = iMeth(-62);
                    vMeth_check_sum += i + i1 + i2 + i3 + i4 + Float.floatToIntBits(f1) + i12 + i13 + (b1 ? 1 : 0) +
                        i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
                    return;
                } else if (b1) {
                    Test.lArrFld[i + 1] = (long)f1;
                } else if (b1) {
                    for (i12 = 2; i12 > i3; --i12) {
                        f1 -= 66;
                        f1 += i12;
                        iArr[i12] = (int)Test.lFld;
                    }
                } else {
                    i14 += (i3 ^ i2);
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + Float.floatToIntBits(f1) + i12 + i13 + (b1 ? 1 : 0) + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i15=0, i16=11, i17=116, i18=-60827, i19=9, i20=14, i21=-14633, i22=43288, i23=-45434, i24=55764, i25=-4,
            iArr1[]=new int[N];
        float f2=6.761F, f3=0.955F;
        short s=-30906;
        byte by=-100;
        double d2=-92.66667;
        boolean b2=true;

        FuzzerUtils.init(iArr1, 133);

        vMeth();
        for (i15 = 24; i15 < 396; i15++) {
            for (i17 = 1; i17 < 68; i17 += 2) {
                f2 += i15;
                s += (short)(((i17 * i16) + Test.lFld) - i18);
            }
            switch ((((i17 >>> 1) % 8) * 5) + 45) {
            case 77:
                by += (byte)(((i15 * Test.instanceCount) + i16) - Test.lFld);
                break;
            case 62:
                Test.lFld >>= i18;
                for (i19 = 3; i19 < 68; ++i19) {
                    for (d2 = 1; d2 < 2; ++d2) {
                        i18 <<= 2;
                    }
                }
                for (i22 = 1; i22 < 68; i22++) {
                    if (b2) break;
                    i23 = i19;
                    for (i24 = 1; i24 < 2; ++i24) {
                        if (b2) continue;
                        i18 = 10;
                        if (b2) {
                            if (b2) break;
                            Test.instanceCount += (((i24 * i24) + i24) - i25);
                            Test.instanceCount += -123;
                        }
                    }
                    f2 -= i22;
                }
                i25 += (-9 + (i15 * i15));
                break;
            case 64:
                i16 *= i18;
                i23 -= 14;
                break;
            case 83:
                by += (byte)(i15 ^ Test.instanceCount);
            case 67:
                f3 = 1;
                do {
                    i18 += (int)((long)f3 | (long)f2);
                    try {
                        iArr1[(int)(f3 - 1)] = (i17 / i23);
                        i21 = (iArr1[(int)(f3 + 1)] % -239);
                        i16 = (i22 % 61194);
                    } catch (ArithmeticException a_e) {}
                    f2 = i24;
                } while (++f3 < 68);
                break;
            case 75:
                i23 = (int)3277L;
                break;
            case 73:
                i25 -= i22;
            case 63:
                Test.instanceCount -= i19;
                break;
            }
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 f2 s = " + i18 + "," + Float.floatToIntBits(f2) + "," + s);
        FuzzerUtils.out.println("by i19 i20 = " + by + "," + i19 + "," + i20);
        FuzzerUtils.out.println("d2 i21 i22 = " + Double.doubleToLongBits(d2) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 b2 i24 = " + i23 + "," + (b2 ? 1 : 0) + "," + i24);
        FuzzerUtils.out.println("i25 f3 iArr1 = " + i25 + "," + Float.floatToIntBits(f3) + "," +
            FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.lFld Test.lArrFld = " + Test.instanceCount + "," + Test.lFld +
            "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}