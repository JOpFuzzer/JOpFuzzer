// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-109L;
    public static int iFld=4;
    public static boolean bFld=false;
    public float fFld=-82.796F;
    public volatile boolean bArrFld[]=new boolean[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2, float f1, long l1) {


        i2 = Test.iFld;
        long meth_res = i2 + Float.floatToIntBits(f1) + l1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i, float f, int i1) {

        int i3=23801, i4=-165, i5=136, i6=30984, i7=-117, i8=52892, iArr[]=new int[N];
        double d=-63.69946;
        float fArr[][]=new float[N][N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(fArr, 14.729F);
        FuzzerUtils.init(lArr, -8405614495057708512L);

        i1 = (++iArr[(Test.iFld >>> 1) % N]);
        i1 >>= ((iArr[(-169 >>> 1) % N]++) + (i1 + (8 + (-iMeth(i, f, -8L)))));
        if (Test.bFld) {
            f = f;
            fArr[(i1 >>> 1) % N] = FuzzerUtils.float1array(N, (float)-96.522F);
            i -= i1;
        } else if (Test.bFld) {
            fArr[(-235 >>> 1) % N][(14 >>> 1) % N] -= i1;
            for (i3 = 15; i3 < 290; i3++) {
                for (i5 = i3; i5 < 6; ++i5) {
                    for (i7 = 1; i7 < 1; i7++) {
                        Test.instanceCount = i;
                        f *= Test.instanceCount;
                        iArr = iArr;
                        Test.iFld *= (int)f;
                    }
                }
                i6 += (((i3 * i1) + i1) - f);
            }
        } else if (Test.bFld) {
            lArr[(i8 >>> 1) % N] += (long)d;
        } else {
            i6 = i;
        }
        vMeth1_check_sum += i + Float.floatToIntBits(f) + i1 + i3 + i4 + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d)
            + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l) {

        float f2=-1.217F;
        int i9=1, i10=-10, i11=45182, i12=127, iArr1[]=new int[N];
        double d1=0.103949;
        long l2=-6272992058244277149L;

        FuzzerUtils.init(iArr1, -14);

        vMeth1(Test.iFld, f2, Test.iFld);
        Test.iFld *= (int)f2;
        Test.iFld -= (int)l;
        Test.iFld -= Test.iFld;
        for (i9 = 255; i9 > 11; --i9) {
            l += 18;
        }
        d1 += i9;
        switch (((i9 >>> 1) % 2) + 18) {
        case 18:
            Test.iFld += 227;
            l2 = 1;
            while (++l2 < 134) {
                i10 = (int)f2;
                l >>>= i9;
                for (i11 = (int)(l2); i11 < 12; i11++) {
                    iArr1[(int)(l2)] += i11;
                    Test.instanceCount *= i11;
                }
            }
            break;
        case 19:
            i10 = i10;
            break;
        }
        vMeth_check_sum += l + Float.floatToIntBits(f2) + i9 + i10 + Double.doubleToLongBits(d1) + l2 + i11 + i12 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i13=-12, i14=8299, i15=-21062, i16=12, i17=23392, iArr2[]=new int[N];
        double d2=21.63672, d3=-2.47917, dArr[]=new double[N];
        float f3=0.275F;

        FuzzerUtils.init(iArr2, -9);
        FuzzerUtils.init(dArr, 0.120685);

        vMeth(Test.instanceCount);
        for (i13 = 5; i13 < 194; ++i13) {
            i14 += (((i13 * i14) + Test.instanceCount) - i14);
            d2 = 1;
            do {
                for (f3 = 1; f3 > 1; --f3) {
                    Test.instanceCount -= -171;
                }
                switch ((i13 % 4) + 48) {
                case 48:
                    iArr2 = iArr2;
                case 49:
                    for (i16 = 1; i16 < 1; i16++) {
                        i15 += (((i16 * i16) + i17) - Test.instanceCount);
                        switch ((i13 % 5) + 21) {
                        case 21:
                            Test.instanceCount += i14;
                            if (Test.bFld) continue;
                            i15 |= -9;
                        case 22:
                            dArr[(int)(d2)] = Test.instanceCount;
                            i15 += (int)(15096L + (i16 * i16));
                            iArr2[i13] -= (int)f3;
                            break;
                        case 23:
                            Test.instanceCount += 149L;
                            Test.iFld = 11;
                            Test.bFld = Test.bFld;
                            fFld += Test.instanceCount;
                        case 24:
                        case 25:
                            Test.instanceCount = Test.instanceCount;
                            Test.bFld = Test.bFld;
                            switch (((Test.iFld >>> 1) % 4) + 86) {
                            case 86:
                                Test.iFld = i13;
                                break;
                            case 87:
                                i17 += (i16 * i16);
                                Test.iFld *= (int)Test.instanceCount;
                                i17 -= (int)f3;
                                Test.iFld >>= -19312;
                                break;
                            case 88:
                                fFld = i13;
                            case 89:
                                i17 = i13;
                                break;
                            default:
                                iArr2[i13] += (int)d3;
                            }
                            break;
                        }
                    }
                    break;
                case 50:
                case 51:
                    bArrFld[(int)(d2)] = Test.bFld;
                    break;
                }
            } while (++d2 < 133);
        }

        FuzzerUtils.out.println("i13 i14 d2 = " + i13 + "," + i14 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("f3 i15 i16 = " + Float.floatToIntBits(f3) + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 d3 iArr2 = " + i17 + "," + Double.doubleToLongBits(d3) + "," +
            FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("fFld bArrFld = " + Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}