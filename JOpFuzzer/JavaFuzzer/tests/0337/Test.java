// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-63690L;
    public static volatile double dFld=31.87131;
    public boolean bFld=true;
    public static short sFld=-9524;
    public byte byFld=-87;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 14);
        FuzzerUtils.init(Test.lArrFld, -5549444627239513099L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i6, int i7) {

        float f=12.434F;

        f += i7;
        i6 += (int)f;
        i6 *= (int)f;
        l &= i7;
        vMeth2_check_sum += l + i6 + i7 + Float.floatToIntBits(f);
    }

    public static void vMeth1(int i4) {

        int i5=-55315, i8=56168, i9=239, i10=6, i11=49755, i12=-49887, i13=-1;
        float f1=-48.494F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -53.620F);

        i5 = 1;
        do {
            Test.instanceCount -= ((i4--) - Test.iArrFld[i5]);
            vMeth2(-3L, i5, 175);
            i4 = (int)f1;
            Test.instanceCount += (i5 - i5);
            for (i8 = 8; i8 > i5; i8--) {
                Test.iArrFld[i5 - 1] += i9;
                for (i10 = 1; 1 < i10; i10 -= 3) {
                    Test.instanceCount *= i5;
                }
                switch (((i9 >>> 1) % 10) + 42) {
                case 42:
                    i9 <<= i10;
                    for (i12 = 1; i12 < 1; i12++) {
                        i9 = (int)Test.instanceCount;
                        Test.iArrFld[i8] -= i13;
                    }
                    fArr[i5 - 1] += Test.instanceCount;
                    break;
                case 43:
                    i11 *= -12884;
                    break;
                case 44:
                    i9 -= i12;
                case 45:
                    Test.dFld -= i4;
                    break;
                case 46:
                    Test.iArrFld[i8] = -79;
                    break;
                case 47:
                    Test.instanceCount += i11;
                    break;
                case 48:
                    i13 += i13;
                    break;
                case 49:
                case 50:
                    Test.lArrFld[i8] ^= i4;
                    break;
                case 51:
                    i13 += (((i8 * i8) + i12) - f1);
                    break;
                }
            }
        } while (++i5 < 204);
        vMeth1_check_sum += i4 + i5 + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + i13 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth(int i1) {

        double d=-2.10809;
        int i2=-13, i14=-1, i15=26402, i16=49, i17=21437, i18=-181, i19=154;
        float f2=2.0F;

        i1 += (int)(Math.max(Test.iArrFld[(i1 >>> 1) % N], (int)(Test.instanceCount << 2)) + ((i1 + i1) - d));
        i2 = 1;
        do {
            int i3=118;
            if (bFld) {
                i1 = i3;
                vMeth1(i1);
            }
        } while (++i2 < 169);
        for (i14 = 2; i14 < 160; ++i14) {
            f2 += (((i14 * i14) + Test.instanceCount) - i2);
            switch ((((48055 >>> 1) % 1) * 5) + 4) {
            case 6:
                for (i16 = 1; i16 < 10; i16++) {
                    for (i18 = 1; i18 < 2; i18++) {
                        if (bFld) continue;
                        i1 -= (int)f2;
                        f2 = i19;
                        i15 *= Test.sFld;
                        i17 *= (int)Test.instanceCount;
                    }
                }
                break;
            }
        }
        vMeth_check_sum += i1 + Double.doubleToLongBits(d) + i2 + i14 + i15 + Float.floatToIntBits(f2) + i16 + i17 +
            i18 + i19;
    }

    public void mainTest(String[] strArr1) {

        int i=39, i20=5, i21=-206, i22=204, i23=-83, i24=-40680, i25=16104;
        long l1=3664677820L;

        i -= (int)(-(-Float.intBitsToFloat(i)));
        vMeth(205);
        i += i;
        for (i20 = 1; i20 < 185; ++i20) {
            i22 = 1;
            while (++i22 < 136) {
                i21 *= i20;
                Test.instanceCount /= (byFld | 1);
                i21 += (int)Test.dFld;
            }
            Test.iArrFld[i20] -= (int)-48.450F;
            for (i23 = 1; i23 < 136; i23 += 3) {
                float f3=124.147F;
                f3 += 69;
                l1 = 4;
                do {
                    Test.instanceCount = 46;
                    Test.instanceCount = 9;
                    switch ((i23 % 6) + 56) {
                    case 56:
                        Test.instanceCount += l1;
                        Test.instanceCount += 7366594638828044273L;
                        switch ((((i >>> 1) % 4) * 5) + 46) {
                        case 50:
                            i21 += (int)l1;
                        case 57:
                            i24 += (int)(((l1 * i20) + byFld) - i);
                            i21 += i23;
                            i21 += (int)(l1 - i20);
                            break;
                        case 47:
                            i24 = i23;
                            break;
                        case 58:
                            f3 += (-108.531F + (l1 * l1));
                            i21 = (int)Test.instanceCount;
                            i21 *= (int)l1;
                            bFld = true;
                        default:
                            Test.dFld += l1;
                        }
                        i = (int)-1.805F;
                        break;
                    case 57:
                        i21 += (int)l1;
                        break;
                    case 58:
                        i21 = Test.sFld;
                        break;
                    case 59:
                        Test.instanceCount += l1;
                        break;
                    case 60:
                        i -= (int)f3;
                        break;
                    case 61:
                        byFld = (byte)i;
                        break;
                    default:
                        i25 -= i24;
                    }
                } while (--l1 > 0);
            }
        }

        FuzzerUtils.out.println("i i20 i21 = " + i + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("l1 i25 = " + l1 + "," + i25);

        FuzzerUtils.out.println("Test.instanceCount Test.dFld bFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.sFld byFld Test.iArrFld = " + Test.sFld + "," + byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}