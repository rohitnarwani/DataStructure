package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LeftViewBinaryTree {

	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	static ArrayList<Integer> leftView(Node root) {
		ArrayList<Integer> ls = new ArrayList<>();

		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(root);
		Node curr;
		while (!queue.isEmpty()) {
			int size = queue.size();
			int i = 0;
			while (i++ < size) {
				curr = queue.poll();
				if (i == 1) {
					ls.add(curr.data);
				}
				if (curr.left != null) {
					queue.add(curr.left);
				}
				if (curr.right != null) {
					queue.add(curr.right);
				}
			}
		}
		return ls;
	}

	int max_level = 0;

	// Function to get the left view of the binary tree.
	void leftViewUtil(ArrayList<Integer> result, Node node, int level) {
		// if root is null, we simply return.
		if (node == null)
			return;

		// if this is the first node of its level then it is in the left view.
		if (max_level < level) {
			// storing data of current node in list.
			result.add(node.data);
			max_level = level;
		}

		// calling function recursively for left and right
		// subtrees of current node.
		leftViewUtil(result, node.left, level + 1);
		leftViewUtil(result, node.right, level + 1);
	}

	// Function to return list containing elements of left view of binary tree.
	ArrayList<Integer> leftViewRec(Node root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		leftViewUtil(result, root, 1);
		// returning the list.
		return result;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);
		leftView(root).forEach(System.out::println);
	}
}
