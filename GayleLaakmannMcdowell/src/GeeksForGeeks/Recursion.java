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

import java.util.ArrayList;
import java.util.List;

public class Recursion {

    /**
     * @param args
     */
    static int c = 0;

    public static void main(final String[] args) {

        final List<Integer> al = new ArrayList<Integer>();
        final int arr[] = { 1, 2, 3 };
        final long l = System.currentTimeMillis();
        recursion(arr, 0, 0);

        final long l2 = System.currentTimeMillis();

        System.out.println("**********************");
        System.out.println(l2 - l);

        System.out.println("counter= " + c);
    }

    static void recursion(final int arr[], final int sum, final int k) {
        if (arr.length == k) {
            System.out.println(sum);
            c++;
            return;
        }
        System.out.println("array at index " + k + " is " + arr[k]);
        recursion(arr, sum, k + 1);
        recursion(arr, sum + arr[k], k + 1);

    }
}
