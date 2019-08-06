package com.zipcodewilmington.assessment3.part4;

import org.junit.Assert;
import org.junit.Test;

public class BlueJayTest {

    @Test
    public void testMove() {
        Bird blueJay = (Bird)(Object)new BlueJay();
        String expected = "fly";

        String actual = blueJay.move();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testColor() {
        Animal blueJay = (Animal)(Object)new BlueJay();
        String expected = "blue";

        String actual = blueJay.color();

        Assert.assertEquals(expected, actual);
    }
}