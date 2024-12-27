package com.example;
    public class TestShape {
        public static void main(String[] args) {
            // Create a generic Shape object
            Shape genericShape = new Shape();
            genericShape.calculateArea();

            System.out.println(); // For spacing

            // Create a Circle object
            Circle circle = new Circle(5);
            circle.calculateArea();

            System.out.println(); // For spacing

            // Create a Rectangle object
            Rectangle rectangle = new Rectangle(4, 6);
            rectangle.calculateArea();
        }
}
