// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:46 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=13L;
    public int iFld=9;
    public static byte byFld=-95;
    public volatile boolean bFld=true;
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -5L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static void vMeth(int i2) {


        Test.lArrFld[(22357 >>> 1) % N][(i2 >>> 1) % N] += (4 + i2);
        vMeth_check_sum += i2;
    }

    public static int iMeth2(int i12, int i13, int i14) {

        int i15=91, i16=2, i17=-4, i18=33, i19=-13396, i20=-19, iArr2[]=new int[N];
        float f3=14.879F;
        short s1=14510;

        FuzzerUtils.init(iArr2, -8);

        for (i15 = 9; i15 < 300; ++i15) {
            for (i17 = 1; i17 < 6; i17++) {
                f3 += s1;
                for (i19 = 1; i19 < 2; i19++) {
                    i16 += i19;
                    iArr2[i19 - 1] -= i17;
                    s1 += (short)-12;
                    Test.instanceCount += (((i19 * i15) + Test.instanceCount) - i20);
                    i14 += (((i19 * i19) + i15) - i18);
                    i13 *= -4;
                    i18 = (int)f3;
                }
                switch (((i12 >>> 1) % 1) + 45) {
                case 45:
                    iArr2[i17 - 1] += i18;
                    break;
                default:
                    i12 += (58387 + (i17 * i17));
                }
                if (i12 != 0) {
                }
            }
        }
        long meth_res = i12 + i13 + i14 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f3) + s1 + i19 + i20 +
            FuzzerUtils.checkSum(iArr2);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i7) {

        int i8=57947, i9=-12, i10=226, i11=-50, i21=-36864, i22=-24;
        float f2=48.897F, fArr1[]=new float[N];
        double d3=0.43273;

        FuzzerUtils.init(fArr1, -1.786F);

        for (i8 = 11; i8 < 307; i8++) {
            if (i7 != 0) {
            }
            for (i10 = 1; i10 < 6; i10++) {
                f2 += (-1 + iMeth2(i7, i8, i7));
                for (i21 = 2; i21 > i8; i21--) {
                    i9 *= (int)d3;
                    fArr1[i10] = i11;
                    i9 += 10;
                    i9 <<= (int)1453354411L;
                    Test.instanceCount *= 166;
                    f2 *= i21;
                    i9 += (9 + (i21 * i21));
                    i11 >>= 13;
                }
                f2 -= Test.byFld;
                f2 *= -14358;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f2) + i21 + i22 + Double.doubleToLongBits(d3) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, double d1, double d2) {

        int i=45804, i1=11, i3=92, i4=-2, i5=5786, i6=-47465, iArr1[][]=new int[N][N];
        float f1=-22.191F, fArr[]=new float[N];
        short s=17359;
        byte by=-80;
        boolean b=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, -12);
        FuzzerUtils.init(fArr, 2.25F);
        FuzzerUtils.init(dArr, -2.9464);

        for (i = 16; i < 283; i++) {
            if (b) {
                vMeth(iArr1[i + 1][i + 1]++);
                switch ((i % 8) + 52) {
                case 52:
                    vMeth(i);
                    for (i3 = i; 6 > i3; i3++) {
                        f1 = (i4 * ((l--) + (iArr1[i - 1][i3 - 1]++)));
                        for (i5 = 1; i5 < 1; i5++) {
                            i6 = (int)((s * (++i4)) - (--fArr[i5 + 1]));
                            i1 <<= (int)Test.lArrFld[i5 - 1][i];
                            vMeth(i);
                        }
                        switch ((i3 % 2) + 28) {
                        case 28:
                            by = (byte)((Test.instanceCount--) - dArr[i3]);
                            f1 = Math.max(iMeth1(i1), i6);
                            break;
                        case 29:
                            f1 += (((i3 * i6) + Test.instanceCount) - l);
                            break;
                        }
                    }
                    break;
                case 53:
                    i1 += (i * i);
                    break;
                case 54:
                    iArr1[i + 1][i - 1] -= i3;
                    break;
                case 55:
                    i6 >>= -43252;
                    break;
                case 56:
                    i6 += (7184 + (i * i));
                case 57:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 58:
                    s <<= (short)-81;
                case 59:
                    i1 += (i * i);
                default:
                    i4 += (int)d2;
                }
            }
        }
        long meth_res = l + Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i + i1 + i3 + i4 +
            Float.floatToIntBits(f1) + i5 + i6 + s + by + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=1.935F, f4=-107.139F;
        double d=0.63800;
        int i23=-47643, i24=-25599, i25=19581, i26=14, i27=-203, i28=40301, iArr[]=new int[N];
        short s2=27144;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(lArr, 605000688L);

        f = (float)((iArr[(-2 >>> 1) % N]--) * (d--));
        iFld *= (int)((iFld * (lArr[(14 >>> 1) % N] += iFld)) - iMeth(-8957634143894239348L, d, d));
        for (f4 = 8; 217 > f4; ++f4) {
            iArr[(int)(f4 - 1)] -= i23;
            for (i24 = 1; i24 < 120; ++i24) {
                i26 = 1;
                while ((i26 += 2) < 2) {
                    f += (((i26 * Test.instanceCount) + i24) - i27);
                    if (true) {
                        Test.lArrFld[i24][(int)(f4 + 1)] = 2694;
                    }
                    i23 += i27;
                    f += (((i26 * Test.instanceCount) + f4) - f);
                }
                i28 = 1;
                do {
                    f -= i26;
                    switch ((i24 % 4) + 79) {
                    case 79:
                        iArr = iArr;
                        if (bFld) break;
                        break;
                    case 80:
                        i27 -= i24;
                        iArr[i24 - 1] = i27;
                        Test.lArrFld[i28] = lArr;
                        break;
                    case 81:
                        Test.instanceCount >>= i27;
                        iArr[i28 - 1] ^= (int)Test.instanceCount;
                        break;
                    case 82:
                        i27 >>= (int)Test.instanceCount;
                        s2 >>>= (short)iFld;
                        f *= i28;
                        break;
                    default:
                        iArr[i28 - 1] = iFld;
                        Test.instanceCount = Test.instanceCount;
                    }
                    i25 -= Test.byFld;
                    iArr[(int)(f4 - 1)] %= (int)(Test.instanceCount | 1);
                    iArr[i28] |= i25;
                    if (bFld) break;
                } while (++i28 < 2);
            }
        }

        FuzzerUtils.out.println("f d f4 = " + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d) + "," +
            Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("s2 iArr lArr = " + s2 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.byFld = " + Test.instanceCount + "," + iFld + "," +
            Test.byFld);
        FuzzerUtils.out.println("bFld Test.lArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
