package tree;

public class BinaryTreeHeight {
	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	static int height(Node node) {
		if (node == null) {
			return -1;
		}
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		if (leftHeight > rightHeight) {
			return leftHeight + 1;

		} else {
			return rightHeight + 1;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(10);
		root.left.left = new Node(39);
		root.left.left.left = new Node(5);
		System.out.println(height(root));
	}
}
