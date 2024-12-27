package com.example;

class CashPayment extends Payment {
    double cashGiven;

    public CashPayment(double amount, double cashGiven) {
        super(amount);
        this.cashGiven = cashGiven;
    }

    @Override
    public void makePayment() {
        System.out.println("Payment of " + amount + " made with cash given: " + cashGiven);
    }
}


