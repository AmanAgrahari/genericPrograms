package dd;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<Typee> {
    private Queue<Typee> queue = new LinkedList<Typee>();
    private int EMPTY = 0;
    private int MAX_TASK_IN_QUEUE = -1;

    public BlockingQueue(final int size) {
        this.MAX_TASK_IN_QUEUE = size;
    }

    public synchronized void enqueue(final Typee task) throws InterruptedException {
        while (this.queue.size() == this.MAX_TASK_IN_QUEUE) {
            wait();
        }
        if (this.queue.size() == EMPTY) {
            notifyAll();
        }
        this.queue.offer(task);
    }

    public synchronized Typee dequeue() throws InterruptedException {
        while (this.queue.size() == EMPTY) {
            wait();
        }
        if (this.queue.size() == this.MAX_TASK_IN_QUEUE) {
            notifyAll();
        }
        return this.queue.poll();
    }
}