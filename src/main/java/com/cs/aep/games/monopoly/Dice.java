package com.cs.aep.games.monopoly;

import org.apache.commons.lang3.RandomUtils;

/**
 * Created on 2:11 pm, 29/Aug./2019.
 */
public class Dice {
    private int faceValue;

    public void roll() {
        this.faceValue = RandomUtils.nextInt(1,7);
    }

    public int getFaceValue() {
        return faceValue;
    }
}
