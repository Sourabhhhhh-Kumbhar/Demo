package org.example;

//Parent Class
class Animalll
{
    void sound()
    {
        System.out.println("Animals make different sounds");
    }
}

//Child Class
class Doggg extends Animalll
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
        Animalll animal = new Doggg();

        //Calls Dog's Overridden Method At Runtime
        animal.sound();
    }
}

