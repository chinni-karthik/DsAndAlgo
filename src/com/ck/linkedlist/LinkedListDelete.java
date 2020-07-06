package com.ck.linkedlist;

public class LinkedListDelete {
	static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		SinglyLinkedListNode p = head.next;// curr
		SinglyLinkedListNode q = head;// next
		if (position == 0) {
			return p;
		}
		int count = 1;
		while (p.next != null && count < position) {
			p = q.next.next;
			q = q.next;
			count++;
		}
		q.next = p.next;
		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedListNode head = new SinglyLinkedListNode(16);
		SinglyLinkedListNode node13 = new SinglyLinkedListNode(13);
		SinglyLinkedListNode node7 = new SinglyLinkedListNode(7);
		head.next = node13;
		node13.next = node7;
		deleteNode(head, 2);
		LinkedListTraversal.linkedListTraversalNew(head);
	}
}
