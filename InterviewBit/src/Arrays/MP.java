package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

import Trees.Node;

public class MP {

	public static void main(String[] args) {
		 int[] arr = {2,3,2,4,5,12,2,3,3,3,12};
		 int arr1[] = {0,1,0,0,2,0,2,1,1,1,0,0};
		 int a[] = new int [10];
		HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
		int hd = 0;
		db(arr, m);
		int i=0;
		while(true){
			System.out.println(arr[i++]);
			if(i>3)
				break;
		}
		}
	static void db(int arr[], HashMap<Integer, ArrayList<Integer>> m) {
		for(int i=0;i<arr.length;i++)
		{	
		ArrayList<Integer> get = m.get(arr[i]);
		if (get == null) {
			get = new ArrayList<>();
			get.add(arr[i]);
		} else{
			get.add(arr[i]);
		}
		m.put(arr[i], get);
		}
		for (Entry<Integer, ArrayList<Integer>> entry : m.entrySet()) {
			System.out.println( entry.getKey()  +" "+  entry.getValue());
		}
	}

}
