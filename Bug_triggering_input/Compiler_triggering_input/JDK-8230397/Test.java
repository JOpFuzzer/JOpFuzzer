// Generated by Java* Fuzzer test generator (1.0.001). Fri Aug 30 14:39:20 2019
public class Test {

    public static final int N = 400;

public Test setinstanceCount(long tmp) { Test.instanceCount = tmp; return this; };
public Test setdFld(double tmp) { Test.dFld = tmp; return this; };
public Test setbFld1(boolean tmp) { Test.bFld1 = tmp; return this; };
public Test setsFld(short tmp) { Test.sFld = tmp; return this; };
public Test setbyFld(byte tmp) { Test.byFld = tmp; return this; };
public Test setiFld(int tmp) { Test.iFld = tmp; return this; };
public Test setdArrFld(double tmp[]) { Test.dArrFld = tmp; return this; };
public Test setiArrFld(int tmp[]) { Test.iArrFld = tmp; return this; };
public Test setOFld(Cls tmp) { Test.OFld = tmp; return this; };
    public static long instanceCount=2149450457L;
    public static double dFld=63.1805;
    public static boolean bFld1=false;
    public static short sFld=-22158;
    public static byte byFld=-79;
    public static int iFld=-4;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public static Cls OFld=new Cls();

    static {
        FuzzerUtils.init(Test.dArrFld, -101.2817);
        FuzzerUtils.init(Test.iArrFld, 35406);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i5, int i6) {

        int i15=33, i16=-5, i17=-38446, i18=-6, i19=-14, i20=15621;
        long l=-105L;

        Cls.vMeth1(i6, Test.dFld, Test.dFld);
        for (i15 = 7; i15 < 177; i15++) {
            i17 = 1;
            while (++i17 < 9) {
                for (l = 1; l < 1; l++) {
                    i5 += (int)l;
                    if (Test.OFld.bFld) continue;
                    if (i18 != 0) {
                    }
                    Test.dFld = -43;
                    i18 = i16;
                }
                for (i19 = 1; i19 < 1; ++i19) {
                    Test.dArrFld[i15] = i15;
                    i16 += (i19 * i6);
                    if (Test.OFld.bFld) continue;
                }
            }
            i16 >>= (int)Test.instanceCount;
            i6 *= i15;
        }
        long meth_res = i5 + i6 + i15 + i16 + i17 + l + i18 + (Test.OFld.bFld ? 1 : 0) + i19 + i20;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(int i, int i1) {

        double d=0.32009;
        int i2=-63441, i3=-13, i4=32073;

        for (d = 8; d < 307; d++) {
            for (i3 = 1; i3 < 6; i3 += 2) {
                i <<= -23877;
                Test.instanceCount *= ((Math.abs(Test.instanceCount) * (i3 * i1)) - ((i1 = i2) >> i1));
                Test.OFld = Test.OFld.setfFld((float)((float)(((Cls.instanceCount - -63125) - Test.instanceCount) -
                    lMeth(i, i4)))); /* Test.OFld.fFld = (((Cls.instanceCount - -63125) - Test.instanceCount) -
                    lMeth(i, i4)) */ ;
                Test.bFld1 = Test.bFld1;
                switch ((((i1 >>> 1) % 10) * 5) + 69) {
                case 83:
                    if (true) break;
                    i += (((i3 * i) + i3) - Cls.instanceCount);
                    Cls.instanceCount >>= i1;
                    break;
                case 119:
                    if (Test.bFld1) {
                        if (Test.bFld1) continue;
                        i <<= Test.sFld;
                        Test.OFld = Test.OFld.setfFld((float)(Test.OFld.fFld+(float)(i1))); /* Test.OFld.fFld += i1 */ ;
                        i4 *= 5392;
                    }
                    break;
                case 106:
                    Test.OFld = Test.OFld.setfFld((float)(Test.OFld.fFld+(float)(i2))); /* Test.OFld.fFld += i2 */ ;
                case 97:
                    Test.instanceCount += i3;
                    break;
                case 88:
                    Test.iArrFld[i3] = i2;
                    break;
                case 81:
                    i ^= i3;
                case 77:
                    Test.byFld += (byte)i3;
                case 109:
                    Test.byFld += (byte)(i3 * i3);
                    break;
                case 113:
                    Test.byFld -= (byte)i2;
                    break;
                case 98:
                    Test.iArrFld[i3] >>= i;
                }
            }
        }
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + Float.floatToIntBits(Test.OFld.fFld);
    }

    public void mainTest(String[] strArr1) {

        int i21=-35918, i22=11, i23=31413, i24=-7, i25=0, i26=70;
        double d3=0.122541;

        FuzzerUtils.init(Test.OFld.fArrFld, 93.876F);

        vMeth(Test.iFld, Test.iFld);
        for (i21 = 20; i21 < 396; ++i21) {
            d3 = 1;
            while (++d3 < 67) {
                byte by=38;
                Test.dArrFld[(int)(d3)] = -7;
                switch ((i21 % 9) + 1) {
                case 1:
                    for (i23 = 1; i23 < 1; i23 += 3) {
                        Test.instanceCount = i22;
                        Test.OFld.fArrFld[i21][(int)(d3)] += 0;
                        Test.iFld -= (int)Test.OFld.fFld1;
                        Test.instanceCount >>= Cls.instanceCount;
                        i22 = (int)Test.OFld.fFld1;
                        Test.bFld1 = false;
                        Test.iArrFld[(int)(d3 - 1)] &= i23;
                        i22 += (i23 + i24);
                        i22 -= (int)d3;
                        Test.iFld |= (int)Cls.instanceCount;
                    }
                    Test.iFld -= (int)Test.instanceCount;
                    break;
                case 2:
                    for (i25 = 1; i25 < 1; i25++) {
                        i26 += i22;
                        i26 += i25;
                        Test.iArrFld[i25 + 1] += (int)Cls.instanceCount;
                        i22 += (i25 - Test.instanceCount);
                        i26 += (i25 + i21);
                    }
                    Test.instanceCount -= 2;
                    Test.dFld = i22;
                    Test.iFld += (int)(((d3 * by) + by) - i24);
                    break;
                case 3:
                    i24 = (int)1.84829;
                    Test.OFld = Test.OFld.setfFld1((float)(Test.OFld.fFld1+(float)(d3))); /* Test.OFld.fFld1 +=
                        (float)d3 */ ;
                    break;
                case 4:
                    Test.OFld = Test.OFld.setfFld1((float)(Test.OFld.fFld1*(float)(i23))); /* Test.OFld.fFld1 *= i23 */
                        ;
                    Cls.instanceCount += (long)d3;
                    break;
                case 5:
                    Cls.instanceCount += (long)(d3 * d3);
                    break;
                case 6:
                    Test.dFld -= i25;
                case 7:
                    try {
                        i24 = (78 / Test.iFld);
                        Test.iFld = (-5836 / Test.iArrFld[(int)(d3 + 1)]);
                        i24 = (i23 / -205);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 8:
                    if (Test.bFld1) continue;
                case 9:
                default:
                    try {
                        i26 = (i24 / -929688879);
                        i24 = (Test.iArrFld[(int)(d3)] % -1067487586);
                        Test.iArrFld[(int)(d3)] = (-208 % i24);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }

        FuzzerUtils.out.println("i21 i22 d3 = " + i21 + "," + i22 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i23 i24 Test.OFld.fFld1 = " + i23 + "," + i24 + "," +
            Float.floatToIntBits(Test.OFld.fFld1));
        FuzzerUtils.out.println("i25 i26 Test.OFld.fArrFld = " + i25 + "," + i26 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.OFld.fArrFld)));
        FuzzerUtils.out.println("Cls = " + Cls.instanceCount);

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.bFld1 = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld1 ? 1 : 0));
        FuzzerUtils.out.println("Test.sFld Test.byFld Test.iFld = " + Test.sFld + "," + Test.byFld + "," + Test.iFld);
        FuzzerUtils.out.println("Test.dArrFld Test.iArrFld Test.OFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld) +
            "," + FuzzerUtils.checkSum(Test.OFld));
        FuzzerUtils.out.println("Cls = " + Cls.instanceCount);

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
inline class Cls {

    public static final int N = 400;

public Cls setinstanceCount(long tmp) { Cls.instanceCount = tmp; return this; };
public Cls setfFld(float tmp) { return __WithField(fFld, tmp); };
public Cls setbFld(boolean tmp) { return __WithField(bFld, tmp); };
public Cls setfFld1(float tmp) { return __WithField(fFld1, tmp); };
public Cls setfArrFld(float tmp[][]) { return __WithField(fArrFld, tmp); };
    public static long instanceCount=-2594298490L;
    public float fFld=-104.485F;
    public boolean bFld=true;
    public float fFld1=-124.228F;
    public float fArrFld[][]=new float[N][N];

    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, double d1, double d2) {

        int i8=-223, i9=22631, i10=-8361, i11=-67, i12=64171, i13=3, i14=8;

        i8 = 1;
        do {
            boolean b=false;
            if (b) continue;
            i7 = (int)Cls.instanceCount;
            if (false) break;
            i7 = i7;
            for (i9 = 1; 11 > i9; i9 += 3) {
                for (i11 = i9; i11 < 4; ++i11) {
                    float f=2.636F, f1=-75.630F;
                    f -= i7;
                    i10 += (int)Cls.instanceCount;
                    Test.instanceCount += i11;
                    f1 = 14;
                }
                for (i13 = 1; i13 < 4; i13++) {
                    if (i11 != 0) {
                        vMeth1_check_sum += i7 + Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i8 + i9 +
                            i10 + i11 + i12 + i13 + i14;
                        return;
                    }
                    i10 *= -28127;
                }
                i14 += (int)1.125863;
            }
        } while (++i8 < 143);
        vMeth1_check_sum += i7 + Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + i8 + i9 + i10 + i11 + i12
            + i13 + i14;
    }

}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  Cls ->  Cls Test vMeth mainTest lMeth
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 2
//DEBUG  static objects = {Cls: [, Test.OFld], }
