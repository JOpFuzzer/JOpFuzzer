// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-134L;
    public static volatile byte byFld=-15;
    public float fFld=102.926F;
    public static boolean bFld=true;
    public int iFld=-4;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 9.70396);
        FuzzerUtils.init(Test.iArrFld, -9);
    }

    public static long sMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i7, boolean b, long l1) {

        float f=0.572F;

        i7 *= 14;
        f = i7;
        i7 *= (int)f;
        vMeth_check_sum += i7 + (b ? 1 : 0) + l1 + Float.floatToIntBits(f);
    }

    public static double dMeth(long l, int i4, int i5) {

        int i6=-220, i8=-11, i9=-32402, i10=139, iArr1[]=new int[N];
        boolean b1=true;
        float f1=19.184F;
        short s1=-15007;
        long l2=-6L, lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 0);
        FuzzerUtils.init(lArr, 6L);

        i6 = 1;
        do {
            i4 += i6;
            vMeth(i5, b1, l);
            i5 = (int)Test.instanceCount;
            i4 = i5;
            iArr1[i6] <<= (int)7389658239970919459L;
            iArr1[i6] -= (int)f1;
        } while (++i6 < 148);
        s1 = (short)l;
        for (i8 = 1; i8 < 132; i8++) {
            if (b1) {
                for (l2 = i8; l2 < 12; l2++) {
                    Test.instanceCount += l2;
                    i4 += (int)(l2 + l2);
                    lArr[(int)(l2 - 1)] = -3539;
                    i4 += (int)(((l2 * i8) + Test.byFld) - l);
                }
            } else if (b1) {
                i10 += i5;
            }
        }
        long meth_res = l + i4 + i5 + i6 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + s1 + i8 + i9 + l2 + i10 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public short sMeth(short s) {

        int i2=19798, i3=-10765, i11=83, i12=6, i13=-21333, iArr[]=new int[N];
        float f2=0.661F, fArr[]=new float[N];
        double d1=113.8834;

        FuzzerUtils.init(iArr, 9);
        FuzzerUtils.init(fArr, -110.88F);

        for (i2 = 10; 176 > i2; i2 += 3) {
            iArr[i2] = (int)(dMeth(Test.instanceCount, -14, i3) - f2);
            fArr[i2 - 1] = -35262;
            i3 = i2;
            i3 = i2;
            for (i11 = 28; 1 < i11; i11 -= 3) {
                i3 += (-6 + (i11 * i11));
                i12 = (int)2621532122676664868L;
                Test.instanceCount = i12;
                for (d1 = i11; 4 > d1; d1++) {
                    Test.dArrFld[(int)(d1)] -= i13;
                    Test.byFld -= (byte)f2;
                    Test.instanceCount = i3;
                    i13 *= (int)Test.instanceCount;
                    f2 = Test.instanceCount;
                }
            }
        }
        long meth_res = s + i2 + i3 + Float.floatToIntBits(f2) + i11 + i12 + Double.doubleToLongBits(d1) + i13 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=1, i1=-27362, i14=-21, i15=225, i16=206, i17=77, i18=-19;
        double d=-1.12049;
        short s2=15589;
        boolean b2=false;

        for (i = 4; i < 203; i++) {
            d = (234 * (sMeth(s2) % 124.442F));
            for (i14 = 6; i14 < 126; i14++) {
                for (i16 = 1; 2 > i16; ++i16) {
                    i17 = (int)-8L;
                    fFld -= i17;
                    if (Test.bFld) continue;
                    i15 >>>= i14;
                    Test.instanceCount /= (i14 | 1);
                    i15 += i16;
                    i1 += (i16 * i17);
                    switch ((i14 % 5) + 23) {
                    case 23:
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)4);
                        d -= s2;
                        switch (((i16 % 1) * 5) + 124) {
                        case 128:
                        }
                    case 24:
                        d -= s2;
                        break;
                    case 25:
                        i15 -= 31993;
                        i15 = (int)Test.instanceCount;
                        i15 *= (int)129L;
                        break;
                    case 26:
                        i1 += i16;
                        Test.byFld *= (byte)i14;
                        i17 *= (int)Test.instanceCount;
                        break;
                    case 27:
                        switch ((i16 % 2) + 95) {
                        case 95:
                            i1 += i1;
                            b2 = b2;
                            switch ((i16 % 8) + 62) {
                            case 62:
                                switch (((i14 % 9) * 5) + 76) {
                                case 83:
                                    i15 += (i16 | i);
                                case 110:
                                    d *= -7;
                                    i17 += (i16 + i17);
                                    break;
                                case 121:
                                    i17 = (int)Test.instanceCount;
                                    break;
                                case 98:
                                    i1 <<= -3;
                                    break;
                                case 97:
                                case 111:
                                case 87:
                                    i15 *= 7;
                                case 114:
                                    i17 += (i16 ^ i);
                                    break;
                                case 104:
                                    Test.dArrFld[i14] -= i15;
                                    break;
                                }
                                break;
                            case 63:
                                iFld += (((i16 * i) + i1) - Test.byFld);
                                break;
                            case 64:
                                i18 -= (int)Test.instanceCount;
                                break;
                            case 65:
                                try {
                                    i1 = (95 % i16);
                                    Test.iArrFld[i] = (i17 / i14);
                                    i1 = (-47162 % iFld);
                                } catch (ArithmeticException a_e) {}
                                break;
                            case 66:
                                i18 <<= i;
                                break;
                            case 67:
                                d += i15;
                                break;
                            case 68:
                                fFld = i17;
                            case 69:
                                if (Test.bFld) break;
                                break;
                            }
                            break;
                        case 96:
                        }
                        break;
                    default:
                        Test.instanceCount = i1;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("s2 i14 i15 = " + s2 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 b2 = " + i16 + "," + i17 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i18 = " + i18);

        FuzzerUtils.out.println("Test.instanceCount Test.byFld fFld = " + Test.instanceCount + "," + Test.byFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.bFld iFld Test.dArrFld = " + (Test.bFld ? 1 : 0) + "," + iFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

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