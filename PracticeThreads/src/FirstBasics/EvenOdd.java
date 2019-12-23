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
package FirstBasics;

public class EvenOdd {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        final Bridge b = new Bridge();
        b.setValue(0);
        b.setToggle(false);

        final MyThread t1 = new MyThread(b);
        final MyThread2 t2 = new MyThread2(b);

        t1.start();
        t2.start();

    }

}
