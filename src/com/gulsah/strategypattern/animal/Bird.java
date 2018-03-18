package com.gulsah.strategypattern.animal;

import  com.gulsah.strategypattern.animal.flying.FlyFast;

/**
 * Created by GulsahCoskun on 20.02.2018.
 */
public class Bird extends Animal {

    public Bird(){
        super();
        flyingType = new FlyFast();
    }

    @Override
    void sound() {
        System.out.println("Cik cik");
    }

    @Override
    void eat() {
        System.out.println("It eats bird feed");
    }

}
