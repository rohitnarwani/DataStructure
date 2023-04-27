package tree;

import tree.LeftViewBinaryTree.Node;

public class CountLeavesBinaryTree {
	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(39);
		root.right.left = new Node(5);
		System.out.println(countLeaves(root));

	}

	static int countLeaves(Node node) {
		int count = 0;
		if (node == null) {
			return count;
		}
		if (node.left == null && node.right == null) {
			count++;
		}
		count = count + countLeaves(node.left);
		count = count + countLeaves(node.right);
		return count;
	}

}
