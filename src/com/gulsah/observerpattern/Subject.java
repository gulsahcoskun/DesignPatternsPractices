package com.gulsah.observerpattern;

import com.gulsah.observerpattern.model.Post;

/**
 * Created by GulsahCoskun on 18.03.2018.
 */
public interface Subject {

    public void register(Observer obs);

    public void unregister(Observer obs);

    public void notifyObservers();

    public String getUpdate(Observer obs);

    public void setUpdate(Post post);


}
