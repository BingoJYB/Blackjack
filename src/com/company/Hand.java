package com.company;

import java.util.ArrayList;

public class Hand {
    private final ArrayList<Card> cards = new ArrayList<Card>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card getCard(int id) {
        return cards.get(id);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getTotalVal() {
        int totalVal = 0;

        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getRankName().equals("Ace") && (totalVal > 10)) {
                cards.set(i, new Card(cards.get(i).getSuit(), Rank.ACE_ALT));
                totalVal++;
            } else {
                totalVal += cards.get(i).getValue();
            }
        }

        return totalVal;
    }

    public boolean isBlackJack() {
        return getTotalVal() == 21;
    }

    public boolean isExploid() {
        return getTotalVal() > 21;
    }

    public boolean isBetween17And21() {
        return getTotalVal() >= 17 && getTotalVal() <= 21;
    }

    public void clear() {
        cards.clear();
    }
}
