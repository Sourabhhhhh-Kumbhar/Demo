package org.example;

class Parent
{
    final void showMessage()
    {
        System.out.println("This is a final method"); // Displays a message from the final method
    }
}

class Child extends Parent
{
    void display()
    {
        final int age = 20; // Declares a variable that cannot be reassigned
        System.out.println("Age: " + age); // Prints the age
        // age = 25; // Compilation error because age is final
    }

    // showMessage() cannot be overridden because it is final in Parent
}

public class DemoFinal
{
    static void demonstrateFinal()
    {
        Child child = new Child(); // Creates a Child object
        child.showMessage(); // Calls the inherited final method
        child.display(); // Displays the final variable
    }

    public static void main(String[] args)
    {
        demonstrateFinal(); // Runs the demonstration
    }
}
