package org.example;

class Parent
{
    //Final method cannot be overridden
    final void showMessage()
    {
        System.out.println("This is a final method");
    }
}

class Child extends Parent
{
    void display()
    {
        //Final variable cannot be changed
        final int age = 20;

        System.out.println("Age: " + age);

        //age = 25; X Error;
    }

    //Cannot Override showMessage()
}

public class DemoFinal
{
    static void demonstrateFinal()
    {
        Child child = new Child();

        child.showMessage();
        child.display();
    }

    public static void main(String[] args)
    {
        demonstrateFinal();
    }
}