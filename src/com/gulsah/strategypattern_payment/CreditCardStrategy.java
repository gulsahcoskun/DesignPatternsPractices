package com.gulsah.strategypattern_payment;

/**
 * Created by GulsahCoskun on 11.03.2018.
 */
public class CreditCardStrategy implements PaymentStrategy {


    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int price) {
        System.out.println(price+ " TL paid with CreditCard");
    }


}
