// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:52 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-614229246795437680L;
    public static double dFld=-78.46088;
    public static volatile byte byFld=-44;
    public short sFld=27451;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 6);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i10, byte by) {

        int i11=9, i12=-53, i13=-51967, i14=8, i15=89, i16=-6350, i17=-157, i18=6;
        float f1=-119.373F;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 159L);

        for (i11 = 10; i11 < 372; ++i11) {
            lArr[i11 + 1][i11 - 1] |= 154;
        }
        f1 -= Test.instanceCount;
        lArr[(i11 >>> 1) % N] = FuzzerUtils.long1array(N, (long)-53836L);
        i10 += (int)Test.instanceCount;
        for (i13 = 6; i13 < 290; ++i13) {
            i10 += (((i13 * i11) + i13) - Test.instanceCount);
            i14 = i13;
            for (i15 = 1; i15 < 6; i15++) {
                Test.instanceCount = Test.instanceCount;
                for (i17 = 1; i17 < 2; i17++) {
                    Test.instanceCount = i16;
                    lArr[i17][i15 - 1] = i13;
                }
                Test.iArrFld[i15] += (int)Test.dFld;
                if (i12 != 0) {
                    vMeth2_check_sum += i10 + by + i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 + i15 + i16 + i17 +
                        i18 + FuzzerUtils.checkSum(lArr);
                    return;
                }
            }
        }
        vMeth2_check_sum += i10 + by + i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(boolean b, short s, int i5) {

        int i6=-12, i7=19242, i8=1, i9=4, i19=-2, i20=-41913;
        float f=-2.312F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -189L);

        for (i6 = 8; 263 > i6; ++i6) {
            switch ((i6 % 2) + 56) {
            case 56:
                i8 += (i7--);
                i9 = 1;
                while (++i9 < 6) {
                    Test.instanceCount += i9;
                }
                f = s;
                vMeth2(i7, Test.byFld);
                break;
            case 57:
                Test.instanceCount *= 78;
                for (i19 = 1; i19 < 6; ++i19) {
                    i20 = i5;
                    i5 *= i20;
                    i5 = i7;
                    Test.instanceCount <<= i7;
                    lArr1[i6 + 1] += i5;
                    f -= -62681;
                }
                break;
            default:
                i8 += -27574;
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + s + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + i19 + i20 +
            FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(int i2) {

        int i3=-57467, i4=108, i21=-54;
        short s1=23530;

        i2 *= (int)(((Test.dFld + i2) * (3 - (i2++))) - ((Test.iArrFld[(i2 >>> 1) % N]--) + (Test.instanceCount +
            Test.byFld)));
        for (i3 = 12; i3 < 231; ++i3) {
            vMeth1(true, s1, i3);
            if (false) continue;
            i2 *= -17128;
            Test.byFld = (byte)i21;
        }
        vMeth_check_sum += i2 + i3 + i4 + s1 + i21;
    }

    public void mainTest(String[] strArr1) {

        int i=2, i1=-1, i22=-194, i23=172, i24=-36721, i25=-250, i26=13, i27=0, i28=13;
        boolean b1=true, bArr[]=new boolean[N];
        float f2=-13.558F, fArr[]=new float[N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr2, 7L);
        FuzzerUtils.init(fArr, -108.62F);

        for (i = 8; i < 286; ++i) {
            switch ((i % 6) + 40) {
            case 40:
                vMeth(-11);
                i22 = 1;
                do {
                    Test.iArrFld = Test.iArrFld;
                    i23 = 1;
                    do {
                        i1 = sFld;
                        bArr[i22 - 1] = b1;
                        i1 -= (int)62283L;
                        i1 = i23;
                        if (b1) break;
                        Test.instanceCount += (i23 * i22);
                        b1 = b1;
                        i1 = (int)Test.dFld;
                    } while ((i23 -= 3) > 0);
                    Test.instanceCount += (i22 * i22);
                    f2 += 172;
                    Test.dFld += i1;
                    if (false) continue;
                    Test.iArrFld[i - 1] -= i1;
                } while (++i22 < 90);
                break;
            case 41:
                Test.instanceCount -= i1;
            case 42:
                i1 += i22;
                for (i24 = 4; 90 > i24; ++i24) {
                    i1 -= (int)Test.instanceCount;
                }
                break;
            case 43:
                i26 = 1;
                while ((i26 += 3) < 90) {
                    Test.instanceCount = Test.instanceCount;
                    if (b1) {
                        for (i27 = 1; i27 < 3; i27 += 2) {
                            lArr2[i27] = Test.instanceCount;
                            lArr2[i27 - 1] = i28;
                            i28 = (int)Test.instanceCount;
                        }
                    } else {
                        fArr[i26] -= -54392;
                    }
                }
                break;
            case 44:
                i28 = i28;
            case 45:
                f2 += i22;
                break;
            default:
                i1 += (i - i1);
            }
        }

        FuzzerUtils.out.println("i i1 i22 = " + i + "," + i1 + "," + i22);
        FuzzerUtils.out.println("i23 b1 f2 = " + i23 + "," + (b1 ? 1 : 0) + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 bArr = " + i27 + "," + i28 + "," + FuzzerUtils.checkSum(bArr));
        FuzzerUtils.out.println("lArr2 fArr = " + FuzzerUtils.checkSum(lArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.byFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.byFld);
        FuzzerUtils.out.println("sFld Test.iArrFld = " + sFld + "," + FuzzerUtils.checkSum(Test.iArrFld));

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