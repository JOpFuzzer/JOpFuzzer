// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 29 10:22:54 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=282758051L;
    public static short sFld=-1705;
    public static short sArrFld[]=new short[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)16619);
        FuzzerUtils.init(Test.iArrFld, 60622);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static void vMeth1(double d, int i7) {

        int i8=-36826, i9=167, i10=-52277, i11=58, i12=-29063, i13=6, i14=-14;
        float f1=-1.513F;
        double d1=-62.126044;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2107086090L);

        lArr[(-48688 >>> 1) % N] >>>= i7;
        i8 = 256;
        do {
            for (i9 = i8; i9 < 18; ++i9) {
                boolean b=true;
                i7 = (int)((Test.instanceCount--) * (-(-13L + (i10 *= -13))));
                if (b) continue;
            }
            if ((i10 + (f1 - (i10 = i10))) == (--i10)) continue;
            i11 = 1;
            do {
                Test.instanceCount = 71;
            } while (++i11 < 18);
            i10 *= (Math.min(i10++, i7) - i8);
        } while ((i8 -= 3) > 0);
        Test.instanceCount *= -191;
        i10 = (int)(((i10 * i8) + (i9 - 6)) + (Double.longBitsToDouble(16396L) - 74));
        for (i12 = 14; i12 < 345; ++i12) {
            for (d1 = 1; d1 < 5; d1++) {
                Test.instanceCount = Integer.reverseBytes(i10++);
                Test.sFld -= (short)((++i7) * Test.instanceCount);
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 +
            i13 + Double.doubleToLongBits(d1) + i14 + FuzzerUtils.checkSum(lArr);
    }

    public static float fMeth(int i17) {

        int i18=54751, i19=43, i20=29, iArr1[]=new int[N];
        double d3=6.42052;

        FuzzerUtils.init(iArr1, 9);

        i18 = 1;
        while ((i18 += 2) < 156) {
            vMeth1(d3, i17);
            for (i19 = i18; i19 < 20; i19++) {
                i20 += i19;
                i20 = i18;
            }
        }
        i20 = i20;
        iArr1[(i18 >>> 1) % N] = i20;
        long meth_res = i17 + i18 + Double.doubleToLongBits(d3) + i19 + i20 + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(long l, int i4) {

        int i5=-52137, i6=-58, i15=46679, i16=55562, i21=0, iArr[]=new int[N];
        double d2=1.46779;
        float f2=-2.961F, fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, -2.102F);
        FuzzerUtils.init(iArr, -203);

        for (i5 = 10; i5 < 186; i5++) {
            fArr[i5 - 1][i5 - 1] = (Test.sArrFld[i5 + 1] + Math.min((int)(1.85245 - Math.min(l, Test.instanceCount)),
                (int)(i4 - l)));
            vMeth1(d2, ((iArr[i5]++) + (i4--)) * i5);
            l -= (long)(((Test.instanceCount * i5) * (++d2)) % ((25437 - (-12 * Math.max(i5, i5))) | 1));
            switch (((i5 % 2) * 5) + 37) {
            case 40:
                for (i15 = 1; i15 < 9; ++i15) {
                    i6 = (i16++);
                }
                break;
            case 47:
                d2 += i6;
                fArr[i5 - 1][i5] = fMeth(i6);
                break;
            default:
                iArr[i5 - 1] &= i16;
                i16 = i15;
                try {
                    iArr[i5] = (-1881860221 / i6);
                    i6 = (i16 / i5);
                    i6 = (i4 % 150);
                } catch (ArithmeticException a_e) {}
                f2 = i5;
            }
            i16 <<= (int)-8689739589457223189L;
            try {
                i21 = (i5 / i5);
                i16 = (-62034 % i21);
                iArr[i5] = (iArr[i5] % -38);
            } catch (ArithmeticException a_e) {}
        }
        vMeth_check_sum += l + i4 + i5 + i6 + Double.doubleToLongBits(d2) + i15 + i16 + Float.floatToIntBits(f2) + i21
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i1=14, i2=-104, i3=5156, i22=14897, i23=8, iArr2[]=new int[N];
        float f=0.604F, fArr1[][]=new float[N][N];
        boolean b1=true;
        byte by=124;

        FuzzerUtils.init(iArr2, 201);
        FuzzerUtils.init(fArr1, -66.529F);

        for (i = 10; i < 189; ++i) {
            for (i2 = 140; i2 > 8; i2--) {
                f += (i2 + i2);
                vMeth(-3684134449L, i2);
                switch (((i2 % 5) * 5) + 29) {
                case 32:
                    iArr2[i + 1] = (int)Test.instanceCount;
                case 44:
                    i3 = (int)Test.instanceCount;
                case 50:
                    f -= i3;
                    i3 -= (int)-1L;
                    Test.instanceCount += (long)f;
                    for (i22 = 1; i22 < 2; ++i22) {
                        if (b1) continue;
                        switch (((i2 % 10) * 5) + 46) {
                        case 52:
                            if (true) {
                                fArr1 = fArr1;
                            } else {
                                f = -11;
                            }
                            switch (((i2 >>> 1) % 2) + 127) {
                            case 127:
                                Test.iArrFld[i2 - 1] = i3;
                                break;
                            case 128:
                                i3 = 59796;
                                Test.instanceCount = (long)71.279F;
                                i1 *= i3;
                                break;
                            default:
                                switch ((i2 % 1) + 126) {
                                case 126:
                                default:
                                    i1 *= i22;
                                    i23 = i1;
                                }
                                i23 += (((i22 * i3) + i2) - i23);
                            }
                            if (b1) {
                                i3 = (int)Test.instanceCount;
                                fArr1[i] = fArr1[i];
                                i1 = i;
                                i3 += i22;
                            }
                        case 51:
                            i1 *= i22;
                            break;
                        case 86:
                            Test.instanceCount = i2;
                            break;
                        case 82:
                            i3 += (int)Test.instanceCount;
                            break;
                        case 85:
                            fArr1[i2][i22 + 1] = i23;
                        case 90:
                            Test.instanceCount = i1;
                        case 47:
                            Test.instanceCount = i23;
                            break;
                        case 68:
                            fArr1[i22 + 1][i2 - 1] = i22;
                            break;
                        case 75:
                            i3 -= by;
                        case 94:
                            Test.instanceCount += (i22 * i22);
                            break;
                        default:
                            i1 += (i22 | (long)f);
                        }
                    }
                    break;
                case 39:
                case 46:
                    by += (byte)(i2 + i3);
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 f i22 = " + i3 + "," + Float.floatToIntBits(f) + "," + i22);
        FuzzerUtils.out.println("i23 b1 by = " + i23 + "," + (b1 ? 1 : 0) + "," + by);
        FuzzerUtils.out.println("iArr2 fArr1 = " + FuzzerUtils.checkSum(iArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.sArrFld = " + Test.instanceCount + "," + Test.sFld +
            "," + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest fMeth
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
