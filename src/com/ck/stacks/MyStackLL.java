package com.ck.stacks;

import com.ck.linkedlist.Node;

public class MyStackLL {

	Node top = null;// Initial Condition

	public void push(int x, Node top) {
		Node p = new Node(x);
		p.next = top;
		top = p;
	}

	public int pop(Node top) {
		//Logic for delete first
		if (!isEmpty()) {
			Node p = top;
			int x = p.data;
			p = p.next;
			return x;
		} else
			System.out.println("Stack UnderFlow!");
		return -1;// Assume all numbers in stack are positive.
	}

	private boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}
}
