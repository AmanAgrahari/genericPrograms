package EvenOdd;

public class Odd extends Thread {
    int max_value = 1;
    public Controller controller;
    public Object lock;

    Odd(final Controller controller, final Object lock) {
        this.controller = controller;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (max_value < 20) {
            synchronized (controller) {
                while (!controller.getController()) {
                    try {
                        controller.wait();
                    } catch (final InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                System.out.println("odd:" + max_value);
                max_value = max_value + 2;
                controller.setController(false);
                controller.notify();
            }

        }
    }
}
