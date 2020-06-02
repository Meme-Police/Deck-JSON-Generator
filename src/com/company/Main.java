package com.company;

import com.google.gson.Gson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        boolean done = false;
        Gson gson = new Gson();
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        while (!done)
        {
            String input = "";
            deck.addCard();
            System.out.println("Done? (y/n)");
            input = sc.nextLine().toString();

            System.out.println(input);

            if (input.equals("y"))
            {
                System.out.println("called");
                done = true;
            }
        }

        String string = gson.toJson(deck);
        System.out.println(string);

    }
}
