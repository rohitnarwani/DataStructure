package linkedlist;

public class MiddleElement {
	static class Node {
		int data;
		Node next;

		Node(int item) {
			data = item;
			next = null;
		}
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		//node.next.next.next.next.next = new Node(6);
		System.out.println(getMiddle(node));

	}

	static int getMiddle(Node head) {
		Node temp1 = head;
		Node temp2 = head;
		while (temp1 != null && temp2.next != null) {
			temp1 = temp1.next;
			temp2 = temp2.next;
			if (temp2 != null && temp2.next != null) {
				temp2 = temp2.next;
			}
		}
		return temp1.data;
	}
}
