import java.util.ArrayList;


public class LonelyInteger {

	
	public static void main(String[] args) {
		ArrayList<Integer> ret= new ArrayList<Integer>();
		ret.add(3);
		ret.add(4);
		ret.add(1);
		ret.add(4);
		ret.add(1);
		int c=0;
		for(int i=0;i<ret.size();i++){
	        if(ret.get(Math.abs(ret.get(i)))>=0){
	        	System.out.println(ret.get(Math.abs(ret.get(i))));
	        	ret.set(ret.get(Math.abs(ret.get(i))),-(ret.get(Math.abs(ret.get(i)))));
	        }else
	        c=ret.get(i);
	    }
		 System.out.println(ret.toString());
		 System.out.println(c);
	int res=0;	 
		 /*int arr[] = {7, 3, 4, 5, 5, 6, 2};
		int xor1=arr[0];
		int xor2=0;
		for(int i=1;i<arr.length;i++)
		{
			xor1^=arr[i];
		}
		 System.out.println("xor1 result  " + xor1);
		for(int i=1;i<arr.length;i++)
		{
			xor2^=i;
		}
		 System.out.println("xor2 result  " + xor2);*/
	}

}
