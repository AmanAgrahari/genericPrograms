
public class Algo {
	
	static int calc (int[] arr, int n){
		int s=0;
		for(int i=0;i<n-1;i++){
			s=s+((arr[i+1]-arr[i])/arr[i])*100;
		}
		System.out.println("sum:"+s);
		s=s/n -1;
		System.out.println("sum1:"+s);
		int a=arr[0]+(s*arr[0])/100;
		System.out.println(a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] =  {2,4,6,8};
	        int n = arr.length;
	        System.out.println("Length of the Longest consecutive subsequence is " +
	                           calc(arr,n));
	}

}
