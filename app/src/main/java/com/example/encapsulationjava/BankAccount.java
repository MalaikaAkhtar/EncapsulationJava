package com.example.encapsulationjava;

public class BankAccount {

    // Private property of balance
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) { // check if deposit amount is greater than zero
            balance += amount; // add amount to balance
        } else { // if amount is less than or equal to 0, show this message
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { // check if withdraw amount is greater than 0 and less than or equal to balance
            balance -= amount; // withdraw the amount
        } else { // otherwise show invalid withdrawal amount message
            System.out.println("Invalid withdrawal amount. The current balance is less than entered amount");
        }
    }

    // Current balance
    public double currentBalance() { // this is currentBalance method of type double and it will return current balance
        return balance;
    }

    public static void main(String[] args) {
        // Create a new BankAccount object with an initial balance of 1000.0
        BankAccount account = new BankAccount(1000.0);

        // Deposit 200.0 into the account
        account.deposit(200.0);
        // Print the current balance, should be 1200.0
        System.out.println("Current balance: " + account.currentBalance()); // Should print 1200.0

        // Withdraw 300.0 from the account
        account.withdraw(300.0);
        // Print the current balance, should be 900.0
        System.out.println("Current balance: " + account.currentBalance()); // Should print 900.0

        // Attempt to withdraw 1000.0 from the account, which is more than the current balance
        account.withdraw(1000.0); // This should trigger an invalid withdrawal amount message
    }

}

