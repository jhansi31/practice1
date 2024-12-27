package com.example;

public class TestBankAccount1 {public static void main(String[] args) {
    // Create a SavingsAccount object
    SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000, 3.5);
    System.out.println("Savings Account:");
    savingsAccount.deposit(1000);
    savingsAccount.withdraw(2000);
    savingsAccount.calculateInterest();

    System.out.println(); // For spacing

    // Create a CheckingAccount object
    CheckingAccount checkingAccount = new CheckingAccount("CA54321", 2000, 1000);
    System.out.println("Checking Account:");
    checkingAccount.deposit(500);
    checkingAccount.withdraw(2500);
    checkingAccount.withdraw(3000); // Should fail due to overdraft limit
}
}
