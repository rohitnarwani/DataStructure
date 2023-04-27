package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VerticalTraversalBinaryTree {
	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	static void verticalOrder(Node root, int hd, TreeMap<Integer, List<Integer>> map) {
		if (root == null) {
			return;
		}
		List<Integer> ls = map.get(hd);
		if (ls == null) {
			ls = new ArrayList<>();
		}
		ls.add(root.data);
		map.put(hd, ls);
		verticalOrder(root.left, hd - 1, map);
		verticalOrder(root.right, hd + 1, map);
	}

	static ArrayList<Integer> verticalOrder(Node root) {
		TreeMap<Integer, List<Integer>> map = new TreeMap<>();
		ArrayList<Integer> ls = new ArrayList<>();
		verticalOrder(root, 0, map);

		map.values().forEach(val -> ls.addAll(val));

		return ls;
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.left.left = new Node(4);
		node.left.right = new Node(5);

		node.right = new Node(3);
		node.right.right = new Node(6);
		System.out.println(verticalOrder(node).toString());

	}

}
