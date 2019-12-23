import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class BiggestNumber {

	public static void main(String[] args) {
		 ArrayList<String> arr;
	        arr = new ArrayList<String>();
	         
	        //output should be 6054854654
	        arr.add("54");
	        arr.add("546");
	        arr.add("548");
	        arr.add("60");
	      
	        Collections.sort(arr, new Comparator<String>(){
	        	 
	            // A comparison function which is used by 
	            // sort() in printLargest()
	            @Override
	            public int compare(String X, String Y) {
	             
	            // first append Y at the end of X
	            String XY=X + Y;
	             
	            // then append X at the end of Y
	            String YX=Y + X;
	             
	            // Now see which of the two formed numbers 
	            // is greater
	            return XY.compareTo(YX) > 0 ? -1:1;
	        }
	        });
	             
	        Iterator it = arr.iterator();
	     String s="";
	        while(it.hasNext()){
	        	//System.out.print(it.next());
		         s=s+it.next();
	        }
	        System.out.print(s);
	        }

	}

