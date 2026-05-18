package com.skelly.learn_spring.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements IDataService{
    @Override
    public int[] retreiveData() {
        return new int[] {11, 22, 33, 44, 55};
    }
}
