package com.company;

import java.util.ArrayList;

public class Dealer extends Person {
    private static int count = 0;

    public Dealer(String name) {
        super(name);
    }

    public Card drawCard(Deck deck) {
        ArrayList<Card> cards = deck.getCards();
        return cards.get(count++);
    }

    public void showFirstHand() {
        System.out.println("The dealer's hand looks like this:");
        System.out.println(getHand().getCard(0));
        System.out.println("The second card is face down.");
    }
}
