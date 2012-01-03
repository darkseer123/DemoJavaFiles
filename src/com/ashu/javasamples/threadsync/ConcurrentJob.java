package com.ashu.javasamples.threadsync;

class ConcurrentJob implements Runnable {

	private BankAccount account;

	ConcurrentJob() {
		account = new BankAccount();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			makeWithdrawl(100);
			if (account.getBalance() < 0) {
				System.out.println("Overdrawn!!");
			}
		}
	}

	private synchronized void makeWithdrawl(int _amount) {
		if (account.getBalance() >= _amount) {
			System.out.println(Thread.currentThread().getName()
					+ " is about to withdraw");

			try {
				System.out.println(Thread.currentThread().getName()
						+ " is going to sleep");
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " woke up");
			account.withdraw(_amount);
			System.out.println(Thread.currentThread().getName()
					+ " completes the withdrawl");
		} else {
			System.out.println("Sorry, not enough for "
					+ Thread.currentThread().getName());
		}
	}
}
