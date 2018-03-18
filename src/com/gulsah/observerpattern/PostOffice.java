package com.gulsah.observerpattern;

import com.gulsah.observerpattern.model.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GulsahCoskun on 18.03.2018.
 */
public class PostOffice implements Subject {


    private List<Observer> observers;
    private boolean changed;
    private String message;

    public PostOffice(){
        observers = new ArrayList<>();
        changed = false;
        message = null;
    }


    @Override
    public void register(Observer obs) {
        if(!observers.contains(obs)){
            observers.add(obs);
        }
    }

    @Override
    public void unregister(Observer obs) {
        if(observers.contains(obs)){
            observers.remove(obs);
        }
    }

    @Override
    public void notifyObservers() {
        if(changed){
            for (Observer observer : observers) {
                observer.update();
            }
        }
        this.changed = false;
    }

    @Override
    public String getUpdate(Observer obs) {
        return message;
    }

    @Override
    public void setUpdate(Post post) {
        message = post.message();
        this.changed = true;
        notifyObservers();
    }


}
