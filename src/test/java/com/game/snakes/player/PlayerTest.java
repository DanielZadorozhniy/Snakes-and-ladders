package com.game.snakes.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void initialPositionIsZero() {
        Player player = new Player();
        assertEquals(0, player.getPosition());
    }

    @Test
    public void addToPositionIncreasesPreviousValue() {
        Player player = new Player();
        player.addToPosition(5);
        player.addToPosition(5);
        assertEquals(10, player.getPosition());
    }
}
