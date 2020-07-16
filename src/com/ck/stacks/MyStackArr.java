package com.ck.stacks;

public class MyStackArr {
	static int top = -1;// Initial Condition
	static int[] arr = new int[5];// Max size of 5

	public static void push(int x) {
		if (!isFull())
			arr[++top] = x;
		else
			System.out.println("Stack OverFlow!");
	}

	public static int pop() {
		if (!isEmpty())
			return arr[top--];
		else
			System.out.println("Stack UnderFlow!");
		
		return -1;// Assume all numbers in stack are positive.
	}

	public static boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public static boolean isFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		printStack();
		System.out.println("Testing pop()");
		System.out.println("Popped out value from stack : "+pop());
		System.out.println("Popped out value from stack : "+pop());
		System.out.println("Popped out value from stack : "+pop());
	}
	
	private static void printStack() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
