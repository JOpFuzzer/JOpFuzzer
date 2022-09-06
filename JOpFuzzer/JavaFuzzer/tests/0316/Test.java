// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-50373L;
    public static byte byFld=57;
    public static volatile long lFld=-5406657333678607415L;
    public static boolean bFld=true;
    public static volatile int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 50);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i7, float f, int i8) {

        long l1=41836L, lArr[]=new long[N];
        int i9=22, i10=-1888, i11=-9, i12=-203, i13=162, i14=38286;
        float f1=-2.843F, fArr[]=new float[N];
        short s=-31216;
        double d1=1.106107;

        FuzzerUtils.init(lArr, 213L);
        FuzzerUtils.init(fArr, -2.929F);

        for (l1 = 12; l1 < 321; l1++) {
            lArr[(int)(l1)] >>= i7;
            i9 -= i8;
            for (i10 = 1; 5 > i10; i10++) {
                i11 = i8;
            }
        }
        f -= i8;
        for (f1 = 7; f1 < 384; f1++) {
            Test.lFld *= i11;
            fArr[(int)(f1 - 1)] += i12;
            for (i13 = 1; i13 < 4; i13++) {
                Test.iArrFld[i13] = (int)Test.lFld;
                f = i13;
                Test.lFld = i13;
                Test.lFld >>= s;
                d1 = f1;
            }
        }
        vMeth_check_sum += i7 + Float.floatToIntBits(f) + i8 + l1 + i9 + i10 + i11 + Float.floatToIntBits(f1) + i12 +
            i13 + i14 + s + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static float fMeth(int i6, long l) {

        int i15=9, i16=6, i17=-3884, i18=19, i19=-29;
        boolean b=true;
        short s1=25658;

        vMeth(i6, 27.963F, i6);
        for (i15 = 8; i15 < 211; ++i15) {
            Test.iArrFld[i15] = i15;
            if (b) continue;
            i16 -= s1;
            try {
                i6 = (0 / i16);
                Test.iArrFld[i15 - 1] = (Test.iArrFld[i15] % 53419);
                i16 = (Test.iArrFld[i15] % i6);
            } catch (ArithmeticException a_e) {}
            i6 = i6;
            i17 = 1;
            while (++i17 < 8) {
                for (i18 = 1; i18 < 1; i18++) {
                    if (i17 != 0) {
                    }
                    i16 = i6;
                    Test.bArrFld[i15 - 1] = Test.bFld;
                    i16 = i19;
                    Test.lFld += Test.instanceCount;
                    i16 += (int)Test.lFld;
                }
            }
        }
        long meth_res = i6 + l + i15 + i16 + (b ? 1 : 0) + s1 + i17 + i18 + i19;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth(int i, int i1) {

        double d=51.101721, d2=2.107229;
        int i2=90, i3=11, i4=60156, i5=107;
        float f2=0.175F;

        for (d = 3; d < 267; ++d) {
            i3 = 1;
            do {
                short s2=-13237;
                for (i4 = 1; i4 < 1; ++i4) {
                    i2 += (int)(236L + (i4 * i4));
                }
                Test.byFld += (byte)(i3 | i);
                Test.iArrFld[i3] = (int)((fMeth(i2, Test.lFld) + i2) * 11);
                d2 += i2;
                f2 = i;
                switch ((i3 % 9) + 35) {
                case 35:
                    Test.iArrFld[(int)(d)] = (int)Test.instanceCount;
                    break;
                case 36:
                    d2 = Test.instanceCount;
                    Test.byFld |= (byte)10700;
                    i = i2;
                    s2 &= (short)i4;
                    break;
                case 37:
                    i *= (int)Test.instanceCount;
                case 38:
                    i = i3;
                case 39:
                    Test.lFld >>= Test.lFld;
                case 40:
                    f2 = i1;
                    break;
                case 41:
                    Test.lFld += i3;
                case 42:
                case 43:
                    d2 -= i3;
                    break;
                }
            } while (++i3 < 6);
        }
        long meth_res = i + i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d2) +
            Float.floatToIntBits(f2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i20=14, iArr[]=new int[N];
        double d3=2.74487, dArr[]=new double[N];

        FuzzerUtils.init(iArr, 10901);
        FuzzerUtils.init(dArr, 0.73152);

        iArr[(30051 >>> 1) % N] <<= (int)lMeth(i20, i20);
        Test.lFld = i20;
        iArr[(i20 >>> 1) % N] *= i20;
        dArr[(i20 >>> 1) % N] = d3;
        i20 -= -36;
        iArr[(i20 >>> 1) % N] = (int)Test.lFld;
        d3 -= Test.instanceCount;

        FuzzerUtils.out.println("i20 d3 iArr = " + i20 + "," + Double.doubleToLongBits(d3) + "," +
            FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.lFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Test.lFld);
        FuzzerUtils.out.println("Test.bFld Test.iArrFld Test.bArrFld = " + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}