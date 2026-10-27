package org.example;

enum TrafficLight
{
    RED, YELLOW, GREEN      //Defines the available traffic light states
}

public class DemoEnum
{
    public static void main(String[] args)
    {
        TrafficLight light = TrafficLight.RED;      //Stores The Current Light State

        switch(light)       //Checks which light state is active
        {
            case RED:
                System.out.println("Stop");     //Tells vehicles to stop
                break;      //Exits the switch

            case YELLOW:
                System.out.println("Get Ready");        //Tells Vehicles to get Ready
                break;

            case GREEN:
                System.out.println("Goooo!!");      //Tells vehicles to GOooo
                break;
        }

        System.out.println(light);      //Prints the current enum constant
    }
}