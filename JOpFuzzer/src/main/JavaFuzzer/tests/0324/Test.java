// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-85L;
    public static short sFld=21114;
    public static int iFld=115;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, boolean b) {

        int i7=187, i8=53082, i9=-1, iArr[]=new int[N];
        double d2=-61.48834;
        float f=0.629F;
        boolean bArr[][]=new boolean[N][N];

        FuzzerUtils.init(iArr, 1);
        FuzzerUtils.init(bArr, true);

        i6 = (int)Test.instanceCount;
        if (b) {
            for (i7 = 193; i7 > 9; i7--) {
                iArr[i7] = i7;
                i8 += (i7 * i7);
            }
            i8 = i6;
            Test.sFld = (short)i8;
            d2 += i7;
        }
        Test.instanceCount = i6;
        switch ((((i6 >>> 1) % 2) * 5) + 14) {
        case 16:
            bArr[(i9 >>> 1) % N][(i7 >>> 1) % N] = b;
            f -= Test.instanceCount;
            Test.instanceCount -= i8;
            i6 = i7;
            break;
        case 17:
        default:
            Test.instanceCount <<= i8;
        }
        vMeth1_check_sum += i6 + (b ? 1 : 0) + i7 + i8 + Double.doubleToLongBits(d2) + i9 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(long l, int i1, long l1) {

        int i2=-20, i3=-56580, i4=39441, i5=-14, i10=46, i11=-51129, iArr1[]=new int[N];
        boolean b1=false;
        float f1=2.55F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 45510L);
        FuzzerUtils.init(iArr1, 0);

        for (i2 = 9; i2 < 171; i2++) {
            i1 += (i2 - l);
            for (i4 = 1; i4 < 10; i4++) {
                vMeth1(5, b1);
                i1 |= -221;
                i3 += (i4 ^ i4);
                i1 = i1;
            }
        }
        for (i10 = 15; 348 > i10; ++i10) {
            i1 = 57754;
            lArr[i10] >>= i1;
            i3 += (-49054 + (i10 * i10));
            i1 += (((i10 * i11) + f1) - f1);
            iArr1 = iArr1;
            b1 = b1;
            if (i2 != 0) {
                vMeth_check_sum += l + i1 + l1 + i2 + i3 + i4 + i5 + (b1 ? 1 : 0) + i10 + i11 +
                    Float.floatToIntBits(f1) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
                return;
            }
        }
        vMeth_check_sum += l + i1 + l1 + i2 + i3 + i4 + i5 + (b1 ? 1 : 0) + i10 + i11 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth(int i, double d1) {


        vMeth(Test.instanceCount, i, Test.instanceCount);
        vSmallMeth_check_sum += i + Double.doubleToLongBits(d1);
    }

    public void mainTest(String[] strArr1) {

        double d=10.67443;

        d += (--d);
        for (int smallinvoc=0; smallinvoc<615; smallinvoc++) vSmallMeth(Test.iFld, 0.39262);
        d /= (Test.instanceCount | 1);

        FuzzerUtils.out.println("d = " + Double.doubleToLongBits(d));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.iFld);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
