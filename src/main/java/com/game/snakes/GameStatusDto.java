package com.game.snakes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameStatusDto {
    private int currentPosition;
    private int diceResult;
    private String status;
}
