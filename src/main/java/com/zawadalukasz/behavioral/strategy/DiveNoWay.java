package com.zawadalukasz.behavioral.strategy;

public class DiveNoWay implements DiveBehavior {
    @Override
    public void dive() {
        System.out.println("No diving");
    }
}
