package com.zawadalukasz.creational.singleton;

import org.junit.Test;


import static org.junit.Assert.*;

public class DbSingletonTest {

    @Test
    public void shouldCreateOnlyOneInstanceOfSingletion() {
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton anotherInstance = DbSingleton.getInstance();
        assertTrue(instance==anotherInstance);
    }
}