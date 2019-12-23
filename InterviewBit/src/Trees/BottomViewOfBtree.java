package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BottomViewOfBtree {
	private static int max_level = 0;
	private static int max_level_right = 0;
	
	public static void main(String[] args) {
		BottomViewOfBtree object = new BottomViewOfBtree();
		System.out.println("\nBottom view");
		object.printBottomView(getBottomViewTree());

	}
	private static class Node2
	{
		private int data;
		private Node2 right, left;
		private int level;

		Node2(int data)
		{
			this.data = data;
		}
	}
	private static Node2 getBottomViewTree()
	{
		Node2 tree = new Node2(20);
		tree.left = new Node2(8);
		tree.right = new Node2(22);
		tree.left.left = new Node2(5);
		tree.left.right = new Node2(3);
		tree.right.left = new Node2(4);
		tree.right.right = new Node2(25);
		tree.left.right.left = new Node2(10);
		tree.left.right.right = new Node2(14);

		return tree;
	}
	private void printBottomView(Node2 root)
	{
		if (root == null)
			return;

		Queue<Node2> queue = new LinkedList<>();
		Map<Integer, Integer> map = new HashMap<>();
		root.level = 0;
		queue.add(root);

		int min = 0;
		int max = 0;

		while (!queue.isEmpty())
		{
			Node2 ptr = queue.poll();
			int ptrLevel = ptr.level;
			addIfNotNull(queue, ptr.left, ptrLevel - 1);
			addIfNotNull(queue, ptr.right, ptrLevel + 1);

			//replace the last node for bottom most

			map.put(ptrLevel, ptr.data);
			min = min > ptrLevel ? ptrLevel : min;
			max = max < ptrLevel ? ptrLevel : max;
		}

		for (int i = min; i <= max; i++)
		{
			System.out.print(map.get(i) + " ");
		}
	}

	private void addIfNotNull(final Queue<Node2> queue, final Node2 node, final int level)
	{
		if (node != null)
		{
			node.level = level;
			queue.add(node);
		}
	}
}
