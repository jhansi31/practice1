package com.example;

public class Manager extends Employee1
{
    // Additional attribute
    private double bonus;

    // Constructor
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    // Getter for bonus
    public double getBonus() {
        return bonus;
    }

    // Setter for bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
    }}
