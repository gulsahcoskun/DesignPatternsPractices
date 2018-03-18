package com.gulsah.strategypattern.animal.flying;

/**
 * Created by GulsahCoskun on 20.02.2018.
 */
public class NoFly implements Fly {


    @Override
    public String tryToFly() {
        return "It cant fly";
    }

}
