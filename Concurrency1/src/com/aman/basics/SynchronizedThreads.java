package com.aman.basics;

public class SynchronizedThreads {

	private static int counter =0;
	
	public static void process(){
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
			for(int i=0;i<100;i++){
				++counter;
			}
				
			}
		});
	Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
			for(int i=0;i<100;i++){
				++counter;
			}	
			}
		});
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}


	public static void main(String[] args) {
	
		process();
		System.out.println(counter);

	}

}
