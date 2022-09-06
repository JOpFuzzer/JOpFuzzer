// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:52 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-49703L;
    public volatile int iFld=49;
    public volatile long lFld=2866469096148950871L;
    public static volatile float fFld=55.852F;
    public volatile float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 129);
    }

    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static boolean bMeth(int i6, int i7, int i8) {


        i7 = (i6 + (--i7));
        long meth_res = i6 + i7 + i8;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth1() {

        int i12=-13625, i13=45689, i14=-4, i15=34, i16=-16134, i17=45;
        long l=1974963395717892238L;

        i12 = 10;
        for (i13 = 5; 173 > i13; i13++) {
            for (l = i13; 9 > l; l += 3) {
                for (i16 = 1; i16 < 1; i16++) {
                    i17 += (i16 + i17);
                    switch (((i17 >>> 1) % 6) + 63) {
                    case 63:
                        i15 <<= -8;
                        break;
                    case 64:
                        i17 = (int)-18080L;
                        i14 += (i16 ^ l);
                        i14 <<= (int)Test.instanceCount;
                        break;
                    case 65:
                        i14 += i16;
                        Test.instanceCount += (((i16 * l) + i17) - i15);
                        Test.instanceCount = l;
                        Test.fFld -= Test.instanceCount;
                    case 66:
                        Test.instanceCount = i17;
                        break;
                    case 67:
                        i17 += i16;
                        break;
                    case 68:
                        Test.fFld += i14;
                        break;
                    }
                }
            }
        }
        vMeth1_check_sum += i12 + i13 + i14 + l + i15 + i16 + i17;
    }

    public static void vMeth(int i10, int i11) {

        double d=83.59390;
        int i18=79, i19=165, i20=-1, i21=-27097, i22=-4, i23=10;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -70L);

        d += Test.instanceCount;
        vMeth1();
        for (i18 = 15; i18 < 336; ++i18) {
            i10 *= i18;
        }
        Test.instanceCount += i10;
        i10 /= 60044;
        Test.instanceCount |= Test.instanceCount;
        i19 -= (int)Test.fFld;
        for (i20 = 8; i20 < 375; ++i20) {
            i11 += (int)75L;
            if (i18 != 0) {
                vMeth_check_sum += i10 + i11 + Double.doubleToLongBits(d) + i18 + i19 + i20 + i21 + i22 + i23 +
                    FuzzerUtils.checkSum(lArr);
                return;
            }
        }
        for (i22 = 3; 301 > i22; ++i22) {
            i11 <<= (int)Test.instanceCount;
            Test.instanceCount += (i22 | i10);
            lArr[i22 - 1] = lArr[i22 - 1];
        }
        vMeth_check_sum += i10 + i11 + Double.doubleToLongBits(d) + i18 + i19 + i20 + i21 + i22 + i23 +
            FuzzerUtils.checkSum(lArr);
    }

    public int iMeth(float f) {

        int i1=-2, i2=9, i3=59096, i4=-41984, i5=-5;
        byte by=35;
        short s=-7072;

        for (float f1 : fArrFld) {
            f = ((Test.instanceCount--) * ((--i1) % (((long)(f1 + i1)) | 1)));
            for (i2 = 4; i2 > 1; i2--) {
                if (!(((Test.instanceCount * i3) != (by * i4)) || (iFld != iFld))) continue;
                i1 >>= i3;
                f += ((long)i2 ^ (long)Test.instanceCount);
                s += (short)((Test.iArrFld[i2 + 1] * (-10 + (-12 - (-(i2 + Test.instanceCount))))) * ((f1 + i2) -
                    Math.min(lFld, lFld)));
            }
        }
        i5 = 1;
        do {
            lFld *= Long.reverseBytes((long)(-(f + i1)));
            lFld += (i5 - i3);
            Test.iArrFld[i5 - 1] += (Math.min(i3, i5 - iFld) - (Test.iArrFld[i5 - 1] |= -96));
            if (bMeth(7, (int)((Test.instanceCount++) - i2), i1)) continue;
        } while ((i5 += 2) < 233);
        for (int i9 : Test.iArrFld) {
            i1 += (int)(i5 + (Test.instanceCount--));
            vMeth(i4, -7);
        }
        long meth_res = Float.floatToIntBits(f) + i1 + i2 + i3 + by + i4 + s + i5;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=172;

        i += (int)((iMeth(Test.fFld) - iFld) + lFld);

        FuzzerUtils.out.println("i = " + i);

        FuzzerUtils.out.println("Test.instanceCount iFld lFld = " + Test.instanceCount + "," + iFld + "," + lFld);
        FuzzerUtils.out.println("Test.fFld fArrFld Test.iArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  bMeth ->  bMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
