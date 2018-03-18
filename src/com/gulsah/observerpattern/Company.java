package com.gulsah.observerpattern;


/**
 * Created by GulsahCoskun on 18.03.2018.
 */
public class Company implements Observer {

    private Subject subject;
    private String name;

    public Company(Subject subject, String companyName){
        this.subject = subject;
        name  = companyName;
        subject.register(this);
    }

    @Override
    public void update() {
        String message = subject.getUpdate(this);
        if(message == null){
            System.out.println("The company of " + name + ", there is no new message");
        } else {
            System.out.println("The company of " + name + ", " + message);
        }
    }

}
