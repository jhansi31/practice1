package com.example;

class SwapNumbers {
    public static void main(String[] args) {
        // Initialize two numbers
        int a = 10;
        int b = 20;

        // Print initial values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap numbers without using a third variable
        a = a + b; // a now becomes 30
        b = a - b; // b becomes 10 (original value of a)
        a = a - b; // a becomes 20 (original value of b)

        // Print values after swapping
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}