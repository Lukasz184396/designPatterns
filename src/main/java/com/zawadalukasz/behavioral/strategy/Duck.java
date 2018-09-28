package com.zawadalukasz.behavioral.strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    DiveBehavior diveBehavior;

    public Duck() {

    }

    public abstract void display();


    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void performFQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;

    }

    public void swim() {
        System.out.println("All ducks float, even  decoys");
    }

    //added mew strategy without changing current strategies
    public void performDive() {
        diveBehavior.dive();
    }
    public void setDiveBehavior(DiveBehavior db) {
        diveBehavior = db;
    }
}
