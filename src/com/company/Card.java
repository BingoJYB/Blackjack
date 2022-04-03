package com.company;

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getRankName() {
        return rank.name;
    }

    public int getValue() {
        return rank.val;
    }

    public String toString() {
        return ("[" + rank + " of " + suit + "] (" + this.getValue() + ")");
    }
}
