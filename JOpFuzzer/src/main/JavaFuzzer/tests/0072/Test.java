// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-65L;
    public float fArrFld[]=new float[N];
    public double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -234);
    }

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i11=-11;

        i11 = (int)4805633308994727484L;
        long meth_res = i11;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth1(long l) {

        int i8=-158, i9=221, i10=-2, iArr[]=new int[N];
        float f2=0.572F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, -4);
        FuzzerUtils.init(fArr, 127.3F);

        i8 += i8;
        for (f2 = 20; f2 < 349; f2 += 3) {
            i9 = i8;
            i10 = 1;
            do {
                iArr[(int)(f2)] = Math.abs(Math.min(iMeth(), i10));
                iArr[(int)(f2 + 1)] = (int)l;
                i9 += (i10 + Test.instanceCount);
                fArr = fArr;
                switch ((i10 % 6) + 102) {
                case 102:
                    i8 += (i10 ^ i10);
                    i9 += i10;
                    break;
                case 103:
                    try {
                        i9 = (i10 % iArr[i10 + 1]);
                        i8 = (203 % i10);
                        iArr[i10 - 1] = (-251 % i10);
                    } catch (ArithmeticException a_e) {}
                    l = (long)6.48922;
                    i9 += (i10 | (long)f2);
                case 104:
                    fArr[i10 - 1] = i8;
                    break;
                case 105:
                case 106:
                    i9 -= -11512;
                    break;
                case 107:
                    Test.instanceCount -= -19783;
                }
            } while (++i10 < 14);
        }
        long meth_res = l + i8 + Float.floatToIntBits(f2) + i9 + i10 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth() {

        int i3=12, i4=6, i5=-14, i6=221, i7=-62736, i12=-3557, i13=9, i14=9, iArr1[]=new int[N];
        boolean b=true, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr1, -16441);

        i3 = 1;
        while (++i3 < 171) {
            if (b = bArr[i3]) break;
            i4 = 1;
            do {
                float f1=-2.446F;
                f1 = (i5++);
                for (i6 = i4; 1 > i6; ++i6) {
                    byte by=26;
                    if (i4 != 0) {
                    }
                    i7 += i6;
                    b = (by < (-lMeth1(Test.instanceCount)));
                    Test.instanceCount -= i6;
                }
                i7 += (i4 ^ i6);
                Test.instanceCount += i6;
                for (i12 = 1; i12 < 1; ++i12) {
                    if (b) {
                        f1 = i14;
                        try {
                            i5 = (i3 % iArr1[i3 - 1]);
                            i7 = (i5 % i3);
                            i5 = (168 % i3);
                        } catch (ArithmeticException a_e) {}
                    } else {
                        i13 >>= i3;
                    }
                }
            } while (++i4 < 9);
        }
        long meth_res = i3 + (b ? 1 : 0) + i4 + i5 + i6 + i7 + i12 + i13 + i14 + FuzzerUtils.checkSum(bArr) +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-14, i1=38, i2=-187, i15=6, i16=-70, i17=10;
        double d=-2.103655, d1=-19.69602;
        float f=-2.478F;
        boolean b1=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-13462);

        for (i = 247; 3 < i; --i) {
            for (d = 103; d > 5; d--) {
                fArrFld[(int)(d + 1)] *= f;
            }
            d1 = ((++dArrFld[(i2 >>> 1) % N]) - lMeth());
            Test.instanceCount += i1;
            for (i15 = 5; i15 < 103; i15++) {
                i2 -= i1;
                i16 *= (int)d1;
                i2 -= 3;
                b1 = b1;
                d1 *= i2;
                switch ((i % 4) + 45) {
                case 45:
                    try {
                        i2 = (i15 / -190);
                        i1 = (i % i2);
                        i16 = (51850 % i);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 46:
                    f += (i15 - Test.instanceCount);
                    try {
                        i2 = (i % 76);
                        Test.iArrFld[i15 + 1] = (-48024 / i16);
                        i2 = (-13932 / i1);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 47:
                    b1 = b1;
                    if (b1) break;
                    break;
                case 48:
                    i17 = 1;
                    while (++i17 < 2) {
                        byte by1=78;
                        i1 += (-2210 + (i17 * i17));
                        f = -47786;
                        Test.iArrFld[(i1 >>> 1) % N] >>= i2;
                        switch ((i17 % 2) + 111) {
                        case 111:
                            Test.instanceCount <<= Test.instanceCount;
                        case 112:
                            i16 = i1;
                            break;
                        default:
                            i1 += (((i17 * by1) + i16) - by1);
                            i16 += i17;
                        }
                        i1 += i;
                        by1 += (byte)i16;
                        sArr = sArr;
                    }
                }
                lArrFld[i] = i;
            }
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i2 f d1 = " + i2 + "," + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i15 i16 b1 = " + i15 + "," + i16 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i17 sArr = " + i17 + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount fArrFld dArrFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test.iArrFld lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
