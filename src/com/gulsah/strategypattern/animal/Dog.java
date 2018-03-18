package com.gulsah.strategypattern.animal;

import strategypattern.animal.flying.NoFly;

/**
 * Created by GulsahCoskun on 20.02.2018.
 */
public class Dog extends Animal {

    public Dog(){
        super();
        flyingType = new NoFly();
    }

    @Override
    void sound() {
        System.out.println("Hav Hav");
    }

    @Override
    void eat() {
        System.out.println("It eats meat");
    }


}
