package Trees;

import java.util.Stack;

public class rajatMishra {
	static int sum =0;
	Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) {
		Node d= new Node(10);
		d.left= new Node(4);
		d.right= new Node(15);
		d.left.left= new Node (1);
		d.left.right= new Node(8);
		d.left.right.left= new Node(6);
		d.left.right.right= new Node(9);
		d.right.left= new Node(11);
		d.right.left.left= d.left;
		d.right.right= new Node(20);
		d.right.right.left= new Node(18);
					/*
					 * 				 10
					 * 			   / 	 \
					 * 			  4  	  15
					 * 			/  \	  /  \
					 * 		  1     8	 11   20
					 *             / \  /	  /
					 *            6   9      18					
					 */
		isBST(d,null,null,null);
		printInorder(d);
					
	}
	//1 4 6 8 9 10 9 11 15 18 20 
		
		
		static void isBST(Node root, Node l, Node r,Node parent)
		{
		    // Base condition
		    if (root == null)
		        return ;

		    if (l != null && root.key < l.key){
		        	parent.left=null;
		     	    return;
		    }
		    if (r != null && root.key > r.key){
		        	parent.right=null;
		    		return;
		    }
		    isBST(root.left, l, root,root);
	        isBST(root.right, root, r,root);
		}
		
		 static void printInorder(Node node)
		    {
		        if (node == null)
		            return;
		 
		        /* first recur on left child */
		        printInorder(node.left);
		 
		        /* then print the data of node */
		        System.out.print(node.key + " ");
		 
		        /* now recur on right child */
		        printInorder(node.right);
		    }
}

