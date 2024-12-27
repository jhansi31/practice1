package com.example;

public class TestEmployee1 {public static void main(String[] args) {
    // Create an Employee object
    Employee1 employee = new Employee1("Alice", 50000);
    employee.displayDetails();

    System.out.println(); // For spacing

    // Create a Manager object
    Manager manager = new Manager("Bob", 75000, 15000);
    manager.displayDetails();
}
}
