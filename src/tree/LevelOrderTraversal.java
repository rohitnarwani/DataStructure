package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LevelOrderTraversal {
	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	static ArrayList<Integer> findSpiral(Node root) {
		ArrayList<Integer> ls = new ArrayList<>();
		ArrayDeque<Node> arr = new ArrayDeque<>();
		arr.add(root);
		boolean flag = true;
		while (!arr.isEmpty()) {
			int nodeCount = arr.size();
			if (flag) {

				while (nodeCount > 0) {
					Node node = arr.pollFirst();
					ls.add(node.data);
					if (node.right != null) {
						arr.addLast(node.right);
					}
					if (node.left != null) {
						arr.addLast(node.left);
					}
					nodeCount--;
				}
			} else {
				while (nodeCount > 0) {
					Node node = arr.pollLast();
					ls.add(node.data);
					if (node.left != null) {
						arr.addFirst(node.left);
					}
					if (node.right != null) {
						arr.addFirst(node.right);
					}
					nodeCount--;
				}
			}
			flag = !flag;
		}
		return ls;
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(7);
		node.left.right = new Node(6);
		node.right.left = new Node(5);
		node.right.right = new Node(4);
		findSpiral(node).forEach(System.out::println);

	}

}
