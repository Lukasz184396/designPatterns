package com.zawadalukasz.behavioral.strategy;

import org.junit.Test;

public class DuckTest {

    @Test
    public  void modelDuckTest() {
        Duck model = new ModelDuck();
        model.performFly();                             //not flying
        model.setFlyBehavior(new FlyRocketPower());     //change the stategy of flying
        model.performFly();                             //flying like a rocket
    }

    @Test
    public  void modelDuckTest2() {
        Duck mallard = new MallardDuck();
        mallard.performFQuack();
        mallard.performFly();
    }
}
