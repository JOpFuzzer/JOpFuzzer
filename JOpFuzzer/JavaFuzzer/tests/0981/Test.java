// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:03 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=12L;
    public static float fFld=-2.734F;
    public short sFld=-6778;
    public double dFld=-37.108756;
    public static int iArrFld[][]=new int[N][N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -14);
    }

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i12=153;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        i12 *= i12;
        bArr = bArr;
        i12 <<= i12;
        i12 = i12;
        i12 -= (int)Test.instanceCount;
        vMeth_check_sum += i12 + FuzzerUtils.checkSum(bArr);
    }

    public static long lMeth1(int i9, long l) {

        int i10=-16359, i11=-110, i13=-52532, i14=21106, i15=1, i16=19550, i17=11460;
        byte by=-106;
        short s=23078;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 108.121047);

        i9 %= (int)(0L | 1);
        i9 = i9;
        for (i10 = 199; i10 > 4; i10--) {
            vMeth();
            Test.instanceCount = -58648;
            try {
                i11 = (-24 / Test.iArrFld[i10][i10]);
                i13 = (i13 % 9939);
                i11 = (-176 % i9);
            } catch (ArithmeticException a_e) {}
            for (i14 = 1; i14 < 8; i14++) {
                for (i16 = 1; 2 > i16; i16++) {
                    i11 = i13;
                    i15 &= i11;
                    Test.fFld += i16;
                    i17 /= (int)(by | 1);
                    dArr[i14 - 1] -= s;
                    Test.instanceCount <<= -822084285497978132L;
                    i9 = i14;
                }
            }
        }
        long meth_res = i9 + l + i10 + i11 + i13 + i14 + i15 + i16 + i17 + by + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(int i2, int i3) {

        int i4=-175, i5=-239, i6=14, i7=-198, i8=-10;
        float f=12.24F;
        byte by1=-110;
        boolean b=false;

        i4 = 220;
        do {
            for (i5 = 1; i5 < 21; i5++) {
                for (i7 = 1; i7 < 2; ++i7) {
                    f += (Test.instanceCount &= ((i6 - 92) - i8));
                    i2 = (int)Test.instanceCount;
                    Test.iArrFld[i7 + 1][i5 + 1] = (int)Math.min(Test.instanceCount--, Math.abs(3L) - (-9 * lMeth1(i7,
                        Test.instanceCount)));
                    switch (((i4 % 2) * 5) + 28) {
                    case 37:
                        i6 = i2;
                        by1 >>= (byte)i4;
                        Test.iArrFld[i5 + 1][i5 - 1] += (int)Test.instanceCount;
                        Test.iArrFld[i5][i4] = (int)Test.instanceCount;
                    case 33:
                        Test.instanceCount += Test.instanceCount;
                        i3 >>= (int)Test.instanceCount;
                        b = b;
                        break;
                    default:
                        i6 += i3;
                    }
                }
            }
        } while ((i4 -= 3) > 0);
        long meth_res = i2 + i3 + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) + by1 + (b ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-203, i1=-46650, i18=-148, i19=64518, i20=38583, i21=-26539, i22=52749;
        double d=-80.35966;
        byte by2=29;

        for (i = 3; i < 279; i++) {
            i1 *= (int)lMeth(i1, i1);
        }
        d = 1;
        do {
            for (i18 = 11; i18 < 188; i18 += 2) {
                for (i20 = 1; i20 < 3; ++i20) {
                    sFld ^= (short)Test.instanceCount;
                    i1 = i18;
                    Test.instanceCount = 1063538711793600281L;
                }
                i22 = 1;
                do {
                    switch ((int)((d % 8) + 86)) {
                    case 86:
                        i1 = i18;
                        i21 += i22;
                        break;
                    case 87:
                        Test.instanceCount -= -989855318L;
                        break;
                    case 88:
                    case 89:
                        i21 >>= i20;
                        i21 += (((i22 * i20) + i20) - i21);
                        break;
                    case 90:
                        Test.instanceCount -= i21;
                        Test.instanceCount *= i18;
                        i19 += (((i22 * i18) + sFld) - Test.fFld);
                        break;
                    case 91:
                        dFld = -10;
                        i1 |= (int)Test.instanceCount;
                        Test.instanceCount += (i22 * i22);
                        break;
                    case 92:
                        Test.fFld *= i1;
                        i21 |= -13;
                        break;
                    case 93:
                    default:
                        Test.instanceCount += (i22 | Test.instanceCount);
                        switch (((i18 >>> 1) % 2) + 112) {
                        case 112:
                            by2 >>= (byte)Test.instanceCount;
                        case 113:
                            i1 <<= i20;
                            Test.instanceCount = i20;
                            lArrFld[(int)(d + 1)] = i21;
                            break;
                        default:
                            i1 -= (int)3968561194422901150L;
                        }
                    }
                } while (++i22 < 3);
            }
        } while (++d < 133);

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 by2 = " + i21 + "," + i22 + "," + by2);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + sFld);
        FuzzerUtils.out.println("dFld Test.iArrFld lArrFld = " + Double.doubleToLongBits(dFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}