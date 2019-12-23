package Trees;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestVerticalOrderBTree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		root.right.right.right = new Node(9);
		System.out.println("Vertical Order traversal is");
		printVerticalOrder(root);
        /*
         *         1
		        /    \ 
		       2      3
		      / \   /   \
		     4   5  6   7
		               /  \ 
		              8   9 
         */

	}

	static void printVerticalOrder(Node root) {
		// Create a map and store vertical oder in map using
		// function getVerticalOrder()
		TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
		int hd = 0;
		getVerticalOrder(root, hd, m);

		// Traverse the map and print nodes at every horigontal
		// distance (hd)
		for (Entry<Integer, ArrayList<Integer>> entry : m.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	static void getVerticalOrder(Node root, int hd,
			TreeMap<Integer, ArrayList<Integer>> m) {
		// Base case
		if (root == null)
			return;

		// get the vector list at 'hd'
		ArrayList<Integer> get = m.get(hd);

		// Store current node in map 'm'
		if (get == null) {
			get = new ArrayList<>();
			get.add(root.key);
		} else
			get.add(root.key);

		m.put(hd, get);

		// Store nodes in left subtree
		getVerticalOrder(root.left, hd - 1, m);

		// Store nodes in right subtree
		getVerticalOrder(root.right, hd + 1, m);
	}

}
