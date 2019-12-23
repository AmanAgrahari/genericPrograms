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
package GeeksForGeeks;

import java.util.Scanner;

public class Keshav {
    static int F[];
    private static Scanner sc;

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        /*
         * //sc = new Scanner(System.in); final int n = sc.nextInt(); F = new int[n]; for (int i = 0; i < F.length; i++) { F[i] = -1; } F[0] = 50;
         * F[1] = 20; Fib(n - 1); for (int i = 0; i < F.length; i++) { System.out.println(F[i]); }
         */

        final int k = (16 >> 2);
        System.out.println(k);
        final int re = (16 << (8 - 2));
        System.out.println(re);
        final int result = k | re;
        System.out.println(result);
        System.out.println("********************");
        System.out.println((16 << 2));

    }

    static int Fib(final int n) {
        if (F[n] != -1) {
            return F[n];
        }
        F[n] = Fib(n - 1) * Fib(n - 2);
        return F[n];
    }

}
