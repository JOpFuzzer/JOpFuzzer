// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-34223L;
    public static volatile float fFld=-2.780F;
    public static byte byFld=-29;
    public static volatile boolean bFld=true;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(byte by, int i1, int i2) {

        int i3=-3, i4=0, i5=15947, i6=101, i7=112, i8=-203, iArr1[][]=new int[N][N];
        double d=0.35175;

        FuzzerUtils.init(iArr1, -159);

        for (i3 = 1; i3 < 225; i3++) {
            i5 = 1;
            while (++i5 < 7) {
                Test.instanceCount = Test.instanceCount;
                i2 = (int)d;
                Test.fFld = i4;
                i4 += i4;
            }
            i4 += i3;
        }
        i6 = 1;
        do {
            i4 = (int)-922981587L;
            i1 += i6;
        } while (++i6 < 273);
        iArr1[(i6 >>> 1) % N][(i5 >>> 1) % N] += i4;
        i2 <<= (int)Test.instanceCount;
        for (i7 = 18; i7 < 321; i7++) {
            i4 = (int)Test.instanceCount;
            Test.fFld += (i7 * Test.instanceCount);
        }
        long meth_res = by + i1 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + i8 +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i=-25108, i9=-45685, i10=-6, i11=-200, i12=44426, i13=140, iArr[]=new int[N];
        byte by1=0;
        float f=-1.735F;
        boolean b=false, bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(bArr, true);

        Test.instanceCount = ((--iArr[(i >>> 1) % N]) + iMeth1(by1, 78, i));
        i >>= (int)Test.instanceCount;
        i >>>= i;
        i = i;
        for (i9 = 9; i9 < 338; ++i9) {
            i <<= 58;
            i11 = 1;
            do {
                try {
                    i10 = (i % 250);
                    i = (i10 % -118);
                    iArr[i11] = (i10 % -59718);
                } catch (ArithmeticException a_e) {}
            } while (++i11 < 5);
            switch ((i9 % 2) + 34) {
            case 34:
                f = 1;
                do {
                    for (i12 = 1; 1 > i12; ++i12) {
                        iArr[i9] <<= i10;
                        Test.instanceCount ^= i11;
                        i -= (int)-142L;
                        i += (int)1.742F;
                    }
                } while (++f < 5);
                break;
            case 35:
                bArr[i9] = b;
                break;
            }
        }
        long meth_res = i + by1 + i9 + i10 + i11 + Float.floatToIntBits(f) + i12 + i13 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i14=-241, i15=-8, i16=30818, i17=-24213, i18=-38123, iArr2[]=new int[N];
        float f1=-48.146F;
        double d1=0.32528;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-4783);
        FuzzerUtils.init(iArr2, -35645);

        Test.fFld *= (iMeth() >> -196);
        sArr[(-18 >>> 1) % N] -= (short)i14;
        for (f1 = 7; f1 < 167; ++f1) {
            iArr2 = FuzzerUtils.int1array(N, (int)3);
            i16 = 1;
            while (++i16 < 10) {
                for (i17 = i16; i17 < 1; i17++) {
                    Test.byFld *= (byte)f1;
                    iArr2[i16 + 1] = i14;
                    d1 -= i15;
                    switch ((i17 % 1) + 117) {
                    case 117:
                        i14 += (((i17 * i14) + i18) - Test.instanceCount);
                        i15 -= i15;
                        Test.instanceCount <<= i16;
                        d1 *= i18;
                    default:
                        Test.instanceCount |= i14;
                    }
                }
            }
        }
        vMeth_check_sum += i14 + Float.floatToIntBits(f1) + i15 + i16 + i17 + i18 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i19=-235, i20=-9, i21=-10, i22=-8108, i23=-210;
        long l=-10L, lArr[][]=new long[N][N];
        short s=-7671;
        double dArr[]=new double[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, 182L);
        FuzzerUtils.init(dArr, 13.109898);
        FuzzerUtils.init(fArr, -1.736F);

        vMeth();
        Test.fFld -= i19;
        iArrFld[(-10 >>> 1) % N] >>= i19;
        iArrFld[(96 >>> 1) % N] = i19;
        i19 = i19;
        i19 -= -160;
        iArrFld[(i19 >>> 1) % N] -= i19;
        i19 <<= i19;
        i20 = 1;
        while (++i20 < 378) {
            i19 += i20;
            lArr[i20 - 1][i20] -= (long)Test.fFld;
            i19 += -226;
            i19 = i19;
            Test.instanceCount -= 14098;
            i19 = (int)Test.instanceCount;
            i19 = i19;
            l = 1;
            while (++l < 67) {
                Test.bFld = Test.bFld;
                i19 += (int)(l ^ Test.instanceCount);
                Test.instanceCount = 12609;
                Test.fFld += i21;
                dArr[i20] *= 230;
                i22 = 1;
                while (++i22 < 1) {
                    i21 = s;
                    fArr[i22] = i22;
                    Test.instanceCount += i19;
                    Test.fFld += (i22 + i23);
                    Test.instanceCount += i23;
                    i19 -= i22;
                    iArrFld = iArrFld;
                }
            }
        }

        FuzzerUtils.out.println("i19 i20 l = " + i19 + "," + i20 + "," + l);
        FuzzerUtils.out.println("i21 i22 s = " + i21 + "," + i22 + "," + s);
        FuzzerUtils.out.println("i23 lArr dArr = " + i23 + "," + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.bFld iArrFld = " + (Test.bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
