package com.ashu.javasamples;

public class ThreadTest {

	public static void main(String[] args) {
		
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);

		myThread.start();

		System.out.println("Back to main");
	}

}

class MyRunnable implements Runnable {

	public void run() {
		go();
	}

	public void go() {
		doMore();
	}

	public void doMore() {
		System.out.println("Top of the stack");
	}
}
