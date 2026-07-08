package com.zaid.lld.fundamentals.oops.encapsulation;

public class Main {
    public static void main(String[] args){
        System.out.println("========== Bank Account ==========");

        BankAccount account = new BankAccount("ACC101");

        account.deposit(5000);
        account.withdraw(1200);

        // ❌ Not Allowed
        // account.balance = 100000;

        System.out.println("Available Balance : ₹" + account.getBalance());

        System.out.println();
    }
}
