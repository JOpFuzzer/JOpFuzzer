// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-16862L;
    public static byte byFld=64;
    public static double dFld=112.103307;
    public static float fFld=2.1005F;
    public int iArrFld[][]=new int[N][N];
    public volatile float fArrFld[][]=new float[N][N];

    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(byte by, int i6, int i7) {

        int i8=-199, i9=-199;
        float f=1.87F;

        i7 *= i7;
        i7 = (int)Test.instanceCount;
        for (i8 = 13; i8 < 360; i8++) {
            by = (byte)i7;
            Test.instanceCount = i8;
            i6 += (i8 * i8);
            if (i8 != 0) {
            }
            f = i9;
            i6 = (int)Test.instanceCount;
            i6 <<= (int)Test.instanceCount;
            i7 += (int)25L;
            Test.instanceCount += (i8 + i9);
        }
        i9 >>>= i8;
        Test.instanceCount *= i9;
        Test.instanceCount = i6;
        long meth_res = by + i6 + i7 + i8 + i9 + Float.floatToIntBits(f);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, int i4) {

        int i5=-14, i10=-179, i11=19, i12=113, i13=42188, i14=0, i15=-35, i16=-60, i17=-51450;
        short s=-12383;
        boolean b=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -34.825F);

        i5 = 1;
        while ((i5 += 2) < 171) {
            s *= (short)(((-8 - (-iMeth(Test.byFld, i4, i4))) + Test.byFld) * Test.dFld);
        }
        for (i10 = 7; i10 < 333; ++i10) {
            for (i12 = 1; i12 < 5; ++i12) {
                Test.byFld *= (byte)i3;
                i13 += (((i12 * i13) + i12) - i12);
                for (i14 = 1; i14 < 2; ++i14) {
                    Test.byFld += (byte)4;
                }
                Test.fFld *= i5;
                switch (((-159 >>> 1) % 2) + 120) {
                case 120:
                    for (i16 = 1; i16 < 2; ++i16) {
                        Test.byFld = (byte)i15;
                        i11 += (((i16 * Test.fFld) + i5) - i15);
                        if (b) continue;
                    }
                    break;
                case 121:
                    fArr[i12] -= Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + s + i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public byte byMeth(int i1, int i2) {


        i2 ^= ((++i1) + ((iArrFld[(i2 >>> 1) % N][(i2 >>> 1) % N]--) - (-37 - (i1 - i1))));
        vMeth(i1, 14);
        i1 = i2;
        long meth_res = i1 + i2;
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-236, i18=170, i19=-1, i20=-14406, i21=37, i22=-40303, i23=2, i24=-250, i25=-8, i26=-212, i27=-7,
            i28=198, iArr[]=new int[N];
        double d=-28.120016, d1=0.3928;
        long l=1862937566L, l1=76L;

        FuzzerUtils.init(iArr, -94);

        iArr[(i >>> 1) % N] >>= (int)(++Test.instanceCount);
        Test.instanceCount += (long)((i++) + ((i % ((long)(d) | 1)) * byMeth(i, 14)));
        for (l = 3; l < 366; ++l) {
            for (i19 = 2; 69 > i19; i19++) {
                iArrFld[(int)(l + 1)][i19] -= (int)d1;
                iArrFld[(int)(l)] = iArrFld[(int)(l)];
                i18 = i;
            }
            i18 += i19;
            for (i21 = 4; i21 < 69; i21++) {
                for (i23 = 1; i23 < 2; ++i23) {
                    Test.instanceCount = i23;
                    i20 += i20;
                    Test.byFld += (byte)(i23 * i23);
                }
                for (l1 = 2; l1 > i21; --l1) {
                    fArrFld[(int)(l1 + 1)][(int)(l + 1)] += i18;
                    i25 = i19;
                    i18 *= (int)d;
                    Test.fFld = i;
                    i -= (int)-1.412F;
                    Test.fFld += l1;
                    i25 = (int)-4267210440L;
                    Test.instanceCount += (l1 - i20);
                    i25 += (int)(((l1 * l1) + Test.instanceCount) - i18);
                }
                for (i26 = 1; 2 > i26; i26++) {
                    i18 -= (int)Test.fFld;
                    iArrFld[(int)(l - 1)][i26 - 1] = i18;
                    i24 = i;
                    i25 = i28;
                    i25 <<= (int)l;
                    iArr[i26 + 1] -= i;
                }
            }
        }

        FuzzerUtils.out.println("i d l = " + i + "," + Double.doubleToLongBits(d) + "," + l);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("d1 i21 i22 = " + Double.doubleToLongBits(d1) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 l1 = " + i23 + "," + i24 + "," + l1);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 iArr = " + i28 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.dFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld iArrFld fArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}