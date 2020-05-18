package com.ck.linkedlist;

public class MiddleOfLinkedList {
	private int getMiddleElementOfLinkedList(Node head) {
		if (head != null)
			return 0;
		Node p = head;// slow pointer
		Node q = head;// fast pointer
		while (q != null) {
			p = p.next;
			q = q.next.next;
		}
		return p.data;
	}
}
