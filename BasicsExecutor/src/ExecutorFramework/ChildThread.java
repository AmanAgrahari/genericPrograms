package ExecutorFramework;

public class ChildThread extends Thread {

	public void run(){
		System.out.println("Child thread value--" + ParentThread.t1.get());
		
	}	
}
