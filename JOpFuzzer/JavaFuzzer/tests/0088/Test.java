// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=9L;
    public static boolean bFld=true;
    public static double dFld=-41.3683;
    public static byte byFld=74;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(float f, int i5, long l) {

        int i6=-25132, i7=-4, i8=-5, i9=78, iArr[]=new int[N];
        long l1=-184L;
        byte by=113;

        FuzzerUtils.init(iArr, 64026);

        i6 = 387;
        while (--i6 > 0) {
            for (i7 = 4; i7 > 1; i7--) {
                i8 <<= 13;
                l += (24753L + (i7 * i7));
                for (l1 = 1; l1 < 2; l1++) {
                    i8 += (int)l1;
                    l -= i7;
                    i9 >>= -16249;
                }
                switch ((i7 % 1) + 116) {
                case 116:
                    i9 += (((i7 * i5) + i7) - i7);
                    Test.instanceCount >>= by;
                    break;
                }
                iArr[i7 + 1] >>= (int)l1;
                if (Test.bFld) continue;
                Test.instanceCount = i8;
                i5 += (((i7 * l) + i5) - i5);
            }
        }
        long meth_res = Float.floatToIntBits(f) + i5 + l + i6 + i7 + i8 + l1 + i9 + by + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, int i4) {


        i4 >>= (i4 | iMeth1(2.378F, i4, Test.instanceCount));
        i3 *= i4;
        vMeth_check_sum += i3 + i4;
    }

    public static int iMeth(int i2) {

        int i10=-72, i11=26211, i12=54, i13=49418, iArr1[][]=new int[N][N];
        float f1=89.160F;
        long l2=6242943937848405136L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -55327L);
        FuzzerUtils.init(iArr1, -5);

        Test.instanceCount *= (long)-110.68910;
        vMeth(20912, i2);
        for (i10 = 8; 340 > i10; ++i10) {
            f1 = i2;
            i12 = 1;
            do {
                for (l2 = i10; l2 < 1; ++l2) {
                    i2 -= i2;
                    lArr[i10] *= Test.instanceCount;
                    lArr[(int)(l2 + 1)] = l2;
                    i2 += i11;
                    i13 ^= -3;
                    f1 = Test.instanceCount;
                    i2 = i2;
                    Test.instanceCount += (4 + (l2 * l2));
                }
                iArr1[i10 - 1][i12 - 1] += i12;
            } while (++i12 < 5);
        }
        long meth_res = i2 + i10 + i11 + Float.floatToIntBits(f1) + i12 + l2 + i13 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-11, i1=43, i14=-9, i15=0, i16=1477, i17=-9, i18=233, i19=10, iArr2[][]=new int[N][N];
        float f2=-112.766F, fArr[]=new float[N];
        short s=12842;
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr, -122.54F);
        FuzzerUtils.init(lArr1, 6497947123825591179L);
        FuzzerUtils.init(iArr2, 41);

        i = 1;
        do {
            i1 *= ((iMeth(-11) - i1) + -21632);
        } while (++i < 339);
        i14 = 1;
        while (++i14 < 304) {
            for (i15 = 2; i15 < 83; ++i15) {
                for (i17 = i15; i17 < 2; ++i17) {
                    i1 += (i17 * i17);
                    f2 += i17;
                    i1 += i18;
                    fArr[i17 + 1] += i18;
                }
                Test.instanceCount *= i14;
                Test.dFld = Test.dFld;
                f2 -= i15;
                i19 = 1;
                while (++i19 < 2) {
                    i16 = i17;
                    s -= (short)i1;
                    i16 >>= 8;
                    lArr1[i14 - 1] >>= i17;
                    i16 += i19;
                    i16 >>= i1;
                    if (Test.bFld) continue;
                    Test.bFld = Test.bFld;
                    i1 >>>= i;
                    i18 += (((i19 * i17) + s) - Test.byFld);
                }
                Test.instanceCount = 8;
                i18 &= i;
                i18 -= (int)Test.instanceCount;
                i18 = 14;
                i18 %= (int)(Test.instanceCount | 1);
            }
            iArr2[i14 + 1][i14 - 1] = i16;
            i16 -= (int)Test.dFld;
        }

        FuzzerUtils.out.println("i i1 i14 = " + i + "," + i1 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 f2 i19 = " + i18 + "," + Float.floatToIntBits(f2) + "," + i19);
        FuzzerUtils.out.println("s fArr lArr1 = " + s + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + ","
            + FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.dFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.byFld = " + Test.byFld);

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