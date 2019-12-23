package BinarySearchTree;

public class InsertAndSearch {
	public InsertAndSearch() {
		// TODO Auto-generated constructor stub
	}
	public Node insertRec(Node root, int key) {
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }
	        if (key < root.key)
	            root.left = insertRec(root.left, key);
	        else if (key > root.key)
	            root.right = insertRec(root.right, key);
	        return root;
	 }
	
	public void inOrder(Node root){
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.key+" ");
		inOrder(root.right);
	}
	
	
	Node DeleteAman(Node root,int data)
	{
		if(root==null)
		return root;
		else if(data<root.key)
		root.left=DeleteAman(root.left,data);
		else if(data>root.key)
		root.right=DeleteAman(root.right, data);
		else
		{
			if(root.left==null && root.right==null)
				root=null;
			else if(root.left==null)
			{
				Node temp=root;
				root=root.right;
				temp=null;
			}
			else if(root.right==null)
			{
				Node temp=root;
				root=root.left;
				temp=null;
				
			}
			else{
				int temp=findMin(root.right);
				root.key=temp;
				root.right=DeleteAman(root.right, temp);
			}
		}
		return root;
	}
	
	int findMin(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
	public static void main(String[] args) {
			Node root=new Node(50);
			InsertAndSearch is=new InsertAndSearch();
			is.insertRec(root, 30);
			is.insertRec(root, 20);
			is.insertRec(root, 40);
			is.insertRec(root, 70);
			is.insertRec(root, 60);
			is.insertRec(root, 80);
			is.inOrder(root);
			 System.out.println("\nDelete 20");
		     is.DeleteAman(root,20);
		     System.out.println("Inorder traversal of the modified tree");
		     is.inOrder(root);
		     System.out.println("\nDelete 30");
		     is.DeleteAman(root,30);
		     System.out.println("Inorder traversal of the modified tree");
		     is.inOrder(root);
		     System.out.println("\nDelete 50");
		     is.DeleteAman(root,50);
		     System.out.println("Inorder traversal of the modified tree");
		     is.inOrder(root);
	}


}
