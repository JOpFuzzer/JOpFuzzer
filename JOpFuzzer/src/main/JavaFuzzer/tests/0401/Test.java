// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:50 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1446092491L;
    public static int iFld=-11282;
    public static short sFld=32624;

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(boolean b1, short s1, short s2) {

        float f1=-67.580F;
        int i12=-59545, i13=-215, i14=-6, i15=-179, i16=14, i17=12, i18=-38680, iArr1[]=new int[N];
        byte by1=-32;
        double d1=109.11424, d2=0.39277;

        FuzzerUtils.init(iArr1, 59640);

        Test.instanceCount = (long)f1;
        iArr1[(Test.iFld >>> 1) % N] *= Test.iFld;
        for (i12 = 14; i12 < 244; i12++) {
            Test.iFld += by1;
            iArr1[i12] -= (int)58.808F;
            for (d1 = 1; 7 > d1; ++d1) {
                i13 += (int)(((d1 * i12) + f1) - Test.iFld);
                i14 += (int)(d1 * by1);
                Test.iFld *= by1;
                i14 = -14;
            }
        }
        for (d2 = 8; 240 > d2; d2++) {
            Test.iFld += (int)f1;
            for (i16 = 1; i16 < 7; ++i16) {
                i15 -= i18;
                i15 = i12;
            }
        }
        vMeth1_check_sum += (b1 ? 1 : 0) + s1 + s2 + Float.floatToIntBits(f1) + i12 + i13 + by1 +
            Double.doubleToLongBits(d1) + i14 + Double.doubleToLongBits(d2) + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth(int i4, int i5, short s) {

        double d=-2.130703;
        int i6=232, i7=-204, i8=13, i9=17384, i10=-12, i11=-4, i19=-16435, i20=-52649, iArr[]=new int[N];
        byte by=-119, byArr[]=new byte[N];
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -4314);
        FuzzerUtils.init(byArr, (byte)22);
        FuzzerUtils.init(lArr, -5854831753551104524L);

        i4 = Math.min((int)((i5 - i4) * (d - i5)), (int)((-9 + (i4 + -8)) + (i5 * Test.instanceCount)));
        for (i6 = 13; i6 < 387; ++i6) {
            switch (((i6 % 9) * 5) + 67) {
            case 103:
                Test.instanceCount >>= (iArr[i6 + 1] - (i6 - by));
                for (i8 = i6; i8 < 5; ++i8) {
                    d += ((iArr[i8 + 1] = (int)(-2131600726675498258L + i4)) * (i5 * (--by)));
                    if (b) continue;
                    for (i10 = 1; i10 < 1; ++i10) {
                        vMeth1(false, (short)(18786), s);
                        b = b;
                    }
                    for (i19 = 1; i19 < 1; ++i19) {
                        if (b) break;
                        byArr[i19] = (byte)i10;
                        i7 = Test.iFld;
                        d += i4;
                    }
                }
                break;
            case 76:
            case 84:
                i5 *= -3;
                break;
            case 98:
                if (i11 != 0) {
                }
                break;
            case 77:
                Test.iFld >>>= i7;
                break;
            case 94:
                i9 <<= i7;
            case 79:
                if (i5 != 0) {
                }
                break;
            case 99:
                lArr[i6] = -79;
            case 88:
            }
        }
        long meth_res = i4 + i5 + s + Double.doubleToLongBits(d) + i6 + i7 + by + i8 + i9 + (b ? 1 : 0) + i10 + i11 +
            i19 + i20 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i3) {


        Test.instanceCount *= (long)fMeth(i3, i3, Test.sFld);
        vMeth_check_sum += i3;
    }

    public void mainTest(String[] strArr1) {

        int i=70, i1=8, i2=30260, i21=-59088, i22=-97, i23=-5, i24=-230, i25=-23381, i26=12, iArr2[]=new int[N];
        float f=40.318F;
        double d3=0.57871, dArr[]=new double[N];
        byte by2=111;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(lArr1, -2517L);
        FuzzerUtils.init(iArr2, -11);
        FuzzerUtils.init(dArr, -63.75661);

        for (i = 6; 395 > i; i++) {
            i1 += (i | (long)f);
            Test.instanceCount += (long)(Math.min(i1, (int)(i1 /= (int)((long)(f) | 1))) + ((i + i2) *
                (Test.instanceCount - f)));
            vMeth(i);
        }
        i2 += i1;
        i21 = 205;
        do {
            i22 = 1;
            while (++i22 < 122) {
                f = (float)-127.41429;
                Test.instanceCount = (long)d3;
                lArr1[i21][i21] = by2;
                for (i23 = 1; 1 > i23; i23++) {
                    boolean b2=true;
                    b2 = b2;
                    Test.instanceCount += (-162 + (i23 * i23));
                    Test.iFld += Test.sFld;
                    lArr1[i23][i21] -= i1;
                    switch ((i21 % 1) + 126) {
                    case 126:
                        i1 = (int)-2672394873141145793L;
                        iArr2 = FuzzerUtils.int1array(N, (int)4);
                        iArr2 = FuzzerUtils.int1array(N, (int)31772);
                    }
                    i24 = (int)f;
                    iArr2[i23] -= i;
                    i24 += (((i23 * Test.iFld) + Test.iFld) - Test.instanceCount);
                    i24 -= i2;
                }
                Test.iFld *= -51406;
                f += i22;
                dArr[i21 + 1] += Test.instanceCount;
                i1 >>>= Test.iFld;
                for (i25 = i21; i25 < 1; i25++) {
                    i26 += i2;
                }
            }
            iArr2[i21] += i1;
        } while (--i21 > 0);

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i2 i21 i22 = " + i2 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("d3 by2 i23 = " + Double.doubleToLongBits(d3) + "," + by2 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("lArr1 iArr2 dArr = " + FuzzerUtils.checkSum(lArr1) + "," + FuzzerUtils.checkSum(iArr2)
            + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.sFld);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
