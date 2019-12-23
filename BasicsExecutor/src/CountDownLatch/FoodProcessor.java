package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class FoodProcessor implements Runnable {

    private final CountDownLatch latch;
    private final String[] items;

    public FoodProcessor(final CountDownLatch latch, final String[] items) {
        super();
        this.latch = latch;
        this.items = items;
    }

    @Override
    public void run() {
        for (int i = 0; i < items.length; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Before processing the item value  of CountDownLatch " + latch.getCount());
                System.out.println("items " + items[i] + " is prepared");
                latch.countDown();
                System.out.println("after processing the item value  of CountDownLatch " + latch.getCount());

            } catch (final InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
