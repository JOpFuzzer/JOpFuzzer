// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:51 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-4003259423L;
    public static byte byFld=-69;
    public static double dFld=111.74342;
    public static int iFld=13;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -6);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i6=-14, i7=-14;
        float f3=0.706F;
        double d=1.40415;

        for (i6 = 393; 13 < i6; i6--) {
            i7 = (int)f3;
            i7 += (i6 * i6);
            d += f3;
            i7 = i7;
        }
        i7 = i7;
        vMeth1_check_sum += i6 + i7 + Float.floatToIntBits(f3) + Double.doubleToLongBits(d);
    }

    public static void vMeth(int i3, int i4, float f1) {

        float f2=2.521F;
        int i5=64311, i8=-66, i9=-12;
        double d1=-119.50746;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 6L);

        for (f2 = 10; 306 > f2; f2++) {
            vMeth1();
            i3 >>>= (int)Test.instanceCount;
            i3 = i3;
            i3 += (int)(((f2 * i3) + i4) - i3);
            lArr = lArr;
            i4 = i3;
            i3 = Test.byFld;
            if (i4 != 0) {
                vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i5 + i8 + i9 +
                    Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr);
                return;
            }
            i5 ^= 59803;
            for (i8 = 1; i8 < 6; ++i8) {
                d1 -= Test.instanceCount;
                f1 += i8;
                i4 = i9;
                Test.instanceCount *= Test.byFld;
            }
        }
        vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i5 + i8 + i9 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i2) {

        float f4=-2.684F;
        int i10=-2, i11=241, i12=-52071, iArr[]=new int[N];
        boolean b=false;
        short s=-950;

        FuzzerUtils.init(iArr, 13);

        vMeth(i2, 51666, f4);
        for (i10 = 11; i10 < 377; ++i10) {
            iArr[i10 - 1] += 14;
            i11 += (((i10 * i10) + i10) - Test.instanceCount);
            i11 >>>= i11;
            i12 = 1;
            do {
                i2 = i12;
                i11 |= i2;
                b = b;
                s += (short)i2;
                s += (short)i12;
                if (i11 != 0) {
                }
                b = b;
                i11 += (((i12 * i12) + Test.instanceCount) - f4);
                iArr[i12] &= -48934;
            } while (++i12 < 5);
        }
        long meth_res = i2 + Float.floatToIntBits(f4) + i10 + i11 + i12 + (b ? 1 : 0) + s + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=7, i1=-40424, i13=7, i14=44104, i15=9, i16=-4, i17=62346, i18=49313, i19=-194, i20=-42883, i21=-9,
            i22=-8584, i23=42, i24=43364;
        float f=0.496F;
        double d2=67.53292;
        boolean b1=true;
        short sArr[]=new short[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(sArr, (short)3115);
        FuzzerUtils.init(lArr1, -48L);

        for (i = 11; 269 > i; i++) {
            short s1=117;
            switch ((((i1 + i) >>> 1) % 7) + 33) {
            case 33:
                f = iMeth(-50945);
                f += i;
                for (i13 = 97; 3 < i13; i13--) {
                    for (d2 = i; d2 < 2; ++d2) {
                        Test.dFld = i;
                        i14 -= 0;
                    }
                }
                break;
            case 34:
                Test.byFld += (byte)i13;
                Test.iArrFld[i + 1] = 197;
                sArr[i] = (short)248L;
                break;
            case 35:
                for (i16 = 4; i16 < 97; ++i16) {
                    b1 = b1;
                    f -= Test.instanceCount;
                }
                for (i18 = 1; i18 < 97; i18++) {
                    Test.dFld -= -11;
                    i20 = 1;
                    do {
                        i15 += (19868 + (i20 * i20));
                        if (b1) continue;
                        i1 |= (int)Test.instanceCount;
                        lArr1[i18 + 1] += Test.instanceCount;
                        i17 *= Test.iFld;
                        Test.iArrFld[i20] = (int)Test.instanceCount;
                    } while (++i20 < 2);
                }
                Test.instanceCount += Test.instanceCount;
                break;
            case 36:
                s1 |= (short)i19;
                for (i21 = 6; i21 < 97; i21 += 2) {
                    f *= f;
                    for (i23 = 1; i23 < 3; i23++) {
                        i1 <<= (int)Test.instanceCount;
                        i17 += (int)Test.instanceCount;
                    }
                }
                break;
            case 37:
                if (true) break;
                break;
            case 38:
                Test.instanceCount = Test.instanceCount;
                break;
            case 39:
                i14 |= 45371;
                break;
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i13 i14 d2 = " + i13 + "," + i14 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("b1 i18 i19 = " + (b1 ? 1 : 0) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 sArr = " + i23 + "," + i24 + "," + FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.dFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iFld Test.iArrFld = " + Test.iFld + "," + FuzzerUtils.checkSum(Test.iArrFld));

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
