// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:57 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-569209955L;
    public static double dFld=2.103583;
    public static float fFld=88.446F;
    public static int iFld=-61825;
    public byte byFld=13;
    public int iFld1=212;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 178365486L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(float f) {

        int i9=-6, i10=159;
        byte byArr[]=new byte[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(byArr, (byte)28);
        FuzzerUtils.init(lArr, 5502639802770194014L);

        for (i9 = 6; i9 < 160; ++i9) {
            byArr[i9] &= (byte)i9;
            i10 += (int)Test.dFld;
            Test.instanceCount += (i9 * Test.instanceCount);
        }
        i10 = -11;
        Test.instanceCount -= i9;
        lArr[(i9 >>> 1) % N] += -13;
        Test.instanceCount = (long)1.420F;
        long meth_res = Float.floatToIntBits(f) + i9 + i10 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i3, long l) {

        double d=-52.9319;
        int i4=-8, i5=6, i6=14, i7=13, i8=-86, i11=-14, i12=-46;
        byte by=-114;
        short s=-27557;

        for (d = 1; d < 209; d++) {
            i4 -= -167;
            for (i5 = 1; i5 < 8; ++i5) {
                for (i7 = 1; 2 > i7; i7++) {
                    i6 = (Math.min((int)(-1.902F + (d - Test.instanceCount)), Math.max(i8, i6)) - (i4--));
                    if ((i6--) < (++i6)) break;
                    i3 += (((i7 * i5) + by) - Test.instanceCount);
                    s += (short)(iMeth1(Test.fFld) + l);
                    i3 += i7;
                    i3 = (int)l;
                }
                for (i11 = 1; i11 < 2; ++i11) {
                    i4 *= (int)d;
                    Test.lArrFld[i5 + 1] = Test.instanceCount;
                    i8 = i7;
                    i3 *= i11;
                }
            }
        }
        long meth_res = i3 + l + Double.doubleToLongBits(d) + i4 + i5 + i6 + i7 + i8 + by + s + i11 + i12;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        int i1=47330, i2=63, i13=-148, i14=-49979, i15=-60826, iArr[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr, 106);

        for (i1 = 1; i1 < 143; ++i1) {
            i = iMeth(i1, Test.instanceCount);
            i13 = 11;
            do {
                i2 += i13;
                if (false) break;
                Test.fFld += Test.instanceCount;
                i2 -= (int)Test.instanceCount;
                if (b) continue;
            } while ((i13 -= 3) > 0);
            for (i14 = 1; 11 > i14; ++i14) {
                iArr[i14] <<= i;
                i2 |= (int)-192L;
                i15 += (79 + (i14 * i14));
                Test.fFld = Test.instanceCount;
                i += i14;
                i += (((i14 * i15) + i1) - i2);
            }
        }
        vMeth_check_sum += i + i1 + i2 + i13 + (b ? 1 : 0) + i14 + i15 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        short s1=-4569;
        int i16=0, i17=4, i18=-58895, i19=59611, i20=10, i21=-8, i22=12, i23=-219, iArr1[]=new int[N];
        float f1=-1.491F, fArr[]=new float[N];
        boolean b1=false;

        FuzzerUtils.init(fArr, 43.79F);
        FuzzerUtils.init(iArr1, -13);

        vMeth(Test.iFld);
        Test.instanceCount <<= s1;
        Test.lArrFld[(Test.iFld >>> 1) % N] -= (long)Test.dFld;
        Test.iFld = -40037;
        for (i16 = 4; i16 < 197; i16++) {
            Test.iFld += (i16 * i16);
            Test.fFld += i16;
            Test.iFld /= (int)(Test.instanceCount | 1);
            for (i18 = i16; i18 < 130; i18++) {
                for (f1 = 1; f1 < 1; ++f1) {
                    i19 = (int)Test.fFld;
                    Test.dFld += -1;
                    i20 += Test.iFld;
                }
                Test.fFld += (((i18 * byFld) + i20) - f1);
                i21 = 1;
                do {
                    Test.fFld += (((i21 * i19) + i17) - i17);
                    b1 = b1;
                    Test.dFld *= i18;
                    fArr = FuzzerUtils.float1array(N, (float)2.296F);
                    i19 += i19;
                } while (++i21 < 1);
                Test.dFld = i21;
                i20 %= (int)(Test.instanceCount | 1);
                for (i22 = 1; i22 < 1; ++i22) {
                    i17 -= i17;
                    Test.instanceCount = i17;
                    Test.iFld >>= i21;
                    switch (((i22 % 5) * 5) + 28) {
                    case 30:
                        Test.dFld -= -10;
                        b1 = b1;
                        iArr1[i18 + 1] -= byFld;
                        break;
                    case 40:
                        Test.fFld *= i18;
                    case 53:
                        i20 += (int)f1;
                        break;
                    case 35:
                        if (true) continue;
                        break;
                    case 42:
                        Test.instanceCount <<= i23;
                        break;
                    default:
                        Test.fFld -= iFld1;
                    }
                }
            }
        }

        FuzzerUtils.out.println("s1 i16 i17 = " + s1 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 f1 = " + i18 + "," + i19 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("i20 i21 b1 = " + i20 + "," + i21 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i22 i23 fArr = " + i22 + "," + i23 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.fFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld byFld iFld1 = " + Test.iFld + "," + byFld + "," + iFld1);
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

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