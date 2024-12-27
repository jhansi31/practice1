package com.example;


public class CheckingAccount extends BankAccount {
    // Additional attribute
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Getter for overdraftLimit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Setter for overdraftLimit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method

    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or exceeds overdraft limit.");
        }
    }
}

