package BinarySearch;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=1;
		 int b =1;
		 int c =20;
		 System.out.println(pow(a, b, c));
	}

public static int pow(int x, int n, int d) {
	   if(x==0)
	   return 0;
	   if(n==0)
	    return 1;
	    else
	    if((n%2)==0){
	       int y=pow(x,n/2,d);
	        return (y*y)%d;
	    }
	    else
	    return ((x%d)* pow(x,n-1,d))%d;

		}
}