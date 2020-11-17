package com.game.snakes.dice;

public class Dice {
    public int roll(){
        return ((int) (Math.random()*(6 - 1))) + 1;
    }
}
