package Trees;

public class IdenticalTrees {

	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		
		Node p= new Node(1);
		p.left= new Node(2);
		p.right= new Node(3);
		p.left.left= new Node (4);
		p.left.right= new Node(5);
		p.right.left= new Node(6);
		p.right.right= new Node(7);
		System.out.println(isIdentical(d, p));
		
		/*
         * 					  1
         * 				2			3
         * 			4		5	6		7
         */
		Node q= new Node(3);
		q.left= new Node(6);
		q.right= new Node(7);
		
		System.out.println(isSubtree(p, q));
		
	}
	
	//we can also check if post,pre and inorder traversal are same
	
	static boolean isIdentical(Node r1 ,Node r2){
		if(r1==null && r2==null)
			return true;
			if(r1!=null || r2!=null)
				{
					if((r1.key==r2.key)&&(isIdentical(r1.left, r2.left))
							&&(isIdentical(r1.right, r2.right)))
							return true;
				}
			return false;
		}

	
	//to check a tree is a subtree
	
	static boolean isSubtree(Node m,Node s){
		if(s==null)
			return true;
		if(m==null)
			return false;
		if(isIdentical(m, s)){
			return true;
		}
		return (isSubtree(m.left, s)|| isSubtree(m.right, s));
		
	}
}
