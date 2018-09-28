package com.zawadalukasz.behavioral.strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence, no quack");
    }
}
