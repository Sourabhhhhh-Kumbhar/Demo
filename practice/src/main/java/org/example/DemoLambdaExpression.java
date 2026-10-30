package org.example;

@FunctionalInterface
interface Greeting
{
    void sayHello();        //Declares the single abstract method
}

public class DemoLambdaExpression
{
    public static void main(String[] args)
    {
        Greeting greet = () -> System.out.println("Hello World!!");     //Implements the interface using a lambda

        greet.sayHello();       //Executes the lambda expression
    }
}
