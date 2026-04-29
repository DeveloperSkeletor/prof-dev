package com.skelly.learn_spring.game;

import com.skelly.learn_spring.game.interfaces.IGame;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements IGame {
    @Override
    public void up() {
        System.out.println("waka up");
    }

    @Override
    public void down() {
        System.out.println("waka down");
    }

    @Override
    public void left() {
        System.out.println("waka left");
    }

    @Override
    public void right() {
        System.out.println("waka right");
    }
}
