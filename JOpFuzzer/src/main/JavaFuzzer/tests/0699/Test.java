// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-52067L;
    public static boolean bFld=true;
    public static short sFld=2463;
    public static double dFld=-1.45404;
    public volatile float fFld=-88.328F;
    public volatile long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i6, float f) {

        long l2=44L;
        int i7=26, i8=-78, i9=160, i10=-46326, i11=-7, iArr1[]=new int[N];
        short s=10132;
        byte by=109;

        FuzzerUtils.init(iArr1, 125);

        i6 &= i6;
        for (l2 = 2; l2 < 290; ++l2) {
            i7 += (int)(l2 - Test.instanceCount);
            for (i8 = (int)(l2); i8 < 6; i8++) {
                i10 = 1;
                do {
                    s += (short)(156 + (i10 * i10));
                    iArr1[(i8 >>> 1) % N] = i9;
                    f -= i8;
                    i9 -= i8;
                } while (++i10 < 1);
                Test.instanceCount += (-32330L + (i8 * i8));
                i7 = (int)Test.instanceCount;
                i9 += (((i8 * i9) + by) - i11);
                i7 -= i7;
                i6 *= i9;
                i9 = (int)3L;
            }
        }
        long meth_res = i6 + Float.floatToIntBits(f) + l2 + i7 + i8 + i9 + i10 + s + by + i11 +
            FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(long l1, int i4, int i5) {

        float f1=0.664F, fArr[]=new float[N];
        long l3=7421117189215350304L, lArr[]=new long[N];
        int i12=-5224, i13=63, iArr2[]=new int[N];

        FuzzerUtils.init(lArr, 2443L);
        FuzzerUtils.init(iArr2, -117);
        FuzzerUtils.init(fArr, 122.576F);

        Test.instanceCount = (long)((Test.instanceCount * (l1 + i5)) * (fMeth(i4, f1) + l1));
        l1 -= i4;
        i4 = (int)l1;
        l1 += i5;
        l3 = 1;
        while (++l3 < 200) {
            for (i12 = 1; i12 < 8; ++i12) {
                if (i12 != 0) {
                    vMeth_check_sum += l1 + i4 + i5 + Float.floatToIntBits(f1) + l3 + i12 + i13 +
                        FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                lArr = lArr;
            }
            i13 >>>= i12;
            Test.sFld += (short)(l3 ^ i4);
            Test.dFld -= 196;
            if (false) {
                i5 -= (int)l1;
                Test.dFld = i12;
                vMeth_check_sum += l1 + i4 + i5 + Float.floatToIntBits(f1) + l3 + i12 + i13 +
                    FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2) +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            } else if (Test.bFld) {
                Test.bArrFld[(int)(l3 - 1)] = Test.bFld;
            } else if (Test.bFld) {
                Test.bFld = Test.bFld;
            } else {
                i5 <<= i13;
            }
        }
        vMeth_check_sum += l1 + i4 + i5 + Float.floatToIntBits(f1) + l3 + i12 + i13 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth(int i2) {

        long l=14L;
        int i3=50816, i15=-32602, i16=57897;

        Test.bFld = (Test.bFld = Test.bFld);
        for (l = 5; l < 235; l += 2) {
            Test.instanceCount >>>= -2950696201370783832L;
            vMeth(l, i3, i2);
            i3 += (int)l;
            i2 = (int)Test.instanceCount;
            i2 |= (int)65057317L;
            i3 >>= Test.sFld;
            for (i15 = (int)(l); i15 < 14; i15++) {
                i16 -= i3;
            }
            Test.instanceCount = i16;
        }
        long meth_res = i2 + l + i3 + i15 + i16;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-231, i1=-18881, i17=8, i18=-36336, i19=-5779, i20=123, i21=19547, i22=37, iArr[]=new int[N], iArr3[]=new
            int[N];
        double d=-1.101269;
        float f3=15.389F;

        FuzzerUtils.init(iArr, 25894);
        FuzzerUtils.init(iArr3, 9);

        lArrFld[(i >>> 1) % N] <<= (--Test.instanceCount);
        Test.instanceCount -= (--i1);
        i1 = (i - (iArr[(i1 >>> 1) % N] = (i++)));
        d = ((i = (int)lMeth(i)) + Test.sFld);
        i1 -= i;
        iArr[(i1 >>> 1) % N] &= i1;
        for (f3 = 5; 211 > f3; f3++) {
            i += (int)(f3 - i);
            fFld += (f3 + i);
            i18 = (int)Test.instanceCount;
            i19 = 1;
            do {
                for (i20 = 1; i20 > f3; i20--) {
                    byte by1=-62;
                    Test.instanceCount += Test.instanceCount;
                    if (Test.bFld) {
                        fFld += (((i20 * i18) + Test.instanceCount) - i17);
                        i21 -= (int)Test.instanceCount;
                        d += i21;
                    } else if (Test.bFld) {
                        i21 += (115 + (i20 * i20));
                        Test.instanceCount = 3;
                        switch ((((i21 >>> 1) % 1) * 5) + 103) {
                        case 105:
                            i17 = (int)Test.instanceCount;
                            Test.bFld = false;
                            break;
                        default:
                            i17 /= (int)(i22 | 1);
                            iArr3[i20] <<= 28;
                            fFld -= i20;
                            i17 = i18;
                        }
                        iArr3[(int)(f3 - 1)] <<= (int)Test.instanceCount;
                    } else {
                        i18 += (i20 - i19);
                        Test.instanceCount += (((i20 * i19) + Test.instanceCount) - by1);
                        iArr[i19 - 1] = (int)Test.instanceCount;
                    }
                }
            } while (++i19 < 122);
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("f3 i17 i18 = " + Float.floatToIntBits(f3) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 iArr iArr3 = " + i22 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.sFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.dFld fFld lArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
