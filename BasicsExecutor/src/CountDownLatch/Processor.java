package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Processor {

	public static void main(String[] args) {
	
		String arr[] ={"aman","naman","ajay"};
		CountDownLatch countDownLatch = new CountDownLatch(arr.length);
		Thread foodProcessorThread=new Thread(new FoodProcessor(countDownLatch,arr));
		
		foodProcessorThread.start();
		try {
			System.out.println("Ordeer is received and being processed");
			countDownLatch.await();
			System.out.println("Order is processed successfully and is ready to get dispatched");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
