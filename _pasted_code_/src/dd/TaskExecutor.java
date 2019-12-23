package dd;

public class TaskExecutor implements Runnable {
    BlockingQueue<Runnable> queue;

    public TaskExecutor(final BlockingQueue<Runnable> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                final String name = Thread.currentThread().getName();
                final Runnable task = queue.dequeue();
                System.out.println("Task Started by Thread :" + name);
                task.run();
                System.out.println("Task Finished by Thread :" + name);
            }
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }

    }
}