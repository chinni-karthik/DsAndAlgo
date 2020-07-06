package com.ck.linkedlist;

public class LinkedListTraversal {
	public static void linkedListTraversal(Node head) {
		if (head == null) // Base condition
			return;
		Node p = head; // Never do any direct operation on head
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.next;
		}
		System.out.println();
	}
	public static void linkedListTraversalNew(SinglyLinkedListNode head) {
		if (head == null) // Base condition
			return;
		SinglyLinkedListNode p = head; // Never do any direct operation on head
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(28);
		Node node27 = new Node(27);
		Node node26 = new Node(26);
		Node node25 = new Node(25);
		head.next = node27;
		node27.next = node26;
		node26.next = node25;
//		node25.next = null;
		linkedListTraversal(head);
	}
}
