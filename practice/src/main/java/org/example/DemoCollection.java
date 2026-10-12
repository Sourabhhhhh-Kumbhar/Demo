package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCollection
{
    public  static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<String>();

        //Add Elements
        students.add("Sourabh");
        students.add("Anikaaa");
        students.add("Nishaaa");
        students.add("Aryaaa");

        //Display all Students
        System.out.println("Students: " + students);

        //Remove An Elements
        students.remove("Aryaaa");

        //Sort the List
        Collections.sort(students);

        //Display sorted list
        System.out.println("Sorted: " + students);

        //Search for a student
        if(students.contains("Aryaaa"))
        {
            System.out.println("Student found");
        }
        else
        {
            System.out.println("Student not found");
        }
    }
}
