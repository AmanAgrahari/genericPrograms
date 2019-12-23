package Trees;

public class BoundaryElements {

	public static void main(String[] args) {
		
		Node root= new Node(20);
	        root.left = new Node(8);
	        root.left.left = new Node(4);
	        root.left.left.right=new Node(9);
	        root.left.left.right.left=new Node(99);
	        root.left.right = new Node(12);
	        //root.left.right.left = new Node(10);
	        root.left.right.right = new Node(14);
	        root.left.right.right.right = new Node(6);
	        root.right = new Node(22);
	        root.right.right = new Node(25);
	        printBoundary(root);
	}
	 static void printBoundary(Node node) 
	    {
	        if (node != null) 
	        {
	            System.out.print(node.key + " ");
	  
	            // Print the left boundary in top-down manner.
	            printBoundaryLeft(node.left);
	  
	            // Print all leaf nodes
	            printLeaves(node.left);
	            printLeaves(node.right);
	  
	            // Print the right boundary in bottom-up manner
	            printBoundaryRight(node.right);
	        }
	    }
	  static void printBoundaryRight(Node node) 
	    {
	        if (node != null) 
	        {
	            if (node.right != null) 
	            {
	                // to ensure bottom up order, first call for right
	                //  subtree, then print this node
	                printBoundaryRight(node.right);
	                System.out.print(node.key + " ");
	            } 
	           /* else if (node.left != null) 
	            {
	                printBoundaryRight(node.left);
	                System.out.print(node.key + " ");
	            }*/
	            // do nothing if it is a leaf node, this way we avoid
	            // duplicates in output
	        }
	    }
	 static  void printBoundaryLeft(Node node) 
	    {
	        if (node != null) 
	        {
	            if (node.left != null) 
	            {
	                  
	                // to ensure top down order, print the node
	                // before calling itself for left subtree
	                System.out.print(node.key + " ");
	                printBoundaryLeft(node.left);
	            } 
	           /* else if (node.right != null) 
	            {
	                System.out.print(node.key + " ");
	                printBoundaryLeft(node.right);
	            }*/
	  
	            // do nothing if it is a leaf node, this way we avoid
	            // duplicates in output
	        }
	    }
	 static void printLeaves(Node node) 
	    {
	        if (node != null) 
	        {
	            printLeaves(node.left);
	  
	            // Print it if it is a leaf node
	            if (node.left == null && node.right == null)
	                System.out.print(node.key + " ");
	            printLeaves(node.right);
	        }
	    }

}
//20 8 4 9 99 6 25 22 