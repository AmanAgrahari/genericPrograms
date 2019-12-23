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

import java.util.ArrayList;

public class sujatha {
    public static void main(final String[] args) {
        final int arr[] = { 2, 4, 7, 9, 2, 4 };
        final int n = arr.length;
        int x = 0;
        int y = 0;
        int xor = arr[0];

        for (int i = 1; i < n; i++) {
            xor ^= arr[i];
        }
        final int set_bit_no = xor & ~(xor - 1);
        // final  int set_bit_no = xor & -xor;

        for (int i = 0; i < n; i++) {
            if ((arr[i] & set_bit_no) > 0) {
                x = x ^ arr[i];
            } else {
                y = y ^ arr[i];
            }

        }
        System.out.println(x);
        System.out.println(y);
        reverserBitsOfANumber(3);
        System.out.println(nextSparseNumber(44));
        nextSparse(44);
    }

    static void reverserBitsOfANumber(final int n) {

        final int no_of_bits = 8;
        int reverse_num = 0;
        int i;
        int c = 0;
        for (i = 0; i < no_of_bits; i++) {
            if ((n & (1 << i)) > 0) {
                reverse_num |= 1 << ((no_of_bits - 1) - i);
                c++;
            }
        }
        System.out.println(reverse_num);
        System.out.println(Integer.toBinaryString(reverse_num));
        System.out.println(c);
    }

    static int nextSparseNumber(int n) {

        while (true) {
            if (isSparse(n)) {
                return n;
            } else {
                n++;
            }
        }

    }

    static boolean isSparse(final int x) {
        if ((x & (x >> 1)) >= 1) {
            return false;
        }
        return true;

    }

    static void nextSparse(int x) {
        final ArrayList<Integer> al = new ArrayList<>();
        while (x != 0) {
            al.add(x & 1);
            x >>= 1;
        }
        System.out.println(al.toString());
        al.add(0);
        System.out.println(al.toString());
        final int n = al.size();
        int last_final = 0;
        for (int i = 1; i < n - 1; i++) {
            if (al.get(i) == 1 && al.get(i - 1) == 1 && al.get(i + 1) != 1) {
                al.set(i + 1, 1);
                for (int j = i; j >= last_final; j--) {
                    al.set(j, 0);
                }
                last_final = i + 1;
            }
        }
        int ans = 0;
        System.out.println(al.toString());
        for (int i = 0; i < n; i++) {
            ans += al.get(i) * (1 << i);
        }
        System.out.println(ans);
    }

}
