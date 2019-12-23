package Trees;

public class MaxDepthOfATree {

	static int ld=0;
	static int rd=0;
	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		
		Node p= new Node(1);
		p.left= new Node(2);
		p.right= new Node(3);		
		p.right.left=new Node(8);
		p.right.right=new Node(9);
		p.left.left= new Node (4);
		p.left.right= new Node(5);
		p.left.left.left= new Node(6);
		p.left.left.right= new Node(7);
		/*
         * 					  1
         * 				2			3
         * 			4		5	6		7
         */
		System.out.println(maxDepth(d));
		System.out.println(minimumDepth(p));

	}

	static int maxDepth(Node d){
		if(d==null)
			return -1;
		else
		{
			int leftDepth= maxDepth(d.left);
			int rightDepth= maxDepth(d.right);
			return Math.max(leftDepth, rightDepth)+1;
		}
	}
	
	 static int minimumDepth(Node root)
	    {
	        // Corner case. Should never be hit unless the code is
	        // called on root = NULL
	        if (root == null)
	            return -1;
	 
	        // Base case : Leaf Node. This accounts for height = 1.
	        if (root.left == null && root.right == null)
	            return 0;
	 
	        // If left subtree is NULL, recur for right subtree
	        if (root.left == null)
	        	return minimumDepth(root.right) + 1;
	 
	        // If right subtree is NULL, recur for right subtree
	        if (root.right == null)
	        	return minimumDepth(root.left) + 1;
	 
	        return Math.min(minimumDepth(root.right),minimumDepth(root.left)) + 1;
	    }
}
