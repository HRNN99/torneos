package com.company;

import java.util.*;

public class Tournament {
    private int noPlayers;
    private List<Integer> playersOrder;
    private List<String> players;
    private boolean firstPrintFlag = true;

    public Tournament() {
        this.playersOrder = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    private List<Integer> getPlayersOrder() {
        playersOrder = getRandomList(noPlayers);
        return playersOrder;
    }

    private void organizePlayers(){
        playersOrder = getPlayersOrder();
        List<String> aux = new ArrayList<>();
        for (int i = 0; i < players.size(); i++){
            aux.add(players.get(playersOrder.get(i)));
        }
        players.clear();
        players.addAll(aux);
    }

    private List<Integer> getRandomList(int players) {
        Random randNum = new Random();
        Set<Integer> set = new LinkedHashSet<>();
        while (set.size() < players) {
            set.add(randNum.nextInt(players));
        }
        return set.stream().toList();
    }

    public boolean deletePlayer(String name){
        if (players.contains(name)){
            players = players.stream().filter(player -> !player.equals(name)).toList();
            noPlayers = players.size();
            return true;
        }
        return false;
    }

    //DEV METHODS
    public void addPlayer(String name){
        players.add(name);
        noPlayers = players.size();
    }

    public void printPlayers(){
        int x = 0;
        if (firstPrintFlag) organizePlayers();
        if (noPlayers != 1) {
            for (int i = 0; i < noPlayers / 2; i++) {
                for (int z = 0; z < 2; z++) {
                    String player = players.get(x);
                    if (!player.isBlank()) {
                        System.out.printf(player + "\n");
                    }
                    x++;
                }
                System.out.println();
            }
            firstPrintFlag = false;
        } else {
                System.out.println("Winner of tournament is: " + players.get(0));
        }
    }
}
