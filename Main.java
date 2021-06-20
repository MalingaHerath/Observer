package com.company.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //publisher -> Subject
        //subscriber -> Observer
        //types of observers -> NewsReader, FoodWrapper

        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type1Observer();
        Observer observer3 = new Type2Observer();

        Subject subject = new Subject();
        subject.subscribe(observer1);//reading
        subject.subscribe(observer2);//reading
        subject.subscribe(observer3);//wrapping

        subject.notifyObservers("Curfew will be imposed today!");

        Thread.sleep(10000);//wait 10s
        System.out.println("===============================");

        subject.notifyObservers("Reversed: Curfew will not be imposed today!");

        Thread.sleep(5000);

        subject.unsubscribe(observer2);

        Thread.sleep(5000);
        System.out.println("===============================");

        subject.notifyObservers("Fuel price gone up");

    }

}
