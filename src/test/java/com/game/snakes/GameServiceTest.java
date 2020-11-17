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

    @Test
    public void skipIfNextStepIsBiggerThanFinal() {
        gameService = new GameService(new Player(99), dice);
        when(dice.roll()).thenReturn(2);
        final GameStatusDto gameStatusDto = gameService.play();
        assertEquals("SKIPPED", gameStatusDto.getStatus());
        assertEquals(99, gameStatusDto.getCurrentPosition());
    }

    @Test
    public void movePosition() {
        gameService = new GameService(new Player(10), dice);
        when(dice.roll()).thenReturn(5);
        final GameStatusDto gameStatusDto = gameService.play();
        assertEquals("MOVED", gameStatusDto.getStatus());
        assertEquals(15, gameStatusDto.getCurrentPosition());
    }

}
