// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-370755868048287976L;
    public byte byFld=0;
    public static float fFld=-62.855F;
    public static volatile double dFld=90.3407;
    public static short sFld=-11849;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vSmallMeth(long l) {

        int i2=-3;

        i2 = i2;
        vSmallMeth_check_sum += l + i2;
    }

    public static void vMeth1(double d, int i14, long l2) {

        int i15=7881, i16=-53685, i17=-106, i18=-74, i19=7, i20=-247;
        byte by=82;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1769998439L);

        vSmallMeth(Test.instanceCount);
        i14 = 160;
        for (i15 = 133; i15 > 1; i15--) {
            i17 = 12;
            while (--i17 > 0) {
                i14 -= (int)Test.fFld;
                for (i18 = 1; i18 < 1; ++i18) {
                    i16 -= i14;
                    by = (byte)i19;
                    i19 *= (int)d;
                    i19 += i16;
                    i16 >>= (int)l2;
                }
                i20 = 1;
                while (++i20 < 1) {
                    d -= -8;
                    Test.fFld = i19;
                    lArr[i15] <<= 0;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i14 + l2 + i15 + i16 + i17 + i18 + i19 + by + i20 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i7, int i8, int i9) {

        long l1=-2909976054904273763L;
        int i10=3931, i11=63496, i12=11, i13=190, iArr1[]=new int[N];
        short s=-5814;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, 5);
        FuzzerUtils.init(dArr, -2.129133);

        Test.dFld -= iArr1[(i9 >>> 1) % N];
        for (l1 = 10; l1 < 329; ++l1) {
            i10 -= iArr1[(int)(l1 + 1)];
            i11 = 1;
            while (++i11 < 5) {
                byte by1=17;
                i9 += (i11 + Test.instanceCount);
                s += (short)(((i11 * Test.instanceCount) + l1) - i11);
                for (i12 = 1; 1 > i12; i12++) {
                    dArr[i12 + 1] += Test.instanceCount;
                    i8 = -2638;
                    i13 = (iArr1[i11]--);
                    i13 += (i12 * i12);
                    vMeth1(Test.dFld, i10, l1);
                    try {
                        i10 = (iArr1[i11 - 1] % -102);
                        i10 = (-202 % i9);
                        i10 = (i12 / 1697);
                    } catch (ArithmeticException a_e) {}
                }
                iArr1[i11] <<= by1;
            }
            Test.instanceCount += (5591221623977167264L + (l1 * l1));
        }
        vMeth_check_sum += i7 + i8 + i9 + l1 + i10 + i11 + s + i12 + i13 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-203, i1=-11, i3=-11, i4=16, i5=9, i6=-11, i21=-9, i22=58678, i23=-72, i24=-7, i25=6, i26=18, iArr[]=new
            int[N];
        boolean b=false;

        FuzzerUtils.init(iArr, 231);

        i = (int)(byFld - ((Test.instanceCount | i) + (i >>= (int)Test.instanceCount)));
        iArr = iArr;
        i1 = 1;
        while (++i1 < 227) {
            i >>= (int)(-((Test.fFld -= Test.instanceCount) / (((long)(Test.fFld + i1)) | 1)));
        }
        Test.fFld -= 75;
        for (int smallinvoc=0; smallinvoc<391; smallinvoc++) vSmallMeth(-58041L);
        for (i3 = 2; i3 < 136; i3 += 3) {
            for (i5 = 226; i5 > 8; i5--) {
                i += (i5 | Test.instanceCount);
                vMeth(i, i3, -27536);
            }
            for (i21 = 7; i21 < 387; i21++) {
                Test.sFld += (short)i21;
                for (i23 = 1; i23 < 2; i23 += 3) {
                    Test.instanceCount = -1592352579L;
                    Test.fFld = (float)90.61709;
                    iArr = iArr;
                }
                iArr[i3 + 1] = 187;
                iArr[i3 - 1] *= i5;
                Test.fFld = i3;
                Test.fFld -= Test.fFld;
                b = b;
                Test.instanceCount = Test.instanceCount;
                i *= -4;
            }
            iArr[i3 - 1] += -20508;
            i4 += (((i3 * i23) + i4) - Test.fFld);
            for (i25 = 12; i25 < 246; ++i25) {
                if (b) continue;
                i22 <<= i23;
                i24 += (i25 | Test.instanceCount);
                Test.instanceCount -= Test.instanceCount;
            }
        }

        FuzzerUtils.out.println("i i1 i3 = " + i + "," + i1 + "," + i3);
        FuzzerUtils.out.println("i4 i5 i6 = " + i4 + "," + i5 + "," + i6);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 b i25 = " + i24 + "," + (b ? 1 : 0) + "," + i25);
        FuzzerUtils.out.println("i26 iArr = " + i26 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount byFld Test.fFld = " + Test.instanceCount + "," + byFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.dFld Test.sFld = " + Double.doubleToLongBits(Test.dFld) + "," + Test.sFld);

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth1 vMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}