package com.cgi.threadsafepolymorphism;

public abstract class Bankaccount {
	protected double balance;

    public synchronized void deposit(double amount) {
        balance += amount;
    }
    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public synchronized double getBalance() {
        return balance;
    }
    public abstract void applyInterest();
}
