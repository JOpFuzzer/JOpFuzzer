// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-144L;
    public static volatile boolean bFld=true;
    public static int iFld=-200;
    public float fFld=57.523F;
    public static short sFld=-24582;
    public int iArrFld[]=new int[N];

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i, int i1) {

        long l=10690L;
        int i2=-3, i3=-7, i4=-153, i5=2;
        double d=0.86881;
        byte by=80;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        bArr[(i >>> 1) % N] = Test.bFld;
        for (l = 8; 310 > l; ++l) {
            i2 += i2;
            for (i3 = 5; i3 > 1; i3 -= 2) {
                short s=23458;
                if (Test.bFld) break;
                Test.instanceCount *= i1;
                i += s;
                Test.instanceCount = (long)d;
            }
            Test.instanceCount >>= i1;
            i5 = 1;
            while (++i5 < 5) {
                i4 = i1;
                i4 *= (int)l;
            }
            i >>>= i3;
            by -= (byte)Test.iFld;
            i4 = Test.iFld;
        }
        vMeth1_check_sum += i + i1 + l + i2 + i3 + i4 + Double.doubleToLongBits(d) + i5 + by +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth() {

        double d1=-2.2349;
        int i6=-30605, i7=1, iArr[]=new int[N];
        float f=2.582F;
        boolean bArr1[][]=new boolean[N][N];

        FuzzerUtils.init(iArr, 12);
        FuzzerUtils.init(bArr1, true);

        vMeth1(Test.iFld, Test.iFld);
        iArr[(Test.iFld >>> 1) % N] += (int)d1;
        Test.instanceCount += Test.iFld;
        Test.iFld *= 174;
        Test.instanceCount += Test.iFld;
        bArr1[(-5 >>> 1) % N][(Test.iFld >>> 1) % N] = Test.bFld;
        Test.instanceCount *= Test.iFld;
        Test.iFld += 31;
        iArr[(Test.iFld >>> 1) % N] -= Test.iFld;
        for (i6 = 2; i6 < 151; ++i6) {
            f = 1;
            do {
                Test.iFld >>= i7;
            } while (++f < 11);
            if (Test.bFld) continue;
            Test.iFld += (i6 * i6);
            if (Test.bFld) break;
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + i6 + i7 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr)
            + FuzzerUtils.checkSum(bArr1);
    }

    public static void vSmallMeth() {


        vMeth();
        vSmallMeth_check_sum += 0;
    }

    public void mainTest(String[] strArr1) {

        int i8=119, i9=-48061, i10=219, i11=11, i12=1, i13=-44, i14=-38158, i15=-63, i16=-11339, i17=45632, i18=4;
        double d2=2.102009;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -168L);

        for (int smallinvoc=0; smallinvoc<622; smallinvoc++) vSmallMeth();
        for (i8 = 5; i8 < 145; ++i8) {
            iArrFld[i8 + 1] = Test.iFld;
            for (i10 = i8; i10 < 179; ++i10) {
                i11 >>= Test.iFld;
            }
            try {
                i9 = (iArrFld[i8] / i9);
                iArrFld[i8] = (-254 / iArrFld[i8 - 1]);
                i12 = (-79 / Test.iFld);
            } catch (ArithmeticException a_e) {}
            Test.iFld = i10;
            for (i13 = 7; i13 < 179; i13++) {
                lArr[i8 + 1] += Test.instanceCount;
                i9 += i13;
                for (i15 = 1; i15 < 2; i15++) {
                    Test.bFld = Test.bFld;
                    try {
                        i12 = (i11 % i9);
                        i14 = (iArrFld[i8 + 1] % i11);
                        i16 = (iArrFld[i13] / i14);
                    } catch (ArithmeticException a_e) {}
                    i12 = i12;
                    fFld -= (float)d2;
                }
                fFld += (i13 * i13);
                i9 += i11;
                i12 <<= (int)Test.instanceCount;
                switch (((i13 % 2) * 5) + 108) {
                case 109:
                    Test.iFld -= i9;
                    switch ((i13 % 1) + 61) {
                    case 61:
                        for (i17 = i8; i17 < 2; i17++) {
                            iArrFld[i8] *= i15;
                            i12 = (int)10L;
                        }
                        break;
                    }
                    break;
                case 117:
                    iArrFld[i13 - 1] += Test.sFld;
                    break;
                default:
                    d2 += Test.instanceCount;
                    i12 *= Test.iFld;
                }
            }
            i18 += (int)Test.instanceCount;
            i16 = (int)-43.115017;
            i14 |= (int)Test.instanceCount;
        }

        FuzzerUtils.out.println("i8 i9 i10 = " + i8 + "," + i9 + "," + i10);
        FuzzerUtils.out.println("i11 i12 i13 = " + i11 + "," + i12 + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("d2 i17 i18 = " + Double.doubleToLongBits(d2) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.iFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.iFld);
        FuzzerUtils.out.println("fFld Test.sFld iArrFld = " + Float.floatToIntBits(fFld) + "," + Test.sFld + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
