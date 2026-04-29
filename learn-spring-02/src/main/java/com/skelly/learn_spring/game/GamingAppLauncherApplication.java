package com.skelly.learn_spring.game;

import com.skelly.learn_spring.game.interfaces.IGame;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.skelly.learn_spring.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
        context.getBean(IGame.class).up();
        context.getBean(GameRunner.class).run();

    }
}
