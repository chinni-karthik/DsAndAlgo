package com.ck.stacks;

public class MyQueueUsingTwoStacks {
	static MyStackArr insertStack;
	static MyStackArr deleteStack ;
	static void enQueue(int x) {
		insertStack.push(x);
	}
	static int deQueue() {
		if(!deleteStack.isEmpty()) {
			return deleteStack.pop();
		}
		while(!insertStack.isEmpty()) {
			deleteStack.push(insertStack.pop());
		}
		return deleteStack.pop();
	}
}
