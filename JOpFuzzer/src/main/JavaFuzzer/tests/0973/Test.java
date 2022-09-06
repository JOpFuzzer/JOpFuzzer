// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:23:03 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-45L;
    public static float fFld=0.955F;
    public static int iFld=17691;
    public boolean bFld=true;
    public volatile int iArrFld[]=new int[N];

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vSmallMeth(int i, int i1, int i2) {

        short s=-30658;
        int iArr[][]=new int[N][N];

        FuzzerUtils.init(iArr, -56374);

        iArr[(i >>> 1) % N][(i >>> 1) % N] &= (int)((++iArr[(i1 >>> 1) % N][(i2 >>> 1) % N]) - ((s * 53) * (Test.fFld -
            i1)));
        vSmallMeth_check_sum += i + i1 + i2 + s + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {


        vSmallMeth(-62398, Test.iFld, Test.iFld);
        vMeth_check_sum += 0;
    }

    public static int iMeth() {

        int i4=-156, i5=36, i6=21, i7=52934, i8=27650, i9=35165;
        short s1=21360;
        boolean b=false, bArr[]=new boolean[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 4242898745104617744L);
        FuzzerUtils.init(bArr, true);

        i4 = 1;
        do {
            vMeth();
            Test.iFld <<= (int)Test.instanceCount;
            s1 += (short)(i4 + Test.instanceCount);
        } while (++i4 < 212);
        Test.iFld <<= 104;
        for (i5 = 16; i5 < 267; ++i5) {
            if (b) break;
            Test.iFld -= i4;
        }
        for (i7 = 148; i7 > 2; i7 -= 2) {
            byte by=-54;
            by = (byte)Test.iFld;
            Test.iFld %= (int)(Test.instanceCount | 1);
            Test.iFld = i7;
            i9 = 1;
            while (++i9 < 21) {
                lArr[i7][i7 + 1] -= Test.instanceCount;
                bArr[i9] = b;
            }
        }
        long meth_res = i4 + s1 + i5 + i6 + (b ? 1 : 0) + i7 + i8 + i9 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i3=-9339, i10=69, i11=172, i12=-1581, i13=-11, i14=-51;
        long l=-21117L;
        double d=-66.92626;
        short s2=-19822;

        for (int smallinvoc=0; smallinvoc<748; smallinvoc++) vSmallMeth((int)(((Test.instanceCount - i3) -
            Double.longBitsToDouble(Test.instanceCount)) + (i3 - iMeth())), i3, Test.iFld);
        for (l = 14; l < 305; l += 2) {
            Test.fFld *= l;
            if (true) {
                iArrFld[(int)(l - 1)] += i3;
            }
            i10 = (int)Test.fFld;
            Test.fFld += l;
            Test.fFld += i3;
            for (d = 4; d < 173; ++d) {
                for (i12 = 2; l < i12; i12 -= 2) {
                    byte by1=-5;
                    Test.iFld >>>= Test.iFld;
                    by1 -= (byte)i3;
                }
                i13 += (int)(((d * Test.fFld) + i12) - i12);
                i14 = 1;
                while (++i14 < 2) {
                    Test.iFld = -5;
                    iArrFld[i14 - 1] -= i13;
                    i11 = i11;
                    i13 = Test.iFld;
                    if (bFld) continue;
                    Test.iFld += i14;
                    i3 = Test.iFld;
                }
                Test.instanceCount -= Test.instanceCount;
                if (bFld) {
                    Test.instanceCount = i12;
                } else {
                    i10 += (int)(d - s2);
                }
                switch ((((i14 >>> 1) % 2) * 5) + 127) {
                case 130:
                    try {
                        i11 = (-960245769 % iArrFld[(int)(d - 1)]);
                        i13 = (i3 / i12);
                        i10 = (iArrFld[(int)(d)] % 1047760122);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 128:
                    i10 = Test.iFld;
                    break;
                }
                Test.instanceCount -= -25330;
            }
            Test.instanceCount = -40281;
        }

        FuzzerUtils.out.println("i3 l i10 = " + i3 + "," + l + "," + i10);
        FuzzerUtils.out.println("d i11 i12 = " + Double.doubleToLongBits(d) + "," + i11 + "," + i12);
        FuzzerUtils.out.println("i13 i14 s2 = " + i13 + "," + i14 + "," + s2);

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("bFld iArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
