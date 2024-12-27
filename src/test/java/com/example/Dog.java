package com.example;

public class Dog extends Animal {public Dog(String name, int age) {
    super(name, age);
}

    // Override speak method
    @Override
    public void speak() {
        System.out.println("The dog barks.");
    }
}
