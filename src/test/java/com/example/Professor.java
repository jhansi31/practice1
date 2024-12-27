package com.example;

public class Professor extends Person {
    // Additional attribute
    private String department;

    // Constructor
    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Override showDetails method
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
    }
}