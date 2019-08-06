package com.zipcodewilmington.assessment3.part5.stringstack;

import com.zipcodewilmington.assessment3.part5.MyStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 11/12/2018.
 */
public class StringStackIsEmptyTest {
    private MyStack<String> stack;

    @Before
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test
    public void test1() {
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void test2() {
        stack.push("0");
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void test3() {
        stack.push("1");
        Assert.assertFalse(stack.isEmpty());
    }
}