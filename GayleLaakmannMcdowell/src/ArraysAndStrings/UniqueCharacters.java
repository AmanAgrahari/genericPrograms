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
package ArraysAndStrings;

public class UniqueCharacters {

    /**
     * @param args
     */
    public static void main(final String[] args) {

        final String s = "amana";

        final String str[] = { "a", "b", "c" };
        System.out.println(str.toString());
        System.out.println("******************");

        final int a[] = new int[256];
        int ch = 0;
        /*
         * for (int i = 0; i < 256; i++) { a[i] = 0; }
         *
         * for (int i = 0; i < s.length(); i++) { System.out.println(s.charAt(i)); final int d = s.charAt(i); a[d]++; if (a[d] >= 2) {
         * System.out.println(d); break; } }
         */
        for (int i = 0; i < s.length(); i++) {
            final int bitAtIndex = s.charAt(i) - 'a';
            System.out.println(bitAtIndex);
            if ((ch & (1 << bitAtIndex)) > 0) {
                System.out.println("repeated characters");
                return;
            }
            ch = ch | (1 << bitAtIndex);
        }
        return;
    }

    public void identicalCharacterCount() {

    }
}
