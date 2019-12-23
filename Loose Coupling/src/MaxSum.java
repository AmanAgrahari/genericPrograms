
public class MaxSum {
	
	static int maxSum(int arr[]){
		int l=arr.length;
		int odd=0;
		int even=0;
		for(int i=0;i<l;i++)
		{
		if(i%2==0)
		{
			System.out.println(i);
			even=even+arr[i];
		}else
		{
			odd=odd+arr[i];
		}
			
		}
		int max = even>odd?even:odd;
		System.out.println("even"+ even);
		System.out.println("odd" + odd);
		return max;
	}
	  public static void main(String args[])
	    {
	        int arr[] =  {1,2,3,4,5,6};
	        int n = arr.length;
	        System.out.println("Length of the Longest consecutive subsequence is " +
	                         maxSum(arr));
	    }
}
