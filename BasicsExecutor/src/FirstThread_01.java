
public class FirstThread_01 {

	public static void main(String[] args) {
		//System 
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		//main 
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		ThreadGroup g1= new ThreadGroup("g1name");
		//main
		System.out.println(g1.getParent().getName());
		ThreadGroup g2= new ThreadGroup(g1,"g2name");
		System.out.println(g2.getParent().getName());
		
		
		//----------------------------//
		System.out.println("second Program");
		ThreadGroup g3= new ThreadGroup("tg");
		Thread t1= new Thread(g3, "first");
		Thread t2 =new Thread(g3, "second");		
		g3.setMaxPriority(3);
		Thread t3 =new Thread(g3, "third");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}

}
