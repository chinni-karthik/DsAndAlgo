package com.ck.linkedlist;

public class IsCircularLinkedList {
	public static boolean isCircular(Node head) {
		if (head == null || head.next == null || head.next.next == null) {
			return false;
		}
		Node p = head;// slow pointer
		Node q = head;// fast pointer
		while (q != null && q.next != null) {
			p = p.next;
			q = q.next.next;
			if (p == q) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Node head = new Node(28);
		Node node28 = head;
		Node node27 = new Node(27);
		Node node26 = new Node(26);
		Node node25 = new Node(25);
		Node node24 = new Node(24);
		head.next = node27;
		node27.next = node26;
		node26.next = node25;
		node25.next = node24;
		node24.next = node28;
		boolean isCircular = isCircular(head);
		System.out.println(isCircular);
	}
}
