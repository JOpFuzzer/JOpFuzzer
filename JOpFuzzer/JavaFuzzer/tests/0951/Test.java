// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-36195L;
    public static int iFld=3;
    public int iFld1=-20549;

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i1, int i2, int i3) {

        int i4=-208, i5=91, i6=-40, i7=-20887, i8=3, iArr[]=new int[N];
        byte by=-67, byArr[]=new byte[N];
        boolean b1=true;

        FuzzerUtils.init(iArr, 242);
        FuzzerUtils.init(byArr, (byte)-6);

        for (i4 = 19; 340 > i4; i4++) {
            Test.iFld += (((i4 * i4) + by) - Test.instanceCount);
            if (b1) continue;
            i5 += (i4 * i4);
        }
        for (i6 = 9; i6 < 318; i6++) {
            if (b1) continue;
            iArr = FuzzerUtils.int1array(N, (int)-130);
            i3 = i2;
            i8 = 1;
            do {
                byArr[i6 + 1] = (byte)Test.iFld;
                i5 <<= (int)Test.instanceCount;
                switch ((i6 % 10) + 70) {
                case 70:
                    Test.instanceCount = i7;
                    Test.instanceCount *= i7;
                    break;
                case 71:
                    by = (byte)i3;
                    break;
                case 72:
                    i1 >>>= i3;
                    break;
                case 73:
                case 74:
                    i2 -= i4;
                    break;
                case 75:
                case 76:
                    i2 = -151;
                    break;
                case 77:
                    iArr[i8] = (int)Test.instanceCount;
                    break;
                case 78:
                    i1 += -7;
                    break;
                case 79:
                    Test.iFld -= i7;
                    break;
                }
            } while (++i8 < 5);
        }
        vMeth1_check_sum += i1 + i2 + i3 + i4 + i5 + by + (b1 ? 1 : 0) + i6 + i7 + i8 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(byArr);
    }

    public static long lMeth(long l1) {

        short s=-22196;
        double d=-113.8236;
        float f=-1.8F, f1=46.840F;
        int i9=-3, i10=-4, i11=48, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 213);

        Test.iFld = (int)(((Test.iFld << s) - (Test.iFld / ((long)(d) | 1))) - Test.iFld);
        f = 1;
        while ((f += 3) < 215) {
            vMeth1(-45324, 52494, Test.iFld);
            f1 = 34786;
            i9 = 22;
            do {
                s += (short)i9;
                if (Test.iFld != 0) {
                }
                iArr1[i9 + 1] = 117;
                Test.iFld &= Test.iFld;
                iArr1[i9 - 1] *= -34906;
                for (i10 = 1; i10 > 1; i10--) {
                    i11 += i10;
                    i11 = Test.iFld;
                    i11 += i10;
                    Test.iFld += (14 + (i10 * i10));
                }
            } while (--i9 > 0);
        }
        long meth_res = l1 + s + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i9 +
            i10 + i11 + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l) {

        boolean b=false;
        int i=44053, i12=-32740, i13=10, i14=-207, i15=-47805, i16=-9, i17=-12, iArr2[]=new int[N];
        short s1=25880;
        double d1=0.104947;
        float f2=2.333F;

        FuzzerUtils.init(iArr2, 11);

        b = (i < lMeth(Test.instanceCount));
        s1 *= (short)Test.instanceCount;
        for (i12 = 12; i12 < 264; ++i12) {
            iArr2[i12 - 1] = s1;
            for (i14 = 1; i14 < 6; i14++) {
                i13 >>>= -1;
                for (i16 = 1; i16 < 2; ++i16) {
                    d1 = Test.iFld;
                    i13 = i17;
                    i -= s1;
                    i15 = i14;
                    i15 %= (int)((long)(f2) | 1);
                    i15 = 5680;
                    d1 *= -4081035907L;
                    s1 += (short)(i16 ^ i17);
                }
            }
        }
        vMeth_check_sum += l + (b ? 1 : 0) + i + s1 + i12 + i13 + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int iArr3[]=new int[N];

        FuzzerUtils.init(iArr3, -95);

        vMeth(Test.instanceCount);
        iFld1 = (int)Test.instanceCount;
        iArr3[(iFld1 >>> 1) % N] *= iFld1;

        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld iFld1 = " + Test.instanceCount + "," + Test.iFld + "," +
            iFld1);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}