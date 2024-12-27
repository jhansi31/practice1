package com.example;
public class Cat extends Animal {
    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Override speak method
    @Override
    public void speak() {
        System.out.println("The cat meows.");
    }
}
