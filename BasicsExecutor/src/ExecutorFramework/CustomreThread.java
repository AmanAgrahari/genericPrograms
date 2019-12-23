package ExecutorFramework;

public class CustomreThread extends Thread {

	static Integer custId=0;
	
	private static ThreadLocal t1= new ThreadLocal()
	{
		protected Integer initialValue(){
			return  ++custId;
		}
	};
	public CustomreThread(String name) {
	super(name);
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"executing with customer Id"+ t1.get());
	}
	
}
