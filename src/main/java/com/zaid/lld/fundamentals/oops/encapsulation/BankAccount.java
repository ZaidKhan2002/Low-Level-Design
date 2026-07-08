package com.zaid.lld.fundamentals.oops.encapsulation;

/**
 * Demonstrates Encapsulation
 *
 * Encapsulation protects an object's state by hiding data
 * and exposing only controlled operations.
 */

public class BankAccount {
    // Private fields (cannot be accessed directly)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Deposit money after validation
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    // Withdraw money after validation
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawn ₹" + amount);
    }

    // Get Balance & Account Number (Read Only)
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
