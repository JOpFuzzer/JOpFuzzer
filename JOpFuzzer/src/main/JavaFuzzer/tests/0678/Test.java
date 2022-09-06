// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-28L;
    public static int iFld=34;
    public static double dFld=-1.37781;
    public static float fFld=14.5F;
    public static byte byFld=120;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -205);
        FuzzerUtils.init(Test.byArrFld, (byte)84);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i2=-235, i3=0, i4=12996, i5=236, i6=3956, i7=5, iArr[]=new int[N];
        double d=-96.10457;

        FuzzerUtils.init(iArr, -2);

        Test.instanceCount &= i2;
        i2 <<= i2;
        i3 = 1;
        do {
            for (i4 = 1; i4 < 10; ++i4) {
                Test.instanceCount = i4;
                iArr[i3 - 1] <<= i5;
                iArr[i3 + 1] -= (int)Test.instanceCount;
                i5 += Test.iFld;
                for (i6 = i4; i6 < 2; i6++) {
                    if (i5 != 0) {
                        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    Test.iFld = (int)Test.instanceCount;
                    i2 += (int)d;
                    i5 ^= i6;
                    Test.instanceCount += i4;
                    Test.instanceCount *= (long)20.629F;
                }
            }
        } while (++i3 < 151);
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(int i1) {

        int i9=0, i10=-11, i11=6062, iArr1[]=new int[N];
        float f=-1.819F, fArr[]=new float[N];
        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr1, 0);
        FuzzerUtils.init(lArr, -1L);
        FuzzerUtils.init(sArr, (short)31779);
        FuzzerUtils.init(fArr, -99.730F);

        vMeth();
        for (int i8 : iArr1) {
            Test.dFld -= i8;
            Test.iFld = i8;
            lArr[(236 >>> 1) % N] = 1424;
            Test.iFld = (int)Test.instanceCount;
            i8 = Test.iFld;
        }
        i9 = 1;
        do {
            for (i10 = i9; i10 < 5; i10++) {
                sArr[i9] += (short)i9;
                i1 += i10;
                switch (((i9 % 6) * 5) + 84) {
                case 93:
                    i1 = (int)f;
                    i1 += (i10 | (long)f);
                    i11 = (int)-6L;
                    break;
                case 105:
                    iArr1[i10 + 1] >>= (int)Test.instanceCount;
                    break;
                case 89:
                    iArr1 = iArr1;
                    break;
                case 106:
                    iArr1[i10] = Test.iFld;
                    break;
                case 109:
                    fArr[i9 + 1] *= -2.618F;
                    break;
                case 98:
                    f = i11;
                }
            }
        } while (++i9 < 353);
        long meth_res = i1 + i9 + i10 + i11 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(boolean b) {


        Test.instanceCount *= (iMeth1(-186) * Test.instanceCount);
        Test.instanceCount *= Test.iFld;
        Test.instanceCount = Test.iFld;
        for (int i12 : Test.iArrFld) {
            Test.instanceCount += Test.iFld;
            Test.iFld /= (int)(Test.iFld | 1);
        }
        long meth_res = (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=106, i13=-14, i14=-80, i15=-54622, i16=95, i17=-2, i18=-8;
        boolean b1=true;
        double d1=115.39523;
        short s=-16719;

        i = (int)((long)(iMeth(b1) * Test.fFld) & i);
        i13 = 1;
        do {
            i14 = 1;
            while (++i14 < 104) {
                i15 = 1;
                do {
                    Test.byArrFld[i15] = (byte)28837;
                    i -= (int)Test.fFld;
                } while (++i15 < 1);
                i -= (int)-71.128781;
                for (i16 = i13; i16 < 1; i16++) {
                    long l=-9L;
                    Test.iArrFld[i16 + 1] = (int)l;
                    switch ((((i14 >>> 1) % 10) * 5) + 53) {
                    case 57:
                        Test.iArrFld[i13] = (int)Test.instanceCount;
                        Test.iFld += (int)Test.instanceCount;
                        Test.bArrFld[i14] = false;
                    case 94:
                        i17 = (int)Test.instanceCount;
                        i = i14;
                        break;
                    case 76:
                        Test.iFld -= (int)Test.instanceCount;
                        l = i14;
                        Test.iFld = -46272;
                        Test.iFld = i16;
                        break;
                    case 56:
                        Test.byFld ^= (byte)3985352833L;
                        Test.iFld *= i16;
                        Test.fFld += (180 + (i16 * i16));
                        break;
                    case 78:
                        Test.iArrFld = Test.iArrFld;
                        Test.instanceCount *= (long)d1;
                        Test.iFld += i16;
                        break;
                    case 103:
                        s += (short)i16;
                        i18 = i13;
                        break;
                    case 74:
                        Test.fFld = i13;
                        Test.iFld &= (int)Test.instanceCount;
                        i >>= 8;
                        break;
                    case 64:
                        i -= (int)Test.fFld;
                        break;
                    case 67:
                        Test.fFld *= i18;
                    case 93:
                        Test.fFld += -140;
                    }
                }
            }
        } while (++i13 < 242);

        FuzzerUtils.out.println("i b1 i13 = " + i + "," + (b1 ? 1 : 0) + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 d1 s = " + i17 + "," + Double.doubleToLongBits(d1) + "," + s);
        FuzzerUtils.out.println("i18 = " + i18);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld Test.byFld Test.iArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Test.byFld + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.byArrFld Test.bArrFld = " + FuzzerUtils.checkSum(Test.byArrFld) + "," +
            FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
