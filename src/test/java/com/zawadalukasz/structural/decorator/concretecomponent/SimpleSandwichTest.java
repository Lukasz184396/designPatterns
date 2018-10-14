package com.zawadalukasz.structural.decorator.concretecomponent;

import com.zawadalukasz.structural.decorator.component.Sandwich;
import com.zawadalukasz.structural.decorator.concretedecorator.MeatDecorator;
import com.zawadalukasz.structural.decorator.concretedecorator.SauceDecorator;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSandwichTest {
    @Test
    public void shouldReturnSandwichWithChickenAndGarlicSauce() {
        Sandwich sandwich = new SauceDecorator(new MeatDecorator(new SimpleSandwich()));
        assertEquals("Bread + chicken + garlic sauce", sandwich.make());
    }
}
