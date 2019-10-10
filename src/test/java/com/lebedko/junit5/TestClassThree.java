package com.lebedko.junit5;

import org.junit.jupiter.api.RepeatedTest;

public class TestClassThree {

    @RepeatedTest(5)
    public void methodOne() {
        System.out.println(Thread.currentThread() + " TestClassThree.methodOne");
    }

    @RepeatedTest(5)
    public void methodTwo() {
        System.out.println(Thread.currentThread() + " TestClassThree.methodTwo");
    }

    @RepeatedTest(5)
    public void methodThree() {
        System.out.println(Thread.currentThread() + " TestClassThree.methodThree");
    }
}
