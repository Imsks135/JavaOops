package com.cgi.threadsafepolymorphism;

public class Checkaccount extends Bankaccount {
	public Checkaccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public synchronized void applyInterest() {
        System.out.println("No interest applied to Checking Account.");
    }
}
