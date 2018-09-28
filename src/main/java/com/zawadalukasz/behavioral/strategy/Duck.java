package com.zawadalukasz.behavioral.strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();



    public void performFly() {
        flyBehavior.fly();
    }
    public void performFQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;

    }

    public void swim() {
        System.out.println("All ducks float, even  decoys");
    }
}
