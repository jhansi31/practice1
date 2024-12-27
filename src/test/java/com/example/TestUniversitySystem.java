package com.example;

public class TestUniversitySystem {public static void main(String[] args) {
    // Create a generic Person object
    Person person = new Person("John Doe", 40);
    person.showDetails();

    System.out.println(); // For spacing

    // Create a Student object
    Student1 student = new Student1("Alice", 20, "Computer Science");
    student.showDetails();

    System.out.println(); // For spacing

    // Create a Professor object
    Professor professor = new Professor("Dr. Smith", 55, "Mathematics");
    professor.showDetails();
}
}


