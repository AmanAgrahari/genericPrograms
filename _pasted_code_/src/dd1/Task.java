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
package dd1;

public class Task implements Runnable {

    private int num;

    public Task(final int n) {
        num = n;
    }

    @Override
    public void run() {
        System.out.println("Task " + num + " is running.");
    }

}
