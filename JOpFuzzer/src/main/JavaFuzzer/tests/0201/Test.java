// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-6L;
    public static boolean bFld=true;
    public static double dFld=-2.92464;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 4587080571270619339L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b, int i4) {

        float f=36.615F, f1=0.219F;
        int i5=-6, i6=-6826, i7=-14010, iArr1[]=new int[N];
        byte by=-60;
        double d=-2.63105;

        FuzzerUtils.init(iArr1, -49143);

        i4 >>>= i4;
        for (f = 12; f < 343; f++) {
            Test.lArrFld[(int)(f - 1)] ^= i4;
            by *= (byte)f;
        }
        f1 = i5;
        d -= Test.instanceCount;
        for (i6 = 4; i6 < 164; i6 += 2) {
            Test.instanceCount += (i6 ^ i7);
            iArr1[(i5 >>> 1) % N] -= 42;
            d += by;
            if (b) break;
            i7 -= i6;
            i7 += (int)21799L;
        }
        Test.lArrFld[(i4 >>> 1) % N] += -64876;
        iArr1[(i7 >>> 1) % N] |= by;
        vMeth1_check_sum += (b ? 1 : 0) + i4 + Float.floatToIntBits(f) + i5 + by + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(d) + i6 + i7 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i2, long l, int i3) {

        int i9=38, i10=10, i11=-10077, iArr2[]=new int[N];
        double d1=1.71102, dArr[]=new double[N];

        FuzzerUtils.init(iArr2, 8);
        FuzzerUtils.init(dArr, -96.24116);

        vMeth1(true, -6);
        for (int i8 : iArr2) {
            iArr2 = iArr2;
            if (Test.bFld) break;
            Test.lArrFld = Test.lArrFld;
            i9 = 1;
            do {
                i8 ^= i3;
                Test.bFld = false;
                Test.lArrFld[i9] = -37;
                iArr2[i9 - 1] ^= (int)l;
                i3 = i2;
            } while (++i9 < 4);
            if (Test.bFld) {
                for (i10 = 1; i10 < 4; ++i10) {
                    d1 *= i9;
                    dArr[i10 + 1] -= d1;
                }
            } else {
                i2 = i8;
            }
        }
        vMeth_check_sum += i2 + l + i3 + i9 + i10 + i11 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static long lMeth() {

        int i12=-95, i14=-9738, iArr3[][]=new int[N][N], iArr4[]=new int[N];
        long l1=3442126821L;
        float f2=0.262F, fArr[]=new float[N];
        byte by1=-23;
        short s=-22164;

        FuzzerUtils.init(fArr, 0.566F);
        FuzzerUtils.init(iArr3, -14966);
        FuzzerUtils.init(iArr4, 6);

        vMeth(i12, Test.instanceCount, 1);
        i12 = (int)l1;
        fArr = FuzzerUtils.float1array(N, (float)-66.345F);
        fArr[(i12 >>> 1) % N] += f2;
        for (long l2 : Test.lArrFld) {
            iArr3[(16 >>> 1) % N][(-13930 >>> 1) % N] += i12;
            i14 = 4;
            do {
                by1 <<= (byte)i14;
                Test.lArrFld[i14] = i14;
                s <<= (short)i14;
            } while (--i14 > 0);
            if (i14 != 0) {
            }
            i12 ^= i14;
            i12 = (int)l2;
            f2 += by1;
            iArr4[(i14 >>> 1) % N] += i14;
        }
        long meth_res = i12 + l1 + Float.floatToIntBits(f2) + i14 + by1 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr3) +
            FuzzerUtils.checkSum(iArr4);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=152, i1=2, i15=-45411, i16=-45776, i17=10, i18=5587, i19=5, i20=-50921, i21=12, i22=-16, i23=180,
            iArr[]=new int[N];
        float f3=-1.202F, fArr1[]=new float[N];
        byte by2=77;

        FuzzerUtils.init(iArr, -5);
        FuzzerUtils.init(fArr1, 0.273F);

        i = 1;
        do {
            switch ((i % 5) + 17) {
            case 17:
                switch ((i % 8) + 93) {
                case 93:
                    i1 -= (int)Test.instanceCount;
                    iArr[i] >>>= (int)(((-52473 + (++Test.instanceCount)) + (-(--Test.instanceCount))) + lMeth());
                    fArr1 = fArr1;
                    break;
                case 94:
                    i1 = i;
                    i1 *= (int)f3;
                    if (Test.bFld) {
                        for (i15 = 1; i15 < 86; ++i15) {
                            short s1=10641;
                            iArr[i + 1] &= i1;
                            i1 = (int)4550955731810419616L;
                            i17 = 1;
                            while (++i17 < 2) {
                                i1 += i;
                                f3 *= i1;
                                i1 >>>= (int)Test.instanceCount;
                            }
                            i16 += i15;
                            f3 *= i17;
                            iArr[i15 - 1] *= i17;
                            Test.instanceCount *= (long)Test.dFld;
                            f3 *= i16;
                            i16 = s1;
                        }
                        Test.instanceCount <<= -30989;
                    } else {
                        for (i18 = 2; i18 < 86; ++i18) {
                            i1 += (i18 * i18);
                            for (i20 = 2; 1 < i20; --i20) {
                                i21 = i21;
                                Test.lArrFld = Test.lArrFld;
                                i16 += (((i20 * i22) + i21) - Test.instanceCount);
                                Test.lArrFld[i] += i15;
                            }
                        }
                    }
                    break;
                case 95:
                    if (Test.bFld) continue;
                    break;
                case 96:
                case 97:
                    Test.instanceCount <<= i18;
                    break;
                case 98:
                    Test.bFld = Test.bFld;
                    break;
                case 99:
                case 100:
                    by2 += (byte)(i * i23);
                    break;
                default:
                    i23 -= (int)Test.instanceCount;
                }
                break;
            case 18:
            case 19:
                i23 += (i + Test.instanceCount);
            case 20:
                fArr1[i - 1] = i15;
                break;
            case 21:
                i16 |= i18;
                break;
            }
        } while (++i < 292);

        FuzzerUtils.out.println("i i1 f3 = " + i + "," + i1 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 by2 = " + i21 + "," + i22 + "," + by2);
        FuzzerUtils.out.println("i23 iArr fArr1 = " + i23 + "," + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.dFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
