package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tournament tournament = new Tournament();
        tournament.addPlayer("");
        tournament.addPlayer("Mati");
        tournament.addPlayer("Rama");
        tournament.addPlayer("Nico");
        tournament.addPlayer("Agus");
        tournament.addPlayer("Nwe");
        tournament.addPlayer("Nuñe");
        tournament.addPlayer("Brian");
        tournament.printPlayers();
    }
}
