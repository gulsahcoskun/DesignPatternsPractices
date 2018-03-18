package com.gulsah.strategypattern;

import strategypattern.animal.Bird;
import strategypattern.animal.Dog;
import strategypattern.animal.flying.FlySlow;

/**
 * Created by GulsahCoskun on 20.02.2018.
 */
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.tryFly());

        Bird bird = new Bird();
        System.out.println(bird.tryFly());

        bird.setFly(new FlySlow());
        System.out.println(bird.tryFly());

    }

}
