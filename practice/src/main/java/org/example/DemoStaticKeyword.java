package org.example;

class Studentt
{
    String name;    //Stores each student's name
    static String college = "ABC College";      //Shares college name across all students

    Studentt(String name)
    {
        this.name = name;       //Initializes the student's name
    }

    void display()
    {
        System.out.println(name + " - " + college);         //Display student details
    }
}

public class DemoStaticKeyword
{
    public static void main(String[] args)
    {
        Studentt s1 = new Studentt("Alex");       //Creates the first student
        Studentt s2 = new Studentt("Sam");        //Creates the second student

        s1.display();       //Display Alex's details
        s2.display();       //Display Sam's details

        Studentt.college = "XYZ College";        //Update the shared college name

        s1.display();       //Displays Alex's Details with updated College
        s2.display();       //Displays Sam's Details with updated College

    }
}
