package com.cgi.threadsafepolymorphism;

public class ThreadsafePolymorphism {
	public static void main(String[] args) {
        Bankaccount savingaccount = new Savingaccount(1000.0, 0.05);
        Bankaccount checkingaccount = new Checkaccount(2000.0);

        // Compile-time polymorphism (method overloading)
        ThreadsafePolymorphism.performTransaction(savingaccount, 200.0);
        ThreadsafePolymorphism.performTransaction(checkingaccount, 500.0);

        // Runtime polymorphism (method overriding)
        savingaccount.applyInterest();
        checkingaccount.applyInterest();

        // Print final balances
        System.out.println("Savings Account Balance: " + savingaccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingaccount.getBalance());
    }

    public static void performTransaction(Bankaccount account, double amount) {
        account.deposit(amount);
    }
}
