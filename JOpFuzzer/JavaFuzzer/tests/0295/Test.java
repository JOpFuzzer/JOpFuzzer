// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:48 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-1949502949L;
    public static volatile int iFld=2900;
    public static boolean bFld=false;
    public static int iFld1=23884;
    public double dFld=0.17831;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i7, int i8, int i9) {

        short s=6562;
        int i10=11, i11=5, i12=-226, i13=38140, iArr1[]=new int[N];
        boolean b=false;
        float f1=-73.126F;

        FuzzerUtils.init(iArr1, -247);

        i9 += s;
        i7 -= (int)Test.instanceCount;
        i9 += i9;
        i7 -= i9;
        Test.iFld -= i8;
        for (i10 = 2; i10 < 128; ++i10) {
            for (i12 = 1; i12 < 12; i12 += 3) {
                Test.iFld *= i12;
                iArr1[i12 + 1] += i12;
                if (b) break;
                if (i7 != 0) {
                    vMeth2_check_sum += i7 + i8 + i9 + s + i10 + i11 + i12 + i13 + (b ? 1 : 0) +
                        Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
                    return;
                }
                b = b;
                i8 = i8;
            }
            i8 += (int)51.327F;
            f1 *= Test.instanceCount;
        }
        vMeth2_check_sum += i7 + i8 + i9 + s + i10 + i11 + i12 + i13 + (b ? 1 : 0) + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(int i4) {

        float f=-117.624F;
        int i5=166, i6=7, i14=-13, i15=63;
        short s1=13522;
        byte by=71;
        double d=-1.127750, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.118561);

        for (f = 197; f > 2; f--) {
            i6 = 1;
            while (++i6 < 8) {
                vMeth2(i5, 191, i6);
                Test.instanceCount = i4;
                s1 = (short)i4;
                dArr[i6] *= 63795;
                i4 = i6;
                for (i14 = 1; i14 < 1; i14++) {
                    switch (((i6 % 5) * 5) + 56) {
                    case 59:
                    case 79:
                        Test.instanceCount += 144;
                        Test.instanceCount += i15;
                        break;
                    case 64:
                        i4 += i5;
                        i5 = i14;
                        by -= (byte)-6165;
                    case 67:
                    case 60:
                        d /= ((long)(f) | 1);
                        break;
                    }
                }
            }
        }
        vMeth1_check_sum += i4 + Float.floatToIntBits(f) + i5 + i6 + s1 + i14 + i15 + by + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void vMeth(int i, long l) {

        int i2=59, i3=-154, i16=38384, i17=12, iArr[]=new int[N];
        double d1=-77.20879;
        float f2=0.979F;

        FuzzerUtils.init(iArr, -8);

        for (int i1 : iArr) {
            iArr = (iArr = (iArr = (iArr = iArr)));
            for (i2 = 1; 4 > i2; ++i2) {
                vMeth1(i);
                i3 += (42 + (i2 * i2));
                iArr = iArr;
                for (i16 = 1; i16 < 2; i16++) {
                    if (i16 != 0) {
                        vMeth_check_sum += i + l + i2 + i3 + i16 + i17 + Double.doubleToLongBits(d1) +
                            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    if (Test.bFld) continue;
                    d1 += i;
                    i1 += (int)(-5541957616758931407L + (i16 * i16));
                    l += (long)f2;
                    Test.iFld <<= i;
                    Test.iFld = (int)l;
                }
                Test.instanceCount += (i2 ^ Test.instanceCount);
            }
        }
        vMeth_check_sum += i + l + i2 + i3 + i16 + i17 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=22519, i19=3, i20=-23, i21=6724, i22=70, i23=10, i24=-9, i25=-167, i26=-132, i27=237, iArr2[]=new
            int[N];
        float f3=-2.97F, f4=71.97F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -168L);
        FuzzerUtils.init(iArr2, 25);

        vMeth(Test.iFld, Test.instanceCount);
        for (i18 = 6; i18 < 207; ++i18) {
            lArr[i18] = 39124L;
            iArr2[i18 - 1] -= i18;
        }
        for (f3 = 10; f3 < 222; ++f3) {
            switch ((int)((f3 % 9) + 2)) {
            case 2:
                switch ((int)(((f3 % 2) * 5) + 105)) {
                case 111:
                    for (i21 = (int)(f3); 118 > i21; ++i21) {
                        i19 = -139;
                        i19 *= -13;
                        if (Test.bFld) break;
                        Test.instanceCount += (i21 * i21);
                        Test.instanceCount = i18;
                        Test.iFld >>= (int)Test.instanceCount;
                        Test.iFld += i21;
                        Test.iFld1 |= Test.iFld;
                    }
                    i19 += (-61 + (f3 * f3));
                    i19 = Test.iFld;
                    break;
                case 113:
                    Test.instanceCount -= (long)dFld;
                    i22 += -41;
                    for (i23 = 5; i23 < 118; i23++) {
                        try {
                            iArr2[(int)(f3 + 1)] = (1624 % i22);
                            i19 = (i19 / Test.iFld);
                            i19 = (-19 / Test.iFld);
                        } catch (ArithmeticException a_e) {}
                        if (Test.bFld) break;
                        Test.instanceCount += (((i23 * Test.instanceCount) + i24) - f3);
                        iArr2[(int)(f3 - 1)] ^= i18;
                    }
                    Test.iFld1 -= (int)1.93477;
                    break;
                }
                for (i25 = 5; i25 < 118; ++i25) {
                    i27 = 1;
                    do {
                        i20 += (i27 - Test.iFld);
                        f4 *= -12;
                    } while ((i27 += 3) < 2);
                }
                break;
            case 3:
                Test.iFld ^= -2083;
            case 4:
            case 5:
                f4 = -13;
                break;
            case 6:
                f4 += (-219 + (f3 * f3));
                break;
            case 7:
                if (false) break;
                break;
            case 8:
            case 9:
                i22 = i20;
                break;
            case 10:
                i19 += (int)(f3 * f3);
            }
        }

        FuzzerUtils.out.println("i18 i19 f3 = " + i18 + "," + i19 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 f4 = " + i26 + "," + i27 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("lArr iArr2 = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iFld1 dFld = " + Test.iFld1 + "," + Double.doubleToLongBits(dFld));

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