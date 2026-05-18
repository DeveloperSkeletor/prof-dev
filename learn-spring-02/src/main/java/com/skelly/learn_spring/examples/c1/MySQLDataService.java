package com.skelly.learn_spring.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements IDataService{

    @Override
    public int[] retreiveData() {
        return new int[] {1, 2, 3, 4, 5};
    }
}
