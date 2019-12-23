package ThreeThreads;

import java.util.List;
import java.util.Set;

public class Mythread implements Runnable {
	private final Controller controller;
	private final List<Integer> sequence;
	private final int executionOrder;

	public Mythread(final Controller controller, List<Integer> sequence, int order) {
		super();
		this.controller = controller;
		this.sequence = sequence;
		this.executionOrder = order;
	}

	@Override
	public void run() {
		while (!this.sequence.isEmpty()) {
			try {
				performSynchronizedAction();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread Execution completed " + Thread.currentThread().getName());
	}

	private void performSynchronizedAction() throws InterruptedException {
		synchronized (controller) {
			while (controller.getThreadOrderToBeExecuted() != this.executionOrder) {
				controller.wait();
			}
			performAction();
		  //  Thread.sleep(100);
			controller.incrementValue();
			controller.notifyAll();
		}
	}

	public void performAction() {
		System.out.println("Printing value from thread "
				+ Thread.currentThread().getName() + " Thread controller value" + controller.getValue());
		final int valueToBePrinted = sequence.get(0);
		sequence.remove(0);
		System.out.println("******** PRINTING VALUE  " + valueToBePrinted);
	}

}
