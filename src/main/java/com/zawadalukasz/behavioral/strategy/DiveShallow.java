package com.zawadalukasz.behavioral.strategy;

public class DiveShallow implements DiveBehavior{
    @Override
    public void dive() {
        System.out.println("Shallow diving");
    }
}
