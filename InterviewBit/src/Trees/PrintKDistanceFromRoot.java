package Trees;

public class PrintKDistanceFromRoot {

	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		
		/*
         * 					  1
         * 				2			3
         * 			4		5	6		7
         */
		
		trace(d, 2);
	}

	
	static void trace(Node d ,int k){
		if(d==null)
			return;
		if(k==0)
		System.out.println(d.key);
		else
		{
			trace(d.left,k-1);
			trace(d.right,k-1);
		}
		
	}
}
