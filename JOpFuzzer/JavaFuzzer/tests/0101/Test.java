// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=145L;
    public static double dFld=26.106530;
    public static int iFld=4237;
    public long lFld=41424L;
    public static double dFld1=-2.34250;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -126);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, long l1, int i8) {

        short s2=21788;
        int i9=-60461, i10=-200, i11=237, i12=3, i13=193, i14=-64546, iArr1[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr1, -2);

        s2 += (short)i8;
        iArr1[(i8 >>> 1) % N] += i8;
        i8 += i8;
        for (i9 = 19; 385 > i9; i9++) {
            for (i11 = 5; i11 > 1; i11--) {
                i7 += i11;
                i12 = i7;
                if (i8 != 0) {
                    vMeth1_check_sum += i7 + l1 + i8 + s2 + i9 + i10 + i11 + i12 + i13 + i14 + (b ? 1 : 0) +
                        FuzzerUtils.checkSum(iArr1);
                    return;
                }
            }
            i12 += (i9 * i9);
            l1 += i12;
            Test.instanceCount += (((i9 * i11) + l1) - Test.instanceCount);
            for (i13 = 1; i13 < 5; ++i13) {
                l1 += (i13 + Test.instanceCount);
                i14 = 23;
                if (b) continue;
            }
        }
        vMeth1_check_sum += i7 + l1 + i8 + s2 + i9 + i10 + i11 + i12 + i13 + i14 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(short s1) {

        int i15=173, i16=-8, i17=6, i18=130, i19=76, i20=-37683, i21=-241;
        double d=-96.44504;
        boolean b1=false, bArr[]=new boolean[N];
        long lArr[]=new long[N];
        short sArr[]=new short[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(lArr, 0L);
        FuzzerUtils.init(sArr, (short)-12063);
        FuzzerUtils.init(fArr, -1.404F);

        vMeth1(-14, Test.instanceCount, i15);
        for (i16 = 178; i16 > 11; --i16) {
            i15 = 227;
            Test.iArrFld[i16] = i16;
            i17 <<= (int)Test.instanceCount;
        }
        for (i18 = 6; i18 < 230; i18++) {
            switch (((i18 % 4) * 5) + 90) {
            case 100:
                d = 7;
                while (--d > 0) {
                    for (i20 = 1; i18 < i20; i20 -= 3) {
                        Test.instanceCount <<= i18;
                        bArr[i20 - 1] = b1;
                        Test.iArrFld = Test.iArrFld;
                    }
                }
            case 108:
                s1 += (short)(i18 ^ i16);
                lArr[i18] -= i19;
                sArr[i18 - 1] *= (short)d;
                break;
            case 106:
                fArr[i18 + 1] -= -2.488F;
                break;
            case 98:
                i17 *= i16;
                break;
            default:
                if (b1) break;
            }
        }
        vMeth_check_sum += s1 + i15 + i16 + i17 + i18 + i19 + Double.doubleToLongBits(d) + i20 + i21 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(long l, short s) {

        int i2=-2600, i3=-20, i4=-1, i5=94, i6=-3103, iArr[]=new int[N];
        float f=119.481F;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, -124);
        FuzzerUtils.init(dArr, -40.14057);

        for (i2 = 311; i2 > 12; --i2) {
            i3 = (++i3);
            i3 += (int)((--Test.instanceCount) * (i3 + i3));
            for (i4 = 6; i4 > 1; --i4) {
                i5 += (((i4 * f) + i4) - f);
                i3 += (-23267 + (i4 * i4));
                i3 += (13 + (i4 * i4));
            }
            iArr[i2] = i2;
            i5 += (int)(i5 = (int)(Math.abs(Test.instanceCount) + i6));
            i3 += (i2 * i2);
            Test.dFld += i6;
            vMeth(s);
            i5 = i6;
        }
        i3 += Test.iFld;
        dArr[(i5 >>> 1) % N] -= Test.dFld;
        long meth_res = l + s + i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=233, i1=-7, i22=9, i23=14, i24=28166, i25=-13, i26=12;
        short s3=-17031;
        float f1=56.932F;
        boolean b2=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -11007L);

        i = 1;
        do {
            if (b2) {
                i1 += (int)(Test.instanceCount - Math.abs(iMeth(Test.instanceCount, s3)));
                i22 = i22;
                for (i23 = 2; i23 < 70; i23++) {
                    for (i25 = 1; i25 < 2; i25++) {
                        byte by=42;
                        int i27=25641;
                        Test.iFld <<= (int)Test.instanceCount;
                        by |= (byte)41501;
                        i1 += (((i25 * i26) + by) - s3);
                        switch (((i % 5) * 5) + 40) {
                        case 47:
                            lArr1[i + 1] = -7;
                            Test.instanceCount += (i25 * i25);
                        case 46:
                            f1 = i;
                        case 48:
                            i22 <<= -58654;
                            break;
                        case 42:
                            Test.instanceCount += (i25 * i25);
                            Test.iFld = (int)lFld;
                            Test.iFld >>= (int)Test.instanceCount;
                            break;
                        case 45:
                            lFld += i22;
                            i24 -= (int)Test.dFld1;
                            i24 = i27;
                            i22 *= (int)-60920L;
                            break;
                        }
                        Test.iArrFld[i23 + 1] += (int)f1;
                        Test.instanceCount = i23;
                        i1 += (i25 * i25);
                        lFld += lFld;
                        i1 = (int)Test.instanceCount;
                    }
                    f1 += i23;
                }
            } else {
                if (b2) break;
                i26 -= i24;
            }
            lFld += 13754;
        } while (++i < 358);

        FuzzerUtils.out.println("i i1 s3 = " + i + "," + i1 + "," + s3);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 f1 = " + i25 + "," + i26 + "," + Float.floatToIntBits(f1));
        FuzzerUtils.out.println("b2 lArr1 = " + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("lFld Test.dFld1 Test.iArrFld = " + lFld + "," + Double.doubleToLongBits(Test.dFld1) +
            "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}