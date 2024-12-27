package com.example;

public class Rectangle {
    private double radius;
    private double length;
    private double breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for breadth
    public double getBreadth() {
        return breadth;
    }

    // Setter for breadth
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // Override calculateArea method

    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}


