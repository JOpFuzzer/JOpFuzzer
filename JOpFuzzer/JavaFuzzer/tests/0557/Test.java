// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=8407780055323278774L;
    public static float fFld=1.887F;
    public static volatile boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -14097);
        FuzzerUtils.init(Test.lArrFld, -9L);
    }

    public static long fMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static short sMeth(int i5, int i6, int i7) {

        float f=-7.470F;
        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, 23904);

        i5 = (int)((iArr[(i6 >>> 1) % N] - (-120.419F - (i7--))) * (f--));
        long meth_res = i5 + i6 + i7 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth1() {

        int i16=38903, i17=26473, i18=5, i19=200, i20=7, i21=-49;
        short s=-19428;
        double d=-48.89171;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.559F);

        i16 = i16;
        i16 = i16;
        for (i17 = 146; i17 > 6; i17--) {
            i18 ^= i18;
            i18 = s;
        }
        i16 -= 64;
        for (i19 = 21; i19 < 340; i19++) {
            i18 *= (int)d;
            i20 = (int)Test.instanceCount;
            Test.fFld -= (float)d;
            i18 = (int)Test.instanceCount;
            fArr[i19] -= i16;
            i21 = 1;
            do {
                i18 = i18;
                i18 -= i17;
            } while (++i21 < 5);
        }
        long meth_res = i16 + i17 + i18 + s + i19 + i20 + Double.doubleToLongBits(d) + i21 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i8=4, i9=25784, i10=-123, i11=-2, i12=157, i14=-29904, i15=9, i22=1;

        Test.lArrFld[(i8 >>> 1) % N] = Test.lArrFld[(i8 >>> 1) % N];
        for (i9 = 8; i9 < 132; i9 += 2) {
            for (i11 = 1; i11 < 25; i11++) {
                int i13=-10;
                i13 += i11;
                Test.iArrFld[i11 - 1] = ((++i10) + ((-(++i13)) + i11));
            }
            i10 += (i9 + i12);
            for (i14 = 1; i14 < 25; i14++) {
                i12 = i11;
            }
            Test.instanceCount <<= ((iMeth1() * Test.instanceCount) + i9);
            i10 *= i15;
            i8 += i10;
        }
        Test.iArrFld[(i9 >>> 1) % N] *= (int)Test.instanceCount;
        Test.iArrFld = Test.iArrFld;
        i22 = i11;
        Test.fFld -= Test.instanceCount;
        long meth_res = i8 + i9 + i10 + i11 + i12 + i14 + i15 + i22;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(int i4) {

        byte by=-58;
        float f1=-1.649F;
        int i23=13, i24=-107, i25=-136;
        boolean b=true, bArr[]=new boolean[N];
        long l=33L;

        FuzzerUtils.init(bArr, false);

        sMeth(--i4, Test.iArrFld[(i4 >>> 1) % N], Test.iArrFld[(i4 >>> 1) % N]--);
        i4 <<= (--i4);
        switch (((((int)(Test.instanceCount - by)) >>> 1) % 2) + 114) {
        case 114:
            bArr[(i4 >>> 1) % N] = (((f1--) * i4) == Math.abs((int)(Test.instanceCount * -3)));
            Test.lArrFld[(68 >>> 1) % N][(i4 >>> 1) % N] <<= (i4 *= iMeth());
            Test.iArrFld = FuzzerUtils.int1array(N, (int)-167);
            break;
        case 115:
            i23 = 1;
            while (++i23 < 287) {
                switch (((34 >>> 1) % 1) + 115) {
                case 115:
                    for (i24 = 1; i24 < 6; i24 += 2) {
                        Test.instanceCount += (i24 - Test.fFld);
                        b = b;
                        Test.instanceCount = -49945;
                        i4 -= (int)Test.instanceCount;
                        i4 >>= i4;
                        i4 |= i25;
                    }
                    break;
                default:
                    i4 <<= i24;
                }
            }
        default:
            l = i4;
        }
        long meth_res = i4 + by + Float.floatToIntBits(f1) + i23 + i24 + i25 + (b ? 1 : 0) + l +
            FuzzerUtils.checkSum(bArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-151, i1=-101, i2=-42655, i3=-1, i26=-19, i27=-39948, i28=-4, i29=-200, i30=65122, i31=6, i32=35230,
            i33=13, i34=-162;
        short s1=13541;
        double d1=2.9937;

        for (i = 3; i < 284; i++) {
            for (i2 = 1; 89 > i2; i2++) {
                i1 += i2;
                fMeth(i3);
                switch ((i % 2) + 6) {
                case 6:
                    Test.bFld = Test.bFld;
                    break;
                case 7:
                    i3 += (i2 + i1);
                    for (i26 = i2; i26 < 2; i26++) {
                        try {
                            Test.iArrFld[i26 - 1] = (-52 / i3);
                            i27 = (14322 / i26);
                            i27 = (45384 % Test.iArrFld[i - 1]);
                        } catch (ArithmeticException a_e) {}
                        i1 -= i26;
                        i27 += i26;
                        s1 = (short)i27;
                    }
                    for (i28 = 2; i28 > 1; i28 -= 2) {
                        Test.instanceCount += (((i28 * i28) + s1) - i28);
                        Test.instanceCount += i2;
                    }
                    break;
                }
                if (true) {
                    i30 = 2;
                    do {
                        i27 += (int)64.127055;
                        Test.instanceCount = i30;
                        i3 += (i30 * i30);
                    } while ((i30 -= 3) > 0);
                    for (i31 = i; i31 < 2; ++i31) {
                        try {
                            i32 = (i32 % i31);
                            i3 = (i2 / i27);
                            i29 = (-16404 / i1);
                        } catch (ArithmeticException a_e) {}
                        i32 |= i2;
                    }
                    s1 += (short)(i2 * i31);
                } else if (Test.bFld) {
                    Test.fFld = i30;
                } else {
                    switch ((((i29 >>> 1) % 9) * 5) + 51) {
                    case 76:
                        for (i33 = 1; 2 > i33; ++i33) {
                            i1 += (int)Test.instanceCount;
                            d1 *= -56;
                            i3 += (((i33 * Test.instanceCount) + i3) - i28);
                        }
                        break;
                    case 64:
                        i32 = (int)Test.instanceCount;
                    case 95:
                        Test.fFld = Test.instanceCount;
                        break;
                    case 84:
                        i32 -= 54482;
                        break;
                    case 52:
                        i27 ^= s1;
                        break;
                    case 80:
                        i3 += i30;
                    case 71:
                        Test.instanceCount *= Test.instanceCount;
                        break;
                    case 72:
                        s1 *= (short)i33;
                    case 70:
                        s1 *= (short)56.42249;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i26 i27 = " + i3 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("s1 i28 i29 = " + s1 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("i33 i34 d1 = " + i33 + "," + i34 + "," + Double.doubleToLongBits(d1));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  sMeth ->  sMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}