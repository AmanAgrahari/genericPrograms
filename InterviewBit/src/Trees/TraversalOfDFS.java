package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class TraversalOfDFS {
	
	public TraversalOfDFS() {
	}
	
	void printPreorder(Node node)
    {
        if (node == null)
            return;
 
        /* first print data of node */
        System.out.print(node.key + " ");
 
        /* then recur on left sutree */
        printPreorder(node.left);
 
        /* now recur on right subtree */
        printPreorder(node.right);
    }
	
	 void printInorder(Node node)
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
	  void printPostorder(Node node)
	    {
	        if (node == null)
	            return;
	 
	        // first recur on left subtree
	        printPostorder(node.left);
	 
	        // then recur on right subtree
	        printPostorder(node.right);
	 
	        // now deal with the node
	        System.out.print(node.key + " ");
	    }
	
	public static void main(String[] args) {
		TraversalOfDFS tree= new TraversalOfDFS();	
	
				Node d= new Node(1);
				d.left= new Node(2);
				d.right= new Node(3);
				d.left.left= new Node (4);
				d.left.right= new Node(5);
				d.right.left= new Node(6);
				d.right.right= new Node(7);
		
		
/*	        System.out.println("Preorder traversal of binary tree is ");
	        tree.printPreorder(d);
	        System.out.println("\nPreorder traversal of binary tree using iterative level ");
	        tree.preorderTraversal(d);
	 
	        System.out.println("\nInorder traversal of binary tree is ");
		    tree.printInorder(d);
		    System.out.println("\nInorder traversal of binary tree using iterative level ");
	        tree.inorderTraversal(d);
	        
	 
	        System.out.println("\nPostorder traversal of binary tree is ");
	        tree.printPostorder(d);
	        System.out.println("\nPostorder traversal of binary tree using iterative level ");*/
	        //tree.postorderTraversal(d);
				

	        /*
	         * 					  1
	         * 				2			3
	         * 			4		5	6		7
	         */
				
		        
	        tree.inorder(d);
				

	}
	public int[] inorderTraversal(Node a) {
        int[] rety= new int[0];
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        if(a == null)
            return rety;
            
        Node node = a;
        //Go all the way to the left and then start poping add the val and go to the right
        while(!stack.isEmpty() || node != null){
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                node = stack.pop();
                result.add(node.key);
                node = node.right;
            }
        }
         int[] ret = new int[result.size()];
		    for (int i=0; i < ret.length; i++)
		    {
		        ret[i] = result.get(i).intValue();
		        System.out.print(ret[i]+ " ");
		    }
        return ret;
    }
	
	public  int[] preorderTraversal(Node a) {
        int[] rety= new int[0];
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        if(a == null)
            return rety;
            
        Node node = a;
        //Go all the way to the left and then start poping add the val and go to the right
        while(!stack.isEmpty() || node != null){
            if(node != null){
            	result.add(node.key);
                stack.push(node);
                node = node.left;
            }
            else{
                node = stack.pop();          
                node = node.right;
            }
        }
         int[] ret = new int[result.size()];
		    for (int i=0; i < ret.length; i++)
		    {
		        ret[i] = result.get(i).intValue();
		        System.out.print(ret[i]+" ");
		    }
        return ret;
    }
	
	public int[] postorderTraversal(Node a) {
        int[] rety= new int[0];
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        if(a == null)
            return rety;
            
        Node node = a;
        //Go all the way to the left and then start poping add the val and go to the right
        while(!stack.isEmpty() || node != null){
            while(node != null){
                if(node.right != null)
                    stack.push(node.right);
                	stack.add(node);
                	node = node.left;
            }
            node = stack.pop();
            
            if(node.right != null && !stack.isEmpty() && node.right == stack.peek()){
                Node rightNode = stack.pop();
                stack.push(node);
                node = rightNode;
            }
            else{
                result.add(node.key);
                node = null;
            }
        } 
         int[] ret = new int[result.size()];
		    for (int i=0; i < ret.length; i++)
		    {
		        ret[i] = result.get(i).intValue();
		        System.out.print(ret[i]+" ");
		    }
        return ret;
    }
	 public void inorder(Node root) {
		 Node current = root;
	        while(current != null) {
	            //left is null then print the node and go to right
	            if (current.left == null) {
	                System.out.print(current.key + " ");
	                current = current.right;
	            }
	            else {
	                //find the predecessor.
	            	Node predecessor = current.left;
	                //To find predecessor keep going right till right node is not null or right node is not current.
	                while(predecessor.right != current && predecessor.right != null){
	                    predecessor = predecessor.right;
	                }
	                //if right node is null then go left after establishing link from predecessor to current.
	                if(predecessor.right == null){
	                    predecessor.right = current;
	                    current = current.left;
	                }else{ //left is already visit. Go rigth after visiting current.
	                    predecessor.right = null;
	                    System.out.print(current.key + " ");
	                    current = current.right;
	                }
	            }
	        }
	    }

	    public void preorder(Node root) {
	    	Node current = root;
	        while (current != null) {
	            if(current.left == null) {
	                System.out.print(current.key + " ");
	                current = current.right;
	            }
	            else {
	            	Node predecessor = current.left;
	                while(predecessor.right != current && predecessor.right != null) {
	                    predecessor = predecessor.right;
	                }
	                if(predecessor.right == null){
	                    predecessor.right = current;
	                    System.out.print(current.key + " ");
	                    current = current.left;
	                }else{
	                    predecessor.right = null;
	                    current = current.right;
	                }
	            }
	        }
	    }

}
