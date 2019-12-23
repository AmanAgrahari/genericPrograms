package TryLockWithtime;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

	static ReentrantLock l = new ReentrantLock();
	public MyThread(String name) {
	super(name);
	}
	
	public void run(){
		do{
			try {
					if(l.tryLock(5000,TimeUnit.MILLISECONDS)){
						System.out.println(Thread.currentThread().getName()+ " got lock and perform safe operation");
						Thread.sleep(30000);
						System.out.println(Thread.currentThread().getName()+ "release lock");
						l.unlock();
						break;
					}
					else
					{
						System.out.println(Thread.currentThread().getName()
								+ " unable to get lock and retrying");
					}
			} 
			catch (InterruptedException e) {	
						e.printStackTrace();
					}		
			}while(true);
	
		}
	}

