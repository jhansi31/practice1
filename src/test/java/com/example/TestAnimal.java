package com.example;

public class TestAnimal {
    public static void main(String[] args) {
    // Create an Animal object
    Animal genericAnimal = new Animal("Generic", 5);
    genericAnimal.speak();

    // Create a Dog object
    Dog dog = new Dog("Buddy", 3);
    dog.speak();

    // Create a Cat object
    Cat cat = new Cat("Whiskers", 2);
    cat.speak();
}
}
