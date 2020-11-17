package com.game.snakes;

import com.game.snakes.dice.Dice;
import com.game.snakes.player.Player;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class GameService {
    private final int FINAL_STEP = 100;
    private Player player = new Player();
    private Dice dice = new Dice();

    public GameService(Player player, Dice dice) {
        this.player = player;
        this.dice = dice;
    }

    public GameStatusDto play() {
        return null;
    }
}
