// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:59 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-10L;
    public static byte byFld=21;
    public static volatile double dFld=-2.70517;
    public static float fFld=-12.298F;
    public static volatile double dFld1=39.103286;
    public static float fArrFld[]=new float[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -2.488F);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3, int i4, long l1) {

        double d=84.49172;
        int i5=4, i6=-175, i7=-3, i8=-39401, i9=14009, i10=29552, i11=1, iArr[]=new int[N];
        float f=-2.270F;

        FuzzerUtils.init(iArr, -8);

        i4 = i4;
        Test.instanceCount += -1L;
        l1 = 8;
        Test.byFld = (byte)i4;
        for (d = 14; d < 284; d++) {
            i3 -= (int)d;
            iArr[(int)(d)] -= i5;
            for (i6 = 1; i6 < 6; i6++) {
                for (i8 = 1; i8 < 2; i8++) {
                    i7 -= i8;
                    i5 = (int)d;
                }
                for (i10 = 1; i10 < 2; ++i10) {
                    i3 = (int)f;
                    i7 += (i10 ^ i9);
                    i9 = i8;
                }
            }
        }
        long meth_res = i3 + i4 + l1 + Double.doubleToLongBits(d) + i5 + i6 + i7 + i8 + i9 + i10 + i11 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i1, long l, int i2) {

        int i12=-25060, i13=-4, i14=-2, iArr1[]=new int[N];
        float f1=2.874F, f2=-83.917F;
        short s=3527;

        FuzzerUtils.init(iArr1, 17);

        i1 += ((--i2) * (17453 << iMeth(147, i1, Test.instanceCount)));
        Test.byFld = (byte)i2;
        for (i12 = 2; 233 > i12; i12++) {
            i13 = (int)Test.instanceCount;
            i2 += (int)l;
            for (f1 = 1; f1 < 7; ++f1) {
                double d1=-1.121279;
                f2 = Test.instanceCount;
                try {
                    i13 = (208 / i14);
                    iArr1[(int)(f1)] = (i14 % i14);
                    iArr1[i12 - 1] = (-21690 % i13);
                } catch (ArithmeticException a_e) {}
                i14 = Test.byFld;
                i14 += (-1015 + (f1 * f1));
                f2 = i13;
                f2 = (float)d1;
                i1 -= i12;
                i13 >>= (int)Test.instanceCount;
            }
            i2 -= s;
        }
        vMeth_check_sum += i1 + l + i2 + i12 + i13 + Float.floatToIntBits(f1) + i14 + Float.floatToIntBits(f2) + s +
            FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth() {

        int i15=7, i16=-26057, i17=-151, i18=5348, i19=-46, i20=87, iArr2[]=new int[N];
        short s1=16148;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr2, -5);
        FuzzerUtils.init(lArr, -7L);

        vMeth(i15, 8916293271136410451L, i15);
        i15 <<= i15;
        for (i16 = 3; i16 < 134; ++i16) {
            iArr2[i16 - 1] = (int)Test.instanceCount;
            i17 += (int)Test.dFld;
        }
        s1 = (short)i15;
        Test.instanceCount -= i16;
        i15 <<= (int)Test.instanceCount;
        for (i18 = 6; i18 < 202; i18 += 2) {
            i20 = 1;
            do {
                i19 = (int)Test.instanceCount;
                lArr[i20 - 1] = Test.instanceCount;
                i19 = (int)Test.dFld;
                i15 *= Test.byFld;
                Test.fFld %= (i17 | 1);
            } while ((i20 += 3) < 16);
        }
        long meth_res = i15 + i16 + i17 + s1 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-48696, i21=-36, i22=2, i23=-78, i24=54, i25=-203, i26=160, i27=-119, i28=28414;
        short s2=-31897;
        long l2=2342545354382523356L, lArr1[]=new long[N];
        boolean b=false;

        FuzzerUtils.init(lArr1, -187L);

        i |= (int)((i %= (int)(i | 1)) + fMeth());
        for (i21 = 2; i21 < 148; ++i21) {
            i = (int)Test.fFld;
            Test.byFld = (byte)Test.instanceCount;
            Test.fArrFld[i21] += Test.instanceCount;
            i22 = s2;
            try {
                i = (iArrFld[i21 + 1] % i21);
                i22 = (-34 / iArrFld[i21]);
                iArrFld[i21] = (i22 % 27850);
            } catch (ArithmeticException a_e) {}
            i23 = 1;
            while (++i23 < 172) {
                if (false) continue;
                iArrFld[i21 - 1] ^= i22;
            }
            Test.instanceCount += (((i21 * Test.fFld) + Test.fFld) - Test.fFld);
            Test.instanceCount = (long)Test.dFld1;
            i >>= i;
        }
        i22 <<= -61095;
        i22 += (int)Test.instanceCount;
        s2 -= (short)32450;
        for (i24 = 364; i24 > 16; i24 -= 3) {
            Test.fFld = i22;
            for (i26 = i24; 216 > i26; i26++) {
                if (b) {
                    for (l2 = 1; l2 < 1; l2++) {
                        i27 -= (int)Test.fFld;
                        s2 += (short)i26;
                        iArrFld[i26] = (int)Test.fFld;
                        iArrFld[i24] = (int)1716158020L;
                        i25 = (int)2L;
                    }
                    if (b) continue;
                    i27 += (i26 ^ Test.byFld);
                } else {
                    iArrFld[i26 - 1] -= i26;
                }
                lArr1[i24 + 1] = i26;
            }
        }

        FuzzerUtils.out.println("i i21 i22 = " + i + "," + i21 + "," + i22);
        FuzzerUtils.out.println("s2 i23 i24 = " + s2 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("l2 i28 b = " + l2 + "," + i28 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.dFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld Test.dFld1 Test.fArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Double.doubleToLongBits(Test.dFld1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
