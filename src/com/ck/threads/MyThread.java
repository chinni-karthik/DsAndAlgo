package com.ck.threads;

public class MyThread extends Thread {
	public void run() {
		System.out.println("Current Thread = " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread : " + i);
		}
	}

//	public void start() {
//		System.out.println("Current Thread = " + Thread.currentThread().getName());
//		System.out.println("Inside start method!");
//	}

	public static void main(String[] args) {
		MyThread t = new MyThread();
//		t.start();
//		t.run();
		t.start();
		t.start();
	}
}
