// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:00 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=5L;
    public int iFld=5;
    public static volatile int iFld1=-227;
    public static boolean bFld=false;
    public float fFld=103.228F;
    public static double dFld=1.62422;
    public byte byFld=-108;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -72.897F);
        FuzzerUtils.init(Test.iArrFld, -54548);
    }

    public static long sMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {


        Test.iFld1 = Test.iFld1;
        Test.iFld1 += (int)-61365L;
        vMeth_check_sum += 0;
    }

    public static double dMeth() {

        double d1=110.2494;
        int i4=60803, i5=4, i6=19568, i7=-251;
        short s1=-676;
        float f2=109.791F;

        vMeth();
        Test.iFld1 += (int)d1;
        Test.instanceCount = 4121;
        for (i4 = 1; 196 > i4; i4++) {
            try {
                i5 = (Test.iFld1 / -88);
                i5 = (i5 % -20938);
                Test.iFld1 = (i4 / 47050);
            } catch (ArithmeticException a_e) {}
            for (i6 = 1; i6 < 8; ++i6) {
                i7 >>= 3;
                Test.iArrFld = Test.iArrFld;
            }
            Test.iFld1 += (i4 | i6);
            i7 %= (int)(i5 | 1);
            s1 = (short)i5;
            Test.iArrFld[i4 + 1] += i5;
        }
        i7 = (int)f2;
        Test.iFld1 = i6;
        f2 += i4;
        long meth_res = Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 + s1 + Float.floatToIntBits(f2);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static short sMeth() {

        float f=-25.917F, f1=82.422F;
        int i2=-2, i3=71;
        double d=-41.30441;
        boolean b=false;
        byte by=73, byArr[]=new byte[N];
        short sArr[]=new short[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(sArr, (short)-6129);
        FuzzerUtils.init(lArr, 6785877257877878815L);
        FuzzerUtils.init(byArr, (byte)-116);

        if (b) {
            for (short s : sArr) {
                switch ((((((int)(Test.instanceCount * Test.iFld1)) >>> 1) % 2) * 5) + 45) {
                case 51:
                    if (b) {
                        f = 1;
                        do {
                            switch ((int)(((f % 8) * 5) + 120)) {
                            case 130:
                                for (i2 = 1; i2 < 1; ++i2) {
                                    i3 += (int)(d--);
                                    i3 += Math.abs(i2);
                                    Test.iFld1 += (i2 * i2);
                                    Test.fArrFld[(int)(f - 1)] = (Test.iFld1 *= s);
                                    i3 = (int)(Test.instanceCount * lArr[i2][(int)(f + 1)]);
                                    Test.iFld1 = (int)(Math.max(Test.iFld1 * i3, (int)(35L + Short.reverseBytes(s))) *
                                        ((Test.fArrFld[(int)(f + 1)] = Test.instanceCount) + (i2 +
                                        Test.instanceCount)));
                                }
                                i3 *= i2;
                                break;
                            case 149:
                                d = ((--Test.instanceCount) - Integer.reverseBytes((int)(d + Test.iFld1)));
                                break;
                            case 148:
                            case 150:
                                byArr[(int)(f + 1)] = (byte)(Test.instanceCount << ((Test.instanceCount - Test.iFld1) -
                                    Test.instanceCount));
                                break;
                            case 133:
                                Test.iArrFld[(int)(f + 1)] &= (int)(-(Test.fArrFld[(int)(f - 1)]--));
                                break;
                            case 127:
                                Test.iArrFld[(int)(f)] = (Test.iFld1 = Test.iFld1);
                            case 129:
                                f1 /= ((long)(dMeth()) | 1);
                                break;
                            case 144:
                                f1 += s;
                                break;
                            }
                        } while (++f < 4);
                    } else if (b) {
                        Test.iFld1 <<= (int)Test.instanceCount;
                    }
                case 55:
                    by |= (byte)Test.iFld1;
                    break;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i2 + i3 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + (b
            ? 1 : 0) + by + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=215, i1=97, i9=-11, i10=8, i11=30, i12=-98, i13=11, i14=-4, i15=-97, iArr[]=new int[N];
        short s2=-26822;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, -59670);
        FuzzerUtils.init(lArr1, 144L);

        iFld = (((--iFld) * Test.iFld1) - Test.iFld1);
        for (i = 19; i < 365; i++) {
            iArr[i] >>>= (int)(++Test.instanceCount);
            sMeth();
            Test.iArrFld[(3 >>> 1) % N] = iFld;
            Test.bFld = Test.bFld;
            Test.instanceCount *= Test.iFld1;
            iFld += (15 + (i * i));
        }
        i1 += s2;
        for (i9 = 11; 268 > i9; ++i9) {
            i1 = iFld;
            i1 += i9;
            i1 -= 2230;
            i10 = (int)Test.instanceCount;
            for (i11 = 98; i11 > i9; i11 -= 3) {
                i12 >>= i9;
                i10 += i11;
                iArr[i11 + 1] = (int)Test.instanceCount;
                fFld *= i11;
                Test.dFld = i1;
                iFld = i11;
                try {
                    iFld = (iFld % i12);
                    iFld = (i12 % i12);
                    iFld = (iArr[i11 - 1] % 206);
                } catch (ArithmeticException a_e) {}
                byFld += (byte)(((i11 * fFld) + Test.iFld1) - byFld);
                lArr1[i9] <<= Test.instanceCount;
            }
            iFld += (int)Test.instanceCount;
            i13 = 1;
            while (++i13 < 98) {
                s2 = (short)fFld;
                for (i14 = 1; i14 < 1; i14++) {
                    i12 += (i14 - byFld);
                    i1 = (int)Test.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("i i1 s2 = " + i + "," + i1 + "," + s2);
        FuzzerUtils.out.println("i9 i10 i11 = " + i9 + "," + i10 + "," + i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 iArr lArr1 = " + i15 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.iFld1 = " + Test.instanceCount + "," + iFld + "," +
            Test.iFld1);
        FuzzerUtils.out.println("Test.bFld fFld Test.dFld = " + (Test.bFld ? 1 : 0) + "," + Float.floatToIntBits(fFld)
            + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("byFld Test.fArrFld Test.iArrFld = " + byFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  dMeth ->  dMeth sMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}