// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:55 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2925513677L;
    public static float fFld=-115.420F;
    public static volatile double dFld=0.126656;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1, int i2, float f) {

        int i3=-238, i4=-4, i5=60324, i6=-17747, i7=-42216, i8=-6, iArr[]=new int[N];
        short s=21646;
        boolean b=true;

        FuzzerUtils.init(iArr, -1);

        i2 |= i2;
        for (i3 = 16; 273 > i3; ++i3) {
            for (i5 = 6; i5 > 1; i5--) {
                for (i7 = 2; i7 > 1; i7--) {
                    int i9=5887;
                    switch (((i3 >>> 1) % 1) + 115) {
                    case 115:
                        s = (short)i6;
                        l1 -= l1;
                        f = i6;
                        if (i9 != 0) {
                            vMeth2_check_sum += l1 + i2 + Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + i7 + i8 + s +
                                (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
                            return;
                        }
                        break;
                    default:
                        i4 -= i2;
                    }
                    try {
                        iArr[i5] = (i9 % -43);
                        i6 = (iArr[i3 + 1] % i8);
                        i4 = (i3 % -16);
                    } catch (ArithmeticException a_e) {}
                    if (b) break;
                    i6 <<= -6;
                    i2 += -9508;
                }
                if (b) break;
            }
        }
        vMeth2_check_sum += l1 + i2 + Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + i7 + i8 + s + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1() {

        int i10=48558, i11=-16, i12=61506, i13=-10, i14=-52316, i15=-53, i16=-78;
        byte by=24;
        boolean b1=true;

        vMeth2(-2354377348L, i10, Test.fFld);
        for (i11 = 1; 144 > i11; i11++) {
            if (i10 != 0) {
                vMeth1_check_sum += i10 + i11 + i12 + i13 + i14 + i15 + i16 + by + (b1 ? 1 : 0);
                return;
            }
            if (true) {
                for (i13 = 11; i13 > 1; i13 -= 3) {
                    i14 = i11;
                    i14 ^= (int)Test.instanceCount;
                    i12 <<= i13;
                    for (i15 = 4; i15 > i13; --i15) {
                        i10 -= i13;
                        Test.fFld += by;
                        i16 += i15;
                        if (b1) continue;
                        Test.instanceCount += i15;
                        Test.instanceCount += i13;
                    }
                }
                vMeth1_check_sum += i10 + i11 + i12 + i13 + i14 + i15 + i16 + by + (b1 ? 1 : 0);
                return;
            }
        }
        vMeth1_check_sum += i10 + i11 + i12 + i13 + i14 + i15 + i16 + by + (b1 ? 1 : 0);
    }

    public static void vMeth(int i, long l, int i1) {

        int i17=-9, i18=-222, i19=-5, i20=-28570, iArr1[][]=new int[N][N];
        boolean b2=true;

        FuzzerUtils.init(iArr1, 7);

        vMeth1();
        i17 = 1;
        do {
            byte by1=-104;
            l += i17;
            i = 8;
            i >>= i17;
            by1 *= (byte)i;
            iArr1[i17 + 1][(i1 >>> 1) % N] &= i;
            if (b2) continue;
            l = i17;
            l = i;
        } while ((i17 += 2) < 354);
        for (i18 = 8; i18 < 177; i18++) {
            i20 = 1;
            do {
                Test.instanceCount = -3;
            } while (++i20 < 9);
            i -= 1794;
            Test.instanceCount = (long)Test.dFld;
        }
        vMeth_check_sum += i + l + i1 + i17 + (b2 ? 1 : 0) + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i21=-172, i22=14332, i23=-19246, i24=8, i25=55189, i26=-16783, i27=-53, iArr2[][]=new int[N][N];
        long l2=-12L;
        float f1=-1.872F;

        FuzzerUtils.init(iArr2, 45081);

        vMeth(-4, Test.instanceCount, -4528);
        for (i21 = 180; i21 > 2; --i21) {
            for (l2 = 8; l2 < 141; l2++) {
                Test.fFld -= i22;
                i24 = 2;
                do {
                    i22 >>= (int)-27297L;
                    i22 = i22;
                } while (--i24 > 0);
                i23 = i23;
                i22 = i21;
            }
            Test.dFld -= -54758;
            i22 = (int)l2;
        }
        iArr2[(46171 >>> 1) % N][(i22 >>> 1) % N] <<= (int)Test.instanceCount;
        i22 -= (int)-363498339257476147L;
        i22 += i23;
        i22 = (int)Test.fFld;
        iArr2[(i23 >>> 1) % N][(i23 >>> 1) % N] = (int)Test.instanceCount;
        i22 += (int)l2;
        i22 += -186;
        i25 = 1;
        while (++i25 < 159) {
            for (f1 = i25; f1 < 158; ++f1) {
                Test.instanceCount += (long)(((f1 * i24) + i25) - f1);
                i27 = 1;
                do {
                    byte by2=97;
                    switch (((i25 % 2) * 5) + 90) {
                    case 100:
                        i26 += (((i27 * f1) + f1) - i26);
                        switch ((i25 % 7) + 40) {
                        case 40:
                        case 41:
                            iArr2[i27][(int)(f1 + 1)] ^= (int)l2;
                            break;
                        case 42:
                            i26 <<= (int)-6L;
                            break;
                        case 43:
                            by2 += (byte)(i27 * i25);
                        case 44:
                            Test.instanceCount += (long)Test.fFld;
                            i22 += (-128 + (i27 * i27));
                            break;
                        case 45:
                            by2 += (byte)(i27 * i27);
                        case 46:
                            i26 += i22;
                        default:
                            i26 *= i25;
                        }
                    case 92:
                        i23 = -14;
                        break;
                    }
                } while (++i27 < 1);
            }
        }

        FuzzerUtils.out.println("i21 i22 l2 = " + i21 + "," + i22 + "," + l2);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("f1 i26 i27 = " + Float.floatToIntBits(f1) + "," + i26 + "," + i27);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));

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
