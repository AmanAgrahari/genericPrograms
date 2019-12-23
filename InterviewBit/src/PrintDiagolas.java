import java.util.ArrayList;
/*
 * Input: 	

1 2 3
4 5 6
7 8 9

Return the following :

[ 
  [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9]
]

 */

public class PrintDiagolas {
	 public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
	        
      ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
      ArrayList<Integer> temp = new ArrayList<Integer>();        
      temp.add(A.get(0).get(0));
       
     int m = A.size();
    int n = A.get(0).size();
    int i,j;
    for(int k=0;k<=m-1;k++){
        i=k;
        j=0;
        temp.clear();
        while(i>=0){
         temp.add(A.get(i).get(j));
         i=i-1;
         j=j+1;
        }
        result.add(new ArrayList<Integer>(temp));
    }
    
    for(int k=1;k<n-1;k++)
    {
        i=m-1;
        j=k;
        temp.clear();
        while(j<n-1)
        {
        temp.add(A.get(i).get(j));    
        i=i-1;
        j=j+1;
        }
        result.add(new ArrayList<Integer>(temp));
    }
return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
