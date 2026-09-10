package org.example;

public class DemoStringBuilder
{
    static void buildMessage()
    {
        //StringBuilder lets us modify the same String object
        //instead of creating many new String objects

        StringBuilder message = new StringBuilder();

        message.append("Hello");
        message.append("Bro");
        message.append("!");

        //Convert StringBuilder to normal String
        String result = message.toString();

        System.out.println(result);
    }

    public static void main(String[] args)
    {
        buildMessage();
    }
}

//append()    → add text
//insert()    → add text at a position
//delete()    → remove text
//reverse()   → reverse the string
//toString()  → convert to String


