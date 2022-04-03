package com.company;

public enum Rank {
    ONE("One", 1),
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 10),
    QUEEN("Queen", 10),
    KING("King", 10),
    ACE("Ace", 11),
    ACE_ALT("Ace", 1);

    public final String name;
    public final int val;

    Rank(String name, int val) {
        this.name = name;
        this.val = val;
    }

    public String toString() {
        return name;
    }
}
