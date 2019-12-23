package Trees;

import java.util.Stack;


//inorder Traversal
public class PrintPathWithGivenSum {
	int sum =0;
	Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		int k=7;
		PrintPathWithGivenSum f=new PrintPathWithGivenSum();
		/*
         * 					  1
         * 				2			3
         * 			4		5	6		7
         */
		f.rootToLeaf(d,k);
		System.out.println(f.hasPathSum(d, k));
	}
	private void rootToLeaf(Node p ,int k) {
		if(p==null)
			return;
		sum =sum+p.key;
		stack.push(p.key);
		if(sum==k)
			printStack(stack);
		rootToLeaf(p.left, k);
		rootToLeaf(p.right, k);
		sum=sum-p.key;
		stack.pop();		
		
	}
	static void printStack(Stack s){
		
		Stack<Integer> copied=(Stack<Integer>)s.clone();
		while(!copied.isEmpty())
			System.out.print(copied.pop());
		System.out.println();
	}
	
    public int hasPathSum(Node a, int b) {
        if (a == null)
			return 0;
		if (a.key == b && (a.left == null && a.right == null))
			return 1;
		else if (hasPathSum(a.left, b - a.key) == 1 || hasPathSum(a.right, b - a.key) == 1) {
			    return 1;
		        } 
		 else {
			return 0;
		      }
    }

}
