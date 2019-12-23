package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class InterviewService {

	public static void main(String[] args) {
	
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);
		InterviewScheduler producer= new InterviewScheduler(queue);
		InterviewProcessor consumer = new InterviewProcessor(queue);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
