package com.ck.linkedlist;

public class MiddleOfLinkedList {
	private static Node getMiddleElementOfLinkedList(Node head) {
		if (head == null)// Base condition
			return null;
		Node p = head;// slow pointer
		Node q = head;// fast pointer
		while (q != null && q.next != null) {
			p = p.next;
			q = q.next.next;
		}
		return p;
	}

	public static void main(String[] args) {
		Node head = new Node(28);
		Node node27 = new Node(27);
		Node node26 = new Node(26);
		Node node25 = new Node(25);
		Node node24 = new Node(24);
		head.next = node27;
		node27.next = node26;
		node26.next = node25;
		node25.next = node24;
		Node middleNode = getMiddleElementOfLinkedList(head);
		System.out.println(middleNode.data);
	}
}
