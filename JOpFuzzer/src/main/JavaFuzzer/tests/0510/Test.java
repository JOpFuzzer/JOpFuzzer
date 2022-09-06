// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:52 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-34015L;
    public static volatile double dFld=0.65600;
    public static double dArrFld[]=new double[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 14.88890);
        FuzzerUtils.init(Test.fArrFld, 0.937F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i6) {

        int i7=10, i8=-4, i9=-24, i10=88, i11=-41878, i12=29952;
        float f=16.794F;
        long l2=9L;

        for (i7 = 2; 140 > i7; i7++) {
            f = Test.instanceCount;
            Test.instanceCount = i6;
        }
        for (i9 = 5; i9 < 209; ++i9) {
            switch ((((i7 >>> 1) % 2) * 5) + 109) {
            case 118:
                i10 = (int)Test.instanceCount;
                Test.dFld = i9;
                l2 = 1;
                while (++l2 < 8) {
                    i6 += (int)(l2 - Test.instanceCount);
                    Test.instanceCount = i6;
                }
                break;
            case 113:
                Test.instanceCount = 72;
                for (i11 = 1; i11 < 8; ++i11) {
                    i8 += (int)l2;
                }
                if (true) continue;
            }
        }
        f = f;
        vMeth2_check_sum += i6 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + l2 + i11 + i12;
    }

    public static void vMeth1(int i2, int i3, long l) {

        long l1=-39862L;
        byte by=-78;
        int i4=53515, i5=35003, i13=-32802, i14=-11, i15=-14, i16=-11, iArr[]=new int[N];
        short s=-17077;
        boolean b=false;

        FuzzerUtils.init(iArr, 9);

        l1 = 1;
        do {
            iArr[(int)(l1 - 1)] -= (int)(((Test.dFld + 18) + (by++)) / ((long)(Double.longBitsToDouble(l1)) | 1));
            for (i4 = 1; i4 < 7; i4++) {
                vMeth2(7);
                for (i13 = 1; i13 < 2; i13++) {
                    Test.dArrFld[i13 + 1] -= i14;
                    i14 <<= by;
                    l >>>= i13;
                }
                i3 = (int)Test.instanceCount;
                by = (byte)l1;
            }
            Test.fArrFld[(int)(l1 + 1)] += s;
            for (i15 = 1; i15 < 7; ++i15) {
                if (b) {
                    s += (short)(i15 + i5);
                    i2 += by;
                } else if (b) {
                    Test.instanceCount *= s;
                } else if (b) {
                    i5 >>= i14;
                }
            }
        } while (++l1 < 222);
        vMeth1_check_sum += i2 + i3 + l + l1 + by + i4 + i5 + i13 + i14 + s + i15 + i16 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i) {

        int i1=-30120, i17=11, i18=8, i19=-1394, i20=-6, iArr1[]=new int[N];
        byte by1=117;
        float f1=0.611F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr1, -117);
        FuzzerUtils.init(lArr, 37126L);

        i1 = 1;
        do {
            i = i;
            vMeth1(64885, i, Test.instanceCount);
            iArr1[i1] = i1;
            if (true) {
                lArr[i1 - 1][i1 - 1] = i;
                by1 += (byte)(-47.243F + (i1 * i1));
                Test.instanceCount -= i;
            } else {
            }
            for (i17 = 1; 13 > i17; i17++) {
                i18 += (int)f1;
                i18 = (int)Test.dFld;
                Test.dFld *= 4;
                for (i19 = 1; 2 > i19; i19++) {
                    Test.instanceCount = 508203516L;
                    iArr1[i19] -= i18;
                }
            }
        } while ((i1 += 3) < 359);
        vMeth_check_sum += i + i1 + by1 + i17 + i18 + Float.floatToIntBits(f1) + i19 + i20 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {


        vMeth(246);


        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.dArrFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

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
