// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7166369901764275782L;
    public static int iFld=64295;
    public static int iFld1=-13;
    public static short sFld=5320;

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(short s, int i7, int i8) {

        double d1=116.91326;
        int i9=-3, i10=7;

        Test.instanceCount = Test.iFld;
        i7 -= (int)d1;
        Test.instanceCount = i7;
        i7 = i8;
        for (i9 = 6; i9 < 227; i9++) {
            Test.instanceCount += (i9 * i9);
        }
        long meth_res = s + i7 + i8 + Double.doubleToLongBits(d1) + i9 + i10;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(byte by) {

        long l=-213L;
        int i4=241, i5=249, i6=-13, i11=-5, i12=2, i13=-154;
        float f=-75.432F, fArr[][]=new float[N][N];
        short s1=21214;
        double d2=-2.59247;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, 99.866F);

        Test.iFld &= (int)Test.instanceCount;
        for (l = 9; l < 300; ++l) {
            for (i5 = 1; i5 < 6; ++i5) {
                bArr[(int)(l)] = (bArr[(int)(l)] = ((i5 * l) != iMeth((short)(-21264), -26605, Test.iFld)));
                switch ((int)((l % 5) + 59)) {
                case 59:
                    Test.instanceCount >>= i4;
                    switch ((int)(((l % 2) * 5) + 77)) {
                    case 79:
                        i11 -= by;
                        Test.instanceCount = i4;
                        break;
                    case 80:
                        for (i12 = 1; i12 < 2; i12++) {
                            fArr[(int)(l)][i12] -= i13;
                            i4 <<= i5;
                            i4 = Test.iFld1;
                            f += f;
                            i13 = s1;
                        }
                    }
                case 60:
                    Test.iFld *= (int)Test.instanceCount;
                case 61:
                    fArr[(i11 >>> 1) % N][(int)(l)] -= Test.instanceCount;
                    break;
                case 62:
                case 63:
                    d2 += 2830033428452191848L;
                default:
                    i6 <<= i5;
                }
            }
        }
        long meth_res = by + l + i4 + i5 + i6 + i11 + i12 + i13 + Float.floatToIntBits(f) + s1 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(bArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i, int i1, int i2) {

        int i3=9;
        byte by1=-30;

        i3 = 1;
        while (++i3 < 219) {
            lMeth(by1);
        }
        Test.instanceCount += Test.instanceCount;
        vMeth_check_sum += i + i1 + i2 + i3 + by1;
    }

    public void mainTest(String[] strArr1) {

        double d=-89.93065, d3=-55.43245, dArr[]=new double[N];
        int i14=66, i15=161, i16=-69, i17=-222, i18=-16, iArr[]=new int[N], iArr1[][]=new int[N][N];
        long l1=10L;
        byte by2=61;
        boolean b=false;
        float fArr1[]=new float[N];

        FuzzerUtils.init(dArr, 37.57477);
        FuzzerUtils.init(iArr, 1378);
        FuzzerUtils.init(iArr1, -12918);
        FuzzerUtils.init(fArr1, 10.270F);

        Test.iFld *= (int)(-(d - (Test.instanceCount * Test.iFld)));
        vMeth(Test.iFld, Test.iFld, i14);
        l1 = 234;
        do {
            Test.iFld += (int)l1;
            for (i15 = (int)(l1); 107 > i15; ++i15) {
                float f1=1.885F;
                switch ((i15 % 6) + 93) {
                case 93:
                    dArr[(int)(l1 - 1)] -= Test.iFld;
                    break;
                case 94:
                    iArr[i15 + 1] += (int)Test.instanceCount;
                    i14 += i14;
                    iArr[i15] *= (int)d;
                    dArr[i15 + 1] += 6L;
                case 95:
                    d += i14;
                    Test.sFld += (short)(((i15 * by2) + Test.iFld1) - l1);
                    d3 = 1;
                    do {
                        Test.iFld1 -= i14;
                    } while (--d3 > 0);
                case 96:
                    if (b) break;
                    iArr1 = FuzzerUtils.int2array(N, (int)202);
                    break;
                case 97:
                    if (b) continue;
                    break;
                case 98:
                    Test.instanceCount = -49L;
                    i16 -= (int)f1;
                    for (i17 = 1; i17 < 1; i17++) {
                        Test.iFld += (((i17 * f1) + i18) - i15);
                        fArr1[i15 + 1] = by2;
                        if (b) {
                            i14 >>= Test.iFld;
                            Test.iFld1 += (i17 | Test.iFld1);
                        } else if (b) {
                            i18 = 169;
                        } else {
                            Test.instanceCount = by2;
                        }
                    }
                    if (b) continue;
                    break;
                }
                if (b) break;
            }
        } while (--l1 > 0);

        FuzzerUtils.out.println("d i14 l1 = " + Double.doubleToLongBits(d) + "," + i14 + "," + l1);
        FuzzerUtils.out.println("i15 i16 by2 = " + i15 + "," + i16 + "," + by2);
        FuzzerUtils.out.println("d3 b i17 = " + Double.doubleToLongBits(d3) + "," + (b ? 1 : 0) + "," + i17);
        FuzzerUtils.out.println("i18 dArr iArr = " + i18 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("iArr1 fArr1 = " + FuzzerUtils.checkSum(iArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.iFld1 = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.iFld1);
        FuzzerUtils.out.println("Test.sFld = " + Test.sFld);

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}