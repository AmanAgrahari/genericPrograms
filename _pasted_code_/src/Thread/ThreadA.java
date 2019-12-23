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
package Thread;

public class ThreadA {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        final ThreadB b = new ThreadB();
        b.start();
        synchronized (b) {
            System.out.println("main thread trying ot call wait");
            try {
                b.wait(100);
            } catch (final InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
