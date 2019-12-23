package co.vinod.program;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class program05 {
	private List<String> words= new ArrayList<String>(); 
	public  /*synchronized*/ void  addWords(String sentence){
		String[] arr = sentence.split("\\s");
		synchronized (words) {
			for (String a : arr) {
				words.add(a);
			}
		}
	}
	public void printWords(){
		System.out.println(words);
	}
	public static void main(String[] args) throws Exception {
		
		/*program05 p5=new program05();
	p5.addWords("my name is vonod and i am from banglore");
	p5.printWords();
	*/
		
	final program05 p5=new program05();
	Thread t1=new Thread(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			p5.addWords("my name is vonod and i am from banglore");
		}});
	Thread t2=new Thread(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			p5.addWords("what is your name and where are u from");
		}});
	t1.start();
	t2.start();
	
	t1.join(); 
	t2.join();
	p5.printWords();
	}

}
