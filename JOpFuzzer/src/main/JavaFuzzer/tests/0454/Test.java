// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:51 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=50040L;
    public static int iFld=5;
    public static long lFld=695514799L;
    public static long lFld1=0L;
    public double dFld=100.111226;
    public static int iArrFld[]=new int[N];
    public static short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -245);
        FuzzerUtils.init(Test.sArrFld, (short)-29801);
    }

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(long l2) {

        int i4=98, i5=-201, i6=0, i7=140, i8=-11, i9=-4, i10=12, i11=128;
        float f1=-3.809F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        for (i4 = 5; i4 < 298; i4++) {
            for (i6 = i4; i6 < 6; ++i6) {
                boolean b=true;
                for (i8 = i4; i8 < 1; i8++) {
                    float f=1.975F;
                    Test.iArrFld[i8 + 1] = i8;
                    Test.iArrFld[i4 + 1] |= i5;
                    if (i6 != 0) {
                    }
                    Test.iArrFld[i6] = (int)f;
                    Test.iArrFld[i6 - 1] += i5;
                }
                f1 += (i6 * i6);
                Test.instanceCount -= l2;
                for (i10 = 1; i10 > i4; i10 -= 3) {
                    Test.instanceCount += (36111L + (i10 * i10));
                    i11 -= 87;
                }
                bArr[i4] = b;
                if (b) break;
            }
        }
        long meth_res = l2 + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 +
            FuzzerUtils.checkSum(bArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth() {

        double d=0.36244;
        int i2=-25, i3=-3, i12=-55999, i13=44225, i14=-37642, i15=-143, i16=-19089;
        short s1=28314;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 60L);

        Test.iFld = (int)(((++Test.iFld) - (114 + Test.instanceCount)) * (lArr[(6 >>> 1) % N]--));
        d = (d -= Test.iFld);
        for (i2 = 2; i2 < 169; i2++) {
            lArr = (lArr = lArr);
            Test.iArrFld[i2] = (int)fMeth(57161L);
            if (i2 != 0) {
            }
        }
        switch (((Test.iFld >>> 1) % 1) + 88) {
        case 88:
            Test.iFld = -11547;
        }
        for (i12 = 9; i12 < 261; ++i12) {
            i13 *= i3;
            i14 = 1;
            do {
                for (i15 = 1; i15 < 1; i15++) {
                    try {
                        i13 = (Test.iArrFld[i15 + 1] % i3);
                        i16 = (i16 % 30724);
                        Test.iFld = (i15 % i2);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount += (((i15 * i13) + i13) - s1);
                    b1 = b1;
                }
            } while (++i14 < 6);
        }
        long meth_res = Double.doubleToLongBits(d) + i2 + i3 + i12 + i13 + i14 + i15 + i16 + s1 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(long l, long l1) {

        int i1=-14, i17=-217, i18=1, i19=216, i20=202, i21=-16578;
        short s=30678;
        byte by1=49;
        double d1=116.92303;

        i1 += (int)((--i1) + ((--l) - (i1 * Test.instanceCount)));
        s = (short)iMeth();
        i1 = Test.iFld;
        for (i17 = 15; 352 > i17; ++i17) {
            i18 = -14;
        }
        Test.iArrFld[(i18 >>> 1) % N] = (int)l;
        i18 = i18;
        Test.lFld -= i17;
        i18 = (int)l;
        i19 = 1;
        do {
            Test.iFld = i19;
            by1 <<= (byte)i18;
        } while (++i19 < 159);
        for (i20 = 1; i20 < 190; ++i20) {
            Test.iArrFld[i20 + 1] *= (int)d1;
            i18 += (int)-3925869349L;
        }
        long meth_res = l + l1 + i1 + s + i17 + i18 + i19 + by1 + i20 + i21 + Double.doubleToLongBits(d1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-241, i22=3, i23=-32957, i24=-6, i25=14, i26=22, i27=35888;
        byte by=108;
        short s2=-13349;
        float f2=0.446F;
        boolean b2=true;

        i = 1;
        while (++i < 202) {
            by += (byte)dMeth(Test.instanceCount, Test.lFld);
            try {
                Test.iArrFld[i + 1] = (935540033 / i);
                Test.iFld = (i % -51701);
                Test.iArrFld[i - 1] = (57442 / Test.iFld);
            } catch (ArithmeticException a_e) {}
            Test.iFld = Test.iFld;
            try {
                Test.iArrFld[i] = (i % i);
                Test.iFld = (Test.iFld / 791809676);
                Test.iArrFld[(Test.iFld >>> 1) % N] = (154 / i);
            } catch (ArithmeticException a_e) {}
            Test.iArrFld[i + 1] -= (int)Test.instanceCount;
        }
        for (i22 = 8; i22 < 190; ++i22) {
            switch (((i23 >>> 1) % 2) + 12) {
            case 12:
                s2 >>= (short)Test.lFld1;
                f2 = Test.iFld;
                Test.iArrFld[i22 - 1] += (int)f2;
                break;
            case 13:
                i23 += (((i22 * i22) + Test.instanceCount) - i);
                Test.lFld1 += (((i22 * Test.lFld1) + Test.iFld) - f2);
                Test.iArrFld = Test.iArrFld;
                i23 -= Test.iFld;
                break;
            default:
                Test.lFld1 += (i22 * Test.lFld1);
            }
            i23 *= -5;
            i23 += (((i22 * f2) + f2) - i);
            b2 = b2;
            Test.lFld1 <<= -197;
            if (b2) {
                for (i24 = i22; i24 < 138; i24++) {
                    for (i26 = 1; i26 < 1; i26++) {
                        i23 <<= i;
                        dFld += i25;
                    }
                    i27 += (((i24 * f2) + Test.lFld) - i26);
                    i23 -= (int)Test.lFld;
                    Test.sArrFld[i24 - 1] = FuzzerUtils.short1array(N, (short)-24349);
                    dFld *= 0.131058;
                    Test.iArrFld[i24] *= -10;
                }
            } else {
                i27 -= (int)Test.instanceCount;
            }
        }

        FuzzerUtils.out.println("i by i22 = " + i + "," + by + "," + i22);
        FuzzerUtils.out.println("i23 s2 f2 = " + i23 + "," + s2 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("b2 i24 i25 = " + (b2 ? 1 : 0) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 = " + i26 + "," + i27);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.lFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.lFld);
        FuzzerUtils.out.println("Test.lFld1 dFld Test.iArrFld = " + Test.lFld1 + "," + Double.doubleToLongBits(dFld) +
            "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
