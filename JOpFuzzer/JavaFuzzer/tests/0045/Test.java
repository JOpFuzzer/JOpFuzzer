// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:42 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-11L;
    public static int iFld=8;
    public static volatile float fFld=0.792F;
    public byte byFld=-77;
    public static long lArrFld[][]=new long[N][N];
    public static volatile int iArrFld[]=new int[N];
    public boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, 9203970614803092326L);
        FuzzerUtils.init(Test.iArrFld, 58307);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i8=-161, i9=-158, i10=-233, i11=-243, i12=-60462, i13=114;
        byte by=66;
        boolean b=true;
        double d=62.50771;

        for (i8 = 285; i8 > 11; --i8) {
            i10 = 1;
            do {
                Test.iFld += (int)(-1.800F + (i10 * i10));
                Test.instanceCount *= -140;
                Test.iFld = (int)Test.fFld;
                i9 = -74;
                for (i11 = 1; i11 < 1; ++i11) {
                    Test.iFld -= (int)7077537231238539115L;
                }
                by -= (byte)i13;
                if (b) break;
                i9 -= i12;
                Test.lArrFld[i10] = Test.lArrFld[i8];
            } while (++i10 < 6);
            if (i8 != 0) {
                vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + by + i13 + (b ? 1 : 0) + Double.doubleToLongBits(d);
                return;
            }
            Test.instanceCount += Test.instanceCount;
        }
        d *= i11;
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + by + i13 + (b ? 1 : 0) + Double.doubleToLongBits(d);
    }

    public static void vMeth(long l1) {

        int i14=-1, i15=45066, i16=67, i17=-225, i18=-117;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)16290);

        vMeth1();
        i14 = 1;
        do {
            for (i15 = 1; 10 > i15; ++i15) {
                sArr[i14] += (short)Test.iFld;
                i16 <<= i15;
                l1 >>>= i14;
                Test.iFld += i14;
            }
            Test.iArrFld = Test.iArrFld;
            Test.iFld = (int)Test.fFld;
            Test.iFld += i16;
            Test.instanceCount += (i14 * Test.iFld);
            for (i17 = 1; i17 < 10; i17++) {
                i16 = Test.iFld;
                Test.iArrFld[i14] += (int)-3268571846L;
                Test.iArrFld[i14] = Test.iFld;
            }
        } while (++i14 < 166);
        vMeth_check_sum += l1 + i14 + i15 + i16 + i17 + i18 + FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth(int i5, float f) {

        int i6=52272, i7=5;

        for (i6 = 2; 304 > i6; i6++) {
            vMeth(Test.instanceCount);
        }
        long meth_res = i5 + Float.floatToIntBits(f) + i6 + i7;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-4, i1=55, i2=7, i3=5720, i4=-135, i19=-5, i20=127;
        long l=-3478886696L;
        boolean b1=false;
        short s=-15712, sArr1[]=new short[N];
        float fArr[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr, 2.894F);
        FuzzerUtils.init(sArr1, (short)-5549);
        FuzzerUtils.init(dArr, 41.59667);

        for (i = 3; 254 > i; i++) {
            Test.instanceCount <<= (++i1);
            Test.iFld += (int)((l--) - (-Math.max(l, l)));
            i1 += (i * i);
            for (i2 = 5; i2 < 100; ++i2) {
                l += (i2 * i2);
                i4 = 1;
                do {
                    i3 |= (iMeth(-7785, Test.fFld) * i1);
                    i1 -= i4;
                } while (++i4 < 2);
                Test.iFld = (int)Test.fFld;
                for (i19 = i; i19 < 2; ++i19) {
                    long l2=-149L;
                    i1 += (((i19 * i4) + i20) - i);
                    Test.instanceCount %= (Test.instanceCount | 1);
                    Test.lArrFld[i19 + 1][i + 1] = l;
                    switch ((((i >>> 1) % 1) * 5) + 29) {
                    case 32:
                        i3 = i19;
                        break;
                    }
                    Test.instanceCount >>= i4;
                    switch ((i * 5) + 121) {
                    case 358:
                        i20 = i;
                        break;
                    case 158:
                        i3 += byFld;
                        i20 += (((i19 * i20) + i1) - l);
                        break;
                    case 368:
                        byFld *= (byte)Test.instanceCount;
                        i3 = (int)Test.instanceCount;
                        Test.fFld *= 13;
                        i1 = (int)Test.fFld;
                        break;
                    case 149:
                        l += i19;
                        break;
                    case 428:
                        switch ((i19 % 10) + 62) {
                        case 62:
                            Test.iFld = (int)l2;
                            break;
                        case 63:
                            if (false) continue;
                            i20 += (((i19 * i20) + i2) - i);
                            break;
                        case 64:
                            Test.iFld = i;
                            break;
                        case 65:
                            Test.iFld += (i19 * i19);
                            break;
                        case 66:
                            Test.iArrFld[i19 + 1] = Test.iFld;
                            break;
                        case 67:
                            i20 = Test.iFld;
                            break;
                        case 68:
                            l2 = (long)Test.fFld;
                            break;
                        case 69:
                            i1 |= (int)l2;
                            break;
                        case 70:
                            Test.iFld += (i19 | l2);
                            break;
                        case 71:
                            if (b1) continue;
                            break;
                        default:
                            l2 += (i19 ^ i20);
                        }
                        break;
                    case 244:
                        if (b1) break;
                        break;
                    case 459:
                        Test.fFld *= i2;
                        break;
                    case 219:
                        i20 = Test.iFld;
                        break;
                    case 135:
                    case 441:
                        i1 <<= i2;
                        break;
                    case 228:
                        bArrFld[i2][i19 - 1] = b1;
                    case 336:
                        i20 -= i1;
                        break;
                    case 304:
                        i1 += i1;
                        break;
                    case 323:
                        i3 = (int)Test.fFld;
                    case 267:
                        if (b1) continue;
                    case 391:
                        i1 += i4;
                        break;
                    case 430:
                        s = (short)i;
                        break;
                    case 235:
                        i1 += i19;
                        break;
                    case 269:
                        Test.fFld += l;
                        break;
                    case 237:
                        i1 -= 1;
                        break;
                    case 157:
                        Test.lArrFld[i2] = Test.lArrFld[i19 - 1];
                        break;
                    case 365:
                        i20 = i20;
                        break;
                    case 357:
                        l2 &= 184L;
                    case 310:
                        Test.lArrFld[i19 + 1][i - 1] >>= l2;
                        break;
                    case 122:
                        Test.iFld -= i;
                    case 262:
                        fArr[i19 + 1] = Test.iFld;
                        break;
                    case 152:
                        i20 = (int)Test.fFld;
                        break;
                    case 409:
                    case 227:
                        Test.iArrFld[(i3 >>> 1) % N] = (int)3739084301303339513L;
                        break;
                    case 246:
                        i3 ^= i4;
                    case 385:
                        s = (short)i1;
                        break;
                    case 213:
                    case 450:
                        Test.lArrFld[i][i2 + 1] -= i19;
                    case 182:
                        i3 += (i19 - i1);
                        break;
                    case 211:
                        Test.fFld += i19;
                        break;
                    case 334:
                        sArr1[i19] -= (short)Test.fFld;
                        break;
                    case 462:
                        i1 += i19;
                        break;
                    case 261:
                        l = (long)-60.103871;
                        break;
                    case 408:
                        Test.lArrFld[i][i - 1] = s;
                        break;
                    case 444:
                        i3 -= byFld;
                    case 390:
                        if (false) break;
                    case 190:
                        Test.iArrFld[i19 - 1] = (int)Test.fFld;
                        break;
                    case 341:
                        Test.iFld *= (int)Test.fFld;
                    case 242:
                        i3 = i4;
                        break;
                    case 285:
                        l2 -= i1;
                        break;
                    case 311:
                        byFld = (byte)i;
                        break;
                    case 139:
                        Test.iFld += (int)(-1275825029578034869L + (i19 * i19));
                        break;
                    case 272:
                        if (b1) continue;
                        break;
                    case 165:
                        Test.iFld -= i3;
                        break;
                    case 342:
                        l -= i19;
                        break;
                    case 446:
                        Test.lArrFld[i2 + 1][i19 - 1] = i20;
                        break;
                    case 200:
                        sArr1[i + 1] -= (short)i2;
                        break;
                    case 433:
                        dArr[i2] *= 53.68F;
                    case 201:
                        i1 *= i;
                    case 434:
                        i20 &= i19;
                        break;
                    case 136:
                        dArr[i19] = -6;
                        break;
                    case 188:
                        i20 += (i19 | (long)Test.fFld);
                        break;
                    case 420:
                        Test.iArrFld[i19 - 1] |= s;
                        break;
                    case 455:
                        Test.fFld *= i1;
                        break;
                    case 131:
                        Test.iFld %= (int)((long)(Test.fFld) | 1);
                    case 221:
                    case 425:
                        i1 = (int)Test.fFld;
                        break;
                    case 161:
                        dArr[i2 + 1] += i3;
                        break;
                    case 232:
                        i20 >>= Test.iFld;
                        break;
                    case 266:
                        Test.fFld = i;
                    case 331:
                        b1 = b1;
                        break;
                    case 353:
                        l2 += (((i19 * byFld) + Test.fFld) - i3);
                    case 187:
                        i3 = i4;
                        break;
                    case 263:
                        i3 = i1;
                        break;
                    case 252:
                        Test.iArrFld[(i19 >>> 1) % N] -= i;
                        break;
                    default:
                        i20 >>= -59456;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 l = " + i + "," + i1 + "," + l);
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i19 i20 b1 = " + i19 + "," + i20 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("s fArr sArr1 = " + s + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + ","
            + FuzzerUtils.checkSum(sArr1));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("byFld Test.lArrFld Test.iArrFld = " + byFld + "," + FuzzerUtils.checkSum(Test.lArrFld)
            + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("bArrFld = " + FuzzerUtils.checkSum(bArrFld));

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