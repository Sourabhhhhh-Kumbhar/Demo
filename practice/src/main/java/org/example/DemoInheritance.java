package org.example;
// Parent class (Superclass)
class Animall
{
    // Property of the parent class
    String name = "Dog";

    // Method of the parent class
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

// Child class (Subclass) inherits Animal
class Cat extends Animall
{
    // Method of the child class
    void meow()
    {
        System.out.println("Cat is meowing");
    }
}

// Main class
public class DemoInheritance
{
    public static void main(String[] args)
    {
        // Create an object of the child class
        Cat c = new Cat();

        // Access the inherited variable from Animal
        System.out.println("Name: " + c.name);

        // Call the inherited method
        c.eat();

        // Call the child class's own method
        c.meow();
    }
}
