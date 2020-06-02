package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deck
{
    List<Card> deck = new ArrayList<Card>();

    void addCard()
    {
        String s1;
        String s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Side 1:");
        s1 = sc.nextLine().toString();
        System.out.println("Side 2");
        s2 = sc.nextLine().toString();
        deck.add(new Card(s1, s2));
    }
}
