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

public class TestThreadPool {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(final String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        final int A[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        final ThreadPool threadPool = new ThreadPool(5, 3);
        for (int i = 0; i < 9; i++) {
            final TestTask task = new TestTask(A[i]);
            threadPool.submitTask(task);
        }
    }

}
