package com.ck.threads;

public class ThreadPriorityDemo extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("ThreadPriorityDemo " + i);
		}
	}

	public static void main(String[] args) {
		Thread t = new ThreadPriorityDemo();
		t.setPriority(MAX_PRIORITY);
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("MainThread " + i);
		}
	}
}
