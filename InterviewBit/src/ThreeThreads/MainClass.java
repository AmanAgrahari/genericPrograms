package ThreeThreads;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MainClass {
	public static final int MAX_THREADS = 5;
	
	public static void main(String[] args){ 
		final Controller controllerLock = new Controller(0, MAX_THREADS);
		final List<Integer> thread1Setquence = new ArrayList<Integer>(Arrays.asList(1,6,11));
		final List<Integer> thread2Setquence = new ArrayList<Integer>(Arrays.asList(2,7,12));
		final List<Integer> thread3Setquence = new ArrayList<Integer>(Arrays.asList(3,8,13));
		final List<Integer> thread4Setquence = new ArrayList<Integer>(Arrays.asList(4,9,14));
		final List<Integer> thread5Setquence = new ArrayList<Integer>(Arrays.asList(5,10,15));
		final Thread thread1 = new Thread(new Mythread(controllerLock, thread1Setquence , 0));
		final Thread thread2 = new Thread(new Mythread(controllerLock, thread2Setquence , 1));
		final Thread thread3 = new Thread(new Mythread(controllerLock, thread3Setquence , 2));
		final Thread thread4 = new Thread(new Mythread(controllerLock, thread4Setquence , 3));
		final Thread thread5 = new Thread(new Mythread(controllerLock, thread5Setquence , 4));
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}

}
