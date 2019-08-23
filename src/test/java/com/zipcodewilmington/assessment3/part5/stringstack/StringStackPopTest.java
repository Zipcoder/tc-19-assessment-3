package com.zipcodewilmington.assessment3.part5.stringstack;

import com.zipcodewilmington.assessment3.part5.MyStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import rocks.zipcode.io.quiz4.utils.TestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author leon on 11/12/2018.
 */
public class StringStackPopTest {
    private MyStack<String> stack;

    @Before
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test(expected = EmptyStackException.class)
    public void test1() {
        stack.pop();
    }

    @Test
    public void test2() {
        test("765", "321", "9", "342", "98", "132");
    }

    @Test
    public void test3() {
        test("1123", "65", "4568", "21", "3154");
    }

    private void test(String... elementsToBePushed) {
        List<String> listOfElementsTobePushed = Arrays.asList(elementsToBePushed);
        List<String> result = new ArrayList<>();
        for (String elementToBePushed : listOfElementsTobePushed) {
            stack.push(elementToBePushed);
        }

        for (String elementToBePopped : listOfElementsTobePushed) {
            result.add(stack.pop());
        }

        String[] actual = reveseList(result).toArray(String[]::new);
        String[] expected = listOfElementsTobePushed.stream().toArray(String[]::new);
        Assert.assertArrayEquals(expected, actual);
    }

    @SuppressWarnings("unchecked")
    public static <T> Stream<T> reveseList(List<T> input) {
        Object[] temp = input.toArray();

        return (Stream<T>) IntStream.range(0, temp.length)
                .mapToObj(i -> temp[temp.length - i - 1]);
    }
}