// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-40492L;
    public static float fFld=-1.170F;
    public static volatile double dFld=-103.17209;
    public static volatile boolean bFld=true;
    public byte byFld=-118;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -43638);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l, long l1, byte by) {

        int i5=42099, i6=37933, i7=57854, i8=14, i9=9, i10=11;
        double d1=-40.102242;

        Test.fFld = l1;
        i5 -= 28709;
        i6 = 1;
        while ((i6 += 2) < 398) {
            i5 += by;
            for (i7 = 1; i7 < 8; i7++) {
                for (i9 = 1; i9 < 2; ++i9) {
                    Test.fFld += (i9 * i5);
                    i8 += (int)(-14L + (i9 * i9));
                    d1 += -2310168803L;
                    i10 = (int)Test.instanceCount;
                    l1 <<= i5;
                    Test.instanceCount += (i9 * i9);
                    Test.iArrFld[i6] -= i8;
                }
                l += (long)d1;
            }
            i5 = i5;
        }
        long meth_res = l + l1 + by + i5 + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(boolean b) {

        int i4=50, i11=-58439, i12=-24343, i13=85, i14=-4, i15=12, i16=-48399;
        double d=2.111740;
        short s=-9008;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -4543972899221971742L);

        Test.iArrFld = Test.iArrFld;
        Test.instanceCount &= (long)((Math.abs(i4) - (i4 * i4)) * ((Test.instanceCount + d) + 201L));
        i4 *= (-iMeth(Test.instanceCount, -1L, (byte)(61)));
        for (i11 = 3; i11 < 337; i11++) {
            for (i13 = 5; i13 > 1; i13--) {
                switch (((i11 % 2) * 5) + 83) {
                case 86:
                    if (b) continue;
                    i14 += i13;
                    for (i15 = 1; i15 < 2; ++i15) {
                        i16 += (i15 * i15);
                        try {
                            i4 = (Test.iArrFld[i11] % -194);
                            i16 = (i12 / Test.iArrFld[i15]);
                            Test.iArrFld[i11] = (163 % i4);
                        } catch (ArithmeticException a_e) {}
                        s = (short)i15;
                        Test.iArrFld[i13] = 9;
                        i4 += s;
                        if (i4 != 0) {
                        }
                    }
                    break;
                case 88:
                    lArr[i13] = (long)d;
                default:
                    i16 = (int)Test.instanceCount;
                }
            }
        }
        long meth_res = (b ? 1 : 0) + i4 + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + i15 + i16 + s +
            FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(float f, int i3) {


        i3 -= (int)((Math.abs(Test.instanceCount) * i3) - (-(-238 - lMeth(false))));
        vMeth_check_sum += Float.floatToIntBits(f) + i3;
    }

    public void mainTest(String[] strArr1) {

        int i=-151, i1=1, i2=-11, i17=11, i18=168, i19=6, i20=-77, i21=-133, i22=48249, i23=-14;
        boolean bArr[]=new boolean[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr1, 4131468893L);

        i &= i;
        Test.instanceCount *= (-((-Integer.reverseBytes(i)) - i));
        for (i1 = 12; i1 < 243; ++i1) {
            vMeth(1.827F, i);
            Test.iArrFld[i1] = (int)Test.dFld;
            i >>= -175;
        }
        for (i17 = 17; 289 > i17; ++i17) {
            i18 = i1;
            i19 = 1;
            do {
                i += (int)Test.dFld;
                for (i20 = 1; i20 > 1; --i20) {
                    i = i19;
                    i21 -= i19;
                    Test.instanceCount += (((i20 * i21) + i2) - Test.instanceCount);
                    Test.bFld = Test.bFld;
                    i21 -= i18;
                    if (true) continue;
                    Test.dFld += i;
                    byFld = (byte)-7665003566214472231L;
                    i21 &= i21;
                }
                for (i22 = 1; i22 < 1; ++i22) {
                    Test.iArrFld[i19] >>= i22;
                    if (Test.bFld) {
                        bArr[i19 + 1] = true;
                    } else if (false) {
                        lArr1 = lArr1;
                    } else if (false) {
                        Test.fFld += Test.instanceCount;
                        switch ((i19 % 2) + 111) {
                        case 111:
                            Test.dFld += -1.761F;
                            i21 *= 55189;
                            i2 &= (int)Test.instanceCount;
                            break;
                        case 112:
                            i23 <<= i2;
                            break;
                        default:
                            i2 -= i22;
                        }
                    } else {
                        Test.instanceCount += (long)1.595F;
                    }
                }
            } while (++i19 < 92);
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 bArr lArr1 = " + i23 + "," + FuzzerUtils.checkSum(bArr) + "," +
            FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld byFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," + byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}