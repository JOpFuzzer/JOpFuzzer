// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:53 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=8L;
    public static int iFld=13;
    public short sFld=12348;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -2.879F);
        FuzzerUtils.init(Test.iArrFld, 21);
        FuzzerUtils.init(Test.byArrFld, (byte)82);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth(int i2, int i3) {

        int iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -248);

        iArr1[(-14 >>> 1) % N] += (int)((--Test.instanceCount) + (Test.instanceCount++));
        long meth_res = i2 + i3 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth(int i, int i1) {

        int i4=5;
        short s=14645;

        i1 |= (iMeth(Math.min(i, i4), i + -1874) * (++s));
        vSmallMeth_check_sum += i + i1 + i4 + s;
    }

    public static int iMeth2(short s1, int i10) {

        int i12=177, i13=-13;
        boolean b=true;
        double d1=0.7334;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)35);

        i10 *= iMeth(196, i10);
        Test.iArrFld[(Test.iFld >>> 1) % N] *= i10;
        for (int i11 : Test.iArrFld) {
            i10 -= i11;
            for (i12 = 1; i12 < 4; i12++) {
                i11 *= (int)-88.27058;
                switch ((((Test.iFld >>> 1) % 2) * 5) + 95) {
                case 103:
                    if (b) break;
                    if (b) break;
                    break;
                case 105:
                    i13 >>= (int)Test.instanceCount;
                    Test.fArrFld[i12 + 1] -= -14653;
                    i13 += i12;
                    Test.fArrFld[i12 - 1] -= Test.instanceCount;
                    break;
                default:
                    Test.iArrFld[i12 + 1] = 13;
                    i11 = (int)d1;
                }
            }
        }
        long meth_res = s1 + i10 + i12 + i13 + (b ? 1 : 0) + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(byArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth1(float f1, int i8, int i9) {

        short s2=-3618;
        int i14=-108, i15=6917;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 2.36207);

        i9 -= (iMeth2(s2, i8) - i8);
        i14 = 1;
        while (++i14 < 317) {
            Test.instanceCount += (i14 ^ i8);
            i9 += (i14 + i9);
            Test.instanceCount -= Test.instanceCount;
            i8 %= -79;
            Test.iArrFld[i14 - 1] = (int)Test.instanceCount;
            i15 = 1;
            while (++i15 < 5) {
                switch ((i15 % 7) + 88) {
                case 88:
                    i8 = (int)f1;
                case 89:
                    Test.byArrFld[i15 - 1] = (byte)i9;
                    f1 += i15;
                    i8 -= (int)Test.instanceCount;
                    Test.iArrFld[i15] = (int)Test.instanceCount;
                    break;
                case 90:
                    Test.instanceCount -= Test.instanceCount;
                case 91:
                    i8 *= 0;
                case 92:
                    Test.instanceCount = Test.iFld;
                    break;
                case 93:
                    i9 = (int)f1;
                case 94:
                    dArr[i15 + 1] *= Test.iFld;
                    break;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i8 + i9 + s2 + i14 + i15 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=0.115169;
        int i5=1, i6=6, i7=-253, i16=2241, i17=83, i18=-63, i19=-40, iArr[]=new int[N];
        float f=98.838F;
        boolean b1=true;

        FuzzerUtils.init(iArr, -11);

        iArr = iArr;
        Test.iFld -= Test.iFld;
        for (int smallinvoc=0; smallinvoc<186; smallinvoc++) vSmallMeth(iArr[(Test.iFld >>> 1) % N]--, (int)(-(++d)));
        i5 = 1;
        do {
            Test.instanceCount *= 156;
            for (i6 = i5; i6 < 65; i6++) {
                d *= (iMeth(-(Test.iFld++), (int)(-23963 % (((long)(d++)) | 1))) * ((Test.iFld - -19745L) - -251));
                Test.fArrFld[i5 - 1] *= (--f);
            }
            vSmallMeth((int)(iMeth(iMeth1(f, -17819, Test.iFld), 8) + f), i5);
            if (false) {
                Test.instanceCount = i7;
                for (i16 = 4; i16 < 65; i16++) {
                    iArr = iArr;
                    Test.iFld = i17;
                    Test.iFld += (int)Test.instanceCount;
                    i17 -= (int)f;
                    f -= i6;
                    Test.instanceCount += i16;
                    i18 = 1;
                    do {
                        byte by1=-80;
                        Test.iFld = Test.iFld;
                        by1 = (byte)Test.instanceCount;
                        sFld += (short)i18;
                    } while (++i18 < 2);
                    i17 >>= (int)24698L;
                }
                i19 = 1;
                do {
                    i7 >>= (int)Test.instanceCount;
                    Test.fArrFld[i19 + 1] = Test.instanceCount;
                    iArr[i19] = (int)Test.instanceCount;
                    f = Test.instanceCount;
                    d = Test.instanceCount;
                    f += (((i19 * Test.iFld) + f) - Test.instanceCount);
                } while (++i19 < 65);
            } else if (b1) {
                dArrFld[i5] += 0;
            } else if (b1) {
                d *= i17;
            } else {
                i7 -= i19;
            }
        } while (++i5 < 390);

        FuzzerUtils.out.println("d i5 i6 = " + Double.doubleToLongBits(d) + "," + i5 + "," + i6);
        FuzzerUtils.out.println("i7 f i16 = " + i7 + "," + Float.floatToIntBits(f) + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("b1 iArr = " + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld sFld = " + Test.instanceCount + "," + Test.iFld + "," +
            sFld);
        FuzzerUtils.out.println("Test.fArrFld Test.iArrFld Test.byArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld) +
            "," + FuzzerUtils.checkSum(Test.byArrFld));
        FuzzerUtils.out.println("dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test iMeth2 iMeth1
//DEBUG  iMeth1 ->  iMeth1 mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}