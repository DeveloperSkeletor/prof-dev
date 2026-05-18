package com.skelly.learn_spring.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.skelly.learn_spring.examples.c1")
public class RealWorldSimpleSpringContextLauncherApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(RealWorldSimpleSpringContextLauncherApplication.class);
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());

    }
}
