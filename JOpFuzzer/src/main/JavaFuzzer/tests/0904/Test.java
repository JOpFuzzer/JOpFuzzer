// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:01 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=3504692129L;
    public static double dFld=0.86003;
    public static int iFld=-36648;
    public static volatile short sFld=-30933;
    public static byte byFld=84;
    public volatile int iArrFld[][]=new int[N][N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=-111, i6=63684, i7=-27405, i8=-12, i9=14, i10=-7126, iArr[]=new int[N];
        float f2=-102.692F;
        boolean b=true;

        FuzzerUtils.init(iArr, -182);

        Test.iFld += 14980;
        i5 = 1;
        while (++i5 < 141) {
            if (b) {
                switch ((i5 % 8) + 72) {
                case 72:
                    for (i6 = 1; i6 < 11; i6++) {
                        if (Test.iFld != 0) {
                            vMeth1_check_sum += i5 + i6 + i7 + Float.floatToIntBits(f2) + i8 + i9 + i10 + (b ? 1 : 0) +
                                FuzzerUtils.checkSum(iArr);
                            return;
                        }
                        f2 -= Test.iFld;
                    }
                    f2 *= i5;
                    i8 = 1;
                    while (++i8 < 11) {
                        i7 = (int)Test.instanceCount;
                        Test.iFld &= -16;
                        for (i9 = 1; i9 > 1; i9--) {
                            Test.iFld *= 22593;
                            iArr[i5 + 1] >>= i10;
                            i10 += (i9 * i9);
                        }
                    }
                    break;
                case 73:
                    Test.iFld *= i8;
                    break;
                case 74:
                    Test.iFld -= i6;
                    break;
                case 75:
                    f2 += (float)Test.dFld;
                    break;
                case 76:
                    Test.iFld = i10;
                case 77:
                    Test.iFld = i5;
                case 78:
                    Test.dFld = i6;
                case 79:
                    i10 += (i5 | i6);
                    break;
                }
                vMeth1_check_sum += i5 + i6 + i7 + Float.floatToIntBits(f2) + i8 + i9 + i10 + (b ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr);
                return;
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + Float.floatToIntBits(f2) + i8 + i9 + i10 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(long l, int i) {

        float f1=-2.779F;
        int i1=-192, i2=-12, i3=-2495, i4=-160, i11=4, i12=23180, iArr1[]=new int[N];
        long l1=48601L, lArr[]=new long[N];
        byte by=-57;
        boolean b1=false;

        FuzzerUtils.init(iArr1, -91);
        FuzzerUtils.init(lArr, -63L);

        switch ((((((int)(Test.instanceCount - i)) >>> 1) % 3) * 5) + 39) {
        case 51:
            f1 -= (float)(Test.dFld + ((i * l) - (i * i)));
            i1 = 334;
            while (--i1 > 0) {
                Test.instanceCount += (((i1 * i1) + l) - i1);
                for (i2 = i1; i2 < 5; i2++) {
                    Test.instanceCount += i3;
                    for (l1 = i1; 1 > l1; l1++) {
                        vMeth1();
                        Test.dFld *= l1;
                    }
                    i3 -= Test.iFld;
                }
                switch ((i1 % 4) + 93) {
                case 93:
                    Test.dFld += i;
                    for (i11 = i1; i11 < 5; i11++) {
                        by -= (byte)f1;
                        iArr1[i11 - 1] += i12;
                    }
                    break;
                case 94:
                    by += (byte)l1;
                    break;
                case 95:
                    b1 = b1;
                    break;
                case 96:
                }
            }
            break;
        case 47:
            lArr[(i11 >>> 1) % N] += l;
            break;
        case 52:
            Test.iFld = (int)l;
            break;
        default:
            i = (int)223L;
        }
        long meth_res = l + i + Float.floatToIntBits(f1) + i1 + i2 + i3 + l1 + i4 + i11 + i12 + by + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(double d) {

        float f=1.292F, f3=67.839F;
        int i13=-1, i14=-156, i15=-18, i16=6, iArr2[]=new int[N];
        short s=27682;

        FuzzerUtils.init(iArr2, -130);

        f += lMeth(-44871L, Test.iFld);
        Test.iFld *= (int)f;
        for (i13 = 243; 9 < i13; i13 -= 3) {
            i14 = i14;
            Test.instanceCount = Test.instanceCount;
            f3 = 1;
            do {
                for (i15 = 1; i15 < 1; ++i15) {
                    Test.iFld = (int)Test.instanceCount;
                    iArr2[i15] *= (int)1.101249;
                    iArr2[i13 - 1] |= i15;
                    Test.iFld /= (int)(s | 1);
                    Test.iFld += (i15 + i16);
                    iArr2[i13] <<= s;
                    i14 += i15;
                }
                Test.sFld = (short)-60;
            } while (++f3 < 20);
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i13 + i14 + Float.floatToIntBits(f3)
            + i15 + i16 + s + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        float f4=2.570F, f5=-1.32F, f6=-1.471F;
        int i17=14, i18=-39456;

        vMeth(111.18987);
        Test.instanceCount <<= Test.instanceCount;
        for (f4 = 5; f4 < 157; f4++) {
            switch ((int)((f4 % 3) + 52)) {
            case 52:
                Test.byFld = (byte)6688;
                Test.dFld += Test.sFld;
                Test.sFld += (short)(f4 * f4);
            case 53:
                Test.iFld += (int)f4;
                break;
            case 54:
                for (f5 = 8; 165 > f5; ++f5) {
                    int i19=44182;
                    switch ((((i18 >>> 1) % 4) * 5) + 126) {
                    case 137:
                        i19 -= Test.iFld;
                        Test.instanceCount = Test.instanceCount;
                        break;
                    case 127:
                        f6 = 202;
                        Test.instanceCount += (long)(((f5 * Test.instanceCount) + Test.iFld) - Test.instanceCount);
                        i19 = Test.iFld;
                        break;
                    case 136:
                        i17 += (int)f5;
                        break;
                    case 138:
                        i17 -= (int)Test.instanceCount;
                        Test.iFld = (int)f5;
                        Test.instanceCount = 3456L;
                        break;
                    default:
                        i18 = (int)Test.instanceCount;
                        f6 -= Test.iFld;
                    }
                    i19 %= (int)(Test.iFld | 1);
                    iArrFld[(int)(f4)][(int)(f5 + 1)] += (int)f5;
                    iArrFld[(int)(f4)][(int)(f5)] -= (int)f6;
                    Test.iFld >>>= i19;
                    i17 += (int)f5;
                    i18 = (int)-105L;
                    Test.instanceCount = i17;
                    Test.instanceCount = i18;
                    i18 = Test.byFld;
                }
                break;
            default:
                iArrFld[(int)(f4 + 1)][(int)(f4 + 1)] = (int)-2448930058L;
            }
        }

        FuzzerUtils.out.println("f4 i17 f5 = " + Float.floatToIntBits(f4) + "," + i17 + "," + Float.floatToIntBits(f5));
        FuzzerUtils.out.println("i18 f6 = " + i18 + "," + Float.floatToIntBits(f6));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.sFld Test.byFld iArrFld = " + Test.sFld + "," + Test.byFld + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
