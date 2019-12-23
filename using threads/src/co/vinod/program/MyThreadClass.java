package co.vinod.program;

public class MyThreadClass extends Thread {
   
public MyThreadClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyThreadClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	//task for thread
	@Override
	public void run()
	{
		for(int i=0;i<15;i++){
		System.out.println("inside the run method of thread"+
				Thread.currentThread().getName() +",i is"+i);

		try{
		Thread.sleep(100);
		}
		catch(InterruptedException e){
		System.out.println("the thread"+Thread.currentThread().getName() + "got interrupted");
			break;
		}
	}		
	}
}
