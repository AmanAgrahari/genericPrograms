package dd;

public class TestThreadPool {
    public static void main(final String[] args) throws InterruptedException {
        //create queue size - 3
        //Number of threads - 4
        final ThreadPool threadPool = new ThreadPool(3, 4);
        //Created 15 Tasks and submit to pool
        for (int taskNumber = 1; taskNumber <= 7; taskNumber++) {
            final TestTask task = new TestTask(taskNumber);
            threadPool.submitTask(task);
        }
    }
}