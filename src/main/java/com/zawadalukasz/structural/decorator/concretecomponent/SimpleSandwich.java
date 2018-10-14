package com.zawadalukasz.structural.decorator.concretecomponent;

import com.zawadalukasz.structural.decorator.component.Sandwich;

public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "Bread";
    }
}
