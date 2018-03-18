package com.gulsah.observerpattern.model;

/**
 * Created by GulsahCoskun on 18.03.2018.
 */
public class Letter  implements Post{

    public Letter() {
    }

    @Override
    public String message() {
        return "Your letter has arrived";
    }
}
