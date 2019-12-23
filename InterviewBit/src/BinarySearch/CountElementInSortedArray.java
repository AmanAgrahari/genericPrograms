package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class CountElementInSortedArray {

	public static void main(String[] args) {

		int a[]={4, 7, 7, 7, 8, 10, 10};
		int b[]={1};
		ArrayList<Integer> ret= new ArrayList<Integer>();
		ret.add(4);
		ret.add(5);
		ret.add(6);
		ret.add(7);
		ret.add(0);
		ret.add(1);
		ret.add(2);
		int c=searchRotatedArray(ret);
		System.out.println(c);


	}
	public static int searchRotatedArray(final List<Integer> a) {
        int b= a.size();
        int left = 0;
        int right = a.size() - 1;
        while(left <= right){
            int mid = left + ((right - left) /2);
            if(a.get(mid) == b)
                return mid + 1;
            if(a.get(left) <= a.get(mid)){
                if(a.get(left) <= b && b < a.get(mid))
                    right = mid - 1;
                else
                    left = mid + 1;                    
            }
            else{
                if(a.get(mid) < b && b <= a.get(right))
                    left = mid + 1;
                else 
                    right = mid - 1;
            }
        }
        return -1;
	}
	public static int findMin(final List<Integer> a) {
	    int l=a.size();
	    int low=0;
	    int high=l-1;
	    while(low<=high){
	        if(a.get(low)<=a.get(high))
	        return low;
	        int mid=(low+high)/2;
	        int next=(mid+1)%l;
	        int prev=(mid+l-1)%l;
	        if(a.get(mid)<=a.get(next)&&a.get(mid)<=a.get(prev))
	        return mid;
	        else if(a.get(mid)<=a.get(high))
	        high=mid-1;
	        else if(a.get(mid)>=a.get(low))
	        low=mid+1;
	    }
	    return -1;
	}
	 public static int findCount(final int[] A, int B) {
	        int first=BinarySearch(A,B,true);
	        if(first==-1)
	        return 0;
	        int last=BinarySearch(A,B,false);
	        int count=last-first+1;
	        return count;
	        }
	        
	        public static int BinarySearch(int [] A,int B,Boolean searchfirst){
	            int l=A.length;
	            int low=0;
	            int high=l-1;
	            int result=-1;
	            while(low<=high)
	            {
	                int mid=(low+high)/2;
	                    if(A[mid]==B)
	                    {
	                        result=mid;
	                            if(searchfirst)
	                            high=mid-1;
	                            else
	                            low=mid+1;
	                    }
	                    else if(A[mid]>B)
	                    high=mid-1;
	                    else
	                    low=mid+1;
	            }
	            return result;
	    }

}
