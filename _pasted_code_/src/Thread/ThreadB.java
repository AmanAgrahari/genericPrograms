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

public class ThreadB extends Thread {

    int total = 0;

    @Override
    public void run() {

        synchronized (this) {
            System.out.println("child thread starts calculation");
            for (int i = 0; i <= 100; i++) {
                total = total + i;
            }
            System.out.println("child thread trying to give notification");
            this.notify();
        }
    }
}
