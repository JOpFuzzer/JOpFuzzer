// Generated by Java* Fuzzer test generator (1.0.001). Fri Jan 22 04:14:11 2021
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-3696078342532475524L;
    public static int iFld1=-15316;
    public static boolean bFld=false;
    public static byte byFld=-109;
    public static int iFld2=22972;
    public float fFld=-2.810F;
    public short sFld=-26967;
    public float fArrFld[]=new float[N];
    public static boolean bArrFld[]=new boolean[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.lArrFld, 491635749L);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i4=-5202, i5=-35421, i6=8, i7=-13679, i8=-36856, i9=2;
        short s=-12297;
        double d2=-124.4287;

        i4 = 1;
        do {
            Test.instanceCount += (((i4 * i4) + i4) - i4);
            i5 /= (int)(i4 | 1);
            for (i6 = i4; 5 > i6; i6++) {
                i5 -= (int)Test.instanceCount;
                for (i8 = 1; i8 < 1; ++i8) {
                    try {
                        i9 = (i6 % 62498);
                        i7 = (i4 / i6);
                        i5 = (i6 / 2024260045);
                    } catch (ArithmeticException a_e) {}
                    if (i5 != 0) {
                        vMeth_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + s + Double.doubleToLongBits(d2);
                        return;
                    }
                    i5 >>= Test.iFld1;
                    i9 = i5;
                    s <<= (short)Test.iFld1;
                }
            }
            Test.instanceCount += Test.iFld1;
            i5 = (int)d2;
            Test.instanceCount |= Test.instanceCount;
            Test.bArrFld[i4] = Test.bFld;
        } while (++i4 < 332);
        vMeth_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + s + Double.doubleToLongBits(d2);
    }

    public static long lMeth() {

        int i3=57693, i10=13, i11=-52996, i12=245, i13=41788, i14=59, i15=19113, i16=-31301, i17=-223, iArr2[]=new
            int[N];
        double d3=2.89376;
        short s1=2014;
        float f=-2.356F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 8604081103409070847L);
        FuzzerUtils.init(iArr2, 87);

        switch ((((((int)(Test.instanceCount - i3)) >>> 1) % 6) * 5) + 50) {
        case 58:
            vMeth();
            for (i10 = 13; i10 < 220; i10++) {
                lArr[i10] -= (long)d3;
                for (i12 = 1; i12 < 8; ++i12) {
                    Test.instanceCount = i12;
                    iArr2[i10 - 1] = s1;
                    i11 = s1;
                }
            }
            for (i14 = 8; i14 < 148; i14 += 3) {
                Test.instanceCount += i14;
                for (i16 = i14; i16 < 33; i16++) {
                    switch ((i14 % 4) + 84) {
                    case 84:
                        i3 >>= -2;
                        Test.iFld1 += i16;
                        f = 55504L;
                        break;
                    case 85:
                        iArr2[i14 - 1] = Test.iFld1;
                        break;
                    case 86:
                        if (true) break;
                        break;
                    case 87:
                        try {
                            i13 = (i17 / iArr2[i16]);
                            iArr2[i14 + 1] = (i10 / i15);
                            Test.iFld1 = (iArr2[i16] % i3);
                        } catch (ArithmeticException a_e) {}
                        break;
                    }
                }
            }
            break;
        case 62:
            i13 = i15;
        case 69:
            Test.instanceCount += s1;
            break;
        case 63:
            iArr2[(43012 >>> 1) % N] *= Test.byFld;
            break;
        case 56:
            i15 += i17;
            break;
        case 57:
            i11 *= Test.iFld2;
            break;
        default:
            f = Test.instanceCount;
        }
        long meth_res = i3 + i10 + i11 + Double.doubleToLongBits(d3) + i12 + i13 + s1 + i14 + i15 + i16 + i17 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(double d1, int i2) {

        double d4=1.5587;
        int i18=41467, i19=-11, i20=33484;
        float f1=1.42F;

        d1 *= lMeth();
        i2 -= -57329;
        Test.iFld1 -= (int)-1.644F;
        Test.iFld1 >>= -3;
        switch ((((Test.iFld2 >>> 1) % 2) * 5) + 3) {
        case 4:
            for (d4 = 15; d4 < 314; d4 += 2) {
                i18 = 154;
                i19 = 1;
                while (++i19 < 11) {
                    Test.iFld1 = Test.iFld2;
                    i20 = 1;
                    while (++i20 < 1) {
                        Test.iFld1 /= (int)(Test.iFld1 | 1);
                        Test.instanceCount += (i20 * i20);
                        d1 = f1;
                        Test.instanceCount = i19;
                        d1 -= Test.iFld1;
                    }
                }
            }
            break;
        case 13:
            Test.iFld1 += (int)d1;
            break;
        }
        long meth_res = Double.doubleToLongBits(d1) + i2 + Double.doubleToLongBits(d4) + i18 + i19 + i20 +
            Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr3) {

        double d=0.75197;
        int i=220, i1=-10, i21=-28, i22=-13, i23=28138, i24=-31342, i25=-1, i26=-176, i27=-59013, i28=12, i29=-14405,
            i30=-5, i31=-56232, i32=-253, iArr1[]=new int[N];
        long l=-26033L;

        FuzzerUtils.init(iArr1, 9);

        d += (Math.min(i + i, i) - iArr1[(244 >>> 1) % N]);
        i1 = 312;
        while (--i1 > 0) {
            fArrFld[i1] += ((~(long)(0.129579 - (i1 + i))) - i);
            iArr1[i1 + 1] += (int)((Integer.reverseBytes(60210) * (13 >>> (-Test.instanceCount))) - i1);
            Test.instanceCount = ((i++) * ((++i) * iMeth(d, i1)));
            Test.lArrFld[i1] *= i;
            Test.lArrFld = Test.lArrFld;
            Test.iFld2 += (((i1 * Test.iFld2) + fFld) - i);
            Test.iFld1 >>= (int)Test.instanceCount;
            Test.instanceCount *= sFld;
        }
        fArrFld[(Test.iFld2 >>> 1) % N] -= i1;
        Test.instanceCount = Test.iFld1;
        iArr1 = iArr1;
        Test.iFld1 += i1;
        for (i21 = 1; i21 < 238; ++i21) {
            Test.instanceCount *= i;
        }
        for (i23 = 276; i23 > 17; --i23) {
            i25 = 97;
            do {
                i24 -= (int)-38.124835;
                d = fFld;
            } while ((i25 -= 3) > 0);
        }
        sFld = (short)i25;
        for (i26 = 1; i26 < 228; i26++) {
            fFld = Test.instanceCount;
        }
        for (l = 301; l > 12; l -= 2) {
            i29 = 1;
            do {
                for (i30 = (int)(l); i30 < 1; i30++) {
                    i32 += (i30 ^ (long)fFld);
                    if (false) {
                        iArr1[i30] = i;
                        iArr1[i30] = i23;
                    } else if (Test.bFld) {
                        Test.instanceCount = i21;
                    } else if (Test.bFld) {
                        i <<= i25;
                    } else {
                        i31 = i21;
                    }
                }
            } while (++i29 < 174);
        }

        FuzzerUtils.out.println("d i i1 = " + Double.doubleToLongBits(d) + "," + i + "," + i1);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 l i28 = " + i27 + "," + l + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 iArr1 = " + i32 + "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld1 Test.bFld = " + Test.instanceCount + "," + Test.iFld1 +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.byFld Test.iFld2 fFld = " + Test.byFld + "," + Test.iFld2 + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("sFld fArrFld Test.bArrFld = " + sFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(Test.bArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
