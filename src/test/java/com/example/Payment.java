package com.example;

public class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void makePayment() {
        System.out.println("Payment of " + amount + " made.");
    }
}


