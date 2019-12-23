package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotatedSortedList {

	public static void main(String[] args) {
		List<Integer> ret= new ArrayList<Integer>();
		ret.add(4);
		ret.add(5);
		ret.add(6);
		ret.add(7);
/*		ret.add(0);
		ret.add(1);
		ret.add(2);*/
		int x= Collections.binarySearch(ret, 8);
		if(x<0){
			int y=Math.abs(x)-1;
			System.out.println(y);
		}
		else{
			System.out.println(x);
		}
			
	/*int y =pivotedSearch(ret, 4);
	System.out.println(y);
	System.out.println(0%1);*/
		
	}
	
	static int pivotedSearch(final List<Integer> a, int b)
	{
	      int n=a.size();
	    int pivot = findpivot(a);
	       if (pivot == -1)
	           return binarySearch(a, 0, n-1, b);
	       
	       if (a.get(pivot) == b)
	           return pivot;
	       if (a.get(0) <= b)
	           return binarySearch(a, 0, pivot-1, b);
	       return binarySearch(a, pivot+1, n-1, b);
	}
	
	 static int binarySearch(final List<Integer> a, int low, int high, int key)
    {
       if (high < low)
           return -1;
       /* low + (high - low)/2; */      
       int mid = (low + high)/2;  
       if (key == a.get(mid))
           return mid;
       if (key > a.get(mid))
           return binarySearch(a, (mid + 1), high, key);
       return binarySearch(a, low, (mid -1), key);
    }
	
	static int findpivot(final List<Integer> a){
	   int low=0;
	   int high=a.size()-1;
	   int n=a.size();
	   while(low<=high)
	   {
	       if(a.get(low)<=a.get(high)){
	           return low;
	       }
	       int mid=(low+high)/2;
	       int next=(mid+1)%n;
	       int prev=(mid+n-1)%n;
	       if(a.get(mid)<=a.get(next) && a.get(mid)<=a.get(prev))
	       return mid;
	       else if(a.get(mid)<=a.get(high))
	       high=mid-1;
	       else if(a.get(mid)>=a.get(low))
	       low=mid+1;
	   }
	   return -1;
	}
}
