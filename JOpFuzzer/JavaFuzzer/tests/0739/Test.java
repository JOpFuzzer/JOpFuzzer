// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:57 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=165L;
    public static int iFld=-25523;
    public static short sFld=24824;
    public static float fFld=71.411F;

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(short s) {

        int i4=-109, i5=6477, i6=13, i7=13, i8=-26, i9=0, iArr1[]=new int[N];
        boolean b=true;
        double d=0.47665;

        FuzzerUtils.init(iArr1, -13);

        for (i4 = 157; i4 > 9; i4 -= 3) {
            for (i6 = 31; i6 > 1; i6--) {
                for (i8 = 1; i8 < 2; ++i8) {
                    b = b;
                    i7 += i8;
                    Test.iFld = i9;
                    i9 = i6;
                    s *= (short)d;
                    i5 += (i8 * i8);
                    i7 += i8;
                    iArr1[i4] >>= i8;
                    if (b) continue;
                    d *= i8;
                }
            }
            Test.instanceCount %= ((long)(d) | 1);
            Test.instanceCount *= -1448163158L;
        }
        long meth_res = s + i4 + i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth() {

        int i10=8, i11=140, i12=6, iArr[]=new int[N];
        double d1=-68.92173;
        float f1=-42.412F;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 239);
        FuzzerUtils.init(lArr, 160L);

        iArr[(-7 >>> 1) % N] >>= Math.abs((int)((Test.iFld++) * fMeth(Test.sFld)));
        for (i10 = 1; i10 < 233; i10++) {
            i11 = (int)-1L;
            i12 = 7;
            do {
                int i13=108;
                try {
                    i11 = (i11 / iArr[i10 - 1]);
                    Test.iFld = (iArr[i10 + 1] % -43595);
                    iArr[i10 + 1] = (-162 / iArr[i12]);
                } catch (ArithmeticException a_e) {}
                i11 += (int)d1;
                if (b1) {
                    i11 *= (int)d1;
                } else if (false) {
                    f1 *= i12;
                } else {
                    lArr[i10 - 1] = Test.instanceCount;
                    switch (((i13 >>> 1) % 1) + 83) {
                    case 83:
                    }
                    if (i11 != 0) {
                    }
                }
                iArr = iArr;
                i13 = i13;
                Test.iFld += i12;
            } while (--i12 > 0);
        }
        long meth_res = i10 + i11 + i12 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l, int i, long l1) {

        int i1=14372, i2=45278, i3=-78, i14=32, i15=-8, iArr2[]=new int[N];
        float f=1.198F;
        byte by=52, byArr[]=new byte[N];
        boolean b2=true;

        FuzzerUtils.init(iArr2, -125);
        FuzzerUtils.init(byArr, (byte)118);

        for (i1 = 9; i1 < 304; i1++) {
            f = 1;
            do {
                i3 = 1;
                do {
                    Test.instanceCount -= ((lMeth() - i3) * -42072);
                    by += (byte)i;
                    l >>= i2;
                    i = (int)l1;
                    iArr2[i1] -= (int)102.70743;
                    if (b2) break;
                    Test.fFld = i2;
                    i = Test.iFld;
                } while (++i3 < 1);
                for (i14 = 1; i14 < 1; ++i14) {
                    i ^= i1;
                    byArr = byArr;
                    i2 -= (int)l;
                }
            } while (++f < 6);
        }
        vMeth_check_sum += l + i + l1 + i1 + i2 + Float.floatToIntBits(f) + i3 + by + (b2 ? 1 : 0) + i14 + i15 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i16=-1, i17=-2, i18=-11, i19=7710, i20=132, i21=-7, iArr3[]=new int[N];
        byte by1=77;
        double d2=94.123888, d3=-68.112623;

        FuzzerUtils.init(iArr3, 14759);

        Test.iFld += (int)(((Test.iFld - Test.instanceCount) >> Math.min(Test.iFld, Test.iFld)) + (++Test.iFld));
        vMeth(Test.instanceCount, Test.iFld, -4678069748177812514L);
        for (i16 = 18; i16 < 325; i16++) {
            for (i18 = 82; i18 > 2; i18 -= 2) {
                iArr3[i18] *= i16;
                switch ((((i18 >>> 1) % 8) * 5) + 55) {
                case 58:
                    i17 = (int)Test.instanceCount;
                    break;
                case 91:
                    Test.iFld -= Test.iFld;
                    break;
                case 71:
                    Test.iFld = -5857;
                    Test.instanceCount >>= Test.iFld;
                    i19 = (int)227L;
                    break;
                case 77:
                    switch (((i16 % 2) * 5) + 54) {
                    case 63:
                        if (true) continue;
                        iArr3[i18] *= (int)-206L;
                        i17 <<= (int)Test.instanceCount;
                        break;
                    case 64:
                        i17 += i19;
                        break;
                    }
                    i17 += by1;
                    break;
                case 84:
                    d2 = 1;
                    while (++d2 < 3) {
                        iArr3[i18] <<= i18;
                        i19 <<= Test.iFld;
                        by1 = (byte)i19;
                        iArr3[i18 + 1] = Test.iFld;
                        i17 *= i18;
                        d3 = i16;
                    }
                    i19 += i17;
                    for (i20 = 1; i20 < 3; i20++) {
                        Test.fFld -= i16;
                        Test.iFld -= i20;
                        Test.instanceCount -= (long)d3;
                        i21 += (((i20 * i16) + i21) - Test.instanceCount);
                    }
                    break;
                case 72:
                    Test.fFld = by1;
                    break;
                case 75:
                    i21 = (int)Test.instanceCount;
                    break;
                case 95:
                    Test.iFld = (int)147L;
                }
            }
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 by1 d2 = " + i19 + "," + by1 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("d3 i20 i21 = " + Double.doubleToLongBits(d3) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("Test.fFld = " + Float.floatToIntBits(Test.fFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}