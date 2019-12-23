package Trees;

public class Node {

	int key;
	Node left;
	Node right;
	
	public Node(int data) {
		this.key= data;
		left=right=null;
	
	}
	
	   public void setLeft(Node left) 
	    {
	        this.left = left;
	    }
	  
	    public void setRight(Node right) 
	    {
	        this.right = right;
	    }
	
}
