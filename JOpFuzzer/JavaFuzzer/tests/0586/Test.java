// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:54 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1823945663715729453L;
    public static int iFld=12495;
    public static float fFld=1.198F;
    public double dFld=0.22055;
    public byte byFld=-66;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -250);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i7, int i8, int i9) {

        int i10=-51, i11=-96, i12=7;
        float f2=114.985F, f3=-1.747F;
        boolean b=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -22597L);

        for (i10 = 21; i10 < 383; ++i10) {
            lArr1[i10 + 1] &= Test.iFld;
            Test.instanceCount = i8;
            for (f2 = 1; f2 < 5; ++f2) {
                i7 += (-163 + (f2 * f2));
                Test.instanceCount += -65;
                Test.instanceCount += (long)(((f2 * i7) + i10) - f2);
                f3 = 1;
                while (++f3 < 2) {
                    i11 += (int)(f3 + Test.instanceCount);
                    b = b;
                    Test.iArrFld[(int)(f3 - 1)] = i12;
                    Test.iArrFld[(int)(f3)] += i8;
                    lArr1[(i12 >>> 1) % N] -= i12;
                }
                Test.iArrFld[i10] += 151;
                Test.iFld *= (int)Test.instanceCount;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f2) + i12 + Float.floatToIntBits(f3) + (b ? 1 :
            0) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(float f1, int i5, int i6) {

        byte by=-26;

        i6 = (--Test.iFld);
        Test.iArrFld[(252 >>> 1) % N] %= (int)(((long)(f1 -= (Test.instanceCount + iMeth(-29, 143, i5)))) | 1);
        by = (byte)i5;
        vMeth1_check_sum += Float.floatToIntBits(f1) + i5 + i6 + by;
    }

    public static void vMeth() {

        int i1=0, i2=-192, i3=60213, i4=20839;
        double d=-1.80494;
        short s=15401;

        Test.iFld += Math.min(++Test.iFld, Test.iFld);
        for (i1 = 3; i1 < 271; i1++) {
            for (i3 = 1; i3 < 6; i3++) {
                vMeth1(Test.fFld, i3, -9);
                d = 2;
                while (--d > 0) {
                    boolean b1=true;
                    double d1=-2.114262;
                    i4 = i1;
                    i4 /= (int)(i4 | 1);
                    Test.iFld += (int)(d * d);
                    Test.instanceCount += -2;
                    i2 -= -242;
                    i4 += (int)13L;
                    if (b1) break;
                    i2 |= i3;
                    d1 = i3;
                }
                Test.iArrFld[i1] = s;
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + s;
    }

    public void mainTest(String[] strArr1) {

        float f=-50.883F;
        int i=-140, i13=117, i14=-254, i15=-226, i16=-12, i17=-5, i18=5;
        long l=223L, lArr[]=new long[N];
        short s1=31565;
        double dArr[]=new double[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(lArr, 43454L);
        FuzzerUtils.init(dArr, 36.25875);
        FuzzerUtils.init(byArr, (byte)-92);

        f -= Long.reverseBytes(++lArr[(Test.iFld >>> 1) % N]);
        Test.iFld >>= Integer.reverseBytes(Test.iFld);
        i = 1;
        while (++i < 124) {
            Test.iFld = (-i);
            vMeth();
            Test.iFld = (int)Test.instanceCount;
            Test.iArrFld = Test.iArrFld;
            for (l = 9; l < 202; l++) {
                f += i13;
                Test.iFld *= (int)dFld;
                s1 += (short)(-3 + (l * l));
                i14 = 1;
                while (++i14 < 2) {
                    i13 ^= (int)Test.instanceCount;
                    Test.iFld *= (int)dFld;
                    Test.instanceCount *= (long)f;
                    dArr[i14] = -22245;
                    i13 += Test.iFld;
                    i13 = byFld;
                }
            }
            i15 = 1;
            while (++i15 < 202) {
                Test.iArrFld[i15 - 1] *= i15;
                i16 = 1;
                while (++i16 < 1) {
                    i13 -= i14;
                }
                for (i17 = i; i17 < 1; ++i17) {
                    switch (((i17 % 10) * 5) + 36) {
                    case 37:
                        Test.iArrFld[i] >>= i14;
                        i13 -= (int)f;
                        Test.iFld ^= (int)l;
                        break;
                    case 72:
                        Test.instanceCount += -8;
                        i18 -= i17;
                        s1 -= (short)i14;
                        break;
                    case 57:
                        i13 = i13;
                        break;
                    case 74:
                    case 38:
                        Test.iFld *= Test.iFld;
                        break;
                    case 42:
                        Test.iFld ^= (int)-2L;
                        break;
                    case 66:
                        Test.fFld += (i17 * i17);
                        break;
                    case 77:
                        i13 += (-145 + (i17 * i17));
                        break;
                    case 50:
                        byFld = (byte)Test.instanceCount;
                        break;
                    case 39:
                        byArr[i - 1] >>= (byte)i17;
                        break;
                    default:
                        Test.iArrFld[i15 + 1] = -40837;
                    }
                }
            }
        }

        FuzzerUtils.out.println("f i l = " + Float.floatToIntBits(f) + "," + i + "," + l);
        FuzzerUtils.out.println("i13 s1 i14 = " + i13 + "," + s1 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 lArr dArr = " + i18 + "," + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("dFld byFld Test.iArrFld = " + Double.doubleToLongBits(dFld) + "," + byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}