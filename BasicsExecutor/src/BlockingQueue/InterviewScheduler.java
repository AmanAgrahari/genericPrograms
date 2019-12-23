package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable {
	
	private BlockingQueue<String> queue;
	
	public InterviewScheduler(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}



	@Override
	public void run() {
		System.out.println("10 candidate have arrived");
		for(int i=1;i<=10;i++){
			String msg= new String("Candidate "+i);
			try {
				queue.put(msg);
				System.out.println("Interview schedule to " + msg);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("interview scheduled for all candidates");
		String msg= new String("stop");
		
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
