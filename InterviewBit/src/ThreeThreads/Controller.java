package ThreeThreads;

public class Controller {
    private int threadToBeExecuted;
	private final int MAX_THREAD;
	private final static int resetValue = 0;
	
    public Controller(int value, int MAX_THREAD) {
		super();
		this.threadToBeExecuted = value;
		this.MAX_THREAD = MAX_THREAD;
	}

    public synchronized void incrementValue(){
    	threadToBeExecuted++;
    	if(this.threadToBeExecuted/MAX_THREAD ==1 && this.threadToBeExecuted % MAX_THREAD == 0){
    		this.threadToBeExecuted = resetValue;
    	}
    }
    
    public int getValue(){
    	return threadToBeExecuted;
    }
    
    public int getMaxThreads(){
    	return MAX_THREAD;
    }
    
    public int getThreadOrderToBeExecuted(){
    	return this.threadToBeExecuted % this.MAX_THREAD;
    }
}
