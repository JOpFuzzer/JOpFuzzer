// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:41 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4605247813245108531L;
    public static int iFld=-26703;
    public boolean bFld=false;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l) {

        int i=0, i2=-13006, i3=-92, i5=-183, i6=-6, iArr[]=new int[N];
        boolean b=true;
        double d=-116.18113;
        short s=22126;
        float f1=106.430F;
        byte by=-123;

        FuzzerUtils.init(iArr, 42094);

        i = 1;
        do {
            b = b;
            switch ((i % 5) + 89) {
            case 89:
                iArr[i + 1] += i;
                d = 1;
                while (++d < 7) {
                    for (i2 = 1; i2 > 1; --i2) {
                        int i4=60336;
                        i4 *= i3;
                        Test.instanceCount <<= i3;
                        try {
                            iArr[i - 1] = (i2 / i3);
                            i3 = (iArr[(int)(d + 1)] / -706680353);
                            i4 = (-10443 % iArr[(int)(d - 1)]);
                        } catch (ArithmeticException a_e) {}
                        iArr[(int)(d)] = 66;
                        s = (short)i;
                    }
                    for (i5 = (int)(d); i5 < 1; ++i5) {
                        Test.iFld = i;
                        Test.instanceCount &= i3;
                        i6 = (int)f1;
                    }
                }
                break;
            case 90:
                f1 += (i * i);
                break;
            case 91:
                Test.iFld &= 5609;
                break;
            case 92:
                Test.iFld = (int)d;
                break;
            case 93:
                f1 += (i - by);
                break;
            default:
                Test.iFld += -96;
            }
        } while (++i < 240);
        vMeth1_check_sum += l + i + (b ? 1 : 0) + Double.doubleToLongBits(d) + i2 + i3 + s + i5 + i6 +
            Float.floatToIntBits(f1) + by + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        double d1=1.10319;
        float f2=-80.789F;
        int i7=9, i8=14, iArr1[]=new int[N];
        long l1=5179756781553308705L;

        FuzzerUtils.init(iArr1, 5);

        vMeth1(Test.instanceCount);
        switch ((((Test.iFld >>> 1) % 2) * 5) + 108) {
        case 113:
            iArr1[(-13180 >>> 1) % N] = (int)d1;
            break;
        case 116:
            d1 = Test.iFld;
            break;
        default:
            f2 -= Test.iFld;
            for (i7 = 3; i7 < 324; i7++) {
                i8 += i8;
                l1 = 1;
                while (++l1 < 5) {
                    Test.iFld = i8;
                    f2 += (l1 - Test.iFld);
                    f2 = i8;
                    i8 = 246;
                    if (true) continue;
                }
                i8 /= (int)(Test.iFld | 1);
                i8 += (i7 * i7);
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + Float.floatToIntBits(f2) + i7 + i8 + l1 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        int i9=47001, i10=-54725, i11=8, i12=-19964, i13=-10, iArr2[]=new int[N];
        float f3=1.10F;
        double d2=1.67767;
        boolean b2=false, bArr[]=new boolean[N];

        FuzzerUtils.init(iArr2, 30238);
        FuzzerUtils.init(bArr, false);

        vMeth();
        if (b2) {
            Test.iFld += Test.iFld;
        } else if (b2) {
            for (i9 = 10; i9 < 204; ++i9) {
                boolean b1=true;
                Test.iFld += i9;
                b1 = b1;
                Test.iFld = (int)Test.instanceCount;
                Test.iFld -= (int)f3;
                iArr2[i9] -= Test.iFld;
                for (i11 = 1; i11 < 8; ++i11) {
                    f3 -= i9;
                    i13 = 1;
                    do {
                        Test.instanceCount = i13;
                        d2 *= f3;
                        Test.iFld += (i13 * i13);
                    } while (++i13 < 2);
                }
            }
        } else {
            bArr[(i12 >>> 1) % N] = b2;
        }
        long meth_res = i9 + i10 + Float.floatToIntBits(f3) + i11 + i12 + i13 + Double.doubleToLongBits(d2) + (b2 ? 1 :
            0) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=82.485F, f4=7.490F;
        int i14=11, i15=-243, i16=-4, i17=-38325, i18=172, i19=-25222, i20=-62, i21=44070, i22=-26567, i23=159,
            i24=59327, iArr3[]=new int[N];
        short s1=-1997;
        double d3=-1.105180, dArr[]=new double[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr3, 113);
        FuzzerUtils.init(lArr, 35324L);
        FuzzerUtils.init(dArr, -1.123386);

        switch (((((int)(f + Test.iFld)) >>> 1) % 6) + 75) {
        case 75:
            Test.instanceCount += iMeth();
            for (i14 = 4; i14 < 348; ++i14) {
                Test.iFld -= (int)f;
                if (false) continue;
                for (i16 = 2; i16 < 73; i16++) {
                    Test.instanceCount = 8;
                    iArr3[i14 - 1] = i16;
                    Test.iFld = (int)126.295F;
                }
                i15 += (((i14 * s1) + f) - i14);
                Test.iFld += (42310 + (i14 * i14));
                Test.iFld *= i15;
            }
            for (i18 = 8; i18 < 182; ++i18) {
                i19 = 59776;
            }
        case 76:
            lArr = lArr;
            for (i20 = 4; i20 < 286; i20++) {
                i17 = -122;
                i19 /= (int)(i14 | 1);
                i21 |= (int)Test.instanceCount;
                i21 *= (int)Test.instanceCount;
                i22 = 1;
                do {
                    byte by1=67;
                    f = by1;
                    switch ((i20 % 9) + 7) {
                    case 7:
                        d3 -= f;
                    case 8:
                        i23 = (int)Test.instanceCount;
                        break;
                    case 9:
                        iArr3[i20 + 1] *= i16;
                        break;
                    case 10:
                        dArr[i22] -= Test.instanceCount;
                        break;
                    case 11:
                        for (f4 = i20; f4 < 1; ++f4) {
                            try {
                                i24 = (Test.iFld / iArr3[i22 + 1]);
                                i23 = (i21 % 25443);
                                i24 = (iArr3[(int)(f4)] % iArr3[(int)(f4 - 1)]);
                            } catch (ArithmeticException a_e) {}
                            iArr3[(int)(f4 - 1)] += i14;
                        }
                        break;
                    case 12:
                        d3 -= Test.instanceCount;
                        break;
                    case 13:
                        iArr3[i20 - 1] = i21;
                        break;
                    case 14:
                        iArr3[i22 - 1] = Test.iFld;
                        break;
                    case 15:
                        iArr3[i20 - 1] -= i22;
                        break;
                    }
                } while (++i22 < 89);
            }
            break;
        case 77:
            bFld = bFld;
            break;
        case 78:
            iArr3[(i21 >>> 1) % N] -= (int)-8L;
        case 79:
        case 80:
            i24 *= -24641;
            break;
        default:
            i19 = i21;
        }

        FuzzerUtils.out.println("f i14 i15 = " + Float.floatToIntBits(f) + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 s1 = " + i16 + "," + i17 + "," + s1);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 d3 = " + i21 + "," + i22 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i23 f4 i24 = " + i23 + "," + Float.floatToIntBits(f4) + "," + i24);
        FuzzerUtils.out.println("iArr3 lArr dArr = " + FuzzerUtils.checkSum(iArr3) + "," + FuzzerUtils.checkSum(lArr) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld bFld = " + Test.instanceCount + "," + Test.iFld + "," +
            (bFld ? 1 : 0));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
