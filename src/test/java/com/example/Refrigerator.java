package com.example;

public class Refrigerator extends Appliance {
    private double volume; // Volume in liters

    // Constructor
    public Refrigerator(String brand, int power, double volume) {
        super(brand, power);
        this.volume = volume;
    }

    // Getter for volume
    public double getVolume() {
        return volume;
    }

    // Setter for volume
    public void setVolume(double volume) {
        this.volume = volume;
    }

    // Override showDetails method
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Volume: " + volume + " liters");
    }
}
