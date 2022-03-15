package com.cs.aep.games.monopoly;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created on 2:14 pm, 29/Aug./2019.
 */
public class DiceTest {

    @Test
    public void roll() {
        Dice dice = new Dice();

        dice.roll();

        int faceValue = dice.getFaceValue();
        assertThat(faceValue).isLessThanOrEqualTo(6);
        assertThat(faceValue).isGreaterThanOrEqualTo(1);
    }
}
