// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1632943921972922059L;
    public double dFld=0.99518;
    public volatile float fFld=42.100F;
    public short sFld=-2840;
    public static long lArrFld[]=new long[N];
    public volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 6918497460891020720L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d1, boolean b) {

        int i3=-61287, i4=-2, i5=4, i6=-32378, i7=-6, iArr[]=new int[N];
        float f1=2.853F;
        long l=-2L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2437452828986915753L);
        FuzzerUtils.init(iArr, -29433);

        for (i3 = 9; 192 > i3; ++i3) {
            for (i5 = 1; i5 < 9; i5++) {
                lArr[i5 - 1] &= 122;
            }
            iArr[i3] -= i6;
            Test.instanceCount += 254;
            f1 = (float)d1;
            i6 *= i3;
            i7 = 9;
            do {
                f1 /= (i6 | 1);
                f1 *= i6;
                switch ((((i4 >>> 1) % 1) * 5) + 40) {
                case 42:
                    f1 = Test.instanceCount;
                    l *= 65;
                    Test.instanceCount -= (long)-29.19705;
                    i4 = i5;
                    break;
                default:
                    try {
                        i6 = (i3 % iArr[i7 - 1]);
                        iArr[i3 + 1] = (i7 % i5);
                        i6 = (iArr[i7] % -1502274190);
                    } catch (ArithmeticException a_e) {}
                }
            } while (--i7 > 0);
        }
        vMeth2_check_sum += Double.doubleToLongBits(d1) + (b ? 1 : 0) + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) +
            i7 + l + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(double d, int i2, float f) {

        boolean b1=true;
        int i8=2, i9=27, i10=-2, i11=-18396, i12=-4, i13=147, i14=1963, i15=-1, iArr1[][]=new int[N][N];
        short s=17620;

        FuzzerUtils.init(iArr1, 36369);

        vMeth2(d, b1);
        i2 <<= (int)Test.instanceCount;
        for (i8 = 15; i8 < 371; i8++) {
            i10 = 1;
            do {
                iArr1[i8][i10] += i8;
                iArr1[i10 + 1][i10 + 1] = i10;
                i9 -= -27850;
            } while (++i10 < 5);
        }
        Test.lArrFld[(i8 >>> 1) % N] *= s;
        for (i11 = 10; i11 < 181; i11++) {
            for (i13 = i11; i13 < 9; i13++) {
                Test.instanceCount = i11;
                i15 += i15;
                try {
                    i2 = (iArr1[i11 + 1][i11] / iArr1[i13][i13]);
                    i15 = (iArr1[i11 + 1][i11 - 1] / 162);
                    iArr1[i13][i13 + 1] = (i14 / iArr1[i11][i11 - 1]);
                } catch (ArithmeticException a_e) {}
                i2 += i13;
                d += i14;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i2 + Float.floatToIntBits(f) + (b1 ? 1 : 0) + i8 + i9 + i10 +
            s + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(int i, int i1) {

        int i16=164, i17=7, i18=7, i19=11, i20=-9, iArr2[]=new int[N];
        short s1=18793;
        byte by=58;

        FuzzerUtils.init(iArr2, -30424);

        vMeth1(dFld, i, fFld);
        i16 *= -50454;
        i1 ^= 132;
        for (i17 = 17; i17 < 359; ++i17) {
            Test.instanceCount *= (long)fFld;
            i += (((i17 * i16) + s1) - fFld);
            Test.instanceCount += i16;
            i1 *= by;
            Test.instanceCount <<= i17;
            iArr2[i17 + 1] += -11;
        }
        for (i19 = 5; i19 < 340; i19++) {
            iArr2[i19] -= 13;
            i1 = i18;
            by += (byte)(((i19 * i20) + Test.instanceCount) - i);
        }
        s1 += (short)i20;
        vMeth_check_sum += i + i1 + i16 + i17 + i18 + s1 + by + i19 + i20 + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i21=-19445, i22=-54481, i23=-65071, i24=-56447, i25=-124, i26=-6, i27=-9, i28=-35, i29=-161;
        boolean b2=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.24441);

        vMeth(i21, i21);
        if (b2) {
            b2 = true;
            dFld += 29357;
            i21 = i21;
            Test.instanceCount -= (long)fFld;
        }
        for (i22 = 3; i22 < 135; i22++) {
            for (i24 = 10; i24 < 190; i24++) {
                dArr[i24 - 1] = sFld;
                i23 |= i21;
                i21 = (int)Test.instanceCount;
                for (i26 = 1; i26 < 2; i26++) {
                    i23 += -65458;
                    dArr = FuzzerUtils.double1array(N, (double)-69.79327);
                    i23 >>= (int)Test.instanceCount;
                    Test.instanceCount = i24;
                    Test.instanceCount = i24;
                }
                Test.instanceCount = Test.instanceCount;
                i27 <<= i21;
                fFld -= Test.instanceCount;
                for (i28 = 1; i28 < 2; i28 += 2) {
                    Test.lArrFld[i28] = i23;
                    i29 += (i28 * i28);
                    i25 += i28;
                    i29 += (i28 * i24);
                    dFld += i23;
                    sFld = (short)i24;
                    fArrFld[(-6 >>> 1) % N] -= i27;
                    i21 *= i28;
                    i29 -= i24;
                }
            }
        }

        FuzzerUtils.out.println("i21 b2 i22 = " + i21 + "," + (b2 ? 1 : 0) + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 dArr = " + i29 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount dFld fFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("sFld Test.lArrFld fArrFld = " + sFld + "," + FuzzerUtils.checkSum(Test.lArrFld) + ","
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

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