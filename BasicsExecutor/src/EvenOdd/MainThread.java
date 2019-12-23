package EvenOdd;

public class MainThread {

	public static Controller controller = new Controller(true);
	public static Object lock = new Object();
	
	
	public static void main(String[] args) {
		
		Thread t1= new Thread(new Odd(controller,lock));
		Thread t2= new Thread(new Even(controller,lock));
		
		t1.start();
		t2.start();
		
/*		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		

	}

}
