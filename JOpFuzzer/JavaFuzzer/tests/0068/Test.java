// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7679859743045127990L;
    public static volatile boolean bFld=true;
    public static byte byFld=-40;
    public static volatile float fFld=-105.396F;
    public static int iFld=12;
    public int iFld1=-236;
    public volatile double dFld=21.80753;
    public int iArrFld[]=new int[N];
    public short sArrFld[]=new short[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i2=-48952;

        i2 |= Test.byFld;
        vMeth2_check_sum += i2;
    }

    public static void vMeth1() {

        int i3=30008, i4=-200, i5=-8500, i6=1, i7=54429, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -6);

        vMeth2();
        i3 = 1;
        while ((i3 += 3) < 351) {
            for (i4 = 1; 13 > i4; i4++) {
                Test.fFld += i5;
                if (Test.bFld) break;
                i5 += i4;
                switch (((i3 % 10) * 5) + 31) {
                case 45:
                    i5 >>= (int)Test.instanceCount;
                    i5 = (int)Test.instanceCount;
                    Test.fFld = i4;
                    break;
                case 55:
                    i5 &= i4;
                    for (i6 = 1; i6 < 2; i6++) {
                        i5 += (0 + (i6 * i6));
                        i5 >>>= i6;
                        try {
                            i7 = (iArr1[i3 + 1] % 17146);
                            i7 = (i4 % i5);
                            i7 = (i5 / i7);
                        } catch (ArithmeticException a_e) {}
                    }
                case 52:
                    Test.fFld += (((i4 * i4) + i4) - i6);
                case 78:
                    iArr1[i3] -= i5;
                    break;
                case 61:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 49:
                    i7 ^= i6;
                    break;
                case 50:
                    i5 &= (int)Test.instanceCount;
                case 67:
                    i7 = i7;
                    break;
                case 59:
                case 76:
                    iArr1[i3 - 1] *= i4;
                    break;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth() {

        int i=-9, i1=187, i8=0, i9=24919, i10=13, iArr[]=new int[N];
        short s=5834;
        long l=119L;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -32502);
        FuzzerUtils.init(fArr, 125.716F);

        for (i = 15; i < 344; ++i) {
            Test.bFld = Test.bFld;
            i1 += (((i * Test.instanceCount) + i1) - i1);
            Test.byFld = (byte)(((67L - i) - (s - Test.instanceCount)) - (--iArr[i - 1]));
            vMeth1();
            for (i8 = 1; i8 < 5; ++i8) {
                for (l = 1; l < 2; ++l) {
                    i10 = i10;
                    i9 += (int)(l - Test.instanceCount);
                    Test.instanceCount += (l | Test.instanceCount);
                }
                fArr[i] += i9;
                i1 = (int)6L;
                i1 += (((i8 * i1) + Test.instanceCount) - i8);
                i9 >>= i1;
                i10 = i;
            }
        }
        vMeth_check_sum += i + i1 + s + i8 + i9 + l + i10 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        float f=1.326F;
        int i11=-42587, i12=42024, i13=54236, i14=-123, i15=2, i16=-65365;
        long l1=-6234193685501259681L, lArr[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.59379);
        FuzzerUtils.init(lArr, 228L);

        vMeth();
        Test.byFld *= (byte)Test.iFld;
        iFld1 = (int)Test.fFld;
        f = 1;
        do {
            iFld1 += Test.iFld;
            for (i11 = 4; i11 < 65; i11++) {
                i12 = Test.iFld;
                iFld1 >>= i12;
                Test.instanceCount += (long)(-121.744F + (i11 * i11));
                for (i13 = 1; i13 < 2; ++i13) {
                    iArrFld[(int)(f - 1)] >>= i11;
                }
                iFld1 *= (int)-20369L;
                i15 = iFld1;
                switch ((int)(((f % 7) * 5) + 88)) {
                case 110:
                    for (l1 = 1; l1 < 2; l1++) {
                        i14 <<= i16;
                        dArr[i11 - 1] = i15;
                        iFld1 >>= i14;
                        iArrFld[i11 - 1] += (int)l1;
                        i12 >>>= (int)l1;
                    }
                    i14 = (int)l1;
                    break;
                case 100:
                    if (Test.bFld) {
                        lArr = lArr;
                        i15 += i11;
                    } else {
                        try {
                            iArrFld[(int)(f)] = (iArrFld[i11 - 1] / -99759946);
                            iFld1 = (331534360 % i14);
                            i16 = (iArrFld[(iFld1 >>> 1) % N] % iArrFld[i11 + 1]);
                        } catch (ArithmeticException a_e) {}
                        Test.iFld <<= (int)Test.instanceCount;
                        i16 += i11;
                        Test.byFld = (byte)iFld1;
                    }
                    Test.fFld = Test.iFld;
                    iFld1 += i11;
                    break;
                case 92:
                    sArrFld[i11] = (short)Test.instanceCount;
                    break;
                case 96:
                    Test.instanceCount = l1;
                case 91:
                    dFld -= dFld;
                    break;
                case 112:
                    dFld += 45444;
                    break;
                case 118:
                    Test.iFld += (i11 * i11);
                }
            }
        } while (++f < 386);

        FuzzerUtils.out.println("f i11 i12 = " + Float.floatToIntBits(f) + "," + i11 + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("l1 i16 dArr = " + l1 + "," + i16 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.byFld = " + Test.instanceCount + "," + (Test.bFld ?
            1 : 0) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.fFld Test.iFld iFld1 = " + Float.floatToIntBits(Test.fFld) + "," + Test.iFld +
            "," + iFld1);
        FuzzerUtils.out.println("dFld iArrFld sArrFld = " + Double.doubleToLongBits(dFld) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(sArrFld));

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