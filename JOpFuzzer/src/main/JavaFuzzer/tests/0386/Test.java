// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:50 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-510660430306892063L;
    public static int iFld=-35079;
    public boolean bFld=false;
    public static int iFld1=233;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -20580);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d1, long l1) {

        float f=2.762F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 62047L);

        Test.iFld *= (int)Test.instanceCount;
        Test.iArrFld[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] -= 14;
        Test.iFld = -14;
        l1 -= Test.iFld;
        Test.iArrFld[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] *= (int)f;
        lArr[(98 >>> 1) % N] = -234;
        Test.iFld -= Test.iFld;
        vMeth2_check_sum += Double.doubleToLongBits(d1) + l1 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(long l, double d, int i1) {

        int i2=-46460, i3=10, i4=-235, i5=-237, i6=73, iArr[]=new int[N];
        long l2=96L;
        short s=-10461;
        byte by=-26;
        boolean b=false;

        FuzzerUtils.init(iArr, 7);

        i2 = 1;
        do {
            try {
                i1 = (-83 / i1);
                iArr[i2 + 1] = (i2 % -49544);
                i1 = (i1 % -167);
            } catch (ArithmeticException a_e) {}
            vMeth2(d, l2);
            d -= 0;
            Test.iFld += (i2 * i2);
            if (b) {
                s = by;
                i1 += (int)Test.instanceCount;
                s += (short)i2;
            }
            for (i3 = i2; i3 < 4; ++i3) {
                for (i5 = 1; 1 > i5; ++i5) {
                    i4 += (int)Test.instanceCount;
                    i4 = (int)20L;
                    i6 -= (int)-86.698F;
                    l2 |= Test.instanceCount;
                }
            }
        } while (++i2 < 389);
        vMeth1_check_sum += l + Double.doubleToLongBits(d) + i1 + i2 + l2 + s + by + (b ? 1 : 0) + i3 + i4 + i5 + i6 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i) {

        double d2=-1.18064;
        int i7=-162, i8=140, i9=1114, i10=218;
        float f2=72.696F, fArr[]=new float[N];
        short s1=-27587;

        FuzzerUtils.init(fArr, -5.921F);

        vMeth1(Test.instanceCount, d2, i);
        for (float f1 : fArr) {
            Test.iFld = i;
            Test.iFld = (int)Test.instanceCount;
            for (i7 = 1; i7 < 4; i7 += 3) {
                i += (i7 + f2);
                s1 += (short)(i7 - i8);
                switch ((i7 % 1) + 125) {
                case 125:
                    for (i9 = 1; 4 > i9; ++i9) {
                        Test.instanceCount -= Test.instanceCount;
                    }
                    Test.instanceCount *= i9;
                    i8 += (((i7 * i) + Test.iFld) - Test.iFld);
                    d2 *= Test.instanceCount;
                    break;
                default:
                    Test.instanceCount += (i7 * i);
                }
                Test.instanceCount = s1;
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d2) + i7 + i8 + Float.floatToIntBits(f2) + s1 + i9 + i10 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        double d3=64.37273, d4=119.92172;
        int i11=-9, i12=-4, i13=50579, i14=110, i15=-59997, i16=-44753;
        float f3=0.932F;
        short s2=-9887;
        boolean b1=true;
        byte by1=-119;

        vMeth(Test.iFld);
        Test.iFld = (int)149L;
        for (d3 = 328; d3 > 9; --d3) {
            Test.iFld -= (int)-13L;
            f3 += (float)(d3 * i11);
            for (i12 = 4; i12 < 79; i12++) {
                switch (((i11 >>> 1) % 2) + 76) {
                case 76:
                case 77:
                    Test.instanceCount -= i13;
                    break;
                }
                i11 <<= 65;
                i13 = i12;
                Test.instanceCount *= (long)1.854F;
                i11 += (i12 ^ i11);
                for (i14 = 1; i14 < 2; i14++) {
                    Test.iFld *= s2;
                    i11 <<= i13;
                    bFld = bFld;
                    Test.iFld += i14;
                    switch (((i12 >>> 1) % 9) + 53) {
                    case 53:
                        i15 += (i14 * i14);
                        d4 *= i14;
                        break;
                    case 54:
                        if (b1) break;
                        Test.instanceCount += i14;
                        i15 = i12;
                        break;
                    case 55:
                        switch ((i12 % 3) + 88) {
                        case 88:
                            i13 ^= i15;
                            switch (((Test.iFld >>> 1) % 2) + 103) {
                            case 103:
                                try {
                                    i11 = (Test.iArrFld[i14][(int)(d3)] % Test.iArrFld[i14 - 1][i12]);
                                    Test.iFld = (14 / i14);
                                    i13 = (Test.iFld / Test.iArrFld[i12][i12]);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 104:
                            }
                            i11 |= Test.iFld1;
                        case 89:
                            Test.instanceCount -= i13;
                            Test.iArrFld[(int)(d3 + 1)][i14 - 1] *= Test.iFld1;
                        case 90:
                            Test.instanceCount -= 93;
                            break;
                        }
                    case 56:
                        by1 -= (byte)Test.iFld1;
                        break;
                    case 57:
                    case 58:
                        f3 += i14;
                    case 59:
                        Test.iArrFld[(int)(d3 - 1)][i12] = Test.iFld;
                    case 60:
                        i16 += i14;
                        break;
                    case 61:
                        Test.iArrFld[(int)(d3)] = FuzzerUtils.int1array(N, (int)-234);
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("d3 i11 f3 = " + Double.doubleToLongBits(d3) + "," + i11 + "," +
            Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 s2 d4 = " + i15 + "," + s2 + "," + Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("b1 by1 i16 = " + (b1 ? 1 : 0) + "," + by1 + "," + i16);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld bFld = " + Test.instanceCount + "," + Test.iFld + "," +
            (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iFld1 Test.iArrFld = " + Test.iFld1 + "," + FuzzerUtils.checkSum(Test.iArrFld));

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
