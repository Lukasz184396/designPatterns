package com.zawadalukasz.behavioral.strategy.concretestrategy;

import com.zawadalukasz.behavioral.strategy.abstractstrategy.DiveBehavior;

public class DeepDive implements DiveBehavior {
    @Override
    public void dive() {
        System.out.println("Deep diving");
    }
}
