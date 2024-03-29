package dining.philosopher;

import java.util.Random;

public class Philosopher implements Runnable{
	
	
	
	private int id;
	private Chopstick leftChopstick;
	private Chopstick rightChopstick;
	private Random random;
	private int eatingCounter;
	//we will have a flag this is what we were discussing when we were talking about the volatile keyword
	//we have to use the flag when we want to stop the given thread from running
	//when the philosopher is full u r going to stop the algorithm
	private volatile boolean isFull=false;
	

	public Philosopher() {
		super();
	}

	public Philosopher(int id,Chopstick leftChopstick,Chopstick rightChopstick) {
		this.id =id;
		this.leftChopstick=leftChopstick;
		this.rightChopstick=rightChopstick;
		this.random=new Random();
		
	}

	public Philosopher(int numberOfPhilosophers) {
		
	}

	@Override
	public void run() {
		try {
			while(!isFull){
				think();	
				if(leftChopstick.pickUp(this,State.LEFT)){
					if(rightChopstick.pickUp(this, State.RIGHT)){
						eat();
						rightChopstick.putDown(this, State.RIGHT);
					}
					leftChopstick.putDown(this, State.LEFT);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void think() throws InterruptedException{
		System.out.println(this+"is thinking...");
		Thread.sleep(random.nextInt(1000));
	}
	
	private void eat() throws InterruptedException{
		System.out.println(this+"is eating...");
		this.eatingCounter++;
		Thread.sleep(random.nextInt(1000));
	}
	
	public int getCounter(){
		return this.eatingCounter;
	}
	
	public void setFull(boolean isFull){
		this.isFull=isFull;
	}

	@Override
	public String toString() {
		return "Philosopher [id=" + id ;
		}
	

}
