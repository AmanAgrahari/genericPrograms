
package dd;

public class ThreadPool {

    BlockingQueue<Runnable> queue;

    public ThreadPool(final int queueSize, final int nThread) {
        queue = new BlockingQueue<>(queueSize);
        String threadName = null;
        TaskExecutor task = null;
        for (int count = 0; count < nThread; count++) {
            threadName = "Thread-" + count;
            task = new TaskExecutor(queue);
            final Thread thread = new Thread(task, threadName);
            thread.start();
        }
    }

    public void submitTask(final Runnable task) throws InterruptedException {
        queue.enqueue(task);
    }
}