package com.zawadalukasz.behavioral.strategy;

import com.zawadalukasz.behavioral.strategy.concretestrategy.DiveShallow;
import com.zawadalukasz.behavioral.strategy.concretestrategy.FlyWithWings;
import com.zawadalukasz.behavioral.strategy.concretestrategy.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        diveBehavior = new DiveShallow();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
