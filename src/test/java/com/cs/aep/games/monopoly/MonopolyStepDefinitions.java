package com.cs.aep.games.monopoly;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created on 8:26 pm, 27/Aug./2019.
 */
public class MonopolyStepDefinitions {
    private TestableMonopolyGame monopolyGame = new TestableMonopolyGame(); // by default creates a game with 2 AI players
    private int newLocation;

    @Given("the game is ready to play with (\\d+) AI")
    public void theGameIsReadyToPlayWithAI(int numberOfAIPlayers) {
        monopolyGame.setNumberOfAIPlayers(numberOfAIPlayers);
    }

    @Given("player (\\d+) is at (\\d+)")
    public void playerIsAtSTARTING_LOCATION(int playerNumber, int startingLocation) {
        Square location = monopolyGame.getSquareAt(startingLocation);
        monopolyGame.getPlayer(playerNumber).setLocation(location);
    }

    @When("player {int} rolls a {int}")
    public void playerRollsADICE_ROLL(int playerNumber, int diceRoll) {
        Player player = monopolyGame.getPlayer(playerNumber);
        player.dice = new FakeDice(diceRoll);
    }

    @Then("player {int}'s new position is {int}")
    public void playerSNewPositionIsNEW_LOCATION(int playerNumber, int expectedLocation) {
        Player player = monopolyGame.getPlayer(playerNumber);
        assertThat(expectedLocation).isEqualTo(this.newLocation);
    }

    @When("player {int} takes their turn")
    public void playerTakesTheirTurn(int playerNumber) {
        Player player = monopolyGame.getPlayer(playerNumber);
        this.newLocation = player.takeTurn();
    }

}
