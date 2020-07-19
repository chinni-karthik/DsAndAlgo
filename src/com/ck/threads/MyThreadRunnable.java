package com.ck.threads;

public class MyThreadRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThreadRunnable " + i);
		}
	}

	public static void main(String[] args) {
		Runnable r = new MyThreadRunnable();
		Thread t = new Thread(r);
		t.start();
		System.out.println("Thread name : "+t.getName());
		t.setName("Mercy Thread");
		System.out.println("Thread name : "+t.getName());
		t.start();
	}
}
