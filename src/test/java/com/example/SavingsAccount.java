package com.example;


    public class SavingsAccount extends BankAccount1 {
        private double interestRate;

        // Constructor
        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public void calculateInterest() {
            double interest = getBalance() * (interestRate / 100);
            System.out.println("Calculated Interest: " + interest);
        }
    }