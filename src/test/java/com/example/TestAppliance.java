package com.example;

public class TestAppliance {
    public static void main(String[] args) {
        // Create an Appliance object
        Appliance appliance = new Appliance("Generic Brand", 1500);
        System.out.println("Appliance Details:");
        appliance.showDetails();
        System.out.println();

        // Create a WashingMachine object
        WashingMachine washingMachine = new WashingMachine("Samsung", 2000, 7.5);
        System.out.println("Washing Machine Details:");
        washingMachine.showDetails();
        System.out.println();

        // Create a Refrigerator object
        Refrigerator refrigerator = new Refrigerator("LG", 1200, 350.0);
        System.out.println("Refrigerator Details:");
        refrigerator.showDetails();
    }
}
