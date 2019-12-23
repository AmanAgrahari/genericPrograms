package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class SearchForRange {

	public static void main(String[] args) {
		List<Integer> ret= new ArrayList<Integer>();
		List<Integer> re;
		ret.add(5);
		ret.add(7);
		ret.add(7);
		ret.add(8);
		ret.add(8);
		ret.add(10);
		re= setup(ret,8);
		
		System.out.println(re.toString());

	}
	
	public static List<Integer>  setup (final List<Integer> a,int b){
		
		 ArrayList l= new ArrayList();
	      int first=BinarySearch(a,b,true);
	        if(first==-1){
	            l.add(-1);
	        }
	        else
	        {
	          l.add(first);  
	        }
	         
	        int last=BinarySearch(a,b,false);
	        if(last==-1){
	           l.add(-1); 
	        }else{
	              l.add(last);
	        }
	        return l;
}	        
	        public static int BinarySearch(final List<Integer> a,int B,Boolean searchfirst)
	        {
	            int l=a.size();
	            int low=0;
	            int high=l-1;
	            int result=-1;
	            while(low<=high)
	            {
	                int mid=(low+high)/2;
	                    if(a.get(mid)==B)
	                    {
	                        result=mid;
	                            if(searchfirst)
	                            high=mid-1;
	                            else
	                            low=mid+1;
	                    }
	                    else if(a.get(mid)>B)
	                    high=mid-1;
	                    else
	                    low=mid+1;
	            }
	            return result;
	        }
	            

}
