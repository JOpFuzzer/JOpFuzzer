// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1539456144L;
    public int iFld=-11;
    public static float fFld=2.875F;
    public double dFld=2.83152;
    public static volatile int iArrFld[][]=new int[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -6);
        FuzzerUtils.init(Test.fArrFld, 81.190F);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static int iMeth() {

        int i=51492, i1=-5, i2=8775, i3=-64, i4=-13232;
        boolean b=true;
        long l=-1L;
        double d=2.55469;
        float f1=-1.648F;
        short s=-32044;
        byte byArr[][]=new byte[N][N];

        FuzzerUtils.init(byArr, (byte)84);

        for (i = 13; 307 > i; i++) {
            i1 += (14 + (i * i));
            i2 = 1;
            do {
                if (b) continue;
                l = 1;
                do {
                    i1 *= Integer.reverseBytes(Math.max((int)(d * i), Test.iArrFld[(int)(l + 1)][(int)(l - 1)]));
                } while (++l < 1);
                for (i3 = 1; i3 < 1; i3++) {
                    Test.iArrFld[i][i] = (int)((-Test.instanceCount) + ((i2 - i2) * i3));
                    i4 += 50209;
                    switch ((((--i1) >>> 1) % 2) + 86) {
                    case 86:
                        f1 = Test.iArrFld[i2 + 1][i3];
                        i4 -= (int)((l >> i) - (s + (byArr[i3 + 1][i]++)));
                        f1 *= (++i1);
                        i4 *= (int)Test.instanceCount;
                        break;
                    case 87:
                        i1 = s;
                        break;
                    }
                }
            } while (++i2 < 6);
        }
        long meth_res = i + i1 + i2 + (b ? 1 : 0) + l + Double.doubleToLongBits(d) + i3 + i4 + Float.floatToIntBits(f1)
            + s + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l1, int i12, long l2) {

        int i13=-150, i14=187, i15=-129, i16=-28683, i17=0;
        byte by=-82;
        boolean b1=false;

        i13 = 186;
        do {
            i12 -= (int)Test.fFld;
            for (i14 = 1; 9 > i14; i14 += 2) {
                i12 = i12;
                i12 &= i12;
            }
            Test.iArrFld[i13 + 1][i13 - 1] = -3;
            by >>= (byte)i13;
            Test.instanceCount ^= 84L;
            i15 += (i13 ^ i15);
        } while (--i13 > 0);
        i15 <<= (int)Test.instanceCount;
        i15 -= i14;
        if (b1) {
            for (i16 = 4; i16 < 162; ++i16) {
                b1 = b1;
                Test.iArrFld[i16 + 1][i16 + 1] >>= -62361;
            }
        }
        vMeth1_check_sum += l1 + i12 + l2 + i13 + i14 + i15 + by + i16 + i17 + (b1 ? 1 : 0);
    }

    public static void vMeth(int i8, double d1) {

        int i9=6, i10=10, i11=13, i18=-1385, i19=1, i20=-23290, i21=63711, i22=-127;
        byte by1=2;
        short s1=25089;
        boolean b2=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -111L);

        Test.instanceCount -= ((--i8) * Math.min((int)(Test.fFld * 26717), i8));
        i9 = (int)((lArr[(i8 >>> 1) % N]++) - (--i9));
        for (i10 = 2; i10 < 133; i10++) {
            vMeth1(Test.instanceCount, i9, -128L);
            i11 <<= -1;
            i18 = 1;
            while (++i18 < 12) {
                for (i19 = 1; i19 > 1; --i19) {
                    Test.fFld += Test.fFld;
                }
                for (i21 = 1; i21 < 1; ++i21) {
                    i22 = (int)Test.instanceCount;
                    if (b2) {
                        by1 = (byte)i18;
                        s1 = (short)i20;
                        i8 <<= i11;
                    } else {
                        i22 = i18;
                    }
                }
            }
        }
        vMeth_check_sum += i8 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + i18 + i19 + i20 + i21 + i22 + by1 + s1 +
            (b2 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth1(int i5, int i6, int i7) {

        double d2=-31.81546;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.580F);

        vMeth(i5, d2);
        fArr = fArr;
        long meth_res = i5 + i6 + i7 + Double.doubleToLongBits(d2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-35.664F, f2=119.244F;
        int i23=62987, i24=-50108, i25=-192, i27=-4, i28=-6, iArr[]=new int[N];
        boolean bArr[][]=new boolean[N][N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr, 61654);
        FuzzerUtils.init(lArr1, -325659019L);

        f = iMeth();
        iFld = (iMeth1(iFld, iFld, iFld) - 14);
        for (i23 = 4; 310 > i23; i23++) {
            dFld = dFld;
            i25 = 82;
            while ((i25 -= 3) > 0) {
                iFld = i23;
                Test.instanceCount = i25;
                Test.instanceCount += (((i25 * Test.fFld) + i23) - iFld);
                iFld ^= iFld;
                i24 += (((i25 * i23) + Test.instanceCount) - i23);
                i24 += i25;
                i24 = (int)-14L;
                bArr = bArr;
                Test.instanceCount ^= i24;
                Test.instanceCount /= (i23 | 1);
            }
            iFld |= (int)Test.instanceCount;
            Test.iArrFld[i23 - 1][i23] = i24;
            Test.instanceCount <<= Test.instanceCount;
        }
        i24 = i23;
        for (int i26 : iArr) {
            i26 += i25;
            i26 *= (int)18795L;
            Test.iArrFld[(i26 >>> 1) % N][(-52359 >>> 1) % N] -= -55;
            Test.fArrFld[(i25 >>> 1) % N] = iFld;
            lArr1 = lArr1;
            for (f2 = 3; f2 < 63; ++f2) {
                Test.instanceCount -= Test.instanceCount;
                i24 *= (int)Test.instanceCount;
                Test.instanceCount = Test.instanceCount;
                i28 &= 9;
            }
        }

        FuzzerUtils.out.println("f i23 i24 = " + Float.floatToIntBits(f) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 f2 i27 = " + i25 + "," + Float.floatToIntBits(f2) + "," + i27);
        FuzzerUtils.out.println("i28 bArr iArr = " + i28 + "," + FuzzerUtils.checkSum(bArr) + "," +
            FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("dFld Test.iArrFld Test.fArrFld = " + Double.doubleToLongBits(dFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 mainTest
//DEBUG  vMeth ->  vMeth iMeth1 mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}