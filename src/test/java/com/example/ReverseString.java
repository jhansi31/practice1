package com.example;

public class ReverseString {

    public static void main(String[] args) {
        String original = "QAShastra Online Training";
        String reversed = ""; // Initialize an empty string to hold the reversed result

        // Iterate through the string from the last character to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // Append each character to the reversed string
        }

        // Print the reversed string
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}


