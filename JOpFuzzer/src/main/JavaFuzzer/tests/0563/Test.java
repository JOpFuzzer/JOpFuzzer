// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-124L;
    public int iFld=202;
    public int iFld1=10;
    public static volatile byte byFld=-94;
    public short sFld=-6735;
    public static long lFld=4L;
    public float fArrFld[]=new float[N];

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(int i3) {

        double d=-1.92282;

        d += (-(d--));
        vSmallMeth_check_sum += i3 + Double.doubleToLongBits(d);
    }

    public static void vMeth(int i8, int i9, int i10) {

        float f2=114.436F, f3=-1.52F, fArr[][]=new float[N][N];
        int i11=7, iArr1[]=new int[N];
        boolean b=true;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr1, -6);
        FuzzerUtils.init(lArr, -14L);
        FuzzerUtils.init(fArr, 78.13F);

        vSmallMeth(i10);
        f2 = 1;
        while (++f2 < 330) {
            iArr1[(int)(f2 + 1)] = (int)Test.instanceCount;
        }
        i8 = i9;
        i10 <<= (int)190005198L;
        i10 -= (int)f2;
        i11 = 1;
        do {
            lArr[i11 - 1][i11 + 1] >>= Test.instanceCount;
            if (true) continue;
            i9 += i11;
            fArr[i11][i11 - 1] -= i8;
            if (b) continue;
        } while (++i11 < 361);
        f3 *= f3;
        i9 += 14;
        b = b;
        vMeth_check_sum += i8 + i9 + i10 + Float.floatToIntBits(f2) + i11 + (b ? 1 : 0) + Float.floatToIntBits(f3) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(int i4, float f1) {

        int i5=-140, i6=-62, i7=-195, i12=-10, i13=-5, i14=4, iArr2[][]=new int[N][N];
        boolean b1=true, bArr[][]=new boolean[N][N];
        byte by=-18;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -84.103157);
        FuzzerUtils.init(iArr2, -5);
        FuzzerUtils.init(bArr, false);

        i5 = 1;
        while (++i5 < 205) {
            for (i6 = 1; i6 < 8; ++i6) {
                vMeth(i7, i4, i6);
            }
            i7 += (int)-117.445F;
            i12 = 1;
            while (++i12 < 8) {
                for (i13 = 1; i13 < 1; i13++) {
                    iArr2[i12 - 1][i5 - 1] %= (int)((long)(f1) | 1);
                    if (b1) {
                        bArr[i12 - 1][i5] = b1;
                        switch (((i5 % 8) * 5) + 87) {
                        case 100:
                            i4 -= i7;
                            break;
                        case 123:
                            iArr2[i5 - 1][i13 - 1] &= (int)Test.instanceCount;
                            i4 = -12;
                            i7 *= -5;
                            by = (byte)Test.instanceCount;
                        case 99:
                            iArr2[i13 + 1][i12 - 1] -= i14;
                            break;
                        case 117:
                            i7 += i13;
                        case 127:
                            i4 += (i13 * i14);
                            break;
                        case 107:
                            i7 = (int)Test.instanceCount;
                            break;
                        case 101:
                        case 125:
                            iArr2[i12 + 1] = iArr2[i5];
                            break;
                        default:
                            i4 += i7;
                        }
                    } else if (false) {
                        iArr2[i13 - 1][i5 - 1] <<= (int)Test.instanceCount;
                    } else if (b1) {
                        i14 <<= i7;
                    }
                }
            }
        }
        long meth_res = i4 + Float.floatToIntBits(f1) + i5 + i6 + i7 + i12 + i13 + i14 + (b1 ? 1 : 0) + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-2479, i1=16461, i2=139, i15=247, i16=11, i17=1, i18=-11, i19=36387, iArr[]=new int[N];
        double d1=1.87940;
        float f=-87.750F;
        long l=-4089517707L;
        boolean b2=false, b3=true;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 9);
        FuzzerUtils.init(byArr, (byte)-29);

        for (i = 6; i < 199; i++) {
            i2 = 1;
            do {
                Test.instanceCount += (((i2 * i2) + iFld) - iFld1);
                for (int smallinvoc=0; smallinvoc<1; smallinvoc++) vSmallMeth(i2);
                i1 -= (int)(i - ((3582993434540620680L + iArr[i2]) + (iFld + i1)));
                Test.instanceCount = (long)(((iFld1 + Test.instanceCount) + i1) + ((i1 + d1) - iFld));
                f -= (float)((iMeth(i, f) + 46705) - -2.129882);
                Test.byFld = (byte)sFld;
                iFld = iFld1;
                Test.instanceCount -= 10L;
                for (i15 = 4; i15 > 1; i15--) {
                    f += ((long)i15 ^ (long)f);
                    iFld = i15;
                    byArr[i15 + 1] += (byte)l;
                    i16 = i2;
                    if (b2) {
                        Test.lFld <<= Test.lFld;
                    }
                    fArrFld[i + 1] = Test.instanceCount;
                    i1 -= (int)Test.instanceCount;
                    i16 <<= (int)Test.instanceCount;
                    b3 = b3;
                }
            } while ((i2 += 3) < 130);
            f = i16;
            i17 = 1;
            do {
                for (i18 = 1; i18 < 1; ++i18) {
                    iFld += i2;
                    iFld += (i18 * i18);
                    i1 += i18;
                }
                iArr[i17 - 1] = (int)Test.instanceCount;
                f = i17;
                i16 %= -188;
            } while (++i17 < 130);
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("d1 f i15 = " + Double.doubleToLongBits(d1) + "," + Float.floatToIntBits(f) + "," +
            i15);
        FuzzerUtils.out.println("i16 l b2 = " + i16 + "," + l + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("b3 i17 i18 = " + (b3 ? 1 : 0) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 iArr byArr = " + i19 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount iFld iFld1 = " + Test.instanceCount + "," + iFld + "," + iFld1);
        FuzzerUtils.out.println("Test.byFld sFld Test.lFld = " + Test.byFld + "," + sFld + "," + Test.lFld);
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
