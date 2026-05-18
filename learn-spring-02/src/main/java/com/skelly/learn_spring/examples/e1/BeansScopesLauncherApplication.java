package com.skelly.learn_spring.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormaClass{}


@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{}

@Configuration
@ComponentScan
public class BeansScopesLauncherApplication {

    public static void main(String[] args) {
        try(
        var context = new AnnotationConfigApplicationContext(BeansScopesLauncherApplication.class)){
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(NormaClass.class));
            System.out.println(context.getBean(NormaClass.class));
            System.out.println(context.getBean(NormaClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
