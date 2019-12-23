import java.util.ArrayList;

public class ARRAY_BUG {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			ret.add(A.get((i + B)% A.size()));
			System.out.println("inside method "+A.get((i + B)% A.size())+ " i+B is: " + i+B);
		}
		return ret;
	}
	
	static ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
                B.set(i, A.get(i));
                B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
		}
	
	
	public static void main(String [] args)
	{
		ArrayList<Integer> ret = new ArrayList<Integer>();
		ArrayList<Integer> ret1;
		ret.add(1);
		ret.add(2);
		ret.add(3);
		ret.add(4);
		ret.add(5);
		System.out.println(ret.size());
		ARRAY_BUG s= new ARRAY_BUG();
		ret1= s.rotateArray(ret, 2);
		System.out.println(ret1.toString());
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(5);
		A.add(10);
		A.add(2);
		A.add(1);
		
		ArrayList<Integer> B = performOps(A);
		for (int i = 0; i < B.size(); i++) {
		        System.out.print(B.get(i) + " ");
		}
	}
}