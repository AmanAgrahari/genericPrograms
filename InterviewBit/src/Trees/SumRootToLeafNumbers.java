package Trees;

public class SumRootToLeafNumbers {

	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		System.out.println(sumNumbers(d));
		 /* 					  1
         * 				2			3
         * 			4		5	6		7
         * 
         * 124
         * 125
         * 136
         * 137
	*/

	}
	
	   public static int sumNumbers(Node root) {
	        int k=treePathsSumUtil(root,0);
	   
	        return k%1003;
	    }
	    
	        static int treePathsSumUtil(Node node, int val) 
	    {
	        // Base case
	        if (node == null)
	            return 0;
	  
	        // Update val
	        val = (val * 10 + node.key);
	  
	        // if current node is leaf, return the current value of val
	        if (node.left == null && node.right == null)
	            return val;
	  
	        // recur sum of values for left and right subtree
	        return treePathsSumUtil(node.left, val)
	                + treePathsSumUtil(node.right, val);
	    }

}
