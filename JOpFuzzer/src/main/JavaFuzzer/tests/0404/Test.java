// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:50 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static float fFld=0.797F;
    public static int iFld=9;
    public volatile long lFld=0L;
    public static volatile boolean bFld=false;
    public float fArrFld[]=new float[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1025857040L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, double d) {


        Test.instanceCount <<= Test.iFld;
        vMeth1_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d);
    }

    public static int iMeth() {

        double d1=80.69313;
        int i2=16, i3=30510, i4=-15648, i5=-173;
        byte by=52;

        vMeth1(125.35F, d1);
        Test.iFld = Test.iFld;
        Test.iFld |= (int)Test.instanceCount;
        d1 *= Test.iFld;
        for (i2 = 293; i2 > 12; i2 -= 3) {
            Test.instanceCount += i2;
            switch (((i2 % 2) * 5) + 61) {
            case 70:
                Test.iFld += (i2 * i2);
                break;
            case 62:
                Test.instanceCount += (((i2 * Test.iFld) + Test.instanceCount) - i3);
                Test.instanceCount = i3;
            }
            for (i4 = i2; i4 < 17; i4++) {
                i3 -= (int)Test.instanceCount;
                i5 = -11;
                i3 += i5;
                Test.iFld += (((i4 * by) + i2) - i4);
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i2 + i3 + i4 + i5 + by;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1) {

        short s=-8659;
        int i6=198, i7=-23287, i8=-15966, i9=86, iArr[]=new int[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(byArr, (byte)-23);

        iArr = (iArr = (iArr = (iArr = iArr)));
        i += (s--);
        Test.instanceCount = (((--i) * iMeth()) * Test.iFld);
        iArr[(Test.iFld >>> 1) % N] = i1;
        iArr[(Test.iFld >>> 1) % N] ^= 6;
        i = (int)Test.instanceCount;
        for (i6 = 16; i6 < 290; ++i6) {
            for (i8 = 1; i8 < 6; i8++) {
                Test.fFld += -24;
                iArr = iArr;
                if (i6 != 0) {
                    vMeth_check_sum += i + i1 + s + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr) +
                        FuzzerUtils.checkSum(byArr);
                    return;
                }
                iArr = FuzzerUtils.int1array(N, (int)-28093);
                if (i6 != 0) {
                    vMeth_check_sum += i + i1 + s + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr) +
                        FuzzerUtils.checkSum(byArr);
                    return;
                }
            }
            Test.iFld += i6;
            byArr = byArr;
        }
        vMeth_check_sum += i + i1 + s + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i10=-21880, i11=49993, i12=-60, i13=13597, i14=-8, i15=-8, i16=-44269, i17=-11013, i18=9, i19=22,
            iArr1[]=new int[N];
        boolean b=true;
        double d2=-1.88398;
        float f1=-90.827F, f2=-2.221F;

        FuzzerUtils.init(iArr1, 203);

        fArrFld[(7 >>> 1) % N] = Test.fFld;
        vMeth(181, Test.iFld);
        for (i10 = 6; i10 < 205; ++i10) {
            Test.iFld += (((i10 * i10) + Test.iFld) - lFld);
            Test.instanceCount = i10;
            i11 >>>= (int)Test.instanceCount;
        }
        b = Test.bFld;
        i11 = (int)76.793F;
        for (i12 = 5; 197 > i12; i12++) {
            Test.iFld = (int)lFld;
            lFld -= Test.iFld;
            for (i14 = 4; i14 < 131; ++i14) {
                iArr1[i14] *= (int)d2;
                Test.iFld = i10;
                Test.instanceCount -= Test.instanceCount;
                Test.iFld += (i14 * i14);
            }
            i16 = 1;
            while (++i16 < 131) {
                i15 = 22585;
                i13 += i16;
                i15 -= (int)-2.608F;
            }
            for (i17 = 8; i17 < 131; ++i17) {
                i11 = 32876;
                Test.instanceCount += (i17 ^ i13);
                Test.instanceCount <<= i13;
                Test.instanceCount += (i17 ^ Test.iFld);
                for (f1 = i12; f1 < 2; f1++) {
                    fArrFld = fArrFld;
                    iArr1 = FuzzerUtils.int1array(N, (int)14);
                    f2 %= 25748;
                    Test.lArrFld[(int)(f1 - 1)][i17] -= i14;
                }
            }
        }

        FuzzerUtils.out.println("i10 i11 b = " + i10 + "," + i11 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 d2 i16 = " + i15 + "," + Double.doubleToLongBits(d2) + "," + i16);
        FuzzerUtils.out.println("i17 i18 f1 = " + i17 + "," + i18 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i19 f2 iArr1 = " + i19 + "," + Float.floatToIntBits(f2) + "," +
            FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("lFld Test.bFld fArrFld = " + lFld + "," + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
