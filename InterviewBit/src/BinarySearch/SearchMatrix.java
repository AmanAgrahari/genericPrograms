package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class SearchMatrix {

	public static void main(String[] args) {
		   List<ArrayList<Integer>> a = new ArrayList<>();

	        ArrayList<Integer> a1 = new ArrayList<Integer>();
	        ArrayList<Integer> a2 = new ArrayList<Integer>();
	        ArrayList<Integer> a3 = new ArrayList<Integer>();


	        a1.add(1);
	        a1.add(2);
	        a1.add(3);

	        a2.add(4);
	        a2.add(5);
	        a2.add(6);

	        a3.add(7);
	        a3.add(8);
	        a3.add(9);

	        a.add(a1);
	        a.add(a2);
	        a.add(a3);
	        for(ArrayList obj:a){

	            ArrayList<Integer> temp = obj;

	            for(Integer job : temp){
	                System.out.print(job+" ");
	            }
	            System.out.println();
	        }
	        
	       // System.out.println(searchMatrix(a, 5));
	        System.out.println(searchMatrix1(a, 5));

	}
	
	public static int searchMatrix(List<ArrayList<Integer>> a, int b) {
	    
	    if(a == null || a.size() == 0 || a.get(0).size() == 0)
            return 0;
        int n = a.size();
        int i=0;
        int j = a.get(0).size()-1;
          while ( i < n && j >= 0 )
           {
              if ( a.get(i).get(j) == b )
              {
                 return 1;
              }
              if ( a.get(i).get(j) > b )
                j--;
              else 
                i++;
           }
           return 0;  
	}
	
	 public static int searchMatrix1(List<ArrayList<Integer>> A, int B) {
	        if(A == null || A.size() == 0 || A.get(0).size() == 0)
	            return 0;
	        int m = A.size();
	        System.out.println(m);
	        int n = A.get(0).size();
	        System.out.println(n);
	        
	        int start = 0;
	        int end = m * n -1;
	        while(start <= end){
	            int mid = start + (end - start)/2;
	            int midX = mid / n;
	            int midY = mid % n;
	            
	            if(A.get(midX).get(midY) == B){
	                return 1;
	            }
	            else if(A.get(midX).get(midY) < B) {
	                start = mid + 1;
	            }
	            else if(A.get(midX).get(midY) > B) {
	                end = mid - 1;
	            }
	        }
	        return 0;
	    }

}
