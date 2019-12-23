package DesignPattern;

public class jjk {

    public static void main(final String[] args) {

        final String s = "aman";
        final String s1 = new String("aman");
        final StringBuffer s2 = new StringBuffer("aman");
        System.out.println(s1.equals(s2));
        final int a = 10 + 6;
        final int b = 10;
        System.out.println(Integer.toBinaryString(b));
        final int c = 6;
        System.out.println(Integer.toBinaryString(c));
        final int d = b | c;
        System.out.println(Integer.toBinaryString(d));
        System.out.println(a + "    " + b);
        System.out.println("********************************************");
        final double k = Math.log10(44 & -44);
        System.out.println(k);
        final double l = Math.log10(2) + 1;
        System.out.println(l);
        final double s11 = (k / l);
        System.out.println(s11);

        System.out.println(s11);
        System.out.println("================================================");
        System.out.println(getFirstSetBitPos(10));
        System.out.println(getFirstSetBitPos1(44));

        final int check = 5;
        Integer.toBinaryString(~check);

    }

    static int getFirstSetBitPos(final int n) {
        return ((int) (Math.log(n & -n) / Math.log(2)) + 1) - 1;
    }

    static int getFirstSetBitPos1(final int n) {
        return ((n & -n) / 2) + 1;
    }

}
