package com.example;

public class TestPayment {
    public static void main(String[] args) {
        Payment payment = new Payment(100.0);
        payment.makePayment();

        CreditCardPayment creditCardPayment = new CreditCardPayment(200.0, "1234-5678-9876-5432");
        creditCardPayment.makePayment();

        CashPayment cashPayment = new CashPayment(50.0, 50.0);
        cashPayment.makePayment();
    }
}


