// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:55 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1778336719L;
    public volatile int iFld=-10;
    public static int iFld1=6;
    public static short sFld=31451;
    public static int iFld2=18133;
    public static float fFld=9.818F;
    public static boolean bFld=true;
    public static int iArrFld[][]=new int[N][N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -9);
        FuzzerUtils.init(Test.fArrFld, 71.115F);
    }

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l) {

        int i2=44452, i3=33, i4=-42429, i5=0, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 162);

        for (i2 = 7; i2 < 201; i2++) {
            switch ((i2 % 2) + 11) {
            case 11:
                Test.iFld1 -= i2;
                if (i3 != 0) {
                    vMeth_check_sum += l + i2 + i3 + i4 + i5 + FuzzerUtils.checkSum(iArr);
                    return;
                }
                Test.iFld1 += i2;
                iArr[i2 - 1] -= (int)Test.instanceCount;
                break;
            case 12:
                i3 *= 13;
                i3 = 13;
                i3 = Test.iFld1;
                break;
            }
            if (false) break;
            i3 -= i2;
            i3 |= i3;
            for (i4 = 1; i4 < 8; i4++) {
                i5 = i5;
                l <<= i5;
            }
        }
        vMeth_check_sum += l + i2 + i3 + i4 + i5 + FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth() {

        byte by=4;
        int i6=-11, i7=-4, i8=59, i9=-47914, i10=50942;
        long l1=13L;
        boolean b=false;
        short s=-24177;

        Test.iFld1 = (int)Test.instanceCount;
        switch (((Test.iArrFld[(Test.iFld1 >>> 1) % N][(Test.iFld1 >>> 1) % N] >>> 1) % 8) + 4) {
        case 4:
            vMeth(Test.instanceCount);
            Test.iFld1 <<= Test.iFld1;
            Test.iArrFld[(Test.iFld1 >>> 1) % N][(Test.iFld1 >>> 1) % N] &= (int)Test.instanceCount;
            Test.iFld1 += by;
            break;
        case 5:
            if (b) {
                i6 = 1;
                while (++i6 < 336) {
                    for (i7 = 1; i7 < 5; ++i7) {
                        Test.fArrFld[i6 + 1] *= l1;
                        Test.iFld1 = i8;
                        Test.iArrFld[i7 - 1][i6] <<= (int)Test.instanceCount;
                        for (i9 = 1; i9 < 2; i9++) {
                            l1 = Test.iFld1;
                        }
                        i10 = Test.iFld1;
                    }
                }
            } else if (false) {
                i8 -= i6;
            }
            break;
        case 6:
            l1 = by;
            break;
        case 7:
            Test.iArrFld = Test.iArrFld;
            break;
        case 8:
            i8 = by;
            break;
        case 9:
            Test.iArrFld[(Test.iFld1 >>> 1) % N][(60595 >>> 1) % N] -= i7;
        case 10:
            Test.iFld1 &= 39523;
            break;
        case 11:
            i10 += s;
            break;
        }
        long meth_res = by + i6 + i7 + i8 + l1 + i9 + i10 + (b ? 1 : 0) + s;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public int iMeth() {

        int i=8, i1=4, i11=201, i12=254, i13=-65494, i14=217;
        long l2=8712604053983474175L;
        byte by1=30;
        float f=-1.419F;

        Test.instanceCount = Math.max(Test.instanceCount--, Test.instanceCount *= (iFld * -13935L));
        for (i = 4; i < 184; i++) {
            i1 *= (int)fMeth();
            l2 = 1;
            do {
                Test.instanceCount = by1;
                Test.fArrFld[(int)(l2 - 1)] += l2;
                f *= Test.instanceCount;
                iFld += (int)(l2 * l2);
            } while (++l2 < 9);
        }
        for (i11 = 125; i11 > 5; i11--) {
            for (i13 = 1; i13 < 13; ++i13) {
                Test.iFld1 -= i14;
                i12 += i13;
                if (i11 != 0) {
                }
                i14 *= (int)l2;
                iFld -= -49778;
            }
        }
        long meth_res = i + i1 + l2 + by1 + Float.floatToIntBits(f) + i11 + i12 + i13 + i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i15=13436, i16=3980, i17=42408, i18=-1, i19=-51990, i20=-31497;
        long l4=36122L, lArr[]=new long[N];
        byte by2=90;
        boolean b1=false;
        double d=1.84105;

        FuzzerUtils.init(lArr, 3566837428L);

        if (Test.bFld) {
        } else if (false) {
            iMeth();
            for (long l3 : lArr) {
                l3 |= Test.iFld1;
                iFld -= -1514;
                lArr[(Test.iFld1 >>> 1) % N] = Test.iFld1;
                Test.sFld = (short)Test.iFld1;
            }
            Test.iFld1 += (int)Test.instanceCount;
        } else if (Test.bFld) {
            for (i15 = 338; i15 > 20; i15 -= 2) {
                Test.iArrFld[i15 - 1][i15] -= Test.iFld2;
                l4 = 1;
                while (++l4 < 158) {
                    for (i17 = 1; i17 < 1; ++i17) {
                        Test.iFld2 <<= Test.iFld1;
                        Test.iArrFld[i15 + 1][i15] ^= Test.iFld2;
                        by2 <<= (byte)i17;
                        Test.instanceCount += i16;
                        Test.fFld += i17;
                        b1 = b1;
                        i16 = i16;
                        lArr[i17 + 1] = by2;
                        if (false) {
                            Test.iArrFld[i17] = Test.iArrFld[i15];
                        } else if (b1) {
                        } else {
                            iFld += (i17 * i18);
                        }
                        i18 += (int)55.208F;
                    }
                }
                Test.iFld2 -= (int)d;
                if (b1) break;
                for (i19 = 4; i19 < 158; ++i19) {
                    i20 += (i19 - i18);
                    Test.iFld2 %= (int)(Test.iFld2 | 1);
                    Test.iFld2 = Test.iFld1;
                }
            }
        }

        FuzzerUtils.out.println("i15 i16 l4 = " + i15 + "," + i16 + "," + l4);
        FuzzerUtils.out.println("i17 i18 by2 = " + i17 + "," + i18 + "," + by2);
        FuzzerUtils.out.println("b1 d i19 = " + (b1 ? 1 : 0) + "," + Double.doubleToLongBits(d) + "," + i19);
        FuzzerUtils.out.println("i20 lArr = " + i20 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.iFld1 = " + Test.instanceCount + "," + iFld + "," +
            Test.iFld1);
        FuzzerUtils.out.println("Test.sFld Test.iFld2 Test.fFld = " + Test.sFld + "," + Test.iFld2 + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld Test.iArrFld Test.fArrFld = " + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
