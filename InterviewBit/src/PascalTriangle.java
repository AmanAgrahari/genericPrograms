import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {

	public static ArrayList<ArrayList<Integer>> generate(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
      if(A <= 0)
          return result;
      ArrayList<Integer> preRow = new ArrayList<Integer>();        
      preRow.add(1);
      result.add(preRow);                
      for(int i = 2; i <= A; i++){
          ArrayList<Integer> currRow = new ArrayList<Integer>(); 
          currRow.add(1);
          for(int j = 0; j < preRow.size()- 1; j++){
              currRow.add(preRow.get(j) + preRow.get(j+1));
          }
          currRow.add(1);
          result.add(currRow);
          preRow = currRow;
      }                
      return result;
  }
	
	public static List<Integer> getRow(int rowIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>();
	 
		if (rowIndex < 0)
			return result;
	 
		result.add(1);
		
		for (int i = 1; i <= rowIndex; i++) {
			for (int j = result.size() - 2; j >= 0; j--) {
				result.set(j + 1, result.get(j) + result.get(j + 1));
			}
			result.add(1);
		}
		return result;
	}
	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		 ArrayList<ArrayList<Integer>> result1 = new ArrayList<ArrayList<Integer>>();
		int arr[][] = new int[4][4];
		result=(ArrayList<Integer>) getRow(2);
		//System.out.println(result.toString());

		result1= generate(4);
	}
}
