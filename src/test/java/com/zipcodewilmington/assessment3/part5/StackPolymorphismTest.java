package com.zipcodewilmington.assessment3.part5;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

/**
 * @author leon on 11/12/2018.
 */
public class StackPolymorphismTest {
    @Test
    public void ensureStackIsIterable() {
        Assert.assertTrue(new MyStack<>() instanceof Iterable);
    }

    @Test
    public void ensureStackIsNotCollection() {
        Assert.assertFalse(new MyStack<>() instanceof Collection);
    }
}