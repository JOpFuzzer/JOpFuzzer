// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:55 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-1144654431L;
    public static volatile boolean bFld=true;
    public static short sFld=-19650;
    public static volatile byte byFld=-33;
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2610903534L);
        FuzzerUtils.init(Test.fArrFld, -2.912F);
        FuzzerUtils.init(Test.iArrFld, 169);
    }

    public static long bMeth_check_sum = 0;
    public static long bMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i13, int i14) {

        int i15=-9036, i16=-57, i17=10, i18=67, iArr1[]=new int[N];
        float f3=0.930F;

        FuzzerUtils.init(iArr1, -52);

        Test.bFld = Test.bFld;
        Test.instanceCount = 41342;
        i15 = 1;
        do {
            Test.instanceCount -= i15;
            i16 = 1;
            while (++i16 < 11) {
                for (i17 = 1; i17 > 1; i17 -= 2) {
                    i13 += i15;
                    f3 += (i17 + i16);
                    if (false) continue;
                    Test.instanceCount += (i17 | i16);
                    Test.instanceCount <<= i16;
                }
                iArr1[i15] -= Test.sFld;
                Test.bFld = Test.bFld;
                Test.sFld <<= (short)i15;
                i14 += (((i16 * i15) + i15) - Test.byFld);
            }
        } while (++i15 < 146);
        vMeth_check_sum += i13 + i14 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr1);
    }

    public static boolean bMeth1(int i7, short s1, int i8) {

        int i9=38378, i10=40697, i11=-54, i12=-47662, iArr[][]=new int[N][N];
        float f2=50.235F;

        FuzzerUtils.init(iArr, 4);

        i9 = 1;
        while (++i9 < 256) {
            for (i10 = i9; i10 < 6; i10 += 3) {
                Test.instanceCount = (++Test.instanceCount);
                try {
                    iArr[i9 - 1][i10 + 1] = (i8 / 27354);
                    i11 = (i8 % -251);
                    iArr[i9 - 1][i9 - 1] = (i8 / -25915);
                } catch (ArithmeticException a_e) {}
                i7 >>= (((-iArr[i10][i9 + 1]) + i7) / (((++i8) << Math.max(i8, i9)) | 1));
                i12 = 1;
                while (++i12 < 1) {
                    i8 = (int)(f2++);
                    i8 += (--i11);
                    if (i7 != 0) {
                        return ((int)(i7 + s1 + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f2) +
                            FuzzerUtils.checkSum(iArr))) % 2 > 0;
                    }
                    Test.fArrFld[i9 + 1] += ((++iArr[(i9 >>> 1) % N][i9]) * -11);
                    vMeth(i12, i9);
                    i7 <<= i7;
                    iArr[i9][i10] += (int)f2;
                    f2 += 13;
                    s1 <<= (short)i8;
                }
            }
        }
        long meth_res = i7 + s1 + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr);
        bMeth1_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static boolean bMeth(int i3, int i4, long l) {

        int i5=-34, i6=-63408, i19=0;
        short s=-20353;
        float f4=-1.279F;
        double d1=86.98420;

        for (i5 = 16; 291 > i5; i5 += 3) {
            float f1=0.162F;
            f1 += (i5 + s);
            Test.bFld = (bMeth1(i6, Test.sFld, i5) & false);
            i4 += (((i5 * i3) + Test.instanceCount) - Test.instanceCount);
            for (f4 = 1; f4 < 17; f4++) {
                Test.instanceCount += i19;
                Test.lArrFld[i5] <<= 3707626654L;
                d1 -= i3;
                if (true) {
                    i19 += (int)((long)f4 ^ i3);
                    Test.iArrFld[(int)(f4 + 1)] = i4;
                    i3 += (int)(((f4 * i4) + Test.instanceCount) - i4);
                } else if (Test.bFld) {
                    if (Test.bFld) continue;
                    i3 += -128;
                    Test.instanceCount = 8;
                    return ((int)(i3 + i4 + l + i5 + i6 + s + Float.floatToIntBits(f4) + i19 +
                        Double.doubleToLongBits(d1))) % 2 > 0;
                } else if (false) {
                    l = Test.byFld;
                }
            }
        }
        long meth_res = i3 + i4 + l + i5 + i6 + s + Float.floatToIntBits(f4) + i19 + Double.doubleToLongBits(d1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        double d=-66.48498;
        int i=-38616, i1=2, i2=-4066;
        float f=-2.691F, f5=-2.897F;

        for (d = 12; d < 386; ++d) {
            for (f = 67; f > 4; --f) {
                i2 = 1;
                do {
                    i1 *= i;
                    i1 >>= (int)(((i1 - Test.instanceCount) + (Test.lArrFld[(int)(d)]--)) - i2);
                    Test.bFld = (bMeth(i1, i1, Test.instanceCount) || Test.bFld);
                    i = (int)Test.instanceCount;
                    if (Test.bFld) break;
                    i1 = i1;
                    switch (((i >>> 1) % 6) + 68) {
                    case 68:
                        i += i2;
                        Test.iArrFld[i2] = (int)f;
                        Test.instanceCount = (long)-2.681F;
                        Test.sFld = (short)f;
                        break;
                    case 69:
                        i1 = (int)-69.113783;
                    case 70:
                        Test.lArrFld = Test.lArrFld;
                        Test.instanceCount *= i1;
                        break;
                    case 71:
                        f5 = i;
                        break;
                    case 72:
                        Test.lArrFld[(int)(f - 1)] |= i1;
                        Test.lArrFld[i2 + 1] = (long)f;
                        break;
                    case 73:
                        switch ((int)(((f % 8) * 5) + 2)) {
                        case 31:
                            i1 = (int)Test.instanceCount;
                            switch ((int)((f % 5) + 54)) {
                            case 54:
                                Test.sFld <<= (short)i;
                                f5 += f;
                            case 55:
                                Test.instanceCount = i;
                                i ^= i;
                            case 56:
                                Test.instanceCount += Test.instanceCount;
                                Test.instanceCount += i2;
                                break;
                            case 57:
                                if (Test.bFld) break;
                            case 58:
                                i1 = (int)f5;
                            }
                            break;
                        case 10:
                            Test.byFld &= (byte)i2;
                            break;
                        case 19:
                            i1 += (int)d;
                            break;
                        case 40:
                            Test.sFld += (short)-124.490F;
                            break;
                        case 22:
                            Test.lArrFld[(int)(f)] -= i2;
                        case 9:
                            i += (int)Test.instanceCount;
                            break;
                        case 5:
                            i *= i1;
                            break;
                        case 23:
                            i1 += (i2 * i2);
                            break;
                        }
                        break;
                    }
                } while (++i2 < 2);
            }
        }

        FuzzerUtils.out.println("d i f = " + Double.doubleToLongBits(d) + "," + i + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i1 i2 f5 = " + i1 + "," + i2 + "," + Float.floatToIntBits(f5));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.sFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.byFld Test.lArrFld Test.fArrFld = " + Test.byFld + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth1_check_sum: " + bMeth1_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  bMeth1 ->  bMeth1 bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth1 bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}