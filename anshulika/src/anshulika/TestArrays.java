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
package anshulika;

import java.util.Arrays;

public class TestArrays {

    /**
     * @param args
     */
    static int NO_OF_CHARS = 256;

    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        final String str = "geeksogeeks";
        final int count[] = new int[NO_OF_CHARS];
        Arrays.fill(count, 0);
        for (int i = 0; i < str.length(); i++) {
            count[(str.charAt(i))]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i]);
        }
    }

}
