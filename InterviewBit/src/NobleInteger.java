import java.util.Arrays;


public class NobleInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] arr = {10, 3,3, 20, 40, 2};
		 int [] arr1 = {-4, -2,0, -1, -6};
	        int res = nobleInteger(arr1);
	        if (res != -1)
	            System.out.println("The noble integer is "+ res);
	        else
	            System.out.println("No Noble Integer Found");
		
		
	}
	 public static int nobleInteger(int arr[])
	    {
	        Arrays.sort(arr);
	 
	        // Return a Noble element if present
	        // before last.
	        int n = arr.length;
	        for (int i=0; i<n-1; i++)
	        {
	            if (arr[i] == arr[i+1])
	                continue;
	 
	            // In case of duplicates, we
	            // reach last occurrence here.
	            if (arr[i] == n-i-1)
	                return arr[i];
	        }
	 
	        if (arr[n-1] == 0)
	            return arr[n-1];
	 
	        return -1;
	    }

}
