package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer){
        observers.add(observer);
    }

    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(String news){
        for (Observer observer : observers) {
            observer.notifyObserver(news);
        }
    }

}
