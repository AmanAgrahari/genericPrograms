package Trees;

public class SumOfAllNodesInATree {

	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		System.out.println(add(d));
		 /* 					  1
         * 				2			3
         * 			4		5	6		7
	*/
	}

	
	static int add(Node root){
		if(root==null)
		return 0;
		
		int sum = root.key+add(root.left)+add(root.right);
		return sum;
	}
}
