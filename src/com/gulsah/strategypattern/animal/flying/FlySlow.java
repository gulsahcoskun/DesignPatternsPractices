package com.gulsah.strategypattern.animal.flying;

/**
 * Created by GulsahCoskun on 20.02.2018.
 */
public class FlySlow implements Fly {

    @Override
    public String tryToFly() {
        return "It flies slowly";
    }

}
