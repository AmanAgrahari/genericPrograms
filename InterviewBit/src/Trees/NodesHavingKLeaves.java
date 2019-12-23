package Trees;

public class NodesHavingKLeaves {

	static int k=2;
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		root.right.right.right = new Node(9);
		Node q=root.right.right.right;
		  /*
       *         1
		        /    \ 
		       2      3
		      / \   /   \
		     4   5  6   7
		             \    \ 
		               8   9 
       */
		nodesHavingKLeaves(root);
	}

	
	static int nodesHavingKLeaves(Node root){
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
		return 1;
		int lc=nodesHavingKLeaves(root.left);
		int rc= nodesHavingKLeaves(root.right);
		int tlc=rc+lc;
		if(tlc==k)
			System.out.println(tlc +" "+root.key);
		return tlc;
		
	}
}
