// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:56 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-39415L;
    public static short sFld=2957;
    public static byte byFld=-31;
    public static float fFld=1.574F;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i7, int i8) {

        double d2=-12.114, d3=0.24663;
        int i9=49, i10=0, i12=18841, iArr1[]=new int[N];
        float f1=-114.60F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 13.72F);
        FuzzerUtils.init(iArr1, -62985);

        d2 = 9;
        Test.sFld += (short)i8;
        Test.sFld = (short)i8;
        for (i9 = 3; i9 < 182; i9++) {
            switch ((i9 % 2) + 42) {
            case 42:
                i8 = -6573;
                break;
            case 43:
                i8 -= (int)1.36F;
                i8 += (int)Test.instanceCount;
                switch ((i9 % 5) + 111) {
                case 111:
                    i8 += (i9 * i9);
                    fArr[i9] -= (float)d2;
                    break;
                case 112:
                    Test.instanceCount = -29049L;
                    for (d3 = 1; 9 > d3; d3++) {
                        i10 += (int)(d3 * f1);
                        Test.instanceCount -= i8;
                    }
                    break;
                case 113:
                    i10 += (int)(122.601F + (i9 * i9));
                    break;
                case 114:
                    Test.instanceCount = Test.instanceCount;
                case 115:
                    i10 = i7;
                    break;
                default:
                    f1 /= (i8 | 1);
                }
                break;
            default:
                Test.instanceCount = Test.instanceCount;
            }
        }
        vMeth2_check_sum += i7 + i8 + Double.doubleToLongBits(d2) + i9 + i10 + Double.doubleToLongBits(d3) + i12 +
            Float.floatToIntBits(f1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        int i3=135, i4=47, i5=-85, i6=11, i13=170, i14=9827, i15=-61;
        float f=35.222F;
        double d4=60.36699;

        Test.instanceCount *= i3;
        for (i4 = 19; i4 < 332; ++i4) {
            for (f = 1; 5 > f; f += 3) {
                i6 += (int)f;
                vMeth2(i5, i4);
                Test.sFld += (short)i6;
            }
            i5 += i4;
            i5 -= -57892;
            i3 += (((i4 * i6) + i6) - Test.instanceCount);
            i13 = 1;
            do {
                d4 -= i4;
                i6 += (int)Test.instanceCount;
                for (i14 = 1; i14 < 1; i14++) {
                    i6 -= i4;
                    i3 += (i14 - Test.instanceCount);
                }
            } while (++i13 < 5);
        }
        vMeth1_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + i13 + Double.doubleToLongBits(d4) + i14 + i15;
    }

    public static void vMeth() {

        int i16=-5, i17=-25323, i18=57971, i19=25486, i20=-10839, i21=-111;
        float f2=16.173F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 9.55700);

        vMeth1();
        i16 -= (int)f2;
        for (i17 = 2; i17 < 263; ++i17) {
            for (i19 = 1; i19 < 6; ++i19) {
                i20 = i16;
                Test.instanceCount = -2543609084185036904L;
                i21 = 1;
                do {
                    i18 += (i21 | i17);
                    i16 += i19;
                    i16 >>= (int)Test.instanceCount;
                    i20 >>>= (int)Test.instanceCount;
                    Test.byFld += (byte)i18;
                    f2 += i21;
                    dArr[i21 + 1] += f2;
                } while (++i21 < 2);
                i18 *= -12;
            }
        }
        vMeth_check_sum += i16 + Float.floatToIntBits(f2) + i17 + i18 + i19 + i20 + i21 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-4, i1=0, i2=11, iArr[][]=new int[N][N];
        double d=110.11307, d1=118.34220, dArr1[]=new double[N];
        boolean b=true;

        FuzzerUtils.init(iArr, -55600);
        FuzzerUtils.init(dArr1, -1.105353);

        for (i = 7; i < 347; i++) {
            for (d = 2; d < 74; d++) {
                i1 -= ((iArr[i][i - 1] - Integer.reverseBytes(i)) - ((i - i2) + (i1 % (i2 | 1))));
                d1 = Math.abs(i2 - Math.abs(44561));
                vMeth();
                b = b;
                i1 &= Test.sFld;
                switch (((i % 1) * 5) + 75) {
                case 77:
                default:
                    if (b) continue;
                }
            }
            d1 += Test.fFld;
            iArr[i][i + 1] = i;
            Test.fFld += (((i * i1) + Test.instanceCount) - i);
            dArr1[i] += d;
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i2 d1 b = " + i2 + "," + Double.doubleToLongBits(d1) + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("iArr dArr1 = " + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.fFld = " + Float.floatToIntBits(Test.fFld));

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