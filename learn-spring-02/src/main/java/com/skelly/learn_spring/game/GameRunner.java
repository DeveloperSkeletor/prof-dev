package com.skelly.learn_spring.game;

import com.skelly.learn_spring.game.interfaces.IGame;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    IGame game;
    public GameRunner(@Qualifier("ContraGameQualifier") IGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("running game: " + game);
        game.up();
        game.left();
        game.right();
        game.down();
    }
}
