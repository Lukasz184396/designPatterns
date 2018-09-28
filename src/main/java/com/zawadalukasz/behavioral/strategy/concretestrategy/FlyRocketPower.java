package com.zawadalukasz.behavioral.strategy.concretestrategy;

import com.zawadalukasz.behavioral.strategy.abstractstrategy.FlyBehavior;

public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying like a rocket");
    }
}
