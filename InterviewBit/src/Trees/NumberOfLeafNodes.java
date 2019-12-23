package Trees;

public class NumberOfLeafNodes {

	static int c=0;
	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		System.out.println(count_leaves(d));

	}
	
	static int count_leaves(Node root){
		if(root==null)
			return 1;
		else
		{
			if(root.left==null && root.right==null)
			{
				c++;
			}
			else
			{
				if(root.left!=null)
					count_leaves(root.left);
				if(root.right!=null)
					count_leaves(root.right);
			}
		}
		return c;
		
	}

}
