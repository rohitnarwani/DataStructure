package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryBottomView {
	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public ArrayList<Integer> bottomView(Node root) {
		ArrayList<Integer> ls = new ArrayList<>();
		Queue<Node> qn = new LinkedList<>();
		Queue<Integer> ql = new LinkedList<>();
		TreeMap<Integer, Integer> tr = new TreeMap<>();
		int distance = 0;
		qn.add(root);
		ql.add(distance);
		while (!qn.isEmpty()) {
			Node temp = qn.remove();
			distance = ql.remove();
			tr.put(distance, temp.data);
			if (temp.left != null) {
				qn.add(temp.left);
				ql.add(distance - 1);
			}
			if (temp.right != null) {
				qn.add(temp.right);
				ql.add(distance + 1);
			}
		}
		for (Map.Entry<Integer, Integer> map : tr.entrySet()) {
			ls.add(map.getValue());
		}
		return ls;
	}

	public static void main(String[] args) {

	}

}
