// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5992390110011052096L;
    public static volatile boolean bFld=true;
    public static int iFld=89;
    public float fFld=1.102F;
    public int iFld1=12;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -5261);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(float f1, float f2, int i2) {

        int i3=26008, i4=-12, i5=-45581, i6=-35979;
        long l=-2136558393L;
        byte by=45;
        short s1=22932;

        Test.instanceCount = Test.instanceCount;
        for (i3 = 4; i3 < 188; i3++) {
            f2 = i3;
        }
        for (l = 367; 9 < l; --l) {
            i4 = i3;
            Test.instanceCount *= Test.instanceCount;
            by *= (byte)i5;
        }
        i6 = 1;
        do {
            Test.iArrFld[i6 - 1] += i3;
            Test.iArrFld[i6 + 1] &= -64011;
            if (Test.bFld) break;
            i4 += (i6 * i4);
            Test.instanceCount = l;
            i5 += s1;
            by += (byte)(((i6 * i2) + i5) - i6);
        } while (++i6 < 363);
        long meth_res = Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i2 + i3 + i4 + l + i5 + by + i6 + s1;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(float f) {

        short s=27156;
        int i1=-131, i7=-57992, i8=-10, i9=-35186;
        long l1=7L;
        double d1=-96.33808;

        s -= (short)(i1 -= (iMeth1(f, f, i1) - i1));
        i1 -= i1;
        i7 = 1;
        while (++i7 < 376) {
            Test.iArrFld[i7] *= i7;
            if (Test.bFld) continue;
        }
        Test.iArrFld[(i8 >>> 1) % N] = i8;
        i8 += i7;
        for (l1 = 6; l1 < 184; ++l1) {
            i9 += (int)(l1 ^ i1);
            if (false) break;
            d1 = 1;
            while (++d1 < 9) {
                Test.iArrFld[(int)(d1 - 1)] = (int)-1.509F;
            }
            Test.instanceCount += (long)d1;
            i8 += (int)(((l1 * i8) + f) - l1);
            Test.instanceCount += (((l1 * f) + i1) - i7);
        }
        long meth_res = Float.floatToIntBits(f) + s + i1 + i7 + i8 + l1 + i9 + Double.doubleToLongBits(d1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(int i) {

        double d=17.55627;

        i = (int)Test.instanceCount;
        d -= iMeth(-1.290F);
        vSmallMeth_check_sum += i + Double.doubleToLongBits(d);
    }

    public void mainTest(String[] strArr1) {

        double d2=22.79556;
        short s2=1648;
        int i11=-1361, i12=-9, i13=-140, i14=-63886, i15=13, i16=210;
        byte by1=-4;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2096460746387521699L);

        for (int smallinvoc=0; smallinvoc<869; smallinvoc++) vSmallMeth(Test.iFld);
        Test.instanceCount = Test.iFld;
        Test.iFld = (int)d2;
        try {
            Test.iFld = Test.iFld;
            Test.iFld >>= s2;
            for (int i10 : Test.iArrFld) {
                d2 *= -1.73531;
                i10 -= i10;
                for (i11 = 1; i11 < 63; ++i11) {
                    switch ((i11 % 3) + 30) {
                    case 30:
                        Test.bFld = Test.bFld;
                        if (Test.bFld) break;
                        break;
                    case 31:
                        i10 ^= i12;
                        i12 += (i11 * i11);
                        lArr = lArr;
                        Test.iArrFld[i11] *= (int)Test.instanceCount;
                        break;
                    case 32:
                        lArr[i11 + 1] = -14;
                        for (i13 = 1; i13 < 2; i13++) {
                            Test.instanceCount -= -9L;
                            Test.iFld *= (int)Test.instanceCount;
                            fFld += s2;
                            Test.instanceCount *= i11;
                            by1 = (byte)-13;
                            i14 = i13;
                        }
                        break;
                    default:
                        Test.instanceCount *= i14;
                        for (i15 = 2; 1 < i15; --i15) {
                            if (Test.bFld) break;
                            i14 = i16;
                        }
                        Test.iArrFld = Test.iArrFld;
                    }
                }
            }
        }
        catch (ArithmeticException exc1) {
            lArr[(i16 >>> 1) % N] -= iFld1;
        }

        FuzzerUtils.out.println("d2 s2 i11 = " + Double.doubleToLongBits(d2) + "," + s2 + "," + i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("by1 i15 i16 = " + by1 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.iFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.iFld);
        FuzzerUtils.out.println("fFld iFld1 Test.iArrFld = " + Float.floatToIntBits(fFld) + "," + iFld1 + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  iMeth1 ->  iMeth1 iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
