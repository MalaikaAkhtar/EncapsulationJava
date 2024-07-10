package com.example.encapsulationjava;

public class Product {
    // Private fields to store product details
    private String name;  // This is the name property of type String
    private double price; // This is the price property of type double

    // Constructor to initialize the Product object
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to set the name of the product
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the name of the product
    public String getName() {
        return name;
    }

    // Method to set the price of the product
    public void setPrice(double price) {
        // Check if the price is greater than 0
        if (price > 0) {
            this.price = price;
        } else {
            // Print an error message if the price is not greater than 0
            System.out.println("Price must be greater than 0");
        }
    }

    // Method to get the price of the product
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        // This is the main method for the Product class

        // Create an instance of the Product class
        Product product = new Product("", 2000.0);

        // Call the setName method with "Books" as the argument
        product.setName("Books");

        // Print the product's name
        System.out.println("Product's name: " + product.getName());

        // Call the setPrice method with 2000.0 as the argument
        product.setPrice(2000.0);

        // Print the product's price
        System.out.println("Product's price: " + product.getPrice());
    }
}
