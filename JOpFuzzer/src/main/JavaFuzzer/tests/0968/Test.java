// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:03 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1146593992L;
    public static float fFld=-12.612F;
    public static short sFld=-22082;
    public static int iArrFld[]=new int[N];
    public volatile boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -18983);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i9, int i10) {

        double d=26.45268;
        int i11=0, i12=-80, i13=-114, i14=-8372, i15=162, i16=14;

        for (d = 18; 379 > d; ++d) {
            for (i12 = 1; i12 < 5; ++i12) {
                Test.instanceCount = i12;
                i10 = i9;
                i10 += (-52399 + (i12 * i12));
                Test.instanceCount += (((i12 * i9) + i13) - Test.instanceCount);
                i9 += i12;
                Test.instanceCount *= (long)-2.841F;
                switch ((int)(((d % 8) * 5) + 107)) {
                case 131:
                    i11 += i9;
                    break;
                case 127:
                case 147:
                    for (i14 = (int)(d); i14 < 2; i14++) {
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)126);
                        Test.instanceCount += (1367L + (i14 * i14));
                        i16 -= (int)254L;
                    }
                    break;
                case 138:
                    Test.instanceCount += i12;
                    break;
                case 133:
                    Test.instanceCount ^= i11;
                    break;
                case 109:
                    i10 *= i10;
                    break;
                case 143:
                    i11 += (i12 | i16);
                    break;
                case 124:
                    i16 *= i15;
                    break;
                default:
                    Test.instanceCount += Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i9 + i10 + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + i15 + i16;
    }

    public static int iMeth1(int i7, int i8) {

        float f=-25.234F;

        vMeth(i8, 0);
        f = 10;
        long meth_res = i7 + i8 + Float.floatToIntBits(f);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i2, int i3, int i4) {

        int i5=-61616, i6=-3, i17=-36681, i18=-87, i19=132;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1028036038L);

        for (i5 = 9; i5 < 179; ++i5) {
            i2 = ((iMeth1(i3, i4) - i3) + i2);
            i17 = 1;
            do {
                i3 = (int)31302L;
                for (i18 = 1; i18 < 1; i18++) {
                    Test.instanceCount += (long)Test.fFld;
                    Test.fFld += (i18 * i18);
                    i2 += Test.sFld;
                    Test.iArrFld[(i17 >>> 1) % N] -= i17;
                    lArr[i5 + 1] *= -1958460565L;
                    i4 += i19;
                    Test.instanceCount -= Test.instanceCount;
                    i2 = i19;
                    Test.iArrFld[i5] = i2;
                }
                if (i17 != 0) {
                }
            } while (++i17 < 9);
        }
        long meth_res = i2 + i3 + i4 + i5 + i6 + i17 + i18 + i19 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-8, i1=-203, i20=134, i21=6, i22=33848, i23=4, i24=-22003, i25=-22428, iArr[][]=new int[N][N];
        double d1=-47.42792;
        boolean b=true;
        byte by=102;
        long l=-64128L, l1=51268L;

        FuzzerUtils.init(iArr, 9);

        for (i = 4; i < 216; ++i) {
            i1 -= i;
            i1 = (int)Test.instanceCount;
            iArr[i][i - 1] <<= iMeth(i1, i1, i1);
            Test.instanceCount = (long)38.49136;
            i1 += i1;
            i1 >>= i;
        }
        Test.instanceCount >>= i;
        i1 = (int)d1;
        Test.fFld = i1;
        for (i20 = 9; i20 < 396; i20++) {
            Test.instanceCount -= -10;
            i1 = i1;
            try {
                i1 = (i1 / 200);
                i1 = (-9725 / i1);
                i21 = (i20 / i);
            } catch (ArithmeticException a_e) {}
            d1 *= Test.fFld;
            Test.fFld += i20;
            iArr[i20][i20] = i1;
            if (b) break;
        }
        i22 = 1;
        while (++i22 < 205) {
            i21 += (int)Test.fFld;
            i1 = i20;
            for (i23 = 122; i23 > i22; i23--) {
                i25 ^= i25;
                i1 += by;
                l = 1;
                while (--l > 0) {
                    if (b) {
                        i1 = -14205;
                        bArrFld[(int)(l + 1)] = b;
                        i1 *= (int)-2.726F;
                    } else if (b) {
                        l1 = 13;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 d1 = " + i + "," + i1 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i20 i21 b = " + i20 + "," + i21 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 by l = " + i25 + "," + by + "," + l);
        FuzzerUtils.out.println("l1 iArr = " + l1 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.iArrFld bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(bArrFld));

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
