package com.example;

public class Product { private String productName;
    private double price;
    private int quantity;

    // Getter for productId
    public int getProductId() {
        return productId;
    }

    // Setter for productId
    public void setProductId(int productId) {
        this.productId = productId;
    }
    private int productId;

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. It must be greater than 0.");
        }
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity with validation
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity. It cannot be negative.");
        }
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return price * quantity;
    }
}
