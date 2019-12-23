package ExecutorFramework;

public class ThreadLocalCustomerDemo {

	public static void main(String[] args) {

		CustomreThread c1= new CustomreThread("Customer Thread-1");
		CustomreThread c2= new CustomreThread("Customer Thread-2");
		CustomreThread c3= new CustomreThread("Customer Thread-3");
		CustomreThread c4= new CustomreThread("Customer Thread-4");

		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}
