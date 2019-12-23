package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopViewOfBTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopViewOfBTree object = new TopViewOfBTree();
		System.out.println("Top view");
		object.printTopView(getTopViewTree());
	}
	private static class Node1
	{
		private int data;
		private Node1 right, left;
		private int level;

		Node1(int data)
		{
			this.data = data;
		}
	}
	private static Node1 getTopViewTree()
	{
		Node1 tree = new Node1(1);
		tree.left = new Node1(2);
		tree.right = new Node1(3);

		tree.left.right = new Node1(4);
		tree.left.right.right = new Node1(5);
		tree.left.right.right.right = new Node1(6);

		return tree;
	}
	private  void printTopView(Node1 root) {
	      if (root == null)
				return;

			Queue<Node1> queue = new LinkedList<>();
			Map<Integer, Queue<Node1>> map = new HashMap<>();
			root.level = 0;
			queue.add(root);

			int min = 0;
			int max = 0;

			while (!queue.isEmpty())
			{
				Node1 ptr = queue.poll();
				int ptrLevel = ptr.level;
				addIfNotNull(queue, ptr.left, ptrLevel - 1);
				addIfNotNull(queue, ptr.right, ptrLevel + 1);

				if (map.get(ptrLevel) != null)
				{
					map.get(ptrLevel).add(ptr);
				}
				else
				{
					Queue<Node1> list = new LinkedList<>();
					list.add(ptr);
					map.put(ptrLevel, list);
				}
				min = min > ptrLevel ? ptrLevel : min;
				max = max < ptrLevel ? ptrLevel : max;
			}

			for (int i = min; i <= max; i++)
			{
				if (!map.get(i).isEmpty())
					System.out.print(map.get(i).poll().data + " ");
			}
	      
	    }

	private void addIfNotNull(final Queue<Node1> queue, final Node1 node, final int level)
		{
			if (node != null)
			{
				node.level = level;
				queue.add(node);
			}
		}
}
