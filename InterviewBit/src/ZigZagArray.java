import java.util.ArrayList;


public class ZigZagArray {

	static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
	
	// arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
    static void sortInWave(int arr[], int n)
    {
        // Traverse all even elements
        for (int i = 0; i < n; i+=2)
        {
            // If current even element is smaller
            // than previous
            if (i>0 && arr[i-1] > arr[i] )
                swap(arr, i-1, i);
 
            // If current even element is smaller
            // than next
            if (i<n-1 && arr[i] < arr[i+1] )
                swap(arr, i, i + 1);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] = {10, 90, 49, 2, 1, 5, 23};
		 int arr1[] = {20, 10, 8, 6, 4, 2};
	        int n = arr1.length;
	        sortInWave(arr1, n);
	        for (int i : arr1)
	            System.out.print(i+" ");
	    }
		
		
	}

