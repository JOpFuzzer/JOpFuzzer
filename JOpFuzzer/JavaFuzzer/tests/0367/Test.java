// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:49 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=47L;
    public static float fFld=-74.294F;
    public static boolean bFld=true;
    public static float fArrFld[]=new float[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 57.561F);
        FuzzerUtils.init(Test.dArrFld, 1.49607);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i7=-8, i8=-9, i9=-31268, i10=160, i11=-4;
        double d=-21.104128;
        byte by1=-28;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)3662);

        for (i7 = 4; i7 < 136; i7 += 2) {
            if (Test.bFld) {
                i8 = i7;
                sArr[i7 - 1] *= (short)i7;
                Test.fFld -= i8;
                vMeth_check_sum += i7 + i8 + i9 + Double.doubleToLongBits(d) + i10 + i11 + by1 +
                    FuzzerUtils.checkSum(sArr);
                return;
            } else if (Test.bFld) {
                if (Test.bFld) break;
                i8 = i8;
                i9 = 23;
                do {
                    i8 -= (int)d;
                    switch ((((i8 >>> 1) % 5) * 5) + 22) {
                    case 40:
                        for (i10 = 1; i10 < 1; ++i10) {
                            Test.instanceCount >>= i9;
                            i11 = (int)2163839612L;
                            i11 -= i7;
                            i11 = (int)Test.fFld;
                        }
                        break;
                    case 39:
                        i8 += i9;
                        break;
                    case 28:
                        if (Test.bFld) break;
                    case 31:
                        i8 += by1;
                        break;
                    case 36:
                        Test.fArrFld = FuzzerUtils.float1array(N, (float)-73.622F);
                        break;
                    }
                } while (--i9 > 0);
            }
        }
        vMeth_check_sum += i7 + i8 + i9 + Double.doubleToLongBits(d) + i10 + i11 + by1 + FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth1(short s, int i6) {

        int i12=-13, i13=20680, i14=-48136, i15=0, iArr1[]=new int[N];
        double d1=-41.29443;

        FuzzerUtils.init(iArr1, -102);

        i6 -= i6;
        try {
            Test.fFld %= (((i6 * -1825016675L) - (i6 >> 24818)) - (i6++));
            vMeth();
            for (i12 = 15; i12 < 352; i12 += 3) {
                long l1=957047388L;
                for (i14 = 1; 14 > i14; ++i14) {
                    Test.bFld = Test.bFld;
                    Test.instanceCount = i13;
                    d1 = i6;
                }
                Test.instanceCount -= -31065;
                l1 ^= l1;
                l1 += 540;
                l1 += s;
                i15 -= i14;
                if (Test.bFld) continue;
            }
        }
        catch (ArithmeticException exc1) {
            iArr1 = iArr1;
        }
        finally {
            i13 = s;
        }
        long meth_res = s + i6 + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(boolean b, int i5) {

        short s1=-12147;
        int i16=-64044, i17=-55660, i18=245, i19=-26126, i20=-1, i21=-81, iArr2[]=new int[N];
        double d2=-1.48452, d3=7.96427;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 30939L);
        FuzzerUtils.init(iArr2, 104);

        Test.instanceCount = iMeth1(s1, 466);
        i16 = 1;
        do {
            for (d2 = 1; 5 > d2; ++d2) {
                lArr[(int)(d2 - 1)] = i16;
                i5 -= 0;
            }
            for (i18 = 5; i18 > i16; i18--) {
                i5 -= (int)Test.fFld;
                iArr2 = iArr2;
                d3 -= i16;
                for (i20 = 1; i20 < 1; i20++) {
                    if (Test.bFld) continue;
                    Test.instanceCount *= (long)38.138F;
                    Test.instanceCount += (((i20 * i20) + Test.fFld) - Test.instanceCount);
                    Test.fFld = (float)d3;
                    i21 += i20;
                }
            }
        } while (++i16 < 345);
        long meth_res = (b ? 1 : 0) + i5 + s1 + i16 + Double.doubleToLongBits(d2) + i17 + i18 + i19 +
            Double.doubleToLongBits(d3) + i20 + i21 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-101, i1=-26017, i2=59618, i3=-220, i4=40778, i22=8, i23=-11, i24=-8, i25=238, i26=8, iArr[]=new int[N];
        long l=-1615082328336303427L;
        byte by=-94;
        float f=1.570F;

        FuzzerUtils.init(iArr, 9);

        i = (int)(--Test.instanceCount);
        i1 = 1;
        do {
            for (l = 66; i1 < l; l--) {
                Test.instanceCount = (i2 &= (--i));
                for (i3 = 1; i3 < 1; i3++) {
                    by += (byte)(i3 | i1);
                    iArr[i3] = i2;
                    f -= (++i4);
                    i += (((i3 * i3) + i2) - i4);
                    Test.instanceCount -= (long)((--Test.instanceCount) - (44744 * (++Test.fArrFld[(int)(l - 1)])));
                }
                iArr[i1 - 1] |= (i4 * by);
                Test.instanceCount *= i2;
                i2 = ((i2++) * iMeth(Test.bFld, 2));
                i2 = (int)3369641942436871225L;
            }
            i2 -= -7342;
            i4 |= i3;
            Test.dArrFld[i1 + 1] = by;
            iArr[i1 - 1] += i;
            i22 = i2;
            for (i23 = 66; i23 > i1; i23--) {
                switch ((i1 % 9) + 61) {
                case 61:
                    for (i25 = i1; i25 < 1; ++i25) {
                        short s2=16662;
                        try {
                            i4 = (i23 % -29808);
                            i22 = (i3 / 230);
                            i22 = (-37287 % i4);
                        } catch (ArithmeticException a_e) {}
                        if (true) {
                            i24 += i25;
                            iArr[i23] -= s2;
                            i -= i26;
                        } else {
                            i += (i25 + Test.instanceCount);
                            i2 += (((i25 * Test.fFld) + Test.instanceCount) - i23);
                        }
                        Test.instanceCount += i25;
                    }
                case 62:
                    i24 <<= (int)Test.instanceCount;
                case 63:
                    f += i25;
                    break;
                case 64:
                    Test.instanceCount = (long)f;
                    break;
                case 65:
                    Test.instanceCount += (i23 * i23);
                    break;
                case 66:
                    if (true) break;
                    break;
                case 67:
                    i26 += (i23 | i23);
                    break;
                case 68:
                case 69:
                    if (true) continue;
                    break;
                default:
                    i4 += (((i23 * i26) + i4) - i);
                }
            }
        } while (++i1 < 383);

        FuzzerUtils.out.println("i i1 l = " + i + "," + i1 + "," + l);
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("by f i22 = " + by + "," + Float.floatToIntBits(f) + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 iArr = " + i26 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.fArrFld Test.dArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}