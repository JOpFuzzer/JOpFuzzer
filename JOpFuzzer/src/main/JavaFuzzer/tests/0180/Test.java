// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=95L;
    public static float fFld=1.942F;
    public static double dFld=1.53824;
    public static boolean bFld=true;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(float f) {

        int i9=-121, i10=-6338, i11=-156, i12=234, i13=-5, i14=-6;
        double d=20.75391;
        boolean b=true;

        i9 *= i9;
        if (true) {
        } else if (b) {
            i10 = 1;
            do {
                for (i11 = 1; i11 < 10; i11++) {
                    f *= -69;
                    f += i11;
                    i9 += -135;
                    i9 -= i11;
                    i9 = (int)-12L;
                    d = Test.instanceCount;
                    for (i13 = 1; i13 < 2; i13++) {
                        f = 2206;
                        f = i13;
                        f += i13;
                        Test.instanceCount -= i11;
                    }
                }
            } while (++i10 < 152);
        } else {
            i9 += (int)-1.121017;
        }
        long meth_res = Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d) + i13 + i14 + (b ?
            1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(byte by, int i5) {

        short s=1597;
        int i6=191, i7=34800, i15=-63091, i16=-15562, i17=12, i18=148, i19=-107, iArr[]=new int[N];
        double d1=2.118950, d2=0.104362;
        boolean b1=false, bArr[]=new boolean[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -12L);
        FuzzerUtils.init(iArr, 12);
        FuzzerUtils.init(bArr, true);

        s += (short)(++lArr[(i5 >>> 1) % N]);
        for (i6 = 6; i6 < 234; i6++) {
            if (b1) {
                if (bArr[i6]) continue;
                i5 *= (int)(lMeth(Test.fFld) + d1);
                for (i15 = 1; i15 < 7; ++i15) {
                    i16 >>= (int)Test.instanceCount;
                    i5 += i16;
                    if (i6 != 0) {
                        vMeth_check_sum += by + i5 + s + i6 + i7 + Double.doubleToLongBits(d1) + i15 + i16 + i17 + i18
                            + Double.doubleToLongBits(d2) + i19 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
                            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
                        return;
                    }
                }
            } else if (b1) {
                for (i17 = i6; i17 < 7; i17 += 2) {
                    i16 = (int)Test.instanceCount;
                    Test.instanceCount = (long)d1;
                    for (d2 = i6; d2 < 1; d2++) {
                        i7 *= s;
                        Test.instanceCount /= (i18 | 1);
                    }
                }
            }
        }
        vMeth_check_sum += by + i5 + s + i6 + i7 + Double.doubleToLongBits(d1) + i15 + i16 + i17 + i18 +
            Double.doubleToLongBits(d2) + i19 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr)
            + FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth(int i2, int i3, int i4) {

        byte by1=-31;
        int i20=0, i21=-4, i22=200, i23=62015, i24=-6, i25=25857, i26=-174, iArr1[]=new int[N];
        boolean b2=true;

        FuzzerUtils.init(iArr1, -64);

        vMeth(by1, 27484);
        Test.dFld -= 40;
        i20 = 1;
        while (++i20 < 124) {
            for (i21 = 1; 13 > i21; i21++) {
                Test.fFld += i20;
                if (b2) {
                    i4 = i21;
                }
                for (i23 = 1; i23 < 2; i23++) {
                    i3 -= i24;
                }
                i4 <<= i3;
                iArr1[i21 - 1] -= (int)43.509F;
                i4 = (int)Test.fFld;
                for (i25 = 1; i25 < 2; i25 += 3) {
                    Test.fFld = Test.fFld;
                    Test.instanceCount |= i26;
                }
            }
        }
        long meth_res = i2 + i3 + i4 + by1 + i20 + i21 + i22 + (b2 ? 1 : 0) + i23 + i24 + i25 + i26 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-11, i1=0, i27=69, i28=254, i29=83, i30=138, i31=-65503, i32=-55101, i33=11, iArr2[]=new int[N];
        short s1=15001, sArr[]=new short[N];
        boolean b3=true;

        FuzzerUtils.init(iArr2, 131);
        FuzzerUtils.init(sArr, (short)5744);

        for (i = 2; i < 154; ++i) {
            switch ((((iMeth(i1, i1, i1) >>> 1) % 2) * 5) + 2) {
            case 12:
                if (b3) {
                    for (i27 = 6; 165 > i27; i27++) {
                        iArr2[i27 + 1] |= i;
                        for (i29 = 2; i29 > 1; --i29) {
                            i1 += i29;
                            switch (((i1 >>> 1) % 6) + 110) {
                            case 110:
                                i1 = i1;
                                Test.instanceCount = i28;
                            case 111:
                                if (Test.bFld) break;
                                i28 = (int)2.89F;
                                Test.instanceCount = i30;
                                break;
                            case 112:
                                Test.bFld = false;
                                i30 += (((i29 * Test.instanceCount) + Test.fFld) - i30);
                                Test.dFld = Test.instanceCount;
                            case 113:
                                i1 += (2 + (i29 * i29));
                                break;
                            case 114:
                                i30 += (((i29 * i1) + i30) - s1);
                                break;
                            case 115:
                                iArr2 = iArr2;
                            }
                            sArr[i + 1] -= (short)225L;
                            Test.instanceCount += (i29 * i29);
                            Test.dFld -= Test.instanceCount;
                        }
                        Test.instanceCount += i1;
                        i1 += (int)(3L + (i27 * i27));
                    }
                    for (i31 = 4; i31 < 165; i31++) {
                        i30 |= i32;
                        i33 = 1;
                        while (++i33 < 2) {
                            i32 = i29;
                            Test.instanceCount += i28;
                            Test.bFld = Test.bFld;
                        }
                    }
                } else {
                    i32 |= i31;
                }
                break;
            case 3:
                i1 += (((i * i1) + i33) - i29);
            default:
                Test.instanceCount += (((i * i1) + i29) - i);
            }
        }

        FuzzerUtils.out.println("i i1 i27 = " + i + "," + i1 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("s1 i31 i32 = " + s1 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("i33 b3 iArr2 = " + i33 + "," + (b3 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld = " + (Test.bFld ? 1 : 0));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
