package com.example.encapsulationjava;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
   public void main() {
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