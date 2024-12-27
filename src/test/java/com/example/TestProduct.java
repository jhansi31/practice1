package com.example;

public class TestProduct {public static void main(String[] args) {
    // Create a Product object
    Product product = new Product();

    // Set attributes using setter methods
    product.setProductId(1);
    product.setProductName("Laptop");
    product.setPrice(750.50);
    product.setQuantity(5);

    // Display product details using getter methods
    System.out.println("Product ID: " + product.getProductId());
    System.out.println("Product Name: " + product.getProductName());
    System.out.println("Price: " + product.getPrice());
    System.out.println("Quantity: " + product.getQuantity());

    // Calculate and display the total cost
    System.out.println("Total Cost: " + product.calculateTotalCost());

    // Attempt invalid operations
    product.setPrice(-50);
    product.setQuantity(-10);
}
}
