package com.gulsah.strategypattern_payment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GulsahCoskun on 11.03.2018.
 */
public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }


    public void addItem(Item e){
        this.items.add(e);
    }

    public void removeItem(Item e){
        this.items.remove(e);
    }


    public int calculateTotal(){
        int total = 0;
        for(Item e : items){
            total += e.getPrice();
        }

        return total;
    }

    public void pay(PaymentStrategy strategy){
        strategy.pay(calculateTotal());
    }


}
