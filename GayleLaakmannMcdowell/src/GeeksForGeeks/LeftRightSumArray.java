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

import java.util.Arrays;

public class LeftRightSumArray {

    /**
     * @param args
     */
    public static void main(final String[] args) {

        final int arr[] = { 1, 4, 2, 3, 5, 6, 7, 8, 9, 10 };
        final int n = arr.length;
        final int[] queries = { 1, 2, 3, 4, 5 };
        final double[] leftSum = new double[n];
        Arrays.sort(arr);
        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = (leftSum[i - 1] + arr[i]);
        }
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i] / (i + 1);
        }
        for (int i = 0; i < leftSum.length; i++) {
            System.out.println(leftSum[i]);
        }
        /*
         * final int[] rightSum = new int[n]; rightSum[n - 1] = arr[n - 1]; for (int i = n - 2; i >= 0; i--) { rightSum[i] = rightSum[i + 1] + arr[i];
         * }
         */

        for (int i = 0; i < queries.length; i++) {
            System.out.println(binarySearch(leftSum, queries[i]));
        }
    }

    static int binarySearch(final double[] leftSum, final int x) {
        int l = 0, r = leftSum.length - 1;

        if (leftSum[r] == x) {
            return r;
        }
        if (leftSum[r] <= x) {
            return r + 1;
        }
        while (l <= r) {
            final int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (leftSum[m] == x) {
                return m;
            }

            // If x greater, ignore left half
            if (leftSum[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
}
