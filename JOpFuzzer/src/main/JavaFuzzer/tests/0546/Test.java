// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-79L;
    public static float fFld=-8.844F;
    public byte byFld=5;
    public int iFld=20;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1191413030L);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, float f1) {

        byte by1=31;
        int i10=246, i12=-8, iArr1[]=new int[N];
        double d=2.93923;

        FuzzerUtils.init(iArr1, -5388);

        by1 <<= (byte)i10;
        for (int i11 : iArr1) {
            i12 = 4;
            do {
                iArr1[i12] = i11;
                f1 = (float)d;
                switch ((i12 % 3) + 107) {
                case 107:
                    by1 = (byte)130L;
                case 108:
                case 109:
                    i11 += (-229 + (i12 * i12));
                    break;
                }
                i10 = 54103;
                i10 = -14;
                i11 += by1;
                i11 = i10;
                try {
                    i11 = (i10 % i10);
                    i10 = (-53612 / i12);
                    iArr1[i12 + 1] = (i11 % -39787);
                } catch (ArithmeticException a_e) {}
                Test.lArrFld = Test.lArrFld;
            } while (--i12 > 0);
            f -= f1;
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + by1 + i10 + i12 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr1);
    }

    public static short sMeth(int i3, int i4, int i5) {

        int i6=4498, i7=13, i8=-65, i9=-14162, i13=-189, i14=-71;
        float f2=-2.923F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.42159);

        for (i6 = 5; i6 < 151; ++i6) {
            for (i8 = 1; i8 < 11; i8++) {
                i3 += (i8 * i8);
                i3 = (--i9);
                vMeth1(1.726F, f2);
                for (i13 = 1; i13 < 2; i13++) {
                    i9 -= (int)Test.instanceCount;
                    i9 <<= i5;
                    dArr[i6 - 1] = i5;
                    i9 += (i13 * i13);
                    i4 += (int)(89L + (i13 * i13));
                }
                i3 = i3;
                i4 += i8;
                dArr[i6] = i6;
            }
            i4 = (int)2388L;
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f2) + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(long l1) {

        byte by=85, byArr[]=new byte[N];
        int i2=-9729, i15=-2, i16=-9, i17=-6, i18=-7, i19=245, i20=-61309, iArr2[]=new int[N];
        boolean b=true;
        short s=-20617;

        FuzzerUtils.init(iArr2, -10);
        FuzzerUtils.init(byArr, (byte)84);

        Test.instanceCount = ((by + (i2++)) * sMeth(i2, -3, i2));
        i15 *= (int)l1;
        for (i16 = 3; i16 < 200; ++i16) {
            for (i18 = 1; i18 < 8; i18++) {
                iArr2[i18] = (int)Test.fFld;
                if (b) break;
                i17 = -21535;
            }
            i17 *= i15;
            l1 <<= i16;
            l1 = (long)Test.fFld;
            i20 = 1;
            while (++i20 < 8) {
                i2 += (((i20 * l1) + i18) - i17);
                by += (byte)(i20 ^ i16);
            }
            byArr[i16 + 1] &= (byte)i16;
            s = (short)i19;
        }
        vMeth_check_sum += l1 + by + i2 + i15 + i16 + i17 + i18 + i19 + (b ? 1 : 0) + i20 + s +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        long l=2740145037L;
        int i=-231, i1=-1, i21=60, i22=216, i23=12, i24=4, i25=9, i26=5, i27=11, iArr[]=new int[N];
        double d1=-99.45961;
        boolean b1=false;
        short sArr[][]=new short[N][N];
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(iArr, 9);
        FuzzerUtils.init(sArr, (short)18848);
        FuzzerUtils.init(byArr1, (byte)-48);

        l = 1;
        while (++l < 164) {
            Test.instanceCount /= (l | 1);
            for (i = 8; i < 153; ++i) {
                i1 -= iArr[i - 1];
                vMeth(-5L);
                i1 += (i - i1);
                i1 >>= byFld;
                for (i21 = 1; 2 > i21; ++i21) {
                    short s1=24454;
                    iFld <<= s1;
                    Test.fFld -= i22;
                    sArr = sArr;
                }
                i22 += (int)Test.instanceCount;
                iArr = iArr;
            }
            i22 -= (int)Test.fFld;
            d1 = -12;
        }
        for (i23 = 7; i23 < 241; ++i23) {
            iFld = i1;
            iFld += i23;
            try {
                i1 = (-1295699113 / i);
                i24 = (i21 / -296956363);
                iArr[i23 - 1] = (i24 / 21);
            } catch (ArithmeticException a_e) {}
            byArr1[(i23 >>> 1) % N] += (byte)i25;
            if (b1) {
                i25 += (i23 | i22);
                iArr[i23 + 1] = (int)-3331060115L;
                i26 = 1;
                do {
                    b1 = b1;
                    i27 = 1;
                    do {
                        Test.instanceCount = i23;
                        iFld += (i27 * l);
                        Test.lArrFld[i26 - 1] -= l;
                        iFld *= i24;
                    } while (++i27 < 1);
                } while (++i26 < 107);
            } else if (b1) {
                d1 = -13710L;
            } else {
                i22 += (((i23 * Test.fFld) + i) - i25);
            }
        }

        FuzzerUtils.out.println("l i i1 = " + l + "," + i + "," + i1);
        FuzzerUtils.out.println("i21 i22 d1 = " + i21 + "," + i22 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 b1 i27 = " + i26 + "," + (b1 ? 1 : 0) + "," + i27);
        FuzzerUtils.out.println("iArr sArr byArr1 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(sArr) +
            "," + FuzzerUtils.checkSum(byArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + byFld);
        FuzzerUtils.out.println("iFld Test.lArrFld = " + iFld + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
