// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:46 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=5697036508956884572L;
    public double dFld=-2.28595;
    public static boolean bFld=false;
    public static volatile byte byFld=-56;
    public long lFld=-562988528L;
    public long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public boolean bArrFld[]=new boolean[N];
    public double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -73);
        FuzzerUtils.init(Test.fArrFld, -2.187F);
    }

    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l1, int i9) {

        int i10=96, i11=-16632, i12=0, i13=65, i14=9, i15=-23;
        short s=24203;
        float f=65.371F, f1=-2.312F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, -2.880F);

        if (true) {
            for (i10 = 13; 216 > i10; i10 += 2) {
                i9 = 159;
                i11 *= i11;
                i9 += (((i10 * i9) + i9) - s);
                for (i12 = 1; i12 < 15; ++i12) {
                    i9 *= (int)l1;
                }
                if (Test.bFld) {
                    Test.iArrFld[i10] = -37199;
                    i14 = 15;
                    do {
                        for (f = i10; f < 3; ++f) {
                            i15 += (int)((long)f | Test.instanceCount);
                            f1 += (20432L + (f * f));
                            fArr[i14 - 1] += i14;
                            Test.iArrFld[(int)(f)] >>>= (int)l1;
                        }
                    } while ((i14 -= 3) > 0);
                } else if (false) {
                    i9 = i15;
                } else if (Test.bFld) {
                    i9 >>= i9;
                }
            }
        }
        vMeth_check_sum += l1 + i9 + i10 + i11 + s + i12 + i13 + i14 + Float.floatToIntBits(f) + i15 +
            Float.floatToIntBits(f1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth() {

        int i16=4, i17=-5336, i18=27954, i19=-251, i20=-31889, i21=52, i22=47;
        byte by=50;
        float f2=2.205F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.39676);

        if (Test.bFld) {
            vMeth(Test.instanceCount, 5);
        } else if (Test.bFld) {
            Test.iArrFld[(i16 >>> 1) % N] = -27;
            Test.instanceCount >>= i16;
            i16 += by;
            f2 += i16;
        } else if (Test.bFld) {
        } else {
            for (i17 = 12; i17 < 237; i17++) {
                i18 += i17;
                f2 %= (i17 | 1);
                i16 = i16;
                for (i19 = 1; 7 > i19; i19++) {
                    for (i21 = 2; i21 > 1; i21--) {
                        Test.bFld = Test.bFld;
                        Test.instanceCount = Test.instanceCount;
                        dArr = FuzzerUtils.double1array(N, (double)-2.18739);
                    }
                }
            }
        }
        long meth_res = i16 + by + Float.floatToIntBits(f2) + i17 + i18 + i19 + i20 + i21 + i22 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public byte byMeth() {

        int i2=206, i3=8, i4=38, i5=9, i6=61723, i7=28212, i8=-47721, i23=-167;

        i2 = (int)(-(i2 * (Test.instanceCount--)));
        for (i3 = 7; i3 < 160; ++i3) {
            i2 += (int)(dFld - ((i3 * i3) - (i4 * Test.instanceCount)));
            for (i5 = 1; i5 < 10; ++i5) {
                for (i7 = 1; 2 > i7; i7 += 2) {
                    Test.instanceCount += (lArrFld[i7 + 1] - ((++Test.instanceCount) * iMeth()));
                    Test.instanceCount = Test.instanceCount;
                    Test.iArrFld[i7] += (int)Test.instanceCount;
                    i6 += i4;
                    if (i23 != 0) {
                    }
                    if (Test.bFld) break;
                    if (Test.bFld) break;
                    i6 = 250;
                    i8 += i7;
                }
                Test.instanceCount -= i2;
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + i6 + i7 + i8 + i23;
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l=2927231880L, lArr[]=new long[N];
        int i=5, i1=161, i24=7674, i25=148, i26=-9, i27=-45046, iArr[]=new int[N];
        float f3=-84.1006F;

        FuzzerUtils.init(lArr, -176L);
        FuzzerUtils.init(iArr, -11);

        lArr = (lArr = lArr);
        for (l = 14; 285 > l; ++l) {
            i1 = 1;
            while (++i1 < 93) {
                iArr[(int)(l)] -= (byMeth() - i);
                i = (int)Test.instanceCount;
                Test.fArrFld[i1 + 1] = l;
            }
            for (i24 = 5; i24 < 93; i24 += 2) {
                for (i26 = 1; i26 < 3; ++i26) {
                    f3 += Test.byFld;
                    Test.bFld = Test.bFld;
                    bArrFld[i26] = Test.bFld;
                    i25 = (int)lFld;
                    lFld += i26;
                    switch (((i24 >>> 1) % 8) + 40) {
                    case 40:
                        dFld += lFld;
                        break;
                    case 41:
                        Test.instanceCount &= l;
                    case 42:
                        Test.instanceCount = -15939L;
                        break;
                    case 43:
                        i >>= i;
                        i27 = i1;
                        break;
                    case 44:
                        lFld = i;
                        i = Test.byFld;
                        break;
                    case 45:
                        Test.byFld -= (byte)i27;
                        i27 += (i26 * i26);
                        i27 -= i25;
                        break;
                    case 46:
                        lFld = -88;
                    case 47:
                        f3 = Test.instanceCount;
                        i27 <<= (int)lFld;
                        f3 /= ((long)(f3) | 1);
                        break;
                    default:
                        dArrFld[(int)(l)][i24 + 1] -= -1.128666;
                    }
                }
                i27 = i27;
            }
        }

        FuzzerUtils.out.println("l i i1 = " + l + "," + i + "," + i1);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 f3 lArr = " + i27 + "," + Float.floatToIntBits(f3) + "," +
            FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.bFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.byFld lFld lArrFld = " + Test.byFld + "," + lFld + "," +
            FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.iArrFld Test.fArrFld bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(bArrFld));
        FuzzerUtils.out.println("dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
