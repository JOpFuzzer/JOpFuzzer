// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:01 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=9015L;
    public static int iFld=-9419;
    public static volatile boolean bFld=false;
    public double dFld=0.86440;
    public static float fFld=2.441F;
    public static volatile int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 13);
        FuzzerUtils.init(Test.iArrFld1, 78);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(double d, float f2) {

        int i3=10, i4=64, i5=-12, i6=55320;
        boolean b=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.101F);

        for (int i2 : Test.iArrFld) {
            fArr[(Test.iFld >>> 1) % N] -= -41192;
            i2 -= (int)Test.instanceCount;
            f2 /= (Test.iFld | 1);
            Test.iFld *= i2;
            i2 *= i2;
            for (i3 = 1; i3 < 4; i3++) {
                i4 *= i4;
                i4 = (int)d;
                Test.iFld += (i3 + i3);
                i2 = i2;
                for (i5 = 2; i3 < i5; i5 -= 3) {
                    if (b) {
                        d -= i4;
                        Test.iFld ^= -955;
                    } else if (b) {
                        i2 += i5;
                    } else {
                        i6 += i2;
                    }
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i3 + i4 + i5 + i6 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        double d1=-13.6078;
        float f3=0.363F;
        byte by1=-45;
        int i7=52, i8=9, i9=59, i10=-2, i11=43;

        Test.iFld = (int)(lMeth(d1, 28.580F) + f3);
        Test.iFld *= (int)Test.instanceCount;
        Test.iFld >>= by1;
        i7 = 1;
        do {
            f3 %= (Test.iFld | 1);
            for (i8 = 5; i8 > 1; i8--) {
                for (i10 = 1; i10 < 2; ++i10) {
                    Test.iArrFld[i8] <<= i8;
                    by1 %= (byte)-238;
                    Test.bFld = Test.bFld;
                    Test.instanceCount = Test.instanceCount;
                    i11 *= Test.iFld;
                    Test.iFld -= (int)2L;
                    i9 = Test.iFld;
                    Test.instanceCount -= Test.iFld;
                }
            }
        } while (++i7 < 342);
        vMeth_check_sum += Double.doubleToLongBits(d1) + Float.floatToIntBits(f3) + by1 + i7 + i8 + i9 + i10 + i11;
    }

    public int iMeth(int i, long l) {

        int i1=-13, i12=-22182, i13=-65459, i14=-28772, i15=-7, i16=-55490;
        float f1=-1.606F;
        short s=12768;

        i1 = 139;
        while (--i1 > 0) {
            byte by=30;
            f1 += Math.max((int)((118.107271 + (Test.instanceCount *= i1)) - by), i1);
            vMeth();
            f1 -= (float)-55.88826;
            Test.iArrFld[i1 - 1] = i;
            for (i12 = i1; i12 < 11; i12++) {
                Test.iFld += (i12 * i12);
                Test.iFld += i12;
                s *= (short)-3609727497L;
                for (i14 = 1; 1 > i14; i14 += 3) {
                    i15 += (int)(-1238311531L + (i14 * i14));
                    if (Test.bFld) break;
                    dFld = 30852;
                    i16 = i1;
                    f1 += i16;
                }
            }
        }
        long meth_res = i + l + i1 + Float.floatToIntBits(f1) + i12 + i13 + s + i14 + i15 + i16;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-27.792F, f4=-2.703F;
        int i17=202, i18=39501, i19=-11201, i20=3, i21=-39;
        short s1=10279;

        Test.iFld -= (int)(f * (iMeth(Test.iFld, Test.instanceCount) - Test.iFld));
        Test.iFld *= Test.iFld;
        for (i17 = 9; i17 < 162; i17++) {
            i18 <<= Test.iFld;
            f = 90L;
            Test.iArrFld1[i17 - 1] <<= 14;
            switch ((((i17 >>> 1) % 4) * 5) + 49) {
            case 56:
                for (f4 = 2; 164 > f4; f4++) {
                    switch ((i17 % 3) + 10) {
                    case 10:
                        for (i20 = 1; 2 > i20; ++i20) {
                            switch ((i20 % 5) + 10) {
                            case 10:
                                Test.iFld *= s1;
                                i18 = Test.iFld;
                                break;
                            case 11:
                                Test.instanceCount += i20;
                                i18 += (int)Test.instanceCount;
                                break;
                            case 12:
                                i21 += i20;
                            case 13:
                                i19 <<= Test.iFld;
                                break;
                            case 14:
                                i19 = i17;
                                switch (((i17 % 2) * 5) + 29) {
                                case 30:
                                    Test.iFld += (((i20 * i18) + i19) - Test.iFld);
                                    i19 *= -1;
                                    i19 += (i20 + i20);
                                    s1 <<= (short)-56843;
                                    break;
                                case 35:
                                    switch (((i18 >>> 1) % 3) + 91) {
                                    case 91:
                                        i21 = (int)Test.instanceCount;
                                        i18 += i20;
                                        Test.iArrFld[(int)(f4)] -= s1;
                                        i19 += i20;
                                        break;
                                    case 92:
                                        f += (i20 - Test.instanceCount);
                                        i19 += (((i20 * Test.instanceCount) + i18) - Test.iFld);
                                    case 93:
                                        i18 = i21;
                                        break;
                                    default:
                                        f = f4;
                                    }
                                    break;
                                default:
                                    i18 += 4;
                                }
                                break;
                            }
                        }
                    case 11:
                        Test.iFld += (int)(((f4 * i18) + i21) - Test.fFld);
                        break;
                    case 12:
                        Test.iArrFld1[(int)(f4)] = i20;
                    }
                }
                break;
            case 62:
            case 69:
                Test.iFld += i20;
                break;
            case 55:
                Test.iFld += -113;
                break;
            default:
                if (true) continue;
            }
        }

        FuzzerUtils.out.println("f i17 i18 = " + Float.floatToIntBits(f) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("f4 i19 i20 = " + Float.floatToIntBits(f4) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 s1 = " + i21 + "," + s1);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("dFld Test.fFld Test.iArrFld = " + Double.doubleToLongBits(dFld) + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.iArrFld1 = " + FuzzerUtils.checkSum(Test.iArrFld1));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
