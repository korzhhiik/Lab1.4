package com.main.second;

public class B {

    protected void doSomething() {
        System.out.println("B is there");
    }

    protected void doReturn() {
        System.out.println("B is returning");
    }
}

class C extends B {
    @Override
    protected void doSomething() {
        System.out.println("C");
    }

    @Override
    protected void doReturn() {
        System.out.println("C");
    }
}

class D extends B {
    @Override
    protected void doSomething() {
        System.out.println("D");
    }

    @Override
    protected void doReturn() {
        System.out.println("D");
    }
}

class E extends B {
    @Override
    protected void doSomething() {
        System.out.println("E");
    }

    @Override
    protected void doReturn() {
        System.out.println("E");
    }
}