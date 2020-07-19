package com.ck.threads;

public class MyThreadJoinExample extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThreadJoinExample execution");
		}
//		try {
//			Thread.currentThread().join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyThreadJoinExample();
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread execution");
		}
	}
}
