// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:55 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=730513657L;
    public static volatile double dFld=-127.99415;
    public static boolean bFld=true;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 16116);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1, int i1, int i2) {

        int i3=-15, i4=44329, i5=-48505, i6=12, i7=0, i8=54627, iArr[]=new int[N];
        float f=-37.642F, f1=0.779F;

        FuzzerUtils.init(iArr, -29905);

        i3 = 1;
        do {
            i1 <<= i1;
            for (f = 1; 8 > f; ++f) {
                iArr[i3] -= (int)l1;
                f1 = f;
                i2 += (int)-1.588F;
                i4 += (int)-41L;
                if (i2 != 0) {
                    vMeth2_check_sum += l1 + i1 + i2 + i3 + Float.floatToIntBits(f) + i4 + Float.floatToIntBits(f1) +
                        i5 + i6 + i7 + i8 + FuzzerUtils.checkSum(iArr);
                    return;
                }
                i1 >>= i3;
                Test.instanceCount *= i3;
            }
            for (i5 = 1; i5 < 8; i5++) {
                switch (((i5 % 6) * 5) + 105) {
                case 132:
                    for (i7 = 1; i7 < 2; i7++) {
                        i1 += (i7 ^ Test.instanceCount);
                        Test.dFld += l1;
                    }
                case 135:
                    Test.instanceCount = (long)f1;
                    break;
                case 119:
                    i8 = i8;
                    break;
                case 109:
                    i4 += 2;
                case 131:
                    i4 = i3;
                    break;
                case 115:
                    i6 += (((i5 * i8) + i1) - i3);
                    break;
                default:
                    Test.dFld += f1;
                }
            }
        } while (++i3 < 214);
        vMeth2_check_sum += l1 + i1 + i2 + i3 + Float.floatToIntBits(f) + i4 + Float.floatToIntBits(f1) + i5 + i6 + i7
            + i8 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i) {

        double d=0.51071;
        int i9=8, i10=261, i11=-18360, i12=-44793, i13=0, i14=-48122, i15=2, i16=-10, i17=-48849;
        float f2=1.998F;
        long l2=-2L;

        vMeth2(Test.instanceCount, i, i);
        try {
            for (d = 5; d < 187; ++d) {
                f2 += l2;
                for (i10 = 1; i10 < 9; ++i10) {
                    f2 += i10;
                }
            }
        }
        catch (NegativeArraySizeException exc1) {
            for (i12 = 3; i12 < 126; ++i12) {
                for (i14 = 1; 13 > i14; ++i14) {
                    Test.iArrFld[i14][i12 - 1] |= i;
                    for (i16 = 1; i16 < 2; ++i16) {
                        Test.dFld -= Test.dFld;
                        i17 = i15;
                    }
                    Test.iArrFld[i14 - 1][i12 - 1] = (int)Test.instanceCount;
                    Test.dFld = l2;
                    Test.dFld -= i9;
                }
            }
        }
        finally {
            Test.instanceCount -= -146;
        }
        vMeth1_check_sum += i + Double.doubleToLongBits(d) + i9 + Float.floatToIntBits(f2) + l2 + i10 + i11 + i12 + i13
            + i14 + i15 + i16 + i17;
    }

    public static void vMeth(long l) {

        int i18=4;
        byte by=111;
        short s=20707;

        vMeth1(24460);
        if (Test.bFld) {
            i18 <<= -45090;
            Test.bFld = Test.bFld;
            i18 |= i18;
        } else if (Test.bFld) {
            i18 += by;
        }
        i18 = i18;
        s -= (short)l;
        i18 *= (int)Test.dFld;
        vMeth_check_sum += l + i18 + by + s;
    }

    public void mainTest(String[] strArr1) {

        int i19=182, i20=-1, i21=12, i22=4, i23=140, i24=-34373, i25=34, i26=-10, i27=15854, i28=32711, i29=-180,
            i30=127, i31=19432;
        float f3=2.102F;
        short s1=-4683;

        vMeth(Test.instanceCount);
        i19 = 192;
        do {
            i20 += (i19 * Test.instanceCount);
        } while (--i19 > 0);
        i21 = 1;
        while ((i21 += 3) < 224) {
            Test.iArrFld[i21 + 1][i21 + 1] += i21;
            Test.bFld = Test.bFld;
            Test.instanceCount += 38824;
            i20 |= 1;
            i22 += (((i21 * i19) + i19) - Test.instanceCount);
            i22 = i22;
        }
        for (i23 = 13; 316 > i23; i23 += 2) {
            Test.instanceCount <<= -95;
            i22 = i24;
            i24 -= (int)f3;
            for (i25 = 10; 166 > i25; i25++) {
                Test.dFld -= Test.instanceCount;
                f3 *= i25;
                Test.instanceCount += s1;
                Test.iArrFld[i25][i25] >>= (int)Test.instanceCount;
                i20 += (i25 + i20);
                i27 = 1;
                do {
                    i20 *= i22;
                    i20 |= (int)Test.instanceCount;
                } while (++i27 < 2);
                i24 = i26;
                i26 = -3;
            }
        }
        for (i28 = 14; i28 < 378; i28++) {
            for (i30 = 4; i30 < 69; ++i30) {
                i29 <<= i25;
            }
        }
        i20 = (int)Test.instanceCount;
        Test.iArrFld[(i23 >>> 1) % N][(i20 >>> 1) % N] *= -60847;

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("f3 i25 i26 = " + Float.floatToIntBits(f3) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("s1 i27 i28 = " + s1 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

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
