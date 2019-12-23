
public class MaxNonNegativeNumber {

	
/*	Input : {2, 3, 4, -1, -2, 1, 5, 6, 3}
	Output : 4
	The subarray [ 1, 5, 6, 3] has length 4 and 
	contains no negative integers

	Input : {1, 0, 0, 1, -1, -1, 0, 0, 1, 0}
	Output : 4
	subarrays [1, 0, 0, 1] and [0, 0, 1, 0] have 
	equal lengths but sum of first one is greater
	so that will be the output.*/
	
	int[][] arr=new int[3][3];
	public static int[] LargestLongestFirst(int[] source)
	{
	    int curSum = 0, curStart = 0, curLength = 0,
	        maxSum = 0, maxSart = 0, maxLength = 0;
	    for (int index = 0; index < source.length; index++)
	    {
	        if (source[index] < 0)
	        {
	            if ((curSum > maxSum) || ((curSum == maxSum) && (curLength > maxLength))) 
	            {
	                maxSum = curSum;
	                maxSart = curStart;
	                maxLength = curLength;
	            }
	            curStart = index + 1;
	            curSum = curLength = 0;
	        }
	        else
	        {
	            curSum += source[index];
	            ++curLength;
	        }
	    }
	    if ((curSum > maxSum) || ((curSum == maxSum) && (curLength > maxLength)))
	    {
	        maxSum = curSum;
	        maxSart = curStart;
	        maxLength = curLength;
	    }
	    int[] result = new int[maxLength];
	    System.arraycopy(source, maxSart, result, 0, maxLength);
	    return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 1, -1, -1, 0, 0, 1, 0,0};
		int abrr[] = new int [10];
	/*	int n = arr.length;
		int res=0;
		int res1=0;
		
		for(int i=0;i< n;i++)
		{
			int c=0;
			int k=0;
			while(i < n && arr[i]>=0){
				System.out.println(arr[i]);
				k=k+arr[i];
				c++;
				i++;
			}
			res= Math.max(res, c);
			res1=Math.max(res1, k);
		}
		System.out.println(res);
		System.out.println(res1);*/
			
		abrr=LargestLongestFirst(arr);
		for(int i=0;i<abrr.length;i++)
		{
			System.out.println(abrr[i]);
		}
	}

}
