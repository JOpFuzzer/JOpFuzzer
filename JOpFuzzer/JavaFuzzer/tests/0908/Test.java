// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:01 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=121L;
    public static boolean bFld=false;
    public static double dFld=-1.71157;
    public static short sFld=-508;
    public static volatile float fArrFld[]=new float[N];
    public int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.331F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static void vSmallMeth(long l, int i, double d) {

        short s=2940;

        l = (116 + (s--));
        vSmallMeth_check_sum += l + i + Double.doubleToLongBits(d) + s;
    }

    public static int iMeth2(int i3, double d1, long l1) {

        double d2=2.105131;
        int i4=7, i5=25219, i6=-50477, i7=-14, i8=-116, i9=4;
        short s1=16819;
        float f=2.1003F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -53417L);

        for (d2 = 11; d2 < 317; ++d2) {
            for (i5 = 1; 5 > i5; i5++) {
                Test.instanceCount += i5;
            }
            i4 += (int)(((d2 * Test.instanceCount) + i5) - i6);
            i6 += (int)1546058508605874238L;
            l1 += (long)(((d2 * i3) + i5) - i5);
            lArr = FuzzerUtils.long1array(N, (long)-23990L);
            l1 += (long)d2;
            i3 += s1;
            i3 += i4;
            i6 = (int)-10L;
        }
        for (i7 = 5; i7 < 245; i7++) {
            for (f = 1; 7 > f; f++) {
                Test.bFld = Test.bFld;
                i3 = (int)l1;
            }
        }
        long meth_res = i3 + Double.doubleToLongBits(d1) + l1 + Double.doubleToLongBits(d2) + i4 + i5 + i6 + s1 + i7 +
            i8 + Float.floatToIntBits(f) + i9 + FuzzerUtils.checkSum(lArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i1) {

        float f1=73.508F;
        short s2=-28469, sArr[]=new short[N];
        int i10=51497, i11=73, iArr[]=new int[N];
        double dArr[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(dArr, 1.112103);
        FuzzerUtils.init(lArr1, -62451L);
        FuzzerUtils.init(sArr, (short)13235);

        for (int i2 : iArr) {
            Test.fArrFld = FuzzerUtils.float1array(N, (float)0.857F);
            iArr[(i1 >>> 1) % N] -= iMeth2(i1, Test.dFld, 0L);
        }
        Test.instanceCount = (long)f1;
        iArr[(i1 >>> 1) % N] += (int)Test.instanceCount;
        for (double d3 : dArr) {
            lArr1[(168 >>> 1) % N] = i1;
            iArr[(-33 >>> 1) % N] ^= s2;
            Test.instanceCount -= Test.instanceCount;
            if (i1 != 0) {
            }
            iArr[(i1 >>> 1) % N] = (int)Test.instanceCount;
            for (i10 = 4; i10 > 1; i10--) {
                Test.instanceCount *= i10;
                iArr[i10] &= (int)5L;
                sArr[i10 + 1] -= (short)i11;
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f1) + s2 + i10 + i11 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i12=6, i14=9, i15=98, i16=3, iArr1[]=new int[N];
        long l2=-1370841643L;
        float f2=111.864F;

        FuzzerUtils.init(iArr1, 173);

        vSmallMeth(788620094547496070L, (int)((iMeth1(i12) - -2.760F) + Test.instanceCount), Test.dFld);
        i12 = (int)Test.instanceCount;
        i12 >>= i12;
        i12 -= -80;
        i12 -= i12;
        l2 = 260;
        do {
            i12 *= (int)l2;
            Test.dFld = -10;
            for (i14 = 6; i14 > 1; i14 -= 2) {
                f2 += i14;
                i16 = 1;
                do {
                    i12 = -4537;
                    Test.instanceCount += (4272 + (i16 * i16));
                    iArr1[(int)(l2 - 1)] = (int)f2;
                    f2 += (248 + (i16 * i16));
                } while (++i16 < 3);
            }
        } while (--l2 > 0);
        long meth_res = i12 + l2 + i14 + i15 + Float.floatToIntBits(f2) + i16 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=44, i18=58320, i19=11044, i20=-4, i21=-81, i22=9, i23=1528, i24=251;
        double d4=1.92240, d5=95.10207, dArr1[]=new double[N];
        float f3=-1.652F;
        boolean b=true;

        FuzzerUtils.init(dArr1, 0.43776);

        for (int smallinvoc=0; smallinvoc<603; smallinvoc++) vSmallMeth((-iMeth()) * -31, i17, -125.99404);
        i17 >>>= i17;
        for (i18 = 2; i18 < 387; i18++) {
            Test.dFld = i19;
            i17 += 204;
            for (i20 = 4; i20 < 65; i20++) {
                Test.fArrFld[i18] = i17;
                i19 *= (int)Test.instanceCount;
                for (d4 = i20; d4 < 2; d4 += 2) {
                    Test.instanceCount += (long)(d4 - Test.instanceCount);
                    i22 -= i20;
                    i22 = Test.sFld;
                }
                f3 += Test.instanceCount;
                Test.instanceCount <<= Test.instanceCount;
                if (Test.bFld) break;
                for (d5 = 1; d5 < 2; ++d5) {
                    Test.instanceCount = i20;
                }
            }
            if (b) break;
            i24 = 1;
            while (++i24 < 65) {
                i23 += (int)Test.instanceCount;
                i21 *= i23;
            }
            Test.instanceCount |= Test.instanceCount;
            i19 += (i18 * i18);
            i17 = i22;
            i23 *= i18;
        }
        i22 += i21;
        dArr1[(i24 >>> 1) % N] -= Test.instanceCount;
        i23 = (int)f3;
        iArrFld[(i20 >>> 1) % N] = iArrFld[(i22 >>> 1) % N];
        Test.bFld = b;

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 d4 = " + i20 + "," + i21 + "," + Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("i22 f3 d5 = " + i22 + "," + Float.floatToIntBits(f3) + "," +
            Double.doubleToLongBits(d5));
        FuzzerUtils.out.println("i23 b i24 = " + i23 + "," + (b ? 1 : 0) + "," + i24);
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.dFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.sFld Test.fArrFld iArrFld = " + Test.sFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}