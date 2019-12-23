package ExecutorFramework;

public class ParentThread extends Thread {

	//public static ThreadLocal t1 = new ThreadLocal();
	//public static InheritableThreadLocal t1= new InheritableThreadLocal();
	public static InheritableThreadLocal t1= new InheritableThreadLocal(){
		public Object childValue(Object p){
			return "CC";
		}
	};
	
	public void run(){
		t1.set("pp");
		System.out.println("Parent Thread value---" + t1.get());
ChildThread c1= new ChildThread();
c1.start();
	}
}
