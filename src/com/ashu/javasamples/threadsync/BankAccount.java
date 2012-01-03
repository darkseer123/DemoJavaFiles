package com.ashu.javasamples.threadsync;

public class BankAccount {

	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int _amount) {
		balance -= _amount;
	}
}
