// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:00 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-430L;
    public static short sFld=-31736;
    public int iFld=-7;
    public int iFld1=-11;
    public static volatile float fArrFld[][]=new float[N][N];
    public static volatile double dArrFld[]=new double[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.597F);
        FuzzerUtils.init(Test.dArrFld, 11.57551);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(short s, float f) {

        int i9=62163, i10=2, i11=-42843, i12=-22120, i13=-61070, i14=-9, i15=4, iArr1[]=new int[N];
        double d1=1.40892;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 14);
        FuzzerUtils.init(fArr, -2.141F);
        FuzzerUtils.init(lArr, -28L);

        Test.sFld >>= (short)25265;
        switch (((197 >>> 1) % 9) + 24) {
        case 24:
            for (i9 = 9; i9 < 222; i9++) {
                iArr1[i9 + 1] = (int)d1;
                fArr[i9 + 1] -= Test.instanceCount;
                i10 -= i11;
                f += (i9 - Test.instanceCount);
                for (i12 = 1; i12 < 8; i12++) {
                    i13 = (int)7L;
                    lArr[i9 + 1] = i10;
                    i13 -= i9;
                    i13 >>= i9;
                    for (i14 = 1; 2 > i14; i14++) {
                        Test.instanceCount = Test.instanceCount;
                        i15 &= i9;
                    }
                }
            }
            break;
        case 25:
        case 26:
            i13 = -203;
        case 27:
            i10 -= -250;
            break;
        case 28:
            i10 ^= i15;
        case 29:
            i11 = (int)Test.instanceCount;
            break;
        case 30:
            lArr = lArr;
            break;
        case 31:
            iArr1[(i14 >>> 1) % N] *= (int)d1;
            break;
        case 32:
            i11 -= i13;
            break;
        default:
            i10 += -18196;
        }
        long meth_res = s + Float.floatToIntBits(f) + i9 + i10 + Double.doubleToLongBits(d1) + i11 + i12 + i13 + i14 +
            i15 + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth(int i6, int i7, int i8) {

        float f1=1.361F;
        int i16=152, i17=-31853, i18=-5004, i19=40, iArr2[]=new int[N];
        byte by1=6;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, 36156);
        FuzzerUtils.init(lArr1, -80L);

        i7 = (int)(Test.instanceCount - (Math.abs(Test.instanceCount) + (i6--)));
        fMeth(Test.sFld, f1);
        for (i16 = 354; i16 > 19; --i16) {
            i7 += i16;
            Test.instanceCount -= (long)f1;
            iArr2[i16 - 1] = (int)f1;
            Test.fArrFld[i16][i16 - 1] += Test.instanceCount;
            lArr1[i16 + 1] >>>= Test.sFld;
        }
        i17 += i16;
        for (i18 = 7; i18 < 203; ++i18) {
            Test.dArrFld[i18 - 1] *= by1;
            Test.fArrFld[i18 + 1][i18] *= 83;
            Test.instanceCount /= (i7 | 1);
            i17 = (int)147932210223849293L;
        }
        long meth_res = i6 + i7 + i8 + Float.floatToIntBits(f1) + i16 + i17 + i18 + i19 + by1 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i) {

        int i1=144, i2=12, i3=14, i4=-32662, i5=235, i20=171, i21=-148, iArr[]=new int[N];
        double d=-74.1411;
        byte by=44;
        boolean b=true;
        float f2=97.223F;

        FuzzerUtils.init(iArr, 54712);

        Test.sFld = (short)-4;
        for (i1 = 286; i1 > 2; --i1) {
            for (d = i1; d < 6; d += 3) {
                for (i4 = 1; i4 < 1; ++i4) {
                    iArr[i1 - 1] -= (++i2);
                }
            }
            by += (byte)(Test.instanceCount = lMeth(51, i1, i4));
            if (b) continue;
            i5 -= i4;
            i3 = (int)3376063208L;
        }
        i2 >>>= i;
        i5 += (int)f2;
        i3 = i;
        for (i20 = 5; i20 < 353; i20++) {
            i3 += i2;
            i -= 16778;
        }
        vMeth_check_sum += i + i1 + i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + by + (b ? 1 : 0) +
            Float.floatToIntBits(f2) + i20 + i21 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        float f3=2.509F;
        double d2=0.88528;
        int i22=5348, i23=-127, i24=37768, i25=25, i26=-12, i27=5, i28=20685, i29=-6;

        vMeth(iFld);
        iFld = (int)Test.instanceCount;
        Test.instanceCount -= Test.sFld;
        f3 = 1;
        while (++f3 < 221) {
            iFld = iFld;
            d2 -= -2.439F;
            iFld -= iFld;
            for (i22 = 3; i22 < 114; ++i22) {
                i23 <<= i23;
                iFld *= iFld;
                i23 *= (int)Test.instanceCount;
                i23 -= iFld;
                Test.instanceCount <<= iFld;
                Test.instanceCount = i23;
                i24 = 1;
                do {
                    Test.instanceCount -= i24;
                    i23 += (((i24 * Test.sFld) + i22) - i22);
                } while (++i24 < 2);
            }
        }
        for (i25 = 2; i25 < 307; ++i25) {
            i23 = (int)f3;
            i23 *= iFld;
            Test.instanceCount *= -6403889579823450026L;
            d2 += 24717;
            Test.instanceCount = Test.instanceCount;
            try {
                i27 = (23 % iArrFld[i25]);
                iFld1 = (i23 / i22);
                i27 = (12 % iFld1);
            } catch (ArithmeticException a_e) {}
            Test.instanceCount *= i23;
        }
        for (i28 = 20; i28 < 384; i28++) {
            switch ((((i27 >>> 1) % 4) * 5) + 42) {
            case 53:
                iFld = i29;
                i23 = i26;
            case 49:
            case 44:
                Test.instanceCount += (i28 + i27);
                break;
            case 43:
                iFld1 >>>= i25;
                break;
            }
        }

        FuzzerUtils.out.println("f3 d2 i22 = " + Float.floatToIntBits(f3) + "," + Double.doubleToLongBits(d2) + "," +
            i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 = " + i29);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld iFld = " + Test.instanceCount + "," + Test.sFld + "," +
            iFld);
        FuzzerUtils.out.println("iFld1 Test.fArrFld Test.dArrFld = " + iFld1 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
