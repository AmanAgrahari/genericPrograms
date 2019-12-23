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

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<Type> {

    private Queue<Type> queue = new LinkedList<Type>();
    private int empty = 0;
    private int max_task_in_queue = -1;

    public BlockingQueue(final int size) {
        this.max_task_in_queue = size;
    }

    public synchronized void enque(final Type task) throws InterruptedException {
        while (this.queue.size() == this.max_task_in_queue) {
            wait();
        }
        if (this.queue.size() == this.empty) {
            notifyAll();
        }
        this.queue.offer(task);
        System.out.println("task placed");
    }

    public synchronized Type deque() throws InterruptedException {
        while (this.queue.size() == this.empty) {
            wait();
        }
        if (this.queue.size() == this.max_task_in_queue) {
            notifyAll();
        }
        System.out.println("task removed");
        return this.queue.poll();
    }
}
