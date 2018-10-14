package com.zawadalukasz.structural.decorator.concretedecorator;

import com.zawadalukasz.structural.decorator.component.Sandwich;
import com.zawadalukasz.structural.decorator.decorator.SandwichDecorator;

public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeet();
    }
    public String addMeet() {
        return " + chicken";
    }
}
