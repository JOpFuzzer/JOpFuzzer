// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:58 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=2417460371L;
    public static byte byFld=-30;
    public static long lFld=-2502392690L;
    public short sFld=27469;
    public float fFld=-60.854F;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 56319);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i5=10, i7=-140, i8=-77, iArr[]=new int[N];
        float f=1.428F;
        short s=14783;
        double d1=-75.130545;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 54584);
        FuzzerUtils.init(lArr, -51667L);

        Test.byFld = (byte)-3;
        iArr[(i5 >>> 1) % N] *= i5;
        f += i5;
        i5 -= -21;
        for (int i6 : iArr) {
            boolean b=false;
            if (b) break;
            i7 = 1;
            while (++i7 < 4) {
                lArr[i7 - 1] >>= 10;
                f = Test.instanceCount;
                i8 = 1;
                do {
                    i6 -= -154;
                    i6 = (int)Test.instanceCount;
                    i5 <<= s;
                    d1 %= (Test.instanceCount | 1);
                    i6 = (int)d1;
                } while (++i8 < 1);
            }
        }
        long meth_res = i5 + Float.floatToIntBits(f) + i7 + i8 + s + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i3, int i4) {

        float f1=0.857F, f2=1.19F, fArr[]=new float[N];
        double d2=-8.88648, dArr[]=new double[N];
        int i9=-10, i10=-13, i11=-11901, iArr1[]=new int[N];
        byte by1=105;
        boolean b1=false;

        FuzzerUtils.init(dArr, 0.117396);
        FuzzerUtils.init(iArr1, -228);
        FuzzerUtils.init(fArr, 2.654F);

        lMeth();
        Test.instanceCount = Test.instanceCount;
        f1 = -24;
        Test.instanceCount = i3;
        Test.instanceCount = (long)d2;
        if (b1) {
            for (i9 = 11; 277 > i9; ++i9) {
                if (b1) {
                    i4 *= (int)Test.instanceCount;
                    i4 -= Test.byFld;
                    switch ((i9 % 5) + 100) {
                    case 100:
                        i11 = 1;
                        while (++i11 < 6) {
                            dArr[i9 - 1] += by1;
                            i3 -= i3;
                            i3 += (((i11 * i11) + Test.instanceCount) - Test.byFld);
                        }
                        break;
                    case 101:
                        i3 = i11;
                        break;
                    case 102:
                        if (i10 != 0) {
                            vMeth1_check_sum += i3 + i4 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d2) + i9 +
                                i10 + i11 + by1 + Float.floatToIntBits(f2) + (b1 ? 1 : 0) +
                                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) +
                                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                            return;
                        }
                        break;
                    case 103:
                        f1 -= Test.instanceCount;
                        break;
                    case 104:
                        f2 -= Test.lFld;
                        break;
                    }
                } else {
                    iArr1[i9] = i4;
                }
            }
        } else if (false) {
            iArr1[(-65067 >>> 1) % N] = (int)76.13290;
        } else if (b1) {
            i3 = (int)d2;
        } else {
            fArr[(i9 >>> 1) % N] += -200;
        }
        vMeth1_check_sum += i3 + i4 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d2) + i9 + i10 + i11 + by1 +
            Float.floatToIntBits(f2) + (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {

        int i2=242, i12=9, i13=-61787, i14=-5248, i15=145, i16=8, iArr2[]=new int[N];
        float f3=-127.541F, fArr1[]=new float[N];
        double d3=1.47381;

        FuzzerUtils.init(iArr2, 12);
        FuzzerUtils.init(fArr1, 1.650F);

        i2 = 316;
        do {
            vMeth1(i2, i2);
            i12 += i2;
            switch (((i12 >>> 1) % 6) + 18) {
            case 18:
                i12 -= (int)f3;
                break;
            case 19:
                i12 |= (int)Test.lFld;
                f3 -= Test.lFld;
                break;
            case 20:
                if (i13 != 0) {
                    vMeth_check_sum += i2 + i12 + Float.floatToIntBits(f3) + i13 + i14 + i15 + i16 +
                        Double.doubleToLongBits(d3) + FuzzerUtils.checkSum(iArr2) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                    return;
                }
                Test.instanceCount -= (long)f3;
                break;
            case 21:
                i14 = 1;
                while (++i14 < 5) {
                    for (i15 = 1; i15 < 1; i15++) {
                        i12 = (int)Test.lFld;
                        iArr2[i14 - 1] = i14;
                        Test.instanceCount /= (long)43.35172;
                        d3 = i14;
                    }
                }
                break;
            case 22:
                fArr1[i2 + 1] %= (Test.lFld | 1);
                break;
            case 23:
                iArr2[i2 - 1] = (int)Test.instanceCount;
                break;
            default:
                if (i16 != 0) {
                    vMeth_check_sum += i2 + i12 + Float.floatToIntBits(f3) + i13 + i14 + i15 + i16 +
                        Double.doubleToLongBits(d3) + FuzzerUtils.checkSum(iArr2) +
                        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                    return;
                }
            }
        } while (--i2 > 0);
        vMeth_check_sum += i2 + i12 + Float.floatToIntBits(f3) + i13 + i14 + i15 + i16 + Double.doubleToLongBits(d3) +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i=-88, i1=-48230, i18=75, i19=41197, i20=-29730, i21=32, i22=-151, i23=0, i24=-238, i25=42899, i26=-252;
        double d=0.40423, dArr1[][]=new double[N][N];
        byte by=-34;
        long l=1L;

        FuzzerUtils.init(dArr1, -1.123855);

        try {
            for (i = 5; 177 > i; i++) {
                d = ((-(by++)) * i1);
                vMeth();
            }
        }
        catch (NullPointerException exc1) {
            for (int i17 : Test.iArrFld) {
                i17 += i17;
                for (i18 = 2; i18 < 63; ++i18) {
                    Test.lFld <<= i;
                    i17 += (i18 | sFld);
                    i1 = (int)fFld;
                    if (bFld) continue;
                    Test.instanceCount += 136L;
                }
            }
            for (i20 = 15; i20 < 281; i20++) {
                i1 += (((i20 * i) + Test.instanceCount) - Test.lFld);
                i22 = 1;
                while (++i22 < 94) {
                    for (i23 = 1; i23 < 1; i23++) {
                        Test.instanceCount = i19;
                    }
                    Test.lFld += (((i22 * i) + Test.instanceCount) - Test.lFld);
                    l = 1;
                    do {
                        Test.lFld = -102;
                        dArr1[(int)(l)][i20 - 1] *= fFld;
                        i1 = 158;
                    } while ((l += 3) < 1);
                    switch ((i22 % 1) + 125) {
                    case 125:
                        i24 = i20;
                        break;
                    default:
                        d += by;
                    }
                    Test.lFld += 185;
                    for (i25 = 1; 1 > i25; ++i25) {
                        i1 >>= (int)l;
                        d -= i22;
                        i24 -= (int)-120.87180;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("by i18 i19 = " + by + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 l = " + i23 + "," + i24 + "," + l);
        FuzzerUtils.out.println("i25 i26 dArr1 = " + i25 + "," + i26 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.lFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Test.lFld);
        FuzzerUtils.out.println("sFld fFld bFld = " + sFld + "," + Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
