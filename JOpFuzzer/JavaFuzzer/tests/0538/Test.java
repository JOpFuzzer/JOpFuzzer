// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-42L;
    public static int iFld=53904;
    public static volatile float fFld=16.509F;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i4, int i5) {

        short s=22013;
        int i6=5, i7=-5883, i8=4, i9=20343, i10=-183, i11=6, i12=4, iArr1[]=new int[N];
        double d2=102.95823;

        FuzzerUtils.init(iArr1, -199);

        i5 >>>= s;
        i5 >>= i5;
        for (i6 = 1; i6 < 188; ++i6) {
            Test.iFld += (((i6 * i6) + i5) - s);
            for (i8 = 9; 1 < i8; --i8) {
                Test.instanceCount *= 18879L;
                Test.instanceCount += (long)Test.fFld;
                d2 = 1;
                while (++d2 < 2) {
                    i9 *= -145;
                }
                i10 = 1;
                while (++i10 < 2) {
                    Test.instanceCount <<= Test.instanceCount;
                    i5 += (int)Test.fFld;
                    Test.instanceCount = i11;
                    i5 = i11;
                    iArr1[i6 - 1] += i12;
                }
            }
        }
        long meth_res = i4 + i5 + s + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d2) + i10 + i11 + i12 +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i2=-42, i3=9, i13=61861, iArr[]=new int[N];
        double d=89.64740, d1=1.121642;
        float f1=2.940F;

        FuzzerUtils.init(iArr, -6);

        i2 = 1;
        do {
            i3 = 1;
            while (++i3 < 14) {
                Test.instanceCount = i3;
                Test.iFld = (int)((Test.fFld - Double.longBitsToDouble(Test.instanceCount)) - (5733 + (d - -23185)));
                d1 = 1;
                do {
                    iArr[(int)(d1 + 1)] >>= (++Test.iFld);
                    Test.iFld = (Test.iFld++);
                    Test.iFld += (int)d1;
                    Test.iFld >>= (int)(-lMeth(i2, i3));
                    Test.iFld += (int)(((d1 * Test.iFld) + Test.iFld) - i2);
                    Test.iFld = (int)Test.instanceCount;
                } while (++d1 < 1);
                Test.iFld = i2;
                for (f1 = 1; f1 < 1; ++f1) {
                    boolean b=true;
                    b = b;
                }
                Test.iFld = (int)d1;
            }
        } while ((i2 += 3) < 344);
        vMeth1_check_sum += i2 + i3 + Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f1) + i13 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i, int i1, float f) {

        int i14=-7, i15=225, i16=91, i17=-12, i18=7, i19=-4;
        byte by=-38;
        long l=2717335477L;
        double d3=0.9333;

        vMeth1();
        i14 = 1;
        do {
            for (i15 = 1; i15 < 6; ++i15) {
                short s1=32595;
                i16 = s1;
                Test.instanceCount -= Test.instanceCount;
                for (i17 = 1; i17 < 2; ++i17) {
                    i1 = (int)f;
                    Test.instanceCount -= i14;
                    by -= (byte)f;
                }
                for (l = 2; 1 < l; l--) {
                    i16 <<= -22384;
                    i1 += 94;
                    i16 += (int)d3;
                    Test.instanceCount = Test.instanceCount;
                    i16 *= i;
                }
            }
        } while (++i14 < 298);
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + i14 + i15 + i16 + i17 + i18 + by + l + i19 +
            Double.doubleToLongBits(d3);
    }

    public void mainTest(String[] strArr1) {


        vMeth(Test.iFld, 9586, Test.fFld);


        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}