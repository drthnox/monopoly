package com.cs.aep.games.monopoly;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created on 9:55 am, 29/Aug./2019.
 */
public class MonopolyGame {
    Set<Player> players = new TreeSet<>();
    protected Dice dice;

    public MonopolyGame() {
        this.dice = new Dice();
    }

    protected void addPlayer(Player player) {
        this.players.add(player);
    }

    // assumes players are referenced starting at 1
    public Player getPlayer(int playerNumber) {
        Player[] playerArray = this.players.toArray(new Player[this.players.size()]);
        return playerArray[playerNumber-1];
    }

    public Square getSquareAt(int location) {
        return null;
    }
}
