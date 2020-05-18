package com.ck.linkedlist;

public class SortedDLLInsert {
	Node SortedInsert(Node head, int data) {
		Node p = new Node();
		p.data = data;

		Node q = head;
		Node previousNode = null;

		if (head == null) {// null list
			return p;
		}
		while (q != null && q.data < data) {
			q = q.next;
			previousNode = q.prev;
		}

		if (previousNode == null) {// First element
			q.next = p;
			p.prev = q;
			return q;
		} else if (q == null) {// Last element
			previousNode.next = p;
			p.prev = previousNode;
		} else {
			previousNode.next = p;
			p.prev = previousNode;
			p.next = q;
			q.prev = p;
		}
		return head;
	}
}
