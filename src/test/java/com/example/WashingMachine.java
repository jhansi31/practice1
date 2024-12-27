package com.example;
public class WashingMachine extends Appliance {
    private double capacity; // Capacity in kg

    // Constructor
    public WashingMachine(String brand, int power, double capacity) {
        super(brand, power);
        this.capacity = capacity;
    }

    // Getter for capacity
    public double getCapacity() {
        return capacity;
    }

    // Setter for capacity
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    // Override showDetails method
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Capacity: " + capacity + " kg");
    }
}
