// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:44 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=4075927770544185288L;
    public volatile boolean bFld=false;
    public int iFld=204;
    public short sFld=-13445;
    public byte byFld=-110;
    public float fArrFld[]=new float[N];
    public short sArrFld[]=new short[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public int iMeth(long l) {

        int i10=-4, i11=53836, i12=182, i13=-6730, i14=2564, i15=-35545, iArr1[][]=new int[N][N];
        float f1=0.808F;

        FuzzerUtils.init(iArr1, -9);

        for (i10 = 4; i10 < 313; i10 += 3) {
            i11 += (int)l;
            for (i12 = 15; i12 > 1; i12--) {
                Test.instanceCount = i13;
                iFld = (int)Test.instanceCount;
                iFld += (i12 | iFld);
                if (bFld) break;
                iArr1[i12][i12 - 1] += iFld;
                for (i14 = 1; i14 < 2; i14++) {
                    i11 += (i14 ^ l);
                    Test.instanceCount = Test.instanceCount;
                    sFld -= (short)f1;
                    sFld += (short)1.904F;
                    iArr1[i12][i14] += -1;
                    i11 = (int)Test.instanceCount;
                }
            }
        }
        long meth_res = l + i10 + i11 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth1(int i6, int i7) {

        int i8=44726, i9=11, i16=12, i17=72, i18=232, i19=-47584, i20=12;
        long l1=4699010484920085711L, lArr[]=new long[N];
        double d2=2.80474;

        FuzzerUtils.init(lArr, -144095635178527479L);

        bFld = bFld;
        for (i8 = 10; i8 < 282; ++i8) {
            i7 >>= iMeth(-4L);
        }
        for (i16 = 4; i16 < 235; i16++) {
            lArr[i16 + 1] %= (iFld | 1);
            i17 -= (int)Test.instanceCount;
            Test.instanceCount += byFld;
            i17 = i9;
            for (l1 = 1; 7 > l1; ++l1) {
                i18 = i18;
                for (i19 = (int)(l1); i19 < 2; i19++) {
                    switch ((i19 % 4) + 79) {
                    case 79:
                    case 80:
                        d2 = -60883;
                        i18 = i8;
                        Test.instanceCount &= byFld;
                        break;
                    case 81:
                        iFld = i8;
                        break;
                    case 82:
                        lArr[i19 + 1] |= l1;
                        break;
                    default:
                        i18 = i17;
                    }
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + i16 + i17 + l1 + i18 + i19 + i20 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(int i, double d, float f) {

        int i1=234, i2=-8, i3=-10, i4=-10, i5=43, i21=1762, i22=-161, iArr[]=new int[N];
        double d1=79.45825;
        byte by=-118;

        FuzzerUtils.init(iArr, -5);

        i -= (int)((Math.max(Test.instanceCount, Test.instanceCount) * (Test.instanceCount + i)) * f);
        for (i1 = 3; i1 < 362; i1 += 3) {
            for (i3 = 13; 1 < i3; i3--) {
                for (d1 = i1; d1 < 2; d1++) {
                    f += (float)(((d1 * f) + i3) - i);
                    try {
                        i5 = (i3 / -583764273);
                        i = (-224 / i5);
                        i = (i1 / 79106910);
                    } catch (ArithmeticException a_e) {}
                    if (i1 != 0) {
                        vMeth_check_sum += i + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i1 + i2 + i3 + i4
                            + Double.doubleToLongBits(d1) + i5 + by + i21 + i22 + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    i4 -= (int)(((++by) - (i1 - 109.942F)) * ((i5 + Test.instanceCount) + (i * Test.instanceCount)));
                    if (i3 >= (((i1 - Test.instanceCount) * iArr[(int)(d1 - 1)]) - ((0.655F * (-(i2 *= i2))) * (f +
                        f)))) continue;
                }
            }
        }
        vMeth1(i3, i3);
        iArr[(i3 >>> 1) % N] = i3;
        d = i;
        for (i21 = 4; i21 < 192; i21++) {
            d /= 5;
            fArrFld[i21] += (float)d;
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i1 + i2 + i3 + i4 +
            Double.doubleToLongBits(d1) + i5 + by + i21 + i22 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        double d3=2.105286;
        float f2=-76.762F;
        int i23=-2, i24=0, i25=5, i26=5, i27=-11, i28=-1, i29=-11, i30=-4, i31=9, i32=-17, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 129);

        if (bFld) {
            vMeth(51, d3, f2);
            f2 += iFld;
        } else if (bFld) {
            for (i23 = 15; i23 < 265; i23++) {
                iArr2[i23 - 1] = i24;
            }
            for (i25 = 198; 4 < i25; --i25) {
                for (i27 = 3; 129 > i27; ++i27) {
                    Test.instanceCount = i28;
                    i26 = i28;
                    for (i29 = 1; i29 < 2; ++i29) {
                        iArr2[i27 + 1] <<= i27;
                        iFld += (int)f2;
                        i30 &= (int)Test.instanceCount;
                    }
                    if (bFld) {
                        if (bFld) {
                            f2 -= byFld;
                            i26 -= i25;
                            iFld = i30;
                        } else {
                            for (i31 = 1; i31 < 2; ++i31) {
                                iArr2[i25] -= i32;
                                i24 = i28;
                                if (bFld) continue;
                                if (bFld) {
                                    if (bFld) continue;
                                    i30 *= i30;
                                } else if (true) {
                                    iFld = i32;
                                } else {
                                    sArrFld[i27] = (short)i28;
                                    byFld = (byte)13279;
                                    i32 -= (int)-2L;
                                    i26 = (int)d3;
                                }
                            }
                        }
                    } else {
                        i30 = (int)f2;
                    }
                }
            }
        }

        FuzzerUtils.out.println("d3 f2 i23 = " + Double.doubleToLongBits(d3) + "," + Float.floatToIntBits(f2) + "," +
            i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount bFld iFld = " + Test.instanceCount + "," + (bFld ? 1 : 0) + "," +
            iFld);
        FuzzerUtils.out.println("sFld byFld fArrFld = " + sFld + "," + byFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("sArrFld = " + FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
