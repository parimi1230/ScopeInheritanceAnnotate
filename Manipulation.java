package com.sample.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Manipulation {

    public int add(int a, int b){
        return a + b;
    }

}
