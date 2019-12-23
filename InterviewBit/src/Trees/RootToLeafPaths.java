package Trees;

import java.util.Stack;

public class RootToLeafPaths {

	static int sum =0;
	Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) {
		Node d= new Node(1);
		d.left= new Node(2);
		d.right= new Node(3);
		d.left.left= new Node (4);
		d.left.right= new Node(5);
		d.right.left= new Node(6);
		d.right.right= new Node(7);
		RootToLeafPaths f=new RootToLeafPaths();
		/*
         * 					  1
         * 				2			3
         * 			4		5	6		7
         */
		System.out.println(f.rootToLeaf(d));
	}

	int rootToLeaf(Node root){
		int su=0;
		if(root==null)
			return 0;
		stack.push(root.key);
		rootToLeaf(root.left);
		
		if(root.left==null && root.right==null){
			Stack<Integer> copied=(Stack<Integer>)stack.clone();
			while(!copied.isEmpty()){
				su+=copied.pop();	
			}
			sum=sum+su;
		}		
		rootToLeaf(root.right);
		stack.pop();
		if(stack.isEmpty())
			return sum;
		else
			return sum;
	}
	
	static int printStack(Stack s){
	int su=0;
		Stack<Integer> copied=(Stack<Integer>)s.clone();
		while(!copied.isEmpty()){
			su+=copied.pop();	
		}
		sum=sum+su;
		return sum;
	}
}
