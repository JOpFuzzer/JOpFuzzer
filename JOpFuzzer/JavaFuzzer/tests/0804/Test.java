// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:59 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=237L;
    public static long lFld=3129974056L;
    public static double dFld=120.51495;
    public static byte byFld=16;
    public static long lFld1=6768875462705962197L;
    public static volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 26.11547);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i, int i1) {

        int i2=-14, i3=63706, i4=11864, i5=199, i6=8, iArr[]=new int[N];
        float f1=-6.960F;
        double d1=77.10159;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -35473L);
        FuzzerUtils.init(iArr, 13);

        i1 = (int)-2324847527L;
        lArr[(i >>> 1) % N] += (long)2.39286;
        for (i2 = 342; i2 > 2; i2 -= 3) {
            for (i4 = 14; 1 < i4; i4 -= 2) {
                i5 = 14;
                i5 = (int)-1.951F;
                i3 += i5;
                i6 = 1;
                do {
                    i5 += i6;
                    Test.instanceCount -= i1;
                    Test.instanceCount = Test.lFld;
                    iArr[i6] >>= (int)1L;
                } while (++i6 < 3);
                i5 = (int)73L;
                f1 *= (float)d1;
                Test.lFld -= (long)f1;
            }
        }
        vMeth2_check_sum += i + i1 + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1() {

        int i7=37107;

        vMeth2(i7, i7);
        vMeth1_check_sum += i7;
    }

    public static void vMeth() {

        int i8=0, i9=-13, i10=177, i11=-14, i12=33161, i13=-4, i14=6, iArr1[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, -8);
        FuzzerUtils.init(lArr1, 3447559393L);

        vMeth1();
        for (i8 = 14; i8 < 230; ++i8) {
            i9 += (i8 * i8);
            for (i10 = 1; i10 < 7; ++i10) {
                iArr1 = iArr1;
                try {
                    i9 = (iArr1[i10] % i11);
                    iArr1[i10 + 1] = (i12 / -143);
                    i12 = (i9 % 176);
                } catch (ArithmeticException a_e) {}
                Test.dArrFld[i10 - 1] += Test.lFld;
                lArr1[i8 - 1] *= Test.lFld;
                i9 += (i10 + Test.lFld);
                switch ((i8 % 2) + 54) {
                case 54:
                    i11 = (int)Test.dFld;
                    Test.dFld = Test.instanceCount;
                    for (i13 = 1; i13 < 2; i13++) {
                        i9 = i13;
                        iArr1[i8] += 55294;
                    }
                    break;
                case 55:
                    Test.byFld = (byte)i14;
                default:
                    lArr1[i8 - 1] = i12;
                }
            }
        }
        vMeth_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        double d=80.43524;
        float f=1.994F, f2=-2.25F;
        int i15=54163, i16=-10, i17=-14, i18=-15560, i19=37224, i20=-8, i21=-6, i22=-15157, i23=-42226, i24=-101,
            iArr2[]=new int[N], iArr3[][]=new int[N][N];
        short s=-13343;

        FuzzerUtils.init(iArr2, -205);
        FuzzerUtils.init(iArr3, -13047);

        d = f;
        vMeth();
        for (i15 = 21; i15 < 392; i15++) {
            f = i15;
            for (i17 = 4; i17 < 68; i17++) {
                f -= f2;
                i16 += i17;
                s *= (short)i16;
            }
            i18 += i17;
            iArr2[i15] *= (int)Test.lFld;
            Test.dFld += s;
            i16 += i15;
            for (i19 = 3; i19 < 68; ++i19) {
                d = i16;
                d *= -115;
                iArr2[i19 - 1] = i18;
                iArr3[i19][i19 + 1] <<= i15;
                for (i21 = 1; i21 < 2; i21++) {
                    i18 = i18;
                    i18 *= (int)Test.instanceCount;
                }
            }
            Test.lFld1 += (((i15 * i18) + i22) - i20);
            i20 += i20;
            iArr3[i15][i15 + 1] >>>= i22;
        }
        Test.dFld = Test.instanceCount;
        f = i17;
        Test.lFld = Test.instanceCount;
        for (i23 = 169; i23 > 2; i23--) {
            Test.dFld += Test.lFld1;
            Test.byFld += (byte)Test.instanceCount;
            i24 = i23;
        }

        FuzzerUtils.out.println("d f i15 = " + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f) + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("f2 s i19 = " + Float.floatToIntBits(f2) + "," + s + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 iArr2 = " + i23 + "," + i24 + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.lFld Test.dFld = " + Test.instanceCount + "," + Test.lFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.byFld Test.lFld1 Test.dArrFld = " + Test.byFld + "," + Test.lFld1 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

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