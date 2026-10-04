package org.example;

class Animall
{
    String name = "CAT";

    void eat()
    {
        System.out.println("Animal is Eating");
    }
}

class Cat extends Animall
{
    void meow()
    {
        System.out.println("Cat is Meowing");
    }
}

public class DemoInheritance
{
    public static void main(String[] args)
    {
        Cat c = new Cat();

        System.out.println("Name: " + c.name);

        c.eat();
        c.meow();
    }
}