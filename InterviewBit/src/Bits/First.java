/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package Bits;

public class First {

    /**
     * @param args
     */
    public static void main(final String[] args) {

        //leftRotate(16, 2);
        System.out.println(swapNibbles(100));
    }

    static int leftRotate(final int n, final int d) {
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(d));
        final int k = (n << d);
        System.out.println(Integer.toBinaryString(k));
        final int k1 = n >> 1;
        System.out.println(Integer.toBinaryString(k1));
        return 0;
    }

    static int swaNibbles(final int n) {
        System.out.println(Integer.toBinaryString(n));
        final int k = (n << 27);
        System.out.println(Integer.toBinaryString(k));
        final int k1 = (n >> 27);
        System.out.println(Integer.toBinaryString(k1));
        final int k2 = k + k1;
        System.out.println(Integer.toBinaryString(k2));
        System.out.println(k2);
        return 0;
    }

    static int swapNibbles(final int x) {
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x & 0xF0));
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }

}
