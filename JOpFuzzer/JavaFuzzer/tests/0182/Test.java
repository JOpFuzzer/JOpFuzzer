// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=8778147126339930737L;
    public static int iFld=838;
    public static int iFld1=21968;
    public static long lFld=5390763960720537676L;
    public static long lArrFld[][]=new long[N][N];
    public volatile byte byArrFld[][]=new byte[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, -188L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3) {


        Test.iFld -= -18459;
        Test.iFld = i3;
        vMeth2_check_sum += i3;
    }

    public static void vMeth1() {

        double d=1.42183;
        int i4=61, i5=27617, i6=11, i7=-11;
        float f=-92.842F, fArr[]=new float[N];
        short s=-22162;

        FuzzerUtils.init(fArr, -1.377F);

        Test.iFld -= (int)Math.abs((Test.iFld + Test.iFld) - (d + 39621));
        vMeth2(Test.iFld);
        Test.iFld += Test.iFld;
        for (i4 = 9; i4 < 394; i4++) {
            fArr[i4 - 1] = -1.572F;
            f += (5 + (i4 * i4));
            for (i6 = 1; i6 < 4; ++i6) {
                d = Test.instanceCount;
                i5 += i7;
                Test.iFld <<= i6;
                Test.instanceCount += i6;
                Test.iFld -= (int)Test.instanceCount;
                f -= s;
                Test.iFld1 = i7;
                i7 -= (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth() {


        vMeth1();
        vMeth_check_sum += 0;
    }

    public void mainTest(String[] strArr1) {

        int i=-107, i1=-14, i2=7, i8=50010, i9=-53362, i10=-14, i11=32, i12=-115, i13=13409, iArr[]=new int[N];
        float f1=1.453F;
        double d1=29.20801, d2=9.83234;
        short s1=-11061;
        boolean b=false;

        FuzzerUtils.init(iArr, 33532);

        iArr[(-15022 >>> 1) % N] = Test.iFld;
        for (i = 8; 313 > i; i++) {
            i2 = 1;
            while (++i2 < 82) {
                vMeth();
                iArr[(Test.iFld >>> 1) % N] -= (int)Test.instanceCount;
            }
            for (i8 = 82; i8 > 1; i8 -= 3) {
                Test.iFld += i8;
            }
            Test.iFld += (i ^ Test.iFld);
            Test.instanceCount += (i + Test.instanceCount);
            Test.iFld1 ^= i;
            f1 = (float)90.111187;
            d1 = d2;
            Test.iFld = 25683;
            for (i10 = 1; i10 < 82; i10++) {
                i1 = i11;
                for (i12 = 1; i12 < 2; ++i12) {
                    Test.iFld1 >>= Test.iFld;
                    Test.instanceCount -= i13;
                    s1 = (short)i9;
                    i13 <<= i9;
                    switch ((((i8 >>> 1) % 2) * 5) + 23) {
                    case 33:
                        i13 = (int)Test.instanceCount;
                        Test.lArrFld[i10][i10 - 1] = (long)d1;
                        iArr[i10 - 1] = s1;
                        Test.instanceCount = i8;
                        break;
                    case 25:
                        switch ((((i9 >>> 1) % 5) * 5) + 102) {
                        case 105:
                            i13 += i10;
                        case 121:
                            i13 *= (int)d2;
                            break;
                        case 116:
                            byArrFld = byArrFld;
                            b = b;
                            break;
                        case 113:
                            Test.lArrFld[i10][i10] -= -152;
                        case 117:
                            Test.lFld = -6;
                            break;
                        default:
                            Test.lArrFld[i + 1][i] += Test.iFld;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i8 i9 f1 = " + i8 + "," + i9 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("d1 d2 i10 = " + Double.doubleToLongBits(d1) + "," + Double.doubleToLongBits(d2) + ","
            + i10);
        FuzzerUtils.out.println("i11 i12 i13 = " + i11 + "," + i12 + "," + i13);
        FuzzerUtils.out.println("s1 b iArr = " + s1 + "," + (b ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.iFld1 = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.iFld1);
        FuzzerUtils.out.println("Test.lFld Test.lArrFld byArrFld = " + Test.lFld + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(byArrFld));

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