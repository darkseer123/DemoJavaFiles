package com.ashu.javasamples.threadsync;

public class ThreadSyncDemo {

	public static void main(String[] args) {

		ConcurrentJob job = new ConcurrentJob();
		Thread one = new Thread(job);
		Thread two = new Thread(job);

		one.setName("ashu");
		two.setName("naina");

		one.start();
		two.start();
	}
}
