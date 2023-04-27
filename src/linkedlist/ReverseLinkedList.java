package linkedlist;

public class ReverseLinkedList {

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
		// node.next.next.next.next.next = new Node(6);
		node = reverseLinkedList(node);
		node = reverse(node);
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}

	}

	static Node reverseLinkedList(Node head) {

		Node temp = new Node(head.data);
		Node temp2 = null;
		while (head.next != null) {
			head = head.next;
			temp2 = new Node(head.data);
			temp2.next = temp;
			temp = temp2;

		}

		return temp;
	}
	
	static Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

}
