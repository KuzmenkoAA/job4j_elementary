package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas3Then2() {
        int[] data = {5, 4, 3, 2};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then1() {
            int[] data = new int[]{5, 2, 6, 2, 8};
            int el = 2;
            int start = 1;
            int finish = 4;
            int result = FindLoop.indexInRange(data, el, start, finish);
            int expected = 1;
            Assert.assertEquals(expected, result);
    }

}