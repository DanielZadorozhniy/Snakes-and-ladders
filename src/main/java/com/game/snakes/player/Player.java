package com.game.snakes.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private int position;

    public void addToPosition(int n) {
        position += n;
    }
}
