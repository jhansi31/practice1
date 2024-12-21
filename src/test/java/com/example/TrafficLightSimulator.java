package com.example;

     import java.util.Scanner;

    public class TrafficLightSimulator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Display the traffic light options to the user
            System.out.println("Traffic Light Simulator");
            System.out.println("Enter the color of the traffic light (red, yellow, green):");
            String lightColor = scanner.nextLine().toLowerCase(); // Convert input to lowercase for consistency

            // Use a switch case to determine the action based on the input
            switch (lightColor) {
                case "red":
                    System.out.println("Red Light: Stop!");
                    break;
                case "yellow":
                    System.out.println("Yellow Light: Ready!");
                    break;
                case "green":
                    System.out.println("Green Light: Go!");
                    break;
                default:
                    System.out.println("Invalid input! Please enter red, yellow, or green.");
            }

            scanner.close(); // Close the scanner
        }
    }

