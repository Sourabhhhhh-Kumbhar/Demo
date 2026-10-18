package org.example;

//Parent Class
class Animalllll
{
    //Method that child classes will override
    void sound()
    {
        System.out.println("Some Generic Animal Sound");
    }
}

//Child Class
class Tiger extends Animalllll
{
    @Override
    void sound()
    {
        System.out.println("Rawwwwrrrrrrrrrr!!!!!!!!!!!!");
    }
}

//Another child class
class Peacock extends Animalllll
{
    @Override
    void sound()
    {
        System.out.println("Meowwwwwwwwwwwwwwwwwwww");
    }
}

public class DemoInheritancePoly
{
    public static void main(String[] args)
    {
        //Parent reference can hold any child object
        Animalllll a1 = new Tiger();
        Animalllll a2 = new Peacock();

        // Java decides at runtime which sound() to call
        a1.sound();
        a2.sound();
    }
}
