// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:50 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9040778425126349440L;
    public int iFld=-5;
    public float fFld=2.186F;
    public static float fFld1=-91.195F;
    public static boolean bFld=true;
    public double dFld=-48.84943;
    public static short sFld=11698;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -148L);
        FuzzerUtils.init(Test.iArrFld, 47350);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i12) {

        int i13=-40, i14=19, i15=-10, i16=-31807, iArr2[][]=new int[N][N];
        byte by=-90;
        short s=-16255;

        FuzzerUtils.init(iArr2, -144);

        Test.fFld1 -= i12;
        for (i13 = 8; i13 < 306; i13++) {
            iArr2[i13 + 1][i13] &= by;
        }
        for (i15 = 12; i15 < 202; i15 += 3) {
            Test.instanceCount = i14;
            i16 >>= i15;
            s -= (short)i15;
            s = (short)2;
            Test.bFld = Test.bFld;
            if (i14 != 0) {
            }
        }
        iArr2[(i12 >>> 1) % N] = iArr2[(i12 >>> 1) % N];
        i16 += i12;
        i16 *= 54876;
        iArr2[(i12 >>> 1) % N][(i16 >>> 1) % N] += (int)Test.instanceCount;
        s -= (short)-107.448F;
        long meth_res = i12 + i13 + i14 + by + i15 + i16 + s + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i10, int i11) {

        int i17=-11, i18=17, i19=217, i20=204;
        short s1=29855;
        double d1=-1.10886;

        if (Test.bFld) {
            i10 = iMeth1(i10);
            Test.fFld1 += i11;
            i17 = 1;
            while (++i17 < 216) {
                i10 += (((i17 * i11) + i10) - i17);
                s1 += (short)(i17 * i11);
                i11 <<= i10;
            }
        } else {
            i18 = 1;
            do {
                i10 *= (int)Test.fFld1;
                i10 = (int)d1;
                i11 -= (int)Test.fFld1;
                switch ((((40118 >>> 1) % 1) * 5) + 126) {
                case 131:
                    for (i19 = 1; i19 < 5; ++i19) {
                        d1 *= Test.fFld1;
                        Test.iArrFld[i19 - 1] = 133;
                    }
                default:
                    i11 = (int)Test.instanceCount;
                }
            } while (++i18 < 317);
        }
        long meth_res = i10 + i11 + i17 + s1 + i18 + Double.doubleToLongBits(d1) + i19 + i20;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(double d, int i3) {

        int i4=189, i5=9077, i6=-9, i7=-40126, i8=11, i9=149, i21=-23342, iArr1[]=new int[N];
        byte by1=122;
        short s2=-31829;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 76L);
        FuzzerUtils.init(iArr1, -14);

        switch (((((i3++) >>> 1) % 10) * 5) + 61) {
        case 66:
            for (i4 = 11; i4 < 367; ++i4) {
                for (i6 = 1; i6 < 5; ++i6) {
                    Test.instanceCount += (i6 - i6);
                    lArr = (lArr = lArr);
                    i3 <<= (int)(Test.instanceCount %= (((long)(i4 + (--d))) | 1));
                    iArr1[i6] += (i3++);
                    i3 += (((i6 * i4) + i3) - i4);
                    for (i8 = 1; i8 < 2; ++i8) {
                        i7 >>= Math.max(iArr1[i8 - 1], iMeth(-218, i8));
                        i9 += (((i8 * i6) + Test.instanceCount) - by1);
                        i7 = (int)55936L;
                        Test.instanceCount -= i6;
                        Test.fFld1 = i7;
                        Test.instanceCount *= s2;
                    }
                }
            }
            break;
        case 95:
            i7 += i8;
            break;
        case 82:
            i7 = i3;
            break;
        case 77:
            by1 += (byte)i3;
        case 87:
            i5 <<= i7;
            break;
        case 101:
            i21 = (int)Test.instanceCount;
        case 67:
            Test.fFld1 += i21;
            break;
        case 106:
            Test.fFld1 += 3620017317L;
        case 103:
            i7 ^= -140;
            break;
        case 91:
            i5 &= -40125;
            break;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + i7 + i8 + i9 + by1 + s2 + i21 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=37815, i1=-1, i2=2, i22=-9578, i23=-215, i24=-2, i25=-4, i26=43969, i27=105, i28=-130, i29=-13,
            iArr[]=new int[N];
        byte by2=109;
        boolean bArr[][]=new boolean[N][N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, -48467);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr1, -46712L);

        i = (int)((--Test.instanceCount) - ((65.932F + (--i)) - (i * 46316)));
        iFld -= iArr[(iFld >>> 1) % N];
        for (i1 = 9; i1 < 342; ++i1) {
            i *= (int)(fFld + ((5 << (iFld--)) + (fFld = iFld)));
        }
        vMeth(dFld, i2);
        for (i22 = 8; i22 < 134; ++i22) {
            i23 <<= (int)81L;
            i23 = 21861;
            i23 = i1;
            Test.iArrFld[i22 + 1] = iFld;
        }
        for (i24 = 4; 185 > i24; ++i24) {
            Test.sFld = (short)i;
            for (i26 = 6; i26 < 139; i26++) {
                switch ((i24 % 10) + 51) {
                case 51:
                    bArr[i24][i26 + 1] = false;
                    Test.lArrFld[i24] = i25;
                    i = (int)Test.instanceCount;
                    dFld += i27;
                    break;
                case 52:
                    for (i28 = 1; i28 < 2; ++i28) {
                        Test.fFld1 -= i28;
                        i23 <<= i25;
                        Test.instanceCount *= i29;
                        Test.instanceCount += i28;
                        by2 += (byte)(i28 * i28);
                        switch ((i26 % 10) + 17) {
                        case 17:
                            i27 = i24;
                        case 18:
                            i23 += i28;
                            i -= (int)Test.instanceCount;
                            dFld -= i28;
                            break;
                        case 19:
                            i = i27;
                        case 20:
                            Test.instanceCount += (-32448 + (i28 * i28));
                            break;
                        case 21:
                            i = i24;
                            break;
                        case 22:
                            Test.instanceCount -= iFld;
                            break;
                        case 23:
                            Test.bFld = false;
                            break;
                        case 24:
                            Test.bFld = Test.bFld;
                            break;
                        case 25:
                            dFld = i27;
                            break;
                        case 26:
                            i23 -= i25;
                        }
                    }
                case 53:
                    Test.instanceCount += (i26 ^ Test.instanceCount);
                    break;
                case 54:
                    i23 = i23;
                    break;
                case 55:
                    Test.instanceCount += (i26 | iFld);
                    break;
                case 56:
                    Test.instanceCount *= i26;
                    break;
                case 57:
                    Test.bFld = Test.bFld;
                    break;
                case 58:
                    i25 >>>= -13;
                    break;
                case 59:
                    lArr1 = lArr1;
                    break;
                case 60:
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)-5934);
                    break;
                default:
                    Test.sFld <<= (short)39970;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 by2 = " + i28 + "," + i29 + "," + by2);
        FuzzerUtils.out.println("iArr bArr lArr1 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(bArr) +
            "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount iFld fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.fFld1 Test.bFld dFld = " + Float.floatToIntBits(Test.fFld1) + "," + (Test.bFld ?
            1 : 0) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.sFld Test.lArrFld Test.iArrFld = " + Test.sFld + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}