// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:03 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=6800L;
    public static short sFld=-18657;
    public static int iFld=-235;
    public static float fFld=34.109F;
    public static boolean bFld=true;
    public static double dFld=-103.85864;
    public static volatile float fFld1=0.341F;
    public volatile byte byFld=77;

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i7, int i8) {

        int i9=15435, i10=-3, i11=-253, iArr1[]=new int[N], iArr2[]=null;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, -236);
        
        FuzzerUtils.init(lArr1, -4672324728083028395L);

        i7 = i7;
        i8 = i7;
        try {
            Test.instanceCount <<= Test.sFld;
            try {
                i9 = 1;
                do {
                    for (i10 = 1; i10 < 5; i10++) {
                        i11 &= (int)Test.instanceCount;
                    }
                    i8 += (int)Test.fFld;
                    Test.fFld -= -5276983352233032413L;
                    iArr1[i9 - 1] -= -4;
                } while (++i9 < 373);
                Test.iFld = i8;
                iArr2[2] = 3;
                iArr1 = iArr1;
                lArr1[(i9 >>> 1) % N] = Test.instanceCount;
            }
            catch (NullPointerException exc5) {
                Test.instanceCount -= 13L;
            }
        }
        catch (NullPointerException exc6) {
            Test.sFld <<= (short)i11;
        }
        catch (UserDefinedExceptionTest exc7) {
            i8 = i8;
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr1) + 0 + FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth1(byte by, int i3, int i4) {

        int i5=-10871, i6=-6, i13=172, i14=12852;

        try {
            Test.instanceCount *= (--i4);
        }
        catch (NullPointerException exc8) {
            for (i5 = 10; i5 < 387; ++i5) {
                Test.iFld += (int)(i5 * fMeth(i4, i4));
                for (i13 = 1; i13 < 4; i13++) {
                    i3 -= (int)Test.instanceCount;
                    i3 = i13;
                    switch (((i5 % 3) * 5) + 111) {
                    case 126:
                        i6 = (int)Test.instanceCount;
                        break;
                    case 116:
                        Test.bFld = Test.bFld;
                        if (Test.bFld) continue;
                        i14 *= (int)Test.dFld;
                        Test.iFld = i3;
                        break;
                    case 117:
                        i14 = i3;
                        Test.dFld *= Test.instanceCount;
                    default:
                        i4 = by;
                    }
                }
            }
        }
        long meth_res = by + i3 + i4 + i5 + i6 + i13 + i14;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        int i15=7, i16=0, i17=7720, i18=16162;
        byte by1=6;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.113363);

        switch (((iMeth1((byte)(57), Test.iFld, 98) >>> 1) % 2) + 34) {
        case 34:
            for (i15 = 22; i15 < 387; i15++) {
                for (i17 = i15; i17 < 5; ++i17) {
                    Test.fFld1 += (((i17 * i15) + Test.iFld) - Test.instanceCount);
                    Test.fFld += i17;
                    switch ((i15 % 2) + 1) {
                    case 1:
                        Test.instanceCount = (long)-109.358F;
                        dArr[i17 - 1] = 33939;
                        i16 >>>= i16;
                        by1 -= (byte)Test.iFld;
                        break;
                    case 2:
                        i18 *= (int)Test.fFld;
                    default:
                        i18 += (((i17 * Test.instanceCount) + Test.instanceCount) - Test.fFld1);
                    }
                    Test.iFld += i17;
                    i18 = (int)Test.instanceCount;
                    if (i16 != 0) {
                    }
                }
            }
            break;
        case 35:
            Test.fFld += i15;
            break;
        }
        long meth_res = i15 + i16 + i17 + i18 + by1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-19734, i1=3806, i2=-9, i19=-243, i20=52, i21=14, i22=-41949, i23=3896, iArr[][]=new int[N][N];
        long l=234L, lArr[]=new long[N];
        float f=48.573F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(lArr, -6L);
        FuzzerUtils.init(iArr, 27604);
        FuzzerUtils.init(bArr, true);

        lArr[(i >>> 1) % N] = ((-(Test.sFld + 77)) + (~iArr[(i >>> 1) % N][(i >>> 1) % N]));
        i = i;
        switch ((((((int)(Test.instanceCount + i)) >>> 1) % 8) * 5) + 85) {
        case 113:
            for (i1 = 13; 267 > i1; i1++) {
                i = (iArr[i1][i1 + 1] + iMeth());
                for (i19 = i1; i19 < 99; i19++) {
                    switch ((i19 % 7) + 53) {
                    case 53:
                        i |= i20;
                    case 54:
                        i20 = (int)180L;
                        i21 = 1;
                        while (++i21 < 1) {
                            Test.instanceCount += i20;
                            lArr[i19 + 1] -= i;
                            i2 = i;
                            Test.fFld1 += i21;
                            Test.instanceCount >>= i19;
                            bArr[i21 + 1] = Test.bFld;
                        }
                        Test.instanceCount = i;
                        i20 = (int)Test.dFld;
                        break;
                    case 55:
                        i2 *= Test.sFld;
                        break;
                    case 56:
                        i >>= i2;
                        Test.instanceCount *= i2;
                        Test.instanceCount += (((i19 * Test.instanceCount) + i20) - i19);
                    case 57:
                        byFld -= (byte)-24819;
                        i20 += i19;
                        i = 12983;
                        break;
                    case 58:
                        i2 |= -73;
                        for (i22 = 1; i22 > i19; i22--) {
                            i20 += i22;
                            Test.dFld = Test.iFld;
                            iArr[i1 - 1][i22] = (int)Test.instanceCount;
                        }
                    case 59:
                        bArr[i19 - 1] = Test.bFld;
                        break;
                    default:
                        lArr[i19 + 1] *= i21;
                    }
                }
            }
            break;
        case 107:
            i -= i2;
        case 109:
        case 117:
            Test.fFld1 -= l;
            break;
        case 103:
            lArr[(i1 >>> 1) % N] -= (long)f;
            break;
        case 114:
            Test.bFld = Test.bFld;
            break;
        case 92:
            Test.iFld += (int)Test.dFld;
        case 123:
        default:
            Test.fFld = Test.instanceCount;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 l = " + i22 + "," + i23 + "," + l);
        FuzzerUtils.out.println("f lArr iArr = " + Float.floatToIntBits(f) + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.iFld);
        FuzzerUtils.out.println("Test.fFld Test.bFld Test.dFld = " + Float.floatToIntBits(Test.fFld) + "," + (Test.bFld
            ? 1 : 0) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld1 byFld = " + Float.floatToIntBits(Test.fFld1) + "," + byFld);

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
