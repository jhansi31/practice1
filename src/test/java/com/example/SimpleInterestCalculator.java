package com.example;



public class SimpleInterestCalculator {
    public static void main(String[] args) {


        double principal = 1000;
        double rate = 5.0;
        double time = 2.0;

        double simpleInterest = principal * rate * time / 100;
        System.out.println("Principal : " + principal);
        System.out.println("Rate : " + rate +"%");
        System.out.println("Time : " + time + "years");
        System.out.println("SimpleInterest : " + simpleInterest);

    }
}


