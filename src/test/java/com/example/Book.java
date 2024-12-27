package com.example;

public class Book { private String bookId;
    private String title;
    private String author;
    private double price;

    // Getter for bookId
    public String getBookId() {
        return bookId;
    }

    // Setter for bookId with validation
    public void setBookId(String bookId) {
        if (bookId != null && bookId.matches("B\\d+")) {
            this.bookId = bookId;
        } else {
            System.out.println("Invalid book ID. It must start with 'B' followed by digits.");
        }
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
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
            System.out.println("Invalid price. It must be positive.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
