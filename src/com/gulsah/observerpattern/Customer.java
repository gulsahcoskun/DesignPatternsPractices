package com.gulsah.observerpattern;

/**
 * Created by GulsahCoskun on 18.03.2018.
 */
public class Customer implements Observer {

    private Subject subject;
    private String name;

    public Customer(Subject subject, String customerName){
        this.subject = subject;
        name  = customerName;
        subject.register(this);
    }

    @Override
    public void update() {
        String message = subject.getUpdate(this);
        if(message == null){
            System.out.println("Hello " + name + ", you do not have any messages");
        } else {
            System.out.println("Hello " + name + ", " + message);
        }
    }

}
