// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=38963L;
    public static boolean bFld=true;
    public int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 32703L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i10) {

        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -60.223F);

        fArr1[(17542 >>> 1) % N] -= i10;
        Test.instanceCount *= i10;
        vMeth1_check_sum += i10 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static void vMeth(double d, int i8, int i9) {

        int i11=-47845, i12=-6, i13=-157, i14=-8, iArr[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -163);
        FuzzerUtils.init(fArr, -1.495F);

        i9 -= (int)(-(Math.sqrt(d) + iArr[(-19635 >>> 1) % N]));
        Test.instanceCount = (long)(i9 + (++fArr[(i9 >>> 1) % N]));
        vMeth1(i9);
        for (i11 = 7; i11 < 387; i11++) {
            Test.instanceCount -= (long)d;
            if (false) {
                for (i13 = 1; 4 > i13; ++i13) {
                    fArr[i11] -= i12;
                    if (Test.bFld) continue;
                    if (i8 != 0) {
                        vMeth_check_sum += Double.doubleToLongBits(d) + i8 + i9 + i11 + i12 + i13 + i14 +
                            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    if (Test.bFld) break;
                    i9 -= i13;
                    i9 += i14;
                }
                Test.instanceCount += (((i11 * i12) + i11) - i11);
                i8 += i9;
                vMeth_check_sum += Double.doubleToLongBits(d) + i8 + i9 + i11 + i12 + i13 + i14 +
                    FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            } else {
                i14 |= i11;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i8 + i9 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(long l, long l1, float f1) {

        int i6=-252, i7=20425, i15=220;
        short s=22895;
        long l2=2762998564L;

        i6 = 1;
        do {
            i7 += (((i6 * i6) + f1) - i7);
            vMeth(-90.106823, i7, i6);
            Test.bFld = false;
            f1 += s;
            f1 += (i6 * i6);
            i7 = i6;
            i15 = 1;
            while (++i15 < 5) {
                s += (short)i6;
                l1 += 59355;
                i7 -= (int)l2;
                switch (((i6 % 2) * 5) + 34) {
                case 41:
                    Test.instanceCount ^= i15;
                    l1 = i15;
                    i7 = (int)l;
                    break;
                case 37:
                    i7 += i6;
                    break;
                default:
                    i7 += (int)Test.instanceCount;
                }
            }
        } while (++i6 < 375);
        long meth_res = l + l1 + Float.floatToIntBits(f1) + i6 + i7 + s + i15 + l2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-129, i1=-109, i2=96, i3=-240, i4=-9, i5=57279, i16=43142, i17=4, i18=224, i19=-4, i20=-4509;
        float f=2.940F;
        double d1=-69.72946, dArr[]=new double[N];
        byte by=90;

        FuzzerUtils.init(dArr, 8.56079);

        for (i = 14; 239 > i; i += 2) {
            for (i2 = 1; i2 < 224; i2++) {
                iArrFld[i] = (++iArrFld[i2]);
                for (i4 = 1; 2 > i4; i4++) {
                    i5 += (int)((6 - dArr[i]) - ((Test.instanceCount * i3) % ((2 - (i4 - i2)) | 1)));
                    i5 = (int)(Test.instanceCount - ((f + i2) * (Test.instanceCount + 0.421F)));
                    iArrFld[i4] = (int)fArrFld[i4];
                    switch ((i % 1) + 79) {
                    case 79:
                        i3 *= (int)(Integer.reverseBytes(iMeth(Test.instanceCount, Test.instanceCount, f)) -
                            Test.instanceCount);
                        i3 &= i4;
                        Test.lArrFld[i2 + 1] <<= Test.instanceCount;
                        i5 += (int)(2452902185156962523L + (i4 * i4));
                        break;
                    }
                    i5 = (int)Test.instanceCount;
                }
                i5 -= i4;
                f += (i2 * i2);
                i5 |= i4;
                i1 -= 4;
            }
            for (i16 = i; i16 < 224; i16++) {
                i5 += (i16 ^ i17);
            }
            Test.instanceCount = Test.instanceCount;
            i18 = 1;
            do {
                i19 = 1;
                while (--i19 > 0) {
                    i3 += (((i19 * i) + Test.instanceCount) - i4);
                    f *= i1;
                }
                d1 += i18;
                i3 -= (int)Test.instanceCount;
                i20 = 1;
                while ((i20 -= 3) > 0) {
                    by += (byte)154;
                }
                i1 >>= -34969;
                iArrFld[i18 - 1] += i;
            } while (++i18 < 224);
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("f i16 i17 = " + Float.floatToIntBits(f) + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 d1 = " + i18 + "," + i19 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i20 by dArr = " + i20 + "," + by + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld iArrFld = " + Test.instanceCount + "," + (Test.bFld ? 1 :
            0) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("fArrFld Test.lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) +
            "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}