package com.cs.aep.games.monopoly;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created on 3:31 pm, 29/Aug./2019.
 */
public class PlayerTest {

    @Test
    public void player_should_move_when_they_take_a_turn() {
        FakeDice dice = new FakeDice(4);
        Board board = new Board();
        Player player = new Player("Test Player", dice);
        player.setLocation(board.getSquareAt(2));

        Square newLocation = player.takeTurn();

        assertThat(newLocation.getId()).isEqualTo(board.getSquareAt(6).getId());
    }
}
