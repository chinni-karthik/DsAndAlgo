package com.ck.linkedlist;

public class MiddleOfLinkedList {
	private int getMiddleElementOfLinkedList(Node head) {
		if (head == null)//Base condition
			return 0;
		Node p = head;// slow pointer
		Node q = head;// fast pointer
		while (q.next.next != null) {
			p = p.next;
			q = q.next.next;
		}
		return p.data;
	}
}
