import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class SpiralMatrix {

	 public static int[][]  generateMatrix(int A) {
	        int df=A;
	        int[][] a=new int[A][A];
	        int[][] b=new int[A][A];
	        int c=1;
	        for(int i=0;i<a.length;i++){
	            for(int j=0;j<a.length;j++){
	            a[i][j]=c++;  
	            //System.out.println(a[i][j]);
	            }
	        }
	         int i, k = 0, l = 0;
	         int m=a.length-1;
	         int n=a[0].length-1;
	         System.out.println(m+"  "+n);
	        Stack<Integer> stk=new Stack<Integer>();
	      
	        while (k <= m && l <= n)
	        {
	            /* Print the first row from the remaining 
	             rows */
	            for (i = l; i <= n; ++i)
	                stk.push(a[k][i]);
	            k++;
	      
	            /* Print the last column from the remaining
	            columns */
	            for (i = k; i <= m; ++i)
	                stk.push(a[i][n]);
	            n--;
	      
	            /* Print the last row from the remaining 
	            rows */
	            if ( k <= m)
	            {
	                for (i = n; i >= l; --i)
	                    stk.push(a[m][i]);
	                m--;
	            }
	      
	            /* Print the first column from the remaining 
	            columns */
	            if (l <= n)
	            {
	                for (i = m; i >= k; --i)
	                    stk.push(a[i][l]);
	                l++;
	            }
	        }
	        while (!stk.empty())
	        {
	            System.out.print(stk.peek() + " ");
	            stk.pop();
	        }
	        
	      /* int m1=a.length;
	         int n1=a.length;
	       for(int i1=0;i1<m1;i1++){
	            for(int j=0;j<n1;j++){
	            b[i1][j]=stk.pop();    
	            }
	        }*/
	       return b;
	    }
	
/*	
	 public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        int i,k=0,l=0;
	        int last_row=A.size();
	        int last_col=A.get(0).size();
	       while(k<=last_row && l<=last_col)
	        {
	            for(i=l;i<=last_col;i++);
	            result.add(A.get(k).get(i));
	            k++;
	            
	            for(i=k;i<=last_row;i++)
	            result.add(A.get(i).get(last_row));
	            last_col--;
	            
	            if(k<=last_row)
	            {
	                for(i=last_row;i>=l;i--){
	                  result.add(A.get(last_row).get(i));  
	                }
	                last_row--;
	            }
	            if(l<=last_row)
	            {
	                for(i=last_row;i>=k;i--){
	                  result.add(A.get(i).get(l));  
	                }
	                l++;
	            }
	            
	        }
	        return result;
	    }
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		generateMatrix(3);
	}

}
