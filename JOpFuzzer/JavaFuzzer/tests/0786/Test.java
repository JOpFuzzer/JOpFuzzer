// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:59 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=11L;
    public static volatile short sFld=19324;
    public boolean bFld=true;
    public long lArrFld[]=new long[N];
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -5);
    }

    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i6=-14, i7=19824, i8=-9, i9=-167, i10=144, i11=12;
        float f1=0.709F;
        double d=-57.21749;

        for (i6 = 14; 393 > i6; ++i6) {
            for (i8 = 1; i8 < 4; ++i8) {
                Test.instanceCount = Test.instanceCount;
                i7 = (int)Test.instanceCount;
                Test.instanceCount += (i8 ^ i7);
                i9 += i8;
                i7 += (int)Test.instanceCount;
                Test.instanceCount >>>= Test.instanceCount;
                f1 += i9;
                f1 = i9;
            }
            i7 += (int)Test.instanceCount;
            f1 = (float)d;
            for (i10 = 1; 4 > i10; i10 += 2) {
                i9 = (int)f1;
                i9 |= i11;
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i10 + i11;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static byte byMeth(int i4, long l, int i5) {

        int i12=-5, i13=-144, i14=-14, i15=-12112, i16=-23906, i17=47453;
        float f2=93.64F, f3=72.850F, fArr[]=new float[N];
        long l1=6683888147339244650L;

        FuzzerUtils.init(fArr, -120.903F);

        i4 += (iMeth1() + i4);
        fArr[(i4 >>> 1) % N] = i4;
        for (i12 = 7; i12 < 185; i12++) {
            for (i14 = 1; i14 < 9; ++i14) {
                f2 -= i5;
            }
            for (f3 = i12; f3 < 9; f3++) {
                i17 = 1;
                do {
                    l1 = 10L;
                    Test.instanceCount -= i16;
                    f2 *= Test.instanceCount;
                    if (true) continue;
                    i13 /= (int)(i16 | 1);
                    Test.iArrFld[i17] = i12;
                } while (++i17 < 1);
                i13 &= i14;
                i5 += (int)(((f3 * i14) + l) - i14);
            }
        }
        long meth_res = i4 + l + i5 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f2) + Float.floatToIntBits(f3) + i16
            + i17 + l1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public int iMeth() {

        int i18=-101, i19=-6;

        Test.instanceCount = byMeth(i18, Test.instanceCount, i19);
        long meth_res = i18 + i19;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-19, i1=26810, i2=-37475, i3=253, i20=-45058;
        float f=0.910F, f4=52.462F, fArr1[]=new float[N];
        boolean b=false;
        double d1=-77.95480;

        FuzzerUtils.init(fArr1, 1.708F);

        lArrFld[(i >>> 1) % N] = i;
        Test.instanceCount *= (++Test.instanceCount);
        for (i1 = 14; i1 < 385; i1++) {
            f *= (-8 - (i2--));
            Test.instanceCount += i1;
            i3 = 1;
            while (++i3 < 68) {
                i >>= (int)(-(iMeth() >>> Test.instanceCount));
                switch (((i3 % 5) * 5) + 59) {
                case 67:
                    i2 = (int)f;
                    if (b) continue;
                    Test.iArrFld = Test.iArrFld;
                    break;
                case 82:
                    i2 *= (int)-9L;
                    lArrFld[i3] = i1;
                    if (b) {
                        fArr1[i1] -= Test.instanceCount;
                        i20 = 1;
                        while ((i20 -= 3) > 0) {
                            i2 += (i20 * i20);
                            i2 += i1;
                            switch (((i3 % 2) * 5) + 33) {
                            case 35:
                                if (true) break;
                                f = i3;
                                d1 += Test.instanceCount;
                                break;
                            case 41:
                                i -= (int)135L;
                                break;
                            default:
                                i2 = i;
                            }
                            i2 = i2;
                            i2 = (int)Test.instanceCount;
                            i2 -= i;
                            f -= -1.933F;
                        }
                        f4 += i3;
                    } else if (bFld) {
                        f4 += Test.sFld;
                    }
                    break;
                case 84:
                    Test.iArrFld[i1] <<= i2;
                    break;
                case 74:
                    i2 += (int)(-31L + (i3 * i3));
                    break;
                case 68:
                    i = (int)f;
                    break;
                default:
                    i *= i;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f i3 b = " + Float.floatToIntBits(f) + "," + i3 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i20 d1 f4 = " + i20 + "," + Double.doubleToLongBits(d1) + "," +
            Float.floatToIntBits(f4));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld bFld = " + Test.instanceCount + "," + Test.sFld + "," +
            (bFld ? 1 : 0));
        FuzzerUtils.out.println("lArrFld Test.iArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  byMeth ->  byMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 byMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}