package com.example;

public class Student { private int rollNumber;
    private String name;
    private double[] marks;

    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for marks
    public double[] getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    // Method to calculate average marks
    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Method to find grade based on average
    public String findGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else {
            return "F";
        }
    }
}
