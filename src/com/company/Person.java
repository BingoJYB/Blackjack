package com.company;


public class Person {
    private final String name;
    private final Hand hand = new Hand();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void clearHand() {
        hand.clear();
    }

    public void showHand() {
        StringBuilder cardStr = new StringBuilder();

        for (Card card : hand.getCards()) {
            cardStr.append(card).append(" - ");
        }

        cardStr.append("Your Value: ").append(getHand().getTotalVal());
        System.out.println(getName() + "'s hand looks like this:");
        System.out.println(cardStr);
    }
}
