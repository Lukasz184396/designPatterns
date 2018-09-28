package com.zawadalukasz.behavioral.strategy;

import org.junit.Test;

public class DuckTest {

    @Test
    public  void modelDuckTest() {
        Duck model = new ModelDuck();
        model.performFly();                             //not flying
        model.setFlyBehavior(new FlyRocketPower());     //change the strategy of flying
        model.performFly();                             //flying like a rocket
    }

    @Test
    public  void modelDuckTest2() {
        Duck mallard = new MallardDuck();
        mallard.performFQuack();
        mallard.performFly();
    }
    @Test
    public  void shouldDeepDive() {
        Duck mallard = new MallardDuck();
        mallard.performDive();                      //shallow diving
        mallard.setDiveBehavior(new DeepDive());    // duck after training can dive deeper (change the strategy of dive
        mallard.performDive();
    }
}
