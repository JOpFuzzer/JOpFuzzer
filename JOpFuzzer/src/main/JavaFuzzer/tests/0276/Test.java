// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:47 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static volatile float fFld=73.524F;
    public static int iFld=12;
    public static int iFld1=175;
    public static long lFld=639842114902797377L;
    public static boolean bFld=true;
    public short sArrFld[]=new short[N];

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        boolean b=false;
        int i4=-177, i5=-47256, i6=30512, i7=11, i8=-62156, iArr[]=new int[N];
        double d=-2.98070;
        long l=237L;

        FuzzerUtils.init(iArr, 44);

        b = false;
        Test.fFld -= Test.iFld;
        for (i4 = 6; i4 < 185; i4++) {
            switch (((251 >>> 1) % 1) + 114) {
            case 114:
                d = Test.iFld1;
                if (b) continue;
                break;
            }
            for (l = 1; l < 9; ++l) {
                i6 += (int)(((l * Test.lFld) + Test.instanceCount) - Test.iFld1);
                Test.iFld *= 2;
                Test.instanceCount += (l - Test.iFld);
                Test.iFld += (int)l;
                for (i7 = 2; i7 > 1; i7 -= 3) {
                    Test.iFld = (int)d;
                    iArr[i7 - 1] = (int)Test.fFld;
                    i6 += (i7 * i7);
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i4 + i5 + Double.doubleToLongBits(d) + l + i6 + i7 + i8 +
            FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth() {

        double d1=2.114753;
        int i9=10, i10=6, i11=-42, i12=-198, i13=17082, i14=14, i15=-201;
        byte by=28;
        long l1=-38199L, lArr[]=new long[N];
        short s=22275;

        FuzzerUtils.init(lArr, 1L);

        vMeth();
        Test.iFld1 <<= Test.iFld1;
        Test.fFld += Test.iFld1;
        d1 -= Test.fFld;
        for (i9 = 163; i9 > 10; --i9) {
            lArr[i9] = Test.instanceCount;
        }
        by >>= (byte)Test.instanceCount;
        for (l1 = 146; l1 > 6; l1--) {
            Test.iFld -= (int)l1;
            i10 = Test.iFld1;
            lArr[(int)(l1 + 1)] -= i9;
            for (i12 = 1; i12 < 11; ++i12) {
                for (i14 = 2; i14 > l1; i14 -= 2) {
                    s += (short)50594;
                    Test.lFld += (((i14 * Test.iFld1) + i14) - Test.lFld);
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i9 + i10 + by + l1 + i11 + i12 + i13 + i14 + i15 + s +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public double dMeth(int i2, int i3) {

        int i16=0, i17=-15610, i18=11, i19=4, i20=86, i21=-8, iArr1[][]=new int[N][N];

        FuzzerUtils.init(iArr1, -37385);

        Test.instanceCount >>= (iMeth() + i3);
        Test.lFld -= (long)Test.fFld;
        for (i16 = 6; 149 > i16; i16 += 3) {
            Test.lFld = i16;
            sArrFld[i16 - 1] >>= (short)i17;
            if (Test.bFld) break;
            for (i18 = 1; i18 < 32; ++i18) {
                for (i20 = 1; i20 < 2; i20++) {
                    i19 += (((i20 * Test.fFld) + i16) - i18);
                    Test.iFld1 ^= i19;
                    i21 += i3;
                    i19 = -12;
                    Test.lFld += (i20 * i2);
                    iArr1[i18][i16 + 1] = (int)Test.lFld;
                    i19 *= (int)1.205F;
                }
            }
        }
        long meth_res = i2 + i3 + i16 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-238, i1=-45, i22=251, i23=2, i24=-11927, iArr2[][]=new int[N][N];
        long l2=26516L;
        double d2=42.114873;
        byte by1=40;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr2, 42390);
        FuzzerUtils.init(bArr, true);

        for (i = 15; i < 343; i++) {
            i1 = i1;
            if (dMeth(i1, Test.iFld1) != i22) break;
            i22 += i;
            i22 -= i22;
            l2 = 1;
            do {
                for (d2 = l2; d2 < 1; ++d2) {
                    if (Test.bFld) break;
                    Test.iFld1 += (int)((long)d2 | Test.iFld1);
                    iArr2 = iArr2;
                    switch ((int)((d2 % 10) + 125)) {
                    case 125:
                        Test.iFld = i1;
                    case 126:
                        by1 += (byte)(d2 + i23);
                        break;
                    case 127:
                        Test.iFld1 -= (int)-22503L;
                        switch ((int)((l2 % 7) + 24)) {
                        case 24:
                            Test.instanceCount += (-49847L + (d2 * d2));
                            break;
                        case 25:
                            iArr2[i + 1][i] = i;
                            i1 = Test.iFld1;
                            break;
                        case 26:
                            Test.instanceCount %= (i22 | 1);
                            Test.lFld -= by1;
                        case 27:
                        case 28:
                        case 29:
                            Test.fFld -= -192;
                            bArr[(int)(d2)] = Test.bFld;
                        case 30:
                            i1 = (int)Test.instanceCount;
                            if (Test.bFld) continue;
                            i23 <<= (int)Test.instanceCount;
                        }
                        try {
                            i1 = (i1 % -1301102537);
                            i22 = (Test.iFld1 / Test.iFld);
                            iArr2[(int)(l2 + 1)][(int)(d2)] = (i1 % 100);
                        } catch (ArithmeticException a_e) {}
                        i22 = -21;
                        break;
                    case 128:
                    case 129:
                        Test.instanceCount <<= i1;
                        break;
                    case 130:
                        by1 = (byte)Test.instanceCount;
                        break;
                    case 131:
                    case 132:
                        Test.fFld += (float)(((d2 * i23) + i24) - i1);
                        break;
                    case 133:
                        iArr2[(int)(d2)][(int)(l2 + 1)] = i24;
                    case 134:
                        i22 += (int)(d2 * Test.lFld);
                        break;
                    }
                }
            } while (++l2 < 77);
        }

        FuzzerUtils.out.println("i i1 i22 = " + i + "," + i1 + "," + i22);
        FuzzerUtils.out.println("l2 d2 i23 = " + l2 + "," + Double.doubleToLongBits(d2) + "," + i23);
        FuzzerUtils.out.println("by1 i24 iArr2 = " + by1 + "," + i24 + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.iFld1 Test.lFld Test.bFld = " + Test.iFld1 + "," + Test.lFld + "," + (Test.bFld ?
            1 : 0));
        FuzzerUtils.out.println("sArrFld = " + FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
