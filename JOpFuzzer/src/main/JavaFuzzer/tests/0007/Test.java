// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:41 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=32L;
    public int iFld=7;
    public byte byFld=-23;
    public static short sFld=32714;
    public static byte byFld1=57;
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(byte by, long l, int i6) {

        boolean b=false;
        int i7=6, i8=-10, i9=-10, i10=31511, i11=3, iArr1[]=new int[N];
        float f1=92.605F, f2=2.35F, f3=0.603F;

        FuzzerUtils.init(iArr1, -65490);

        Test.bArrFld[(i6 >>> 1) % N] = b;
        for (i7 = 3; i7 < 129; ++i7) {
            i6 += (127 + (i7 * i7));
            i8 = i6;
            i6 = i8;
        }
        f1 = i8;
        l += i6;
        for (f2 = 6; f2 < 190; ++f2) {
            for (i10 = 1; i10 < 9; ++i10) {
                i9 -= -30989;
                Test.sFld -= (short)i7;
                f3 = 1;
                while (++f3 < 2) {
                    i9 >>= 94;
                    i9 += (int)(((f3 * f1) + i7) - i8);
                    iArr1[(int)(f3 + 1)] = i6;
                }
            }
        }
        long meth_res = by + l + i6 + (b ? 1 : 0) + i7 + i8 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i9
            + i10 + i11 + Float.floatToIntBits(f3) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4, int i5) {

        float f4=28.749F;
        double d1=-1.92716, dArr[][]=new double[N][N];
        int i12=-8, i13=22927, i14=-1508;

        FuzzerUtils.init(dArr, 1.61420);

        iMeth1(Test.byFld1, 2378047642L, i4);
        i5 = (int)Test.instanceCount;
        f4 *= (float)d1;
        i4 *= i5;
        Test.instanceCount -= (long)f4;
        for (i12 = 225; i12 > 12; i12 -= 3) {
            dArr[i12][i12] = i14;
            Test.instanceCount += i5;
        }
        i4 -= (int)f4;
        vMeth_check_sum += i4 + i5 + Float.floatToIntBits(f4) + Double.doubleToLongBits(d1) + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public int iMeth(double d) {

        long l1=-1724290769L, lArr[]=new long[N];
        int i15=-10987;

        FuzzerUtils.init(lArr, 4L);

        vMeth(iFld, 1);
        Test.instanceCount ^= iFld;
        iFld *= iFld;
        iFld = iFld;
        iFld -= (int)Test.instanceCount;
        iFld |= -58148;
        for (l1 = 8; l1 < 194; l1++) {
            iFld *= Test.sFld;
        }
        lArr[(iFld >>> 1) % N] += i15;
        long meth_res = Double.doubleToLongBits(d) + l1 + i15 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=-15897, i2=7, i3=4305, iArr[]=new int[N];
        float f=-69.643F, fArr[]=new float[N];
        double d2=94.102497;
        boolean b1=true;

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(fArr, 98.491F);

        iFld <<= (byFld << iFld);
        for (int i : iArr) {
            iFld = (iFld--);
            i1 = 1;
            do {
                Test.instanceCount += (-4 + (i1 * i1));
                for (i2 = 1; 1 > i2; ++i2) {
                    switch ((i1 % 7) + 7) {
                    case 7:
                        if (false) break;
                        if (b1) {
                            f -= iMeth(d2);
                            f += i;
                            iFld += (((i2 * i3) + i1) - i3);
                            Test.instanceCount += i2;
                        }
                        if (b1) {
                            i3 *= Test.byFld1;
                            Test.instanceCount -= iFld;
                            i %= -66;
                        } else if (b1) {
                            f += i2;
                        }
                        i3 += (i2 * i2);
                        break;
                    case 8:
                        fArr[i1] -= 11;
                    case 9:
                        iArr[i2 + 1] -= iFld;
                        Test.sFld >>= (short)iFld;
                        d2 -= -2.150F;
                        break;
                    case 10:
                        f += Test.instanceCount;
                        i3 ^= i1;
                        iFld += i2;
                        f += (i2 * i2);
                    case 11:
                        iFld >>= i2;
                        break;
                    case 12:
                        i -= i3;
                        break;
                    case 13:
                        iArr[i1 - 1] = i;
                        break;
                    }
                }
            } while (++i1 < 63);
        }

        FuzzerUtils.out.println("i1 i2 i3 = " + i1 + "," + i2 + "," + i3);
        FuzzerUtils.out.println("f d2 b1 = " + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d2) + "," + (b1
            ? 1 : 0));
        FuzzerUtils.out.println("iArr fArr = " + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount iFld byFld = " + Test.instanceCount + "," + iFld + "," + byFld);
        FuzzerUtils.out.println("Test.sFld Test.byFld1 Test.bArrFld = " + Test.sFld + "," + Test.byFld1 + "," +
            FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
