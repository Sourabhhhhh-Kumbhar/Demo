package org.example;

class Outer
{
    private String message = "Hello from Outer Class";      //Stores private outer class data

    class Inner
    {
        void display()
        {
            System.out.println(message);        //Accesses the private member of the outer class

            System.out.println("Hello from Inner Class");       //Displays an inner class message
        }
    }
}

public class DemoInnerClass
{
    public static void main(String[] args)
    {
        Outer obj = new Outer();        //Creates an outer class object

        Outer.Inner inner = obj.new Inner();        //Creates an inner class object using the outer object

        inner.display();        //Calls the inner class method
    }
}