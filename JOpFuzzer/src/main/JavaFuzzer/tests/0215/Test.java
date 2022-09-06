// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:46 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static float fFld=1.879F;
    public static boolean bFld=false;
    public static long lFld=2L;
    public static byte byArrFld[]=new byte[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)122);
        FuzzerUtils.init(Test.lArrFld, -642225153L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth(long l3, boolean b1) {

        int i9=90, i10=-55, i11=-8, i12=-26944, i13=-8, i14=1, iArr2[]=new int[N];
        double d1=27.56316, dArr1[]=new double[N];
        long l5=-1113130144L, lArr[]=new long[N];
        byte by1=5;

        FuzzerUtils.init(lArr, -4461576583146492448L);
        FuzzerUtils.init(dArr1, 0.127013);
        FuzzerUtils.init(iArr2, -2071);

        for (long l4 : lArr) {
            dArr1[(i9 >>> 1) % N] -= i9;
        }
        i9 += (int)l3;
        l3 = 2884;
        dArr1[(i9 >>> 1) % N] -= d1;
        l3 += i9;
        for (i10 = 8; i10 < 152; i10++) {
            i11 -= i11;
        }
        for (i12 = 15; i12 < 314; ++i12) {
            iArr2[i12] = 177;
            i13 -= i11;
            for (l5 = 1; 6 > l5; ++l5) {
                i9 = (int)-27.131F;
                by1 += (byte)(l5 * i11);
                l3 += by1;
            }
        }
        long meth_res = l3 + (b1 ? 1 : 0) + i9 + Double.doubleToLongBits(d1) + i10 + i11 + i12 + i13 + l5 + i14 + by1 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) +
            FuzzerUtils.checkSum(iArr2);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth(long l1, long l2) {

        double d=81.111609, dArr[]=new double[N];
        int i7=37479, i8=5, i15=-13, i16=60544, i17=-56717, i18=20, i19=-222, i20=14;
        boolean b=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(dArr, -20.59453);
        FuzzerUtils.init(lArr1, 21099L);

        dArr[(29613 >>> 1) % N] = d;
        for (i7 = 6; 145 > i7; i7++) {
            if (((b = (b = b)) | bMeth(l2, b)) & b) break;
        }
        for (i15 = 17; 355 > i15; ++i15) {
            if (b) {
                for (i17 = i15; i17 < 5; ++i17) {
                    for (i19 = i17; i19 < 1; ++i19) {
                        i18 += (i19 + i18);
                        i20 += 67;
                        i18 += i19;
                        i18 = 6;
                        i16 -= -1;
                        lArr1 = lArr1;
                        i16 += (i19 * i15);
                        i20 += i19;
                    }
                }
            } else {
                Test.instanceCount *= i18;
            }
        }
        long meth_res = l1 + l2 + Double.doubleToLongBits(d) + i7 + i8 + (b ? 1 : 0) + i15 + i16 + i17 + i18 + i19 +
            i20 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, int i4) {

        short s=-17971;
        int i5=-26331, i6=136, i21=12, i22=128, iArr1[]=new int[N], iArr3[]=new int[N];

        FuzzerUtils.init(iArr1, -63520);
        FuzzerUtils.init(iArr3, 3);

        iArr1[(i4 >>> 1) % N] >>= (int)((-(s++)) + ((-9 + Math.min(Test.instanceCount, Test.instanceCount)) *
            (Test.instanceCount * i3)));
        for (i5 = 7; i5 < 319; ++i5) {
            switch ((i5 % 1) + 49) {
            case 49:
                Test.byArrFld[i5] >>= (byte)(iMeth(Test.instanceCount, Test.instanceCount) + i4);
            default:
                switch (((49 >>> 1) % 6) + 81) {
                case 81:
                    iArr1[i5] *= i4;
                    break;
                case 82:
                    i6 -= -5127;
                    i4 <<= i6;
                    break;
                case 83:
                    for (i21 = 1; 5 > i21; i21++) {
                        iArr1[i5] = i21;
                        Test.bFld = true;
                        i22 ^= i4;
                        iArr1 = iArr3;
                        Test.instanceCount >>>= Test.instanceCount;
                    }
                    i6 -= i6;
                case 84:
                    i6 = i6;
                    break;
                case 85:
                    i3 -= i3;
                case 86:
                    if (Test.bFld) break;
                    break;
                default:
                    Test.fFld += ((long)i5 ^ (long)i6);
                }
            }
        }
        vMeth_check_sum += i3 + i4 + s + i5 + i6 + i21 + i22 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        long l=9L;
        int i=-4, i1=54551, i2=-135, i23=3, i24=26861, i25=-4, iArr[]=new int[N];
        byte by=64;
        short s1=-6276;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, -50361);
        FuzzerUtils.init(bArr, true);

        for (l = 5; l < 222; l++) {
            iArr[(int)(l + 1)] = (--i);
            for (i1 = 116; 6 < i1; i1 -= 3) {
                by = (byte)((by << i2) + Integer.reverseBytes((int)(i + Test.fFld)));
                Test.instanceCount += (i1 * i1);
                Test.instanceCount += (((i1 * Test.instanceCount) + i) - i2);
                if (true) break;
                by >>>= (byte)(i1 + i);
                if (bArr[i1]) continue;
                vMeth(-67, i1);
                Test.fFld -= i2;
            }
            i2 = i;
            i2 *= (int)-7L;
            iArr = iArr;
            i2 -= (int)-53514L;
            i2 += (int)(l + i2);
            i = i;
            i23 = 1;
            while (++i23 < 116) {
                for (i24 = 1; i24 > 1; i24--) {
                    iArr[i23] += (int)8003923288042470023L;
                    i25 *= s1;
                    iArr[(int)(l)] = -13;
                    Test.fFld += i24;
                    i2 += (i24 ^ i23);
                    Test.lArrFld = Test.lArrFld;
                    i <<= (int)Test.instanceCount;
                    bArr[(int)(l + 1)] = true;
                    i2 -= (int)Test.lFld;
                }
                Test.bFld = Test.bFld;
                i = i24;
            }
        }

        FuzzerUtils.out.println("l i i1 = " + l + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 by i23 = " + i2 + "," + by + "," + i23);
        FuzzerUtils.out.println("i24 i25 s1 = " + i24 + "," + i25 + "," + s1);
        FuzzerUtils.out.println("iArr bArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.lFld Test.byArrFld Test.lArrFld = " + Test.lFld + "," +
            FuzzerUtils.checkSum(Test.byArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  bMeth ->  bMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
