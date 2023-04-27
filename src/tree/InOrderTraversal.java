package tree;

import java.util.ArrayList;

public class InOrderTraversal {
	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	private static ArrayList<Integer> inOrder(Node root) {
		ArrayList<Integer> ls = new ArrayList<>();
		inOrder(root, ls);
		return ls;
	}

	private static void inOrder(Node node, ArrayList<Integer> ls) {
		if (node == null) {
			return;
		}
		inOrder(node.left, ls);
		ls.add(node.data);
		inOrder(node.right, ls);
	}

	public static void main(String[] args) {
		Node node = new Node(5);
		node.left = new Node(2);
		node.left.right = new Node(3);
		node.right = new Node(7);
		node.right.right = new Node(8);
		System.out.println(inOrder(node).toString());
	}
}
