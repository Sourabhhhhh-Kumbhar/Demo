package org.example;

public class DemoWrapperClass
{
    public static void main(String[] args)
    {
        int number = 100;       //Stores a primitive integer

        Integer obj = number;       //Autoboxes the primitive into an Integer object

        int result = obj;       //Unboxes the Integer object into a primitive

        System.out.println("Primitive: " + number);     //Prints the primitive value
        System.out.println("Wrapper: " + obj);          //Prints the wrapper value
        System.out.println("Result: " + result);        //Prints the unboxed value

        Integer parsed = Integer.parseInt("250");       //Converts a numeric string into an int
        System.out.println("Parsed: " + parsed);          //Prints the parsed value
    }
}
