// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:55 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-53158L;
    public static float fFld=-1.1009F;
    public static double dFld=-74.35052;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 8);
        FuzzerUtils.init(Test.byArrFld, (byte)-115);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i7) {

        int i8=47119, i9=-8, i10=4, i11=-37776, i12=9074, iArr[]=new int[N];
        double d=-56.118060;
        short s=-14221;
        boolean b=false;

        FuzzerUtils.init(iArr, 7);

        for (i8 = 13; 258 > i8; ++i8) {
            iArr[i8] -= (int)Test.instanceCount;
            Test.instanceCount += i9;
            i9 -= -27872;
            if (b) {
                d *= Test.instanceCount;
                s = (short)77;
            } else {
                for (i10 = 1; i10 < 7; ++i10) {
                    d += Test.instanceCount;
                    Test.instanceCount = i7;
                    i7 += (i10 - i10);
                    switch ((((i8 >>> 1) % 1) * 5) + 74) {
                    case 79:
                        Test.fFld = Test.instanceCount;
                        if (i9 != 0) {
                        }
                        i12 += i12;
                        break;
                    default:
                        i9 += (i10 * i10);
                    }
                }
            }
        }
        long meth_res = i7 + i8 + i9 + Double.doubleToLongBits(d) + s + (b ? 1 : 0) + i10 + i11 + i12 +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i4, int i5, int i6) {

        float f=33.128F;
        int i13=59, i14=-78, i15=205;
        short s1=-1297;
        boolean b1=false;
        byte by=-121;

        iMeth1(i4);
        for (f = 4; f < 175; f++) {
            switch ((int)(((f % 1) * 5) + 9)) {
            case 11:
                Test.instanceCount += Test.instanceCount;
            default:
                Test.instanceCount >>= i5;
            }
            i14 >>= (int)Test.instanceCount;
            s1 = (short)i13;
        }
        b1 = b1;
        i5 *= (int)Test.fFld;
        Test.iArrFld[(6 >>> 1) % N] += i5;
        i15 = 1;
        do {
            i5 += 8;
            i4 >>= i13;
        } while (++i15 < 304);
        i6 = i5;
        by = (byte)i5;
        long meth_res = i4 + i5 + i6 + Float.floatToIntBits(f) + i13 + i14 + s1 + (b1 ? 1 : 0) + i15 + by;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i1, int i2, int i3) {

        int i16=14, i17=14, i18=-38269, i19=-5, i20=139;

        Test.instanceCount = (-(-lMeth(i1, i2, i2)));
        for (i16 = 7; i16 < 200; i16++) {
            i17 += (11876 + (i16 * i16));
            Test.fFld += i16;
            for (i18 = 8; i18 > 1; --i18) {
                i20 = 1;
                do {
                    Test.instanceCount = -63433;
                    Test.instanceCount += i20;
                    i17 %= (int)((long)(Test.fFld) | 1);
                    Test.instanceCount = i2;
                    i3 -= -40867;
                    i19 += i18;
                } while (++i20 < 2);
                i19 += i16;
                Test.fFld += (float)44.66865;
            }
            Test.instanceCount -= Test.instanceCount;
        }
        long meth_res = i1 + i2 + i3 + i16 + i17 + i18 + i19 + i20;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=7, i21=-12, i22=-6110, i23=-45512, i24=-42126, i25=239, i26=38, i27=-55716;
        long l=4752199881513531801L, lArr[]=new long[N];
        float f1=0.111F, fArr[]=new float[N];

        FuzzerUtils.init(lArr, 11266L);
        FuzzerUtils.init(fArr, 0.727F);

        i = iMeth(i, i, i);
        i <<= i;
        Test.dFld += Test.fFld;
        i21 = 1;
        while (++i21 < 312) {
            for (l = 5; 81 > l; ++l) {
                i22 = (int)Test.dFld;
                i22 <<= 38366;
                lArr[i21 - 1] -= 14;
                i += (int)(((l * i) + i21) - i21);
                i22 = i;
            }
            for (i23 = 1; i23 < 81; i23++) {
                i24 = i;
                i = i23;
            }
            for (f1 = 3; f1 < 81; ++f1) {
                i24 = i23;
            }
            if (Test.bFld) {
                i25 = (int)l;
                i25 >>>= i22;
                i22 -= (int)f1;
            } else if (Test.bFld) {
                if (Test.bFld) {
                    Test.iArrFld[i21 + 1] -= -1;
                    Test.instanceCount -= i25;
                    i = (int)Test.instanceCount;
                    Test.byArrFld[i21] *= (byte)i21;
                } else if (Test.bFld) {
                    i22 <<= i;
                    fArr[i21 - 1] = i21;
                } else {
                    Test.bFld = Test.bFld;
                    for (i26 = i21; i26 < 81; i26++) {
                        i24 += (((i26 * i24) + Test.instanceCount) - i21);
                        i24 &= 71;
                    }
                }
            } else {
                Test.instanceCount = i25;
            }
        }

        FuzzerUtils.out.println("i i21 l = " + i + "," + i21 + "," + l);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("f1 i25 i26 = " + Float.floatToIntBits(f1) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 lArr fArr = " + i27 + "," + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld Test.iArrFld Test.byArrFld = " + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
