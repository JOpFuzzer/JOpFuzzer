// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:54 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=7711281284848086724L;
    public int iFld=-39611;
    public static double dFld=84.28235;
    public long lArrFld[]=new long[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-49);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i=-49, i1=3769, i2=63394, i3=-43536, i4=-8, i5=-8, i6=14, iArr[][]=new int[N][N];
        double d=0.122089;
        boolean b=false;

        FuzzerUtils.init(iArr, 6);

        for (i = 5; i < 373; i += 2) {
            Test.instanceCount += i;
            if (false) {
                i2 += (int)d;
            } else {
                for (i3 = 1; i3 < 9; i3++) {
                    for (i5 = 1; i5 < 2; i5++) {
                        byte by=84;
                        i2 = i5;
                        if (b) break;
                        i6 += (-247 + (i5 * i5));
                        i6 -= (int)6.927F;
                        iArr[i3][i] -= i;
                        by += (byte)(6 + (i5 * i5));
                    }
                    Test.byArrFld[i3 - 1] *= (byte)i;
                    if (i5 != 0) {
                        vMeth1_check_sum += i + i1 + i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + (b ? 1 : 0)
                            + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    try {
                        i4 = (i5 / 1043418533);
                        i1 = (i1 / -1300175738);
                        iArr[i3][i] = (-36627 % i1);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        vMeth1_check_sum += i + i1 + i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(short s) {

        int i7=-7, i8=781, i9=-7, i10=-55727, i11=-27733, i12=-42067, iArr1[]=new int[N];
        float f1=1.817F, f2=-48.289F;

        FuzzerUtils.init(iArr1, -13);

        vMeth1();
        for (i7 = 13; i7 < 354; ++i7) {
            if (i7 != 0) {
                vMeth_check_sum += s + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i11 +
                    i12 + FuzzerUtils.checkSum(iArr1);
                return;
            }
            for (i9 = 1; 5 > i9; i9++) {
                i10 /= (int)((long)(f1) | 1);
                Test.dFld -= f2;
            }
            iArr1[i7 + 1] = i7;
            i8 = s;
            switch (((i7 % 9) * 5) + 97) {
            case 116:
                Test.instanceCount = i9;
                i10 >>>= i10;
                break;
            case 105:
                i8 += (i7 * i7);
                for (i11 = 5; i11 > 1; --i11) {
                    i10 = i12;
                    i12 += 0;
                }
                break;
            case 100:
            case 129:
                Test.dFld = Test.instanceCount;
                break;
            case 139:
                Test.dFld += i10;
                break;
            case 142:
                Test.instanceCount += (long)1.135F;
                break;
            case 136:
            case 104:
                Test.instanceCount += (i7 * i7);
                break;
            case 119:
                i12 += (i7 - i7);
                break;
            }
        }
        vMeth_check_sum += s + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i11 + i12 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(float f) {

        int i13=-188, i14=-8, i15=-205, i16=45300, i17=14, iArr2[]=new int[N], iArr3[]=new int[N];
        byte by1=-98;
        boolean b1=true;

        FuzzerUtils.init(iArr2, 33326);
        FuzzerUtils.init(iArr3, 45558);

        vMeth((short)(4534));
        i13 = i13;
        i13 -= i13;
        Test.instanceCount -= Test.instanceCount;
        i13 *= (int)Test.instanceCount;
        Test.instanceCount <<= i13;
        for (i14 = 9; 210 > i14; ++i14) {
            i15 += i14;
            i13 *= i15;
            for (i16 = 1; i16 < 8; i16++) {
                iArr2[i14 + 1] >>>= (int)Test.instanceCount;
                if (b1) {
                    i15 += (int)f;
                    i15 += by1;
                    iArr2 = iArr3;
                } else if (true) {
                    i15 += by1;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i13 + i14 + i15 + i16 + i17 + by1 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(iArr3);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f3=0.233F;
        byte by2=-25;
        int i18=-41958, i19=14, i20=75, i21=40, i22=-9, i23=3, i24=-28191, i25=-27943, i26=29419, i27=-233, i28=-11;
        short s1=19345, sArr[]=new short[N];
        boolean b2=false;

        FuzzerUtils.init(sArr, (short)11658);

        lArrFld[(iFld >>> 1) % N] -= (iMeth(f3) * by2);
        for (i18 = 12; 235 > i18; i18++) {
            for (i20 = 1; i20 < 113; i20++) {
                iFld -= i19;
                i19 *= i19;
                i19 += (i20 * i20);
                for (i22 = 1; i22 < 2; ++i22) {
                    iFld = i20;
                    iFld -= iFld;
                    i21 = (int)109.74900;
                }
                for (i24 = i20; i24 < 2; ++i24) {
                    i23 = i25;
                    s1 += (short)i22;
                    i25 -= (int)-2.72F;
                    sArr[i18] = (short)i21;
                    i19 += -47;
                }
            }
            for (i26 = 113; i26 > 5; i26--) {
                i28 = 1;
                do {
                    Test.instanceCount += by2;
                    switch (((i21 >>> 1) % 5) + 49) {
                    case 49:
                        i23 <<= -77;
                        Test.instanceCount += i28;
                        break;
                    case 50:
                        b2 = b2;
                        i21 >>= 2;
                        iFld &= s1;
                        iFld = (int)f3;
                        break;
                    case 51:
                        i19 += (i28 ^ i28);
                        f3 += i24;
                        i21 = 39;
                    case 52:
                        i21 += i28;
                        break;
                    case 53:
                        f3 -= i18;
                        break;
                    }
                } while (++i28 < 2);
            }
        }

        FuzzerUtils.out.println("f3 by2 i18 = " + Float.floatToIntBits(f3) + "," + by2 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 s1 i26 = " + i25 + "," + s1 + "," + i26);
        FuzzerUtils.out.println("i27 i28 b2 = " + i27 + "," + i28 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("lArrFld Test.byArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
            FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
