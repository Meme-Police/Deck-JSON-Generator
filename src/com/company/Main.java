package com.company;

import com.google.gson.Gson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String input = "";
        boolean done = false;
        Gson gson = new Gson();
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        System.out.println("Deck Name:");
        input = sc.nextLine().toString();
        deck.deckName = input;

        while (!done)
        {
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
