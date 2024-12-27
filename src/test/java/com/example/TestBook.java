package com.example;

public class TestBook {public static void main(String[] args) {
    // Create a Book object
    Book book = new Book();

    // Set attributes using setter methods
    book.setBookId("B123");
    book.setTitle("Java Programming");
    book.setAuthor("John Doe");
    book.setPrice(450.75);

    // Display book details
    book.displayBookDetails();

    // Attempt invalid operations
    book.setBookId("123B");
    book.setPrice(-100);
}
}
