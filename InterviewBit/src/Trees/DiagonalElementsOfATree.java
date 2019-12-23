package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Vector;

public class DiagonalElementsOfATree {

	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		
		
		Node root = new Node(8);
	        root.left = new Node(3);
	        root.right = new Node(10);
	        root.left.left = new Node(1);
	        root.left.right = new Node(6);
	        root.right.right = new Node(14);
	        root.right.right.left = new Node(13);
	        root.left.right.left = new Node(4);
	        root.left.right.right = new Node(7);
		
		/*
         * 					  1,0
         * 				2,1			3,0
         * 			4,2		5,1	6,1		7,0
         */
		diagonalElementsTree(d);
		HashMap<Integer,Vector<Integer>> diagonalPrint = new HashMap<>();
        diagonalPrintUtil(root, 0, diagonalPrint);
        System.out.println("Diagonal Traversal of Binnary Tree");
        for (Entry<Integer, Vector<Integer>> entry : diagonalPrint.entrySet())
        {
            System.out.println(entry.getValue());
        }
	}
	
	static void diagonalElementsTree(Node root){
		Queue<Node> q =new LinkedList<>();
		q.offer(root);
		q.offer(null);
		
		while(!q.isEmpty()){
			Node p=q.poll();
			if(p==null){
			q.offer(null);
			System.out.println();
			p=q.poll();
			if(p==null)
				break;
			}
			//int sum=0;
			while(p!=null){
				//sum=sum+p.key;
				System.out.print(p.key);
				if(p.left!=null)
					q.offer(p.left);
				p=p.right;
			}
			//System.out.println(sum);
		}
	}
	static void diagonalPrintUtil(Node root,int d,
            HashMap<Integer,Vector<Integer>> diagonalPrint){
         
         // Base case
        if (root == null)
            return;
         
        // get the list at the particular d value
        Vector<Integer> k = diagonalPrint.get(d);
         
        // k is null then create a vector and store the data
        if (k == null)
        {
            k = new Vector<>();
            k.add(root.key);
        }
         
        // k is not null then update the list
        else
        {
            k.add(root.key);
        }
         
        // Store all nodes of same line together as a vector
        diagonalPrint.put(d,k);
         
        // Increase the vertical distance if left child
        diagonalPrintUtil(root.left, d + 1, diagonalPrint);
          
        // Vertical distance remains same for right child
        diagonalPrintUtil(root.right, d, diagonalPrint);
    }

}


