package com.ck.linkedlist;

public class LinkedListTraversal {
	private void LLTraversal(Node head) {
		if (head == null) // Base condition
			return;
		Node p = head; // Never do any direct operation on head
		while (p != null) {
			System.out.println(p.data);
			p = p.next;
		}
	}
}
