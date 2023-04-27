package tree;

public class CheckBST {
	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	boolean isBST(Node root) {
		Node curr;
		boolean bst = true;
		if (root == null) {
			return bst;
		}
		while (root != null) {
			if (root.left != null && root.left.data > root.data) {
				bst = false;
				break;
			}
			if (root.right != null && root.right.data < root.data) {
				bst = false;
				break;
			}
		}
		return false;
	}

	public static void main(String[] args) {

	}
}
