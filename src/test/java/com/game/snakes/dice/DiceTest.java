package com.game.snakes.dice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {

    @Test
    public void diceReturnsValidValues() {
        Dice dice = new Dice();

        List<Integer> diceResults = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            diceResults.add(dice.roll());
        }

        assertTrue(diceResults.stream().allMatch(n -> n >= 1 && n <= 6));
    }
}
