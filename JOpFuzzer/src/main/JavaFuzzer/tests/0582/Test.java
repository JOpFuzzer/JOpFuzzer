// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:54 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=11L;
    public static boolean bFld=false;
    public static volatile int iFld=-7;
    public static byte byFld=-40;
    public static volatile boolean bArrFld[]=new boolean[N];
    public volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2) {

        int i3=1, i4=118, i5=-2, i6=-4, i7=100, i8=-17217, i9=15959, iArr[]=new int[N];
        byte by1=-38;
        float f=2.998F;
        double d=1.77502, d1=121.16310, d2=0.43894;

        FuzzerUtils.init(iArr, -65147);

        i3 = 1;
        while (++i3 < 126) {
            i2 <<= i3;
            i2 -= by1;
            Test.bFld = Test.bFld;
            i2 *= (int)f;
            f += (float)d;
        }
        for (i4 = 4; i4 < 165; ++i4) {
            for (d1 = 1; d1 < 10; d1++) {
                iArr[(int)(d1)] &= i2;
                for (i7 = 1; i7 < 2; i7++) {
                    i8 ^= i5;
                    i5 >>= 31;
                }
                for (d2 = 1; d2 < 2; d2++) {
                    Test.instanceCount |= i4;
                    i6 *= i6;
                }
            }
        }
        vMeth2_check_sum += i2 + i3 + by1 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i4 + i5 +
            Double.doubleToLongBits(d1) + i6 + i7 + i8 + Double.doubleToLongBits(d2) + i9 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(long l) {

        int i1=-3, i10=243, i11=7, i12=-3, i13=-14, i14=-64567;
        byte by=125;
        short s=20880;
        float f1=58.841F;
        double d3=1.111356;

        i1 += i1;
        by <<= (byte)(i1--);
        vMeth2(i1);
        i10 = 1;
        while (++i10 < 144) {
            Test.instanceCount += i11;
            for (i12 = 1; i12 < 11; i12++) {
                s -= (short)954016889466842803L;
                l += i12;
                i14 = 1;
                do {
                    f1 += (i14 * l);
                    f1 += i14;
                } while (++i14 < 2);
            }
            d3 += i1;
            d3 -= l;
            i11 = i12;
        }
        Test.bArrFld[(-96 >>> 1) % N] = Test.bFld;
        vMeth1_check_sum += l + i1 + by + i10 + i11 + i12 + i13 + s + i14 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(d3);
    }

    public static void vMeth(int i) {


        vMeth1(Test.instanceCount);
        i = (int)899736378L;
        vMeth_check_sum += i;
    }

    public void mainTest(String[] strArr1) {

        int i15=-65237, i16=-129, i17=-36405, i18=24123, i19=113, i20=-51, i21=223, i22=-56824, i23=11, i24=-58772;
        float f2=12.194F;
        double d4=-104.102280;
        short s1=22890;
        long l1=26108L;

        vMeth(Test.iFld);
        i15 = 1;
        while (++i15 < 307) {
            if (Test.bFld) {
                f2 -= Test.iFld;
                iArrFld[i15] ^= (int)Test.instanceCount;
                for (i16 = 82; 4 < i16; i16--) {
                    for (i18 = 1; i18 < 2; ++i18) {
                        i17 = i18;
                        d4 -= i17;
                        iArrFld[i16] += (int)Test.instanceCount;
                        f2 += i18;
                    }
                    i19 += (i16 * i16);
                    i19 -= i19;
                    s1 = (short)10;
                    i19 -= Test.iFld;
                    Test.iFld /= (int)(Test.iFld | 1);
                    iArrFld[i16] -= (int)80.25361;
                    Test.instanceCount += (((i16 * Test.iFld) + i15) - i18);
                    Test.byFld <<= (byte)s1;
                    Test.iFld *= (int)f2;
                }
            } else if (Test.bFld) {
                Test.iFld = (int)Test.instanceCount;
                f2 = f2;
                Test.bFld = Test.bFld;
                iArrFld[i15] -= i15;
            } else if (Test.bFld) {
                for (i20 = 3; i20 < 82; ++i20) {
                    i19 *= (int)l1;
                    for (i22 = i15; i22 < 2; i22++) {
                        if (Test.bFld) continue;
                        i19 += i22;
                        i24 &= i20;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i15 f2 i16 = " + i15 + "," + Float.floatToIntBits(f2) + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("d4 s1 i20 = " + Double.doubleToLongBits(d4) + "," + s1 + "," + i20);
        FuzzerUtils.out.println("i21 l1 i22 = " + i21 + "," + l1 + "," + i22);
        FuzzerUtils.out.println("i23 i24 = " + i23 + "," + i24);

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.iFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.byFld Test.bArrFld iArrFld = " + Test.byFld + "," +
            FuzzerUtils.checkSum(Test.bArrFld) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
