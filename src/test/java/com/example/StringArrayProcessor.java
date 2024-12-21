package com.example;

public class StringArrayProcessor {
    public static void main(String[] args) {
    // Example usage
    String[] strings = {"QAShastra", "Selenium", "Java", "Online", "Training"};
    processStringArray(strings, "Selenium");
}

    // Method to process the string array
    public static void processStringArray(String[] array, String target) {
        // Calculate and print the length of each string
        System.out.println("Lengths of strings in the array:");
        for (String str : array) {
            System.out.println(str + ": " + str.length());
        }

        // Check if the target string exists in the array
        boolean found = false;
        for (String str : array) {
            if (str.equals(target)) {
                found = true;
                break;
            }
        }

        // Print whether the target string is found
        if (found) {
            System.out.println("\nThe string \"" + target + "\" exists in the array.");
        } else {
            System.out.println("\nThe string \"" + target + "\" does not exist in the array.");
        }
    }
}
