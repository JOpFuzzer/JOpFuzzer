// Generated by Java* Fuzzer test generator (1.0.001). Thu May 20 17:15:08 2021
public class Test {

    public static final int N = 400;

    public static long instanceCount=-280030990L;
    public int iFld=24239;
    public static double dFld=-1.92784;
    public static volatile float fFld=-2.588F;
    public static volatile short sFld=17125;
    public boolean bFld=false;
    public long lFld=8428271436296950720L;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -8);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3) {

        int i4=-134, i5=114, i6=-65254, i7=11, i8=34345, i9=148, i10=3812;
        float f1=45.663F;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -8585031375745862188L);

        Test.instanceCount = i3;
        for (i4 = 10; i4 < 361; i4++) {
            i3 = i4;
            for (i6 = i4; i6 < 5; i6++) {
                for (i8 = i6; i8 < 1; ++i8) {
                    double d1=-76.58189;
                    i10 -= (int)d1;
                    i7 = i5;
                    if (true) {
                        i3 *= (int)Test.instanceCount;
                        f1 = i7;
                    } else {
                        Test.iArrFld1[i8] = i8;
                        i10 |= (int)Test.instanceCount;
                        f1 += i8;
                    }
                    b = b;
                    i7 += (int)Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth(float f) {

        int i11=-3, i13=-2798, i14=3, i15=60, i16=12, i17=38727, i18=-13;

        vMeth1(i11);
        for (int i12 : Test.iArrFld1) {
            for (i13 = 1; i13 < 4; i13++) {
                Test.dFld = 0.97200;
            }
            i12 >>= i11;
            Test.iArrFld1[(i13 >>> 1) % N] *= 133;
        }
        i11 = (int)Test.instanceCount;
        for (i15 = 2; i15 < 206; ++i15) {
            Test.iArrFld1[i15 - 1] += i11;
            for (i17 = 1; 8 > i17; ++i17) {
                Test.iArrFld1 = Test.iArrFld1;
                Test.iArrFld1[i15 + 1] += i15;
                i14 += (((i17 * i14) + i17) - i11);
                i14 -= i18;
                Test.instanceCount >>= i16;
            }
        }
        long meth_res = Float.floatToIntBits(f) + i11 + i13 + i14 + i15 + i16 + i17 + i18;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l) {

        int i=14, i1=188, i2=46970, i19=-52706, i20=-237, i21=11, i22=-9, i23=-6;
        short s=20332;
        float f2=-2.366F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)31);

        i -= (--s);
        for (i1 = 8; i1 < 186; i1++) {
            lMeth(f2);
            for (i19 = 9; 1 < i19; i19--) {
                switch ((i1 % 8) + 98) {
                case 98:
                case 99:
                    i = i;
                    i2 -= i1;
                    i -= (int)Test.instanceCount;
                case 100:
                    i2 ^= i1;
                    for (i21 = 1; i21 < 2; ++i21) {
                        if (true) continue;
                    }
                    Test.instanceCount += (-42719 + (i19 * i19));
                    i20 -= (int)Test.instanceCount;
                case 101:
                case 102:
                    byArr[i19] &= (byte)Test.instanceCount;
                    i20 += (i19 + Test.instanceCount);
                    break;
                case 103:
                    l -= i20;
                case 104:
                    i = i2;
                case 105:
                    Test.dFld = i23;
                    break;
                default:
                    i22 -= (int)Test.dFld;
                }
            }
        }
        vMeth_check_sum += l + i + s + i1 + i2 + Float.floatToIntBits(f2) + i19 + i20 + i21 + i22 + i23 +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        double d=-24.105309;
        int i24=-185, i25=13, i26=5, i27=-8, i28=-10, i29=-12, i30=5, i31=-66, i32=205, i33=-33738, i34=20003;
        byte by=-57;
        float f3=-38.268F, fArr[]=new float[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 58154L);
        FuzzerUtils.init(fArr, 1.535F);

        d -= (((iFld * Test.instanceCount) * iArrFld[(iFld >>> 1) % N]) * Math.max((int)(-(Test.instanceCount * iFld)),
            iFld));
        vMeth(Test.instanceCount);
        for (i24 = 14; 320 > i24; ++i24) {
            Test.instanceCount += i24;
            Test.instanceCount += 221;
            iFld += (int)Test.fFld;
            for (i26 = 2; i26 < 82; ++i26) {
                iFld = i25;
                by += (byte)(((i26 * i26) + i25) - Test.instanceCount);
                i25 = Test.sFld;
                lArr1[i24 - 1] += 56048;
                i27 *= (int)Test.instanceCount;
                for (i28 = 1; i28 < 2; i28++) {
                    i27 += i28;
                    i29 = i29;
                }
            }
            bFld = bFld;
        }
        for (f3 = 3; f3 < 321; f3++) {
            i29 = 195;
            fArr[(int)(f3 + 1)] = -242;
            Test.sFld >>= (short)i28;
            for (i31 = 1; i31 < 79; ++i31) {
                for (i33 = 1; 2 > i33; i33++) {
                    Test.instanceCount += i33;
                    lArr1[i33] += 5L;
                    i30 = (int)Test.instanceCount;
                    iFld = (int)-127.150F;
                }
                i25 = (int)lFld;
                Test.fFld = i32;
                i29 = (int)-183L;
                i30 %= (int)(i34 | 1);
            }
        }

        FuzzerUtils.out.println("d i24 i25 = " + Double.doubleToLongBits(d) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 by = " + i26 + "," + i27 + "," + by);
        FuzzerUtils.out.println("i28 i29 f3 = " + i28 + "," + i29 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("i33 i34 lArr1 = " + i33 + "," + i34 + "," + FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld Test.sFld bFld = " + Float.floatToIntBits(Test.fFld) + "," + Test.sFld + ","
            + (bFld ? 1 : 0));
        FuzzerUtils.out.println("lFld iArrFld Test.iArrFld1 = " + lFld + "," + FuzzerUtils.checkSum(iArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld1));

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
