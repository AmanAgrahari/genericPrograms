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

public class ThreadPool {

    BlockingQueue<Runnable> queue;

    public ThreadPool(final int queueSize, final int nThreads) {

        queue = new BlockingQueue<Runnable>(queueSize);
        String threadName = null;
        TaskExecutor task = null;
        for (int i = 0; i < nThreads; i++) {
            threadName = "Thread- " + i;
            task = new TaskExecutor(queue);
            final Thread thread = new Thread(task, threadName);
            thread.start();
        }
    }

    public void submitTask(final Runnable task) throws InterruptedException {
        queue.enque(task);
    }
}
