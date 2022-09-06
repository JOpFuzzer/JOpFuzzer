// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:58 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1859695575329459528L;
    public static double dFld=43.121322;
    public float fFld=-124.119F;
    public short sFld=4077;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 54388);
        FuzzerUtils.init(Test.dArrFld, -116.4301);
        FuzzerUtils.init(Test.lArrFld, -11L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth() {

        int i2=18834, i3=0, i4=6972, i5=244, i6=58, i7=48, iArr[]=new int[N];
        boolean b=false;
        float f=0.218F;

        FuzzerUtils.init(iArr, 31315);

        for (i2 = 12; i2 < 309; i2++) {
            for (i4 = 1; i4 < 6; i4++) {
                if (true) {
                    i3 += i4;
                    i5 = i3;
                    iArr[i2 - 1] += (int)Test.instanceCount;
                    i5 += (i4 | i2);
                } else if (b) {
                    i5 += (int)(-5L + (i4 * i4));
                    i5 += (int)(1293227385745518863L + (i4 * i4));
                    i3 = i3;
                } else {
                    f *= 12412;
                    switch ((i4 % 10) + 106) {
                    case 106:
                        for (i6 = i4; i6 < 2; i6++) {
                            Test.instanceCount += (long)Test.dFld;
                            if (b) break;
                        }
                        break;
                    case 107:
                        i3 = i7;
                        break;
                    case 108:
                        i5 *= i4;
                    case 109:
                    case 110:
                        iArr[i4 + 1] = (int)Test.instanceCount;
                    case 111:
                        Test.instanceCount *= Test.instanceCount;
                        break;
                    case 112:
                        i7 += i3;
                        break;
                    case 113:
                        i3 += (int)Test.instanceCount;
                        break;
                    case 114:
                    case 115:
                        Test.instanceCount += (((i4 * i3) + i7) - Test.instanceCount);
                        break;
                    }
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + (b ? 1 : 0) + Float.floatToIntBits(f) + i6 + i7 +
            FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(int i, int i1) {

        short s=3670;
        float f1=82.438F, f2=1.123F, fArr[]=new float[N];
        int i8=-124, i9=5, i10=19179, iArr1[]=new int[N];
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 35068);
        FuzzerUtils.init(lArr, 2554683411L);
        FuzzerUtils.init(fArr, 1.702F);

        i1 >>= (int)Test.instanceCount;
        sMeth();
        i -= s;
        iArr1[(i1 >>> 1) % N] = (int)f1;
        switch ((((i1 >>> 1) % 7) * 5) + 15) {
        case 40:
            for (i8 = 312; i8 > 15; i8--) {
                f2 = 1;
                while ((f2 += 2) < 6) {
                    b1 = b1;
                    i10 = 1;
                    while (++i10 < 2) {
                        i = i10;
                        i *= i10;
                        i >>= i9;
                        if (i != 0) {
                            vMeth_check_sum += i + i1 + s + Float.floatToIntBits(f1) + i8 + i9 +
                                Float.floatToIntBits(f2) + (b1 ? 1 : 0) + i10 + FuzzerUtils.checkSum(iArr1) +
                                FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                            return;
                        }
                        i = i10;
                    }
                    lArr[i8] <<= i8;
                }
            }
            break;
        case 31:
            i -= i1;
            break;
        case 27:
            lArr[(i >>> 1) % N] *= Test.instanceCount;
            break;
        case 48:
            s = (short)i9;
        case 30:
            iArr1[(i8 >>> 1) % N] -= (int)Test.instanceCount;
            break;
        case 50:
            Test.instanceCount += i8;
            break;
        case 38:
            fArr[(i >>> 1) % N] = Test.instanceCount;
            break;
        default:
            i9 = i9;
        }
        vMeth_check_sum += i + i1 + s + Float.floatToIntBits(f1) + i8 + i9 + Float.floatToIntBits(f2) + (b1 ? 1 : 0) +
            i10 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth() {

        int i11=10, i12=1, i13=4, i14=-1663, i15=14, i16=-25096, i17=-104;
        float f3=5.467F;
        boolean b2=true;

        vMeth(i11, i11);
        Test.iArrFld[(i11 >>> 1) % N] -= i11;
        f3 = i11;
        Test.instanceCount *= Test.instanceCount;
        Test.instanceCount = 283122938859133413L;
        for (i12 = 7; i12 < 126; i12++) {
            i13 -= (int)Test.instanceCount;
            for (i14 = 1; i14 < 13; i14 += 2) {
                i11 ^= (int)Test.instanceCount;
                Test.dFld -= i11;
                b2 = b2;
                i15 *= i14;
                for (i16 = i12; i16 < 3; i16++) {
                    Test.iArrFld[i14 + 1] = i12;
                    Test.instanceCount = (long)Test.dFld;
                }
            }
        }
        long meth_res = i11 + Float.floatToIntBits(f3) + i12 + i13 + i14 + i15 + (b2 ? 1 : 0) + i16 + i17;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i18=7, i19=14, i20=-25819, i21=2, i22=6, i23=106, i24=-7, i25=5459, i26=-19797, i27=-85, i28=7, i29=-13;

        iMeth();
        Test.instanceCount -= i18;
        i18 = (int)Test.instanceCount;
        for (i19 = 4; 183 > i19; i19++) {
            i20 *= (int)Test.dFld;
            i20 += (((i19 * Test.instanceCount) + i18) - fFld);
        }
        Test.instanceCount -= (long)99.38288;
        for (i21 = 5; 333 > i21; i21++) {
            i20 -= (int)Test.instanceCount;
        }
        for (i23 = 13; i23 < 231; i23++) {
            switch ((i23 % 2) + 49) {
            case 49:
                for (i25 = 2; i25 < 115; i25++) {
                    i24 += i25;
                    i26 = i23;
                    switch (((i22 >>> 1) % 7) + 86) {
                    case 86:
                        i26 = i25;
                        i24 += (i25 * Test.instanceCount);
                        fFld += (i25 - i19);
                    case 87:
                        Test.dArrFld[i25] = i23;
                        for (i27 = 1; i27 < 2; i27++) {
                            sFld = (short)-8L;
                            try {
                                i28 = (Test.iArrFld[i25] % i19);
                                i20 = (-42 % i25);
                                i26 = (362000862 % i19);
                            } catch (ArithmeticException a_e) {}
                            i28 += i24;
                        }
                        i22 = -5575;
                        break;
                    case 88:
                        sFld -= (short)20700;
                        i29 = 1;
                        do {
                            Test.instanceCount += (i29 + i21);
                            i24 = i23;
                            Test.instanceCount *= 11;
                            Test.lArrFld[i23 + 1] = 5;
                        } while (++i29 < 2);
                        break;
                    case 89:
                        if (Test.bFld) break;
                        break;
                    case 90:
                        i20 = i18;
                        break;
                    case 91:
                        Test.instanceCount += (((i25 * i29) + sFld) - i27);
                    case 92:
                        i18 >>= i26;
                        break;
                    }
                }
                break;
            case 50:
                i24 >>>= i28;
                break;
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);

        FuzzerUtils.out.println("Test.instanceCount Test.dFld fFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("sFld Test.bFld Test.iArrFld = " + sFld + "," + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.dArrFld Test.lArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}