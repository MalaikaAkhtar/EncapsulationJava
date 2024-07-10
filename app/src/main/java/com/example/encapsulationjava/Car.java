package com.example.encapsulationjava;

public class Car {
    // Private fields to store car details
    private String make;  // This is the make property of type String
    private String model; // This is the model property of type String
    private int mileage;  // This is the mileage property of type int

    // Constructor to initialize the Car object
    public Car(String make, String model, int mileage) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    // Method to set the make of the car
    public void setMake(String make) {
        this.make = make;
    }

    // Method to get the make of the car
    public String getMake() {
        return make;
    }

    // Method to set the model of the car
    public void setModel(String model) {
        this.model = model;
    }

    // Method to get the model of the car
    public String getModel() {
        return model;
    }

    // Method to set the mileage of the car
    public void setMileage(int mileage) {
        // Check if the mileage is greater than 0
        if (mileage > 0) {
            this.mileage = mileage;
        } else {
            // Print an error message if the mileage is not greater than 0
            System.out.println("Mileage must be greater than 0");
        }
    }

    // Method to get the mileage of the car
    public int getMileage() {
        return mileage;
    }

    public static void main(String[] args) {
        // Create an instance of the Car class
        Car car = new Car(" ", " ", 100);

        // Call the setMake method with "Suzuki" as the argument
        car.setMake("Suzuki");

        // Print the car's make
        System.out.println("Car's make: " + car.getMake());

        // Call the setModel method with "2023" as the argument
        car.setModel("2023");

        // Print the car's model
        System.out.println("Car's model: " + car.getModel());

        // Call the setMileage method with 100 as the argument
        car.setMileage(100);

        // Print the car's mileage
        System.out.println("Car's mileage: " + car.getMileage());
    }



}

