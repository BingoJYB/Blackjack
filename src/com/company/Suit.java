package com.company;

public enum Suit {
    SPADE("Spades"),
    HEART("Hearts"),
    CLUB("Clubs"),
    DIAMOND("Diamonds");

    public final String name;

    Suit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
