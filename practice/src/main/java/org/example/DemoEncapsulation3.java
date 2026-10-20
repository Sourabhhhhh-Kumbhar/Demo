package org.example;


// Class that protects student data using private variables
class StudentRecord
{

    // Private variables cannot be accessed directly outside this class
    private String name;
    private int marks;

    // Constructor to initialize student details
    StudentRecord(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    // Getter method to access the student's name
    public String getName()
    {
        return name;
    }

    // Getter method to access the student's marks
    public int getMarks()
    {
        return marks;
    }

    // Setter method to update marks with validation
    public void setMarks(int marks)
    {
        if (marks >= 0 && marks <= 100)
        {
            this.marks = marks;
            System.out.println("Marks updated successfully!");
        } else {
            System.out.println("Invalid marks!");
        }
    }

    // Method to display student details
    public void display()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}

// Main class
public class DemoEncapsulation3
{

    public static void main(String[] args)
    {

        // Creating a student object
        StudentRecord student = new StudentRecord("Rahul", 85);

        // Displaying the original student details
        student.display();

        // Updating marks using the setter method
        student.setMarks(95);

        // Displaying the updated details
        student.display();
    }
}