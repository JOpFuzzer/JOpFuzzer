// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:44 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=24247L;
    public static float fFld=50.802F;
    public static volatile byte byFld=-18;
    public static boolean bFld=false;
    public static double dFld=2.30021;
    public short sFld=4575;
    public static double dFld1=-2.122808;
    public int iArrFld[]=new int[N];
    public boolean bArrFld[]=new boolean[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i10) {

        int i11=-14, i12=36008, i13=-241, iArr[]=new int[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 5);
        FuzzerUtils.init(bArr, false);

        iArr[(i10 >>> 1) % N] = (int)119.36308;
        i11 = 1;
        do {
            iArr[i11] -= (int)Test.fFld;
            iArr[i11] = i11;
        } while (++i11 < 342);
        for (i12 = 10; i12 < 160; i12++) {
            l = i11;
            bArr[i12] = true;
            i13 -= i13;
            iArr[i12 + 1] = (int)Test.instanceCount;
            Test.byFld = (byte)i11;
            Test.byFld += (byte)i12;
            i10 = (int)l;
            i10 *= i12;
            Test.fFld *= i12;
        }
        l += i11;
        vMeth2_check_sum += l + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public void vMeth1(int i7) {

        int i8=-242, i9=-214, i14=-243, i15=-8, i16=9;
        double d1=112.35630;

        i7 = (i7--);
        i8 = 333;
        while (--i8 > 0) {
            Test.byFld = (byte)(((i7--) + (++i7)) + ((i8 + i7) - (32 ^ (i9--))));
            d1 -= ((-(i7 & i9)) + Test.instanceCount);
            vMeth2(Test.instanceCount, i7);
            i14 = 1;
            while (++i14 < 5) {
                short s=-24769;
                iArrFld = iArrFld;
                Test.instanceCount *= i9;
                Test.fFld += Test.instanceCount;
                Test.instanceCount = i8;
                i7 += s;
            }
            for (i15 = 1; i15 < 5; ++i15) {
                iArrFld[i15 - 1] *= i16;
                bArrFld[i8 + 1] = Test.bFld;
                i9 = i7;
            }
        }
        vMeth1_check_sum += i7 + i8 + i9 + Double.doubleToLongBits(d1) + i14 + i15 + i16;
    }

    public void vMeth(double d, int i2) {

        int i3=-42448, i4=13609, i5=21704, i6=-65171;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -63222L);

        try {
            i2 = (int)((--i2) * (lArr[(i2 >>> 1) % N]++));
            for (i3 = 4; i3 < 314; i3 += 2) {
                i4 += (int)(Integer.reverseBytes(i2--) - ((Test.instanceCount * Test.instanceCount) - i4));
                if (i2 != 0) {
                    vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr);
                    return;
                }
                i4 += (-28215 + (i3 * i3));
                for (i5 = 1; i5 < 10; ++i5) {
                    vMeth1(i3);
                    switch ((i3 % 6) + 15) {
                    case 15:
                        if (true) {
                            i2 = i3;
                            Test.instanceCount += (((i5 * i6) + Test.instanceCount) - i4);
                        } else {
                            i6 += 11;
                            i2 += i5;
                            i4 /= i6;
                        }
                        break;
                    case 16:
                        i2 += (int)Test.fFld;
                        break;
                    case 17:
                        i2 >>= i4;
                        break;
                    case 18:
                        Test.instanceCount -= Test.instanceCount;
                        break;
                    case 19:
                        Test.instanceCount += (i5 - i4);
                        break;
                    case 20:
                        iArrFld[i5] *= i3;
                        break;
                    default:
                        i6 += (int)-1.993F;
                    }
                }
            }
        }
        catch (ArithmeticException exc1) {
            Test.instanceCount >>>= i3;
        }
        finally {
            d = i2;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=225, i1=65073, i17=-47153, i18=-39640, i19=-10, i20=-44037, i21=13849, i22=129;
        float f1=-2.919F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.58646);

        Test.fFld += (float)0.66721;
        for (i = 20; i < 327; i++) {
            vMeth(Test.dFld, i1);
            Test.instanceCount += (i ^ (long)Test.fFld);
        }
        for (i17 = 7; i17 < 181; i17++) {
            if (Test.bFld) continue;
            for (i19 = 1; i19 < 144; ++i19) {
                sFld += (short)(0 + (i19 * i19));
                Test.dFld += i19;
                Test.fFld = i18;
                iArrFld[i17] = (int)Test.instanceCount;
                i1 >>>= i1;
                i1 *= i19;
                for (i21 = 1; 2 > i21; i21++) {
                    float f=-97.985F;
                    i22 = (int)7515958927611082061L;
                    i22 *= i21;
                    i18 += (((i21 * i17) + i) - f);
                    Test.dFld1 += i22;
                    if (Test.bFld) continue;
                    i22 += (i21 * i21);
                    switch ((((i19 >>> 1) % 10) * 5) + 105) {
                    case 124:
                        i22 += (((i21 * i21) + Test.instanceCount) - i22);
                        i1 += i;
                        i20 *= (int)Test.dFld1;
                        break;
                    case 151:
                        Test.instanceCount += i21;
                        i1 %= (int)(i20 | 1);
                        if (Test.bFld) break;
                        Test.instanceCount += i21;
                        break;
                    case 115:
                    case 142:
                        Test.instanceCount += i21;
                        i22 >>= i20;
                        break;
                    case 127:
                        if (Test.bFld) break;
                        break;
                    case 131:
                        Test.dFld1 -= i18;
                    case 135:
                        f1 -= i;
                        break;
                    case 139:
                        dArr[i19] -= i19;
                    case 106:
                        i1 += (i21 | i18);
                    case 111:
                        iArrFld[i21] = sFld;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i17 = " + i + "," + i1 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 f1 = " + i21 + "," + i22 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.bFld Test.dFld sFld = " + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(Test.dFld) + "," + sFld);
        FuzzerUtils.out.println("Test.dFld1 iArrFld bArrFld = " + Double.doubleToLongBits(Test.dFld1) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}