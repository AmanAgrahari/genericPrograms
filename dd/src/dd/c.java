package dd;

import java.util.HashMap;
import java.util.Map;

public class c {

	private static int countPairsWithSum_ByHashMap(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//Find and store frequency of each number in array
		for(int num : arr){
			if(map.containsKey(num)){
				int count = map.get(num);
				map.put(num, count + 1);
			}else{
				map.put(num, 1);
			}
		}
 
		int pairs = 0;
		for(int num : arr){
			if(map.containsKey(sum - num)){
				pairs += map.get(sum - num);	//counting each pair 2 times
				
				//Condition for case {1,1,1,1} : 2
				if(sum - num == num){
					pairs--;
				}
			}
		}
		//Divide by 2 as we counted each pair twice
		return pairs/2;
	}
	public static void main(String []args)
	{
		int arr[] = {10, 12, 10, 15, -1, 7, 6, 
                5, 4, 2, 1, 1, 1}; 
       int sum = 11;
       int k= countPairsWithSum_ByHashMap(arr, sum);
       System.out.println(k);
	}
}
