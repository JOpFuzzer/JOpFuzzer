// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:59 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=13L;
    public static byte byFld=54;
    public static double dFld=0.105188;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 52478);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(byte by, float f, long l) {

        int i8=-209, i9=-57712, i10=-156, i11=-21413, i12=25857, i13=-6, i14=-1, i15=-90, i16=109, i17=-207,
            i18=-42212, iArr[]=new int[N];
        double d=0.47448;
        long l1=-8L;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.419F);
        FuzzerUtils.init(iArr, 2670);

        i8 += (int)l;
        fArr = fArr;
        i8 *= (int)d;
        iArr[(-46640 >>> 1) % N] *= i8;
        for (i9 = 10; i9 < 221; ++i9) {
            i8 <<= i8;
        }
        for (i11 = 2; i11 < 167; ++i11) {
            switch ((((i8 >>> 1) % 1) * 5) + 92) {
            case 95:
                for (i13 = 1; 10 > i13; ++i13) {
                    for (i15 = 1; i15 < 2; ++i15) {
                        Test.instanceCount *= i14;
                    }
                    i8 += i13;
                    for (l1 = 1; l1 < 2; ++l1) {
                        i17 &= i16;
                        l |= i18;
                    }
                }
                break;
            }
        }
        long meth_res = by + Float.floatToIntBits(f) + l + i8 + Double.doubleToLongBits(d) + i9 + i10 + i11 + i12 + i13
            + i14 + i15 + i16 + l1 + i17 + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, int i4, int i5) {

        int i6=3, i7=3910, i19=185, i20=4, i21=-56940, iArr1[]=new int[N];
        float f1=63.49F;
        double d1=127.124149;

        FuzzerUtils.init(iArr1, 2);

        i6 = 237;
        do {
            i7 = 1;
            do {
                i5 = (int)(-((i3 + Test.instanceCount) + Math.min(i4, i5)));
                i4 *= iMeth(Test.byFld, f1, Test.instanceCount);
            } while (++i7 < 19);
            for (i19 = 1; 19 > i19; i19++) {
                f1 += i7;
                i20 += (int)-183807297L;
                for (d1 = 1; d1 < 2; ++d1) {
                    Test.instanceCount += Test.instanceCount;
                    try {
                        i20 = (iArr1[(int)(d1 - 1)] % -29);
                        i20 = (iArr1[i19 + 1] / i19);
                        iArr1[(int)(d1 - 1)] = (i5 / -250);
                    } catch (ArithmeticException a_e) {}
                    try {
                        iArr1[(int)(d1)] = (203 % iArr1[i6 + 1]);
                        i20 = (-5870 / i20);
                        i4 = (i4 % -245);
                    } catch (ArithmeticException a_e) {}
                    iArr1[i6] = i5;
                    if (i21 != 0) {
                        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i19 + i20 +
                            Double.doubleToLongBits(d1) + i21 + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    f1 += (float)d1;
                    Test.instanceCount += (long)d1;
                }
            }
        } while ((i6 -= 3) > 0);
        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i19 + i20 + Double.doubleToLongBits(d1)
            + i21 + FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth(int i) {

        int i1=-174, i2=-76, i22=246, i23=-2, i24=-68, i25=0, i26=57, iArr2[]=new int[N];
        long l2=49186L, lArr[]=new long[N];
        short s=-22987;
        float f2=1.506F;
        boolean b=false;

        FuzzerUtils.init(iArr2, 53799);
        FuzzerUtils.init(lArr, -186L);

        for (i1 = 2; i1 < 135; ++i1) {
            if (i2 != 0) {
            }
            vMeth(i1, i2, i);
        }
        for (i22 = 6; i22 < 187; i22++) {
            if (b) {
                for (i24 = i22; i24 < 9; ++i24) {
                    i <<= i;
                    iArr2 = iArr2;
                    i23 >>= 12;
                    for (l2 = 1; l2 < 1; l2++) {
                        Test.instanceCount -= i23;
                        switch (((i24 % 9) * 5) + 6) {
                        case 14:
                            i2 += i22;
                        case 48:
                            Test.instanceCount += i24;
                            i25 = s;
                            break;
                        case 47:
                            i26 += (int)(l2 + Test.byFld);
                        case 49:
                            iArr2 = iArr2;
                            break;
                        case 40:
                            lArr[i22 - 1] = -12;
                        case 22:
                            f2 *= i;
                            break;
                        case 32:
                            b = b;
                        case 11:
                            i2 += i;
                            break;
                        case 51:
                            f2 += l2;
                            break;
                        default:
                            if (b) break;
                        }
                    }
                }
            } else if (b) {
                b = b;
            } else if (b) {
                i23 = i22;
            } else {
                i += (int)Test.dFld;
            }
        }
        long meth_res = i + i1 + i2 + i22 + i23 + i24 + i25 + l2 + i26 + s + Float.floatToIntBits(f2) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i27=0, i28=4262, i29=-7782, i30=-7, i31=13, i32=37922, i33=71, i34=-2;
        float f3=-2.417F;
        long l3=-10L;
        boolean b1=true;

        lMeth(i27);
        f3 -= i27;
        for (i28 = 6; i28 < 313; i28++) {
            Test.instanceCount ^= i28;
            Test.instanceCount += (((i28 * f3) + i28) - i28);
            i27 += (i28 - i28);
            switch ((i28 % 1) + 64) {
            case 64:
                i27 += i27;
                for (i30 = 3; i30 < 82; i30++) {
                    for (l3 = 1; l3 < 2; l3++) {
                        try {
                            i27 = (i27 % -117);
                            Test.iArrFld[i28] = (-182 / i29);
                            i29 = (-11741 / i31);
                        } catch (ArithmeticException a_e) {}
                        b1 = b1;
                        i31 = (int)Test.instanceCount;
                        if (b1) continue;
                        i29 += (0 + (l3 * l3));
                    }
                    for (i33 = 1; 2 > i33; i33++) {
                        i34 <<= i28;
                        i29 -= (int)l3;
                        i34 |= i32;
                        Test.instanceCount -= l3;
                        Test.iArrFld = Test.iArrFld;
                        Test.instanceCount ^= 11;
                        i27 >>= (int)Test.instanceCount;
                        i31 += -12;
                    }
                    Test.iArrFld[(i27 >>> 1) % N] >>= -55169;
                    i32 += (((i30 * i28) + i28) - l3);
                    i34 += i30;
                    i31 = (int)8113682909017441572L;
                    Test.byFld <<= (byte)i32;
                    b1 = false;
                }
                break;
            }
        }

        FuzzerUtils.out.println("i27 f3 i28 = " + i27 + "," + Float.floatToIntBits(f3) + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("l3 i32 b1 = " + l3 + "," + i32 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i33 i34 = " + i33 + "," + i34);

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.dFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
