// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2289798024L;
    public static long lFld=10L;
    public static boolean bFld=false;
    public long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -77);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i3=-171, i4=3, i5=229, i6=-744, iArr1[]=new int[N];
        float f2=-2.407F;
        double d1=2.116012;
        boolean b=true;

        FuzzerUtils.init(iArr1, 205);

        for (i3 = 161; i3 > 4; --i3) {
            i4 += i3;
            if (b) {
                i5 = 1;
                do {
                    byte by=41;
                    i4 += (i5 - by);
                    Test.instanceCount += (9 + (i5 * i5));
                    i6 = 1;
                    while (--i6 > 0) {
                        i4 ^= i6;
                        i4 += i6;
                        f2 = Test.instanceCount;
                        Test.instanceCount = (long)d1;
                        iArr1 = iArr1;
                        i4 >>= i3;
                        Test.instanceCount -= i4;
                    }
                    if (false) continue;
                } while (++i5 < 10);
            } else if (b) {
                if (true) break;
            } else if (b) {
                i4 *= i6;
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(float f1) {

        int i=73, i1=36, i2=62897, i7=86, i8=0, i9=7269, iArr[]=new int[N];
        double d=60.54620;

        FuzzerUtils.init(iArr, -27);

        i = 1;
        while (++i < 197) {
            for (i1 = 1; i1 < 8; i1++) {
                if (Math.max((int)(-Test.instanceCount), i1 + i1) > (-149 + (iArr[i1] - (++i2)))) continue;
                d = iMeth();
            }
            f1 -= -36020;
            for (i7 = 1; i7 < 8; i7++) {
                i9 = 1;
                while (++i9 < 2) {
                    f1 += -121;
                    i2 -= (int)d;
                    i8 -= i2;
                    i8 &= (int)Test.instanceCount;
                    Test.instanceCount |= Test.instanceCount;
                    Test.instanceCount = Test.instanceCount;
                    f1 += (float)d;
                    iArr[i + 1] <<= i8;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i + i1 + i2 + Double.doubleToLongBits(d) + i7 + i8 + i9 +
            FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth() {

        float f=2.486F;
        int i10=38754;

        f = (float)(Math.sqrt(dMeth(2.657F)) - i10);
        vMeth_check_sum += Float.floatToIntBits(f) + i10;
    }

    public void mainTest(String[] strArr1) {

        int i11=4, i12=10, i13=-12, i14=2, i15=51806, i16=72, i17=-20, i18=30256, i19=-132, iArr2[]=new int[N];
        byte by1=16;
        double d2=0.13923;

        FuzzerUtils.init(iArr2, 20574);

        vMeth();
        iArr2[(i11 >>> 1) % N] = 6;
        for (i12 = 21; 352 > i12; ++i12) {
            i11 <<= (int)Test.instanceCount;
            i13 = (int)Test.lFld;
            switch ((i12 % 2) + 82) {
            case 82:
                Test.instanceCount = (long)-56.695F;
                lArrFld[i12 - 1] >>= Test.instanceCount;
                break;
            case 83:
                Test.instanceCount *= i11;
                i13 &= i13;
                for (i14 = 4; i14 < 76; i14++) {
                    i16 += i17;
                    i18 = 1;
                    do {
                        iArr2[i18] = by1;
                        if (false) {
                            i15 = i13;
                        } else {
                            d2 -= 6;
                            i11 |= (int)Test.instanceCount;
                            Test.iArrFld[i14 - 1] += i13;
                            by1 += (byte)Test.instanceCount;
                        }
                        i15 -= i12;
                        i17 -= 17781;
                        if (Test.bFld) continue;
                        i19 = (int)Test.instanceCount;
                        Test.lFld *= i16;
                        Test.lFld <<= Test.instanceCount;
                        Test.iArrFld[i14 - 1] -= (int)Test.lFld;
                    } while (++i18 < 2);
                    Test.instanceCount |= i18;
                    i15 += (((i14 * Test.instanceCount) + i16) - i13);
                    Test.lFld += i11;
                }
            }
        }

        FuzzerUtils.out.println("i11 i12 i13 = " + i11 + "," + i12 + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 by1 = " + i17 + "," + i18 + "," + by1);
        FuzzerUtils.out.println("d2 i19 iArr2 = " + Double.doubleToLongBits(d2) + "," + i19 + "," +
            FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.lFld Test.bFld = " + Test.instanceCount + "," + Test.lFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("lArrFld Test.iArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}