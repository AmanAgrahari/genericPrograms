package Trees;

public class MirrorOfTree {

	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		
		Node p= new Node(1);
		p.left= new Node(3);
		p.right= new Node(2);
		p.left.left= new Node (7);
		p.left.right= new Node(6);
		p.right.left= new Node(5);
		p.right.right= new Node(4);
		
		System.out.println(isMirroeImage(d, p));
		
		
		/*
         * 					  1
         * 				2			3
         * 			4		5	6		7
         */

	}
	
	static boolean isMirroeImage(Node r1 ,Node r2){
		if(r1==null && r2==null)
			return true;
		if(r1==null || r2==null)
			return false;
		if(isMirroeImage(r1.left, r2.right) && isMirroeImage(r1.right, r2.left))
			return true;;
			return false;
	}

}
