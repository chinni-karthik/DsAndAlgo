package com.ck.stacks;

import com.ck.linkedlist.Node;

public class MyQueueLL {

	Node front, rear = null;

	public void push(int x) {
		Node p = new Node(x);
		rear.next = p;
	}

	public int pop() {
		if (!isEmpty()) {
			int x = front.data;
			front = front.next;
			return x;
		}
		return -1;// Assume numbers in stack are positive.
	}

	private boolean isEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}
}
