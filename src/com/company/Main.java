package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tournament tournament = new Tournament();
        tournament.addPlayer("Hernan");
        tournament.addPlayer("Mati");
        tournament.addPlayer("Rama");
        tournament.addPlayer("Nico");
        tournament.addPlayer("Agus");
        tournament.addPlayer("Nwe");
        tournament.addPlayer("Nuñe");
        tournament.addPlayer("Brian");
        tournament.printPlayers();
        System.out.println("------------------------------------------------");
        tournament.deletePlayer("Hernan");
        tournament.deletePlayer("Rama");
        tournament.deletePlayer("Nwe");
        tournament.deletePlayer("Brian");
        tournament.printPlayers();
        System.out.println("------------------------------------------------");
        tournament.deletePlayer("Mati");
        tournament.deletePlayer("Nico");
        tournament.printPlayers();
        System.out.println("------------------------------------------------");
        tournament.deletePlayer("Nuñe");
        tournament.printPlayers();

    }
}
