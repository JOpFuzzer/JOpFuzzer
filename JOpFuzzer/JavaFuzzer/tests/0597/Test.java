// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:54 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=92L;
    public float fFld=2.213F;
    public static double dFld=-27.50474;
    public static float fFld1=-2.863F;
    public static int iFld=9;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 4);
    }

    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i1) {

        int i2=169, i3=187, i4=-237, i5=11, i6=-9, i7=3, iArr[]=new int[N];
        double d=0.76108;
        boolean b=true;
        byte by1=101;
        short sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(sArr, (short)4080);
        FuzzerUtils.init(lArr, 9L);
        FuzzerUtils.init(iArr, 226);

        for (i2 = 14; i2 < 364; i2++) {
            i1 += 84;
            sArr[i2 + 1] -= (short)i2;
            for (i4 = 1; i4 < 5; i4++) {
                for (i6 = 1; i6 < 2; i6++) {
                    i5 -= (int)d;
                    if (b) continue;
                    lArr = lArr;
                    by1 = (byte)-1.3548;
                    i5 -= (int)d;
                    i3 >>= (int)Test.instanceCount;
                    iArr[i2 - 1] <<= (int)Test.instanceCount;
                    if (b) continue;
                    iArr[i4 + 1] = by1;
                }
                i7 -= (int)-161L;
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + (b ? 1 : 0) + by1 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i, byte by, long l1) {

        float f=113.575F;

        i = i;
        vMeth(i);
        f = 142;
        do {
            l1 -= i;
            if (true) continue;
            Test.iArrFld[(int)(f + 1)] = (int)f;
            i += i;
            Test.dFld = l1;
            l1 >>>= l1;
        } while (--f > 0);
        long meth_res = i + by + l1 + Float.floatToIntBits(f);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth(long l) {

        byte by2=1;
        int i8=-5, i9=5, i10=-200, i11=-5, i12=-56096;
        long l2=-2938L;
        short s=6487;
        boolean b1=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.69775);

        Test.instanceCount = ((iMeth(2066, by2, l) + l) + i8);
        for (l2 = 3; l2 < 241; l2 += 3) {
            if (true) {
                for (i10 = 19; i10 > l2; --i10) {
                    s += (short)i8;
                    Test.iArrFld[(int)(l2 + 1)] = (int)l;
                    dArr[i10 + 1] += l;
                    if (i8 != 0) {
                    }
                    i12 = 1;
                    do {
                        i9 += (201 + (i12 * i12));
                        switch ((i10 % 5) + 79) {
                        case 79:
                            if (true) continue;
                            Test.dFld *= i12;
                            if (b1) continue;
                            break;
                        case 80:
                            l += (long)Test.fFld1;
                            break;
                        case 81:
                            Test.iArrFld[i12] = 12036;
                        case 82:
                            Test.instanceCount = -74;
                            break;
                        case 83:
                            i11 += Test.iFld;
                        }
                    } while (++i12 < 1);
                }
            } else {
                by2 = (byte)Test.dFld;
            }
        }
        long meth_res = l + by2 + i8 + l2 + i9 + i10 + i11 + s + i12 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by3=115;
        int i13=-147, i14=-163, i15=-12, i16=-4676, i17=6, i18=-14, i19=49294;
        boolean b2=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 85L);

        fFld = (((-fMeth(-3041348104L)) - by3) + Test.iFld);
        Test.iArrFld[(8 >>> 1) % N] += -4;
        Test.instanceCount -= -9L;
        for (i13 = 397; i13 > 17; --i13) {
            for (i15 = i13; i15 < 66; i15++) {
                i14 <<= Test.iFld;
                lArr1 = lArr1;
                Test.iArrFld[i13] += Test.iFld;
                lArr1[i15] >>= i14;
                i16 <<= i15;
                for (i17 = 1; i17 < 1; i17++) {
                    switch (((i17 % 5) * 5) + 96) {
                    case 117:
                        Test.instanceCount += (i17 * i17);
                        Test.instanceCount -= i13;
                        Test.iFld &= i16;
                        Test.iArrFld[i13] = i17;
                    case 110:
                        Test.iFld += (i17 | i18);
                        Test.instanceCount += i13;
                    case 112:
                        Test.instanceCount += (9L + (i17 * i17));
                        i18 += 195;
                        Test.dFld -= Test.instanceCount;
                        Test.iFld += (((i17 * Test.iFld) + Test.instanceCount) - Test.instanceCount);
                    case 115:
                        lArr1[i13 + 1] += Test.instanceCount;
                        Test.iFld = -69;
                        if (b2) break;
                    case 99:
                        switch (((i18 >>> 1) % 3) + 96) {
                        case 96:
                            lArr1[i15 + 1] |= i15;
                            break;
                        case 97:
                            lArr1[i15 + 1] = i19;
                            i14 = (int)Test.fFld1;
                        case 98:
                            i16 -= (int)Test.instanceCount;
                        }
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("by3 i13 i14 = " + by3 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 b2 i19 = " + i18 + "," + (b2 ? 1 : 0) + "," + i19);
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld1 Test.iFld Test.iArrFld = " + Float.floatToIntBits(Test.fFld1) + "," +
            Test.iFld + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}