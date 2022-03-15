package com.cs.aep.games.monopoly;

/**
 * Created on 2:04 pm, 29/Aug./2019.
 */
public class Player implements Comparable<Player> {
    private final String name;
    Dice dice;
    private Square location;

    public Player(String name, Dice dice) {
        this.name = name;
        this.dice = dice;
    }

    @Override
    public int compareTo(Player o) {
        return this.name.compareTo(o.name);
    }

    public void setLocation(Square location) {
        this.location = location;
    }

    public Square takeTurn() {
        return 0;
    }
}
