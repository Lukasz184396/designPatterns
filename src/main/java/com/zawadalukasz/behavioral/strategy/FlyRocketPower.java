package com.zawadalukasz.behavioral.strategy;

public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying like a rocket");
    }
}
