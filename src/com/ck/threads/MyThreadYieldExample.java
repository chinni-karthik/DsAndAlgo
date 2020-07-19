package com.ck.threads;

public class MyThreadYieldExample extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println("MyThreadYeildExample execution");
		}
	}

	public static void main(String[] args) {
		Thread t = new MyThreadYieldExample();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread!");
		}
	}
}
