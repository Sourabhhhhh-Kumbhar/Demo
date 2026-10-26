package org.example;

import java.util.HashMap;

public class DemoHashMap2
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();       //Creates A Map of names and scores

        scores.put("Jessica", 89);      //Stores Jessica's Score
        scores.put("Nina", 90);         //Stores Nina's Score
        scores.put("Angela", 91);       //Stores Angela's Score
        scores.put("Rina", 85);         //Stores Rina's Score

        System.out.println(scores);     //Prints All Key-Value pairs

        System.out.println(scores.get("Jessica"));      //Retrives Jessica's Score

        scores.put("Jessica", 99);      //Updates Jessica's Score

        System.out.println(scores.get("Jessica"));       //Retrives Jessica's Updated Score
        System.out.println(scores.containsKey("Angela"));       //Checks whether Angela Exist

        scores.remove("Rina");      //Removes Rina's Key-Value Pair or we can Say Entry

        System.out.println(scores.size());      //Prints THe number of entries
        System.out.println(scores);         //Prints All Remaining Key-Value Pairs




    }
}
