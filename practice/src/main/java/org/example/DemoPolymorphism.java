package org.example;

class Animalllll
{
    void sound()
    {
        System.out.println("Animal make a Sound");      //Defines the default sound
    }
}

class Doggggg extends Animalllll
{
    @Override
    void sound()
    {
        System.out.println("Dog Barks!!");      //Overrides The Parent Method
    }
}

class Cattttt extends Animalllll
{
    @Override
    void sound()
    {
        System.out.println("Cat Meowwws!!!");    //Provides a different implementation
    }
}

public class DemoPolymorphism
{
    public static void main(String[] args)
    {
        Animalllll a1 = new Doggggg();      //Stores a Dog object in an Animal reference
        Animalllll a2 = new Cattttt();      //Stores a Cat object in an Animal reference

        a1.sound();     //Calls the dog implementation
        a2.sound();     //Calls the cat implementation
    }
}

