package com.zawadalukasz.behavioral.strategy.concretestrategy;

import com.zawadalukasz.behavioral.strategy.abstractstrategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
