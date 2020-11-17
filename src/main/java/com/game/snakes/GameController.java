package com.game.snakes;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GameController {
    private final GameService gameService;

    @PostMapping("/snakes-and-ladders/steps")
    public GameStatusDto rollADie(){
        return gameService.play();
    }
}
