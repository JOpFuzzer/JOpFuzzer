// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-103L;
    public int iFld=139;
    public static float fFld=-1.440F;
    public byte byFld=56;
    public static double dFld=2.29352;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 12996);
        FuzzerUtils.init(Test.lArrFld, 1662702897L);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5, int i6) {

        int i7=-141, i8=-228, i9=-47, i10=-183, i11=7, iArr2[]=new int[N];
        short s=3123;
        byte by=-127;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1975689117L);
        FuzzerUtils.init(iArr2, -13);

        i7 = 1;
        do {
            switch ((i7 % 7) + 99) {
            case 99:
                Test.instanceCount += (long)1.570F;
                lArr[i7 + 1] += i6;
                break;
            case 100:
                i6 ^= i5;
                lArr = FuzzerUtils.long1array(N, (long)4022885678916017775L);
                break;
            case 101:
                for (i8 = 1; i8 < 5; ++i8) {
                    Test.instanceCount -= i8;
                    Test.instanceCount += i8;
                    for (i10 = 1; i10 < 2; ++i10) {
                        double d=1.8355;
                        switch (((i10 % 7) * 5) + 31) {
                        case 61:
                            i9 = -33542;
                            iArr2[i10 - 1] = (int)Test.instanceCount;
                            iArr2[i7 - 1] = s;
                            break;
                        case 40:
                            i11 = i9;
                            break;
                        case 32:
                            iArr2[i10] -= (int)d;
                        case 33:
                            i11 += (i10 - i10);
                            break;
                        case 49:
                            by -= by;
                            break;
                        case 64:
                            iArr2[i10 - 1] += (int)d;
                        case 58:
                            lArr[i8 + 1] -= i10;
                        }
                    }
                }
                break;
            case 102:
                i9 -= i5;
                break;
            case 103:
                i11 -= i11;
            case 104:
                i9 = i6;
                break;
            case 105:
                Test.instanceCount = 11;
            default:
                i6 = i11;
            }
        } while (++i7 < 304);
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + s + by + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr2);
    }

    public static double dMeth(boolean b, long l2) {

        int i1=198, i2=-8056, i3=-1, i4=-13, i12=-1, i13=58664, i14=6455, i15=-9;

        for (i1 = 16; 359 > i1; i1++) {
            for (i3 = i1; i3 < 5; ++i3) {
                vMeth1(i4, i1);
                switch (((i1 % 1) * 5) + 90) {
                case 93:
                    Test.instanceCount >>= i3;
                    i2 += i4;
                    i4 = (int)46542L;
                    i4 -= (int)1.573F;
                    break;
                }
            }
            Test.iArrFld[i1 - 1] = -14;
            for (i12 = 1; 5 > i12; i12++) {
                for (i14 = 1; i14 < 2; ++i14) {
                    if (b) break;
                    Test.iArrFld[i1 - 1] = i2;
                    i13 = -205;
                }
                i15 = i2;
            }
        }
        long meth_res = (b ? 1 : 0) + l2 + i1 + i2 + i3 + i4 + i12 + i13 + i14 + i15;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(long l, float f, long l1) {

        boolean b1=true;
        int i16=-62, i17=10, i18=96, iArr1[]=new int[N];
        short s1=16932;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, -243);
        FuzzerUtils.init(dArr, 1.14605);

        iArr1[(7496 >>> 1) % N] += (int)((dMeth(b1, -5901334017129495785L) - -16277) * Test.dFld);
        i16 = (int)8328798773184611507L;
        dArr[(-25500 >>> 1) % N] = s1;
        i16 <<= (int)l;
        for (i17 = 1; 168 > i17; ++i17) {
            Test.instanceCount = (long)f;
            Test.iArrFld[i17] -= -27830;
            if (b1) {
                Test.instanceCount = s1;
                switch ((((i18 >>> 1) % 2) * 5) + 41) {
                case 45:
                    Test.iArrFld[i17] ^= 79;
                    if (b1) {
                        Test.lArrFld[i17] += 2;
                        l = i18;
                    } else {
                        l -= i18;
                    }
                case 43:
                    i18 += (int)(202L + (i17 * i17));
                }
            } else {
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + l1 + (b1 ? 1 : 0) + i16 + s1 + i17 + i18 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i19=6, i20=9, i21=4, i22=-34316, i23=-54466, i24=-2383, iArr[]=new int[N];
        double d1=-94.37170;
        boolean b2=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -19616);
        FuzzerUtils.init(fArr, 2.503F);

        iFld -= (int)(Test.instanceCount + Math.max((int)(Test.fFld * byFld), (int)(Test.instanceCount * -14)));
        for (int i : iArr) {
            short s2=2377;
            vMeth(Test.instanceCount, Test.fFld, 8L);
            s2 = (short)Test.instanceCount;
            i |= (int)24846L;
            for (i19 = 3; i19 < 63; ++i19) {
                Test.instanceCount += (i19 * i19);
            }
            for (d1 = 63; d1 > 1; d1--) {
                Test.instanceCount *= (long)2.481F;
                Test.instanceCount = i22;
                Test.fFld = i19;
                i22 >>= i20;
                i = i20;
                if (b2) {
                    fArr[(int)(d1)] -= i20;
                    Test.instanceCount += i22;
                    iFld = (int)-5L;
                    Test.iArrFld[(int)(d1 - 1)] = (int)Test.dFld;
                } else if (true) {
                    i = i19;
                    s2 = (short)Test.instanceCount;
                    i21 ^= iFld;
                    for (i23 = 1; i23 < 2; ++i23) {
                        Test.lArrFld[i23 - 1] >>= i;
                        Test.instanceCount = i20;
                        i24 *= i23;
                        if (b2) break;
                        Test.lArrFld[(int)(d1 - 1)] = Test.instanceCount;
                        s2 += (short)i23;
                        Test.fFld += (float)Test.dFld;
                        Test.dFld = d1;
                    }
                } else if (b2) {
                    iFld += (int)(d1 * Test.instanceCount);
                } else {
                    iFld += (int)d1;
                }
            }
        }

        FuzzerUtils.out.println("i19 i20 d1 = " + i19 + "," + i20 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 b2 iArr = " + i24 + "," + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("byFld Test.dFld Test.iArrFld = " + byFld + "," + Double.doubleToLongBits(Test.dFld) +
            "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}