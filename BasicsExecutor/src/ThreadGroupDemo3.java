
public class ThreadGroupDemo3 {

	public static void main(String[] args) throws Exception {
		
		ThreadGroup pg= new ThreadGroup("parentGroup");
		ThreadGroup cg= new ThreadGroup(pg,"childGroup");
		MyThread t1= new MyThread(pg, "childThread1");
		MyThread t2 =new MyThread(pg, "childThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());//2
		System.out.println(pg.activeGroupCount());//1
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());//0
		System.out.println(pg.activeGroupCount());//1
		pg.list();
	}

}
