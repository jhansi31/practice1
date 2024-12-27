package com.example;

public class TestVehicle{
 public static void main(String[] args) {
    // Create a generic Vehicle object
    Vehicle vehicle = new Vehicle("GenericBrand", "GenericModel");
    vehicle.displayInfo();

    System.out.println(); // For spacing

    // Create a Car object
    Car1 car = new Car1("Toyota", "Corolla",4);
    car.displayInfo();

    System.out.println(); // For spacing

    // Create a Bike object
    Bike bike = new Bike("Harley-Davidson", "Sportster", "Cruiser");
    bike.displayInfo();
}
}
