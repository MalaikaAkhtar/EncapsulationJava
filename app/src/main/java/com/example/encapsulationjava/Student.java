package com.example.encapsulationjava;

public class Student {
    // Private fields to store student details
    private String name;  // This is the name property of type String
    private String grade; // This is the grade property of type String

    // Constructor to initialize the Student object
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    // Method to set the name of the student
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the name of the student
    public String getName() {
        return name;
    }

    // Method to set the grade of the student
    public void setGrade(String grade) {
        // Check if the grade is one of the valid grades
        if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) {
            this.grade = grade;
        } else {
            // Print an error message if the grade is not valid
            System.out.println("Invalid grade. Please enter valid grades. Valid grades are A, B, C, D, and F.");
        }
    }

    // Method to get the grade of the student
    public String getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        // This is the main method for the Student class

        // Create an instance of the Student class
        Student student = new Student("", "");

        // Call the setName method with "Bisma" as the argument
        student.setName("Bisma");

        // Print the student's name
        System.out.println("Student's name: " + student.getName());

        // Call the setGrade method with "A" as the argument
        student.setGrade("A");

        // Print the student's grade
        System.out.println("Student's grade: " + student.getGrade());

        // Call the setGrade method with "E" as the argument, which is invalid
        student.setGrade("E");

        // Print the student's grade (will not change from the previous valid grade)
        System.out.println("Student's grade: " + student.getGrade());
    }

}

