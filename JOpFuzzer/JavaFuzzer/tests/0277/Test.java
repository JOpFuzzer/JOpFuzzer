// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:47 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=2310L;
    public static double dFld=2.76298;
    public static volatile float fFld=-2.353F;
    public static int iFld=-6;
    public static double dArrFld[]=new double[N];
    public static float fArrFld[]=new float[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -14.124644);
        FuzzerUtils.init(Test.fArrFld, 0.1014F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3, long l, int i4) {

        boolean b1=false;
        int i5=-169, i6=14, i7=-215, i8=-57455, i9=8104;
        double d1=58.55121;

        b1 = b1;
        i4 = (int)Test.dFld;
        for (i5 = 390; i5 > 11; i5--) {
            for (i7 = 1; 4 > i7; ++i7) {
                Test.fFld = Test.fFld;
                if (i8 != 0) {
                }
                Test.dFld *= i7;
                Test.dFld = -48279;
                i3 = (int)l;
                Test.dArrFld[i5 - 1] = 9;
            }
            i3 += (i5 * Test.instanceCount);
            Test.fArrFld[i5] *= (float)Test.dFld;
            for (d1 = 1; d1 < 4; d1++) {
                i9 = i6;
                i4 = (int)l;
            }
        }
        long meth_res = i3 + l + i4 + (b1 ? 1 : 0) + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d1) + i9;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f1, int i1, int i2) {

        long l1=63546L;
        int i10=-193, i12=31430, i13=-13, i14=-1, i15=165, iArr[]=new int[N];
        float f2=22.1018F;
        short s=-20100;

        FuzzerUtils.init(iArr, 91);

        iArr[(i1 >>> 1) % N] *= (int)f1;
        Test.dFld += (i2 - ((Test.dFld * 50044) + (-i1)));
        i2 = (-iMeth(i1, Test.instanceCount, i2));
        iArr[(-13482 >>> 1) % N] -= (int)Test.dFld;
        iArr[(i2 >>> 1) % N] <<= (int)1300376175L;
        i1 >>= (int)Test.instanceCount;
        for (l1 = 9; l1 < 282; ++l1) {
            byte by=17;
            switch (((i2 >>> 1) % 8) + 47) {
            case 47:
                i2 += (int)(((l1 * i1) + l1) - i2);
                iArr[(int)(l1 - 1)] = i2;
                for (i12 = 1; i12 < 6; i12++) {
                    i1 -= (int)-1.75606;
                    for (i14 = i12; i14 < 2; ++i14) {
                        f2 -= i1;
                        s += (short)i14;
                    }
                }
                break;
            case 48:
                i10 += (int)l1;
            case 49:
                i13 <<= i1;
                break;
            case 50:
            case 51:
                Test.fFld += f1;
                break;
            case 52:
                Test.instanceCount -= by;
                break;
            case 53:
                Test.instanceCount += (l1 * l1);
                break;
            case 54:
                i2 <<= i10;
            default:
                i15 += (int)Test.instanceCount;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i1 + i2 + l1 + i10 + i12 + i13 + i14 + i15 +
            Float.floatToIntBits(f2) + s + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(float f, int i, boolean b) {

        short s1=26197;

        vMeth(-1.139F, i, i);
        i += s1;
        vSmallMeth_check_sum += Float.floatToIntBits(f) + i + (b ? 1 : 0) + s1;
    }

    public void mainTest(String[] strArr1) {

        int i17=54, i18=-13, i19=-105, i20=-23296, i21=-8, i22=-11, i23=153, iArr1[][]=new int[N][N];
        short s2=-31455;
        long l2=74L;

        FuzzerUtils.init(iArr1, 32);

        for (int smallinvoc=0; smallinvoc<730; smallinvoc++) vSmallMeth(Test.fFld, i17, false);
        Test.fFld = i17;
        Test.fFld *= i17;
        i18 = 1;
        while (++i18 < 122) {
            i17 += i17;
            for (i19 = 12; i19 < 205; i19++) {
                i17 += i19;
                i21 = i17;
                s2 += (short)382598802088181859L;
                for (i22 = i18; i22 < 2; ++i22) {
                    i23 <<= i20;
                    i20 += i18;
                    i21 -= (int)Test.instanceCount;
                    i23 += (i22 * s2);
                }
                i23 += (i19 * i19);
                lArrFld[i18] &= Test.instanceCount;
                l2 = 1;
                while (++l2 < 2) {
                    iArr1[(int)(l2 + 1)] = iArr1[(int)(l2)];
                    Test.fFld += i19;
                    i20 -= (int)-45504L;
                    Test.dFld += i20;
                    Test.instanceCount += (((l2 * Test.instanceCount) + i22) - i21);
                    switch ((i19 % 7) + 22) {
                    case 22:
                        i17 *= -22322;
                        i20 = i21;
                        i20 = 13;
                        break;
                    case 23:
                        i21 = -62689;
                        i23 = i20;
                        i17 += (int)1.457F;
                    case 24:
                        i23 >>>= i19;
                        break;
                    case 25:
                        i21 = (int)Test.instanceCount;
                        break;
                    case 26:
                        Test.iFld *= (int)l2;
                    case 27:
                        i21 -= i19;
                        break;
                    case 28:
                        try {
                            i20 = (13612 % i17);
                            i17 = (41128 % i18);
                            i17 = (-23872 / i19);
                        } catch (ArithmeticException a_e) {}
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 s2 = " + i20 + "," + i21 + "," + s2);
        FuzzerUtils.out.println("i22 i23 l2 = " + i22 + "," + i23 + "," + l2);
        FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.fFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld Test.dArrFld Test.fArrFld = " + Test.iFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}