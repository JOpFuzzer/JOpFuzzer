// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:46 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=13L;
    public int iFld=185;
    public static short sFld=-17091;
    public static boolean bFld=false;
    public int iFld1=-1;
    public static byte byFld=-115;
    public int iFld2=35;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 11);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l) {

        int i2=-2, i3=-3059, i4=-33223, i5=-31282, i6=-9, i7=28634, i8=8;
        double d=-109.125436;
        float f1=-1.890F;

        for (i2 = 5; i2 < 183; i2++) {
            l = Test.sFld;
        }
        for (i4 = 149; 7 < i4; i4--) {
            i3 = -155;
            for (i6 = i4; i6 < 11; i6++) {
                Test.bFld = Test.bFld;
                i3 *= i5;
                for (d = 1; d < 1; ++d) {
                    i8 = (int)1.14377;
                    Test.iArrFld[i6] = i6;
                    Test.instanceCount += (long)(d + Test.instanceCount);
                    i7 = (int)l;
                    f1 /= -4;
                    i8 += (int)-1.859F;
                }
                Test.instanceCount += Test.instanceCount;
            }
        }
        long meth_res = l + i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + i8 + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {


        iMeth(Test.instanceCount);
        if (Test.bFld) {
            for (int i9 : Test.iArrFld) {
                try {
                    i9 = (i9 / 1857853983);
                    Test.iArrFld[(i9 >>> 1) % N] = (i9 % -20459);
                    Test.iArrFld[(i9 >>> 1) % N] = (63449 % i9);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth1_check_sum += 0;
    }

    public static void vMeth() {

        short s=-13461;
        int i1=-54400, i10=0, i11=-1, i12=-71, i13=-233, i14=1;
        float f=1.283F;
        double d1=0.125385;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -21560L);

        lArr[(150 >>> 1) % N][(62991 >>> 1) % N] += (((Test.instanceCount - s) + (--i1)) + Math.max((int)(f + i1),
            i1++));
        i1 |= (int)2152L;
        if (Test.bFld) {
            vMeth1();
            for (i10 = 10; i10 < 209; ++i10) {
                byte by=104;
                by += (byte)(i10 * i10);
                i11 = (int)Test.instanceCount;
            }
            for (i12 = 7; i12 < 353; ++i12) {
                if (i14 != 0) {
                    vMeth_check_sum += s + i1 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + i14 +
                        Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr);
                    return;
                }
            }
            i13 += (int)d1;
        } else if (Test.bFld) {
            i11 += i1;
            i1 += i10;
        } else {
            Test.iArrFld[(i13 >>> 1) % N] *= i12;
            lArr[(63300 >>> 1) % N][(i13 >>> 1) % N] *= i13;
            i11 -= i13;
            vMeth_check_sum += s + i1 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + i14 +
                Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr);
            return;
        }
        vMeth_check_sum += s + i1 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1)
            + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=54619, i15=140, i16=-186, i17=4, i18=55404, i19=38, i20=-1;
        double d2=-55.124778;
        float f2=0.959F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.817F);

        i = 1;
        while (++i < 371) {
            iFld += i;
            vMeth();
            iFld1 = (int)d2;
            for (i15 = 2; i15 < 68; i15++) {
                for (i17 = i15; 2 > i17; i17++) {
                    fArr[i17 + 1] = Test.instanceCount;
                    i18 = iFld1;
                }
                for (i19 = 1; i19 < 2; ++i19) {
                    iFld1 += iFld;
                    Test.instanceCount += (long)f2;
                    switch (((i15 % 3) * 5) + 114) {
                    case 126:
                        Test.iArrFld = Test.iArrFld;
                        i16 = iFld1;
                        iFld1 -= Test.sFld;
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)35);
                        break;
                    case 122:
                        i16 = 11;
                        Test.instanceCount = -109;
                        iFld1 += (i19 | i16);
                        Test.instanceCount -= Test.instanceCount;
                        break;
                    case 116:
                        d2 *= Test.sFld;
                        break;
                    default:
                        if (Test.bFld) break;
                    }
                    iFld1 <<= (int)Test.instanceCount;
                    if (Test.bFld) {
                        i16 = iFld1;
                        Test.byFld = (byte)iFld2;
                    }
                    Test.byFld -= (byte)iFld;
                    fArr[i19 + 1] -= Test.instanceCount;
                    Test.iArrFld[i - 1] -= (int)Test.instanceCount;
                    iFld2 /= -34;
                }
            }
        }

        FuzzerUtils.out.println("i d2 i15 = " + i + "," + Double.doubleToLongBits(d2) + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 f2 = " + i19 + "," + i20 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.sFld = " + Test.instanceCount + "," + iFld + "," +
            Test.sFld);
        FuzzerUtils.out.println("Test.bFld iFld1 Test.byFld = " + (Test.bFld ? 1 : 0) + "," + iFld1 + "," + Test.byFld);
        FuzzerUtils.out.println("iFld2 Test.iArrFld = " + iFld2 + "," + FuzzerUtils.checkSum(Test.iArrFld));

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