package com.skelly.learn_spring.examples.a1;

import com.skelly.learn_spring.game.GameRunner;
import com.skelly.learn_spring.game.interfaces.IGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.skelly.learn_spring.examples.a1")
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
