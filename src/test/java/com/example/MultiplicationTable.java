package com.example;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Using a for loop
        System.out.println("Multiplication Table of 5 using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }

        System.out.println(); // Add an empty line for better readability

        // Using a while loop
        System.out.println("Multiplication Table of 5 using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println("5 * " + i + " = " + (5 * i));
            i++;
        }
    }
}

