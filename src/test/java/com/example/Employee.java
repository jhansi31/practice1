package com.example;

public class Employee {
    private int id;
    private String name;
    private double salary;

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id with constraint
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID. ID must be positive.");
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary with constraint
    public void setSalary(double salary) {
        if (salary > 3000) {
            this.salary = salary;
        } else {
            this.salary = 3000;
            System.out.println("Invalid salary. Setting to default value of 3000.");
        }
    }
}

// TestEmployee.java


