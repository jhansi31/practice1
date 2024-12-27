package com.example;

class CreditCardPayment extends Payment {
    String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment() {
        System.out.println("Payment of " + amount + " made using card number " + cardNumber);
    }
}


