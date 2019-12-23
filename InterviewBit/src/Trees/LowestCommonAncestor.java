package Trees;

public class LowestCommonAncestor {

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
		Node p= root.right.left;
		Node q=root.right.right.right;
		  /*
         *         1
		        /    \ 
		       2      3
		      / \   /   \
		     4   5  6   7
		               /  \ 
		              8   9 
         */
		lowestAncestor(root, p, q);
	}

	
	static Node lowestAncestor(Node root,Node p, Node q){
		
		if(root==null)
			return null;
		
		if(root==p||root==q)
			return root;
		Node left=lowestAncestor(root.left, p, q);
		Node right = lowestAncestor(root.right, p, q);
		if(left!=null && right!=null)
		{
			System.out.println(root.key);
			return root;
		}
		else
			return (left!=null) ? left:right;
	}
}
