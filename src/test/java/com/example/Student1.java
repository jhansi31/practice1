package com.example;

public class Student1 extends Person {
    // Additional attribute
    private String course;

    // Constructor
    public Student1(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // Getter for course
    public String getCourse() {
        return course;
    }

    // Setter for course
    public void setCourse(String course) {
        this.course = course;
    }

    // Override showDetails method

    public void showDetails() {
        super.showDetails();
        System.out.println("Course: " + course);
    }
}
