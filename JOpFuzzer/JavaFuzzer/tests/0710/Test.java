// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:57 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=12L;
    public static volatile int iFld=-10896;
    public short sFld=23069;
    public static float fFld=47.731F;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 199148905L);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        float f2=1.615F, fArr[]=new float[N];
        int i6=-28095, i7=8, i8=6, i9=-6, i10=-63240, i11=14, iArr2[]=new int[N];
        double d=-124.29208;
        boolean b=false;

        FuzzerUtils.init(fArr, 0.123F);
        FuzzerUtils.init(iArr2, 26120);

        Test.iFld = (int)f2;
        for (i6 = 10; i6 < 397; ++i6) {
            i7 = (int)Test.instanceCount;
            for (i8 = 1; 4 > i8; i8++) {
                Test.instanceCount += (((i8 * i7) + f2) - Test.iFld);
                if (b) {
                    i7 += i8;
                } else if (true) {
                    Test.iFld >>>= (int)Test.instanceCount;
                } else if (b) {
                    for (i10 = i6; 2 > i10; ++i10) {
                        short s=1088;
                        i7 = i8;
                        switch ((((-201 >>> 1) % 1) * 5) + 66) {
                        case 69:
                        }
                        fArr[(i10 >>> 1) % N] += Test.iFld;
                        iArr2[i8] += i9;
                        d += f2;
                        i7 = s;
                    }
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f2) + i6 + i7 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d) + (b
            ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
    }

    public static double dMeth(long l) {

        int i5=54237, i12=-41004, i13=60482, i14=63399, i15=221, i16=-37134, iArr3[]=new int[N];
        float f3=0.122F, fArr1[]=new float[N];
        boolean b1=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(fArr1, 0.762F);
        FuzzerUtils.init(iArr3, -199);
        FuzzerUtils.init(byArr, (byte)36);

        i5 >>= i5;
        vMeth1();
        i12 = 1;
        while (++i12 < 359) {
            for (i13 = 1; i13 < 5; i13++) {
                fArr1[i13 - 1] += i14;
                Test.iFld += (-26104 + (i13 * i13));
                f3 = i14;
                i5 *= (int)f3;
                if (b1) continue;
                Test.iFld = i12;
                i5 += (i13 + i13);
                iArr3[i13 - 1] = i14;
            }
            for (i15 = 5; 1 < i15; --i15) {
                byArr[i15] += (byte)Test.iFld;
                i5 = i16;
            }
        }
        long meth_res = l + i5 + i12 + i13 + i14 + Float.floatToIntBits(f3) + (b1 ? 1 : 0) + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr3) +
            FuzzerUtils.checkSum(byArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i1, int i2) {

        int i3=12, i4=-139, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 196);

        for (i3 = 3; i3 < 311; i3++) {
            float f1=-114.966F;
            Test.lArrFld[i3 - 1] *= (iArr1[i3 - 1] + ((i3 - i4) + (--i2)));
            f1 = (float)dMeth(Test.instanceCount);
        }
        i2 *= i1;
        vMeth_check_sum += i1 + i2 + i3 + i4 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        float f=38.616F;
        int i=-8928, i18=123, i19=15950, i20=20961, i21=71, i22=-203, iArr[]=new int[N];
        double d1=-116.113034, d2=-80.52365;
        byte by=10;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(sArr, (short)-1521);

        f -= (--iArr[(i >>> 1) % N]);
        vMeth(i, -50527);
        for (int i17 : iArr) {
            boolean b2=false;
            if (b2) continue;
            i17 += i17;
            f *= i17;
            Test.iFld = Test.iFld;
            for (i18 = 1; 63 > i18; ++i18) {
                switch ((i18 % 2) + 76) {
                case 76:
                    i17 += (i18 + Test.iFld);
                    for (d1 = 1; d1 < 2; ++d1) {
                        sFld -= (short)Test.instanceCount;
                        if (b2) continue;
                        by = (byte)i19;
                        i17 <<= i19;
                        i17 = (int)Test.instanceCount;
                    }
                    switch ((i18 % 8) + 47) {
                    case 47:
                        sFld >>= (short)-8;
                        sFld >>>= (short)Test.instanceCount;
                        break;
                    case 48:
                        for (i21 = 1; i21 < 2; i21++) {
                            switch (((i19 >>> 1) % 3) + 7) {
                            case 7:
                                i17 = (int)215L;
                                Test.iFld -= i21;
                                break;
                            case 8:
                                Test.lArrFld[i21 + 1] >>>= 214715768L;
                                i17 = (int)Test.instanceCount;
                                sFld *= (short)i20;
                                d2 -= Test.instanceCount;
                                break;
                            case 9:
                            }
                            Test.iFld = i22;
                            Test.instanceCount -= by;
                            Test.iFld = i;
                        }
                        break;
                    case 49:
                        Test.instanceCount <<= 23743;
                        break;
                    case 50:
                        sArr = FuzzerUtils.short1array(N, (short)21150);
                        break;
                    case 51:
                        i19 = (int)Test.instanceCount;
                        break;
                    case 52:
                        Test.lArrFld[i18 - 1] = i17;
                        break;
                    case 53:
                        d2 -= i20;
                        break;
                    case 54:
                        f -= Test.instanceCount;
                        break;
                    default:
                        i19 += (i18 * Test.fFld);
                    }
                case 77:
                    i20 = i20;
                    break;
                default:
                    by += (byte)(((i18 * i17) + Test.instanceCount) - Test.instanceCount);
                }
            }
        }

        FuzzerUtils.out.println("f i i18 = " + Float.floatToIntBits(f) + "," + i + "," + i18);
        FuzzerUtils.out.println("i19 d1 i20 = " + i19 + "," + Double.doubleToLongBits(d1) + "," + i20);
        FuzzerUtils.out.println("by i21 i22 = " + by + "," + i21 + "," + i22);
        FuzzerUtils.out.println("d2 iArr sArr = " + Double.doubleToLongBits(d2) + "," + FuzzerUtils.checkSum(iArr) +
            "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld sFld = " + Test.instanceCount + "," + Test.iFld + "," +
            sFld);
        FuzzerUtils.out.println("Test.fFld Test.lArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}