// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=2L;
    public static float fFld=67.737F;
    public static double dFld=2.130328;
    public static volatile int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -203);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i15) {

        int i16=-63277, i17=-31, i18=-48015, i19=0, i20=13, iArr1[]=new int[N];
        boolean b1=false;
        short s1=-23947;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr1, 4);
        FuzzerUtils.init(fArr, 1.889F);

        for (i16 = 3; 188 > i16; ++i16) {
            l = l;
            l = l;
            Test.instanceCount = i17;
            i18 = 1;
            while (++i18 < 9) {
                iArr1[i18] *= i17;
                if (true) {
                    switch ((i18 % 1) + 119) {
                    case 119:
                        for (i19 = 1; i19 < 1; i19++) {
                            switch (((i19 >>> 1) % 8) + 4) {
                            case 4:
                            case 5:
                                fArr[i16 + 1] = i20;
                                break;
                            case 6:
                                iArr1[i19 + 1] = i16;
                                i20 ^= i15;
                                if (b1) continue;
                                i20 -= i16;
                                break;
                            case 7:
                                iArr1[i19 - 1] -= (int)Test.instanceCount;
                                break;
                            case 8:
                                i20 = s1;
                            case 9:
                                s1 -= (short)i17;
                            case 10:
                                i15 += (((i19 * Test.instanceCount) + i20) - i20);
                            case 11:
                                s1 += (short)(i19 - Test.fFld);
                            }
                        }
                        break;
                    default:
                        i20 >>= (int)Test.instanceCount;
                    }
                    vMeth1_check_sum += l + i15 + i16 + i17 + i18 + i19 + i20 + (b1 ? 1 : 0) + s1 +
                        FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                } else if (b1) {
                    Test.fFld -= Test.instanceCount;
                } else {
                    s1 *= (short)i20;
                }
            }
        }
        vMeth1_check_sum += l + i15 + i16 + i17 + i18 + i19 + i20 + (b1 ? 1 : 0) + s1 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static long lMeth(boolean b, int i8, int i9) {

        short s=18109;
        int i10=45, i11=12069, i12=-40606, i13=-9, i14=2, iArr[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 9);
        FuzzerUtils.init(lArr1, 2L);

        Test.instanceCount -= (long)((iArr[(-23887 >>> 1) % N] * (-194 / (((long)(--Test.fFld)) | 1))) *
            (Test.instanceCount + (i9--)));
        Test.dFld += (Integer.reverseBytes(2719 * (i9 + i8)) + iArr[(i9 >>> 1) % N]);
        i9 <<= (int)((++Test.fFld) + ((7 * (-1654532241984104953L - (i8 - s))) * (i9 - i9)));
        iArr[(-241 >>> 1) % N] = (int)(i9 = (int)Test.instanceCount);
        for (i10 = 1; 304 > i10; i10 += 3) {
            i12 = 1;
            while (++i12 < 15) {
                try {
                    i9 = (-27643 / i9);
                    i8 = (i9 / i9);
                    i8 = (-237 % i8);
                } catch (ArithmeticException a_e) {}
                for (i13 = i10; i13 < 1; i13++) {
                    i9 += (int)(lArr1[i13]++);
                    Test.instanceCount += i9;
                    Test.fFld += ((long)i13 ^ (long)Test.instanceCount);
                    vMeth1(Test.instanceCount, i12);
                    i9 = i11;
                }
                Test.fFld += (-36417 + (i12 * i12));
                i14 = i11;
            }
        }
        long meth_res = (b ? 1 : 0) + i8 + i9 + s + i10 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(int i6, int i7) {

        short s2=25576;

        i7 <<= i6;
        Test.fFld -= (Test.fFld--);
        i6 >>= (int)((lMeth(false, 50481, i7) * i7) - i6);
        i7 += s2;
        i6 <<= i7;
        vMeth_check_sum += i6 + i7 + s2;
    }

    public void mainTest(String[] strArr1) {

        int i=-148, i1=101, i2=8, i3=26618, i4=-9, i5=-44098, i21=16667, i22=-65, i23=-25698, i24=12, i25=-38,
            iArr2[]=new int[N];
        boolean b2=false;
        short s3=23478;
        long l1=-14L, lArr[]=new long[N];
        byte by=-123;

        FuzzerUtils.init(lArr, -13L);
        FuzzerUtils.init(iArr2, 7);

        for (i = 5; i < 278; ++i) {
            i1 += i;
            for (i2 = 2; 92 > i2; ++i2) {
                for (i4 = 1; i4 < 2; i4++) {
                    i1 += (i4 * i4);
                    lArr[i2 - 1] += (long)((--Test.fFld) - ((i3++) + (i2 - i5)));
                    i3 *= (i3--);
                    vMeth(0, i1);
                    Test.fFld *= -777293102L;
                    Test.iArrFld[i4] += i4;
                    Test.instanceCount >>>= i5;
                    if (b2) continue;
                    s3 = (short)i21;
                }
                iArr2[i2] -= (int)Test.dFld;
                i21 += (int)Test.instanceCount;
                i3 += (((i2 * i3) + i5) - Test.instanceCount);
                Test.iArrFld[i2] = i1;
                for (l1 = 1; l1 < 2; l1++) {
                    Test.iArrFld[i2 - 1] += s3;
                    b2 = b2;
                    i1 += i1;
                    i21 += (int)l1;
                }
                i21 >>= by;
                Test.instanceCount = i21;
            }
        }
        i5 -= i4;
        for (i23 = 19; 314 > i23; ++i23) {
            i25 -= i1;
        }
        i22 -= (int)l1;
        Test.fFld += -126;
        i22 += (int)Test.instanceCount;

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("b2 s3 i21 = " + (b2 ? 1 : 0) + "," + s3 + "," + i21);
        FuzzerUtils.out.println("l1 i22 by = " + l1 + "," + i22 + "," + by);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("lArr iArr2 = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
