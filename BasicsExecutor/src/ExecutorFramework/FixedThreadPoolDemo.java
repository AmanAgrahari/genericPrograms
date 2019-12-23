package ExecutorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

	public static void main(String[] args) {
	
		PrintJob [] jobs= {new PrintJob("durga"),
				new PrintJob("ravi"),
				new PrintJob("shiva"),
		new PrintJob("pavan"),
		new PrintJob("suresh"),
		new PrintJob("anil")};
		ExecutorService service = Executors.newFixedThreadPool(4);
		for(PrintJob job:jobs){
			service.submit(job);
		}
		service.shutdown();
		
	}

}
