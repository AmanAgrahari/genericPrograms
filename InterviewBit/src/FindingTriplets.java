import java.util.Arrays;

/*
 * Given an array of real numbers greater than zero in form of strings.
Find if there exists a triplet (a,b,c) such that 1 < a+b+c < 2 . 
Return 1 for true or 0 for false.

Example:

Given [0.6, 0.7, 0.8, 1.2, 0.4] ,

You should return 1

as

0.6+0.7+0.4=1.7

1<1.7<2

Hence, the output is 1.
 */
public class FindingTriplets {
	 public int solve(String[] A) {
         Double d[] = new Double[A.length];
	        for(int i=0;i<A.length;i++)
	        {
	        	d[i]=Double.parseDouble(A[i]);
	        }
	        int arr_size = d.length;
	        Arrays.sort(d);
	        for(int i=0;i<arr_size;i++)
	        {
	        	int l=i+1;
	        	int r=arr_size-1;
	        	
	        	while(l<r)
	        	{
	        	    Double k=d[i]+d[l]+d[r];
	        		if(1.0<k && k<2.0)
	        		{
	        			return 1;
	        		}
	        		else if(k<2.0)
	        			l++;
	        		else
	        			r--;
	        	}
	        }
        return 0;
    }
	public static void main(String[] args) {
	
	        String A[] = {"1", "4", "45", "6", "10", "8"};
	        Double d[] = new Double[A.length];
	        for(int i=0;i<A.length;i++)
	        {
	        	d[i]=Double.parseDouble(A[i]);
	        }
	        int sum = 22;
	        int arr_size = d.length;
	        Arrays.sort(d);
	        for(int i=0;i<arr_size;i++)
	        {
	        	int l=i+1;
	        	int r=arr_size-1;
	        	
	        	while(l<r)
	        	{
	        		if(d[i]+d[l]+d[r]==sum)
	        		{
	        			System.out.println("Triplet is " + d[i] + " ," + d[l]
                            + " ," + d[r]);
	        			return;
	        		}
	        		else if(d[i]+d[l]+d[r]<sum)
	        			l++;
	        		else
	        			r--;
	        	}
	        }
        }

	}

