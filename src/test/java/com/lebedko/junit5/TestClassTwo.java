package com.lebedko.junit5;

import org.junit.Test;

public class TestClassTwo {
    @Test
    public void methodOne() {
        System.out.println(Thread.currentThread() + " TestClassTwo.methodOne");
    }

    @Test
    public void methodTwo() {
        System.out.println(Thread.currentThread() + " TestClassTwo.methodTwo");
    }

    @Test
    public void methodThree() {
        System.out.println(Thread.currentThread() + " TestClassTwo.methodThree");
    }
}
