// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:46 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=6354850758062769002L;
    public int iFld=9;
    public float fFld=1.735F;
    public double dFld=2.7434;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -831233232953414366L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i7=10, i8=-8, i9=6189, i10=-3, iArr2[]=new int[N];
        double d1=-17.46036;
        float f=-72.100F;
        short s1=-17368;

        FuzzerUtils.init(iArr2, -242);

        i7 = 1;
        while (++i7 < 395) {
            switch (((i7 % 8) * 5) + 4) {
            case 19:
                Test.instanceCount <<= 98;
                break;
            case 25:
                if (i7 != 0) {
                    vMeth2_check_sum += i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + s1
                        + FuzzerUtils.checkSum(iArr2);
                    return;
                }
                try {
                    i8 = (i7 % -101);
                    i8 = (i8 / 8);
                    i8 = (681330638 / i7);
                } catch (ArithmeticException a_e) {}
                i8 += i7;
                Test.instanceCount *= i8;
                break;
            case 7:
                i8 |= (int)-26449L;
                i8 = -15607;
            case 35:
                i9 >>>= (int)89L;
                i9 <<= 4005;
                break;
            case 27:
                i10 = 1;
                while (++i10 < 4) {
                    i8 += i8;
                    d1 *= 28196;
                    f = Test.instanceCount;
                }
                break;
            case 42:
                iArr2[i7] *= i9;
                break;
            case 32:
                s1 += (short)(32 + (i7 * i7));
                break;
            case 28:
                Test.instanceCount += i7;
                break;
            }
        }
        vMeth2_check_sum += i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + s1 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth1(int i5, int i6) {

        double d=120.41262;
        int i11=5, i12=-21732, iArr1[]=new int[N];
        float f1=54.361F;
        boolean b1=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr1, 45254);
        FuzzerUtils.init(sArr, (short)8848);

        if (false) {
            i6 *= (int)(--d);
            iArr1 = (iArr1 = iArr1);
            vMeth2();
        } else {
            i6 -= 57552;
            sArr[(i5 >>> 1) % N] = (short)i5;
            i5 = i6;
            iArr1[(i6 >>> 1) % N] *= i6;
        }
        if (true) {
            i5 = (int)Test.instanceCount;
        } else if (b1) {
            for (i11 = 216; i11 > 12; --i11) {
                f1 = i12;
                f1 = i12;
                Test.instanceCount = i6;
            }
            i5 <<= (int)Test.instanceCount;
        } else if (b1) {
            i6 = i6;
        }
        vMeth1_check_sum += i5 + i6 + Double.doubleToLongBits(d) + i11 + i12 + Float.floatToIntBits(f1) + (b1 ? 1 : 0)
            + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(short s, int i) {

        int i1=90, i2=-13, i3=-14, i4=19, i13=2955, i14=3, i15=-8, i16=81, iArr[]=new int[N];
        double d2=-1.3438;
        boolean b2=false;

        FuzzerUtils.init(iArr, 56);

        for (i1 = 14; i1 < 254; i1++) {
            iArr[i1] >>>= (int)(i1 - (i -= (int)7843200689298618882L));
        }
        for (i3 = 9; i3 < 223; i3++) {
            vMeth1(i, i);
            Test.lArrFld = Test.lArrFld;
            for (i13 = 8; i13 > 1; i13--) {
                iArr[i13 + 1] -= (int)Test.instanceCount;
                iArr[i13 - 1] += i2;
                for (d2 = 2; d2 > i3; --d2) {
                    if (b2) {
                        i4 = (int)d2;
                        i4 = -110;
                        vMeth_check_sum += s + i + i1 + i2 + i3 + i4 + i13 + i14 + Double.doubleToLongBits(d2) + i15 +
                            i16 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
                        return;
                    } else if (b2) {
                        i15 -= i13;
                        i14 += s;
                        try {
                            i2 = (i16 / 24410);
                            i2 = (i3 / -163);
                            i15 = (i % -1247);
                        } catch (ArithmeticException a_e) {}
                    }
                }
            }
        }
        vMeth_check_sum += s + i + i1 + i2 + i3 + i4 + i13 + i14 + Double.doubleToLongBits(d2) + i15 + i16 + (b2 ? 1 :
            0) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        boolean b=false, b3=true;
        int i17=-19952, i18=12, i19=-7, i20=-2316, i21=175, i22=168, i23=-30868, i24=163, iArr3[]=new int[N];
        short s2=9163;

        FuzzerUtils.init(iArr3, 12280);

        b = b;
        vMeth((short)(-1479), iFld);
        iFld -= (int)fFld;
        iFld <<= iFld;
        for (long l : Test.lArrFld) {
            for (i17 = 1; i17 < 63; i17++) {
                i18 += i17;
                fFld += s2;
            }
        }
        for (i19 = 6; i19 < 318; i19++) {
            byte by=-85;
            by = (byte)i19;
            dFld = i18;
            if (b3) {
                dFld = i17;
                if (b) continue;
                for (i21 = 4; i21 < 81; i21++) {
                    by += (byte)(33428L + (i21 * i21));
                    iFld = (int)12823L;
                    i20 = i17;
                    i22 |= (int)Test.instanceCount;
                    for (i23 = 1; i23 < 2; ++i23) {
                        iArr3[i19] = (int)-4L;
                        switch ((i21 % 1) + 97) {
                        case 97:
                            if (b) break;
                            break;
                        default:
                            b = b;
                            iFld = s2;
                            Test.instanceCount = Test.instanceCount;
                            i24 += (-49180 + (i23 * i23));
                        }
                        Test.instanceCount += (((i23 * i24) + s2) - i17);
                        fFld += (i23 - by);
                        iFld += i23;
                    }
                }
            } else if (b) {
                Test.lArrFld[i19 + 1] = -58743;
            } else if (b) {
                if (false) break;
            }
        }

        FuzzerUtils.out.println("b i17 i18 = " + (b ? 1 : 0) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("s2 i19 i20 = " + s2 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 b3 iArr3 = " + i24 + "," + (b3 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount iFld fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("dFld Test.lArrFld = " + Double.doubleToLongBits(dFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

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