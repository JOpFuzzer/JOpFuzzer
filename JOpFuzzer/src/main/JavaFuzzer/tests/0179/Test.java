// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public static short sFld=-32643;
    public static boolean bFld=false;
    public static byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-15);
        FuzzerUtils.init(Test.lArrFld, 12L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i12, int i13) {

        int i14=81, i15=13, i17=-3494, i18=77, iArr1[]=new int[N];
        float f=1.608F, fArr[][]=new float[N][N];
        boolean b=true;

        FuzzerUtils.init(iArr1, 199);
        FuzzerUtils.init(fArr, 99.669F);

        i12 -= -184;
        for (i14 = 13; i14 < 301; i14++) {
            i12 -= (int)Test.instanceCount;
            i12 >>= i13;
            if (b) {
                switch (((i14 % 1) * 5) + 24) {
                case 25:
                    i12 -= i12;
                    i12 >>= i15;
                    for (i17 = 1; i17 < 6; i17++) {
                        i13 = Test.sFld;
                        i12 = (int)Test.instanceCount;
                        Test.instanceCount = -140;
                        f -= i17;
                        fArr[i14] = fArr[i17 - 1];
                        Test.instanceCount ^= i13;
                    }
                    break;
                default:
                    Test.sFld = (short)i17;
                }
            } else if (b) {
                i18 -= (int)f;
            } else if (true) {
                Test.lArrFld[i14] += i18;
            } else {
                iArr1[i14] = 240;
            }
        }
        long meth_res = i12 + i13 + i14 + i15 + i17 + i18 + Float.floatToIntBits(f) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth() {

        int i5=-6825, i6=-92, i7=31030, i8=2358, i9=57594, i10=43, i11=-211, i19=3, i20=-48110, iArr[][]=new int[N][N];
        long l2=-169L;
        double d=1.11242;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)31309);
        FuzzerUtils.init(iArr, -62);

        i5 <<= i5;
        l2 = 282;
        do {
            i6 = 1;
            while ((i6 += 2) < 6) {
                Test.instanceCount >>= (--i5);
                Test.instanceCount -= 31444;
                for (d = l2; d < 2; d++) {
                    Test.byArrFld[(int)(d + 1)] = (byte)i5;
                }
                for (i8 = 1; i8 < 2; ++i8) {
                    sArr = (sArr = (sArr = (sArr = FuzzerUtils.short1array(N, (short)27621))));
                }
                for (i10 = (int)(l2); i10 < 2; i10++) {
                    iArr[i6 + 1][i6] *= (int)(-fMeth(i8, -51));
                }
            }
            Test.instanceCount += Test.instanceCount;
            for (i19 = 6; i19 > 1; --i19) {
                i11 *= (int)l2;
                i11 >>>= i10;
            }
        } while (--l2 > 0);
        long meth_res = i5 + l2 + i6 + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + i11 + i19 + i20 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4, long l1) {

        byte by=-12;
        short s=2743;

        i4 = (int)(-Math.max(--l1, l1++));
        by = (byte)(((~(-(i4 - s))) - (-5597717538301674311L * iMeth())) - i4);
        vMeth_check_sum += i4 + l1 + by + s;
    }

    public void mainTest(String[] strArr1) {

        int i=-221, i1=13, i2=-192, i3=-11, i21=-96, i22=7, i23=-7898, i24=-32, i25=24254;
        long l=-22825L, l3=-24098L;
        float f1=99.245F, f2=8.726F;
        double d1=103.76210;
        byte by1=84;

        for (i = 9; i < 182; i++) {
            for (i2 = 1; i2 < 145; ++i2) {
                Test.instanceCount += (((i2 * i3) + i) - i2);
                Test.instanceCount -= (long)-31.953F;
                Test.instanceCount = i1;
                l = 1;
                do {
                    vMeth(i, l);
                    f1 = l3;
                    i3 = (int)l3;
                    i1 += (int)d1;
                    i3 += (int)l;
                    Test.bFld = Test.bFld;
                } while (++l < 2);
                by1 += (byte)(((i2 * i) + by1) - i2);
                i3 ^= i2;
                for (i21 = 1; 2 > i21; i21++) {
                    i22 &= -8;
                    Test.instanceCount = l;
                    l3 += i21;
                    i22 += (i21 + Test.instanceCount);
                    Test.instanceCount *= l3;
                    Test.sFld -= (short)-2453894455L;
                    i3 += (((i21 * i22) + i) - l3);
                    i3 = i1;
                    i1 += (i21 - i3);
                    i1 *= i;
                }
            }
        }
        Test.bFld = Test.bFld;
        for (f2 = 3; f2 < 206; f2 += 3) {
            for (i24 = 1; i24 < 374; i24++) {
                i25 += (((i24 * i24) + i2) - i22);
                Test.instanceCount *= i2;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 l f1 = " + i3 + "," + l + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("l3 d1 by1 = " + l3 + "," + Double.doubleToLongBits(d1) + "," + by1);
        FuzzerUtils.out.println("i21 i22 f2 = " + i21 + "," + i22 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.bFld = " + Test.instanceCount + "," + Test.sFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.byArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.byArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
