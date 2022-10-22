package com.main.third;

public class BaseClass {
    private final String name;
    private final int age;

    public BaseClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class FirstChild extends BaseClass {
    public FirstChild(String name, int age) {
        super(name, age);
    }
}

class ThirdChild extends BaseClass {

    public ThirdChild(String name, int age) {
        super(name, age);
    }
}

