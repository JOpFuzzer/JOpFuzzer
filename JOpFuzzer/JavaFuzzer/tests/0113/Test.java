// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-26170L;
    public static int iFld=-42237;
    public static byte byFld=-95;
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, 27168L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i3=-194, i4=-63465, i5=-25246, i6=144, i7=186, i8=-13, iArr2[]=new int[N];
        float f=-2.828F;

        FuzzerUtils.init(iArr2, 7);

        i3 = i3;
        for (i4 = 1; i4 < 133; i4++) {
            i6 = 1;
            do {
                i3 >>= (int)Test.instanceCount;
                Test.instanceCount = i5;
                i5 <<= i3;
                for (i7 = 1; i7 < 1; ++i7) {
                    Test.instanceCount += i7;
                    i5 -= i5;
                    Test.instanceCount += (((i7 * i8) + f) - i8);
                    iArr2[i7] += (int)Test.instanceCount;
                    f -= f;
                    f *= f;
                }
                i3 = (int)Test.instanceCount;
                try {
                    i8 = (i8 / i8);
                    i8 = (i4 / i3);
                    i5 = (2 % i7);
                } catch (ArithmeticException a_e) {}
            } while (++i6 < 12);
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1, int i2) {

        double d=-2.38484;
        int i9=1, i10=14, i11=-13233, i12=-27067, iArr1[]=new int[N];
        float f1=1.714F;

        FuzzerUtils.init(iArr1, 11);

        i = (int)((i2 = (int)(d * Test.instanceCount)) - ((i1 - i) - i1));
        iArr1[(i2 >>> 1) % N] <<= Math.max((int)((109L + iMeth()) - 126.465F), i);
        i = (int)Test.instanceCount;
        for (i9 = 6; i9 < 129; ++i9) {
            f1 = i1;
            for (i11 = 1; i11 < 13; i11++) {
                d += i9;
                Test.instanceCount -= (long)f1;
                Test.instanceCount = i9;
            }
            Test.instanceCount -= i12;
            Test.instanceCount += (i9 | i2);
            i1 = i10;
            Test.instanceCount = i12;
            i10 = (int)f1;
            i += (i9 + f1);
        }
        vMeth_check_sum += i + i1 + i2 + Double.doubleToLongBits(d) + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth() {

        int i13=0;

        vMeth(Test.iFld, Test.iFld, Test.iFld);
        Test.lArrFld[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] ^= i13;
        vSmallMeth_check_sum += i13;
    }

    public void mainTest(String[] strArr1) {

        int i14=51769, i15=-8, i16=-169, i17=-10, i18=243, i19=190, i20=108, iArr[][]=new int[N][N];
        float f2=2.770F, fArr[]=new float[N];
        double d1=-1.130903, dArr[]=new double[N];
        boolean b=false, bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 12);
        FuzzerUtils.init(fArr, -1.225F);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(dArr, -100.82332);

        iArr = FuzzerUtils.int2array(N, (int)0);
        for (int smallinvoc=0; smallinvoc<755; smallinvoc++) vSmallMeth();
        iArr[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] -= (int)Test.instanceCount;
        for (i14 = 3; 362 > i14; ++i14) {
            for (i16 = 1; 70 > i16; i16++) {
                f2 = i15;
                for (i18 = i14; i18 < 2; i18++) {
                    short s=-18601;
                    Test.instanceCount *= (long)d1;
                    switch ((i16 % 2) + 65) {
                    case 65:
                        s *= (short)i14;
                        i19 &= 32;
                        break;
                    case 66:
                        iArr[i16][i14 - 1] = (int)f2;
                        Test.iFld <<= i19;
                        Test.instanceCount = 3247458734L;
                        Test.byFld += (byte)i16;
                        break;
                    }
                    i19 += i18;
                    switch ((i16 % 8) + 114) {
                    case 114:
                        Test.instanceCount = 53281;
                        i19 <<= 13;
                        fArr[i16 + 1] = (float)d1;
                        i19 = (int)d1;
                        break;
                    case 115:
                        bArr[i14 + 1] = b;
                        break;
                    case 116:
                        dArr = dArr;
                        break;
                    case 117:
                        f2 += ((long)i18 | (long)i16);
                        Test.instanceCount += (i18 + Test.instanceCount);
                        i19 *= Test.byFld;
                        break;
                    case 118:
                        Test.instanceCount -= i19;
                        break;
                    case 119:
                        d1 += i16;
                        i15 += Test.iFld;
                        i20 = i18;
                    case 120:
                        i20 = i14;
                    case 121:
                        i15 = (int)Test.instanceCount;
                        break;
                    default:
                        iArr[i16 + 1][i18] -= (int)f2;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 f2 i18 = " + i17 + "," + Float.floatToIntBits(f2) + "," + i18);
        FuzzerUtils.out.println("i19 d1 b = " + i19 + "," + Double.doubleToLongBits(d1) + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i20 iArr fArr = " + i20 + "," + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("bArr dArr = " + FuzzerUtils.checkSum(bArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.byFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}