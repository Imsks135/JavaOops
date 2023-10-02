package com.cgi.threadsafepolymorphism;

public class Savingaccount extends Bankaccount {
	private double interestRate;
    public Savingaccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }
    @Override
    public synchronized void applyInterest() {
        balance += balance * interestRate;
    }
}
