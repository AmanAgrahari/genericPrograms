package TryLockExample;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

	static ReentrantLock l = new ReentrantLock();
	public MyThread(String name) {
	super(name);
	}
	
	public void run(){
		if(l.tryLock()){
			System.out.println(Thread.currentThread().getName()
					+ " got lock and perform safe operation");
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				l.unlock();			
		}
		else
		{
			System.out.println(Thread.currentThread().getName()
					+ " unable to get lock and perform alternate operation");
		}
	}
}
