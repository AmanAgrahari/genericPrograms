package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class InterviewProcessor implements Runnable {

	private BlockingQueue<String> queue;
	
	public InterviewProcessor(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			String msg;
			Thread.sleep(10000);
			while(!(msg=queue.take()).equals("stop"))
			{
				System.out.println("interview completed for msg" + msg);
				Thread.sleep(10000);
			}
			System.out.println("Interview completed for all candidates");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
