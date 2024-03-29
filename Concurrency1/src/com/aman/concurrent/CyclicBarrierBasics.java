package com.aman.concurrent;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class worker1 implements Runnable{

	private int id;
	private Random random;
	private CyclicBarrier cyclicBarrier;
	
	public worker1(int id,CyclicBarrier cyclicBarrier){
		this.cyclicBarrier=cyclicBarrier;
		this.random=new Random();
		this.id =id;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		doWork();
		
		System.out.println();
	}
	private void doWork(){
		System.out.println("Thread with ID " + id +"starts the task....");
		try {
			Thread.sleep(random.nextInt(3000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread with ID " + id +"finished....");
		try {
			cyclicBarrier.await();
			System.out.println("after await....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String toString(){
		return " "+this.id;
	}
	}
	

public class CyclicBarrierBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService =Executors.newFixedThreadPool(5);
		CyclicBarrier barrier =new CyclicBarrier(5,new Runnable() {
			
			@Override
			public void run() {
				System.out.println("we are able to use the trained neural network");
				
			}
		});
		for(int i=0;i<5;i++)
			executorService.execute(new worker1(i+1, barrier));
		executorService.shutdown();
		
	}

}
