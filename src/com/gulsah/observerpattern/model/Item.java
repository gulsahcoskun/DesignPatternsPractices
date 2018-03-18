package com.gulsah.observerpattern.model;

/**
 * Created by GulsahCoskun on 18.03.2018.
 */
public class Item implements Post {


    public Item() {
    }

    @Override
    public String message() {
        return "Your item has arrived";
    }
}
