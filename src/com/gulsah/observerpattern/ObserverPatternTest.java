package com.gulsah.observerpattern;

import com.gulsah.observerpattern.model.Item;
import com.gulsah.observerpattern.model.Letter;
import com.gulsah.observerpattern.model.Post;

/**
 * Created by GulsahCoskun on 18.03.2018.
 */
public class ObserverPatternTest {

    public static void main(String[] args) {

        Post postItem = new Item();

        Subject postOffice = new PostOffice();
        Post postLetter = new Letter();

        Observer obsGulsah = new Customer(postOffice,"Gulsah");
        obsGulsah.update();

        postOffice.notifyObservers();

        Observer obsCompany = new Company(postOffice,"Apple");

        postOffice.setUpdate(postItem);

        Observer obsArda = new Customer(postOffice,"Arda");

        postOffice.setUpdate(postLetter);

        postOffice.unregister(obsCompany);

        postOffice.setUpdate(postItem);


    }

}
