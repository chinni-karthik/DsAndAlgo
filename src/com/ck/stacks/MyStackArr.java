package com.ck.stacks;

public class MyStackArr {
	int top = -1;// Initial Condition
	int[] arr = new int[100];// Max size of 100

	public void push(int x) {
		if (!isFull())
			arr[++top] = x;
		else
			System.out.println("Stack OverFlow!");
	}

	public int pop() {
		if (!isEmpty())
			return arr[top--];
		else
			System.out.println("Stack UnderFlow!");
		
		return -1;// Assume all numbers in stack are positive.
	}

	private boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	private boolean isFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;
	}
}
