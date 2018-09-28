package com.zawadalukasz.behavioral.strategy.concretestrategy;


import com.zawadalukasz.behavioral.strategy.abstractstrategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with wings");
    }
}
