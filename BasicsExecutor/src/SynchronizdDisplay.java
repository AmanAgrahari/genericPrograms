
public class SynchronizdDisplay {
	
	public static void main(String[] args) {
		
		Display d1= new Display();
		DisplayThread t1= new DisplayThread(d1, "first");
		DisplayThread t2= new DisplayThread(d1, "second");
		DisplayThread t3= new DisplayThread(d1, "third");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
