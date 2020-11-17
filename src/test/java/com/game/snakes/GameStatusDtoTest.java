package com.game.snakes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameStatusDtoTest {

    @Test
    public void dtoTest() {
        GameStatusDto gameStatusDto = new GameStatusDto(10, 6, "MOVED");

        assertEquals(10, gameStatusDto.getCurrentPosition());
        assertEquals(6, gameStatusDto.getDiceResult());
        assertEquals("MOVED", gameStatusDto.getStatus());
    }
}
