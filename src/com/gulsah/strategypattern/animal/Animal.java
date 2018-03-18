package com.gulsah.strategypattern.animal;

import  com.gulsah.strategypattern.animal.flying.Fly;

/**
 * Created by GulsahCoskun on 20.02.2018.
 */
public abstract class Animal {

    private String name;
    private int age;
    public Fly flyingType;

    abstract void sound();
    abstract void eat();

    void breathe(){
        System.out.println("It breathes");
    }

    void sleep(){
        System.out.println("It sleeps");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String tryFly() {
        return flyingType.tryToFly();
    }

    public void setFly(Fly newFlyingType) {
        this.flyingType = newFlyingType;
    }


}
