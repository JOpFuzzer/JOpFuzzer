// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=667216108L;
    public boolean bFld=false;
    public static float fFld=1.947F;
    public short sFld=5283;
    public static double dFld=2.27959;
    public static volatile int iArrFld[]=new int[N];
    public volatile byte byArrFld[]=new byte[N];
    public static volatile short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -111);
        FuzzerUtils.init(Test.sArrFld, (short)5652);
    }

    public static long iMeth_check_sum = 0;
    public static long vSmallMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static int iMeth(boolean b) {

        int i1=-114, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 14);

        Test.instanceCount = (((-(i1 >> i1)) - iArr[(i1 >>> 1) % N]) - Math.min(Test.instanceCount++,
            Long.reverseBytes(-1935L)));
        long meth_res = (b ? 1 : 0) + i1 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(float f, int i2) {


        i2 = -1;
        vSmallMeth_check_sum += Float.floatToIntBits(f) + i2;
    }

    public static void vMeth(int i4, boolean b1, long l1) {

        int i5=-24448, i7=-46893, i8=-1, i9=-12, i10=35744, iArr1[]=new int[N];
        float f1=-2.510F;

        FuzzerUtils.init(iArr1, 5);

        i5 = 1;
        do {
            vSmallMeth(f1, i5);
            i4 = (int)l1;
            for (i7 = 1; i7 < 5; i7++) {
                i9 = 2;
                do {
                    i4 = i8;
                    i8 = -15;
                    switch (((i8 >>> 1) % 8) + 121) {
                    case 121:
                        if (b1) break;
                        if (b1) continue;
                        i8 += i7;
                        break;
                    case 122:
                        iArr1[i9 - 1] = -39957;
                        i8 = i7;
                    case 123:
                        i4 = i8;
                        Test.instanceCount += (((i9 * i10) + i7) - f1);
                    case 124:
                        i8 |= i7;
                    case 125:
                        iArr1[i5 - 1] <<= (int)-3885125637L;
                        break;
                    case 126:
                        f1 = i8;
                        break;
                    case 127:
                        l1 >>= i4;
                        break;
                    case 128:
                    }
                } while (--i9 > 0);
            }
        } while (++i5 < 369);
        vMeth_check_sum += i4 + (b1 ? 1 : 0) + l1 + i5 + Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth(int i3, long l) {

        boolean b2=false;
        int i11=108;
        double d=35.119973;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 93.699F);

        vMeth(i3, b2, Test.instanceCount);
        i3 >>= i3;
        Test.fFld += i3;
        i11 = 1;
        do {
            if (b2) continue;
        } while (++i11 < 152);
        fArr[(i3 >>> 1) % N][(i11 >>> 1) % N] -= i11;
        Test.fFld -= (float)d;
        long meth_res = i3 + l + (b2 ? 1 : 0) + i11 + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=85, i12=-1, i13=11, i14=-6861, i15=15832, i16=51986, i17=59782, i18=14;
        byte by=-29;
        float f2=112.36F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -130L);

        lArr[(i >>> 1) % N] -= ((Test.instanceCount - iMeth(bFld)) * (-i));
        for (int smallinvoc=0; smallinvoc<786; smallinvoc++) vSmallMeth(((-8 - (-11 + (i - Test.instanceCount))) %
            ((long)(fMeth(i, -17991L)) | 1)) + by, i);
        i ^= (int)Test.instanceCount;
        i <<= i;
        Test.instanceCount <<= i;
        Test.instanceCount = 36;
        i *= (int)110.12F;
        for (i12 = 356; 5 < i12; --i12) {
            Test.instanceCount -= i13;
            Test.iArrFld[i12] = 33750;
            i = i;
            Test.instanceCount -= Test.instanceCount;
            Test.iArrFld[i12] <<= i13;
            for (i14 = i12; i14 < 72; ++i14) {
                i *= i;
                Test.instanceCount = i15;
                Test.iArrFld[i12] ^= i14;
                byArrFld[i12 + 1] += (byte)Test.instanceCount;
            }
        }
        switch ((((i14 >>> 1) % 10) * 5) + 98) {
        case 131:
            i -= -6;
        case 113:
        case 124:
            Test.instanceCount -= i14;
            break;
        case 135:
            f2 = 1;
            do {
                if (bFld) {
                    i15 = i15;
                    Test.instanceCount *= i14;
                } else {
                    for (i16 = 6; i16 < 136; i16++) {
                        Test.instanceCount -= i13;
                        i15 += i16;
                        bFld = true;
                        Test.sArrFld[(int)(f2 - 1)] <<= (short)i12;
                    }
                }
            } while (++f2 < 185);
            break;
        case 125:
            i17 *= i17;
        case 141:
            Test.instanceCount -= sFld;
        case 114:
            i15 += i16;
            break;
        case 99:
            sFld *= (short)Test.dFld;
            break;
        case 132:
            lArr[(i18 >>> 1) % N] &= Test.instanceCount;
            break;
        case 143:
            Test.instanceCount = -50061;
            break;
        default:
            i15 += -9815;
        }

        FuzzerUtils.out.println("i by i12 = " + i + "," + by + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("f2 i16 i17 = " + Float.floatToIntBits(f2) + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 lArr = " + i18 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount bFld Test.fFld = " + Test.instanceCount + "," + (bFld ? 1 : 0) +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("sFld Test.dFld Test.iArrFld = " + sFld + "," + Double.doubleToLongBits(Test.dFld) +
            "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("byArrFld Test.sArrFld = " + FuzzerUtils.checkSum(byArrFld) + "," +
            FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth fMeth
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
