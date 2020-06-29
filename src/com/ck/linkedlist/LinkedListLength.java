package com.ck.linkedlist;

public class LinkedListLength {
	public static int getLinkedListLength(Node head) {
		if (head == null) {
			return 0;
		}
		Node p = head;
		int count = 0;
		while (p != null) {
			count++;
			p = p.next;
		}
		return count;
	}
}
