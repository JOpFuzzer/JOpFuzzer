// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=28017L;
    public static int iFld=-3;
    public static float fFld=2.914F;
    public static boolean bFld=false;
    public static short sFld=5812;
    public double dFld=-1.12715;
    public long lArrFld[]=new long[N];
    public short sArrFld[][]=new short[N][N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static int iMeth(float f1) {


        Test.iFld <<= (Test.iFld--);
        long meth_res = Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i11, long l1, double d) {

        float f2=2.685F;
        int i12=-1, i13=194, i14=-9653, i15=5;
        byte by2=-56;
        boolean b=false, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        for (f2 = 4; f2 < 391; f2++) {
            Test.iFld += (int)(((f2 * by2) + f2) - i11);
            i12 -= by2;
        }
        i11 += (int)Test.instanceCount;
        i13 = 1;
        do {
            l1 = i11;
            Test.iFld += Test.iFld;
            d += -6;
            i11 = 44;
            Test.iFld += (i13 * i13);
            i11 += i13;
        } while ((i13 += 3) < 272);
        bArr[(Test.iFld >>> 1) % N] = b;
        for (i14 = 4; i14 < 139; i14++) {
            Test.fFld += l1;
            i11 |= i14;
        }
        long meth_res = i11 + l1 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i12 + by2 + i13 + (b ? 1 :
            0) + i14 + i15 + FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(byte by1) {

        double d1=1.75079;
        int i16=-126, i17=8, i18=0, i19=37237, i20=11, i21=227, iArr1[]=new int[N];
        boolean b1=false;
        long l3=58241L, lArr[]=new long[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(lArr, -3857537897434114759L);
        FuzzerUtils.init(fArr1, -1.164F);
        FuzzerUtils.init(iArr1, -207);

        Test.instanceCount = lMeth(Test.iFld, Test.instanceCount, d1);
        for (long l2 : lArr) {
            for (i16 = 1; 4 > i16; ++i16) {
                Test.iFld = -6;
                switch ((i16 % 6) + 47) {
                case 47:
                    i18 = 1;
                    while (++i18 < 2) {
                        i17 += (i18 | l2);
                        Test.iFld += (((i18 * l2) + i16) - Test.instanceCount);
                    }
                    i17 -= i16;
                    for (i19 = 1; i19 < 2; i19++) {
                        switch (((i16 >>> 1) % 10) + 87) {
                        case 87:
                            if (b1) continue;
                            b1 = b1;
                            lArr[i16 + 1] += i20;
                            i17 += i19;
                            break;
                        case 88:
                            if (b1) break;
                        case 89:
                        case 90:
                            i20 += i19;
                            break;
                        case 91:
                            l3 = by1;
                        case 92:
                            Test.iFld = (int)Test.instanceCount;
                        case 93:
                            fArr1[i16] *= i17;
                            break;
                        case 94:
                        case 95:
                            i20 += (int)l3;
                        case 96:
                            i20 *= (int)d1;
                            break;
                        default:
                            iArr1[i19] += (int)d1;
                        }
                    }
                case 48:
                    i17 = -13;
                case 49:
                    iArr1[i16 - 1] = (int)Test.instanceCount;
                    break;
                case 50:
                    i17 = -34772;
                case 51:
                    Test.instanceCount >>= i21;
                    break;
                case 52:
                    i21 *= by1;
                }
            }
        }
        vMeth1_check_sum += by1 + Double.doubleToLongBits(d1) + i16 + i17 + i18 + i19 + i20 + (b1 ? 1 : 0) + l3 + i21 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i4, long l, int i5) {

        int i6=-14, i7=-37555, i8=6727, i9=-241, i10=9, i22=13, iArr2[]=new int[N];
        short s=31482, sArr[]=new short[N];
        byte by=29;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(sArr, (short)-20905);
        FuzzerUtils.init(lArr1, 5L);
        FuzzerUtils.init(iArr2, 235);

        i6 = 1;
        while (++i6 < 261) {
            for (i7 = 1; i7 < 6; i7 += 2) {
                i8 += i7;
                Test.iFld *= Math.min(i5++, iMeth(Test.fFld--));
            }
            i4 = (int)(--Test.instanceCount);
            Test.fFld -= s;
            by <<= (byte)(((Test.fFld - i8) * (--Test.iFld)) + (--i5));
            Test.iFld >>= (--sArr[i6]);
            for (i9 = 1; 6 > i9; i9++) {
                if (Test.bFld) {
                    vMeth1(by);
                    Test.fFld += i10;
                    i22 = 1;
                    do {
                        lArr1[i22] = lArr1[i6 + 1];
                        iArr2 = iArr2;
                    } while (++i22 < 2);
                } else if (Test.bFld) {
                    iArr2[i6 - 1] = (int)Test.instanceCount;
                } else {
                    Test.instanceCount >>>= i5;
                }
            }
        }
        vMeth_check_sum += i4 + l + i5 + i6 + i7 + i8 + s + by + i9 + i10 + i22 + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-65098, i1=50488, i2=-3, i3=-26862, i23=-130, i24=18, i25=1, i26=-178, iArr[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -32623);
        FuzzerUtils.init(fArr, 1.439F);

        for (i = 336; i > 21; i--) {
            for (i2 = 80; i2 > i; i2--) {
                float f=-95.316F;
                switch ((((iArr[i + 1] >>> 1) % 9) * 5) + 59) {
                case 76:
                    f /= ((((i1 * Test.instanceCount) - (--lArrFld[i + 1])) + iMeth(fArr[(-55514 >>> 1) % N]++)) | 1);
                    break;
                case 98:
                    i3 -= 64346;
                    vMeth(-53163, -18L, i);
                    Test.instanceCount = i3;
                    break;
                case 79:
                    try {
                        i3 = (iArr[i2] / i);
                        iArr[i - 1] = (-61654 % i1);
                        iArr[i + 1] = (iArr[i2 - 1] % 40017);
                    } catch (ArithmeticException a_e) {}
                case 93:
                    for (i23 = 1; 1 > i23; i23 += 3) {
                        i3 += Test.sFld;
                        i1 = (int)Test.instanceCount;
                        i24 += i23;
                        if (Test.bFld) {
                            Test.sFld = (short)i3;
                            dFld -= 107.73857;
                            fArr[i] = i23;
                        } else {
                            i1 -= i1;
                            Test.instanceCount = (long)dFld;
                            sArrFld[i + 1] = sArrFld[i2];
                        }
                        Test.iFld += (i23 | i1);
                        Test.instanceCount = (long)dFld;
                    }
                    Test.instanceCount += i2;
                    i25 = 1;
                    while (++i25 < 1) {
                        int i27=226;
                        i1 -= i25;
                        f *= i23;
                        iArr[i2] &= i1;
                        i26 += i23;
                        dFld -= i3;
                        iArr[i2 - 1] >>>= i3;
                        i24 += (i25 ^ i27);
                    }
                    break;
                case 90:
                    i24 = -21788;
                    break;
                case 103:
                    lArrFld[i2] *= i;
                    break;
                case 75:
                    dFld += i25;
                case 81:
                    dFld += 0.171F;
                    break;
                case 61:
                    Test.instanceCount *= i26;
                    break;
                default:
                    Test.iFld += i2;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i23 i24 = " + i3 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 iArr = " + i25 + "," + i26 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld Test.sFld dFld = " + (Test.bFld ? 1 : 0) + "," + Test.sFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("lArrFld sArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
            FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest vMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
