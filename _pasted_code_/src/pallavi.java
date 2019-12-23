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

public class pallavi {

    /**
     * @param args
     */
    public static void main(final String[] args) {

        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i <= 400; i++) {
            for (int j = 0; j <= 400; j++) {
                for (int k = 0; k <= 400; k++) {
                    for (int l = 0; l <= 400; l++) {
                        sum = (i * 2) + (j * 4) + (k * 7) + (l * 13);
                        sum1 = i + j + k + l;
                        if (sum1 == 690 && sum == 2070) {
                            System.out.println("i= " + i + " j= " + j + " k=" + k + " l= " + l);
                        }
                    }
                }
            }
        }

    }

}
