// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8L;
    public int iFld=-2;
    public static int iFld1=-8963;
    public static float fFld=-1.969F;
    public static float fFld1=68.619F;
    public static byte byFld=87;
    public static double dFld=-1.34066;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -13);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        long l1=1625132339L;
        int i4=4, i5=18289, i6=-1, i7=12, i8=3, i9=2483, i10=-20285, iArr1[]=new int[N];
        boolean b=true;
        double d1=-9.83318;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)26644);
        FuzzerUtils.init(iArr1, 11665);

        for (l1 = 13; l1 < 208; l1++) {
            i4 >>= i4;
            sArr[(int)(l1 + 1)] |= (short)Test.iFld1;
        }
        for (i5 = 6; 221 > i5; i5++) {
            if (b) continue;
        }
        iArr1[(i4 >>> 1) % N] = (int)Test.instanceCount;
        for (i7 = 13; i7 < 249; i7++) {
            try {
                i8 = (i5 % 101);
                i6 = (i8 % Test.iFld1);
                i4 = (iArr1[i7 + 1] % 55);
            } catch (ArithmeticException a_e) {}
            i8 = (int)d1;
            for (i9 = 7; i9 > 1; --i9) {
                switch ((((i9 >>> 1) % 5) * 5) + 67) {
                case 81:
                    switch ((i7 % 1) + 102) {
                    case 102:
                        Test.instanceCount += (((i9 * i5) + Test.instanceCount) - Test.fFld);
                        Test.iFld1 = -10;
                        break;
                    default:
                        i6 += i9;
                    }
                    break;
                case 70:
                    i4 = (int)Test.instanceCount;
                case 69:
                    Test.instanceCount += i7;
                    break;
                case 79:
                    if (false) continue;
                    break;
                case 80:
                    Test.fFld -= i6;
                    break;
                }
            }
        }
        long meth_res = l1 + i4 + i5 + i6 + (b ? 1 : 0) + i7 + i8 + Double.doubleToLongBits(d1) + i9 + i10 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        float f1=106.832F, f2=99.275F, fArr[]=new float[N];
        int i1=-12, i2=137, i3=-177;
        double d=-2.61768;
        short s=-21074;
        long l2=8L;

        FuzzerUtils.init(fArr, -58.289F);

        for (f1 = 4; f1 < 389; f1 += 2) {
            Test.instanceCount += (long)f1;
            Test.instanceCount *= (--i1);
            for (i2 = 1; i2 < 8; ++i2) {
                d /= (Test.instanceCount | 1);
                d += (lMeth() * i2);
                Test.iArrFld[i2 - 1] = s;
            }
            l2 = 1;
            do {
                fArr = fArr;
                i1 = (int)l2;
                i3 *= i2;
                Test.instanceCount >>= i1;
            } while (++l2 < 8);
        }
        d *= f2;
        i3 += i1;
        d -= 33662;
        vMeth_check_sum += Float.floatToIntBits(f1) + i1 + i2 + i3 + Double.doubleToLongBits(d) + s + l2 +
            Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(long l, float f) {

        int i=-24889, i11=4, i12=-153, i14=-135, i15=3, i16=-152, i17=44486, i18=44, i19=0, iArr[]=new int[N];
        double d2=-32.128373;
        short s1=10817;

        FuzzerUtils.init(iArr, -39);

        iArr[(3 >>> 1) % N] = (i--);
        vMeth();
        Test.iFld1 *= (int)d2;
        Test.iFld1 = i;
        for (i11 = 181; i11 > 9; i11 -= 3) {
            Test.fFld += Test.fFld1;
            s1 *= (short)Test.fFld;
            d2 -= Test.fFld;
        }
        for (i14 = 7; i14 < 219; i14 += 3) {
            Test.iFld1 |= (int)l;
        }
        for (i16 = 8; i16 < 314; i16++) {
            for (i18 = i16; 5 > i18; i18++) {
                i15 = (int)l;
                Test.byFld = (byte)i19;
                Test.fFld = 56378;
            }
        }
        long meth_res = l + Float.floatToIntBits(f) + i + Double.doubleToLongBits(d2) + i11 + i12 + s1 + i14 + i15 +
            i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i20=37006, i21=31284, i22=-26, i23=-58267, i24=-315, i25=18872, i26=-9;
        float f3=98.822F;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2401535798909118143L);

        Test.instanceCount = (++iFld);
        Test.instanceCount -= iMeth(Test.instanceCount, Test.fFld);
        iFld -= (int)2.211F;
        for (i20 = 20; i20 < 359; i20++) {
            for (i22 = 3; i22 < 74; i22++) {
                Test.dFld *= Test.fFld;
                lArr = lArr;
            }
            Test.instanceCount = i22;
            for (i24 = 1; i24 < 74; i24++) {
                Test.byFld += Test.byFld;
                switch ((i24 % 8) + 80) {
                case 80:
                    i23 += (i24 * i24);
                    break;
                case 81:
                    iFld += (int)-2.53598;
                    Test.byFld = (byte)i22;
                    for (f3 = 1; f3 < 2; ++f3) {
                        lArr[i24 - 1] += i26;
                        i21 = -123;
                        Test.dFld += Test.iFld1;
                        iFld *= i20;
                        i21 |= -18761;
                        Test.instanceCount |= i26;
                        i26 += (int)(f3 * Test.instanceCount);
                        i26 += i26;
                    }
                    Test.fFld -= 246L;
                    break;
                case 82:
                    if (b1) continue;
                case 83:
                    Test.fFld1 += Test.instanceCount;
                    Test.iArrFld[i20] *= i22;
                    Test.byFld <<= (byte)i25;
                    break;
                case 84:
                    Test.instanceCount = Test.instanceCount;
                    iFld <<= i24;
                case 85:
                    if (b1) continue;
                    break;
                case 86:
                    i21 += i24;
                    break;
                case 87:
                    i25 = Test.iFld1;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("f3 i26 b1 = " + Float.floatToIntBits(f3) + "," + i26 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.iFld1 = " + Test.instanceCount + "," + iFld + "," +
            Test.iFld1);
        FuzzerUtils.out.println("Test.fFld Test.fFld1 Test.byFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Float.floatToIntBits(Test.fFld1) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.dFld Test.iArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
