package com.gulsah.strategypattern_payment;

/**
 * Created by GulsahCoskun on 11.03.2018.
 */
public class PaypalStrategy implements PaymentStrategy {


    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int price) {
        System.out.println(price + " TL paid with Paypal");
    }


}
