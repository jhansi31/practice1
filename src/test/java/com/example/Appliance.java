package com.example;

public class Appliance {
    private String brand;
    private int power; // Power in watts

    // Constructor
    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for power
    public int getPower() {
        return power;
    }

    // Setter for power
    public void setPower(int power) {
        this.power = power;
    }

    // Method to show details
    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + " watts");
    }
}


