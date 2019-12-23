package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PerfectTreeSpecificLevelOrder {

	public static void main(String[] args) {
		Node root= new Node(1);
	       root.left = new Node(2);
	       root.right = new Node(3);
	       root.left.left  = new Node(4);
	       root.left.right = new Node(5);
	       root.right.left  = new Node(6);
	        root.right.right = new Node(7);
	       root.left.left.left  = new Node(8);
	       root.left.left.right  = new Node(9);
	        root.left.right.left  = new Node(10);
	       root.left.right.right  = new Node(11);
	        root.right.left.left  = new Node(12);
	       root.right.left.right  = new Node(13);
	       root.right.right.left  = new Node(14);
	       root.right.right.right  = new Node(15);	       
	       printSpecificLevelOrder(root);
	  
	}
	
	
	static void printSpecificLevelOrder(Node root){
		Stack<Node> S = new Stack();
		Queue<Node> p =new LinkedList<>();
		Queue<Node> q =new LinkedList<>();
		System.out.print(root.key +" ");
		S.push(root);
		p.offer(root.left);
		q.offer(root.right);		
		while(!p.isEmpty() || !q.isEmpty() )
		{
			
			Node a= p.poll();
			//System.out.print(a.key+" ");
			S.push(a);
			Node b= q.poll();
			//System.out.print(b.key+" ");
			S.push(b);
			
		
			
			if(a.left!=null)
				p.offer(a.left);
			if(a.right!=null)
				p.offer(a.right);
			if(b.right!=null)
				q.offer(b.right);
			if(b.left!=null)
				q.offer(b.left);
			
		}
		System.out.println();
		while(!S.isEmpty())
		{
			System.out.print(S.pop().key + " ");
		}
			
	}

}
