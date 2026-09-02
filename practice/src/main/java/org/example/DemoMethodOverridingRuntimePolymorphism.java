package org.example;

//Parent Class
class Animal
{
    void sound()
    {
        System.out.println("Animals make different sounds");
    }
}

//Child Class
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog barks: Woof Woof!");
    }
}

//Main Class
public class DemoMethodOverridingRuntimePolymorphism
{
    public static void main(String[] args)
    {
        //Parent Reference, Child object
        Animal animal = new Dog();

        //Calls Dog's Overridden Method At Runtime
        animal.sound();
    }
}

