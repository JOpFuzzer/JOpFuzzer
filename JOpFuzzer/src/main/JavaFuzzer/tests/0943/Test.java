// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=2791272561L;
    public static int iFld=-39364;
    public static byte byFld=34;
    public static short sFld=-9607;
    public static float fArrFld[]=new float[N];
    public static short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.269F);
        FuzzerUtils.init(Test.sArrFld, (short)28514);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i3=5, i4=0, i5=-58540, i6=-61590, i7=69, iArr[]=new int[N];
        float f1=-104.742F, fArr[]=new float[N];
        boolean b=false;
        long l=6941923246246092650L;
        double d=19.63293;

        FuzzerUtils.init(iArr, 28180);
        FuzzerUtils.init(fArr, 0.641F);

        for (i3 = 7; i3 < 237; i3++) {
            i4 += 3;
            iArr[i3] -= (int)f1;
            b = b;
            Test.instanceCount -= Test.instanceCount;
            for (l = 1; l < 7; l++) {
                iArr[(int)(l + 1)] = (int)l;
                for (i6 = i3; i6 < 2; i6++) {
                    if (b) {
                        fArr[(int)(l)] -= i6;
                        iArr[i3] = i3;
                        d = l;
                        i4 = i6;
                    }
                    f1 += i6;
                    i5 <<= i3;
                }
            }
        }
        vMeth2_check_sum += i3 + i4 + Float.floatToIntBits(f1) + (b ? 1 : 0) + l + i5 + i6 + i7 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1() {

        int i8=-53067, i9=4, i10=35350, i11=63677, i12=41, i13=14, iArr1[]=new int[N];
        double d1=2.73938;

        FuzzerUtils.init(iArr1, -205);

        vMeth2();
        i8 &= (int)-2096920765L;
        Test.instanceCount -= (long)d1;
        for (i9 = 7; i9 < 231; i9++) {
            i8 = i10;
            i11 = 1;
            do {
                for (i12 = 1; i12 < 4; i12 += 3) {
                    iArr1[i11] *= Test.iFld;
                    Test.instanceCount *= i11;
                    i10 = 25;
                    i13 = (int)Test.instanceCount;
                    i10 >>= Test.byFld;
                }
                Test.iFld /= (int)(Test.instanceCount | 1);
                try {
                    i13 = (iArr1[i9] % i8);
                    i8 = (i10 % -205);
                    Test.iFld = (69 / i9);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount += (((i11 * Test.instanceCount) + Test.instanceCount) - i9);
            } while ((i11 += 3) < 7);
        }
        vMeth1_check_sum += i8 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, int i1) {

        int i2=10, i14=251, i15=122, i16=-220, iArr2[]=new int[N];
        float f=118.381F;
        double d2=120.80892;
        short s=14476, sArr[]=new short[N];
        long l1=2816793892L;

        FuzzerUtils.init(iArr2, 142);
        FuzzerUtils.init(sArr, (short)9110);

        i2 = 1;
        while (++i2 < 171) {
            i1 += (((i2 * i) + i) - f);
            switch ((((((int)(Test.instanceCount + i1)) >>> 1) % 9) * 5) + 11) {
            case 43:
                vMeth1();
                f += ((long)i2 | (long)i1);
                break;
            case 19:
                iArr2[i2 - 1] = 21893;
            case 53:
                switch (((-38666 >>> 1) % 2) + 99) {
                case 99:
                    d2 += i;
                    i1 += (((i2 * s) + i) - i1);
                    sArr = sArr;
                    break;
                case 100:
                    for (i14 = 1; i14 < 9; ++i14) {
                        l1 = 2;
                        while (--l1 > 0) {
                            Test.instanceCount ^= i2;
                            i16 += i;
                            Test.iFld += (-47 + (l1 * l1));
                        }
                    }
                    break;
                default:
                    iArr2[i2 + 1] = i14;
                }
                break;
            case 52:
                iArr2[i2] >>>= (int)Test.instanceCount;
                break;
            case 54:
                i = -221;
                break;
            case 32:
                i1 %= 9;
                break;
            case 46:
                i16 = i;
            case 55:
                i1 = -1843;
                break;
            case 27:
                d2 += l1;
                break;
            default:
                i1 = i15;
            }
        }
        vMeth_check_sum += i + i1 + i2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d2) + s + i14 + i15 + l1 +
            i16 + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=-176, i18=-11553, i19=0, i20=6, i21=-14, i22=-12, i23=13, iArr3[]=new int[N];
        float f2=0.445F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 7872677132093477917L);
        FuzzerUtils.init(iArr3, -9);

        vMeth(Test.iFld, Test.iFld);
        for (i17 = 4; i17 < 247; ++i17) {
            lArr[i17] <<= Test.instanceCount;
            iArr3[i17 + 1] -= (int)f2;
            for (i19 = 3; i19 < 103; i19++) {
                Test.sFld = (short)Test.instanceCount;
                iArr3[i19 - 1] = i18;
                iArr3[i19] *= Test.iFld;
                try {
                    i20 = (i18 / i20);
                    i18 = (i17 % i19);
                    i20 = (i19 % i17);
                } catch (ArithmeticException a_e) {}
                i21 = 1;
                do {
                    Test.iFld -= 60137;
                    i18 = i20;
                    Test.instanceCount += i21;
                    Test.fArrFld[i21 - 1] -= (float)-17.112231;
                    lArr[i21] >>= -2768;
                    Test.iFld += (i21 + i17);
                } while (++i21 < 2);
                Test.iFld += (int)f2;
                iArr3[i17] = 5112;
                Test.instanceCount += (((i19 * i18) + i20) - i21);
                Test.sArrFld[i17 + 1][i19] %= (short)(i20 | 1);
            }
            if (false) continue;
            i22 = 1;
            while (++i22 < 103) {
                i18 += (i22 * Test.instanceCount);
                switch (((i22 % 3) * 5) + 41) {
                case 45:
                    Test.iFld &= i19;
                    switch ((i17 % 2) + 124) {
                    case 124:
                        Test.iFld += i17;
                        i23 = 1;
                        while (++i23 < 1) {
                            Test.instanceCount += i19;
                            Test.iFld = i18;
                        }
                        break;
                    case 125:
                        Test.sFld = (short)-18410;
                        break;
                    }
                    break;
                case 46:
                    Test.instanceCount &= -7192287563451413615L;
                    break;
                case 48:
                    try {
                        i20 = (i19 % iArr3[i17]);
                        iArr3[i17] = (Test.iFld % iArr3[i17 + 1]);
                        Test.iFld = (i20 / i19);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }

        FuzzerUtils.out.println("i17 i18 f2 = " + i17 + "," + i18 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 lArr = " + i22 + "," + i23 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.byFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.sFld Test.fArrFld Test.sArrFld = " + Test.sFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.sArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
