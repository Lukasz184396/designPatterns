package com.zawadalukasz.behavioral.strategy.concretestrategy;

import com.zawadalukasz.behavioral.strategy.abstractstrategy.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack");
    }
}
