package com.game.snakes;

import com.game.snakes.dice.Dice;
import com.game.snakes.player.Player;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GameServiceTest {
    @Mock
    Dice dice;

    GameService gameService;

    @Test
    public void winIfPositionOnFinalStep() {
        gameService = new GameService(new Player(99), dice);
        when(dice.roll()).thenReturn(1);
        final GameStatusDto gameStatusDto = gameService.play();
        assertEquals("WON", gameStatusDto.getStatus());
        assertEquals(0, gameStatusDto.getCurrentPosition());
    }


}
