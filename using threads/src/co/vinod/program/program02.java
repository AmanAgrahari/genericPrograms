package co.vinod.program;

public class program02 {

	public static void main(String[] args) {
		
		Thread t1= new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				for(int i=0;i<15;i++){
					System.out.println("inside the run method of thread"+
							Thread.currentThread().getName() +",i is"+i);

					try{
					Thread.sleep(100);
					}
					catch(InterruptedException e){
					}
				}
			
			}
			});
		Thread t2= new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				for(int i=0;i<15;i++){
					System.out.println("inside the run method of thread"+
							Thread.currentThread().getName() +",i is"+i);

					try{
					Thread.sleep(100);
					}
					catch(InterruptedException e){
					}
				}
			
			}
			});
		Thread t3= new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				for(int i=0;i<15;i++){
					System.out.println("inside the run method of thread"+
							Thread.currentThread().getName() +",i is"+i);

					try{
					Thread.sleep(100);
					}
					catch(InterruptedException e){
					}
				}
			
			}
			});
		t1.start();
		t2.start();
		t3.start();
		}
	}
