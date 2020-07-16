package com.ck.stacks;

public class MyStackUsingOneQueue {
	static MyQueueArr originalQueue;
	void push(int x) {
		originalQueue.enQueue(x);
	}
	int pop() {
		int size = originalQueue.getLenght();
		while(size>1) {
			originalQueue.enQueue(originalQueue.deQueue());
			size--;
		}
		return originalQueue.deQueue();
	}
}
