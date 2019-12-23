
public class Fibonacci {

	
	public static int fib(int n){
		int k;
		if(n<=1) return n;
		else
			 k = fib(n-1);
			int k1=fib(n-2);
			int k3=k+k1;
			return k3;
	}
	  public static void main(String args[]) {
		  
		  System.out.println(fib(8));
	  }
}
