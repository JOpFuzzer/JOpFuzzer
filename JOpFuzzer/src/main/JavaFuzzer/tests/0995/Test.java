// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:03 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3573002477L;
    public volatile int iFld=56524;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(long l1) {

        int i6=-1952, i7=249, i8=-57, i9=34364, i10=-62, i11=-13;
        short s1=-6921;
        float f2=78.791F;
        double d1=77.64411;

        for (i6 = 2; i6 < 380; ++i6) {
            i7 += (((i6 * i7) + s1) - i6);
            for (i8 = 1; i8 < 4; i8 += 3) {
                switch ((i8 % 4) + 79) {
                case 79:
                    f2 += i8;
                    i9 += i8;
                    Test.iArrFld = Test.iArrFld;
                    break;
                case 80:
                    i9 = i9;
                case 81:
                    d1 *= 0L;
                    break;
                case 82:
                    l1 -= i6;
                    break;
                default:
                    switch ((((i8 >>> 1) % 2) * 5) + 83) {
                    case 92:
                        for (i10 = 4; i10 > 1; i10 -= 3) {
                            i11 += (-87 + (i10 * i10));
                            Test.iArrFld[i6] += -182;
                            if (false) continue;
                        }
                    case 88:
                        d1 *= d1;
                        break;
                    }
                }
            }
        }
        long meth_res = l1 + i6 + i7 + s1 + i8 + i9 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) + i10 +
            i11;
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l, float f, float f1) {

        int i4=-80, i5=-18013, i12=-7, i13=-61515;
        double d2=-1.10687;
        byte by1=42;
        float f3=2.1019F;
        short s2=-11183;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 186L);

        for (i4 = 12; i4 < 373; ++i4) {
            lMeth1(l);
            Test.instanceCount = (long)d2;
            l = -8817;
            d2 *= 174;
            i5 -= -197;
            by1 &= (byte)l;
            i5 >>= i5;
            for (i12 = 1; 5 > i12; ++i12) {
                switch ((i12 % 10) + 50) {
                case 50:
                    Test.iArrFld[(i12 >>> 1) % N] -= 55858;
                    i5 += i12;
                    f3 = 1;
                    do {
                        if (Test.bFld) continue;
                        s2 = (short)i12;
                    } while (++f3 < 2);
                    break;
                case 51:
                    i13 = i13;
                    break;
                case 52:
                case 53:
                    lArr[i12] -= i5;
                    break;
                case 54:
                    i5 = i5;
                    break;
                case 55:
                    i5 *= i13;
                case 56:
                    i13 += (i12 - by1);
                case 57:
                    f = Test.instanceCount;
                    break;
                case 58:
                    d2 -= i5;
                case 59:
                    i5 >>>= 146;
                    break;
                default:
                    Test.instanceCount -= (long)f3;
                }
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i4 + i5 +
            Double.doubleToLongBits(d2) + by1 + i12 + i13 + Float.floatToIntBits(f3) + s2 + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth(int i1) {

        short s=-11976;
        int i2=-22164, i3=-126, i14=-10, i15=4, i16=-110;
        float f4=1.983F;
        double d3=0.127651;

        i1 += s;
        for (i2 = 6; i2 < 263; ++i2) {
            vMeth(Test.instanceCount, f4, f4);
            i1 += (((i2 * i3) + i2) - Test.instanceCount);
            for (d3 = 1; d3 < 6; d3++) {
                byte by2=22;
                Test.instanceCount -= i14;
                switch (((i2 % 10) * 5) + 75) {
                case 98:
                    Test.instanceCount = by2;
                    Test.bFld = Test.bFld;
                    if (Test.bFld) continue;
                    for (i15 = 1; i15 < 2; ++i15) {
                        Test.instanceCount = -4;
                        i14 &= i2;
                        Test.instanceCount ^= -201L;
                        Test.instanceCount *= i2;
                    }
                case 115:
                    i14 = i3;
                    break;
                case 76:
                    f4 = Test.instanceCount;
                    break;
                case 79:
                    i14 += (int)((long)d3 ^ i15);
                    break;
                case 89:
                    i1 ^= by2;
                    break;
                case 114:
                    i14 &= i16;
                    break;
                case 91:
                    i16 += (int)(d3 * i3);
                    break;
                case 84:
                    Test.iArrFld[i2 - 1] ^= i14;
                    break;
                case 107:
                    i3 *= (int)55.744F;
                    break;
                case 123:
                    if (true) continue;
                    break;
                }
            }
        }
        long meth_res = i1 + s + i2 + i3 + Float.floatToIntBits(f4) + Double.doubleToLongBits(d3) + i14 + i15 + i16;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=8, i17=-114;
        double d=-2.8929;
        byte by=-117;
        float f5=86.757F;
        long l2=-66L;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-470);

        i = 1;
        while (++i < 263) {
            short s3=32294;
            switch ((i % 10) + 18) {
            case 18:
                iFld = (int)(((-Math.abs(d)) + Test.instanceCount) + 11318);
                iFld -= Math.min((int)(by + (Test.instanceCount - i)), (int)(lMeth(iFld) + -10));
                iFld = -62092;
                break;
            case 19:
                iFld = 249;
                if (Test.bFld) {
                    iFld += i;
                } else {
                    iFld += (i * iFld);
                    Test.instanceCount = 12;
                    iFld &= (int)Test.instanceCount;
                }
                i17 = 1;
                while (++i17 < 96) {
                    sArr[i17 + 1] += (short)f5;
                    if (true) continue;
                    l2 = 1;
                    do {
                        f5 += (l2 + i17);
                        iFld >>= by;
                        by += (byte)iFld;
                        Test.instanceCount += i;
                    } while (++l2 < 1);
                }
                break;
            case 20:
                iFld += (i * f5);
                iFld = 5;
                break;
            case 21:
                iFld += i;
                Test.bFld = true;
                s3 *= (short)i17;
                f5 += (((i * Test.instanceCount) + i) - i17);
                break;
            case 22:
                by = (byte)iFld;
                try {
                    iFld = (iFld / i17);
                    iFld = (-136 / Test.iArrFld[i - 1]);
                    iFld = (Test.iArrFld[i + 1] % -14304);
                } catch (ArithmeticException a_e) {}
                break;
            case 23:
                iFld %= (int)(Test.instanceCount | 1);
                if (Test.bFld) break;
                iFld += i;
            case 24:
                iFld = i;
                break;
            case 25:
                f5 += (9 + (i * i));
                break;
            case 26:
                Test.instanceCount <<= i17;
            case 27:
                iFld += (i | i17);
                break;
            default:
                iFld *= i;
            }
        }

        FuzzerUtils.out.println("i d by = " + i + "," + Double.doubleToLongBits(d) + "," + by);
        FuzzerUtils.out.println("i17 f5 l2 = " + i17 + "," + Float.floatToIntBits(f5) + "," + l2);
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.bFld = " + Test.instanceCount + "," + iFld + "," +
            (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
