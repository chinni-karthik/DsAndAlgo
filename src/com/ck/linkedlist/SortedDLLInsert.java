package com.ck.linkedlist;

public class SortedDLLInsert {
	DLLNode SortedInsert(DLLNode head, int data) {
		DLLNode p = new DLLNode();
		p.data = data;

		DLLNode q = head;
		DLLNode previousDLLNode = null;

		if (head == null) {// null list
			return p;
		}
		while (q != null && q.data < data) {
			q = q.next;
			previousDLLNode = q.prev;
		}

		if (previousDLLNode == null) {// First element
			q.next = p;
			p.prev = q;
			return q;
		} else if (q == null) {// Last element
			previousDLLNode.next = p;
			p.prev = previousDLLNode;
		} else {
			previousDLLNode.next = p;
			p.prev = previousDLLNode;
			p.next = q;
			q.prev = p;
		}
		return head;
	}
}
