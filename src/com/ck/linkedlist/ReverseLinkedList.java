package com.ck.linkedlist;

public class ReverseLinkedList {
	static Node Reverse(Node head) {
		//Base Condition
		if (head == null) {
			return null;
		}
		Node p = null;//previous
		Node q = null;//current
		Node r = head;//next
		while (r != null) {
			p = q;
			q = r;
			r = r.next;
			q.next = p;//q is behind p. Actual reverse logic.
		}
		return q;
	}
	public static void main(String[] args) {
		Node head = new Node(28);
		Node node27 = new Node(27);
		Node node26 = new Node(26);
		Node node25 = new Node(25);
		head.next = node27;
		node27.next = node26;
		node26.next = node25;
		LinkedListTraversal.linkedListTraversal(head);
		Node reverseLinkedList = Reverse(head);
		LinkedListTraversal.linkedListTraversal(reverseLinkedList);
	}
}
