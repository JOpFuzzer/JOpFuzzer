// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:59 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=4L;
    public static int iFld=-168;
    public volatile double dArrFld[][]=new double[N][N];

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i9, int i10) {

        double d2=1.106148;
        int i11=124, i12=2, i13=-1, iArr1[]=new int[N];
        float f=0.384F;

        FuzzerUtils.init(iArr1, -38602);

        d2 += i9;
        i11 = 1;
        do {
            short s=6830;
            f = -25;
            Test.instanceCount = (long)d2;
            i9 = -10;
            i9 += (((i11 * i10) + i9) - Test.instanceCount);
            f = 109;
            i10 <<= s;
            for (i12 = 1; i12 < 6; ++i12) {
                Test.instanceCount = (long)d2;
                try {
                    i9 = (27428 % i12);
                    i9 = (-51306 % i11);
                    iArr1[i11] = (157 / i13);
                } catch (ArithmeticException a_e) {}
                i9 -= i11;
                iArr1[i11] = i11;
                i9 += i9;
            }
            Test.instanceCount += (i11 * i11);
        } while (++i11 < 291);
        long meth_res = i9 + i10 + Double.doubleToLongBits(d2) + i11 + Float.floatToIntBits(f) + i12 + i13 +
            FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth1(int i6, int i7) {

        long l=-615548249L;
        double d=-1.34130, d1=35.15249;
        int i8=3, i14=-13, i15=13, i16=-43, i17=-10, i18=-16, iArr[]=new int[N];
        float f1=68.94F;

        FuzzerUtils.init(iArr, 0);

        l = 1;
        do {
            i6 = -6154;
            Test.instanceCount |= (Test.instanceCount -= (++i6));
            for (d = 1; 6 > d; ++d) {
                d1 = ((Test.instanceCount + (-(i8 *= (int)Test.instanceCount))) + ((iArr[(int)(l - 1)]++) + (-98L -
                    l)));
                fMeth(34817, -3);
                iArr[(int)(l)] &= i14;
            }
            i7 = i7;
            i8 += (int)(l | i14);
            i14 = (int)l;
            for (i15 = 1; i15 < 6; i15++) {
                for (i17 = 1; i17 < 2; ++i17) {
                    if (i17 != 0) {
                    }
                    Test.instanceCount -= i16;
                }
                f1 += i18;
            }
        } while (++l < 291);
        long meth_res = i6 + i7 + l + Double.doubleToLongBits(d) + i8 + Double.doubleToLongBits(d1) + i14 + i15 + i16 +
            i17 + i18 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth() {


        lMeth1(Test.iFld, 7);
        Test.instanceCount += (long)102.599F;
        long meth_res = 0;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=87, i1=-11, i2=4, i3=-211, i4=-29, i5=-51645, i19=-9, i20=-5, i21=-185, i22=63507, i23=60748, i24=-2,
            i25=-37, iArr2[]=new int[N];
        byte by=-29;
        float f2=-2.844F;
        short s2=-7257;
        double d3=-84.4235;

        FuzzerUtils.init(iArr2, 2);

        for (i = 1; i < 179; ++i) {
            for (i2 = 7; i2 < 141; i2++) {
                short s1=17966;
                for (i4 = 1; i4 < 2; i4++) {
                    i5 = (int)(i1 += (int)lMeth());
                }
                s1 += (short)(((i2 * by) + f2) - i);
                i1 |= (int)11L;
                Test.instanceCount += i5;
            }
            i19 = 1;
            while ((i19 += 3) < 141) {
                Test.iFld = i1;
            }
            s2 = (short)f2;
            i5 = (int)Test.instanceCount;
            Test.iFld += i19;
            Test.iFld += (int)(1.999F + (i * i));
            d3 -= i19;
            for (i20 = 5; i20 < 141; ++i20) {
                Test.instanceCount += (i20 * i20);
                d3 -= -1935381439812383059L;
                i1 += i3;
                switch ((i20 % 2) + 91) {
                case 91:
                    iArr2[i20] *= (int)0L;
                    for (i22 = i20; i22 < 2; i22++) {
                        i21 -= (int)f2;
                        i1 += (i22 * i22);
                        i21 *= Test.iFld;
                        Test.instanceCount += (((i22 * i21) + i23) - f2);
                    }
                    break;
                case 92:
                    for (i24 = 1; i24 < 2; i24++) {
                        dArrFld[i24 - 1][i20 + 1] %= (i | 1);
                        i23 <<= (int)Test.instanceCount;
                        i5 = i1;
                        Test.iFld = i3;
                    }
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("by f2 i19 = " + by + "," + Float.floatToIntBits(f2) + "," + i19);
        FuzzerUtils.out.println("s2 d3 i20 = " + s2 + "," + Double.doubleToLongBits(d3) + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 iArr2 = " + i24 + "," + i25 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld dArrFld = " + Test.instanceCount + "," + Test.iFld + ","
            + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}