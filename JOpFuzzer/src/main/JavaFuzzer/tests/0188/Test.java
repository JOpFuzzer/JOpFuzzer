// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-41241L;
    public static short sFld=9941;
    public static double dFld=119.15231;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i9) {

        double d=-78.112544;
        float f=-1.149F;
        short s=32152;
        int i10=-241, i11=120, i12=-12155, i13=-250, i14=-134, i15=212, iArr1[]=new int[N];
        boolean b=true;
        byte by=-26;

        FuzzerUtils.init(iArr1, 1);

        Test.instanceCount = i9;
        d = -1.839F;
        f = s;
        for (i10 = 17; i10 < 340; i10++) {
            i11 += i9;
            for (i12 = 5; i12 > i10; i12 -= 2) {
                i13 = i13;
                if (b) continue;
                for (i14 = 1; i14 < 1; ++i14) {
                    i11 -= i10;
                    i9 = i14;
                    by -= (byte)d;
                    i13 -= (int)-115.47052;
                    i15 *= i12;
                    try {
                        i15 = (i12 % i10);
                        iArr1[(87 >>> 1) % N] = (181 % iArr1[i12]);
                        iArr1[i12] = (-482070833 % i13);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        long meth_res = i9 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + s + i10 + i11 + i12 + i13 + (b ? 1
            : 0) + i14 + i15 + by + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1() {

        int i8=16210, i16=6, i17=96, i18=5, i20=43;
        byte by1=-1;
        double d1=2.65814, d2=-1.101549;

        i8 *= (--i8);
        fMeth(i8);
        for (i16 = 5; i16 < 226; ++i16) {
            i18 = 1;
            do {
                int i19=410;
                i17 += (i18 - i19);
            } while (++i18 < 7);
            by1 += (byte)164L;
            i17 += (-25399 + (i16 * i16));
            i8 -= (int)5L;
            by1 += (byte)(i16 + Test.instanceCount);
            if (true) continue;
            d1 += i18;
            for (d2 = i16; d2 < 7; d2++) {
                Test.instanceCount = i18;
                Test.instanceCount = Test.sFld;
                i8 <<= by1;
            }
        }
        vMeth1_check_sum += i8 + i16 + i17 + i18 + by1 + Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) +
            i20;
    }

    public static void vMeth(int i4, int i5) {

        int i6=7, i7=-13499, i21=184, i22=36112, i23=-24950, i24=-2295, iArr2[]=new int[N];
        float f1=2.397F;
        boolean b1=false;

        FuzzerUtils.init(iArr2, -43206);

        for (i6 = 382; i6 > 10; --i6) {
            i7 += ((i7--) - i6);
            vMeth1();
            f1 = 1;
            while (++f1 < 5) {
                i5 = (int)Test.instanceCount;
            }
            i4 *= i6;
            Test.instanceCount -= Test.instanceCount;
            iArr2[i6] *= i6;
            b1 = false;
            Test.instanceCount %= (i4 | 1);
        }
        for (i21 = 14; i21 < 344; i21++) {
            Test.dFld = -2.20358;
            for (i23 = 1; i23 < 5; ++i23) {
                int i25=247;
                i4 = (int)Test.instanceCount;
                i25 *= (int)6980907531741341848L;
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + (b1 ? 1 : 0) + i21 + i22 + i23 + i24 +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=0, i1=-7, i2=-44005, i3=-1, i26=-12, i27=-28866, i28=61031, i29=-2, i30=-2, i31=16426, i32=-84, i33=-28,
            i34=-63285, i35=27245, iArr[][]=new int[N][N];
        double d3=49.115909;
        float f2=96.112F;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(sArr, (short)-9034);

        for (i = 11; i < 259; i++) {
            i1 -= (++i1);
        }
        for (i2 = 324; i2 > 20; --i2) {
            iArr = (iArr = iArr);
            vMeth(i1, 36);
            d3 = 83;
            do {
                Test.dFld += i;
                for (i26 = 1; i26 < 3; ++i26) {
                    Test.instanceCount = -31;
                    i1 -= i3;
                    Test.instanceCount >>= i27;
                }
            } while ((d3 -= 3) > 0);
            for (i28 = 2; i28 < 83; ++i28) {
                Test.instanceCount += Test.sFld;
                i3 -= (int)Test.instanceCount;
            }
            for (i30 = 4; 83 > i30; i30++) {
                switch (((i26 >>> 1) % 7) + 85) {
                case 85:
                    for (i32 = i30; i32 < 2; i32++) {
                        i1 ^= i32;
                        f2 -= 130;
                        Test.instanceCount >>= i32;
                    }
                    iArr[i30 + 1] = FuzzerUtils.int1array(N, (int)-23928);
                    i29 += i1;
                case 86:
                    lArrFld[i30 - 1] = i3;
                    i1 -= i26;
                    Test.instanceCount = (long)1.485F;
                    break;
                case 87:
                    for (i34 = 1; i34 < 2; i34++) {
                        i1 = (int)Test.instanceCount;
                        iArr[i2 + 1][i30 - 1] = i31;
                        i3 -= i3;
                        i3 += (i34 * i34);
                    }
                case 88:
                    i3 *= (int)Test.dFld;
                    break;
                case 89:
                    i27 %= (int)((long)(f2) | 1);
                    break;
                case 90:
                    sArr[i30] *= (short)i27;
                    break;
                case 91:
                    Test.instanceCount = i33;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 d3 i26 = " + i3 + "," + Double.doubleToLongBits(d3) + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("i33 f2 i34 = " + i33 + "," + Float.floatToIntBits(f2) + "," + i34);
        FuzzerUtils.out.println("i35 iArr sArr = " + i35 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
