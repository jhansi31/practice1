package com.example;

public class TestEmployee { public static void main(String[] args) {
    // Create an Employee object
    Employee employee = new Employee();

    // Set values using setter methods
    employee.setId(101);
    employee.setName("John Doe");
    employee.setSalary(2500);

    // Display values using getter methods
    System.out.println("Employee ID: " + employee.getId());
    System.out.println("Employee Name: " + employee.getName());
    System.out.println("Employee Salary: " + employee.getSalary());
}
}
