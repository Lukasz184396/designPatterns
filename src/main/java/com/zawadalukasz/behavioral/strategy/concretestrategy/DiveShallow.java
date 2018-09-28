package com.zawadalukasz.behavioral.strategy.concretestrategy;

import com.zawadalukasz.behavioral.strategy.abstractstrategy.DiveBehavior;

public class DiveShallow implements DiveBehavior {
    @Override
    public void dive() {
        System.out.println("Shallow diving");
    }
}
