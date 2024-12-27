package com.example;

public class TestStudent { public static void main(String[] args) {
    // Create a Student object
    Student student = new Student();

    // Set attributes using setter methods
    student.setRollNumber(101);
    student.setName("Alice");
    student.setMarks(new double[]{85, 92, 78, 88});

    // Display student details
    System.out.println("Roll Number: " + student.getRollNumber());
    System.out.println("Name: " + student.getName());

    // Calculate and display average marks
    double average = student.calculateAverage();
    System.out.println("Average Marks: " + average);

    // Determine and display grade
    String grade = student.findGrade();
    System.out.println("Grade: " + grade);
}
}
