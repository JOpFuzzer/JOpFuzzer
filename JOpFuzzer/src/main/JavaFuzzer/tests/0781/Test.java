// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:58 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1467129845441195263L;
    public static short sFld=22407;
    public static byte byFld=-124;
    public static int iFld=12;
    public boolean bFld=true;
    public int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public boolean bArrFld[]=new boolean[N];
    public int iArrFld1[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, -54.128933);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i13=3, i14=-14, i15=-178, i16=-3, i17=-190, iArr2[]=new int[N];
        float f3=-9.519F;
        boolean b=false;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-8713);
        FuzzerUtils.init(iArr2, -2850);

        i13 *= i13;
        i13 += Test.byFld;
        sArr[(i13 >>> 1) % N] *= (short)i13;
        for (i14 = 7; i14 < 367; i14++) {
            double d=0.513;
            switch ((i14 % 3) + 89) {
            case 89:
                i13 = (int)1.294F;
                i15 += i14;
                iArr2[i14] &= i15;
                if (i15 != 0) {
                }
                break;
            case 90:
                if (b) {
                    for (i16 = 1; i16 < 5; i16++) {
                        Test.instanceCount *= i16;
                    }
                    d *= -9835;
                    iArr2[(-12622 >>> 1) % N] -= (int)f3;
                    i17 += Test.sFld;
                }
                break;
            case 91:
                i13 = i13;
                break;
            }
        }
        long meth_res = i13 + i14 + i15 + i16 + i17 + Float.floatToIntBits(f3) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i5, int i6, long l1) {

        int i7=30015, i8=2, i9=27074, i10=-33970, i11=-113, i12=-150, iArr1[]=new int[N];
        byte by=97;
        float f2=-23.990F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 74.462F);
        FuzzerUtils.init(iArr1, -122);

        for (i7 = 1; 346 > i7; i7++) {
            for (i9 = 1; i9 < 5; ++i9) {
                fArr = (fArr = (fArr = (fArr = fArr)));
                for (i11 = 1; 2 > i11; ++i11) {
                    i5 += (i11 + by);
                    f2 = Test.instanceCount;
                    Test.instanceCount *= iArr1[i9 - 1];
                    i6 ^= (int)Test.instanceCount;
                    f2 += iMeth1();
                    Test.iFld += (i11 * i11);
                    l1 += Test.iFld;
                    i5 -= (int)Test.instanceCount;
                    i6 += (-4 + (i11 * i11));
                }
                Test.iFld *= i6;
                i8 += (-5439 + (i9 * i9));
            }
        }
        vMeth_check_sum += i5 + i6 + l1 + i7 + i8 + i9 + i10 + i11 + i12 + by + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(long l) {

        int i4=-243, i18=0, i19=3, i20=13, i21=-9, i22=-182, i23=-29278, iArr[]=new int[N];
        float f1=86.655F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 198);
        FuzzerUtils.init(lArr, 71L);

        i4 -= ((i4++) % (Integer.reverseBytes((int)(f1 + l)) | 1));
        iArr[(i4 >>> 1) % N] += (Test.sFld--);
        vMeth(Test.iFld, i4, Test.instanceCount);
        for (i18 = 8; i18 < 235; i18++) {
            for (i20 = 1; i20 < 7; i20++) {
                switch ((i20 % 2) + 13) {
                case 13:
                    Test.instanceCount += (((i20 * Test.instanceCount) + f1) - Test.instanceCount);
                    i21 *= (int)f1;
                    switch ((i18 % 2) + 125) {
                    case 125:
                        i19 |= Test.sFld;
                    case 126:
                    }
                case 14:
                default:
                    for (i22 = 1; i22 < 2; ++i22) {
                        Test.byFld += (byte)(((i22 * i18) + f1) - i23);
                        i23 += (i22 * i22);
                        i4 += i22;
                        lArr[i22 - 1] -= l;
                    }
                }
            }
        }
        long meth_res = l + i4 + Float.floatToIntBits(f1) + i18 + i19 + i20 + i21 + i22 + i23 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=5, i1=10, i2=61571, i3=-2, i24=28, i25=194, i26=21, i27=53900;
        float f=84.657F, f4=-59.611F;

        for (i = 386; 24 < i; i--) {
            for (i2 = 4; 70 > i2; ++i2) {
                Test.instanceCount += (long)f;
                iArrFld[i + 1] = (int)(((--f) - (i1--)) + iArrFld[i]);
                Test.instanceCount = (--i3);
                i1 += Integer.reverseBytes(i3);
                f -= (iMeth(Test.instanceCount) + f);
            }
            for (i24 = 2; 70 > i24; i24++) {
                for (i26 = i; i26 < 2; ++i26) {
                    f4 -= Test.instanceCount;
                    i1 *= (int)-150L;
                    i3 <<= i24;
                    Test.iFld += i2;
                    i3 = i;
                    iArrFld[i26 - 1] *= i3;
                    Test.instanceCount -= Test.iFld;
                    if (bFld) break;
                    switch (((i % 10) * 5) + 36) {
                    case 64:
                        if (bFld) continue;
                        Test.iFld <<= i3;
                        break;
                    case 53:
                        i1 -= i;
                        break;
                    case 84:
                    case 74:
                        i27 = i2;
                        Test.dArrFld[i26 - 1] += i25;
                        i1 &= i1;
                        i27 = -132;
                        break;
                    case 40:
                        f4 += Test.sFld;
                        switch (((i24 % 1) * 5) + 82) {
                        case 85:
                            bArrFld[i26 + 1] = bFld;
                            iArrFld1 = FuzzerUtils.int2array(N, (int)-29135);
                            i25 += i26;
                            break;
                        default:
                            Test.instanceCount <<= Test.instanceCount;
                        }
                    case 44:
                        Test.instanceCount = i27;
                        break;
                    case 59:
                        Test.instanceCount -= 34639;
                        break;
                    case 73:
                        i1 = (int)Test.instanceCount;
                        break;
                    case 66:
                        Test.iFld += i26;
                        break;
                    case 42:
                        Test.instanceCount += (i26 * i26);
                        break;
                    default:
                        i25 *= (int)123.15613;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 f i24 = " + i3 + "," + Float.floatToIntBits(f) + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("f4 = " + Float.floatToIntBits(f4));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld bFld iArrFld = " + Test.iFld + "," + (bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.dArrFld bArrFld iArrFld1 = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(bArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld1));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
