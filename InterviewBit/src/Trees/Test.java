package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> ret= new ArrayList<Integer>();
		ret.add(3);
		ret.add(4);
		ret.add(1);
		ret.add(4);
		ret.add(1);
		int[] retyy= new int[0];
		 int[] ret1 = new int[ret.size()];
		    for (int i=0; i < ret1.length; i++)
		    {
		        ret1[i] = ret.get(i).intValue();
		        System.out.println(ret1[i]);
		    }
	}

}
