package org.example;

class Ko
{
    static int number;      //Declares a static variable

    static{
        number = 100;       //Initializes the static variable
        System.out.println("Static block executed");        //Prints during the initialization
    }

    Ko(){
      System.out.println("Constructor Executed");       //Prints whenever an object is created
    }

    static void display()
    {
        System.out.println("Number: " + number);        //Display the static variable
    }
}

public class DemoStaticBlock
{
    public static void main(String[] args)
    {
        System.out.println("Main method Started");      //Prints when main begins

        Ko.display();       //Calls the static method

        Ko obj = new Ko();      //Creates the first object
        Ko obj2 = new Ko();     //Creates thr second object
    }
}
