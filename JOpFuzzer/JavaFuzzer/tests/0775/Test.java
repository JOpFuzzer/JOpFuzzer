// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:58 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=59L;
    public static double dFld=-70.48681;
    public static int iFld=-6;
    public static volatile int iFld1=-12;
    public boolean bFld=false;
    public volatile long lArrFld[]=new long[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(double d, long l, short s) {

        int i4=9, i5=-11060, i6=46430, i7=38502;
        byte by=-69;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 82L);

        lArr[(Test.iFld >>> 1) % N] = lArr[(Test.iFld >>> 1) % N];
        for (i4 = 349; i4 > 7; i4--) {
            Test.iFld = (int)l;
            Test.instanceCount <<= i4;
        }
        Test.dFld *= i4;
        for (i6 = 7; i6 < 202; i6++) {
            Test.iFld *= i4;
            l ^= i5;
            s ^= (short)i6;
            i5 += by;
            Test.iFld = (int)Test.dFld;
            Test.iFld -= (int)d;
            Test.iFld = i6;
            Test.instanceCount <<= i5;
            Test.iFld = i5;
        }
        long meth_res = Double.doubleToLongBits(d) + l + s + i4 + i5 + i6 + i7 + by + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3) {

        short s1=28185;
        byte by1=-44;
        int iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 56167);

        i3 = iMeth1(0.69742, Test.instanceCount, s1);
        by1 = (byte)11;
        iArr1[(Test.iFld >>> 1) % N] -= (int)Test.instanceCount;
        vMeth_check_sum += i3 + s1 + by1 + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        int i1=-63, i2=14, i8=14, i9=11, i10=-6, iArr[][]=new int[N][N];
        byte by2=-10;
        short s2=-12405;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr, 40005);
        FuzzerUtils.init(lArr1, 33833L);

        Test.dFld += ((++iArr[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N]) * ((Test.iFld + -14782) - (Test.iFld++)));
        for (i1 = 4; i1 < 143; i1 += 3) {
            vMeth(i2);
            iArr[i1 + 1] = FuzzerUtils.int1array(N, (int)-98);
        }
        i8 = 226;
        do {
            Test.iFld = (int)Test.instanceCount;
            i2 = by2;
            for (i9 = 20; i9 > i8; i9 -= 3) {
                i10 += (i9 - i8);
                i10 <<= i2;
                i10 -= 13;
                Test.iFld >>>= Test.iFld;
                Test.iFld1 |= i10;
                i10 -= s2;
                lArr1[i9 + 1] = lArr1[i9 - 1];
            }
        } while ((i8 -= 3) > 0);
        long meth_res = i1 + i2 + i8 + by2 + i9 + i10 + s2 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-221, i11=10, i12=6, i13=35331, i14=-7, i15=62799, i16=-221, i17=83, i18=-196, iArr2[]=new int[N];
        float f=-52.400F, f1=-17.142F;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr2, 165);
        FuzzerUtils.init(dArr, -1.109041);

        i = (int)Math.min(iMeth() - i, Test.instanceCount);
        for (i11 = 8; 165 > i11; i11++) {
            for (i13 = 7; i13 < 160; ++i13) {
                i14 += i13;
                for (f = 1; 2 > f; f++) {
                    Test.instanceCount <<= i16;
                    switch (((i11 % 5) * 5) + 33) {
                    case 47:
                    case 40:
                        Test.iFld += 8;
                        Test.instanceCount = i12;
                        lArrFld[(i11 >>> 1) % N] = Test.iFld;
                        Test.instanceCount = 14;
                        break;
                    case 45:
                        f1 = f;
                        i += (int)f;
                        break;
                    case 55:
                        i *= Test.iFld;
                    case 53:
                        i15 -= -6;
                        f1 = Test.iFld1;
                        Test.instanceCount *= i14;
                        break;
                    }
                }
                for (i17 = 1; 2 > i17; i17 += 2) {
                    f1 = i13;
                    i = (int)Test.instanceCount;
                    i = Test.iFld1;
                    iArr2[i11] -= -5;
                }
                Test.instanceCount += (long)f;
                i15 = 244;
                if (bFld) {
                    i15 -= i17;
                }
                i18 ^= (int)Test.instanceCount;
            }
            dArr[(i11 >>> 1) % N] += 126.121690;
            Test.dFld -= f;
            f1 -= Test.instanceCount;
        }

        FuzzerUtils.out.println("i i11 i12 = " + i + "," + i11 + "," + i12);
        FuzzerUtils.out.println("i13 i14 f = " + i13 + "," + i14 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i15 i16 f1 = " + i15 + "," + i16 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i17 i18 iArr2 = " + i17 + "," + i18 + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.iFld1 bFld lArrFld = " + Test.iFld1 + "," + (bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}