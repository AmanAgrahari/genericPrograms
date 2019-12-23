package Trees;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

import javax.xml.namespace.QName;

public class LevleOrderTraversal {

	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		   /*
         * 					  1
         * 				2			3
         * 			4		5	6		7
         */
		//BfsOnTree(d);
		BfsOnTreeLinebyLine(d);
		//ReverseBfsOnTreeLinebyLine(d);
		
	}
	static void  BfsOnTree(Node n){
		Queue<Node> q =new LinkedList<>();
		q.offer(n);
		while(!q.isEmpty()){
			Node a = q.poll();
			System.out.print(a.key);
			if(a.left!=null)
				q.offer(a.left);
			if(a.right!=null)
				q.offer(a.right);	
		}
	}
	static void  BfsOnTreeLinebyLine(Node n){
		Stack<Node> S = new Stack();
		Queue<Node> q =new LinkedList<>();
		q.offer(n);
		
		while(true){
			int nodeCount = q.size();
			if(nodeCount==0)
				break;
			while(nodeCount>0){
				Node a = q.poll();
				//S.push(a);
				 System.out.print(a.key + " ");
				if(a.left!=null)
					q.offer(a.left);
				if(a.right!=null)
					q.offer(a.right);
				nodeCount--;
			}
			System.out.println();
		}

	
	}
	static void  ReverseBfsOnTreeLinebyLine(Node node){

		   Stack<Node> S = new Stack();
	        Queue<Node> Q = new LinkedList();
	        Q.offer(node);
	        while (!Q.isEmpty()) 
	        {
	            node = Q.poll();
	            S.push(node);
	  
	            if (node.right != null)
	                Q.add(node.right); 
	                 
	            if (node.left != null)
	                Q.add(node.left);
	        }
	  
	        while (S.empty() == false) 
	        {
	            node = S.peek();
	            System.out.print(node.key + " ");
	            S.pop();
	        }
	
	}
}
