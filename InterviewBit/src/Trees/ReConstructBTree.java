package Trees;

public class ReConstructBTree {

	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		/*d.right.left= new Node(6);
		d.right.right= new Node(7);*/

		int [] preOrder= {1,2,4,5,3,6,7};
		int [] inOrder= {4,2,5,1,6,3,7};
		
		Node node = Construct(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
		
		
		System.out.println("inOrder");
		printInorder(node);
		System.out.println("preOrder");
		printPreorder(node);
	}
	
	static Node Construct(int [] pre,int preStart,int preEnd,int [] in, int inStart,int inEnd)
	{
		//firstly check if there is only one element or no element so return immediately
		if(preStart> preEnd)
			return null;
		if(preStart==preEnd)
			return new Node(pre[preStart]);
		
		//as the first element in preOrder in root
		//and we will find the values in inorder arrayto determine how many 'left' elements is there
		//and use that to construct the leftSubtreee and the right subtree
		int rowIndexInOrder=0;
		for(int i=inStart;i<=inEnd;i++)
		{
			if(in[i]==pre[preStart]){
				rowIndexInOrder=i;
				break;
			}
				
		}
		//now we know how many values in left Subtree
		int leftSubcount=rowIndexInOrder-inStart;
		int rightSubcount=inEnd-rowIndexInOrder;
		
		//before that we will build a tree
		Node node=new Node(pre[preStart]);
		
		node.left=Construct(pre, preStart+1, preStart+leftSubcount, in, inStart, inStart+leftSubcount-1);
		node.right=Construct(pre, preStart+leftSubcount+1, preEnd, in, inStart+leftSubcount+1, inEnd);
		
		return node;
	}
	static void printPreorder(Node node)
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
