package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to BlackJack.");
        Deck deck = new Deck();
        Dealer dealer = new Dealer("Dealer");
        Player player = new Player("Player");
        new Game(dealer, player, deck);
    }
}
