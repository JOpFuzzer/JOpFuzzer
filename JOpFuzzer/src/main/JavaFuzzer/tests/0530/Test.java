// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-583278502L;
    public static short sFld=31158;
    public static float fFld=32.693F;
    public double dFld=-2.32014;
    public int iFld=12;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -5L);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i2=-26;

        i2 >>= i2;
        vMeth1_check_sum += i2;
    }

    public static double dMeth(int i1) {

        int i3=8432, i4=-9, i5=-11, i6=8, i7=45, i8=-5;
        byte by=47;
        double d=0.93663;

        vMeth1();
        Test.sFld = (short)i1;
        Test.fFld -= i1;
        for (i3 = 5; i3 < 319; ++i3) {
            switch (((-169 >>> 1) % 5) + 110) {
            case 110:
                by /= (byte)(Test.instanceCount | 1);
                for (i5 = 1; i5 < 5; i5++) {
                    Test.instanceCount = Test.instanceCount;
                    d += -27;
                }
                for (i7 = 1; i7 < 5; i7++) {
                    Test.instanceCount -= Test.instanceCount;
                }
                i8 -= 50051;
                break;
            case 111:
                i6 = i1;
                Test.instanceCount -= i7;
                i4 += i3;
                break;
            case 112:
                i4 = i5;
            case 113:
                i6 = i1;
                break;
            case 114:
                Test.instanceCount >>= i8;
                break;
            }
        }
        long meth_res = i1 + i3 + i4 + by + i5 + i6 + Double.doubleToLongBits(d) + i7 + i8;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(long l, int i) {

        int i9=-66, i10=9, i11=-40631, i12=-183, i13=-20473;
        byte by1=-70;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 78.60389);

        i -= (int)dMeth(i);
        for (i9 = 5; i9 < 342; ++i9) {
            dArr[i9 - 1] = Test.instanceCount;
            Test.instanceCount |= i;
            for (i11 = 1; 5 > i11; ++i11) {
                boolean b=true;
                Test.instanceCount += (i11 * i11);
                Test.instanceCount += -149;
                i13 = 1;
                do {
                    by1 -= by1;
                } while (++i13 < 2);
                if (false) break;
                i -= i9;
                i10 += (i11 - i10);
                if (b) {
                    Test.sFld = (short)Test.fFld;
                    i -= i13;
                } else {
                    i += (i11 + i9);
                }
            }
        }
        vMeth_check_sum += l + i + i9 + i10 + i11 + i12 + i13 + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i14=-8, i15=123, i16=-5, i17=205, i18=221, i19=142, i20=-5, i21=-203, i22=-23, iArr[]=new int[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(byArr, (byte)5);

        vMeth(Test.instanceCount, i14);
        for (i15 = 1; i15 < 155; ++i15) {
            boolean b1=false;
            i16 *= 83;
            i16 |= i15;
            iArr[i15] = -88;
            Test.instanceCount += Test.instanceCount;
            i16 = 20208;
            i14 >>= i15;
            Test.lArrFld[i15 + 1] >>= i14;
            b1 = b1;
            i16 |= 41959;
            if (false) {
                for (i17 = 3; i17 < 163; i17++) {
                    byte by2=99;
                    Test.instanceCount += (i17 * i17);
                    i14 -= (int)dFld;
                    Test.instanceCount += (i17 * i17);
                    Test.instanceCount += i15;
                    Test.sFld <<= (short)Test.instanceCount;
                    iFld *= i18;
                    iFld += (((i17 * Test.instanceCount) + i17) - by2);
                    byArr[i15 - 1] = (byte)Test.fFld;
                    i14 >>>= i15;
                    Test.instanceCount -= i17;
                }
                for (i19 = 163; i19 > 3; i19--) {
                    try {
                        iArr[i19 - 1] = (i16 / i17);
                        i20 = (i18 / 44915);
                        iFld = (i15 / i14);
                    } catch (ArithmeticException a_e) {}
                    if (b1) continue;
                }
                i16 *= (int)Test.instanceCount;
                for (i21 = i15; 163 > i21; i21++) {
                    i22 += (i21 ^ i21);
                    iArr[i21 + 1] = -247;
                }
            }
        }

        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("iArr byArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("dFld iFld Test.lArrFld = " + Double.doubleToLongBits(dFld) + "," + iFld + "," +
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
