// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:46 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-135L;
    public volatile int iFld=21523;
    public static volatile double dFld=-27.101856;
    public static volatile boolean bFld=true;
    public static volatile float fFld=0.490F;
    public static byte byFld=71;
    public long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(double d, int i2) {

        float f=114.235F, f1=0.966F, f2=1.88F;
        int i3=156, i4=157, i5=44135, i6=0, i7=-11, iArr[]=new int[N];
        short s=-19151;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -11);
        FuzzerUtils.init(lArr, -2971027383L);

        f = i2;
        iArr[(i2 >>> 1) % N] >>= i2;
        f1 = Test.instanceCount;
        for (i3 = 14; 358 > i3; i3++) {
            i2 += i3;
            for (i5 = 1; i5 < 5; i5++) {
                f1 = Test.instanceCount;
                d = 34536;
                f2 += Test.instanceCount;
                iArr[i3] -= (int)-68L;
                iArr[i5] *= (int)Test.instanceCount;
                Test.instanceCount += (((i5 * i7) + Test.instanceCount) - f);
                iArr[i3] -= i6;
            }
            s += (short)i6;
            lArr[i3 + 1] += i4;
        }
        vMeth2_check_sum += Double.doubleToLongBits(d) + i2 + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i3 +
            i4 + i5 + i6 + Float.floatToIntBits(f2) + i7 + s + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth1() {

        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 47738L);

        vMeth2(-76.33766, iFld);
        lArr1[(iFld >>> 1) % N] *= iFld;
        iFld = iFld;
        iFld -= (int)Test.dFld;
        vMeth1_check_sum += FuzzerUtils.checkSum(lArr1);
    }

    public void vMeth(int i, int i1, long l) {

        int i8=-1, i9=-11, i10=9, i11=-86, i12=-231, iArr1[]=new int[N];
        boolean b=true;
        double d1=115.1994;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr1, -42826);
        FuzzerUtils.init(lArr2, -25436L);

        vMeth1();
        i8 = 1;
        do {
            if (b) continue;
            i += (int)l;
            l += (((i8 * iFld) + iFld) - i);
        } while (++i8 < 248);
        for (i9 = 306; i9 > 9; --i9) {
            iArr1[i9] = -64;
        }
        lArr2 = lArr2;
        i10 += (int)-12L;
        i1 += i1;
        iArr1[(i10 >>> 1) % N] = i1;
        d1 = 1;
        do {
            for (i11 = 1; i11 < 8; ++i11) {
                iArr1[(int)(d1 + 1)] = i;
                if (b) continue;
            }
        } while (++d1 < 188);
        vMeth_check_sum += i + i1 + l + i8 + (b ? 1 : 0) + i9 + i10 + Double.doubleToLongBits(d1) + i11 + i12 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        int i13=-29618, i14=-65323, i15=-114, i16=-3, i17=-245, i18=-53540, i19=0, iArr2[]=new int[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)10005);
        FuzzerUtils.init(iArr2, -207);

        if (true) {
            iFld = (int)(iFld - ((--iFld) - Math.abs(Test.dFld)));
            Test.instanceCount = (((iFld / (iFld | 1)) - iFld) - iFld);
            vMeth(iFld, iFld, Test.instanceCount);
        }
        iFld -= 13;
        Test.bFld = Test.bFld;
        for (i13 = 10; i13 < 333; i13 += 2) {
            for (i15 = i13; i15 < 156; i15++) {
                i16 >>>= (int)-10L;
                iFld %= (int)(iFld | 1);
                sArr[i13 - 1] += (short)i14;
                i14 += (8 + (i15 * i15));
                i16 >>>= iFld;
                i14 >>= i14;
                switch ((i13 % 4) + 73) {
                case 73:
                    if (Test.bFld) continue;
                case 74:
                    for (i17 = 1; i17 < 1; ++i17) {
                        lArrFld[i17 - 1] += 95;
                        Test.bArrFld[i17 + 1] = Test.bFld;
                        Test.fFld = i18;
                        Test.instanceCount += (i17 - Test.fFld);
                        Test.instanceCount += (i17 + Test.instanceCount);
                    }
                    break;
                case 75:
                    Test.instanceCount = Test.instanceCount;
                    if (Test.bFld) continue;
                    break;
                case 76:
                    i19 = 1;
                    do {
                        lArrFld = lArrFld;
                        iArr2 = iArr2;
                        Test.byFld *= (byte)i17;
                        iFld %= (int)(i17 | 1);
                        iFld = -3763;
                    } while (++i19 < 1);
                    break;
                default:
                    i16 = i15;
                }
            }
        }

        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 sArr iArr2 = " + i19 + "," + FuzzerUtils.checkSum(sArr) + "," +
            FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld Test.fFld Test.byFld = " + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("lArrFld Test.bArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
            FuzzerUtils.checkSum(Test.bArrFld));

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