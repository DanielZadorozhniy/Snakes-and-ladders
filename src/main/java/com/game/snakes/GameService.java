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
        int diceResult = dice.roll();
        if (player.getPosition() + diceResult == FINAL_STEP) {
            player.setPosition(0);
            return new GameStatusDto(player.getPosition(), diceResult,"WON");
        }

        if (player.getPosition() + diceResult > FINAL_STEP) {
            return new GameStatusDto(player.getPosition(), diceResult,"SKIPPED");
        }

        return null;
    }
}
