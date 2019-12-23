package TryLockWithtime;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import TryLockExample.MyThread;

public class ReenterantLock4 {

	public static void main(String[] args) {

		MyThread t1= new MyThread("aman");
		MyThread t2= new MyThread("ayushi");
		t1.start();
		t2.start();
		
	/*	MyThread [] jobs= {new MyThread("durga"),
				new MyThread("ravi"),
				new MyThread("shiva"),
		new MyThread("pavan"),
		new MyThread("suresh"),
		new MyThread("anil")};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(MyThread job:jobs){
			service.submit(job);
		}
		service.shutdown();*/
	}

}
