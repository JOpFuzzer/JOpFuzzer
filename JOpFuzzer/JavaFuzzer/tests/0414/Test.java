// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:50 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=13L;
    public static short sFld=-32048;
    public static float fFld=-2.431F;

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i3, int i4, long l) {

        long l1=84L;
        int i5=-7, i6=44092, i7=-573, i8=-5;

        Test.sFld = (short)l;
        for (l1 = 257; l1 > 9; --l1) {
            for (i6 = 1; i6 < 7; ++i6) {
                i8 = 1;
                do {
                    Test.instanceCount += (((i8 * i8) + Test.instanceCount) - i8);
                    Test.instanceCount <<= i7;
                    i4 -= (int)-155413686085613935L;
                    i4 -= -55426;
                    i4 = i8;
                    i4 += (int)Test.instanceCount;
                    Test.sFld |= (short)i8;
                    i7 = 123;
                    i7 |= 13;
                } while (++i8 < 2);
            }
            i7 >>= i4;
            Test.sFld = (short)Test.instanceCount;
        }
        vMeth_check_sum += i3 + i4 + l + l1 + i5 + i6 + i7 + i8;
    }

    public static double dMeth(int i1, int i2) {

        byte by=62;
        int i9=33517, i10=58, i11=-30154, i12=215, i13=-34874, i14=-107, i15=4, iArr[]=new int[N];
        double d=1.2107, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 2.24233);
        FuzzerUtils.init(iArr, -2);

        i1 = (int)(((by--) + (-145 + (i2 * i1))) - (-240942089865307768L + (i1 - -43883)));
        vMeth(i1, i1, Test.instanceCount);
        for (i9 = 16; i9 < 394; ++i9) {
            i1 = (int)Test.fFld;
            Test.fFld = i10;
            i1 -= i2;
            dArr[i9 - 1] = d;
        }
        i1 -= (int)24972L;
        for (i11 = 10; 380 > i11; i11++) {
            switch (((i11 % 5) * 5) + 23) {
            case 36:
                for (i13 = i11; i13 < 5; ++i13) {
                    by &= (byte)7;
                    i15 = 1;
                    do {
                        if (true) break;
                    } while (++i15 < 1);
                    iArr = iArr;
                }
                break;
            case 41:
                i14 >>>= i1;
                break;
            case 40:
            case 43:
                i1 = (int)Test.instanceCount;
                break;
            case 38:
                i2 = (int)Test.fFld;
                break;
            default:
                i2 = (int)Test.instanceCount;
            }
        }
        long meth_res = i1 + i2 + by + i9 + i10 + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(int i) {


        i += (int)dMeth(i, 3);
        long meth_res = i;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=-53985, i17=13, i18=-70, i19=-4, i20=-4, i21=-14716, i22=55513, i23=23306, iArr1[]=new int[N];
        double d1=124.2885;
        boolean b=false, bArr[]=new boolean[N];
        byte by1=-42, byArr[]=new byte[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -5);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, 8907238655920426832L);
        FuzzerUtils.init(byArr, (byte)97);

        Test.instanceCount = (iMeth(-14) - Test.instanceCount);
        for (i16 = 2; i16 < 151; ++i16) {
            d1 -= i17;
            i17 += i16;
            iArr1[i16 - 1] = (int)Test.instanceCount;
            i17 += (i16 + i16);
            i18 = 1;
            while (++i18 < 168) {
                iArr1 = iArr1;
                bArr[(i17 >>> 1) % N] = b;
                for (i19 = 1; i19 < 1; i19++) {
                    Test.instanceCount += (((i19 * i20) + i16) - i18);
                    i17 /= (int)(i19 | 1);
                    iArr1 = iArr1;
                    if (b) {
                        lArr[i19 - 1] = i16;
                        iArr1 = iArr1;
                        iArr1[(i21 >>> 1) % N] <<= i19;
                    } else {
                        i21 *= (int)Test.instanceCount;
                        Test.fFld -= -519267824L;
                    }
                    if (false) break;
                }
                if (b) {
                    i20 += (int)Test.instanceCount;
                    i21 >>>= (int)-14L;
                    lArr[i16] = i20;
                } else {
                    iArr1[i16] ^= i17;
                    i17 = i17;
                    switch ((i18 % 8) + 121) {
                    case 121:
                        for (i22 = 1; i22 < 1; ++i22) {
                            i20 += (int)Test.instanceCount;
                        }
                        b = false;
                        break;
                    case 122:
                        by1 += (byte)-929196045L;
                        break;
                    case 123:
                        if (b) break;
                    case 124:
                        Test.fFld *= 114.574F;
                        break;
                    case 125:
                        i17 >>= (int)-8L;
                    case 126:
                        i20 &= i20;
                        break;
                    case 127:
                        byArr = byArr;
                        break;
                    case 128:
                    }
                }
            }
        }

        FuzzerUtils.out.println("i16 i17 d1 = " + i16 + "," + i17 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i18 b i19 = " + i18 + "," + (b ? 1 : 0) + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 by1 iArr1 = " + i23 + "," + by1 + "," + FuzzerUtils.checkSum(iArr1));
        FuzzerUtils.out.println("bArr lArr byArr = " + FuzzerUtils.checkSum(bArr) + "," + FuzzerUtils.checkSum(lArr) +
            "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}