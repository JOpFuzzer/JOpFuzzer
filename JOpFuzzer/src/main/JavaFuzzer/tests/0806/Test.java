// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:59 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5834L;
    public int iFld=-11;
    public static volatile short sFld=27870;
    public static boolean bFld=true;
    public static float fFld=60.517F;
    public byte byFld=125;
    public static long lArrFld[]=new long[N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -173L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, int i4) {

        int i5=-11, i6=100, i7=-9, i8=-7739, iArr[]=new int[N];
        double d=-2.101385;
        float f=-2.286F;
        byte by=105;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 5906);
        FuzzerUtils.init(lArr, -2L);

        iArr[(-4 >>> 1) % N] += (int)Test.instanceCount;
        for (i5 = 12; i5 < 218; ++i5) {
            i4 *= i4;
            d = i4;
            i4 = (int)-5L;
            i4 |= (int)Test.instanceCount;
            f *= Test.sFld;
            i7 = 8;
            while (--i7 > 0) {
                i3 += i5;
                Test.instanceCount += i8;
                switch ((i5 % 3) + 127) {
                case 127:
                    by = (byte)f;
                case 128:
                    i8 = i3;
                    i3 = i6;
                    break;
                case 129:
                    Test.sFld = (short)i4;
                    break;
                }
            }
        }
        vMeth2_check_sum += i3 + i4 + i5 + i6 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i7 + i8 + by +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i, int i1, int i2) {

        int i9=240, i10=-1, i11=8, i12=-10;
        double d1=-47.21726;

        vMeth2(i1, i1);
        i9 = 1;
        while (++i9 < 147) {
            i2 ^= Test.sFld;
            for (i10 = 11; 1 < i10; i10 -= 3) {
                i *= (int)-653807549L;
                i2 += (int)d1;
                d1 = Test.instanceCount;
                i1 = (int)3983036764L;
                i12 = 1;
                while (++i12 < 4) {
                    Test.bFld = Test.bFld;
                    i = 66;
                    Test.lArrFld[i10 + 1] >>= -168;
                    Test.instanceCount += 19644;
                    d1 += i2;
                    i2 -= i;
                }
            }
        }
        vMeth1_check_sum += i + i1 + i2 + i9 + i10 + i11 + Double.doubleToLongBits(d1) + i12;
    }

    public static void vMeth(short s, long l) {

        int i13=-45861, i14=-57356, i15=-6, i16=8, i17=10671;
        long l2=2116694472L, l3=169L;
        double d2=73.88280;

        vMeth1(i13, i13, 48523);
        for (l2 = 2; l2 < 122; ++l2) {
            i13 -= 18309;
            i14 *= (int)Test.fFld;
            i14 += (int)l2;
        }
        for (i15 = 5; i15 < 223; ++i15) {
            Test.fFld += (i15 - Test.instanceCount);
            d2 *= i14;
            i14 >>= (int)l3;
            i16 = 39370;
        }
        l = i13;
        i17 = 1;
        while (++i17 < 124) {
            Test.bFld = Test.bFld;
            i16 += (((i17 * l3) + i14) - i16);
            Test.fFld = i15;
        }
        vMeth_check_sum += s + l + i13 + l2 + i14 + i15 + i16 + Double.doubleToLongBits(d2) + l3 + i17;
    }

    public void mainTest(String[] strArr1) {

        int i18=5, i19=114, i20=48269, i21=-142, i22=-11, i23=-52385, i24=-236, i25=6, i26=16092, i27=-12,
            iArr1[][]=new int[N][N];
        float f1=-112.14F, f2=53.854F;

        FuzzerUtils.init(iArr1, -18631);

        switch (((((iFld + iFld) >>> 1) % 1) * 5) + 49) {
        case 51:
            vMeth(Test.sFld, Test.instanceCount);
            byFld -= (byte)iFld;
            iFld -= iFld;
            for (i18 = 18; i18 < 294; i18++) {
                for (i20 = 5; 91 > i20; ++i20) {
                    for (f1 = 1; f1 < 2; f1++) {
                        iArr1[i18 + 1][i18] %= (int)(byFld | 1);
                        iFld = i18;
                        Test.instanceCount -= Test.sFld;
                        i21 = i18;
                    }
                }
                Test.instanceCount = i22;
                for (i23 = i18; i23 < 91; i23++) {
                    Test.instanceCount = i18;
                    byFld += (byte)Test.instanceCount;
                    for (i25 = 1; i25 < 1; i25++) {
                        iFld += i27;
                        i19 += (i25 ^ i27);
                        iArr1[i25 - 1][i23 + 1] += (int)Test.instanceCount;
                        Test.lArrFld = Test.lArrFld;
                        iArr1[i23][i23] >>>= i20;
                        if (Test.bFld) break;
                        i22 *= (int)Test.instanceCount;
                    }
                    Test.fFld += (i23 * i23);
                    sArrFld[i23 + 1] += (short)20.953F;
                }
                f2 = 91;
                while (--f2 > 0) {
                    i27 += (int)Test.instanceCount;
                }
                i27 += Test.sFld;
                Test.fFld -= iFld;
                i27 <<= i22;
            }
            break;
        default:
            Test.instanceCount *= Test.instanceCount;
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 f1 i22 = " + i21 + "," + Float.floatToIntBits(f1) + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 f2 = " + i26 + "," + i27 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.sFld = " + Test.instanceCount + "," + iFld + "," +
            Test.sFld);
        FuzzerUtils.out.println("Test.bFld Test.fFld byFld = " + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(Test.fFld) + "," + byFld);
        FuzzerUtils.out.println("Test.lArrFld sArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(sArrFld));

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
