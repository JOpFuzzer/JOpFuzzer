// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=31339L;
    public int iFld=-31;
    public static float fFld=106.438F;
    public byte byFld=86;
    public short sFld=10323;
    public float fArrFld[][]=new float[N][N];
    public static long lArrFld[]=new long[N];
    public volatile int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -253L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i7=3, i8=-139, i9=109, i10=-16886, iArr[]=new int[N];
        double d1=0.1449;
        byte by=5;
        short s1=-6064;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr, -8);
        FuzzerUtils.init(fArr1, -18.393F);

        i7 = 1;
        while (++i7 < 178) {
            i8 = 1;
            while (++i8 < 9) {
                for (i9 = 1; i9 < 1; i9++) {
                    d1 = i7;
                    by += (byte)i9;
                    i10 = i9;
                    Test.instanceCount -= s1;
                    i10 += (31410 + (i9 * i9));
                    Test.instanceCount = -1030934262L;
                    iArr[i7 - 1] *= i8;
                    i10 = (int)Test.instanceCount;
                    Test.lArrFld[i9 - 1] = i8;
                }
                fArr1[i8 - 1] += i10;
                iArr[i7] += s1;
                d1 = i10;
            }
        }
        vMeth_check_sum += i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + by + s1 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static int iMeth1(double d, long l, int i4) {

        int i5=8, i6=108, i11=2, i12=-13851, i13=-37273, i14=6164, i15=132;
        byte by1=-120;
        double d2=1.34951;
        float fArr2[]=new float[N];

        FuzzerUtils.init(fArr2, -12.535F);

        for (i5 = 11; i5 < 243; ++i5) {
            vMeth();
            for (i11 = 1; i11 < 7; ++i11) {
                for (i13 = 1; i13 < 2; i13++) {
                    i6 &= (int)Test.instanceCount;
                    Test.fFld *= by1;
                    i6 += (((i13 * Test.fFld) + i4) - i14);
                    d += 2;
                    i14 -= (int)d;
                }
                i4 |= i5;
                fArr2[i11] -= i4;
                Test.instanceCount -= i4;
                for (d2 = i5; d2 < 2; ++d2) {
                    i4 >>= by1;
                    i6 += (int)(d2 + l);
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + l + i4 + i5 + i6 + i11 + i12 + i13 + i14 + by1 +
            Double.doubleToLongBits(d2) + i15 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i) {

        int i1=-19108, i2=0, i3=200, i16=1;
        short s=2406;

        i += (int)Test.fFld;
        i1 = 1;
        do {
            iFld += (++s);
            for (i2 = 1; i2 < 5; ++i2) {
                iFld = (int)fArrFld[i1][i1];
                i = iMeth1(-1.25194, Test.instanceCount, 11);
                i3 >>= i3;
                i16 = 1;
                while (++i16 < 2) {
                    Test.lArrFld[i2] = i3;
                    byFld >>= (byte)25742;
                }
                Test.instanceCount += iFld;
                iArrFld[i1][i2] <<= -62243;
            }
            iFld += i1;
            s += (short)(((i1 * i) + i) - i);
            fArrFld[i1][i1 - 1] -= i;
        } while (++i1 < 370);
        long meth_res = i + i1 + s + i2 + i3 + i16;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=-95, i18=199, i19=254, i20=230, i21=-199, i22=-6662, i23=-210;
        double d3=-2.15924;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.113F);

        fArr[(iFld >>> 1) % N] = iMeth(iFld);
        for (i17 = 12; i17 < 262; i17++) {
            i18 += (((i17 * Test.instanceCount) + i18) - iFld);
            iFld += i17;
            Test.fFld = Test.instanceCount;
        }
        fArr[(i17 >>> 1) % N] = -90L;
        for (i19 = 16; i19 < 347; i19++) {
            Test.instanceCount >>= Test.instanceCount;
            try {
                i20 = (i19 / i19);
                iArrFld[i19][i19 + 1] = (i18 / i20);
                iFld = (iFld / i20);
            } catch (ArithmeticException a_e) {}
            i21 = 1;
            while (++i21 < 76) {
                Test.instanceCount = iFld;
                i20 -= iFld;
                d3 *= byFld;
                switch ((i21 % 2) + 84) {
                case 84:
                case 85:
                    switch ((i21 % 8) + 11) {
                    case 11:
                        d3 *= byFld;
                        iFld += (i21 - Test.instanceCount);
                        break;
                    case 12:
                        Test.instanceCount += i20;
                        sFld %= (short)(i21 | 1);
                        for (i22 = 1; i22 < 1; i22++) {
                            boolean b=true;
                            switch (((i21 % 2) * 5) + 58) {
                            case 63:
                                i20 += i22;
                            case 61:
                                Test.lArrFld = Test.lArrFld;
                            default:
                                Test.instanceCount = Test.instanceCount;
                                switch ((i21 % 8) + 93) {
                                case 93:
                                    iFld *= (int)-2.51759;
                                    switch ((i22 % 5) + 54) {
                                    case 54:
                                        Test.instanceCount += (((i22 * i20) + i23) - i20);
                                        i23 = i17;
                                    case 55:
                                        iFld = i20;
                                        break;
                                    case 56:
                                        i18 += (int)d3;
                                    case 57:
                                        sFld = (short)13916;
                                        break;
                                    case 58:
                                        Test.instanceCount += i22;
                                        break;
                                    }
                                    break;
                                case 94:
                                    i20 = (int)Test.instanceCount;
                                case 95:
                                case 96:
                                    i23 += (i22 ^ i18);
                                    break;
                                case 97:
                                    i18 -= 182;
                                case 98:
                                    i20 >>= iFld;
                                    break;
                                case 99:
                                    i20 = i18;
                                    break;
                                case 100:
                                    if (b) break;
                                    break;
                                default:
                                    Test.fFld += (i22 * i22);
                                }
                            }
                        }
                    case 13:
                        iArrFld[i19 + 1][i19 - 1] = i22;
                        break;
                    case 14:
                        iFld *= i17;
                        break;
                    case 15:
                        iFld *= 19947;
                        break;
                    case 16:
                        i18 = (int)-175L;
                        break;
                    case 17:
                        sFld += (short)(((i21 * Test.instanceCount) + i21) - i17);
                        break;
                    case 18:
                        i18 *= i21;
                        break;
                    }
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 d3 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i22 i23 fArr = " + i22 + "," + i23 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("byFld sFld fArrFld = " + byFld + "," + sFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("Test.lArrFld iArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
