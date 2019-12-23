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
package Recursion;

public class power {

    /**
     * raise
     *
     * @param args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        final int k = raise(10, 4);
        System.out.println(k);

        final String s = "a";
        System.out.println(s.substring(0));
        System.out.println(s.substring(1));
        //System.out.println(s.substring(0, 1));
        RecSubSets("", "abc");
        permutation("", "abc");

    }

    static int raise(final int base, final int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * raise(base, exp - 1);
        }
    }

    static void RecSubSets(final String soFar, final String rest) {

        if (rest.isEmpty()) {
            System.out.println(soFar);
        } else {
            RecSubSets(soFar + rest.charAt(0), rest.substring(1));
            RecSubSets(soFar, rest.substring(1));
        }
    }

    static void permutation(final String soFar, final String rest) {
        if (rest.isEmpty()) {
            System.out.println(soFar + rest);
        } else {
            for (int i = 0; i < rest.length(); i++) {
                final String next = soFar + rest.charAt(i);
                final String remaining = rest.substring(0, i) + rest.substring(i + 1);
                permutation(next, remaining);
            }
        }
    }
}
