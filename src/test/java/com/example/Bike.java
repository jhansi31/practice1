package com.example;
public class Bike extends Vehicle {
    // Additional attribute
    private String type;

    // Constructor
    public Bike(String brand, String model, String type) {
        super(brand, model);
        this.type = type;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike Type: " + type);
    }
}