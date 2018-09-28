package com.zawadalukasz.behavioral.strategy;

import com.zawadalukasz.behavioral.strategy.concretestrategy.FlyNoWay;
import com.zawadalukasz.behavioral.strategy.concretestrategy.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Model Duck");
    }
}
