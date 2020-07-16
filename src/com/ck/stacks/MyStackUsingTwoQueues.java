package com.ck.stacks;

public class MyStackUsingTwoQueues {
	static MyQueueArr myQueueInsert;
	static MyQueueArr myQueueDelete;

	void push(int x) {
		myQueueInsert.enQueue(x);
	}

	void pop() {
		while (myQueueInsert.getLenght() > 1) {
			myQueueDelete.enQueue(myQueueInsert.deQueue());
		}
		MyQueueArr temp = myQueueInsert;
		myQueueInsert = myQueueDelete;
		myQueueDelete = temp;
		myQueueDelete.deQueue();
	}
}
