package com.gulsah.strategypattern_payment;

/**
 * Created by GulsahCoskun on 11.03.2018.
 */
public class ShoppingCartTest {

    public static void main(String[] args) {
        Item item1 = new Item("1234", 23);
        Item item2 = new Item("75657", 45);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.pay(new CreditCardStrategy("Visa","545535353","345","23/06/2019"));




    }

}
