// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:51 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=58497L;
    public static int iFld=-39652;
    public static float fFld=108.228F;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {

        int i6=5, i7=-6, i8=-29805;
        long l=20570L;
        double d1=2.87930;
        byte by=-112;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 16.110F);

        for (i6 = 6; 146 > i6; ++i6) {
            l = 11;
            do {
                Test.instanceCount = (long)d1;
                i8 = 1;
                do {
                    float f=41.162F;
                    short s=10817;
                    i7 = i7;
                    i7 = 191;
                    by -= (byte)i8;
                    switch ((int)(((l % 1) * 5) + 38)) {
                    case 43:
                        f *= i6;
                        i7 <<= (int)Test.instanceCount;
                        d1 -= i7;
                        switch (((i6 >>> 1) % 2) + 33) {
                        case 33:
                            if (false) {
                                i7 += (int)l;
                                fArr[(int)(l)] -= i7;
                            } else {
                                f = Test.instanceCount;
                            }
                            break;
                        case 34:
                            s = (short)i8;
                        default:
                            Test.instanceCount += i8;
                        }
                        break;
                    default:
                        f = f;
                    }
                } while ((i8 -= 3) > 0);
            } while (--l > 0);
        }
        long meth_res = i6 + i7 + l + Double.doubleToLongBits(d1) + i8 + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1(int i4) {

        double d=0.83861, dArr[][]=new double[N][N];
        int i5=180, i9=27513, i10=53, i11=52455, i12=0, i13=-62, i14=10;

        FuzzerUtils.init(dArr, 1.29051);

        i4 += (int)((i4++) * d);
        i5 = 1;
        do {
            dArr[i5 + 1][i5 + 1] += 7592;
            Test.instanceCount <<= (long)((-dMeth()) - i4);
            switch ((i5 % 2) + 85) {
            case 85:
                Test.instanceCount += (((i5 * i5) + i4) - i4);
                for (i9 = 1; i9 < 6; i9++) {
                    Test.instanceCount = 239L;
                }
                for (i11 = i5; i11 < 6; ++i11) {
                    i13 = 1;
                    do {
                        Test.instanceCount = i14;
                        i10 = -16386;
                        i12 += i13;
                        Test.instanceCount &= 16028;
                        i4 -= i12;
                    } while (++i13 < 1);
                }
                break;
            case 86:
            default:
                i14 += i13;
            }
        } while (++i5 < 268);
        vMeth1_check_sum += i4 + Double.doubleToLongBits(d) + i5 + i9 + i10 + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i, int i1, int i2) {

        int i3=42, i15=-80, i16=-30929, i17=193, i18=4, i19=33484, i20=24;
        short s1=-1792;
        float f1=2.668F, fArr1[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 0L);
        FuzzerUtils.init(fArr1, -49.305F);

        i1 = (i++);
        i3 = 312;
        while ((i3 -= 3) > 0) {
            vMeth1(-8);
        }
        lArr[(i1 >>> 1) % N] = s1;
        for (i15 = 5; i15 < 234; ++i15) {
            i16 = (int)f1;
            for (i17 = 1; i17 < 7; ++i17) {
                i2 = (int)14L;
                Test.instanceCount >>= -209;
                i18 -= (int)Test.instanceCount;
                for (i19 = 1; i19 < 2; i19++) {
                    Test.instanceCount = s1;
                    i18 = -25872;
                    fArr1[i17] += Test.instanceCount;
                    i20 *= (int)f1;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + s1 + i15 + i16 + Float.floatToIntBits(f1) + i17 + i18 + i19 + i20 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i21=64894, i22=41460, i23=8, i24=52, i25=93, i26=-12543, i27=25988, i28=-3, i29=191, i30=1, i31=-8,
            iArr[]=new int[N];
        double d2=-2.45048;
        short s3=-741;
        boolean b=false;

        FuzzerUtils.init(iArr, -240);

        vMeth(Test.iFld, Test.iFld, Test.iFld);
        Test.iFld -= Test.iFld;
        Test.fFld %= ((long)(Test.fFld) | 1);
        for (i21 = 240; i21 > 4; --i21) {
            Test.iFld *= (int)-657740954L;
            Test.instanceCount += (((i21 * i22) + i21) - Test.iFld);
            for (i23 = 4; i23 < 106; i23++) {
                for (i25 = 1; i25 < 2; i25++) {
                    iArr[(i22 >>> 1) % N] ^= Test.iFld;
                }
            }
            i26 = (int)Test.instanceCount;
            switch (((i25 >>> 1) % 3) + 55) {
            case 55:
                for (i27 = 4; i27 < 106; ++i27) {
                    short s2=3800;
                    i28 = (int)d2;
                    i28 = i24;
                    Test.instanceCount += (i27 ^ i21);
                    i24 = (int)Test.fFld;
                    i24 = i21;
                    Test.instanceCount = s2;
                }
                break;
            case 56:
                for (i29 = 1; i29 < 106; i29++) {
                    Test.instanceCount += (-1140028229563294952L + (i29 * i29));
                    Test.instanceCount *= i30;
                    iArr[i29] += i26;
                    s3 = (short)Test.fFld;
                    Test.instanceCount ^= 8;
                    i24 += i24;
                    i31 = 1;
                    while (++i31 < 2) {
                        Test.instanceCount *= i28;
                    }
                    if (b) break;
                    i28 += i31;
                }
                i28 >>= i31;
                break;
            case 57:
                i24 = (int)Test.instanceCount;
                break;
            }
        }

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 d2 = " + i27 + "," + i28 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i29 i30 s3 = " + i29 + "," + i30 + "," + s3);
        FuzzerUtils.out.println("i31 b iArr = " + i31 + "," + (b ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}