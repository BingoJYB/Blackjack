package com.company;

import java.util.Scanner;

public class Player extends Person {
    private static final Scanner in = new Scanner(System.in);

    public Player(String name) {
        super(name);
    }

    public String hitOrStand() {
        System.out.println("Would you like to 1) Hit or 2) Stand");
        return in.next();
    }
}
