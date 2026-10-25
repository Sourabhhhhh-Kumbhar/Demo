package org.example;

abstract class Vehicle
{
    abstract void start();      //Declares a method without implementaion

    void stop()
    {
        System.out.println("Vehicle Stopped");      //Defines a common defined
    }
}

class Ferrari extends Vehicle
{
    @Override
    void start()
    {
        System.out.println("Ferrari Started");      //Implements the abstract method
    }
}

class Bike extends Vehicle
{
    @Override
    void start()
    {
        System.out.println("Bike Started");
    }
}

public class DemoAbstraction2
{
    public static void main(String[] args)
    {
        Vehicle v1 = new Ferrari();     //Creates a Ferrari through a vehicle reference
        Vehicle v2 = new Bike();        //Creates a Bike through a vehicle reference

        v1.start();     //Runs the Ferrari implementation
        v2.start();     //Runs the Bike implementation
        v1.stop();      //Calls the inherited stop method
    }
}