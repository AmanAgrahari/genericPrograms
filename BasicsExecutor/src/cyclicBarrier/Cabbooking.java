package cyclicBarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ExecutorFramework.PrintJob;

public class Cabbooking {

	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		
	/*	Thread t1= new Thread(new CabService(cyclicBarrier));
		t1.setName("passenger1");
		t1.start();
		Thread.sleep(2000);
		Thread t2= new Thread(new CabService(cyclicBarrier));
		t2.setName("passenger2");
		t2.start();
		Thread.sleep(2000);
		Thread t3= new Thread(new CabService(cyclicBarrier));
		t3.setName("passenger3");
		t3.start();
		Thread.sleep(2000);*/
		
		CabService [] jobs= {new CabService(cyclicBarrier),
				new CabService(cyclicBarrier),
				new CabService(cyclicBarrier),
		new CabService(cyclicBarrier),
		new CabService(cyclicBarrier),
		new CabService(cyclicBarrier)};
		ExecutorService service = Executors.newFixedThreadPool(4);
		for(CabService job:jobs){
			service.submit(job);
		}
		service.shutdown();
		
		
		
		
		
		
	}

}
