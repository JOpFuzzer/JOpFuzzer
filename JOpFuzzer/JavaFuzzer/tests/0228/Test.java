// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:46 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-9L;
    public static int iFld=-4024;
    public static float fFld=0.825F;
    public static volatile boolean bFld=true;
    public short sFld=31280;
    public static double dFld=-51.125242;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -58311);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i6=-16657, i7=-61334, i8=-43540, i9=64884, i10=-127;
        double d=2.46847;
        short s=22862;
        boolean b=true;

        for (i6 = 3; i6 < 257; ++i6) {
            Test.fFld *= Test.iFld;
            if (b) {
                switch ((i6 % 7) + 28) {
                case 28:
                    i8 = 1;
                    do {
                        d -= -3L;
                        s += (short)(-217 + (i8 * i8));
                        i7 -= Test.iFld;
                        for (i9 = 1; i9 < 1; ++i9) {
                            i7 >>>= (int)Test.instanceCount;
                            i7 = 141;
                            switch (((Test.iFld >>> 1) % 4) + 6) {
                            case 6:
                                Test.instanceCount <<= 22033;
                                Test.iFld <<= i7;
                                Test.instanceCount -= Test.instanceCount;
                                break;
                            case 7:
                                i7 >>= (int)Test.instanceCount;
                            case 8:
                                Test.instanceCount += i9;
                            case 9:
                                Test.instanceCount += (i9 * i9);
                            }
                        }
                    } while (++i8 < 6);
                case 29:
                    i10 = Test.iFld;
                case 30:
                    i7 += (((i6 * s) + i6) - i8);
                    break;
                case 31:
                    Test.instanceCount <<= i7;
                    break;
                case 32:
                case 33:
                    d = Test.instanceCount;
                case 34:
                    if (b) break;
                    break;
                }
            } else {
                Test.iArrFld[i6] -= i10;
                vMeth1_check_sum += i6 + i7 + i8 + Double.doubleToLongBits(d) + s + i9 + i10 + (b ? 1 : 0);
                return;
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + Double.doubleToLongBits(d) + s + i9 + i10 + (b ? 1 : 0);
    }

    public static void vMeth() {

        byte by1=97;
        int i4=49, i5=144, i11=36;
        double d1=-39.67654;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -2.1003F);

        for (int i3 : Test.iArrFld) {
            by1 += (byte)Test.fFld;
            for (i4 = 1; i4 < 4; i4++) {
                Test.iFld >>>= (++Test.iFld);
                vMeth1();
                i5 += (int)Test.fFld;
                Test.iFld = i3;
                fArr[i4 - 1] -= 126;
                i5 -= i3;
            }
            i3 *= by1;
            Test.iFld = i3;
            Test.iArrFld[(i4 >>> 1) % N] = i5;
            i11 = 1;
            while (++i11 < 4) {
                Test.iFld = (int)d1;
                d1 -= Test.instanceCount;
            }
        }
        vMeth_check_sum += by1 + i4 + i5 + i11 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static float fMeth() {

        byte by=93;
        float f=-2.131F, fArr1[]=new float[N];
        int i1=-19, i2=-17624, i12=6, i13=37613;
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr1, 46.391F);
        FuzzerUtils.init(dArr, 3.24791);

        if (Test.bFld) {
            switch (((((int)(by + f)) >>> 1) % 2) + 121) {
            case 121:
                Test.iFld <<= (int)((++Test.instanceCount) - ((Test.iFld++) + (f - Test.instanceCount)));
                break;
            case 122:
                for (i1 = 5; i1 < 191; i1++) {
                    Test.iFld += (i1 + i2);
                    vMeth();
                    Test.iArrFld[i1] &= (int)-66L;
                    Test.iArrFld[i1 + 1] = (int)59999L;
                    Test.fFld += i1;
                    for (i12 = i1; i12 < 9; ++i12) {
                        Test.iArrFld = Test.iArrFld;
                    }
                    Test.instanceCount = i1;
                    fArr1[i1 + 1] += i12;
                    Test.instanceCount = (long)1.80F;
                }
            }
            dArr[(-8 >>> 1) % N] += -8;
        } else {
            i13 = (int)-2.578F;
        }
        long meth_res = by + Float.floatToIntBits(f) + i1 + i2 + i12 + i13 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-11, i14=14, i15=-94, i16=47, i17=-47663, i18=-249, i19=-13480, iArr[]=new int[N];
        boolean b1=true;
        double d2=123.36379;
        float f1=90.749F, fArr2[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -196);
        FuzzerUtils.init(lArr, 6L);
        FuzzerUtils.init(fArr2, -10.532F);

        iArr[(i >>> 1) % N] -= (int)(iArr[(i >>> 1) % N] / (Test.instanceCount | 1));
        i = (int)fMeth();
        Test.bArrFld[(163 >>> 1) % N] = b1;
        for (i14 = 8; i14 < 199; i14++) {
            lArr = lArr;
            Test.instanceCount = Test.iFld;
            i15 += i14;
            Test.iArrFld[i14] = 192;
            if (Test.bFld) {
                Test.iFld -= i15;
                Test.instanceCount = Test.instanceCount;
                for (d2 = 6; d2 < 131; ++d2) {
                    i16 = i14;
                    Test.iFld += (int)d2;
                    for (f1 = (float)(d2); f1 < 2; ++f1) {
                        sFld ^= (short)i14;
                        if (Test.bFld) continue;
                        Test.instanceCount += (-2 + (f1 * f1));
                        Test.dFld += Test.fFld;
                        if (b1) break;
                    }
                    for (i18 = 1; i18 < 2; ++i18) {
                        fArr2[i14 + 1] *= i14;
                        lArr[i14 - 1] += -14408;
                        i17 = i17;
                        i15 = (int)Test.instanceCount;
                        Test.dFld -= Test.iFld;
                        Test.instanceCount = 122;
                        lArr[i18 + 1] -= i17;
                        Test.instanceCount -= Test.instanceCount;
                    }
                }
                Test.iFld += (i14 * i14);
            }
        }

        FuzzerUtils.out.println("i b1 i14 = " + i + "," + (b1 ? 1 : 0) + "," + i14);
        FuzzerUtils.out.println("i15 d2 i16 = " + i15 + "," + Double.doubleToLongBits(d2) + "," + i16);
        FuzzerUtils.out.println("f1 i17 i18 = " + Float.floatToIntBits(f1) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 iArr lArr = " + i19 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("fArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld sFld Test.dFld = " + (Test.bFld ? 1 : 0) + "," + sFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iArrFld Test.bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}