// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:49 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1013667269L;
    public static boolean bFld=false;
    public int iFld=-34356;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.80F);
        FuzzerUtils.init(Test.iArrFld, -101);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l) {

        int i4=20845, i5=7, i6=245, i7=-50, iArr[]=new int[N];
        float f=-1.128F, f1=-78.124F;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -6);
        FuzzerUtils.init(lArr, 12138052L);

        iArr[(i4 >>> 1) % N] = 7;
        for (i5 = 16; i5 < 268; ++i5) {
            i7 = 6;
            while (--i7 > 0) {
                i6 += i7;
                switch ((((i7 >>> 1) % 3) * 5) + 42) {
                case 54:
                    i4 += (i7 - i4);
                    try {
                        i6 = (i6 / 25265);
                        i4 = (i5 % 189);
                        i4 = (iArr[i5] % i6);
                    } catch (ArithmeticException a_e) {}
                    i6 += 52511;
                    break;
                case 55:
                    if (false) {
                        i4 = i4;
                    } else {
                        i6 += i7;
                        f += f1;
                        i6 += (((i7 * Test.instanceCount) + i5) - i6);
                    }
                    if (b) break;
                    f1 = l;
                    break;
                case 49:
                    lArr[i5] = Test.instanceCount;
                    break;
                }
            }
        }
        vMeth1_check_sum += l + i4 + i5 + i6 + i7 + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {

        int i8=13, i9=7, i10=-5, i11=213;
        float f2=-112.849F;
        byte by=-22;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        vMeth1(Test.instanceCount);
        for (i8 = 7; i8 < 276; i8++) {
            i9 += i8;
            switch ((i8 % 1) + 114) {
            case 114:
                for (i10 = i8; i10 < 6; i10++) {
                    Test.instanceCount = 35294L;
                }
                i11 += i9;
                Test.fArrFld[(-48547 >>> 1) % N] *= i9;
                i11 >>= i11;
                break;
            }
            f2 -= by;
            Test.instanceCount -= i11;
            f2 += (((i8 * i11) + i9) - i8);
            i9 += (i8 ^ Test.instanceCount);
        }
        i9 = 156;
        bArr[(6046 >>> 1) % N] = Test.bFld;
        long meth_res = i8 + i9 + i10 + i11 + Float.floatToIntBits(f2) + by + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        int i1=0, i2=77, i3=-13, i12=-1, i13=10810, iArr1[]=new int[N];
        float f3=-6.724F, f4=126.556F;
        double d=120.82809, dArr[]=new double[N];
        short s=7676;

        FuzzerUtils.init(iArr1, 223);
        FuzzerUtils.init(dArr, 91.4918);

        for (i1 = 10; i1 < 297; ++i1) {
            i *= i;
            i3 = i3;
            i = iMeth();
            switch ((i1 % 3) + 29) {
            case 29:
                i3 += (((i1 * i1) + i3) - i3);
                iArr1[i1] -= i2;
                switch ((i1 % 8) + 109) {
                case 109:
                    if (i1 != 0) {
                        vMeth_check_sum += i + i1 + i2 + i3 + Float.floatToIntBits(f3) + i12 + i13 +
                            Float.floatToIntBits(f4) + Double.doubleToLongBits(d) + s + FuzzerUtils.checkSum(iArr1) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    }
                    f3 = 6;
                    do {
                        i3 = i1;
                    } while (--f3 > 0);
                    break;
                case 110:
                    i3 = (int)Test.instanceCount;
                    for (i12 = 1; i12 < 6; i12 += 2) {
                        iArr1[i12 + 1] += i3;
                        f4 *= Test.instanceCount;
                    }
                case 111:
                    i3 = (int)Test.instanceCount;
                case 112:
                case 113:
                    dArr[i1 - 1] *= 10732;
                    break;
                case 114:
                    if (i13 != 0) {
                        vMeth_check_sum += i + i1 + i2 + i3 + Float.floatToIntBits(f3) + i12 + i13 +
                            Float.floatToIntBits(f4) + Double.doubleToLongBits(d) + s + FuzzerUtils.checkSum(iArr1) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    }
                    break;
                case 115:
                    try {
                        iArr1[i1 + 1] = (i13 / iArr1[i1]);
                        i3 = (i % i13);
                        i = (i13 / i12);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 116:
                    i = (int)Test.instanceCount;
                    break;
                default:
                    d = i3;
                }
            case 30:
                i2 += (((i1 * i2) + Test.instanceCount) - s);
                break;
            case 31:
                iArr1[i1 - 1] >>>= 18;
            default:
                Test.instanceCount >>>= i13;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + Float.floatToIntBits(f3) + i12 + i13 + Float.floatToIntBits(f4) +
            Double.doubleToLongBits(d) + s + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i14=-10, i15=-6, i16=-4, i17=-2, i18=13220, i19=-38007, i20=45949, i21=26511, i22=64;
        long l1=7670868577414398601L, l2=-6974L;
        byte by1=5;
        double d1=1.70273;
        short s1=-21484;
        float f5=2.627F;

        vMeth(i14);
        Test.bFld = Test.bFld;
        for (l1 = 12; l1 < 289; l1++) {
            for (i16 = 5; 91 > i16; i16++) {
                i17 = iFld;
                iFld *= 25363;
                for (i18 = 1; i18 < 2; ++i18) {
                    Test.instanceCount = l1;
                    i19 = -85;
                    iFld += (((i18 * by1) + i15) - i16);
                }
                Test.iArrFld[(int)(l1)] += (int)Test.instanceCount;
            }
            if (Test.bFld) continue;
            i15 += (int)(l1 ^ i15);
            d1 = -8;
            i19 = 134;
            s1 = (short)i18;
        }
        i19 = (int)Test.instanceCount;
        iFld = (int)9100896374441887807L;
        for (i20 = 314; i20 > 2; --i20) {
            i17 <<= (int)-3554631427587957578L;
            i15 = (int)l1;
            if (true) {
                i22 = 1;
                do {
                    s1 += (short)i18;
                    Test.instanceCount |= 40L;
                    l2 = 1;
                    do {
                        i17 = (int)d1;
                        Test.bFld = Test.bFld;
                        i19 = (int)f5;
                    } while (++l2 < 1);
                    i15 <<= i16;
                } while (++i22 < 81);
            } else {
                i17 += (((i20 * l2) + i19) - i18);
            }
        }

        FuzzerUtils.out.println("i14 l1 i15 = " + i14 + "," + l1 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 by1 d1 = " + i19 + "," + by1 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("s1 i20 i21 = " + s1 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 l2 f5 = " + i22 + "," + l2 + "," + Float.floatToIntBits(f5));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld iFld = " + Test.instanceCount + "," + (Test.bFld ? 1 : 0)
            + "," + iFld);
        FuzzerUtils.out.println("Test.fArrFld Test.iArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
