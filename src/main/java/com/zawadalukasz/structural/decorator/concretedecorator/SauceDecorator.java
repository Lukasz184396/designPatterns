package com.zawadalukasz.structural.decorator.concretedecorator;

import com.zawadalukasz.structural.decorator.component.Sandwich;
import com.zawadalukasz.structural.decorator.decorator.SandwichDecorator;

public class SauceDecorator extends SandwichDecorator {

    public SauceDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addSauce();
    }
    public String addSauce() {
        return " + garlic sauce";
    }

}
