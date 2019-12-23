package BinarySearch;

public class FindSqrt {

	public static void main(String[] args) {

        int x = 11;
        System.out.println(floorSqrt(930675566));
        System.out.println(sqrt(930675566));

	}
	public static int sqrt(int a) 
    {	    
    if(a <= 1)
        return a;
        int max = a;
        int min = 1;
        int ans = 0;
        
        while(min < max){
        int mid = min + (max - min)/2;
        
        if(mid == a/mid)
        return mid;
        
        else if(mid < a/mid){
        ans = mid;
        min = mid+1;
        }
        else
        {
        max = mid;
        }
        }
        return ans;
	}
	
	
	/*so for larger inputs see above solution
	/*
	 * Input: 930675566
		O/p: 229913703
		Correct O/p: 30506
	 */
	public static int floorSqrt(int x)
    {
        if (x == 0 || x == 1)
            return x;
 
        int start = 1, end = x, ans=0;
        while (start <= end)
        {
            int mid = (start + end) / 2;
 
            if (mid*mid == x)
                return mid;
 
            // Since we need floor, we update answer when mid*mid is
            // smaller than x, and move closer to sqrt(x)
            if (mid*mid < x)
            {
                start = mid + 1;
                ans = mid;
            }
            else   // If mid*mid is greater than x
                end = mid - 1;
        }
        return ans;
    }

}
