package com.company;

public class Game {
    private static final int INIT_NUM_OF_CARDS = 2;
    private static int wins = 0;
    private static int losses = 0;
    private static int pushes = 0;
    private final Dealer dealer;
    private final Player player;
    private final Deck deck;

    public Game(Dealer dealer, Player player, Deck deck) {
        this.dealer = dealer;
        this.player = player;
        this.deck = deck;

        start();
    }

    private void init() {
        dealer.clearHand();
        player.clearHand();
        deck.shuffle();

        for (int i = 0; i < INIT_NUM_OF_CARDS; i++) {
            dealer.getHand().addCard(dealer.drawCard(deck));
            player.getHand().addCard(dealer.drawCard(deck));
        }

        player.showHand();

        if (dealer.getHand().isBlackJack() && player.getHand().isBlackJack()) {
            dealer.showHand();
            pushes++;
            System.out.println("You have pushed.");
            start();
        } else if (dealer.getHand().isBlackJack()) {
            dealer.showHand();
            losses++;
            System.out.println("You have lost.");
            start();
        } else if (player.getHand().isBlackJack()) {
            dealer.showHand();
            wins++;
            System.out.println("You have won.");
            start();
        } else {
            dealer.showFirstHand();
        }
    }

    public void start() {
        if (wins > 0 || losses > 0 || pushes > 0) {
            System.out.println("This round is over.");
            System.out.println("\nStarting Next Round... Wins: " + wins
                    + " Losses: " + losses
                    + " Pushes: " + pushes
            );
        }

        init();

        while (player.hitOrStand().equals("1")) {
            System.out.println("The dealer gives you a card from the deck.");
            player.getHand().addCard(dealer.drawCard(deck));
            player.showHand();

            if (player.getHand().isExploid()) {
                System.out.println("You have lost.");
                losses++;
                start();
            }
        }

        while (!dealer.getHand().isBetween17And21()) {
            System.out.println("Dealer draws a card.");
            dealer.getHand().addCard(dealer.drawCard(deck));
            dealer.showHand();

            if (dealer.getHand().isExploid()) {
                System.out.println("You have won.");
                wins++;
                start();
            }
        }

        player.showHand();
        dealer.showHand();

        if (dealer.getHand().getTotalVal() > player.getHand().getTotalVal()) {
            System.out.println("You have lost.");
            losses++;
        } else if (dealer.getHand().getTotalVal() < player.getHand().getTotalVal()) {
            System.out.println("You have won.");
            wins++;
        } else {
            System.out.println("You have pushed.");
            pushes++;
        }

        start();
    }
}
