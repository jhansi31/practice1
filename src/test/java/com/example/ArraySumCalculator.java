package com.example;

public class ArraySumCalculator {public static void main(String[] args) {
    // Example usage
    int[] numbers = {10, 20, 30, 40, 50};
    int result = calculateSum(numbers);
    System.out.println("The sum of the array elements is: " + result);
}

    // Method to calculate the sum of all integers in the array
    public static int calculateSum(int[] array) {
        int sum = 0; // Initialize sum to 0

        // Loop through the array to calculate the sum
        for (int num : array) {
            sum += num; // Add each element to the sum
        }

        return sum; // Return the final sum
    }
}


