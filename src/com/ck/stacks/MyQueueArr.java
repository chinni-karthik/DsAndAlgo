package com.ck.stacks;

public class MyQueueArr {
	int rear, front = -1;// Initial condition
	int[] arr = new int[100];

	public void enQueue(int x) {
		if (!isFull()) {
			arr[++rear] = x;
		}
	}

	public int deQueue() {
		if (!isEmpty()) {
			return arr[++front];
		}
		return -1;// Assume numbers in stack are positive.
	}

	private boolean isEmpty() {
		if (front == rear)
			return true;
		else
			return false;
	}

	private boolean isFull() {
		if (rear == arr.length - 1)
			return true;
		else
			return false;
	}
}
