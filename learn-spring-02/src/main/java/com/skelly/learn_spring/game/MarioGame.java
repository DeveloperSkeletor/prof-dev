package com.skelly.learn_spring.game;

import com.skelly.learn_spring.game.interfaces.IGame;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements IGame {
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Crouch");
    }

    @Override
    public void left() {
        System.out.println("run left");
    }

    @Override
    public void right() {
        System.out.println("run right");
    }
}
