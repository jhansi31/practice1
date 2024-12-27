package com.example;

public class Car {private String carId;
    private String carName;
    private double rentalPricePerDay;

    // Getter for carId
    public String getCarId() {
        return carId;
    }

    // Setter for carId
    public void setCarId(String carId) {
        this.carId = carId;
    }

    // Getter for carName
    public String getCarName() {
        return carName;
    }

    // Setter for carName
    public void setCarName(String carName) {
        this.carName = carName;
    }

    // Getter for rentalPricePerDay
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    // Setter for rentalPricePerDay with validation
    public void setRentalPricePerDay(double rentalPricePerDay) {
        if (rentalPricePerDay > 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        } else {
            System.out.println("Invalid rental price. It must be positive.");
        }
    }

    // Method to calculate rental cost
    public double calculateRentalCost(int days) {
        if (days > 0) {
            return rentalPricePerDay * days;
        } else {
            System.out.println("Invalid number of days. It must be positive.");
            return 0;
        }
    }
}
