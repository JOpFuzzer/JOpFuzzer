// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:49 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-112L;
    public float fFld=123.729F;
    public static short sFld=-2750;
    public static volatile double dFld=-98.81670;
    public static byte byFld=102;
    public static volatile boolean bFld=false;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -8L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l, float f2, byte by) {

        boolean b=true;
        int i4=6, i5=217, i6=-133, i7=53152, i8=14;
        short s=1114;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -2.896F);

        b = b;
        Test.instanceCount -= -37069L;
        for (i4 = 9; i4 < 164; i4++) {
            i5 = i4;
            i6 = 1;
            while (++i6 < 10) {
                i5 = i5;
                i5 += 3;
                Test.instanceCount *= 4043346943439784362L;
                i5 -= i6;
                for (i7 = 1; i7 < 1; i7++) {
                    i8 += -181;
                    if (b) continue;
                    i8 += s;
                    if (b) continue;
                    fArr[i4 - 1] -= i4;
                }
            }
        }
        long meth_res = l + Float.floatToIntBits(f2) + by + (b ? 1 : 0) + i4 + i5 + i6 + i7 + i8 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i2) {

        float f=-2.586F, f1=29.254F, f3=-26.492F;
        int i3=129, i9=-92, i10=-9;
        byte by1=9;
        long l1=42429L, lArr[][]=new long[N][N];
        short s1=10918;

        FuzzerUtils.init(lArr, -224L);

        for (f = 3; f < 229; ++f) {
            f1 = 7;
            while ((f1 -= 3) > 0) {
                i3 += (int)((41L - (-2985100718L << lArr[(int)(f + 1)][(int)(f1)])) * iMeth(Test.instanceCount,
                    -66.369F, by1));
                for (i9 = 1; i9 < 3; ++i9) {
                    double d=0.5691;
                    i10 -= (int)Test.instanceCount;
                    i2 += (i9 * i9);
                    if (i10 != 0) {
                        vMeth1_check_sum += i2 + Float.floatToIntBits(f) + i3 + Float.floatToIntBits(f1) + by1 + i9 +
                            i10 + l1 + s1 + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    i2 -= (int)l1;
                    d = l1;
                    i10 = s1;
                    f3 = Test.instanceCount;
                    l1 >>= Test.instanceCount;
                    s1 *= (short)-85;
                }
                i2 += (int)(((f1 * i10) + l1) - i3);
                Test.instanceCount = i2;
            }
        }
        vMeth1_check_sum += i2 + Float.floatToIntBits(f) + i3 + Float.floatToIntBits(f1) + by1 + i9 + i10 + l1 + s1 +
            Float.floatToIntBits(f3) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i) {

        int i1=3403, i11=-103, i12=-11, i13=-95, i14=13;
        byte by2=-1;

        i <<= i;
        i1 = 1;
        do {
            vMeth1(i);
            Test.lArrFld[i1 - 1] *= (long)2.778F;
            i = by2;
            for (i11 = 1; i11 < 5; ++i11) {
                for (i13 = 1; i13 < 2; i13++) {
                    i14 = (int)Test.instanceCount;
                    i14 += i1;
                    by2 = (byte)i13;
                }
                i *= i14;
                i14 += (i11 * i11);
                Test.sFld = (short)Test.instanceCount;
                i12 = i1;
            }
            Test.sFld = (short)i14;
        } while (++i1 < 364);
        vMeth_check_sum += i + i1 + by2 + i11 + i12 + i13 + i14;
    }

    public void mainTest(String[] strArr1) {

        int i15=12, i16=105, i17=176, i18=-109, i19=10, i20=-5, iArr[]=new int[N];
        float f4=-45.809F, f5=-19.16F;
        double d1=-1.111556;

        FuzzerUtils.init(iArr, 44149);

        fFld *= Test.instanceCount;
        vMeth(i15);
        i15 <<= i15;
        i16 = 1;
        do {
            i15 -= (int)Test.dFld;
            f4 = 1;
            while (++f4 < 180) {
                fFld += (f4 - i16);
                i15 = 5712;
                for (d1 = 1; 1 > d1; ++d1) {
                    i15 = i16;
                    Test.sFld += (short)i15;
                    i15 = i17;
                }
            }
            i18 = 1;
            do {
                i17 >>= i15;
                for (i19 = 1; i19 < 1; i19 += 3) {
                    switch ((i19 % 1) + 47) {
                    case 47:
                        switch (((i20 >>> 1) % 3) + 4) {
                        case 4:
                            i20 *= Test.sFld;
                            break;
                        case 5:
                            iArr[i19] <<= i20;
                        case 6:
                            fFld -= -61280;
                            break;
                        default:
                            Test.instanceCount += (((i19 * f5) + i17) - Test.byFld);
                            if (Test.bFld) continue;
                        }
                        i17 -= (int)f4;
                    }
                    f5 -= -54024;
                    i15 ^= i19;
                    Test.dFld += Test.instanceCount;
                    i20 += (i19 * i19);
                    i17 >>= -148;
                    i17 = i18;
                    iArr = FuzzerUtils.int1array(N, (int)-3);
                }
            } while (++i18 < 180);
        } while (++i16 < 139);

        FuzzerUtils.out.println("i15 i16 f4 = " + i15 + "," + i16 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("d1 i17 i18 = " + Double.doubleToLongBits(d1) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 f5 = " + i19 + "," + i20 + "," + Float.floatToIntBits(f5));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.dFld Test.byFld Test.bFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Test.byFld + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

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
