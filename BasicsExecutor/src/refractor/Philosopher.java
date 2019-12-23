package refractor;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {

    // The forks on either side of this Philosopher
    private Object leftFork;
    private Object rightFork;

    public Semaphore p = new Semaphore(1);

    public Philosopher(final Object leftFork, final Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            while (true) {

                // thinking
                doAction(System.nanoTime() + ": Thinking");
                synchronized (leftFork) {
                    doAction(System.nanoTime() + ": Picked up left fork");
                    synchronized (rightFork) {
                        // eating
                        doAction(System.nanoTime() + ": Picked up right fork - eating");

                        doAction(System.nanoTime() + ": Put down right fork");
                    }

                    // Back to thinking
                    doAction(System.nanoTime() + ": Put down left fork. Back to thinking");
                }
            }
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

    }

    private void doAction(final String action) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }

}