package Trees;

public class AncestorsOfANode {

	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		
		Node p=d.right.right;
		/*
         * 					  1
         * 				2			3
         * 			4		5	6		7
         */

		System.out.println(ancestorsOfANode(d,p));

	}

	
	static boolean ancestorsOfANode(Node d,Node p){
		if(d!=null)
		{
			if(d.key==p.key)
			return true;
			if(ancestorsOfANode(d.left, p)|| ancestorsOfANode(d.right, p))
			{
				System.out.println(d.key);
				return true;
			}
		}
		return false;	
	}
}
