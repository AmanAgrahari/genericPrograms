package refractor;

public class DiningPhilosophers {

    public static void main(final String[] args) throws Exception {

        final Philosopher[] philosophers = new Philosopher[5];
        final Object[] forks = new Object[philosophers.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            final Object leftFork = forks[i];
            final Object rightFork = forks[(i + 1) % forks.length];

            philosophers[i] = new Philosopher(leftFork, rightFork);

            final Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}