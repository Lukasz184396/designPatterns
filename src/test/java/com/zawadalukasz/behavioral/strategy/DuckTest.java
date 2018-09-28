package com.zawadalukasz.behavioral.strategy;

import org.junit.Test;

public class DuckTest {


    @Test
    public  void modelDuckTest2() {
        Duck mallard = new MallardDuck();
        mallard.performFQuack();
        mallard.performFly();
    }
}
