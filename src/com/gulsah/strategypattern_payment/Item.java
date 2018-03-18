package com.gulsah.strategypattern_payment;

/**
 * Created by GulsahCoskun on 11.03.2018.
 */
public class Item {

    private String upcCode;
    private int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }


}
