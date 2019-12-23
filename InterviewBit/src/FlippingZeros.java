
public class FlippingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1,0,0,1,1,1,1,0,1,1,0};
		
		int max=0;
		int max1=arr[0];
		int c=0;
		 for(int i = 0; i < arr.length; i++)
		    {
			 if(arr[i]==1 && arr[i+1]==1)
			 {
				 arr[i]=0;
				 c++;
			 }
			 
		    }
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }

	}

}
