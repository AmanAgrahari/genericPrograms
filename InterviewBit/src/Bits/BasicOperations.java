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

import java.util.Arrays;

public class BasicOperations {

    /**
     * @param args
     */
    public static void main(final String[] args) {

        System.out.println(isPowerOfTwo(0));
        System.out.println(4 >> 1);
        final int c = 4;
        final int arr[] = { 12, 4, 6, 2 };
        System.out.println(minXOR(arr, arr.length));
        posssibleSubsets(new char[] {'a','b','c'}, 3);
        System.out.println();
    }

    /*
     * count number of set bits 00000000000000000000000000001011 o/p: =3
     */

    public int numSetBits(final long a) {

        if (a == 0) {
            return 0;
        } else {
            return 1 + numSetBits(a & (a - 1));
        }
    }

    /*
     * Input : arr[] = {9, 5, 3} Output : 6 All pair with xor value (9 ^ 5) => 12, (5 ^ 3) => 6, (9 ^ 3) => 10. Minimum XOR value is 6
     */
    public static int minXOR(final int arr[], final int n) {
        Arrays.parallelSort(arr);
        int minXor = Integer.MAX_VALUE;
        int val = 0;
        for (int i = 0; i < n - 1; i++) {
            val = arr[i] ^ arr[i + 1];
            minXor = Math.min(minXor, val);
        }
        return minXor;
    }

    /*
     * if a number is a power of 2 then they will have one one set bit in binary representation if the number is neither zero nor power of twp, it
     * will have 1 in more than one place So if xis power of 2 then x &(x-1) will be zero
     */
    static boolean isPowerOfTwo(final int x) {
        if (x == 0) {
            return true;
        }
        if ((x & (x - 1)) == 0) {
            return true;
        }
        return false;
    }

    /*
     * since we know x&(x-1) will clear the rightmost set bit 10111=23 10110=22 (n-1) ----------------- 10110=22 10101=21 (n-1) -------------------
     * 10100=20 10011=19 (n-1) ------------------ 10000=16 01111=15 (n-1) ---------------- 00000=0
     *
     * as we can see in four operation we counted how many number of ones is there till now
     *
     *
     */
    static int countNumberOfOnes(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    static boolean ithBitIsSet(final int n, final int i) {
        if ((n & (1 << i)) == n) {
            return true;
        } else {
            return false;
        }
    }

    static void posssibleSubsets(final char a[], final int n) {
        for (int i = 0; i < (1 << n); ++i) {
            for (int j = 0; j < n; j++) {
                if ((i & (i << j)) >= 1) {
                    System.out.print(a[j]);
                }
            }
            System.out.println();
        }
    }

}
