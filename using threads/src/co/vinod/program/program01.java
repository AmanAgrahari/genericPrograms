package co.vinod.program;

public class program01 {

	public static void main(String[] args) {
		
	//System.out.println(Thread.currentThread().getName());
	//System.out.println(Thread.activeCount());
	Thread t1= new MyThreadClass("MTC-1");
	Thread t2= new MyThreadClass("MTC-2");

	Thread t3= new MyThreadClass("MTC-3");
	t1.start();
	t2.start();
	t3.start();
	
	
	}
}
