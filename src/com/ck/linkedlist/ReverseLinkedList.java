package com.ck.linkedlist;

public class ReverseLinkedList {
	Node Reverse(Node head) {
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
			q.next = p;
		}
		return q;
	}
}
