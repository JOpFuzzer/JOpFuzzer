// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:50 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8685717132727503627L;
    public static boolean bFld=true;
    public static float fFld=1.763F;
    public static byte byFld=120;
    public long lArrFld[]=new long[N];
    public static double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.129317);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, float f) {

        long l1=-12L, l2=-4265642713138506121L, lArr[]=new long[N];
        int i5=10, i6=-6579, i7=31, iArr[]=new int[N];
        double d1=-1.19350;
        short s1=14555;
        float f1=82.428F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(lArr, 146L);
        FuzzerUtils.init(byArr, (byte)4);

        Test.byFld -= (byte)7524;
        for (l1 = 18; l1 < 295; ++l1) {
            i6 = 1;
            do {
                iArr[i6 - 1] += i4;
                Test.byFld += (byte)(i6 - i6);
                d1 = s1;
                switch ((i6 % 3) + 43) {
                case 43:
                    i5 -= (int)7L;
                    break;
                case 44:
                    switch (((-25062 >>> 1) % 10) + 79) {
                    case 79:
                        for (l2 = 1; l2 < 1; l2++) {
                            Test.instanceCount = -39802L;
                            i5 += (int)(((l2 * l2) + l1) - i7);
                            iArr[(int)(l2)] >>>= 14563;
                            d1 += i6;
                            Test.fFld %= (i4 | 1);
                        }
                        break;
                    case 80:
                        iArr[i6 + 1] >>= (int)l2;
                        break;
                    case 81:
                        i4 += (i6 - i5);
                        break;
                    case 82:
                        i5 += (((i6 * Test.fFld) + f1) - i6);
                        break;
                    case 83:
                        i7 = i4;
                        break;
                    case 84:
                        lArr[i6] *= 11;
                    case 85:
                        Test.byFld -= (byte)-12L;
                        break;
                    case 86:
                        byArr[(int)(l1)] = (byte)i5;
                        break;
                    case 87:
                        i4 = (int)Test.instanceCount;
                        break;
                    case 88:
                        i4 &= i4;
                        break;
                    }
                case 45:
                    i7 = i4;
                    break;
                }
            } while (++i6 < 6);
        }
        vMeth1_check_sum += i4 + Float.floatToIntBits(f) + l1 + i5 + i6 + Double.doubleToLongBits(d1) + s1 + l2 + i7 +
            Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth() {

        int i8=9, i9=200, i10=223, i11=104, i12=4, i13=-184, i14=13082, iArr1[]=new int[N];
        short s2=30537;
        double d2=5.62632;

        FuzzerUtils.init(iArr1, -24587);

        vMeth1(i8, Test.fFld);
        i8 += i8;
        i9 = 1;
        do {
            i8 += s2;
            i8 = (int)36L;
        } while (++i9 < 268);
        for (i10 = 1; i10 < 269; i10++) {
            Test.fFld = i9;
            Test.instanceCount = i11;
            i8 = (int)Test.instanceCount;
            i12 = 1;
            do {
                iArr1[i12 - 1] = i9;
                i11 >>= i8;
                for (i13 = 1; i13 < 1; ++i13) {
                    i8 += (i13 + Test.fFld);
                    d2 *= Test.instanceCount;
                }
            } while (++i12 < 6);
        }
        vMeth_check_sum += i8 + i9 + s2 + i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth(short s, int i1) {

        int i2=-11567, i3=216, i15=9, i16=-41087, i17=-13409, i18=50603, iArr2[]=new int[N];
        double d3=14.22483;

        FuzzerUtils.init(iArr2, -39195);

        for (i2 = 8; i2 < 372; ++i2) {
            Test.dArrFld[i2][i2] = ((i3 = (--s)) + Math.min(Math.max(i1, i3), (int)(i3 = (int)Test.instanceCount)));
            vMeth();
        }
        for (i15 = 3; i15 < 255; ++i15) {
            for (i17 = i15; 6 > i17; ++i17) {
                i3 += (i17 * i16);
                iArr2 = iArr2;
                i16 = s;
                Test.fFld = i15;
                i1 += (int)0L;
                i1 = (int)d3;
            }
            i18 ^= i17;
            i16 >>= (int)Test.instanceCount;
        }
        Test.fFld = i18;
        long meth_res = s + i1 + i2 + i3 + i15 + i16 + i17 + i18 + Double.doubleToLongBits(d3) +
            FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=57043, i19=-44, i20=-117, i21=-7, iArr3[][]=new int[N][N];
        double d=0.129148, d4=2.4885;
        short s3=17893;

        FuzzerUtils.init(iArr3, -38097);

        for (long l : lArrFld) {
            i = 63;
            do {
                Test.bFld = (Test.bFld || ((i - i) != (d * l)));
                Test.fFld = (-lMeth(s3, 47257));
                if (Test.bFld) break;
                d = i;
                lArrFld = lArrFld;
                i19 ^= 34215;
                i19 *= i;
                l -= 64138;
                if (true) continue;
                iArr3[i] = FuzzerUtils.int1array(N, (int)35489);
            } while ((i -= 3) > 0);
            Test.fFld = -30;
            for (i20 = 1; i20 < 63; i20++) {
                Test.fFld *= i20;
                switch (((i20 % 1) * 5) + 93) {
                case 97:
                    Test.byFld += (byte)(((i20 * i19) + Test.instanceCount) - i20);
                    i19 += i20;
                default:
                    d4 = 1;
                    do {
                        d = d4;
                        switch (((i20 % 7) * 5) + 65) {
                        case 72:
                            d -= i20;
                            i21 = i21;
                            if (Test.bFld) {
                                i21 -= (int)l;
                                i19 += (int)(d4 - s3);
                                if (Test.bFld) break;
                                l += (long)(d4 * d4);
                            }
                            i19 = (int)Test.instanceCount;
                        case 89:
                            i19 <<= i20;
                        case 70:
                            i21 += 245;
                            break;
                        case 77:
                        case 88:
                            i21 *= i19;
                        case 86:
                            i19 = i20;
                            break;
                        case 78:
                            i21 >>= -29263;
                            break;
                        default:
                            i19 *= i21;
                        }
                    } while (++d4 < 2);
                }
            }
        }

        FuzzerUtils.out.println("i d s3 = " + i + "," + Double.doubleToLongBits(d) + "," + s3);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("d4 iArr3 = " + Double.doubleToLongBits(d4) + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.byFld lArrFld Test.dArrFld = " + Test.byFld + "," + FuzzerUtils.checkSum(lArrFld)
            + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}