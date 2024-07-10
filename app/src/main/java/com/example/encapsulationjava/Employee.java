package com.example.encapsulationjava;

public class Employee {
    private String name;  // private property of name
    private String position; // private property of position
    private double salary; //private property of salary

    // Constructor
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Method to set name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get name
    public String getName() {
        return name;
    }

    // Method to set position
    public void setPosition(String position) {
        this.position = position;
    }

    // Method to get position
    public String getPosition() {
        return position;
    }

    // Method to set salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be greater than 0");
        }
    }

    // Method to get salary
    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        // This is the main method for the Employee class

        // Create an instance of the Employee class
        Employee employee = new Employee("", "", 25000.0);

        // Call the setName method with "Malaika" as the argument
        employee.setName("Malaika");

        // Print the employee's name
        System.out.println("Employee's name: " + employee.getName());

        // Call the setPosition method with "Android Intern" as the argument
        employee.setPosition("Android Intern");

        // Print the employee's position
        System.out.println("Employee's position: " + employee.getPosition());

        // Call the setSalary method with 25000.0 as the argument
        employee.setSalary(25000.0);

        // Print the employee's salary
        System.out.println("Employee's salary: " + employee.getSalary());
    }
}

