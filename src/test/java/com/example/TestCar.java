package com.example;

public class TestCar {public static void main(String[] args) {
    // Create a Car object
    Car car = new Car();

    // Set attributes using setter methods
    car.setCarId("C001");
    car.setCarName("Toyota Corolla");
    car.setRentalPricePerDay(50);

    // Display car details
    System.out.println("Car ID: " + car.getCarId());
    System.out.println("Car Name: " + car.getCarName());
    System.out.println("Rental Price Per Day: " + car.getRentalPricePerDay());

    // Calculate and display rental cost
    int days = 5; // Example number of days
    double totalCost = car.calculateRentalCost(days);
    System.out.println("Total Rental Cost for " + days + " days: " + totalCost);

    // Attempt invalid operations
    car.setRentalPricePerDay(-20);
    car.calculateRentalCost(-3);
}
}
