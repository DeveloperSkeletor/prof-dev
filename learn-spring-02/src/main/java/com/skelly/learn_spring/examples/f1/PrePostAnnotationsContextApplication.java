package com.skelly.learn_spring.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeDependency someDependency;
    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency = someDependency;
        System.out.println("all dependencies ready!");
    }

    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("DESTORY");
    }
}

@Component
class SomeDependency{
    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextApplication {

    public static void main(String[] args) {
        try(
        var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
