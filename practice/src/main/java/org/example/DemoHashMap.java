package org.example;

import java.util.HashMap;

public class DemoHashMap
{
    static void showStudent()
    {
        //HashMap stores data as Key -> Value
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Daniel");

        //Get value using key
        System.out.println(students.get(101));

        //Check if key exist
        System.out.println(students.get(102));

    }

    public static void main(String[] args)
    {
        showStudent();
    }
}
