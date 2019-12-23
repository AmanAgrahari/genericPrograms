package Trees;

public class LeftRightViewBtree {
	 static int  max_level = 0;
	 static int max_level_right=0;
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
		
		Node root_1 = new Node(4);
		root_1.left= new Node(5);
		root_1.right= new Node(2);
		root_1.left.right= new Node(1);
		root_1.left.left= new Node(3);
		root_1.left.left.left=new Node(6);
		root_1.left.left.right=new Node(7);
		/*
		  			4
		  		  /  \
		  		 5    2
		  		/  \
		  	  3     1
		  	 / \
		  	6   7
		  		
		 
		 */
		/*System.out.println("Right view of binary tree");
		printRightView(root,1);
		System.out.println();*/
		System.out.println("Left view of binary tree");
		printleftView(root,1);
        /*
         * 
         *         1
		        /    \ 
		       2      3
		      / \   /   \
		     4   5  6   7
		               /  \ 
		              8   9 
		             
		    o/p: The left view contains all nodes that are first nodes in their levels.         
         */

	}
	 static void printleftView(Node node, int level)
	    {
	        // Base Case
	        if (node==null) return;
	 
	        // If this is the first node of its level
	        if (max_level < level)
	        {
	            System.out.print(" " + node.key);
	            max_level = level;
	        }
	 
	        // Recur for left and right subtrees
	        printleftView(node.left, level+1);
	        printleftView(node.right, level+1);
	       
	        
	    }
/*
 * The Right view contains all nodes that are last nodes in their levels.
 */
	 
	 
	 static void printRightView(Node node, int level)
	    {
	        // Base Case
	        if (node==null) return;
	 
	        // If this is the first node of its level
	        if (max_level_right < level)
	        {
	            System.out.print(" " + node.key);
	            max_level_right = level;
	        }
	 
	        // Recur for left and right subtrees
	        printleftView(node.left, level+1);
	        printleftView(node.right, level+1);
	       
	        
	    }
}
