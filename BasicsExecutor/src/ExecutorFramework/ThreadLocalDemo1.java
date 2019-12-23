package ExecutorFramework;

public class ThreadLocalDemo1 {

	public static void main(String[] args) {

		ThreadLocal t1= new ThreadLocal();
		
		System.out.println(t1.get());
		t1.set("durga");
		System.out.println(t1.get());
		t1.remove();
		System.out.println(t1.get());
		
		
		
/*	
 * overriding of initialValue method	
 * ThreadLocal t2= new ThreadLocal(){
			public Object initialValue(){
				return "abc";
			}
		};
		
		System.out.println(t2.get());//abc
		tl.set("durga");
		System.out.println(t2.get());//durga
		tl.remove();
		System.out.println(t2.get());*///abc
	}

}
