// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:00 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=4L;
    public static volatile byte byFld=44;
    public static volatile short sFld=-12156;
    public static volatile long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 274827714L);
        FuzzerUtils.init(Test.dArrFld, 0.80927);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8, int i9) {

        double d=-19.112838, dArr[]=new double[N];
        int i10=-112, i11=-26334, i12=-5, i13=116, i14=51188, i15=-20420, i16=-154, i17=-236, i18=1;
        long l=9L;
        boolean b1=true;
        float f1=49.44F;
        short s=30121;

        FuzzerUtils.init(dArr, 67.62744);

        i9 *= (int)d;
        Test.instanceCount |= i8;
        for (i10 = 16; 331 > i10; i10++) {
            switch (((-11 >>> 1) % 5) + 40) {
            case 40:
                for (l = 1; l < 5; l++) {
                    boolean b=true;
                    b = false;
                }
                for (i13 = 1; 5 > i13; i13++) {
                    for (i15 = 1; i15 < 2; i15++) {
                        i8 += i15;
                        Test.instanceCount = Test.instanceCount;
                    }
                    if (b1) continue;
                    dArr = dArr;
                    for (i17 = 2; i17 > 1; --i17) {
                        Test.instanceCount += i16;
                        i11 ^= i13;
                    }
                }
                break;
            case 41:
                f1 += (((i10 * Test.instanceCount) + i17) - Test.instanceCount);
                break;
            case 42:
                i12 = Test.byFld;
            case 43:
                i16 -= -73;
                break;
            case 44:
                Test.lArrFld[i10 - 1] -= i11;
                break;
            default:
                i11 >>= s;
            }
        }
        vMeth1_check_sum += i8 + i9 + Double.doubleToLongBits(d) + i10 + i11 + l + i12 + i13 + i14 + i15 + i16 + (b1 ?
            1 : 0) + i17 + i18 + Float.floatToIntBits(f1) + s + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth() {

        int i6=4, i7=7, i19=63787, i20=-134, i21=2, i22=-16062, i23=-233, i24=19915;
        float f2=-1.403F;
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, 71.96124);

        for (i6 = 5; 217 > i6; ++i6) {
            i7 <<= (-i6);
            vMeth1(i7, i6);
            for (i19 = 1; i19 < 8; ++i19) {
                for (i21 = 1; i21 < 2; ++i21) {
                    i20 >>= i20;
                    Test.instanceCount += i22;
                    Test.sFld *= (short)f2;
                    i7 -= i20;
                    i20 += i20;
                }
            }
            f2 += i6;
            i7 += (i6 * i6);
            for (i23 = 1; i23 < 8; i23++) {
                i22 <<= 4;
                dArr1[i23 + 1] += -245;
            }
        }
        vMeth_check_sum += i6 + i7 + i19 + i20 + i21 + i22 + Float.floatToIntBits(f2) + i23 + i24 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public static int iMeth(int i5) {

        int i25=3, i26=-9, i27=-11823, i28=3, i29=0, i31=-94, i32=-4, i33=63636;
        float f3=-18.513F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.157F);

        Test.lArrFld[(i5 >>> 1) % N] += Test.instanceCount;
        vMeth();
        for (i25 = 1; i25 < 206; ++i25) {
            i5 += i25;
            for (i27 = i25; i27 < 8; i27++) {
                i29 = 1;
                do {
                    int i30=64;
                    i30 += (int)f3;
                    Test.instanceCount |= Test.sFld;
                } while (++i29 < 1);
                for (i31 = 1; i31 > 1; i31--) {
                    fArr[i27 + 1] = i26;
                    i28 >>>= i5;
                    i26 >>>= i25;
                }
                Test.lArrFld = FuzzerUtils.long1array(N, (long)-7L);
                i28 = (int)f3;
                i26 = i33;
            }
        }
        long meth_res = i5 + i25 + i26 + i27 + i28 + i29 + Float.floatToIntBits(f3) + i31 + i32 + i33 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=51588, i1=47138, i2=-17018, i3=-200, i4=-28896, iArr[][]=new int[N][N];
        float f=-2.798F, f4=-75.62F;
        boolean b2=false, bArr[]=new boolean[N];
        double d1=99.121308;

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr, 60071);

        bArr = (bArr = (bArr = (bArr = bArr)));
        for (i = 14; i < 340; i++) {
            for (f = 77; 3 < f; --f) {
                i2 = (int)(i2 * (Test.instanceCount--));
                for (i3 = 1; 2 > i3; ++i3) {
                    i1 += i3;
                    switch ((i3 % 9) + 121) {
                    case 121:
                        i1 += (int)Test.instanceCount;
                        i2 &= (--i4);
                    case 122:
                        i1 += i3;
                        i2 = (int)(((0.744F - (-(i + i1))) + (3 + iMeth(i3))) + -62063L);
                        Test.instanceCount += (i3 * i3);
                        Test.dArrFld = Test.dArrFld;
                        break;
                    case 123:
                        b2 = b2;
                        i4 += (((i3 * i4) + i3) - i);
                    case 124:
                        i2 = i2;
                        Test.lArrFld[i3] = Test.instanceCount;
                        f4 -= 30;
                        break;
                    case 125:
                        Test.instanceCount /= (i3 | 1);
                        i1 += (int)Test.instanceCount;
                        break;
                    case 126:
                    case 127:
                        if (b2) continue;
                        f4 = 47174;
                        i1 |= i1;
                        i2 = i4;
                        break;
                    case 128:
                        Test.sFld = (short)Test.instanceCount;
                        switch ((i % 6) + 79) {
                        case 79:
                            f4 *= Test.byFld;
                            i1 += i;
                            i4 -= (int)Test.instanceCount;
                            f4 = i4;
                        case 80:
                            i4 = i2;
                            break;
                        case 81:
                            i2 += (int)f4;
                            break;
                        case 82:
                            iArr = iArr;
                        case 83:
                            if (b2) continue;
                        case 84:
                            f4 += i3;
                            break;
                        default:
                            f4 = i4;
                        }
                        break;
                    case 129:
                        i1 *= (int)d1;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("b2 f4 d1 = " + (b2 ? 1 : 0) + "," + Float.floatToIntBits(f4) + "," +
            Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("bArr iArr = " + FuzzerUtils.checkSum(bArr) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.sFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("Test.lArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}