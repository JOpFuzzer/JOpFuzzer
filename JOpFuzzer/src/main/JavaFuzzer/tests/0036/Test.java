// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:42 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-10L;
    public static boolean bFld=true;
    public static float fFld=-91.688F;
    public byte byFld=55;
    public static double dFld=104.116568;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 2324286128557350904L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth(long l, double d1) {

        int i9=-209, i10=191, i11=7;
        short s=-26275;

        for (i9 = 357; 21 < i9; i9--) {
            Test.instanceCount = Test.instanceCount;
            s <<= (short)-1038316553L;
            Test.fFld = i11;
        }
        long meth_res = l + Double.doubleToLongBits(d1) + i9 + i10 + s + i11;
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth1() {

        int i3=-4989, i4=25, i5=40213, i6=-50201, i7=161, i8=74, iArr[]=new int[N];
        double d=-5.97343;
        float f2=59.140F, fArr[]=new float[N];
        boolean b=true;

        FuzzerUtils.init(fArr, -1.803F);
        FuzzerUtils.init(iArr, -13747);

        for (i3 = 1; 154 > i3; i3++) {
            for (i5 = 1; i5 < 10; i5++) {
                if ((--d) == i5) break;
                iArr[(i4 >>> 1) % N] = Math.min((int)((i5 + Test.instanceCount) - Math.abs(i5)), (int)((-71.951F -
                    (-(++Test.instanceCount))) + i6));
            }
            f2 -= -26450;
            Test.instanceCount += (-201L + (i3 * i3));
            for (i7 = 1; i7 < 10; ++i7) {
                iArr[i3 + 1] = (int)((Short.reverseBytes((short)(-25880)) + Math.min(0L, Test.instanceCount)) + (i6 -
                    (83.154F + (i8 - f2))));
                Test.bFld = b;
                if (bMeth(Test.instanceCount, d)) continue;
                Test.fFld -= 0;
                switch (((i3 >>> 1) % 3) + 39) {
                case 39:
                    i4 >>>= (int)Test.instanceCount;
                    break;
                case 40:
                case 41:
                    Test.lArrFld[i7 + 1] %= 6;
                    i6 += (i7 * i7);
                    break;
                default:
                    i8 += i5;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i7 + i8 + (b ?
            1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(int i2) {

        byte by=105;
        int i12=1, i13=10, i14=-63713, i15=-4, i16=-3165, i17=-65039, i18=-5, i19=55847;

        vMeth1();
        by += (byte)i2;
        for (i12 = 214; i12 > 10; i12 -= 2) {
            i2 *= i13;
            i13 = 102;
            i13 = i2;
        }
        Test.instanceCount -= i12;
        Test.fFld = i12;
        for (i14 = 1; i14 < 135; ++i14) {
            i13 += (((i14 * i2) + Test.instanceCount) - i2);
            for (i16 = 12; i16 > 1; --i16) {
                for (i18 = 2; 1 < i18; i18--) {
                    i17 += (-50446 + (i18 * i18));
                    if (Test.bFld) break;
                    i2 += i18;
                }
            }
        }
        vMeth_check_sum += i2 + by + i12 + i13 + i14 + i15 + i16 + i17 + i18 + i19;
    }

    public void mainTest(String[] strArr1) {

        int i=3, i1=-57, i20=3, i21=194, iArr1[]=new int[N];
        float f=-103.531F;
        short s1=5826;

        FuzzerUtils.init(iArr1, -2);

        for (i = 19; i < 304; i++) {
            f += i1;
            vMeth(i1);
            iArr1[i + 1] &= i1;
            i1 = 4753;
            try {
                i1 = (i1 / i1);
                i1 = (i20 % -248);
                i1 = (27194 / i1);
            } catch (ArithmeticException a_e) {}
            switch ((i % 2) + 15) {
            case 15:
                iArr1[i + 1] *= i20;
                i20 += (i * i20);
                i1 = byFld;
                iArr1[i + 1] = s1;
                break;
            case 16:
                i20 += (i * i20);
                Test.instanceCount = i20;
                byFld += (byte)(i + Test.fFld);
                i1 = i;
            default:
                try {
                    i20 = (iArr1[i - 1] / i20);
                    i1 = (-60856 / i);
                    i1 = (i1 % -52);
                } catch (ArithmeticException a_e) {}
            }
            Test.instanceCount += i1;
            iArr1[i] <<= i1;
            i20 <<= (int)Test.instanceCount;
            i21 = 1;
            while (++i21 < 88) {
                Test.dFld *= 59338;
                Test.dFld = i1;
                i20 += (int)(59.148F + (i21 * i21));
                i1 = s1;
                i20 += i21;
            }
        }
        i20 = i1;

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i20 s1 i21 = " + i20 + "," + s1 + "," + i21);
        FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("byFld Test.dFld Test.lArrFld = " + byFld + "," + Double.doubleToLongBits(Test.dFld) +
            "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
