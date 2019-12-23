package EvenOdd;

public class Even extends Thread {

    int max_value = 0;
    public Controller controller;
    public Object lock;

    Even(final Controller controller, final Object lock) {
        this.controller = controller;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (max_value < 20) {
            synchronized (controller) {
                while (controller.getController()) {
                    try {
                        controller.wait();
                    } catch (final InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                max_value = max_value + 2;
                System.out.println("even:" + max_value);
                controller.setController(true);
                controller.notify();
            }
        }
    }
}
