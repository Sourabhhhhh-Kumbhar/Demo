package org.example;

class Student
{
    String name;
    int age;

    //Default Constructor
    Student()
    {
        name = "Unknown";
        age = 0;
    }

    //Parameterized Constructor
    Student (String studentName, int studentAge)
    {
        name = studentName;
        age = studentAge;
    }

    void display()
    {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}

public class DemoConstructorOverloading
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Sourabh", 24);

        Student s2 = new Student("Anikaaa", 21);

        System.out.println("S1's name is: " + s1.name);
        s1.display();

        System.out.println("S2's name is: " + s2.name);
        s2.display();
    }
}