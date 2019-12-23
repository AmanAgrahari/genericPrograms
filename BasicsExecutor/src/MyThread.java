
public class MyThread extends Thread {

	public MyThread(ThreadGroup g ,String name) {
	
		super(g,name);
	}
	
	public void run(){
	System.out.println("child thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
