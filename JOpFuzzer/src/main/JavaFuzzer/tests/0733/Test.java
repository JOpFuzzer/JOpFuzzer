// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:57 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=6260899091281519958L;
    public static byte byFld=-81;
    public static int iFld=-58980;
    public float fFld=38.189F;
    public int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(boolean b) {

        short s=-970;

        s -= (short)Test.iFld;
        vMeth_check_sum += (b ? 1 : 0) + s;
    }

    public static int iMeth1(int i6) {

        boolean b1=false;
        int i7=54819, i8=-5, i9=-18191, i10=11;
        double d2=-2.41824;
        float f1=27.760F;

        vMeth(b1);
        i6 -= (int)Test.instanceCount;
        for (i7 = 3; i7 < 130; ++i7) {
            for (i9 = 1; i9 < 12; i9++) {
                switch (((i9 % 2) * 5) + 67) {
                case 71:
                    d2 *= 8;
                    break;
                case 73:
                    f1 = i6;
                    Test.iFld += (((i9 * Test.iFld) + i10) - i8);
                    break;
                default:
                    i8 >>= i9;
                    i6 -= 13;
                }
                Test.instanceCount += i7;
                i10 += i9;
                i8 >>= (int)Test.instanceCount;
                Test.instanceCount += i9;
                i6 = i7;
            }
        }
        long meth_res = i6 + (b1 ? 1 : 0) + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        double d=-48.106759, d1=-124.129016;
        int i1=14, i2=-246, i3=-148, i4=-14, i5=5362, i11=55, i12=7;
        float f=-1.332F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.317F);

        for (d = 14; 266 > d; d++) {
            i1 += (int)(((d * i1) + f) - Test.instanceCount);
            for (i2 = 1; i2 < 6; i2++) {
                i3 += (((i2 * Test.instanceCount) + i1) - i3);
                for (i4 = 1; 2 > i4; i4 += 2) {
                    d1 = (((i4 * Test.instanceCount) + fArr[i2 + 1]) - (-(fArr[i4]--)));
                    i1 += i4;
                    i5 = iMeth1(Test.iFld);
                    Test.instanceCount = i5;
                }
                f = i3;
                for (i11 = 2; i11 > 1; i11 -= 2) {
                    i5 = i3;
                    f += (i11 + Test.byFld);
                }
                Test.instanceCount *= i1;
            }
            i12 = i5;
        }
        long meth_res = Double.doubleToLongBits(d) + i1 + Float.floatToIntBits(f) + i2 + i3 + i4 + i5 +
            Double.doubleToLongBits(d1) + i11 + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i13=-12, i14=1, i15=-15115, i16=33242, i17=-2, i18=-1;
        short s1=-23031;
        double d3=-1.121559;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 1.904F);

        i = 1;
        while (++i < 291) {
            Test.byFld <<= (byte)(iArrFld[i + 1]--);
        }
        Test.iFld = (int)((++Test.instanceCount) / (Math.max(iMeth(), 118) | 1));
        for (i13 = 9; i13 < 225; i13++) {
            i15 = 116;
            do {
                for (i16 = 2; i15 < i16; i16 -= 3) {
                    boolean b2=false;
                    if (b2) {
                        iArrFld[i13 + 1] |= 16801;
                        switch (((i16 % 4) * 5) + 14) {
                        case 22:
                            Test.iFld += i16;
                            dArrFld[i16] *= fFld;
                            iArrFld[i15 - 1] -= i;
                        case 16:
                            fArr1 = fArr1;
                        case 26:
                            i14 <<= (int)Test.instanceCount;
                            break;
                        case 18:
                            Test.iFld >>= i;
                            try {
                                i18 = (i13 / -560245524);
                                iArrFld[i15 - 1] = (11 % i);
                                i17 = (i14 % i15);
                            } catch (ArithmeticException a_e) {}
                            i18 -= (int)fFld;
                            break;
                        default:
                            i17 = (int)fFld;
                            i14 -= Test.byFld;
                            i18 = 45496;
                        }
                        iArrFld[i15 + 1] += s1;
                        Test.instanceCount >>>= Test.iFld;
                    } else if (b2) {
                        Test.iFld *= (int)11L;
                        i14 += (int)d3;
                        fFld *= i;
                        s1 = (short)i;
                    } else {
                        i18 += (i16 * fFld);
                        i14 = i13;
                        fFld = i16;
                        Test.instanceCount += i16;
                    }
                }
            } while ((i15 -= 2) > 0);
        }

        FuzzerUtils.out.println("i i13 i14 = " + i + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 s1 d3 = " + i18 + "," + s1 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.iFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Test.iFld);
        FuzzerUtils.out.println("fFld iArrFld dArrFld = " + Float.floatToIntBits(fFld) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

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
