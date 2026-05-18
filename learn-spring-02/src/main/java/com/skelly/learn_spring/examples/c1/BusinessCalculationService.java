package com.skelly.learn_spring.examples.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private IDataService dataService;

    @Autowired
    public BusinessCalculationService(IDataService dataService){
        super();
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retreiveData()).max().orElse(0);
    }
}
