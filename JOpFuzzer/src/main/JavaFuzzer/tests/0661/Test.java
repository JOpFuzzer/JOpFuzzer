// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-5466981273235364619L;
    public int iFld=-146;
    public static int iFld1=207;
    public float fFld=0.362F;
    public volatile int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -58340);
        FuzzerUtils.init(Test.lArrFld, -2L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(short s1) {

        boolean b1=true;

        b1 = false;
        Test.lArrFld[(Test.iFld1 >>> 1) % N][(Test.iFld1 >>> 1) % N] -= Test.iFld1;
        long meth_res = s1 + (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4, int i5) {

        int i6=7, i7=-18694, i8=197, i9=0;
        boolean b=true, bArr[]=new boolean[N];
        short s=268;
        double d1=0.49415;
        long l=4L;
        float f1=-123.648F;

        FuzzerUtils.init(bArr, true);

        i6 = 269;
        while ((i6 -= 2) > 0) {
            b = (b = bArr[i6]);
        }
        i7 = 1;
        do {
            s += (short)(i7 * i7);
            Test.iArrFld1[i7] = (int)(((-2 - iMeth(s)) + d1) + s);
            for (l = 11; l > 1; --l) {
                i5 = i7;
                i9 = 2;
                do {
                    Test.iArrFld1[i9 - 1] = -38380;
                    f1 -= i8;
                    i8 += (int)d1;
                    Test.instanceCount *= i4;
                } while (--i9 > 0);
                Test.iArrFld1[(int)(l)] = i9;
                i5 += i9;
                i5 += (int)l;
            }
        } while (++i7 < 137);
        vMeth_check_sum += i4 + i5 + i6 + (b ? 1 : 0) + i7 + s + Double.doubleToLongBits(d1) + l + i8 + i9 +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(bArr);
    }

    public static long lMeth() {

        int i=-53527, i1=-1, i2=-4, i3=57510, i10=0, i11=-37, i12=-62705, i13=10, iArr[]=new int[N];
        float f=-111.483F;
        double d=-85.13337;
        boolean b2=false, bArr1[]=new boolean[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(bArr1, false);
        FuzzerUtils.init(iArr, 101);
        FuzzerUtils.init(byArr, (byte)20);

        i -= (int)((-161 & (Test.instanceCount - i)) * ((i--) - (i * Test.instanceCount)));
        f += Test.instanceCount;
        Test.iFld1 *= (int)(d - ((--f) + (Test.iFld1++)));
        for (i1 = 12; i1 < 389; ++i1) {
            i3 = 4;
            while (--i3 > 0) {
                vMeth(28212, i10);
                bArr1[i3 + 1] = b2;
                i10 *= (int)Test.instanceCount;
                d -= i10;
                iArr[i1 + 1] -= i2;
                Test.iFld1 -= -12;
            }
            i11 += (-109 + (i1 * i1));
            for (i12 = i1; i12 < 4; ++i12) {
                Test.instanceCount += Test.instanceCount;
                byArr[i12] = (byte)i1;
            }
        }
        long meth_res = i + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i1 + i2 + i3 + i10 + (b2 ? 1 : 0) +
            i11 + i12 + i13 + FuzzerUtils.checkSum(bArr1) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=58;
        float f2=0.972F, f3=0.531F, fArr[]=new float[N];
        int i14=-8588, i15=-25403, i16=-212, i17=-10320, i18=-56400;
        boolean b3=true, bArr2[][]=new boolean[N][N];

        FuzzerUtils.init(bArr2, true);
        FuzzerUtils.init(fArr, 27.458F);

        Test.instanceCount *= (iArrFld[(iFld >>> 1) % N] <<= (int)lMeth());
        by &= (byte)Test.instanceCount;
        Test.iFld1 >>>= iFld;
        for (f2 = 3; f2 < 245; ++f2) {
            switch ((int)((f2 % 2) + 105)) {
            case 105:
                Test.lArrFld[(int)(f2 - 1)][(int)(f2)] -= 3296019698L;
                Test.iFld1 += (int)Test.instanceCount;
                for (i15 = (int)(f2); i15 < 104; i15++) {
                    bArr2[(int)(f2)][i15 + 1] = b3;
                    Test.instanceCount >>>= 14;
                    i14 += -59826;
                    Test.iFld1 ^= (int)Test.instanceCount;
                    fFld += i15;
                    Test.iFld1 += i16;
                    i14 += i15;
                }
                Test.iFld1 <<= 9803;
                break;
            case 106:
                iArrFld[(int)(f2)] = (int)f2;
                i17 = 1;
                while (++i17 < 104) {
                    by = (byte)Test.instanceCount;
                    fFld -= -9;
                    iFld *= (int)Test.instanceCount;
                    for (f3 = 1; f3 > f2; --f3) {
                        Test.iFld1 -= (int)f2;
                        by = (byte)-11;
                        Test.iFld1 *= i14;
                    }
                    fArr = fArr;
                }
            }
            Test.iFld1 *= -61;
            i18 += iFld;
            fFld -= i16;
            i18 += (int)(((f2 * i16) + i14) - i18);
        }

        FuzzerUtils.out.println("by f2 i14 = " + by + "," + Float.floatToIntBits(f2) + "," + i14);
        FuzzerUtils.out.println("i15 i16 b3 = " + i15 + "," + i16 + "," + (b3 ? 1 : 0));
        FuzzerUtils.out.println("i17 f3 i18 = " + i17 + "," + Float.floatToIntBits(f3) + "," + i18);
        FuzzerUtils.out.println("bArr2 fArr = " + FuzzerUtils.checkSum(bArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.iFld1 = " + Test.instanceCount + "," + iFld + "," +
            Test.iFld1);
        FuzzerUtils.out.println("fFld iArrFld Test.iArrFld1 = " + Float.floatToIntBits(fFld) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld1));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
