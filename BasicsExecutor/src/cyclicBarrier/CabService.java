package cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CabService implements Runnable {

	CyclicBarrier cyclicBarrier;
	public CabService(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier=cyclicBarrier;
	}
	@Override
	public void run() {
		System.out.println("------ "+Thread.currentThread().getName()+" has arrived");
		try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("------ "+Thread.currentThread().getName()+" is going to board the cab");
	}

}
