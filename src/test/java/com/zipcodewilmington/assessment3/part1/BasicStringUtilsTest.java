package com.zipcodewilmington.assessment3.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtilsTest {
    @Test
    public void camelCaseTest() {
        // Given
        String input = "the quick brown fox";
        String expected = "TheQuickBrownFox";

        // When
        String actual = BasicStringUtils.camelCase(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        // Given
        String input = "the quick brown fox";
        String expected = "xof nworb kciuq eht";

        // When
        String actual = BasicStringUtils.reverse(input);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void reverseThenCamelCaseTest() {
        // Given
        String input = "the quick brown fox";
        String expected = "XofNworbKciuqEht";

        // When
        String actual = BasicStringUtils.reverseThenCamelCase(input);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeFirstAndLastCharacterTest() {
        // Given
        String input = "The quick brown";
        String expected = "he quick brow";

        // When
        String actual = BasicStringUtils.removeFirstAndLastCharacter(input);

        // Then
        Assert.assertEquals(expected, actual);
    }
}