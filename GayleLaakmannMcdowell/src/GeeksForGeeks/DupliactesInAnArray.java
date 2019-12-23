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

public class DupliactesInAnArray {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        final int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
        final int n = arr.length;
        printRepeating(arr, n);
    }

    static void printRepeating(final int arr[], final int n) {

        for (int i = 0; i < n; i++) {
            final int index = arr[i] % n;
            arr[index] += n;
        }
        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) > 1) {
                System.out.println(i);
            }
        }
    }
}
