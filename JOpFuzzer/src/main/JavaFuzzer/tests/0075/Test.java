// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=192L;
    public volatile int iFld=-12;
    public static boolean bFld=true;
    public static byte byFld=-76;
    public static byte byArrFld[][]=new byte[N][N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)56);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i5, int i6, long l1) {

        int i7=-8, i8=33743, i9=186, i10=22824, i11=4699, i12=241, i13=180, i14=-11010;
        float f1=-1.367F;
        double d=52.88703, dArr[]=new double[N];
        boolean b=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 11L);
        FuzzerUtils.init(dArr, -113.77294);

        if (b) {
            for (i7 = 16; i7 < 377; ++i7) {
                lArr1[i7 - 1] = i8;
                for (i9 = 1; i9 < 5; i9++) {
                    dArr[i9 - 1] *= f1;
                }
            }
            lArr1[(i10 >>> 1) % N] = (long)d;
            for (i11 = 15; i11 < 287; ++i11) {
                Test.instanceCount *= -4L;
                i5 <<= i8;
                i10 += (int)f1;
                i6 = i10;
                for (i13 = 1; i13 < 6; i13++) {
                    Test.instanceCount += (i13 * i13);
                    l1 += Test.instanceCount;
                    i6 = i13;
                }
            }
        } else {
            i12 = (int)Test.instanceCount;
        }
        long meth_res = i5 + i6 + l1 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i11
            + i12 + i13 + i14 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth(int i2) {

        int i3=-106, i4=-20, i15=16091, i16=10, i17=59553, iArr1[]=new int[N];
        double d1=56.81696;
        long l2=5737595882059583113L, lArr[]=new long[N];
        float f2=1.571F;
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, -14L);
        FuzzerUtils.init(iArr1, 9);
        FuzzerUtils.init(sArr, (short)9827);

        if (true) {
            lArr[(i2 >>> 1) % N] = (i2--);
            for (i3 = 7; i3 < 165; i3++) {
                i4 = (Math.max(i3 + i2, i2) - ((i3 * i4) - (--iArr1[i3 - 1])));
                Test.instanceCount <<= (Test.byArrFld[i3 - 1][i3 - 1]--);
                iMeth(i2, i3, Test.instanceCount);
                i15 = 1;
                while (++i15 < 10) {
                    Test.bFld = Test.bFld;
                    i16 = 1;
                    do {
                        d1 = i2;
                    } while (++i16 < 1);
                    for (l2 = 1; l2 < 1; l2++) {
                        Test.instanceCount >>= 118;
                        sArr[i3] = (short)i17;
                        i2 += (int)f2;
                    }
                    i2 = i17;
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i15 + i16 + Double.doubleToLongBits(d1) + l2 + i17 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void vMeth(int i, long l, int i1) {

        int i18=-24, i19=4741, i20=43, i21=4493, i23=-5, i24=-22080, iArr2[]=new int[N];
        float f3=-1.125F;
        byte by=39;
        double dArr1[]=new double[N];

        FuzzerUtils.init(iArr2, 7331);
        FuzzerUtils.init(dArr1, 12.113953);

        i1 += sMeth(iFld);
        for (i18 = 17; i18 < 301; i18++) {
            i19 = i1;
            iArr2[i18] <<= i19;
            for (i20 = 1; i20 < 6; ++i20) {
                int i22=2;
                Test.instanceCount += iFld;
                i19 += (int)f3;
                i1 -= i22;
                for (i23 = 1; i23 < 2; i23++) {
                    if (Test.bFld) break;
                    switch ((i20 % 4) + 104) {
                    case 104:
                        f3 += (i23 + l);
                        iArr2[i18] ^= (int)35746L;
                        i24 |= (int)l;
                        iFld = iFld;
                        break;
                    case 105:
                        i21 += (i23 * by);
                        break;
                    case 106:
                        iArr2[i20 + 1] -= (int)f3;
                    case 107:
                        dArr1 = FuzzerUtils.double1array(N, (double)-2.24632);
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += i + l + i1 + i18 + i19 + i20 + i21 + Float.floatToIntBits(f3) + i23 + i24 + by +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public void mainTest(String[] strArr1) {

        float f=-34.948F, fArr[][]=new float[N][N];
        int i25=5, i26=215, i27=0, i28=32400, i29=224, i30=85, i31=164, i32=245, i33=-121, i34=43236, i35=165,
            iArr[]=new int[N];
        short s=24966;

        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(fArr, -26.114F);

        f += iArr[(iFld >>> 1) % N];
        vMeth(iFld, Test.instanceCount, iFld);
        for (i25 = 6; 190 > i25; ++i25) {
            fArr[i25 - 1][i25] -= Test.instanceCount;
            iArr[i25 + 1] += i25;
            for (i27 = 3; i27 < 136; i27++) {
                iFld -= i28;
            }
            for (i29 = 4; i29 < 136; i29 += 3) {
                float f4=0.50F;
                iFld = i25;
                iArr[i25] = i28;
                for (i31 = 1; 4 > i31; ++i31) {
                    i26 <<= i30;
                    i26 = (int)Test.instanceCount;
                    i32 = i31;
                    i30 = i33;
                    s += (short)(i31 | i25);
                    i26 %= (int)(Test.instanceCount | 1);
                    iArr[i31 - 1] = i33;
                    Test.instanceCount ^= s;
                }
                Test.instanceCount -= i26;
                i32 *= i29;
                i33 += (((i29 * i27) + i31) - i31);
                for (i34 = 1; i34 < 4; i34++) {
                    fArr[i34 + 1] = fArr[i29 + 1];
                    i32 >>= i31;
                    i32 = (int)f;
                }
                f4 = f;
                iFld += (((i29 * Test.byFld) + Test.instanceCount) - i34);
            }
            i33 += (int)Test.instanceCount;
            i35 = i34;
        }

        FuzzerUtils.out.println("f i25 i26 = " + Float.floatToIntBits(f) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("i33 s i34 = " + i33 + "," + s + "," + i34);
        FuzzerUtils.out.println("i35 iArr fArr = " + i35 + "," + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.bFld = " + Test.instanceCount + "," + iFld + "," +
            (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.byFld Test.byArrFld = " + Test.byFld + "," + FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
