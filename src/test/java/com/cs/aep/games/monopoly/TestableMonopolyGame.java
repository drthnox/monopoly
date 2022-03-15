package com.cs.aep.games.monopoly;

/**
 * Created on 2:02 pm, 29/Aug./2019.
 */
public class TestableMonopolyGame extends MonopolyGame {
    public void setNumberOfAIPlayers(int numberOfAIPlayers) {
        for (int i = 0; i < numberOfAIPlayers; i++) {
            this.addPlayer(new Player("Bot-" + i, this.dice));
        }
    }
}
