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

public class RotatedSortedPivotedArray {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        final int A[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        System.out.println(A.length);
        int i = 0;
        for (; i < A.length; i++) {
            if (A[i] > A[i + 1]) {
                break;
            }
        }

        /*
         * final int first = binarySearch(A, 0, i, 2); System.out.println(first);
         */
        final int second = binarySearch(A, i + 1, A.length, 2);
        System.out.println(second);
    }

    static int binarySearch(final int arr[], final int low, final int high, final int key) {
        System.out.println("low  " + low + " high " + high);
        if (high < low) {
            return -1;
        }

        /* low + (high - low)/2; */
        final int mid = (low + high) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key > arr[mid]) {
            return binarySearch(arr, (mid + 1), high, key);
        }
        return binarySearch(arr, low, (mid - 1), key);
    }

}
