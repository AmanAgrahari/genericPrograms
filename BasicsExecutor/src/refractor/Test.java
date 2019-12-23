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
package refractor;

public class Test {
    public static void main(final String[] args) throws InterruptedException {

        final long l = System.currentTimeMillis();

        Thread.sleep(3000);

        final long l2 = System.currentTimeMillis();
        System.out.println(l2 - l);

    }

}
