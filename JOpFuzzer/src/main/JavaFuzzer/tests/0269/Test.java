// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:47 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5273L;
    public static double dFld=38.16359;
    public static byte byFld=124;
    public static float fFld=0.150F;
    public static int iArrFld[]=new int[N];
    public short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 32);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l) {

        int i5=-244, i6=60595, i7=14, i8=-664, i9=-18424, iArr[]=new int[N];
        short s=-28800;

        FuzzerUtils.init(iArr, -10);

        iArr = iArr;
        for (i5 = 18; i5 < 367; ++i5) {
            Test.dFld -= i6;
            i6 >>>= i6;
            i6 %= 3;
            for (i7 = i5; i7 < 5; ++i7) {
                Test.instanceCount += i7;
                i8 = (int)1.14298;
                Test.byFld = (byte)s;
                l = 3;
                i6 += (i7 * i7);
                iArr[i7 - 1] -= i5;
                i8 <<= i6;
            }
            Test.instanceCount >>= -173;
            try {
                i6 = (i7 / iArr[i5]);
                iArr[i5] = (iArr[i5 - 1] / -46119);
                i9 = (-40048 % i6);
            } catch (ArithmeticException a_e) {}
        }
        vMeth1_check_sum += l + i5 + i6 + i7 + i8 + s + i9 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2, int i3, float f) {

        int i4=-57802;
        short s1=-27147;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.37468);

        i4 = 1;
        while (++i4 < 347) {
            vMeth1(Test.instanceCount);
            f -= i4;
            i2 += (((i4 * Test.instanceCount) + i3) - i2);
            i2 += (i4 * i4);
        }
        dArr[(i2 >>> 1) % N] -= i3;
        i2 += i2;
        s1 = (short)Test.instanceCount;
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f) + i4 + s1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i, int i1) {

        short s2=21734;
        int i10=-7, i11=-46555, i12=-7, i13=138, i14=-5, i15=6, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 52);

        vMeth(i1, i, Test.fFld);
        s2 *= (short)Test.dFld;
        Test.fFld -= -71L;
        for (i10 = 5; i10 < 376; i10++) {
            i11 *= (int)Test.fFld;
            Test.fFld = Test.instanceCount;
            for (i12 = 1; i12 < 5; i12++) {
                i13 += (int)Test.dFld;
                for (i14 = 1; i14 < 2; ++i14) {
                    i = i13;
                    iArr1 = iArr1;
                    i15 += (i14 - i15);
                    i = i1;
                    Test.fFld = 59.585F;
                    i11 >>= i15;
                }
            }
        }
        long meth_res = i + i1 + s2 + i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=-3, i17=33203, i18=-178, i20=-45518, i21=241, i22=62358, i23=43836, i24=-19808;
        boolean b=false;
        double d=117.55197;
        short s3=-1139;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -69.795F);

        Test.instanceCount <<= iMeth(i16, -16958);
        Test.fFld = Test.byFld;
        if (b) {
            Test.byFld -= (byte)i16;
            i16 <<= i16;
            i16 = (int)Test.fFld;
            i16 <<= i16;
        } else {
            for (i17 = 2; 225 > i17; ++i17) {
                i18 = i16;
                try {
                    i16 = (i17 % -98);
                    i18 = (i18 % i16);
                    Test.iArrFld[i17] = (i18 % i16);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount = i18;
            }
        }
        try {
            for (int i19 : Test.iArrFld) {
                i16 -= i17;
                for (i20 = 1; i20 < 63; i20++) {
                    sArrFld[i20 - 1][i20] += (short)i16;
                    Test.iArrFld[i20] += (int)Test.instanceCount;
                    for (i22 = 2; i22 > 1; i22--) {
                        Test.fFld = Test.instanceCount;
                        Test.instanceCount = i23;
                        i23 += (int)Test.instanceCount;
                    }
                    fArr = FuzzerUtils.float1array(N, (float)-1.685F);
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)-157);
                    i19 = (int)1.169F;
                    Test.instanceCount &= i18;
                    for (d = 1; d < 2; ++d) {
                        Test.instanceCount <<= i16;
                        Test.instanceCount = i19;
                        i21 -= i22;
                        i21 = (int)-20010L;
                    }
                }
            }
        }
        catch (UserDefinedExceptionTest exc1) {
            s3 >>= (short)Test.instanceCount;
        }
        finally {
            Test.byFld <<= (byte)i21;
        }

        FuzzerUtils.out.println("i16 b i17 = " + i16 + "," + (b ? 1 : 0) + "," + i17);
        FuzzerUtils.out.println("i18 i20 i21 = " + i18 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 d = " + i22 + "," + i23 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i24 s3 fArr = " + i24 + "," + s3 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.byFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.fFld Test.iArrFld sArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(sArrFld));

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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
