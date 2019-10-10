package com.lebedko.junit5;

import org.junit.Test;

public class TestClassOne {
    @Test
    public void methodOne() {
        System.out.println(Thread.currentThread() + " TestClassOne.methodOne");
    }

    @Test
    public void methodTwo() {
        System.out.println(Thread.currentThread() + " TestClassOne.methodTwo");
    }

    @Test
    public void methodThree() {
        System.out.println(Thread.currentThread() + " TestClassOne.methodThree");
    }
}
