// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:49 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=37691L;
    public static double dFld=60.64089;
    public short sFld=28787;
    public static int iArrFld[][]=new int[N][N];
    public static int iArrFld1[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 120);
        FuzzerUtils.init(Test.iArrFld1, -52534);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i10, boolean b) {


        Test.iArrFld[(i10 >>> 1) % N][(i10 >>> 1) % N] = 0;
        vMeth_check_sum += i10 + (b ? 1 : 0);
    }

    public static int iMeth1() {

        float f1=-96.297F, fArr[]=new float[N];
        byte by1=-53;
        int i8=-9, i9=-6, i11=2, i12=18;
        double d=89.53048;
        boolean b1=false;

        FuzzerUtils.init(fArr, 2.165F);

        f1 = (++by1);
        for (i8 = 20; i8 < 377; i8++) {
            Test.iArrFld[i8 - 1][i8 + 1] <<= (int)(-((d -= Test.instanceCount) - (-f1)));
            i9 -= i8;
            vMeth(i9, b1);
            i9 %= (int)(i8 | 1);
            for (i11 = 5; i11 > 1; i11 -= 3) {
                i9 *= i12;
                i12 = i8;
                i9 = (int)Test.instanceCount;
                i12 = (int)Test.instanceCount;
                i12 *= i12;
                i12 = i9;
                fArr[i8] *= 50601;
                i9 += (int)(-7L + (i11 * i11));
            }
        }
        long meth_res = Float.floatToIntBits(f1) + by1 + i8 + i9 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) + i11 +
            i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        float f=1.406F;
        int i1=-11892, i2=7, i3=64, i4=20411, i5=19858, i6=-45917, i7=138;
        long l=-100L, lArr[][]=new long[N][N];
        boolean b2=true;
        byte by2=78;
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, 49576L);
        FuzzerUtils.init(sArr, (short)-18363);

        switch (((((int)(f * i1)) >>> 1) % 1) + 32) {
        case 32:
            for (i2 = 5; i2 < 229; ++i2) {
                for (i4 = 1; i4 < 7; ++i4) {
                    for (i6 = 1; 2 > i6; i6 += 2) {
                        Test.iArrFld[i2 - 1][i2] *= (int)(((Test.instanceCount + i6) -
                            Long.reverseBytes(Test.instanceCount)) - ((-iMeth1()) + i2));
                    }
                    lArr[i4 + 1][i2 + 1] = i4;
                    Test.instanceCount += (long)-1.84820;
                    switch ((((i4 >>> 1) % 2) * 5) + 30) {
                    case 40:
                        l = i2;
                        sArr[i4 + 1] >>= (short)i4;
                        b2 = false;
                        break;
                    case 38:
                        switch (((i5 >>> 1) % 3) + 56) {
                        case 56:
                            i5 -= (int)Test.instanceCount;
                            by2 += (byte)(i4 * i4);
                            break;
                        case 57:
                            Test.instanceCount -= by2;
                            break;
                        case 58:
                            i3 += (((i4 * i1) + i1) - Test.instanceCount);
                            break;
                        default:
                            try {
                                i7 = (-1642339348 / i3);
                                i3 = (i1 % 20749);
                                i5 = (Test.iArrFld[i2 + 1][i2] % i6);
                            } catch (ArithmeticException a_e) {}
                        }
                    default:
                        l += (((i4 * i7) + i7) - Test.instanceCount);
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + i5 + i6 + i7 + l + (b2 ? 1 : 0) + by2 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-9, i13=-25, i15=162, i16=-8, i17=-12, i18=2, i19=-177;
        byte by=-54;
        float f2=-22.821F;
        long l1=-2607030649127700354L, lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -2815760755L);

        Test.instanceCount /= ((--i) | 1);
        by *= (byte)(iMeth() + -22460);
        i13 &= (int)Test.instanceCount;
        for (int i14 : Test.iArrFld1) {
            i15 = 1;
            do {
                for (i16 = 1; 1 > i16; i16++) {
                    Test.iArrFld[i16 - 1][i15] = (int)-12L;
                    Test.instanceCount -= 13L;
                    i13 = (int)f2;
                }
                Test.instanceCount += (i15 * i15);
                i13 -= (int)l1;
                Test.instanceCount *= i17;
                for (i18 = 1; i18 < 1; ++i18) {
                    lArr1[i15 - 1] = i16;
                    l1 += (((i18 * i15) + i14) - Test.instanceCount);
                    i14 -= (int)Test.dFld;
                    fArrFld[i15 + 1] = f2;
                    i19 |= by;
                    i19 = -42983;
                    i14 = i17;
                    l1 = -8;
                    i13 = sFld;
                }
                switch ((i15 % 6) + 4) {
                case 4:
                    i += i15;
                    break;
                case 5:
                    l1 += (14 + (i15 * i15));
                    Test.dFld += i14;
                    Test.dFld -= i14;
                    break;
                case 6:
                    lArr1[i15 - 1] = -18;
                    i14 = (int)Test.dFld;
                case 7:
                    i13 = i;
                    break;
                case 8:
                    f2 += (i15 * i15);
                case 9:
                    f2 = f2;
                    break;
                }
            } while (++i15 < 63);
        }

        FuzzerUtils.out.println("i by i13 = " + i + "," + by + "," + i13);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("f2 l1 i18 = " + Float.floatToIntBits(f2) + "," + l1 + "," + i18);
        FuzzerUtils.out.println("i19 lArr1 = " + i19 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld sFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + sFld);
        FuzzerUtils.out.println("Test.iArrFld Test.iArrFld1 fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}