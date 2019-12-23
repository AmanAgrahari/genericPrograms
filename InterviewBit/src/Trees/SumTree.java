package Trees;
/*
 * data of each node is a addition of left subtree and right subtree data
 */
public class SumTree {

	public static void main(String[] args) {
	
		Node d= new Node(56);
		d.left= new Node(13);
		d.right= new Node(15);
		d.left.left= new Node (5);
		d.left.right= new Node(3);
		d.right.left= new Node(9);
		d.right.right= new Node(3);
		d.left.left.left= new Node (3);
		d.left.left.right= new Node(2);
		d.right.right.right= new Node(1);
		d.right.right.left= new Node(2);
/*
 * 									56
 * 						13					15
 * 					5			3		9		3
 * 				3		2					2		1
 * 
 * 
 */
	System.out.println(sumTree(d));
	}
	
	static boolean sumTree(Node root){
		if(root== null)
			return true;
		
		if(root.left==null && root.right==null)
			return true;
		int leftSum=add(root.left);
		int rightSum = add(root.right);
		
		int total= leftSum+ rightSum;
		System.out.println(total);
		if(root.key==total){
			if(sumTree(root.left)&&sumTree(root.right))
				return true;
		}
		return false;
	}
	
	static int add(Node root){
		if(root==null)
		return 0;
		
		int sum = root.key+add(root.left)+add(root.right);
		return sum;
	}
	

}
