// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2014970169L;
    public int iFld=19183;
    public static double dFld=-1.111842;
    public static float fFld=-1.997F;
    public static volatile int iFld1=-8198;
    public static int iFld2=-13;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 0);
        FuzzerUtils.init(Test.dArrFld, 0.94056);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i9, int i10, int i11) {

        int i12=-236, i13=-10829, i14=-28899, i15=166, i16=-49;
        float f=0.1003F;
        boolean b=true;

        for (i12 = 5; i12 < 228; ++i12) {
            i14 = 1;
            do {
                i9 = 132;
                switch (((i14 % 6) * 5) + 18) {
                case 22:
                    i11 *= i9;
                    i11 = i13;
                    if (b) {
                        for (f = 1; 1 > f; f++) {
                            Test.iArrFld[(int)(f + 1)] = i15;
                            Test.fFld -= i11;
                            i10 ^= 42;
                            Test.instanceCount = Test.instanceCount;
                            Test.instanceCount -= i10;
                        }
                        Test.fFld += Test.instanceCount;
                        Test.fFld = i10;
                    } else {
                        Test.dArrFld[i12] += i13;
                    }
                    break;
                case 29:
                    Test.instanceCount -= 23603;
                    break;
                case 26:
                    Test.fFld -= i16;
                    break;
                case 41:
                    i16 += i10;
                    break;
                case 39:
                    Test.instanceCount -= Test.instanceCount;
                    break;
                case 43:
                    Test.fFld *= 68;
                    break;
                default:
                    if (true) break;
                }
            } while (++i14 < 7);
        }
        vMeth1_check_sum += i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f) + i15 + (b ? 1 : 0) + i16;
    }

    public static int iMeth(int i6, long l) {

        int i7=-13, i8=65471, i17=-6, i18=-41059, i19=9726, i20=5, i22=42078, iArr1[]=new int[N];
        byte by2=-6, byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, -87);
        FuzzerUtils.init(byArr, (byte)-88);

        Test.instanceCount -= ((-(i6--)) * (++i6));
        for (i7 = 11; 196 > i7; ++i7) {
            iArr1[i7] >>= (++iArr1[i7]);
            try {
                i6 = (iArr1[i7 + 1] / 3408);
                i6 = (21425 / i7);
                i6 = (i6 / -907112706);
            } catch (ArithmeticException a_e) {}
            vMeth1(i7, i8, i8);
            for (i17 = 9; i17 > 1; --i17) {
                i8 = i7;
            }
            byArr[i7] = (byte)i6;
            i8 = i6;
        }
        by2 = (byte)8873867037191811609L;
        for (i19 = 9; i19 < 208; i19++) {
            iArr1[i19 + 1] += 11;
            if (i22 != 0) {
            }
            Test.fFld *= i6;
            Test.iArrFld[i19] <<= (int)-5065676459728441903L;
        }
        long meth_res = i6 + l + i7 + i8 + i17 + i18 + by2 + i19 + i20 + i22 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i1, byte by1, int i2) {

        int i3=-79, i4=148, i5=-3, i23=-169, i24=-17002, iArr[]=new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr, 1948);

        i3 = 1;
        while (++i3 < 389) {
            for (i4 = 1; i4 < 4; ++i4) {
                switch ((i4 % 1) + 10) {
                case 10:
                }
                Test.instanceCount = ((long)((-35402 - (Test.dFld + Test.instanceCount)) - (Test.instanceCount - i4)) ^
                    ((i2 - i4) - (Test.instanceCount - 6)));
                iArr[i3] -= iMeth(2, Test.instanceCount);
                i5 = i4;
                Test.fFld += (i4 * Test.instanceCount);
                for (i23 = 1; 2 > i23; ++i23) {
                    Test.iFld1 += (int)Test.fFld;
                    i2 <<= i4;
                    if (b1) continue;
                    Test.instanceCount = i24;
                    Test.instanceCount = Test.instanceCount;
                    Test.dArrFld = Test.dArrFld;
                    if (i24 != 0) {
                        vMeth_check_sum += i1 + by1 + i2 + i3 + i4 + i5 + i23 + i24 + (b1 ? 1 : 0) +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    }
                }
            }
        }
        vMeth_check_sum += i1 + by1 + i2 + i3 + i4 + i5 + i23 + i24 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        byte by=-3;
        int i=213, i25=-235, i26=-56, i27=52557, i28=-13, i29=-27, i30=36403, iArr2[][]=new int[N][N];
        short s=-3689;
        long l1=-13847L;
        boolean b2=true;
        float f1=-2.424F;

        FuzzerUtils.init(iArr2, -4766);

        by >>= (byte)(iFld--);
        i = 1;
        while (++i < 155) {
            s += (short)iFld;
            vMeth(-11, by, i);
        }
        Test.dFld *= -5;
        for (i25 = 10; i25 < 249; i25++) {
            switch ((((i >>> 1) % 3) * 5) + 27) {
            case 30:
                for (l1 = 4; 105 > l1; ++l1) {
                    i26 = i25;
                    iFld += (int)(l1 - i26);
                    Test.instanceCount = Test.iFld1;
                    Test.iArrFld[(int)(l1)] <<= i26;
                    Test.iFld1 >>= -96;
                }
                b2 = b2;
                Test.iFld1 += i26;
                i26 >>= i26;
                break;
            case 42:
                for (i28 = 1; i28 < 105; ++i28) {
                    s ^= (short)Test.iFld2;
                    for (f1 = 1; f1 < 2; ++f1) {
                        Test.fFld -= i28;
                        iArr2 = iArr2;
                        try {
                            i29 = (Test.iFld2 % Test.iFld1);
                            i29 = (i27 % -3);
                            Test.iFld2 = (Test.iArrFld[i28 - 1] / -119);
                        } catch (ArithmeticException a_e) {}
                        Test.fFld = l1;
                        if (b2) {
                            i27 += (int)l1;
                            i29 -= i;
                        } else {
                            Test.iFld1 += (int)f1;
                        }
                        i30 = Test.iFld2;
                        Test.iFld2 += 14;
                        Test.iFld2 -= 21401;
                    }
                }
                break;
            case 37:
                Test.iFld2 += (57 + (i25 * i25));
            default:
                i26 -= (int)l1;
            }
        }

        FuzzerUtils.out.println("by i s = " + by + "," + i + "," + s);
        FuzzerUtils.out.println("i25 i26 l1 = " + i25 + "," + i26 + "," + l1);
        FuzzerUtils.out.println("i27 b2 i28 = " + i27 + "," + (b2 ? 1 : 0) + "," + i28);
        FuzzerUtils.out.println("i29 f1 i30 = " + i29 + "," + Float.floatToIntBits(f1) + "," + i30);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld Test.iFld1 Test.iFld2 = " + Float.floatToIntBits(Test.fFld) + "," +
            Test.iFld1 + "," + Test.iFld2);
        FuzzerUtils.out.println("Test.iArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}