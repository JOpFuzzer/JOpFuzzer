// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:00 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3L;
    public static float fFld=-12.556F;
    public static byte byFld=27;
    public static int iFld=57553;
    public static float fArrFld[]=new float[N];
    public int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 102.133F);
        FuzzerUtils.init(Test.sArrFld, (short)5890);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i5=134, i6=14, i7=-36684, i8=185, i9=0, iArr[]=new int[N];
        short s=14734;
        long l2=3070243063709388047L;
        double d=-112.92944, d1=-1.119970;
        boolean b=true;

        FuzzerUtils.init(iArr, -170);

        i5 -= s;
        for (l2 = 15; 325 > l2; ++l2) {
            i7 = 1;
            while (++i7 < 5) {
                d = 1;
                do {
                    i5 = (int)Test.instanceCount;
                    i5 -= (int)Test.fFld;
                } while (++d < 1);
                b = b;
                i6 = -19279;
                d1 *= d1;
                for (i8 = 1; i8 < 1; ++i8) {
                    iArr[i8] -= (int)l2;
                    Test.byFld += (byte)i8;
                    i6 -= (int)Test.fFld;
                    i9 >>= 1;
                    if (b) continue;
                }
            }
        }
        long meth_res = i5 + s + l2 + i6 + i7 + Double.doubleToLongBits(d) + (b ? 1 : 0) + Double.doubleToLongBits(d1)
            + i8 + i9 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i4) {

        long l3=-183L;
        int i10=-112, i11=3, i12=-36360, i13=11, i14=12, iArr1[]=new int[N];
        short s1=-21636;
        boolean b1=true;

        FuzzerUtils.init(iArr1, 9);

        lMeth();
        for (l3 = 6; l3 < 221; l3 += 2) {
            i4 *= i4;
            Test.byFld <<= (byte)l3;
            Test.fArrFld[(int)(l3)] = i10;
            Test.fFld -= Test.instanceCount;
        }
        i10 *= i10;
        for (i11 = 16; 296 > i11; ++i11) {
            for (i13 = 1; i13 < 6; ++i13) {
                i12 -= i14;
                switch ((i11 % 9) + 22) {
                case 22:
                    s1 += (short)(i13 + l3);
                    b1 = b1;
                    break;
                case 23:
                case 24:
                    i4 += i13;
                    iArr1[i11 + 1] += (int)-1801447260L;
                    break;
                case 25:
                    b1 = b1;
                    break;
                case 26:
                    i10 += i11;
                    break;
                case 27:
                    iArr1[i13 - 1] >>= i13;
                    break;
                case 28:
                    Test.fFld += (((i13 * i14) + l3) - Test.instanceCount);
                case 29:
                    i10 <<= i13;
                case 30:
                    if (b1) break;
                    break;
                default:
                    if (i4 != 0) {
                        vMeth_check_sum += i4 + l3 + i10 + i11 + i12 + i13 + i14 + s1 + (b1 ? 1 : 0) +
                            FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                }
            }
        }
        vMeth_check_sum += i4 + l3 + i10 + i11 + i12 + i13 + i14 + s1 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l, long l1, float f) {

        int i15=-10217, i16=14, i17=2, i18=161, i19=32173, i20=13221, i21=121, i22=-78, i23=13, iArr2[]=new int[N];
        boolean b2=false;

        FuzzerUtils.init(iArr2, -1);

        vMeth(Test.iFld);
        Test.fFld += 5142131717372948344L;
        Test.iFld -= 248;
        for (i15 = 17; i15 < 370; i15++) {
            Test.iFld += (i15 ^ Test.iFld);
            for (i17 = 1; i17 < 5; i17 += 3) {
                Test.iFld = i18;
            }
            Test.iFld += (int)(1247494426L + (i15 * i15));
            for (i19 = i15; i19 < 5; i19++) {
                for (i21 = 1; i21 < 1; i21++) {
                    try {
                        i22 = (41781 % i18);
                        i16 = (i23 / i17);
                        i18 = (-24 / i17);
                    } catch (ArithmeticException a_e) {}
                    i22 += (((i21 * Test.fFld) + i17) - i17);
                }
            }
            if (b2) {
                Test.byFld += (byte)l1;
                iArr2[i15 - 1] = (int)2.116186;
            }
        }
        long meth_res = l + l1 + Float.floatToIntBits(f) + i15 + i16 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + (b2 ?
            1 : 0) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-13, i1=11, i2=-62495, i3=-246, i24=-4, i25=-36062;
        short s2=-2357;
        double d2=92.106749;

        for (i = 127; 4 < i; i -= 3) {
            for (i2 = i; i2 < 264; i2++) {
                i3 -= (i - iMeth(Test.instanceCount, Test.instanceCount, Test.fFld));
                iArrFld[i2 - 1] += i3;
                Test.instanceCount = (long)Test.fFld;
                i3 &= i2;
                i24 = 1;
                while (++i24 < 2) {
                    iArrFld[i24 - 1] <<= i3;
                    iArrFld[i2 - 1] *= i1;
                }
                Test.iFld = (int)Test.fFld;
                Test.instanceCount += 20597;
                Test.sArrFld = Test.sArrFld;
                i25 = 1;
                while (++i25 < 2) {
                    i3 >>= i1;
                    i1 = s2;
                    switch ((i % 2) + 92) {
                    case 92:
                        Test.iFld += i2;
                        switch (((i25 % 3) * 5) + 25) {
                        case 26:
                            i1 |= (int)Test.instanceCount;
                            Test.iFld += (i25 ^ Test.iFld);
                            Test.instanceCount |= i1;
                            Test.fFld *= Test.fFld;
                            break;
                        case 35:
                            Test.instanceCount += (((i25 * Test.instanceCount) + i1) - i);
                            Test.fFld += i3;
                            i3 += i25;
                            break;
                        case 30:
                            i3 += (((i25 * Test.byFld) + i3) - i3);
                            switch (((i24 >>> 1) % 10) + 24) {
                            case 24:
                                s2 += (short)(i25 | s2);
                                break;
                            case 25:
                                i3 >>>= i3;
                                break;
                            case 26:
                                s2 += (short)(i25 * i25);
                                break;
                            case 27:
                                i1 += (((i25 * i25) + Test.instanceCount) - Test.iFld);
                                break;
                            case 28:
                                d2 = s2;
                                break;
                            case 29:
                            case 30:
                                i1 += (((i25 * i1) + i2) - Test.fFld);
                                break;
                            case 31:
                            case 32:
                                Test.instanceCount = Test.iFld;
                            case 33:
                                Test.iFld = (int)2888789998L;
                                break;
                            default:
                                Test.iFld = i1;
                            }
                            break;
                        }
                    case 93:
                        Test.instanceCount -= i3;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i24 i25 = " + i3 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("s2 d2 = " + s2 + "," + Double.doubleToLongBits(d2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld Test.fArrFld iArrFld = " + Test.iFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}