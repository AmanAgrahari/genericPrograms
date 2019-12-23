import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;


public class Display {
	
	//Semaphore s= new Semaphore(0, false);
	ReentrantLock l= new ReentrantLock();
	public /*synchronized*/ void wish(String name){
		l.lock();
		for(int i=0;i<10;i++){
			System.out.print("good mornining:");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
			// TODO Auto-generated catch block
		System.out.println(name+" "+this.hashCode());
		
		}
		l.unlock();
	}

}
