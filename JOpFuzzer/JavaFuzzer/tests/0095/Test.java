// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=4631444698920999103L;
    public static float fFld=-1.987F;
    public static boolean bFld=false;
    public static float fFld1=95.141F;
    public static double dFld=-106.120513;
    public static short sFld=-2936;
    public static long lFld=459598382L;

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l3, int i13) {

        int i14=7, i15=1, i16=-44871, i17=8, i18=9104, i19=-50064;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -114.390F);

        for (i14 = 8; i14 < 129; ++i14) {
            for (i16 = 1; 13 > i16; ++i16) {
                for (i18 = 1; i18 < 2; ++i18) {
                    Test.bFld = Test.bFld;
                    fArr[i16 + 1] = i17;
                    i17 += (((i18 * i14) + i13) - Test.fFld);
                    Test.fFld = i14;
                    Test.fFld += ((long)i18 ^ (long)i18);
                    i15 += (i18 - i19);
                    if (Test.bFld) break;
                    Test.instanceCount = i14;
                    i17 -= 10;
                    i17 += (i18 * i18);
                }
                i17 >>= i14;
                i17 -= (int)Test.instanceCount;
            }
        }
        vMeth_check_sum += l3 + i13 + i14 + i15 + i16 + i17 + i18 + i19 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth1(byte by, long l1, int i9) {

        long l2=-11L, lArr[]=new long[N];
        int i10=-17085, i11=12, i12=43096, i20=220, iArr1[]=new int[N];
        short s1=-6347;

        FuzzerUtils.init(iArr1, -40493);
        FuzzerUtils.init(lArr, -9L);

        for (l2 = 180; 11 < l2; --l2) {
            for (i11 = 1; 9 > i11; ++i11) {
                vMeth(Test.instanceCount, i10);
                try {
                    iArr1[(int)(l2 - 1)] = (iArr1[(int)(l2 - 1)] / iArr1[i11]);
                    i10 = (90 / i10);
                    iArr1[i11 + 1] = (i12 / 60);
                } catch (ArithmeticException a_e) {}
                i10 >>>= s1;
                by += (byte)(i11 * Test.fFld1);
                if (Test.bFld) break;
                i20 = 1;
                do {
                    i9 += (int)67.869F;
                    switch (((i20 % 2) * 5) + 104) {
                    case 111:
                        Test.fFld1 = -85;
                        i10 *= i12;
                        i12 += (((i20 * i11) + s1) - i9);
                        break;
                    case 107:
                        lArr[i11] = l1;
                        i10 *= i11;
                        break;
                    }
                } while (++i20 < 2);
            }
        }
        long meth_res = by + l1 + i9 + l2 + i10 + i11 + i12 + s1 + i20 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(float f, int i2, int i3) {

        int i4=-1, i5=62362, i6=5, i7=-10, i8=-213, i21=26893, iArr[]=new int[N];
        long l=-72L;
        short s=-13959;

        FuzzerUtils.init(iArr, -45617);

        for (i4 = 13; i4 < 384; ++i4) {
            for (i6 = 5; i6 > 1; --i6) {
                i7 += i6;
                for (l = 1; l < 2; l++) {
                    f -= (Math.max(i7 + i5, Math.min(i8, i3)) * s);
                    Test.instanceCount = (iArr[i6]--);
                    i3 = (int)Test.instanceCount;
                    if (((iArr[(int)(l)]--) >= Math.min(i7, 11)) && ((i8 <<= i3) > iMeth1((byte)(79), l, i21)))
                        continue;
                    Test.instanceCount += i6;
                    if (i2 != 0) {
                    }
                    iArr[i4] = i5;
                    i3 = i2;
                    i2 -= (int)l;
                    Test.fFld1 -= -7013088896804350984L;
                }
            }
            i5 = (int)Test.instanceCount;
        }
        long meth_res = Float.floatToIntBits(f) + i2 + i3 + i4 + i5 + i6 + i7 + l + i8 + s + i21 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-10, i1=-244;

        for (i = 6; 290 > i; i++) {
            Test.fFld *= (129 - iMeth(Test.fFld1, i, i));
            i1 >>= i1;
            i1 += (-57137 + (i * i));
        }
        Test.dFld = i;
        i1 &= Test.sFld;
        Test.instanceCount += 1;
        Test.lFld -= i;
        Test.bFld = Test.bFld;
        Test.lFld -= i1;

        FuzzerUtils.out.println("i i1 = " + i + "," + i1);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.fFld1 Test.dFld Test.sFld = " + Float.floatToIntBits(Test.fFld1) + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.lFld = " + Test.lFld);

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